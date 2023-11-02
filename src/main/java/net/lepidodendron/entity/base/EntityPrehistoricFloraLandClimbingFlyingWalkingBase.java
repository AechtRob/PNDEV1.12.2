package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.util.MaterialLatex;
import net.lepidodendron.util.MaterialResin;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.*;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraLandClimbingFlyingWalkingBase extends EntityPrehistoricFloraLandBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.class, DataSerializers.OPTIONAL_BLOCK_POS);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.class, DataSerializers.FACING);
    private static final DataParameter<Boolean> HEADCOLLIDED = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Float> FLYPROGRESS = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.class, DataSerializers.FLOAT);

    public int sitCooldown = 0;

    //if it is descending, it will not land on the ground while the ticker is active
    public int sidewaysTries = 200;
    public int sitTickCt = 0;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    private int inPFLove;
    private int climbingpause;
    private BlockPos targetBlock;
    public Animation FLY_ANIMATION;
    public Animation UNFLY_ANIMATION;

    public EntityPrehistoricFloraLandClimbingFlyingWalkingBase(World world) {
        super(world);
        if (world != null) {
            this.selectNavigator();
            this.getNavigator().getNodeProcessor().setCanSwim(false);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        FLY_ANIMATION = Animation.create(this.flyTransitionLength());
        UNFLY_ANIMATION = Animation.create(this.unflyTransitionLength());
    }

    public abstract int flyTransitionLength();

    public abstract int unflyTransitionLength();

    public float headHitHeight() {
        return 0.55F;
    }

    /**how high the mob will fly above the highest block directly below it (may be top of the terrain)
     *
     * @return
     */
    public int flightHeight() {
        return 40; //default
    }

    /**if set to false, wont land on the sides of trees
     *
     * @return
     */
    public boolean canClimb() {
        return true; //default
    }

    /**if set to false, wont land on the ground
     *
     * @return
     */
    public boolean canWalk() {
        return true; //default
    }

    public boolean canFloat() {
        return false; //default
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, FLY_ANIMATION, UNFLY_ANIMATION};
    }

    @Override
    public AxisAlignedBB getAttackBoundingBox() {
        return this.getEntityBoundingBox().grow(0.5F, 2.0F, 0.5F);
    }

    public boolean isReallyFlying() {
        return this.isFlying() && this.getAnimation() != this.FLY_ANIMATION;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!world.isRemote) {
            if (this.motionX != 0 || this.motionZ != 0 || this.motionY != 0) {
                this.setIsMoving(true);
            } else {
                this.setIsMoving(false);
            }
        }
    }

    @Override
    public void selectNavigator() {
        if (this.getAttachmentFacing() == EnumFacing.UP) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                || (!(this.navigator instanceof PathNavigateGroundNoWater))) { //Is Walking:
                this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
            }
        }
        else if ((!this.isReallyFlying()) && (this.isSwimmingInWater() && this.canSwim())) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                    || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            }
        }
        else {
            if (this.getFlyTarget() != null) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase.FlyingMoveHelper))
                        || (!(this.navigator instanceof PathNavigateFlyingNoWater))) {
                    this.moveHelper = new EntityPrehistoricFloraLandClimbingFlyingWalkingBase.FlyingMoveHelper();
                    this.navigator = new PathNavigateFlyingNoWater(this, world);
                }
            }
            else {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase.FlightMoveHelper))
                        || (!(this.navigator instanceof PathNavigateFlyingNoWater))) {
                    this.moveHelper = new EntityPrehistoricFloraLandClimbingFlyingWalkingBase.FlightMoveHelper(this);
                    this.navigator = new PathNavigateFlyingNoWater(this, world);
                }
            }
        }
    }

    public void setFlyProgress(float flyprgress) {
        this.dataManager.set(FLYPROGRESS, flyprgress);
    }

    public float getFlyProgress() {
        return this.dataManager.get(FLYPROGRESS);
    }

    @Override
    public int animSpeedAdder() {
        if (this.getIsMoving() && (!this.getHeadCollided())
                && (!(this.getFlyProgress() != 0 && this.getAttachmentPos() == null))
                && this.getTicks() >= 0
        ) {
            return 1;
        }
        return 0;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setHeadCollided(false);
        this.climbingpause = -99 + rand.nextInt(200);
        return livingdata;
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(FLYPROGRESS, 0F);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
        this.dataManager.register(HEADCOLLIDED, false);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setHeadCollided(compound.getBoolean("headcollided"));
        this.climbingpause = compound.getInteger("climbingpause");
        this.dataManager.set(SIT_FACE, EnumFacing.byIndex(compound.getByte("SitFace")));
        this.sitCooldown = compound.getInteger("SitCooldown");
        this.sidewaysTries = compound.getInteger("sidewaysTries");
        this.setTickOffset(compound.getInteger("TickOffset"));
        this.sitTickCt = compound.getInteger("SitTickCt");
        if (compound.hasKey("PosX")) {
            int i = compound.getInteger("PosX");
            int j = compound.getInteger("PosY");
            int k = compound.getInteger("PosZ");
            this.dataManager.set(SIT_BLOCK_POS, Optional.of(new BlockPos(i, j, k)));
        } else {
            this.dataManager.set(SIT_BLOCK_POS, Optional.absent());
        }
        if (compound.hasKey("TargetPosX")) {
            int i = compound.getInteger("TargetPosX");
            int j = compound.getInteger("TargetPosY");
            int k = compound.getInteger("TargetPosZ");
            this.targetBlock = new BlockPos(i, j, k);
        } else {
            this.targetBlock = null;
        }
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("headcollided", this.getHeadCollided());
        compound.setInteger("climbingpause", climbingpause);
        compound.setBoolean("Sitting", this.isSitting);
        compound.setByte("SitFace", (byte) this.dataManager.get(SIT_FACE).getIndex());
        compound.setInteger("SitCooldown", sitCooldown);
        compound.setInteger("sidewaysTries", sidewaysTries);
        compound.setInteger("SitTickCt", sitTickCt);
        BlockPos blockpos1 = this.getAttachmentPos();
        if (blockpos1 != null) {
            compound.setInteger("PosX", blockpos1.getX());
            compound.setInteger("PosY", blockpos1.getY());
            compound.setInteger("PosZ", blockpos1.getZ());
        }
        BlockPos blockpos2 = this.getFlyTarget();
        if (blockpos2 != null) {
            compound.setInteger("TargetPosX", blockpos2.getX());
            compound.setInteger("TargetPosY", blockpos2.getY());
            compound.setInteger("TargetPosZ", blockpos2.getZ());
        }
    }

    public boolean getHeadCollided()
    {
        return this.dataManager.get(HEADCOLLIDED);
    }

    public void setHeadCollided(boolean collided)
    {
        this.dataManager.set(HEADCOLLIDED, collided);
    }

    /**
     * The speed at which the mob climbs up the side of a block
     * @return
     */
    public float getClimbSpeed() {
        return 0.01F;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    @Override
    public boolean isSitting() {
        if (world.isRemote) {
            boolean isSitting = this.dataManager.get(SITTING);
            if ((isSitting != this.isSitting)) {
                ticksSitted = 0;
            }
            this.isSitting = isSitting;
            return isSitting;
        }

        return isSitting;
    }

    @Override
    public void setSitting(boolean sitting) {
        this.dataManager.set(SITTING, sitting);
        if (!world.isRemote) {
            this.isSitting = sitting;
        }
    }

    public static BlockPos getPositionRelativetoGround(Entity entity, World world, double x, double z, Random rand) {
        BlockPos pos = new BlockPos(x, entity.posY, z);
        while ((world.getBlockState(pos.down()).getMaterial() != Material.WATER) && (world.getBlockState(pos.down()).getMaterial() != Material.LAVA) && world.isAirBlock(pos.down()) && pos.getY() > 0) {
            pos = pos.down();
        }
        return pos.up(2 + rand.nextInt(3));
    }

    /**
     * this override code allows us to change the eye height (red line on the hitbox)
     * @return
     */
    @Override
    public float getEyeHeight() {
        return 0.15F;
    }

    public EnumFacing getAttachmentFacing() {
        return this.dataManager.get(SIT_FACE);
    }

    @Override
    public BlockPos getPosition()
    {
        return new BlockPos(this.posX, this.posY + this.getEyeHeight(), this.posZ);
    }

    @Nullable
    public BlockPos getAttachmentPos() {
        return this.dataManager.get(SIT_BLOCK_POS).orNull();
    }

    public void setAttachmentPos(@Nullable BlockPos pos) {
        this.dataManager.set(SIT_BLOCK_POS, Optional.fromNullable(pos));
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float f) {
        if (ds == DamageSource.IN_WALL) {
            return false;
        }
        if (ds == DamageSource.FALL) {
            return false;
        }
        if (!this.world.isRemote && !this.isReallyFlying() && this.getAnimation() != this.FLY_ANIMATION)
        {
            this.setFlying();
            this.setAnimation(FLY_ANIMATION);
        }
        this.inPFLove = 0;
        return super.attackEntityFrom(ds, f);
    }

    public void setFlying() {
        if (!world.isRemote) {
            this.setSitting(false);
            this.sitTickCt = 0;
            ticksSitted = 0;
            sitCooldown = 500 + rand.nextInt(this.sitCooldownSetter());
            this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
            this.setAttachmentPos(null);
        }
    }

    @Override
    public boolean canBreatheUnderwater() {
        if (this.getAttackTarget() != null) {
            return (this.world.getBlockState(this.getAttackTarget().getPosition()).getMaterial() == Material.WATER);
        }
        return false;
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
    public void onLivingUpdate() {

        if (this.getFlyTarget() != null) {
            if (this.isReallyFlying() && this.motionY < 0.0D && this.sitCooldown > 0) {
                this.motionY *= 0.6D;
            }

            if (this.isReallyFlying()) {
                float angle = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                float rotation = MathHelper.wrapDegrees(angle - this.rotationYaw);
                this.prevRotationYaw = this.rotationYaw;
                this.rotationYaw += rotation;
                //this.renderYawOffset = this.rotationYaw;
            }

            if (this.isReallyFlying() && getAttackTarget() == null) {
                if (this.getFlyTarget() != null && this.isReallyFlying()) {
                    if (!isTargetInAir() || !this.isReallyFlying()) {
                        this.setFlyTarget(null);
                    }
                    setTargetedFlight();
                }
            } else if (getAttackTarget() != null) {
                setTargetedFlight();
            }
        }


        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.getLaying()) {
            this.setFlying();
        }

        if (this.inPFLove > 0) {
            --this.inPFLove;
        }

        if (!world.isRemote) {
            if (this.getMateable() < 0) {
                this.setMateable(this.getMateable() + 1);
            }
        }

        if (!this.world.isRemote) {
            this.fallDistance = 0;
        }

        if (this.isSitting()) {
            ticksSitted++;
        }

        if (!world.isRemote && !this.isInWater() && !this.isBeingRidden() && !this.isSitting() && this.getRNG().nextInt(1000) == 1 && (this.getAnimation() == NO_ANIMATION)) {
            this.setSitting(true);
            ticksSitted = 0;
        }

        if (!world.isRemote && !this.isInWater() && (this.isSitting() && ticksSitted > 100 && this.getRNG().nextInt(100) == 1)) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        if (!world.isRemote) {
            if (this.isInWater()) {
                this.setSitting(false);
                ticksSitted = 0;
            }
        }

        boolean flying = isReallyFlying();
        if (sitCooldown > 0) {
            sitCooldown--;
        }

        if (!world.isRemote) {
            if ((!world.isAirBlock(new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up()))
                    && !world.getBlockState(new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up()).getBlock().isPassable(world, new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up())
                    && this.posY % 1 > this.headHitHeight()) {
                //System.err.println("Is collided at head");
                this.setHeadCollided(true);
            } else {
                this.setHeadCollided(false);
            }

            if (this.getAttachmentPos() == null) {
                sitTickCt = 0;
                if (collided && sitCooldown == 0) {
                    sitCooldown = 5;
                    //Are we on the ground?
                    if (this.onGround && this.canWalk()) {
                        if (world.isSideSolid(this.getPosition().down(), EnumFacing.UP)) {
                            this.setAttachmentPos(this.getPosition().down());
                            this.dataManager.set(SIT_FACE, EnumFacing.UP);
                            this.setAnimation(UNFLY_ANIMATION);
                        }
                    }
                    else if (this.canClimb()) {
                        Vec3d vec3d = this.getPositionEyes(0);
                        Vec3d vec3d1 = this.getLook(0);
                        Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
                        RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
                        if (rayTrace != null && rayTrace.hitVec != null) {
                            BlockPos sidePos = rayTrace.getBlockPos();
                            if (world.isSideSolid(sidePos, rayTrace.sideHit) && rayTrace.sideHit != EnumFacing.DOWN) {
                                this.setAttachmentPos(sidePos);
                                this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                                this.motionX = 0.0D;
                                this.motionY = 0.0D;
                                this.motionZ = 0.0D;
                            }
                        }
                    }
                }
            } else {
                BlockPos pos = this.getAttachmentPos();
                if (this.getAttachmentFacing() == EnumFacing.UP) {
                    //It is walking:
                    sitTickCt++;
                    sitCooldown = 150;

                }
                else if (world.isSideSolid(pos, this.getAttachmentFacing())) {
                    sitTickCt++;
                    sitCooldown = 150;
                    if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                        rotationYaw = 180;
                    } else if (this.getAttachmentFacing() == EnumFacing.EAST) {
                        rotationYaw = 270;
                    } else if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                        rotationYaw = 0;
                    } else if (this.getAttachmentFacing() == EnumFacing.WEST) {
                        rotationYaw = 90;
                    }
                    if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                        this.posZ = this.getPosition().getZ() + ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                        this.posZ = this.getPosition().getZ() + 1 - ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.WEST) {
                        this.posX = this.getPosition().getX() + ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.EAST) {
                        this.posX = this.getPosition().getX() + 1 - ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    this.setAttachmentPos(this.getPosition().offset(this.getAttachmentFacing()));
                    if (this.climbingpause < 0 && !this.getHeadCollided()) {
                        this.motionY = this.getClimbSpeed();
                        //this.setIsMoving(true);
                    } else {
                        this.motionY = 0;
                        //this.setIsMoving(false);
                    }
                    this.motionX = 0.0D;
                    this.motionZ = 0.0D;
                } else {
                    this.setFlying();
                }
            }

            if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0 || this.getAttachmentPos() != null && (this.getAttackTarget() != null || this.getEatTarget() != null)) {
                if (checkFlyConditions() || rand.nextInt(3000) == 0) {
                    this.setFlying();
                    this.setAnimation(FLY_ANIMATION);
                }
            }
            if (flying && getFlyProgress() < 20.0F) {
                setFlyProgress(getFlyProgress() + 0.5F);
                if (sitProgress != 0)
                    sitProgress = 0F;
            } else if (!flying && getFlyProgress() > 0.0F) {
                setFlyProgress(getFlyProgress() - 0.5F);
                if (sitProgress != 0)
                    sitProgress = 0F;
            }

            if (this.getAttachmentPos() == null) {
                //Entity eatTarget = this.getEatTarget();
                //if (eatTarget != null) {
                //    if (eatTarget.posY > this.posZ) {
                //        this.motionY += 0.08D;
                //    }
                //}
                //else {
                if (this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER
                        || this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.LAVA) {
                    if (this.getAttackTarget() != null) {
                        if (this.world.getBlockState(this.getAttackTarget().getPosition()).getMaterial() != Material.WATER) {
                            this.motionY += 0.12D;
                        }
                    }
                    else {
                        this.motionY += 0.12D;
                    }
                } else {
                    if ((!collided) && sitCooldown == 0 && (!(sidewaysTries > 0))) {
                        //Have we tried to land sideways first?
                        this.motionY -= 0.12D;
                    }
                }
                if (sitCooldown == 0) {
                    sidewaysTries --;
                }
                else {
                    sidewaysTries = 200; //10 seconds to land sideways before it just goes to the ground
                }
                //}
            } else {
                if (this.getAttachmentFacing() != EnumFacing.UP) {
                    this.moveHelper.action = EntityMoveHelper.Action.WAIT;
                }
            }
            if (flying && this.ticksExisted % 20 == 0 && !world.isRemote && this.getAttachmentPos() == null && this.FlightSound() != null) {
                this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
                        .getObject(this.FlightSound()), this.getSoundVolume() * 0.5F, 1);
            }

            if (this.climbingpause >= -100) {
                this.climbingpause = this.climbingpause - this.rand.nextInt(3);
            }
            if (this.climbingpause < -100) {
                this.climbingpause = 100;
            }
        }

        if (world.isRemote && this.getAttachmentPos() != null) {
            if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                rotationYaw = 180;
            } else if (this.getAttachmentFacing() == EnumFacing.EAST) {
                rotationYaw = 270;
            } else if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                rotationYaw = 0;
            } else if (this.getAttachmentFacing() == EnumFacing.WEST) {
                rotationYaw = 90;
            }
        }
    }

    public boolean checkFlyConditions() {
        return true;
    }

    public int sitTickCtMax() {
        return 1150;
    }

    /**
     * How long the mob flies for, when at 0, it tries to land
     * @return
     */
    public int sitCooldownSetter() {
        return 1000 + rand.nextInt(1500);
    }

    @Override
    public boolean isMovementBlocked() {
        boolean walking = false;
        if (this.getAttachmentPos() != null) {
            walking = this.getAttachmentFacing() == EnumFacing.UP;
        }
        return this.getHealth() <= 0.0F
                || ((this.getAttachmentPos() != null
                || this.collidedHorizontally) && !walking);
    }

    public ResourceLocation FlightSound() {
        return null;
    }

    public boolean isFlying() {
        return this.getAttachmentPos() == null;
    }

    public boolean isDirectPathBetweenPoints(Vec3d target) {
        RayTraceResult rayTrace = world.rayTraceBlocks(this.getPositionVector().add(0, -0.25, 0), target, true);
        if (rayTrace != null && rayTrace.hitVec != null) {
            BlockPos sidePos = rayTrace.getBlockPos();
            BlockPos pos = new BlockPos(rayTrace.hitVec);
            if (!world.isAirBlock(pos) || !world.isAirBlock(sidePos)) {
                return true;
            } else {
                return rayTrace.typeOfHit != RayTraceResult.Type.MISS;
            }
        }
        return true;
    }

    public boolean isAboveOrInWater() {
        return this.isInWater() || this.isReallyInWater() || this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        float f4;
        if (this.isServerWorld()) {
            if (this.isReallyFlying()) {

                if ((!this.canFloat()) && this.isAboveOrInWater())
                {
                    if (this.getAttackTarget() != null) {
                        if (this.world.getBlockState(this.getAttackTarget().getPosition()).getMaterial() != Material.WATER) {
                            this.setFlying();
                        }
                    }
                }

                this.moveRelative(strafe, vertical, forward, 0.02F);
                float f = 0.91F;

                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
                this.motionX *= (double)f;
                this.motionY *= (double)f;
                this.motionZ *= (double)f;
            }
            else if (isInWater()) {
                this.moveRelative(strafe, vertical, forward, 0.1F);
                f4 = 0.8F;
                float speedModifier = (float) EnchantmentHelper.getDepthStriderModifier(this);
                if (speedModifier > 3.0F) {
                    speedModifier = 3.0F;
                }
                if (!this.onGround) {
                    speedModifier *= 0.5F;
                }
                if (speedModifier > 0.0F) {
                    f4 += (0.54600006F - f4) * speedModifier / 3.0F;
                }
                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
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

        if (!world.isRemote) {
            if (this.getAttachmentPos() != null && this.climbingpause < 0 && !this.getHeadCollided()) {
                if (this.getAttachmentFacing() != EnumFacing.UP) {
                    this.motionY = this.getClimbSpeed();
                }
            }
            else {
                if (this.getAttachmentFacing() != EnumFacing.UP) {
                    this.motionY = 0;
                }
            }
        }

        if (!world.isRemote) {
            if (this.motionX != 0 || this.motionZ != 0 || this.motionY != 0) {
                this.setIsMoving(true);
            } else {
                this.setIsMoving(false);
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



    public class FlightMoveHelper extends EntityMoveHelper {
        public FlightMoveHelper(EntityPrehistoricFloraLandClimbingFlyingWalkingBase insect) {
            super(insect);
            this.speed = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getAISpeedLand();

        }

        public void onUpdateMoveHelper() {
            if (this.action == Action.MOVE_TO) {
                if (EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.collidedHorizontally) {
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw += 180.0F;
                    this.speed = 0.1F;
                    BlockPos target = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.getPositionRelativetoGround(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this, EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.world, EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posX + EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posZ + EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rand);
                    this.posX = target.getX();
                    this.posY = target.getY();
                    this.posZ = target.getZ();
                }
                double d0 = this.posX - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posX;
                double d1 = this.posY - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posY;
                double d2 = this.posZ - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = MathHelper.sqrt(d3);

                if (d3 < EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = Action.WAIT;
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionX *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionY *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionZ *= 0.5D;
                } else {
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionX += d0 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionY += d1 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

                    if (EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getAttackTarget() == null && EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getEatTarget() == null) {
                        EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionX, EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.motionZ)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw;
                    } else {
                        if (EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getEatTarget() != null) {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getEatTarget().posX - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getEatTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw;
                        }
                        else {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getAttackTarget().posX - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.getAttackTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this.rotationYaw;
                        }
                    }
                }
            }
        }
    }

    public class FlyingMoveHelper extends EntityMoveHelper {

        public FlyingMoveHelper()
        {
            super(EntityPrehistoricFloraLandClimbingFlyingWalkingBase.this);
        }

    }

    public class AgeableClimbingFlyingWalkingFlyHigh extends EntityAIBase {

        private final EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier;

        public AgeableClimbingFlyingWalkingFlyHigh(EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier) {
            this.flier = flier;
        }

        @Override
        public boolean shouldExecute() {
            IBlockState state = flier.world.getBlockState(flier.getPosition().down());
            if (!flier.isReallyFlying() || flier.getLaying() || !(flier.sitCooldown > 0)
            ) {
                flier.setFlyTarget(null);
                return false;
            }

            if (flier.getFlyTarget() != null && (flier.getDistanceSquared(new Vec3d(flier.getFlyTarget().getX(), flier.posY, flier.getFlyTarget().getZ())) > 3 || EntityPrehistoricFloraLandClimbingFlyingWalkingBase.isTargetBlocked(flier, new Vec3d(flier.getFlyTarget())))) {
                flier.setFlyTarget(null);
            }

            if (flier.getEatTarget() != null) {
                flier.setFlyTarget(flier.getEatTarget().getPosition());
            }

            if (flier.getFlyTarget() == null) {
                BlockPos randPos = null;
                randPos = this.getAirTarget();

                if (randPos == null) {
                    return false;
                }
                else {
                    flier.setFlyTarget(randPos);
                    return true;
                }
            }
            else {
                return (flier.getFlyTarget() != null); //is not null
            }
        }

        @Override
        public boolean shouldContinueExecuting() {
            return flier.getFlyTarget() != null && !EntityPrehistoricFloraLandClimbingFlyingWalkingBase.isTargetBlocked(flier, new Vec3d(flier.getFlyTarget()));
        }

        @Nullable
        public BlockPos getAirTarget() {
            if (flier.getAttackTarget() == null) {
                return getFlyTarget();
            }
            else {
                BlockPos pos = new BlockPos((int) flier.getAttackTarget().posX, (int) flier.getAttackTarget().posY, (int) flier.getAttackTarget().posZ);
                if (flier.world.getBlockState(pos).getMaterial() == Material.AIR) {
                    return pos;
                }
            }
            return flier.getPosition();
        }

        @Nullable
        public BlockPos getFlyTarget(){
            BlockPos pos = null;
            for (int i = 0; i < 24; i++) {
                pos = getInterimBlockTarget(flier);
                if (pos != null) {
                    BlockPos ground = flier.world.getHeight(new BlockPos(pos.getX(), 0, pos.getZ()));
                    pos = new BlockPos(pos.getX(), Math.min(pos.getY(), ground.getY() + flightHeight() + flier.rand.nextInt(5) - 2), pos.getZ());
                    if (flier.world.getBlockState(pos).getMaterial() == Material.AIR
                            && !isTargetBlocked(flier, new Vec3d(pos))) {
                        return pos;
                    }
                }
            }
            return pos;
        }

    }

    @Nullable
    public BlockPos getFlyTarget() {
        return this.targetBlock;
    }

    public void setFlyTarget(@Nullable BlockPos pos) {
        this.targetBlock = pos;
    }

    public float getDistanceSquared(Vec3d vec) {
        float f = (float) (this.posX - vec.x);
        float f1 = (float) (this.posY - vec.y);
        float f2 = (float) (this.posZ - vec.z);
        return f * f + f1 * f1 + f2 * f2;
    }

    public static BlockPos getInterimBlockTarget(EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier) {
        float f = flier.getRNG().nextBoolean() ? 1 : -1;
        float radius = 0.75F * (0.7F * 4) * -3 - flier.rand.nextInt(20);
        float angle = (0.01745329251F * flier.renderYawOffset) + 3.15F + (flier.rand.nextFloat() * f);
        double dX = radius * MathHelper.sin((float) (Math.PI + angle));
        double dZ = radius * MathHelper.cos(angle);
        BlockPos pos = new BlockPos(flier.posX + dX, 0, flier.posZ + dZ);
        BlockPos ground = flier.world.getHeight(pos);
        int distFromGround = (int) flier.posY - ground.getY();
        BlockPos newPos = pos.up(distFromGround < flier.flightHeight() ? (int) Math.min(255, flier.posY + flier.rand.nextInt(25) - 8) : (int) flier.posY - flier.rand.nextInt(3) - 1);
        if (flier.isReallyFlying()) { //Try to make them descend
            if (flier.sitCooldown == 0) {
                if (isBlockEmptyForAI(flier.world, newPos.down())) {
                    newPos = newPos.down();
                }
            }
        }
        if (!isTargetBlocked(flier, new Vec3d(newPos)) && flier.getDistanceSqToCenter(newPos) > 6) {
            return newPos;
        }
        return null;
    }

    public static boolean isTargetBlocked(Entity entity, Vec3d target) {
        if (target != null) {
            RayTraceResult rayTraceResult = entity.world.rayTraceBlocks(new Vec3d(entity.getPosition()), target, false);
            if (rayTraceResult != null && rayTraceResult.hitVec != null) {
                BlockPos side = rayTraceResult.getBlockPos();
                BlockPos pos = new BlockPos(rayTraceResult.hitVec);
                Block blockSide = entity.world.getBlockState(side).getBlock();
                Block blockPos = entity.world.getBlockState(pos).getBlock();
                //System.err.println("Is this block blocked? " + entity.world.getBlockState(pos).getBlock() + " " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
                //System.err.println("blocked " + (!entity.world.isAirBlock(pos) || !entity.world.isAirBlock(sidePos)));
                return (((!entity.world.isAirBlock(side)) && (!blockSide.isPassable(entity.world, side)))
                        || ((!entity.world.isAirBlock(pos)) && (!blockPos.isPassable(entity.world, pos))));
            }
        }
        return false;
    }

    public void setTargetedFlight() {
        double bbLength = this.getEntityBoundingBox().getAverageEdgeLength() * 2.5D;
        double maxDist = Math.max(6, bbLength * bbLength);
        if (this.getFlyTarget() != null && isTargetInAir() && this.isReallyFlying()) {
            if (this.getDistanceSquared(new Vec3d(this.getFlyTarget().getX() + 0.5D, this.getFlyTarget().getY() + 0.5D, this.getFlyTarget().getZ() + 0.5D)) > maxDist){
                double xPos = this.getFlyTarget().getX() + 0.5D - posX;
                double yPos = Math.min(this.getFlyTarget().getY(), 256) + 1D - posY;
                double zPos = this.getFlyTarget().getZ() + 0.5D - posZ;
                motionX += (Math.signum(xPos) * 0.5D - motionX) * 0.1 * this.getAISpeedLand();
                motionY += (Math.signum(yPos) * 0.5D - motionY) * 0.2;
                motionZ += (Math.signum(zPos) * 0.5D - motionZ) * 0.1 * this.getAISpeedLand();
                float angle = (float) (Math.atan2(motionZ, motionX) * 180.0D / Math.PI) - 90.0F;
                float rotation = MathHelper.wrapDegrees(angle - rotationYaw);
                moveForward = (float) this.getAISpeedLand();
                prevRotationYaw = rotationYaw;
                rotationYaw += rotation;
                //renderYawOffset = rotationYaw;
            }
            else {
                this.setFlyTarget(null);
            }
        }
        else {
            this.setFlyTarget(null);
        }
        if (this.collidedHorizontally) {
            this.setFlyTarget(null);
        }
    }

    public static boolean isBlockEmptyForAI(World world, BlockPos pos) {
        if (world.isAirBlock(pos)) {
            return true;
        }
        if (world.getBlockState(pos).getMaterial() == Material.VINE
                || world.getBlockState(pos).getMaterial() == Material.WEB
                || world.getBlockState(pos).getMaterial() == Material.PLANTS) {
            return true;
        }
        return ((world.getBlockState(pos).getBlock().isPassable(world, pos)) || (world.getBlockState(pos).getBlockFaceShape(world, pos, EnumFacing.UP) == BlockFaceShape.SOLID));
    }

    protected boolean isTargetInAir() {
        return this.getFlyTarget() != null && ((world.getBlockState(this.getFlyTarget()).getMaterial() == Material.AIR) || (world.getBlockState(this.getFlyTarget()).getBlock().isPassable(world, this.getFlyTarget())
                && (world.getBlockState(this.getFlyTarget()).getMaterial() != Material.WATER)
                && (world.getBlockState(this.getFlyTarget()).getMaterial() != Material.LAVA)
                && (world.getBlockState(this.getFlyTarget()).getMaterial() != MaterialResin.RESIN)
                && (world.getBlockState(this.getFlyTarget()).getMaterial() != MaterialLatex.LATEX)
                && (!(world.getBlockState(this.getFlyTarget()).getBlock() instanceof BlockFluidBase))
            )
        );
    }
    
}