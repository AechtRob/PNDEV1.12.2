
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockRottenLog;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.LandWanderAvoidWaterClimbingAI;
import net.lepidodendron.entity.ai.LandWanderNestInBlockAI;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.util.PathNavigateGliding;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.item.entities.ItemBugRaw;
import net.lepidodendron.item.entities.ItemEggsWeigeltisaurus;
import net.lepidodendron.util.MaterialResin;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class EntityPrehistoricFloraWeigeltisaurus extends EntityPrehistoricFloraLandClimbingBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private static final DataParameter<Boolean> ISFLYING = EntityDataManager.createKey(EntityPrehistoricFloraWeigeltisaurus.class, DataSerializers.BOOLEAN);

	public EntityPrehistoricFloraWeigeltisaurus(World world) {
		super(world);
		experienceValue = 0;
		this.isImmuneToFire = false;
		minWidth = 0.10F;
		maxWidth = 0.69F;
		maxHeight = 0.4F;
		maxHealthAgeable = 5.0D;
		setNoAI(!true);
		enablePersistence();
	}

	public int getRoarLength() {
		return 40;
	}

	@Override
	public int getClimbCooldown() {
		return 20 + rand.nextInt(40);
	}

	@Override
	public void selectNavigator () {
		if (this.getIsFlying()) {
			if ((!(this.moveHelper instanceof EntityPrehistoricFloraWeigeltisaurus.GlideMoveHelper))
					|| (!(this.navigator instanceof PathNavigateGliding))) {
				this.moveHelper = new EntityPrehistoricFloraWeigeltisaurus.GlideMoveHelper(this);
				this.navigator = new PathNavigateGliding(this, world);
			}
		}
		else { //Is not flying
			if (this.isSwimmingInWater() && this.canSwim()) {
				if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
						|| (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
					this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
					this.navigator = new PathNavigateSwimmerTopLayer(this, world);

					//System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
				}
			} else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
				if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
						|| (!(this.navigator instanceof PathNavigateGroundNoWater))) {
					this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
					this.navigator = new PathNavigateGroundNoWater(this, world);
					//System.err.println(this.getClass() + "Navigator changed to " + this.navigator);
				}
			}
		}
	}

	public static String getPeriod() {return "Permian";}

	public static String getHabitat() {return "Gliding Reptile";}

	public boolean getIsFlying() {
		return this.dataManager.get(ISFLYING);
	}

	public void setIsFlying(boolean isFlying) {
		this.dataManager.set(ISFLYING, isFlying);
	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(ISFLYING, false);
	}

	@Override
	public int getAdultAge() {
		return 0;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("isFlying", this.getIsFlying());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsFlying(compound.getBoolean("isFlying"));
	}

	@Override
	protected float getAISpeedLand() {
		return 0.375F;
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		this.setIsFlying(((!this.getIsClimbing()) && (!this.getHeadCollided()) && (!this.isReallyInWater()) && (!this.isOnGround()) && (!this.isJumping)));

	}

	@Override
	public boolean isReallyInWater() { //is actually in water at all
		//return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
		return this.isInWater() || this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER;
	}

	public boolean isOnGround() {
		IBlockState state = this.world.getBlockState(this.getPosition().down());
		return
			this.onGround ||
			state.getBlockFaceShape(this.world, this.getPosition().down(), EnumFacing.UP) == BlockFaceShape.SOLID;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return true;
	}

	@Override
	public String tagEgg () {return "eggs_weigeltisaurus";}

	@Override
	public ItemStack eggItemStack() {
		return new ItemStack(ItemEggsWeigeltisaurus.block, 1);
	}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

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

	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new GlideAI());
		tasks.addTask(2, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(3, new LandWanderNestInBlockAI(this));
		tasks.addTask(4, new LandWanderAvoidWaterClimbingAI(this, 0.8D, 20));
		tasks.addTask(5, new EntityAILookIdle(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() == ItemBugRaw.block;
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
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
		//this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:weigeltisaurid_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:weigeltisaurid_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:weigeltisaurid_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.WEIGELTISAURUS_LOOT;
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		if (
				world.getBlockState(pos).getBlock() == BlockRottenLog.block
		) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(pos), "egg");
			if (eggRenderType.equals("")) {
				//There is a space, is the orientation correct?
				if (world.getBlockState(pos).getBlock() == BlockRottenLog.block) {
					EnumFacing facing = world.getBlockState(pos).getValue(FACING);
					BlockFaceShape faceshape = world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP);
					if (!((facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
							&& faceshape != BlockFaceShape.SOLID)) {
						//This is solid for laying:
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		return (testLay(world, pos.down()) || testLay(world, pos)) ;
	}

	@Override
	public void travel(float strafe, float vertical, float forward) {
		float f4;
		if (this.isServerWorld()) {

			double yy = this.posY + Math.max((this.getSwimHeight() - 0.2), 0.1);
			BlockPos posEyes = new BlockPos(this.posX, yy, this.posZ);

			if (this.isReallyInWater() &&
					(world.getBlockState(posEyes).getMaterial() == Material.WATER
							|| world.getBlockState(posEyes).getMaterial() == Material.LAVA
							|| world.getBlockState(posEyes).getMaterial() == MaterialResin.RESIN)
			) {
				this.motionY = 0.2D;
			}


			if (this.isReallyInWater()) { //Is in water
				//System.err.println("Is in water");
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

				this.motionX *= f4;
				this.motionX *= 0.9;
				this.motionY *= 0.9;
				this.motionY *= f4;
				this.motionZ *= 0.9;
				this.motionZ *= f4;
			}
			else { //is not in water:
				if (!this.isInLava())
				{
					float f6 = 0.91F;
					BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);

					if (this.onGround)
					{
						IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos);
						f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
					}

					float f7 = 0.16277136F / (f6 * f6 * f6);
					float f8;

					if (this.onGround)
					{
						f8 = this.getAIMoveSpeed() * f7;
					}
					else
					{
						f8 = this.jumpMovementFactor;
					}

					this.moveRelative(strafe, vertical, forward, f8);
					f6 = 0.91F;

					if (this.onGround)
					{
						IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos.setPos(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ));
						f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
					}

					if (this.isOnLadder())
					{
						float f9 = 0.15F;
						this.motionX = MathHelper.clamp(this.motionX, -0.15000000596046448D, 0.15000000596046448D);
						this.motionZ = MathHelper.clamp(this.motionZ, -0.15000000596046448D, 0.15000000596046448D);
						this.fallDistance = 0.0F;

						if (this.motionY < -0.15D)
						{
							this.motionY = -0.15D;
						}

					}

					this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

					if (this.motionX != 0 || this.motionZ != 0) {
						this.setIsMoving(true);
					}
					else {
						this.setIsMoving(false);
					}

					if (this.getIsClimbing() && (!(this.getHeadCollided())))
					{
						this.motionY = 0.2D;
					}

					if (this.isPotionActive(MobEffects.LEVITATION) && (!(this.getHeadCollided())))
					{
						this.motionY += (0.05D * (double)(this.getActivePotionEffect(MobEffects.LEVITATION).getAmplifier() + 1) - this.motionY) * 0.2D;
					}
					else
					{
						blockpos$pooledmutableblockpos.setPos(this.posX, 0.0D, this.posZ);

						if (!this.world.isRemote || this.world.isBlockLoaded(blockpos$pooledmutableblockpos) && this.world.getChunk(blockpos$pooledmutableblockpos).isLoaded())
						{
							if (!this.hasNoGravity() && (!(this.getHeadCollided())))
							{
								if (!this.getIsFlying()) {
									this.motionY -= 0.08D;
								}
								else {
									this.motionY = -0.035D;
								}
							}
							if (this.getHeadCollided()) {
								this.motionY = 0.0D;
							}
						}
						else if (this.posY > 0.0D && (!(this.getHeadCollided())))
						{
							this.motionY = -0.1D;
						}
						else
						{
							this.motionY = 0.0D;
						}
					}

					//System.err.println("Ypos: " + this.posY + " Ymotion: " + this.motionY);

					this.motionY *= 0.9800000190734863D;
					this.motionX *= (double)f6;
					this.motionZ *= (double)f6;
					blockpos$pooledmutableblockpos.release();

				}
				else //is in Lava
				{
					double d4 = this.posY;
					this.moveRelative(strafe, vertical, forward, 0.02F);
					this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

					this.motionX *= 0.5D;
					this.motionY *= 0.5D;
					this.motionZ *= 0.5D;

					if (!this.hasNoGravity())
					{
						this.motionY -= 0.02D;
					}

					if (this.collidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d4, this.motionZ))
					{
						this.motionY = 0.30000001192092896D;
					}
				}
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

	public class GlideMoveHelper extends EntityMoveHelper {
		public GlideMoveHelper(EntityPrehistoricFloraWeigeltisaurus glider) {
			super(glider);
			this.speed = EntityPrehistoricFloraWeigeltisaurus.this.getAIMoveSpeed();
		}

		public void onUpdateMoveHelper() {
			if (this.action == Action.MOVE_TO) {

				double d0 = this.posX - EntityPrehistoricFloraWeigeltisaurus.this.posX;
				double d1 = this.posY - EntityPrehistoricFloraWeigeltisaurus.this.posY;
				double d2 = this.posZ - EntityPrehistoricFloraWeigeltisaurus.this.posZ;
				double d3 = d0 * d0 + d1 * d1 + d2 * d2;
				d3 = MathHelper.sqrt(d3);

				if (d3 < EntityPrehistoricFloraWeigeltisaurus.this.getEntityBoundingBox().getAverageEdgeLength()) {
					this.action = Action.WAIT;
					EntityPrehistoricFloraWeigeltisaurus.this.motionX *= 0.5D;
					EntityPrehistoricFloraWeigeltisaurus.this.motionY *= 0.5D;
					EntityPrehistoricFloraWeigeltisaurus.this.motionZ *= 0.5D;
				} else {
					EntityPrehistoricFloraWeigeltisaurus.this.motionX += d0 / d3 * 0.1D * this.speed;
					EntityPrehistoricFloraWeigeltisaurus.this.motionY += d1 / d3 * 0.1D * this.speed;
					EntityPrehistoricFloraWeigeltisaurus.this.motionZ += d2 / d3 * 0.1D * this.speed;

					if (EntityPrehistoricFloraWeigeltisaurus.this.getAttackTarget() == null) {
						EntityPrehistoricFloraWeigeltisaurus.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraWeigeltisaurus.this.motionX, EntityPrehistoricFloraWeigeltisaurus.this.motionZ)) * (180F / (float) Math.PI);
						EntityPrehistoricFloraWeigeltisaurus.this.renderYawOffset = EntityPrehistoricFloraWeigeltisaurus.this.rotationYaw;
					} else {
						double d4 = EntityPrehistoricFloraWeigeltisaurus.this.getAttackTarget().posX - EntityPrehistoricFloraWeigeltisaurus.this.posX;
						double d5 = EntityPrehistoricFloraWeigeltisaurus.this.getAttackTarget().posZ - EntityPrehistoricFloraWeigeltisaurus.this.posZ;
						EntityPrehistoricFloraWeigeltisaurus.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
						EntityPrehistoricFloraWeigeltisaurus.this.renderYawOffset = EntityPrehistoricFloraWeigeltisaurus.this.rotationYaw;
					}
				}
			}
		}
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	class GlideAI extends EntityAIBase {
		BlockPos target;

		public GlideAI() {
			this.setMutexBits(4);
		}

		public boolean shouldExecute() {
			if (!EntityPrehistoricFloraWeigeltisaurus.this.getIsFlying()) {
				return false;
			}

			//if (EntityPrehistoricFloraWeigeltisaurus.this.getRNG().nextFloat() < 0.5F) {
				Path path = EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().getPath();
				if (
					((!EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().noPath())
						&& (!isDirectPathBetweenPoints(EntityPrehistoricFloraWeigeltisaurus.this, EntityPrehistoricFloraWeigeltisaurus.this.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
						||
						(path != null && path.getFinalPathPoint() != null
							&& (int)(path.getFinalPathPoint().y) == (int)EntityPrehistoricFloraWeigeltisaurus.this.posY)
				)
				{
					EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().clearPath();
				}
				if (EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().noPath()) {
					BlockPos vec3 = this.findAirOrLandTarget();
					if (vec3 != null) {
						double Xoffset = EntityPrehistoricFloraWeigeltisaurus.this.posX - EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getX();
						double Zoffset = EntityPrehistoricFloraWeigeltisaurus.this.posZ - EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getZ();

						EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, EntityPrehistoricFloraWeigeltisaurus.this.posY, vec3.getZ() + 0.5D + Zoffset, 0.3);

						return true;
					}
					else {
						int ii = rand.nextInt(4);
						vec3 = EntityPrehistoricFloraWeigeltisaurus.this.getPosition();
						double Xoffset = EntityPrehistoricFloraWeigeltisaurus.this.posX - EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getX();
						double Zoffset = EntityPrehistoricFloraWeigeltisaurus.this.posZ - EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getZ();


						switch (ii) {
							case 0:
								EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().tryMoveToXYZ(vec3.getX() + 1D + 0.5D + Xoffset, 0, 0 + Zoffset, 0.2);
								return true;
							case 1:
								EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().tryMoveToXYZ(vec3.getX() - 1D + 0.5D + Xoffset, 0, 0 + Zoffset, 0.2);
								return true;
							case 2:
								EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().tryMoveToXYZ(0 + Xoffset, 0, vec3.getZ() + 1D + 0.5D + Zoffset, 0.2);
								return true;
							case 3:
								EntityPrehistoricFloraWeigeltisaurus.this.getNavigator().tryMoveToXYZ(0 + Xoffset, 0, vec3.getZ() - 1D + 0.5D + Zoffset, 0.2);
								return true;
						}
					}
				}
			return true;
		}

		public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
			RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
			return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
		}

		@Override
		public boolean shouldContinueExecuting() {
			return false;
		}

		public BlockPos findAirOrLandTarget() {
			Random rand = EntityPrehistoricFloraWeigeltisaurus.this.getRNG();
			if (EntityPrehistoricFloraWeigeltisaurus.this.getAttackTarget() == null) {
				for (int i = 0; i < 18; i++) {
					BlockPos randPos = EntityPrehistoricFloraWeigeltisaurus.this.getPosition().add(rand.nextInt(9) - 4, 0, rand.nextInt(9) - 4);
					//System.err.println("Target " + randPos.getX() + " " + EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getY() + " " + randPos.getZ());
					if (EntityPrehistoricFloraWeigeltisaurus.this.world.getBlockState(randPos).getMaterial() != Material.LAVA && EntityPrehistoricFloraWeigeltisaurus.this.isDirectPathBetweenPoints(EntityPrehistoricFloraWeigeltisaurus.this.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
						if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
							//Check we won't land in a liquid:
							int ii = 0;
							boolean liquid = false;
							while (ii < 6) {
								if (randPos.getY() - ii >= 1) {
									IBlockState state = EntityPrehistoricFloraWeigeltisaurus.this.world.getBlockState(randPos.down(ii));
									if (!(state.getMaterial() == Material.WATER
										|| state.getMaterial() == Material.LAVA
										|| state.getBlock() instanceof BlockFluidBase
										|| state.getBlock() instanceof BlockLiquid
										|| state.getMaterial() == Material.AIR)) {
										break;
									}
									if (state.getMaterial() == Material.WATER
										|| state.getMaterial() == Material.LAVA
										|| state.getBlock() instanceof BlockFluidBase
										|| state.getBlock() instanceof BlockLiquid) {
										liquid = true;
									}
								}
								ii += 1;
							}
							if (!liquid
									&& !(randPos.getX() == (int)EntityPrehistoricFloraWeigeltisaurus.this.posX && randPos.getZ() == (int)EntityPrehistoricFloraWeigeltisaurus.this.posZ) ) 	{
								return randPos;
							}
						}
					}
				}
			} else {
				BlockPos blockpos1;
				blockpos1 = new BlockPos(EntityPrehistoricFloraWeigeltisaurus.this.getAttackTarget());
				if (EntityPrehistoricFloraWeigeltisaurus.this.world.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
					return blockpos1;
				}
			}
			return null;
		}
	}
}