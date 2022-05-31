
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAmphibianSpawnSpathicephalus;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraSpathicephalus extends EntityPrehistoricFloraSwimmingAmphibianBase {

	private static final DataParameter<Integer> FEEDTICKS = EntityDataManager.createKey(EntityPrehistoricFloraSpathicephalus.class, DataSerializers.VARINT);
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public Animation FEED_ANIMATION;
	private boolean isFeeding;
	private int isBlinking;

	public EntityPrehistoricFloraSpathicephalus(World world) {
		super(world);
		setSize(0.55F, 0.6F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		//minSize = 0.2F;
		//maxSize = 1.0F;
		minWidth = 0.1F;
		maxWidth = 0.4F;
		maxHeight = 0.45F;
		maxHealthAgeable = 14.0D;
		FEED_ANIMATION = Animation.create(120);
	}

	public static String getPeriod() {return "mid Carboniferous";}

	public static String getHabitat() {return "Amphibious";}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(FEEDTICKS, 0);
	}

	public boolean isFeedAnimation() {
		return (this.getAnimation() == FEED_ANIMATION);
	}

	public int getFeedTicks() {
		if (this.dataManager.get(FEEDTICKS) == null) {
			this.setFeedTicks(0);
			return 0;
		}
		return this.dataManager.get(FEEDTICKS);
	}

	public void setFeedTicks(int feedticks) {
		this.dataManager.set(FEEDTICKS, feedticks);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("FeedTicks", this.getFeedTicks());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setFeedTicks(compound.getInteger("FeedTicks"));
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.setFeedTicks(0);
		this.isFeeding = false;
		return super.attackEntityFrom(source, amount);
	}

	public boolean isInFeedingPosition() {
		return
		super.isReallyInWater()
		&& (this.world.getBlockState(this.getPosition().down()).getMaterial() != Material.WATER)
		&& (this.posY - this.getPosition().getY() <= 0.1);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION,ROAR_ANIMATION,FEED_ANIMATION};
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		if (this.getAnimation() == FEED_ANIMATION) {return 0.00f;}
		float calcSpeed = 0.145F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.241f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 72000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterSpathicephalus;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWander(this, NO_ANIMATION, 0.8, 20));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishItemsAI(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		//this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(2, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
				(OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), stack))
						|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
		);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:megalocephalus_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:megalocephalus_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:megalocephalus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 2 + this.world.rand.nextInt(3);
	}

	@Override
	public boolean isOnLadder() {
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;

		//System.err.println("getFeedTicks " + this.getFeedTicks());
		//System.err.println("isHungry " + this.isHungry());
		//System.err.println("isInFeedingPosition " + this.isInFeedingPosition());

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}
		else {
			if (!(this.getTicks() < 0)) {
				if (this.getAnimation() != FEED_ANIMATION) {
					setFeeding(false);
				}
				if (!this.world.isRemote) {
					if (!(this.isInWater())) {
						setFeeding(false);
						this.setAnimation(NO_ANIMATION);
					} else {
						if ((!getIsFeeding()) && (isHungry()) && isInFeedingPosition()) {
							if (this.getAnimation() == NO_ANIMATION) {
								setFeeding(true);
								this.setFeedTicks(0);
								this.setAnimation(FEED_ANIMATION);
								//Restore some health:
								this.setHealth(Math.min(this.getHealth() + 0.5F, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
								//System.err.println("Set Anim");
							}
						}
					}
				}
				if (!this.world.isRemote) {
					if ((!(getFeedTicks() > 0)) || getFeedTicks() > 3000) {
						setFeedTicks(0);
					}
					setFeedTicks(getFeedTicks() + rand.nextInt(3));

				}
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public boolean isHungry() {
		return (this.getFeedTicks() > 2000);
	}

	public boolean getIsFeeding() {
		return this.isFeeding;
	}

	public void setFeeding(boolean bool) {
		this.isFeeding = bool;
	}

	public boolean getBlinking() {
		return this.isBlinking > 175;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		if ((!(isBlinking > 0)) || isBlinking > 200) {isBlinking = 0;}
		isBlinking ++;

		//Lay eggs perhaps:
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getCanBreed() && LepidodendronConfig.doMultiplyMobs && this.getTicks() > 0
				&& (BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP)
				|| BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP))
				&& (BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			if (Math.random() > 0.5) {
				this.setTicks(-50); //Flag this as stationary for egg-laying
			}
		}
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getTicks() > -30 && this.getTicks() < 0 && LepidodendronConfig.doMultiplyMobs) {
			//Is stationary for egg-laying:
			IBlockState eggs = BlockAmphibianSpawnSpathicephalus.block.getDefaultState();
			if (BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP) && BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockAt(world, this.getPosition())) {
				world.setBlockState(this.getPosition(), eggs);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP) && BlockAmphibianSpawnSpathicephalus.block.canPlaceBlockAt(world, this.getPosition().down())) {
				world.setBlockState(this.getPosition().down(), eggs);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.SPATHICEPHALUS_LOOT_YOUNG;
		}
		return LepidodendronMod.SPATHICEPHALUS_LOOT;
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

				if (this.isHungry() && this.isReallyInWater())
				{
					blockpos$pooledmutableblockpos.setPos(this.posX, 0.0D, this.posZ);

					if (!this.world.isRemote || this.world.isBlockLoaded(blockpos$pooledmutableblockpos) && this.world.getChunk(blockpos$pooledmutableblockpos).isLoaded())
					{
						if (!this.hasNoGravity())
						{
							this.motionY -= 0.08D;
							//System.err.println("Make go down to eat");
							if (this.isHungry()) {this.motionY -= 0.1D;}
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
				//System.err.println("Vanilla travel handler");
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

}