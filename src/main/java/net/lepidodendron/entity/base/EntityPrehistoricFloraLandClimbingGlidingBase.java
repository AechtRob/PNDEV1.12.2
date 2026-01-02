
package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateGliding;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.util.MaterialLatex;
import net.lepidodendron.util.MaterialResin;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraLandClimbingGlidingBase extends EntityPrehistoricFloraLandClimbingBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int launchCooldown;
	public int launchProgress;
	private Animation animation = NO_ANIMATION;
	private static final DataParameter<Boolean> ISFLYING = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingGlidingBase.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Boolean> ISLAUNCHING = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingGlidingBase.class, DataSerializers.BOOLEAN);

	public EntityPrehistoricFloraLandClimbingGlidingBase(World world) {
		super(world);
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		this.launchCooldown = 0;
		this.launchProgress = 0;
		if (this.getIsFlying() && (ds == DamageSource.IN_WALL || ds == DamageSource.FLY_INTO_WALL)) {
			return false;
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		if (this.getLaunchCooldown() < 0) {
			this.launchCooldown = rand.nextInt(this.getLaunchCooldown()) + 100;
		}
		this.launchProgress = 0;
		return livingdata;
	}

	@Override
	public void selectNavigator () {
		if (this.getIsFlying()) {
			if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandClimbingGlidingBase.GlideMoveHelper))
					|| (!(this.navigator instanceof PathNavigateGliding))) {
				this.moveHelper = new EntityPrehistoricFloraLandClimbingGlidingBase.GlideMoveHelper(this);
				this.navigator = new PathNavigateGliding(this, world);
			}
		}
		else { //Is not flying
			if (this.isSwimmingInWater() && this.canSwim()) {
				if ((!(this.moveHelper instanceof SwimmingMoveHelper))
						|| (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
					this.moveHelper = new SwimmingMoveHelper();
					this.navigator = new PathNavigateSwimmerTopLayer(this, world);

					//System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
				}
			} else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
				if ((!(this.moveHelper instanceof WanderMoveHelper))
						|| (!(this.navigator instanceof PathNavigateGroundNoWater))) {
					this.moveHelper = new WanderMoveHelper();
					this.navigator = new PathNavigateGroundNoWater(this, world);
					//System.err.println(this.getClass() + "Navigator changed to " + this.navigator);
				}
			}
		}
	}

	public int getLaunchCooldown() {
		//When set to zero will not launch itself from the ground
		return 0;
	}

	public boolean getIsFlying() {
		return (Boolean)this.dataManager.get(ISFLYING).booleanValue();
	}

	public void setIsFlying(boolean isFlying) {
		this.dataManager.set(ISFLYING, isFlying);
	}

	public boolean getIsLaunching() {
		return (Boolean)this.dataManager.get(ISLAUNCHING).booleanValue();
	}

	public void setIsLaunching(boolean isLaunching) {
		this.dataManager.set(ISLAUNCHING, isLaunching);
	}

	public boolean canRelaunch() {
		return false;
	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(ISFLYING, false);
		this.dataManager.register(ISLAUNCHING, false);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("isFlying", this.getIsFlying());
		compound.setInteger("launchCooldown", this.launchCooldown);
		compound.setInteger("launchProgress", this.launchProgress);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsFlying(compound.getBoolean("isFlying"));
		this.launchCooldown = compound.getInteger("launchCooldown");
		this.launchProgress = compound.getInteger("launchProgress");
	}

	public boolean canLaunch() {
		for (int xx = -2; xx <= 2; xx++) {
			for (int yy = 0; yy <= 3; yy++) {
				for (int zz = -2; zz <= 2; zz++) {
					if (this.world.getBlockState(this.getPosition().add(xx, yy, zz)).causesSuffocation()) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (this.launchCooldown > 0) {
			this.launchCooldown -= rand.nextInt(3) + 1;
		}
		if (this.launchCooldown < 0) {
			this.launchCooldown = 0;
		}

		if (this.launchProgress > 0) {
			this.launchProgress --;
		}
		if (this.launchProgress < 0) {
			this.launchProgress = 0;
		}

		if (!this.world.isRemote) {
			if (this.getLaunchCooldown() > 0 && this.launchCooldown == 0
					&& (!this.getIsFast())
					&& (!this.getIsFlying())
					&& (!this.getIsClimbing())
					//&& (this.getIsMoving())
					&& this.onGround
					&& (!this.collidedHorizontally)
					&& this.getAnimation() == NO_ANIMATION
					&& this.canLaunch()
					//&& (!this.world.getBlockState(this.getPosition().up()).causesSuffocation())
			) {
				this.setIsLaunching(true);
				this.motionY = this.getJumpUpwardsMotion();
				this.setMoveForward(this.getAIMoveSpeed());
				this.launchProgress = 50;
				if (this.getLaunchCooldown() > 0) {
					this.launchCooldown = rand.nextInt(this.getLaunchCooldown());
				}
			}
			if (this.isReallyInWater()
					&& this.canLaunch()) {
				this.setIsLaunching(true);
				this.motionY = this.getJumpUpwardsMotion();
				this.setMoveForward(this.getAIMoveSpeed());
				this.launchProgress = 50;
				if (this.getLaunchCooldown() > 0) {
					this.launchCooldown = rand.nextInt(this.getLaunchCooldown());
				}
			}

			if (this.launchProgress <= 0) {
				this.setIsLaunching(false);
			}

			if (this.getIsFlying() && this.canRelaunch()
					&& this.posY - ChunkGenSpawner.getTopSolidOrLiquidBlockIncludingLeaves(this.getPosition(), this.world).getY() <= 25
					&& this.canLaunch()) {
				if (rand.nextInt(64) == 0) {
					this.setIsLaunching(true);
					this.setMoveForward(0.1F);
					this.motionY = this.getJumpUpwardsMotion() / 2;
					this.launchProgress = 50;
					if (this.getLaunchCooldown() > 0) {
						this.launchCooldown = rand.nextInt(this.getLaunchCooldown());
					}
				}
			}
		}

		this.setIsFlying((!this.collidedHorizontally) && (this.getIsLaunching() || ((!this.getIsClimbing()) && (!this.getHeadCollided()) && (!this.isReallyInWater()) && (!this.isOnGround()) && (!this.isJumping))));

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

	public double descentSpeed() {
		return -0.035D;
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
	public void travel(float strafe, float vertical, float forward) {
		float f4;
		if (this.isServerWorld()) {

			double yy = this.posY + Math.max((this.getSwimHeight() - 0.2), 0.1);
			BlockPos posEyes = new BlockPos(this.posX, yy, this.posZ);

			if (this.isReallyInWater() &&
					(world.getBlockState(posEyes).getMaterial() == Material.WATER
							|| world.getBlockState(posEyes).getMaterial() == Material.LAVA
							|| world.getBlockState(posEyes).getMaterial() == MaterialResin.RESIN
							|| world.getBlockState(posEyes).getMaterial() == MaterialLatex.LATEX)
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
						this.motionY = 0.2D * this.getClimbSpeed();
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
									if (this.getIsLaunching()) {
										this.motionY = 0.045D;
									}
									else {
										this.motionY = this.descentSpeed();
									}
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
		public GlideMoveHelper(EntityPrehistoricFloraLandClimbingGlidingBase glider) {
			super(glider);
			this.speed = EntityPrehistoricFloraLandClimbingGlidingBase.this.getAIMoveSpeed();
		}

		public void onUpdateMoveHelper() {
			if (this.action == Action.MOVE_TO) {

				double d0 = this.posX - EntityPrehistoricFloraLandClimbingGlidingBase.this.posX;
				double d1 = this.posY - EntityPrehistoricFloraLandClimbingGlidingBase.this.posY;
				double d2 = this.posZ - EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ;
				double d3 = d0 * d0 + d1 * d1 + d2 * d2;
				d3 = MathHelper.sqrt(d3);

				if (d3 < EntityPrehistoricFloraLandClimbingGlidingBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
					this.action = Action.WAIT;
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionX *= 0.5D;
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionY *= 0.5D;
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionZ *= 0.5D;
				} else {
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionX += d0 / d3 * 0.1D * this.speed;
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionY += d1 / d3 * 0.1D * this.speed;
					EntityPrehistoricFloraLandClimbingGlidingBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

					if (EntityPrehistoricFloraLandClimbingGlidingBase.this.getAttackTarget() == null) {
						EntityPrehistoricFloraLandClimbingGlidingBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraLandClimbingGlidingBase.this.motionX, EntityPrehistoricFloraLandClimbingGlidingBase.this.motionZ)) * (180F / (float) Math.PI);
						EntityPrehistoricFloraLandClimbingGlidingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.rotationYaw;
					} else {
						double d4 = EntityPrehistoricFloraLandClimbingGlidingBase.this.getAttackTarget().posX - EntityPrehistoricFloraLandClimbingGlidingBase.this.posX;
						double d5 = EntityPrehistoricFloraLandClimbingGlidingBase.this.getAttackTarget().posZ - EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ;
						EntityPrehistoricFloraLandClimbingGlidingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
						EntityPrehistoricFloraLandClimbingGlidingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.rotationYaw;
					}
				}
			}
		}
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	public class GlideAI extends EntityAIBase {
		BlockPos target;

		public GlideAI() {
			this.setMutexBits(4);
		}

		public boolean shouldExecute() {
			if (!EntityPrehistoricFloraLandClimbingGlidingBase.this.getIsFlying()) {
				return false;
			}

			//if (EntityPrehistoricFloraWeigeltisaurus.this.getRNG().nextFloat() < 0.5F) {
				Path path = EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().getPath();
				if (
					((!EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().noPath())
						&& (!isDirectPathBetweenPoints(EntityPrehistoricFloraLandClimbingGlidingBase.this, EntityPrehistoricFloraLandClimbingGlidingBase.this.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
						||
						(path != null && path.getFinalPathPoint() != null
							&& (int)(path.getFinalPathPoint().y) == (int) EntityPrehistoricFloraLandClimbingGlidingBase.this.posY)
				)
				{
					EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().clearPath();
				}
				if (EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().noPath()) {
					BlockPos vec3 = this.findAirOrLandTarget();
					if (vec3 != null) {
						double Xoffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.posX - EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition().getX();
						double Zoffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ - EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition().getZ();

						EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().tryMoveToXYZ(vec3.getX() + Xoffset, EntityPrehistoricFloraLandClimbingGlidingBase.this.posY, vec3.getZ() + Zoffset, 0.3);

						return true;
					}
					else {
						int ii = rand.nextInt(4);
						//vec3 = EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition();
						//double Xoffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.posX - EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition().getX();
						//double Zoffset = EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ - EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition().getZ();


						switch (ii) {
							case 0:
								EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().tryMoveToXYZ(EntityPrehistoricFloraLandClimbingGlidingBase.this.posX + 1D, 0, EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ, 0.2);
								return true;
							case 1:
								EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().tryMoveToXYZ(EntityPrehistoricFloraLandClimbingGlidingBase.this.posX - 1D, 0, EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ, 0.2);
								return true;
							case 2:
								EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().tryMoveToXYZ(EntityPrehistoricFloraLandClimbingGlidingBase.this.posX, 0, EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ + 1D, 0.2);
								return true;
							case 3:
								EntityPrehistoricFloraLandClimbingGlidingBase.this.getNavigator().tryMoveToXYZ(EntityPrehistoricFloraLandClimbingGlidingBase.this.posX, 0, EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ - 1D, 0.2);
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
			Random rand = EntityPrehistoricFloraLandClimbingGlidingBase.this.getRNG();
			if (EntityPrehistoricFloraLandClimbingGlidingBase.this.getAttackTarget() == null) {
				for (int i = 0; i < 18; i++) {
					BlockPos randPos = EntityPrehistoricFloraLandClimbingGlidingBase.this.getPosition().add(rand.nextInt(9) - 4, 0, rand.nextInt(9) - 4);
					//System.err.println("Target " + randPos.getX() + " " + EntityPrehistoricFloraWeigeltisaurus.this.getPosition().getY() + " " + randPos.getZ());
					if (EntityPrehistoricFloraLandClimbingGlidingBase.this.world.getBlockState(randPos).getMaterial() != Material.LAVA && EntityPrehistoricFloraLandClimbingGlidingBase.this.isDirectPathBetweenPoints(EntityPrehistoricFloraLandClimbingGlidingBase.this.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
						if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
							//Check we won't land in a liquid:
							int ii = 0;
							boolean liquid = false;
							while (ii < 6) {
								if (randPos.getY() - ii >= 1) {
									IBlockState state = EntityPrehistoricFloraLandClimbingGlidingBase.this.world.getBlockState(randPos.down(ii));
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
									&& !(randPos.getX() == (int) EntityPrehistoricFloraLandClimbingGlidingBase.this.posX && randPos.getZ() == (int) EntityPrehistoricFloraLandClimbingGlidingBase.this.posZ) ) 	{
								return randPos;
							}
						}
					}
				}
			} else {
				BlockPos blockpos1;
				blockpos1 = new BlockPos(EntityPrehistoricFloraLandClimbingGlidingBase.this.getAttackTarget());
				if (EntityPrehistoricFloraLandClimbingGlidingBase.this.world.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
					return blockpos1;
				}
			}
			return null;
		}
	}

}