
package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.lepidodendron.entity.util.PathNavigateWaterBottomNoJump;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraSlitheringWaterBase extends EntityTameable implements IAnimatedEntity, IPrehistoricDiet {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private int jumpTicks;
	public int slitherStage;
	public boolean slitherState;
	public int rotationStage;
	public int slitherTickCycle;
	private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraSlitheringWaterBase.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraSlitheringWaterBase.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> TICKOFFSET = EntityDataManager.createKey(EntityPrehistoricFloraSlitheringWaterBase.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean> ISMOVING = EntityDataManager.createKey(EntityPrehistoricFloraSlitheringWaterBase.class, DataSerializers.BOOLEAN);

	public int inPFLove;

	public EnumCreatureAttributePN getPNCreatureAttribute() {
		if (getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD) {
			return EnumCreatureAttributePN.INVERTEBRATE;
		}
		return EnumCreatureAttributePN.VERTEBRATE;
	}

	public boolean hasPNVariants() {
		return false;
	}

	/**
	 * If there are variants, do they need to match, not match, or not care about matches in order to breed?
	 * -1 = the variants must be different to breed
	 * 0 = the variants can be either different or the same to breed
	 * 1 = the variants must be the same to breed
	 */
	public byte breedPNVariantsMatch() {
		return 0;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		for (String oreDict : this.getFoodOreDicts()) {
			if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), stack)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isChild()
	{
		return false;
	}

	@Override
	public boolean isRiding() {
		if (this.getRidingEntity() != null) {
			if (this.getRidingEntity() instanceof EntityBoat) {
				return false;
			}
		}
		return super.isRiding();
	}

	@Nullable
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}

	public ItemStack getPropagule() {
		return new ItemStack(ItemUnknownEgg.block, (int) (1));
	}

	public abstract boolean isSmall();

	public String getBucketMessage() {
		return "is too grown up to fit into a bucket";
	}

	@Override
	public boolean isPushedByWater()
	{
		return false;
	}

	public EntityPrehistoricFloraSlitheringWaterBase(World world) {
		super(world);
		this.slitherTickCycle = 20;
		enablePersistence();
		this.moveHelper = new EntityPrehistoricFloraSlitheringWaterBase.WanderMoveHelper();
		this.navigator = new PathNavigateWaterBottomNoJump(this, world);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			this.chainBuffer = new ChainBuffer();
		}
	}

	public EntityPrehistoricFloraSlitheringWaterBase(World world, int slitherTickCycle) {
		super(world);
		this.slitherTickCycle = slitherTickCycle;
		enablePersistence();
		this.moveHelper = new EntityPrehistoricFloraSlitheringWaterBase.WanderMoveHelper();
		this.navigator = new PathNavigateWaterBottomNoJump(this, world);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			this.chainBuffer = new ChainBuffer();
		}

	}

	public static String getHabitat() {
		return I18n.translateToLocal("helper.pf_aquatic.name");
	}

	public static String getPeriod() {
		return "undefined";
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		int i = (int) Math.round(this.getMaxHealth()/4D);
		if (i < 1) {
			return 0;
		}
		return this.world.rand.nextInt(i);
	}

	public abstract boolean dropsEggs();

	public boolean getIsMoving() {
		return this.dataManager.get(ISMOVING);
	}

	public void setIsMoving(boolean isMoving) {
		this.dataManager.set(ISMOVING, isMoving);
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	protected abstract float getAISpeedSlithering();

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(TICKS, 0);
		this.dataManager.register(MATEABLE, 0);
		this.dataManager.register(TICKOFFSET, rand.nextInt(1000));
		this.dataManager.register(ISMOVING, false);
	}

	public int getTickOffset() {
		return this.dataManager.get(TICKOFFSET);
	}

	public void setTickOffset(int ticks) {
		this.dataManager.set(TICKOFFSET, ticks);
	}

	public int getTicks() {
		return this.dataManager.get(TICKS);
	}

	public void setTicks(int ticks) {
		this.dataManager.set(TICKS, ticks);
	}

	public int getMateable() {
		return this.dataManager.get(MATEABLE);
	}

	public void setMateable(int ticks) {
		this.dataManager.set(MATEABLE, ticks);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setTicks(0);
		this.setMateable(0);
		this.setTickOffset(rand.nextInt(1000));
		return livingdata;
	}

	public boolean getCanBreed() {
		int breedCooldown = LepidodendronConfig.breedCooldown;
		if (breedCooldown < 1) {
			breedCooldown = 1;
		}
		return this.getTicks() > breedCooldown; //If the mob has done not bred for a MC day
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("Ticks", this.getTicks());
		compound.setInteger("TickOffset", this.getTickOffset());
		compound.setInteger("InPFLove", this.inPFLove);
		compound.setInteger("mateable", this.getMateable());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setTicks(compound.getInteger("Ticks"));
		this.setTickOffset(compound.getInteger("TickOffset"));
		this.inPFLove = compound.getInteger("InPFLove");
		this.setMateable(compound.getInteger("mateable"));
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		if (ds == DamageSource.IN_WALL) {
			if (this.isInWater()) {
				return false;
			}
		}
		if (this.isEntityInvulnerable(ds))
		{
			return false;
		}
		else
		{
			this.inPFLove = 0;
			return super.attackEntityFrom(ds, i);
		}
	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	public float getMaxTurnDistancePerTick() {
		return 2;
	}

	@Override
	public boolean isInWater() {
		return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) ||
				this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
	}

	public boolean isAtBottom() {
		//System.err.println("Testing position");
		if (this.getPosition().getY() - 1 > 1) {
			BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
			return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
					&& ((this.world.getBlockState(pos)).getMaterial() != Material.WATER));
		}
		return true;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}

	@Override
	public int getTalkInterval() {
		return 120;
	}

	@Override
	public boolean isOnLadder() {
		return false;
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
		return 1.0F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Override
	public void onLivingUpdate() {
		this.renderYawOffset = this.rotationYaw;
		////this.renderYawOffset = this.rotationYaw;
		//Updated from vanilla to disable jumping and limit rotations
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
			if (this.rotationStage > 155) {
				this.rotationYaw = (float) ((double) this.rotationYaw + Math.min(2, (d3 / (double) this.newPosRotationIncrements)));
			}
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

		if (this.inPFLove > 0)
		{
			--this.inPFLove;
		}

		if (this.getMateable() < 0) {
			this.setMateable(this.getMateable() + 1);
		}
	}

	public int getSlitherStage() {
		int slitherstage = this.slitherStage;

		return slitherstage;
	}

	public void onEntityUpdate()
	{
		int i = this.getAir();
		super.onEntityUpdate();

		if (!(rotationStage > 0)) {rotationStage = 0;}
		if (rotationStage > 180) {
			rotationStage = 1;
		} else {
			rotationStage = rotationStage + rand.nextInt(2);
		}

		if (!(slitherStage > 0)) {slitherStage = 0;}

		if (slitherState) {
			if (slitherStage > this.slitherTickCycle) {
				slitherState = false;
			} else {
				slitherStage = slitherStage + rand.nextInt(2);
			}
		}

		if (!slitherState) {
			if (slitherStage < 1) {
				slitherState = true;
			} else {
				slitherStage = slitherStage - rand.nextInt(2);
			}
		}

		if (this.isEntityAlive() && !isInWater())
		{
			--i;
			this.setAir(i);

			if (this.getAir() == -20)
			{
				this.setAir(0);
				this.attackEntityFrom(DamageSource.DROWN, 2.0F);
			}
		}
		else
		{
			this.setAir(300);
		}

		//General ticker (for babies etc.)
		int ii = this.getTicks();
		if (this.isEntityAlive())
		{
			++ii;
			//limit at 48000 (two MC days) and then reset:
			if (ii >= 48000) {ii = 0;}
			this.setTicks(ii);
		}

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

				if (this.motionX != 0 || this.motionZ != 0) {
					this.setIsMoving(true);
				}
				else {
					this.setIsMoving(false);
				}

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

	public class WanderMoveHelper extends EntityMoveHelper {

		private final EntityPrehistoricFloraSlitheringWaterBase EntityBase = EntityPrehistoricFloraSlitheringWaterBase.this;

		public WanderMoveHelper() {
			super(EntityPrehistoricFloraSlitheringWaterBase.this);
		}

		public void onUpdateMoveHelper() {
			//this.EntityBase.isSlithering = true;
			if (this.action == Action.STRAFE) {
				//float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
				float f = getAISpeedSlithering();
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
				this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * getAISpeedSlithering()));

				//Testing mode:
				//this.EntityBase.setAIMoveSpeed(0f);


			} else {
				this.EntityBase.setMoveForward(0.0F);
			}
		}
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if (!itemstack.isEmpty())
		{
			if (this.isBreedingItem(itemstack) && this.inPFLove <= 0 && this.getMateable() == 0)
			{
				this.consumeItemFromStack(player, itemstack);
				this.inPFLove = 600;
				this.world.setEntityState(this, (byte)18);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean isInLove()
	{
		return this.inPFLove > 0;
	}

	public void setNotMateable()
	{
		this.setMateable(-6000);
	}

	@Override
	public void resetInLove()
	{
		this.inPFLove = 0;
	}

}