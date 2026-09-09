
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSelkirkiaBurrow;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraTrilobiteBottomBaseAI;
import net.lepidodendron.entity.ai.EntityMateAITrilobiteBottomBase;
import net.lepidodendron.entity.ai.TrilobiteWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.entity.util.PathNavigateWaterBottom;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraSelkirkia extends EntityPrehistoricFloraTrilobiteBottomBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private int jumpTicks;
	private Animation animation = NO_ANIMATION;

	private static final DataParameter<Integer> BURYTICK = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkia.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean> BURIED = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkia.class, DataSerializers.BOOLEAN);

	private static final DataParameter<Integer> BURYCOUNT = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkia.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> SWIMCOUNT = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkia.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraSelkirkia(World world) {
		super(world);
		if (world != null) {
			this.moveHelper = new EntityPrehistoricFloraSelkirkia.WanderMoveHelper();
			this.navigator = new PathNavigateWaterBottom(this, world);
		}
		setSize(0.25F, 0.2F);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean isSmall() {
		return false;
	}

	public static String getPeriod() {return "Cambrian - Ordovician - Silurian - Devonian";}

	//public static String getHabitat() {return "Aquatic";}

	public float getMaxTurnDistancePerTick() {
		return 20;
	}

	public int getBuryLength() {
		return 240;
	}

	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BURYTICK, 0);
		this.dataManager.register(BURIED, false);
		this.dataManager.register(BURYCOUNT, 0);
		this.dataManager.register(SWIMCOUNT, 0);
	}

	public int getBuriedTick() {
		return (this.dataManager.get(BURYTICK));
	}

	public int getBuryCount() {
		return (this.dataManager.get(BURYCOUNT));
	}

	public int getSwimCount() {
		return (this.dataManager.get(SWIMCOUNT));
	}

	public boolean getBuried() {
		return (this.dataManager.get(BURIED));
	}

	public void setBuriedTick(int buryTick) {
		//Set at the bottom of the blockpos:
		if (!this.world.isRemote) {
			if (buryTick > 0) {
				this.motionY = this.motionY -= 0.08D;
			}
			this.dataManager.set(BURYTICK, buryTick);
		}
	}

	public void setBuryCount(int buryTick) {
		if (!this.world.isRemote) {
			this.dataManager.set(BURYCOUNT, buryTick);
		}
	}

	public void setSwimCount(int swimTick) {
		if (!this.world.isRemote) {
			this.dataManager.set(SWIMCOUNT, swimTick);
		}
	}

	public void setBuried(boolean buried) {
		//Set at the bottom of the blockpos:
		if (!this.world.isRemote) {
			if (buried) {
				this.motionY = this.motionY -= 0.08D;
				this.setSize(0, 0.35F);
			}
			else {
				this.setSize(0.6F, 0.35F);
			}
			this.dataManager.set(BURIED, buried);
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("isBuried", this.getBuried());
		compound.setInteger("buryTicks", this.getBuriedTick());
		compound.setInteger("buryCount", this.getBuryCount());
		compound.setInteger("swimCount", this.getSwimCount());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBuried(compound.getBoolean("isBuried"));
		this.setBuriedTick(compound.getInteger("buryTicks"));
		this.setBuryCount(compound.getInteger("buryCount"));
		this.setSwimCount(compound.getInteger("swimCount"));
	}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	protected float getAISpeedTrilobite() {
		if ((getBuriedTick() > 0) || getBuried()) {return 0.00f;}
		return 0.086f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAITrilobiteBottomBase(this, 1));
		tasks.addTask(1, new TrilobiteWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraTrilobiteBottomBaseAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.MICROBIAL);
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
	}

	public boolean isInBuryPosition() {
		return
		super.isInWater()
			&& this.world.getBlockState(this.getPosition().up()).getMaterial() == Material.WATER
			&& MatchMaterial(this.world.getBlockState(this.getPosition().down()).getMaterial())
			&& MatchBlockState(this.world.getBlockState(this.getPosition().down(2)));
	}

	public boolean MatchMaterial(Material material) {
		return (material == Material.SAND || material == Material.CLAY || material == Material.GROUND);
	}

	public boolean MatchBlockState(IBlockState state) {
		return (
			(state.getMaterial() == Material.SAND || state.getMaterial() == Material.CLAY
				|| state.getMaterial() == Material.GROUND || state.getMaterial() == Material.GROUND
				|| state.getMaterial() == Material.WOOD)
			&& state.isFullBlock()
		);
	}

	@Override
	public boolean isInWater() {
		return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	public void onEntityUpdate() {
		//AnimationHandler.INSTANCE.updateAnimations(this);
		super.onEntityUpdate();

		if (!this.world.isRemote) {
			if (getBuried()) {
				setBuryCount(getBuryCount() + rand.nextInt(3));
			}
			if (getBuryCount() > 5000) {
				setBuryCount(0);
			}

			if (!getBuried()) {
				setSwimCount(getSwimCount() + rand.nextInt(3));
			}
			if (getSwimCount() > 2000) {
				setSwimCount(0);
			}

			setBuriedTick(getBuryTick());
			//System.err.println("getBuried = " + getBuried());
			//System.err.println("getBuriedTick = " + getBuriedTick());

		}
	}

	public int getBuryTick() {
		if (!this.world.isRemote) {
			if (getBuryCount() < 0) {
				return getBuryLength() + 1 + getBuryCount();
			}
			if (getSwimCount() < 0) {
				return -getSwimCount();
			}
			return 0;
		}
		return 0;
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(3);
	}

	@Override
	public void onLivingUpdate() {

		if (this.jumpTicks > 0)
		{
			--this.jumpTicks;
		}

		if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer())
		{
			double d0 = this.posX + (this.interpTargetX - this.posX) / (double)this.newPosRotationIncrements;
			double d1 = this.posY + (this.interpTargetY - this.posY) / (double)this.newPosRotationIncrements;
			double d2 = this.posZ + (this.interpTargetZ - this.posZ) / (double)this.newPosRotationIncrements;
			double d3 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
			this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
			this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
			--this.newPosRotationIncrements;
			this.setPosition(d0, d1, d2);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		}
		else if (!this.isServerWorld())
		{
			this.motionX *= 0.98D;
			this.motionY *= 0.98D;
			this.motionZ *= 0.98D;
		}

		if (Math.abs(this.motionX) < 0.003D)
		{
			this.motionX = 0.0D;
		}

		if (Math.abs(this.motionY) < 0.003D)
		{
			this.motionY = 0.0D;
		}

		if (Math.abs(this.motionZ) < 0.003D)
		{
			this.motionZ = 0.0D;
		}

		this.world.profiler.startSection("ai");

		if (this.isMovementBlocked())
		{
			this.isJumping = false;
			this.moveStrafing = 0.0F;
			this.moveForward = 0.0F;
			this.randomYawVelocity = 0.0F;
		}
		else if (this.isServerWorld())
		{
			this.world.profiler.startSection("newAi");
			this.updateEntityActionState();
			this.world.profiler.endSection();
		}

		this.world.profiler.endSection();
		this.world.profiler.startSection("jump");

		if (this.isJumping)
		{
			if (this.isInWater() && this.jumpTicks == 0)
			{
				this.jump();
				this.jumpTicks = 10;
			}
			else if (this.isInLava())
			{
				this.handleJumpLava();
			}
			else if (this.onGround && this.jumpTicks == 0)
			{
				this.jump();
				this.jumpTicks = 10;
			}
		}
		else
		{
			this.jumpTicks = 0;
		}

		this.world.profiler.endSection();
		this.world.profiler.startSection("travel");
		this.moveStrafing *= 0.98F;
		this.moveForward *= 0.98F;
		this.randomYawVelocity *= 0.9F;
		//this.updateElytra();
		this.travel(this.moveStrafing, this.moveVertical, this.moveForward);
		this.world.profiler.endSection();
		this.world.profiler.startSection("push");
		this.collideWithNearbyEntities();
		this.world.profiler.endSection();

		if (!getBuried()) {
			//this.renderYawOffset = this.rotationYaw;
		}

		if (!this.world.isRemote) {
			if (!MatchMaterial(this.world.getBlockState(this.getPosition().down()).getMaterial())) {
				setBuried(false);
				setBuryCount(0);
			} else {
				if (!isInBuryPosition()) {
					if (getBuried()) {
						setBuried(false);
						setBuryCount(0);
						setSwimCount(-getBuryLength());
						setBuriedTick(getBuryTick());
					}
				} else { //is in bury position
					if ((!getBuried()) && getSwimCount() > 1000) { //Has swum long enough
						setBuried(true);
						setBuryCount(-getBuryLength());
						setSwimCount(0);
						setBuriedTick(getBuryTick());
					} else {
						if (getBuryCount() > 4600) {
							if (getBuried()) {
								setBuried(false);
								setBuryCount(0);
								setSwimCount(-getBuryLength());
								setBuriedTick(getBuryTick());
							}
						}
					}
				}
			}
		}

		if (getBuryTick() > 0) {
			BlockPos posIn = this.getPosition();
			World worldIn = this.world;
			//worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
			if (worldIn instanceof WorldServer) {
				if (Math.random() > 0.85) {
					for (int k = 0; k < 2; ++k) {
						((WorldServer) worldIn).spawnParticle(EnumParticleTypes.WATER_BUBBLE, posIn.getX(), posIn.getY(), posIn.getZ(), (int) 1, 0.5, 0, 0.5, 0.06, new int[0]);
					}
				}
				if (Math.random() > 0.85) {
					for (int k = 0; k < 2; ++k) {
						((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, posIn.getX(), posIn.getY(), posIn.getZ(), (int) 1, 0.5, 0, 0.5, 0.02, new int[0]);
					}
				}
			}
		}

		if (this.getBuriedTick() > 0 || this.getBuried() || this.getSwimCount() <= 0) {
			//We are burying!
		}

		if (this.getBuriedTick() > 0 || this.getBuried() || this.getSwimCount() <= 0) {
			if (this.getBuried() && this.getBuriedTick() <= 0) {
				world.setBlockState(this.getPosition(), BlockSelkirkiaBurrow.block.getDefaultState().withProperty(BlockSelkirkiaBurrow.OCCUPIED, true));
				this.setDead();
				return;
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.SELKIRKIA_LOOT;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Override
	public void travel(float strafe, float vertical, float forward) {
		float f4;
		if (this.isServerWorld()) {
			if (isInWater()) {
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

				if (this.isPotionActive(MobEffects.LEVITATION))
				{
					this.motionY += (0.05D * (double)(this.getActivePotionEffect(MobEffects.LEVITATION).getAmplifier() + 1) - this.motionY) * 0.2D;
				}
				else
				{
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

	@Override
	public int getAnimationTick() {
		return 0;
	}

	@Override
	public void setAnimationTick(int i) {

	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {

	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[0];
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_SELKIRKIA;
	}
	public class WanderMoveHelper extends EntityMoveHelper {

		private final EntityPrehistoricFloraSelkirkia EntityBase = EntityPrehistoricFloraSelkirkia.this;

		public WanderMoveHelper() {
			super(EntityPrehistoricFloraSelkirkia.this);
		}

		public void onUpdateMoveHelper() {
			if (this.action == Action.STRAFE) {
				//float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
				float f = getAISpeedTrilobite();
				float f1 = (float) this.speed * f;
				float f2 = this.moveForward;
				float f3 = this.moveStrafe;
				float f4 = MathHelper.sqrt(f2 * f2 + f3 * f3);

				if (f4 < 1.0F) {
					f4 = 1.0F;
				}

				f4 = f1 / f4;
				f2 = f2 * f4;
				f3 = f3 * f4;
				float f5 = MathHelper.sin(this.EntityBase.rotationYaw * 0.017453292F);
				float f6 = MathHelper.cos(this.EntityBase.rotationYaw * 0.017453292F);
				float f7 = f2 * f6 - f3 * f5;
				float f8 = f3 * f6 + f2 * f5;
				PathNavigate pathnavigate = this.EntityBase.getNavigator();

				if (pathnavigate != null) {
					NodeProcessor nodeprocessor = pathnavigate.getNodeProcessor();

					if (nodeprocessor != null && nodeprocessor.getPathNodeType(this.EntityBase.world, MathHelper.floor(this.EntityBase.posX + (double) f7), MathHelper.floor(this.EntityBase.posY), MathHelper.floor(this.EntityBase.posZ + (double) f8)) != PathNodeType.WALKABLE) {
						this.moveForward = 1.0F;
						this.moveStrafe = 0.0F;
						f1 = f;
					}
				}

				this.EntityBase.setAIMoveSpeed(f1);
				this.EntityBase.setMoveForward(this.moveForward);
				this.EntityBase.setMoveStrafing(this.moveStrafe);
				this.action = Action.WAIT;
			} else if (this.action == Action.MOVE_TO) {
				this.action = Action.WAIT;
				double d0 = this.posX - this.EntityBase.posX;
				double d1 = this.posZ - this.EntityBase.posZ;
				double d2 = this.posY - this.EntityBase.posY;
				double d3 = d0 * d0 + d2 * d2 + d1 * d1;

				if (d3 < 2.500000277905201E-7D) {
					this.EntityBase.setMoveForward(0.0F);
					return;
				}

				float turn = (EntityBase.getMaxTurnDistancePerTick());
				float f9 = (float) (MathHelper.atan2(d1, d0) * (180D / Math.PI)) - 90;
				this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, f9, turn);
				//this.EntityBase.setAIMoveSpeed((float) (this.speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));

				//float speed = getAISpeedLand();
				//this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
				this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * getAISpeedTrilobite()));


				//Testing mode:
				//this.EntityBase.setAIMoveSpeed(0f);

				if (
						(this.EntityBase.collidedHorizontally)
								&& (d2 > (double) this.EntityBase.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.EntityBase.width))
				) {
					this.EntityBase.getJumpHelper().setJumping();
					this.action = Action.JUMPING;
				}
			} else if (this.action == Action.JUMPING) {
				//float speed = getAISpeedLand();
				//this.EntityBase.setAIMoveSpeed((float) (speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
				this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedTrilobite()));

				if (this.EntityBase.onGround) {
					this.action = Action.WAIT;
				}
			} else {
				this.EntityBase.setMoveForward(0.0F);
			}
		}
	}
}