
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGerrothorax extends EntityPrehistoricFloraAgeableFishBase implements ITrappableWater, ITrappableLand {
	private static final DataParameter<Integer> BOTTOM_COOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraGerrothorax.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> SWIM_COOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraGerrothorax.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean> BOTTOM_FLAG = EntityDataManager.createKey(EntityPrehistoricFloraGerrothorax.class, DataSerializers.BOOLEAN);

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	int roarCooldown;

	public EntityPrehistoricFloraGerrothorax(World world) {
		super(world);
		if (world != null) {
			this.moveHelper = new EntityPrehistoricFloraGerrothorax.SwimmingMoveHelperBase();
			this.navigator = new PathNavigateSwimmer(this, world);
		}
		setSize(0.5F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.2F;
		maxHealthAgeable = 14.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 40; //normal spawn
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.8;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Aquatic";}

	public boolean sinks() {
		return this.getSwimCooldown() <= 0;
	}

	@Override
	public void playLivingSound() {
		//if (this.isReallyInWater()) return;
		return; //Do nothing because the roar is done by a ticker instead and has no sound
		/*
		if (this.getAnimation() != null) {
			if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
				this.setAnimation(ROAR_ANIMATION);
				SoundEvent soundevent = this.getAmbientSound();

				if (soundevent != null)
				{
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}
		 */

	}

	@Override
	public int getAttackLength() {
		return 8;
	}

	@Override
	public int getRoarLength() {
		return 120;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	@Override
	protected float getAISpeedFish() {
		if (this.isAtBottom() && !this.getIsFast() && !this.isInLove() && this.getEatTarget() == null) {
			return 0;
		}
		return 0.232f;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BOTTOM_COOLDOWN, 0);
		this.dataManager.register(SWIM_COOLDOWN, 0);
		this.dataManager.register(BOTTOM_FLAG, false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setBottomCooldown(0);
		this.setSwimCooldown(0);
		this.setBottomFlag(false);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("bottomCooldown", this.getBottomCooldown());
		compound.setInteger("swimCooldown", this.getSwimCooldown());
		compound.setBoolean("bottomFlag", this.getBottomFlag());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBottomCooldown(compound.getInteger("bottomCooldown"));
		this.setSwimCooldown(compound.getInteger("swimCooldown"));
		this.setBottomFlag(compound.getBoolean("bottomFlag"));
	}

	public int getBottomCooldown() {
		return this.dataManager.get(BOTTOM_COOLDOWN);
	}

	public void setBottomCooldown(int cooldown) {
		this.dataManager.set(BOTTOM_COOLDOWN, cooldown);
	}

	public int getSwimCooldown() {
		return this.dataManager.get(SWIM_COOLDOWN);
	}

	public void setSwimCooldown(int cooldown) {
		this.dataManager.set(SWIM_COOLDOWN, cooldown);
	}

	public boolean getBottomFlag() {
		return this.dataManager.get(BOTTOM_FLAG);
	}

	public void setBottomFlag(boolean flag) {
		this.dataManager.set(BOTTOM_FLAG, flag);
	}

	@Override
	protected boolean isSlowAtBottom() {
		return true;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWanderBottomDweller(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraTrilobiteBottomBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraTrilobiteSwimBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.FISH);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:amphibamus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:amphibamus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 7 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (!this.world.isRemote) {

			if (this.getAnimation() == NO_ANIMATION && this.roarCooldown == 0 && this.isAtBottom()) {
				this.setAnimation(ROAR_ANIMATION);
				this.roarCooldown = 700 + rand.nextInt(600);
			}
			if (this.roarCooldown > 0) {this.roarCooldown -= 1;}

			if (this.isAtBottom() && (!this.getBottomFlag()) && !this.getIsFast() && this.getSwimCooldown() <= 0) {
				this.setBottomFlag(true);
				this.setBottomCooldown(1000 + rand.nextInt(1000));
			}
			if (this.isAtBottom() && (this.getBottomFlag())) {
				this.setBottomCooldown(this.getBottomCooldown() - 1);
			}
			if (this.getBottomCooldown() < 0) {
				this.setBottomCooldown(0);
			}
			if (this.getBottomCooldown() <= 0 && this.getBottomFlag()) {
				this.setBottomFlag(false);
				this.setSwimCooldown(200 + rand.nextInt(200));
			}
			if (!(this.getBottomFlag())) {
				this.setSwimCooldown(this.getSwimCooldown() - 1);
			}
			if (this.getSwimCooldown() <= 0) {
				this.setSwimCooldown(0);
			}

		}


		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public boolean isAtBottom() {
		//System.err.println("Testing position");
		if (this.getPosition().getY() - 1 >= 0) {
			BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
			return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
					&& ((this.world.getBlockState(pos)).getMaterial() != Material.WATER)
					&& this.getSwimCooldown() <= 0 && this.onGround);
		}
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			System.err.println("set attack");
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if ((!this.dropsEggs()) && (!this.laysEggs()) && (createPFChild(this) == null)) {
			if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getCanBreed() && this.getLaying() && this.getTicks() > 0
					&& (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())
					|| BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down()))
			) {
				//if (Math.random() > 0.5) {
				this.setTicks(-50); //Flag this as stationary for egg-laying
				//}
			}

			if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getTicks() > -47 && this.getTicks() < 0) {
				//Is stationary for egg-laying:
				//System.err.println("Test2");
				IBlockState eggs = BlockEggsWater.block.getDefaultState();
				if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())) {
					if (!(world.isRemote)) {
						world.setBlockState(this.getPosition(), eggs);
						world.setTileEntity(this.getPosition(), new BlockEggsWater.TileEntityCustom());
						TileEntity te = world.getTileEntity(this.getPosition());
						te.getTileData().setString("creature", getEntityId(this));
					}
					this.setLaying(false);
					this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
				}
				if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down())) {
					if (!(world.isRemote)) {
						world.setBlockState(this.getPosition().down(), eggs);
						world.setTileEntity(this.getPosition().down(), new BlockEggsWater.TileEntityCustom());
						TileEntity te = world.getTileEntity(this.getPosition().down());
						te.getTileData().setString("creature", getEntityId(this));
					}
					this.setLaying(false);
					this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
				}
				this.setTicks(0);
			}

		}
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.GERROTHORAX_LOOT_YOUNG;
		}
		return LepidodendronMod.GERROTHORAX_LOOT;
	}

	@Override
	public void travel(float strafe, float vertical, float forward) {
		float f4;
		if (this.isServerWorld()) {
			if (this.isInWater()) {
				this.moveRelative(strafe, vertical, forward, 0.1F);
				f4 = 0.8F;
				float speedModifier = (float) EnchantmentHelper.getDepthStriderModifier(this);
				if (speedModifier > 3.0F) {
					speedModifier = 3.0F;
				}

				BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);


				if (!this.onGround) {
					speedModifier *= 0.5F;
				}
				if (speedModifier > 0.0F) {
					f4 += (0.54600006F - f4) * speedModifier / 3.0F;
				}
				this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

				if (this.collidedHorizontally && this.isCollidingRim())
				{
					this.motionY = 0.05D;
				}

				if (this.sinks()) {
					blockpos$pooledmutableblockpos.setPos(this.posX, 0.0D, this.posZ);

					if (!this.world.isRemote || this.world.isBlockLoaded(blockpos$pooledmutableblockpos) && this.world.getChunk(blockpos$pooledmutableblockpos).isLoaded())
					{
						if (!this.hasNoGravity())
						{
							this.motionY -= 0.08D;
						}
					}
					else if (this.posY > 0.0D)
					{
						this.motionY = -0.1D;
					}
					else
					{
						this.motionY = 0.0D;
					}
				}

				this.motionX *= f4;
				this.motionX *= 0.9;
				this.motionY *= 0.9;
				this.motionY *= f4;
				this.motionZ *= 0.9;
				this.motionZ *= f4;
			} else {
				super.travel(strafe, vertical, forward);
			}
		}
		this.prevLimbSwingAmount = this.limbSwingAmount;
		double deltaX = this.posX - this.prevPosX;
		double deltaZ = this.posZ - this.prevPosZ;
		double deltaY = this.posY - this.prevPosY;
		float delta = MathHelper.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ) * 4.0F;
		if (delta > 1.0F) {
			delta = 1.0F;
		}
		this.limbSwingAmount += (delta - this.limbSwingAmount) * 0.4F;
		this.limbSwing += this.limbSwingAmount;
	}

	class SwimmingMoveHelperBase extends EntityMoveHelper {
		private final EntityPrehistoricFloraGerrothorax EntityBase = EntityPrehistoricFloraGerrothorax.this;

		public SwimmingMoveHelperBase() {
			super(EntityPrehistoricFloraGerrothorax.this);
		}

		@Override
		public void onUpdateMoveHelper() {
			if (this.action == Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
				double distanceX = this.posX - this.EntityBase.posX;
				double distanceY = this.posY - this.EntityBase.posY;
				double distanceZ = this.posZ - this.EntityBase.posZ;
				double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
				distance = MathHelper.sqrt(distance);
				distanceY /= distance;
				float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;

				this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 10.0F);
				float speed = getAISpeedFish();
				this.EntityBase.setAIMoveSpeed(speed);

				if (this.EntityBase.isAtBottom()) {
					this.EntityBase.setAIMoveSpeed(speed * 0.25F);
				}

				this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
			} else {
				this.EntityBase.setAIMoveSpeed(0.0F);
			}
		}
	}
}