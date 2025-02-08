
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.model.llibraryextensions.MillipedeBuffer;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.entity.util.PathNavigateWaterBottom;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPambdelurion extends EntityPrehistoricFloraAgeableFishBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public MillipedeBuffer tailBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public Animation LOOK_ANIMATION;
	private Animation currentAnimation;
	private int jumpTicks;

	private static final DataParameter<Integer> LOOKTICK = EntityDataManager.createKey(EntityPrehistoricFloraPambdelurion.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraPambdelurion(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		if (world != null) {
			this.moveHelper = new EntityPrehistoricFloraPambdelurion.WanderMoveHelper();
			this.navigator = new PathNavigateWaterBottom(this, world);
		}
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 5.0D;
		LOOK_ANIMATION = Animation.create(120);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new MillipedeBuffer();
		}
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 8, 2.5F, this);
		}
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Cambrian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public int getAttackLength() {
		return 60;
	}

	@Override
	public int getRoarLength() {
		return 0;
	}

	@Override
	public void playLivingSound() {
	}

	public int getLookTick() {
		if (this.dataManager.get(LOOKTICK) == null) {
			setLookTick(0);
		}
		return (this.dataManager.get(LOOKTICK));
	}

	public void setLookTick(int lookTick) {
		this.dataManager.set(LOOKTICK, lookTick);
	}

	public float getMaxTurnDistancePerTick() {
		return 20;
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(LOOKTICK, 0);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("lookTicks", this.getLookTick());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setLookTick(compound.getInteger("lookTicks"));
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return currentAnimation == null ? NO_ANIMATION : currentAnimation;
	}

	@Override
	public void setAnimation(Animation animation)
	{
		currentAnimation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{LOOK_ANIMATION, ATTACK_ANIMATION};
	}

	@Override
	protected float getAISpeedFish() {
		if (this.getAnimation() == LOOK_ANIMATION) {
			return 0;
		}
		if (this.getIsFast()) {
			return 0.132f;
		}
		return 0.07f;
		//return 0;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, false, 0));
		tasks.addTask(2, new AttackAI(this, 1.0, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishBaseWalkBottom(this, NO_ANIMATION));
		tasks.addTask(4, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteBottomBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteSwimBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraSlitheringWaterBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityVillager.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.FISHFOOD, DietString.FISH), DietString.CRUSTACEAN);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Override
	public void onLivingUpdate() {

		if (!world.isRemote) {
			if (this.getAttackTarget() != null) {
				if (this.getAttackTarget().isDead) {
					this.setAttackTarget(null);
				}
			}
			if (this.getEatTarget() != null) {
				if (this.getEatTarget().isDead) {
					this.setEatTarget(null);
				}
			}
			this.setIsFast(this.getAttackTarget() != null);
			//System.err.println("Entity side isFast: " + this.getIsFast());
		}

		//Updated from vanilla to allow underwater jumping:
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

		//End of adjusted class

		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 15 && this.getAttackTarget() != null) {
			launchAttack();
		}
		else {
			if (this.getLookTick() == 1000 && this.getAnimation() == NO_ANIMATION) {
				this.setAnimation(LOOK_ANIMATION);
				this.setLookTick((int) Math.round(Math.random() * 1000D));
			}

			if ((!(this.getLookTick() >= 0)) || this.getLookTick() > 1005) {
				setLookTick(0);
			}
			setLookTick(getLookTick() + rand.nextInt(3));
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.PAMBDELURION_LOOT;
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

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PAMBDELURION;
	}

	public class WanderMoveHelper extends EntityMoveHelper {

		private final EntityPrehistoricFloraPambdelurion EntityBase = EntityPrehistoricFloraPambdelurion.this;

		public WanderMoveHelper() {
			super(EntityPrehistoricFloraPambdelurion.this);
		}

		public void onUpdateMoveHelper() {
			if (this.action == Action.STRAFE) {
				//float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
				float f = getAISpeedFish();
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
				this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * getAISpeedFish()));


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
				this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedFish()));

				if (this.EntityBase.onGround) {
					this.action = Action.WAIT;
				}
			} else {
				this.EntityBase.setMoveForward(0.0F);
			}
		}
	}

	//Rendering taxidermy:
	//--------------------

}