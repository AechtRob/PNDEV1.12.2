//package net.lepidodendron.entity.base;
//
//import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
//import net.ilexiconn.llibrary.server.animation.Animation;
//import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
//import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
//import net.lepidodendron.util.MaterialLatex;
//import net.lepidodendron.util.MaterialResin;
//import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.BlockFaceShape;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.enchantment.EnchantmentHelper;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.IEntityLivingData;
//import net.minecraft.entity.MoverType;
//import net.minecraft.entity.ai.EntityAIBase;
//import net.minecraft.entity.ai.EntityMoveHelper;
//import net.minecraft.init.MobEffects;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.network.datasync.DataParameter;
//import net.minecraft.network.datasync.DataSerializers;
//import net.minecraft.network.datasync.EntityDataManager;
//import net.minecraft.pathfinding.PathNavigateFlying;
//import net.minecraft.util.DamageSource;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.util.math.RayTraceResult;
//import net.minecraft.util.math.Vec3d;
//import net.minecraft.world.DifficultyInstance;
//import net.minecraft.world.World;
//import net.minecraftforge.fluids.BlockFluidBase;
//import net.minecraftforge.fml.common.FMLCommonHandler;
//
//import javax.annotation.Nullable;
//
//public abstract class EntityPrehistoricFloraAgeableFlyingBase extends EntityPrehistoricFloraLandBase {
//
//    private int flyTick;
//    private int walkTick;
//    public Animation FLY_ANIMATION;
//    public Animation UNFLY_ANIMATION;
//    private BlockPos targetBlock;
//    private int inPFLove;
//    private int jumpTicks;
//
//    private static final DataParameter<Boolean> FLYING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableFlyingBase.class, DataSerializers.BOOLEAN);
//
//    public EntityPrehistoricFloraAgeableFlyingBase(World world) {
//        super(world);
//        if (world != null) {
//            this.selectNavigator();
//        }
//        if (FMLCommonHandler.instance().getSide().isClient()) {
//            this.chainBuffer = new ChainBuffer();
//        }
//        FLY_ANIMATION = Animation.create(this.flyTransitionLength());
//        UNFLY_ANIMATION = Animation.create(this.unflyTransitionLength());
//    }
//
//    @Override
//    public Animation[] getAnimations() {
//        return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, FLY_ANIMATION, UNFLY_ANIMATION};
//    }
//
//    public int flightHeight() {
//        return 40; //default
//    }
//
//    protected abstract double getAISpeedFly();
//
//    public abstract boolean canFloat();
//
//    public abstract int flyTransitionLength();
//
//    public abstract int unflyTransitionLength();
//
//    public abstract int flyLength();
//
//    public abstract int walkLength();
//
//    public boolean getIsFlying() {
//        return this.dataManager.get(FLYING);
//    }
//
//    public void setIsFlying(boolean isFlying) {
//        this.dataManager.set(FLYING, isFlying);
//    }
//
//    @Nullable
//    public BlockPos getFlyTarget() {
//        return this.targetBlock;
//    }
//
//    public void setFlyTarget(@Nullable BlockPos pos) {
//        this.targetBlock = pos;
//    }
//
//    @Override
//    protected void entityInit() {
//        super.entityInit();
//        this.dataManager.register(FLYING, false);
//        this.setScaleForAge(false);
//    }
//
//    @Override
//    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
//        livingdata = super.onInitialSpawn(difficulty, livingdata);
//        this.setIsFlying(false);
//        this.flyTick = 0;
//        this.walkTick = this.rand.nextInt(this.walkLength() + 1);
//        return livingdata;
//    }
//
//    public void writeEntityToNBT(NBTTagCompound compound)
//    {
//        super.writeEntityToNBT(compound);
//        compound.setBoolean("pfflying", this.getIsFlying());
//        compound.setInteger("pfflytick", this.flyTick);
//        compound.setInteger("pfwalktick", this.walkTick);
//        BlockPos blockpos = this.getFlyTarget();
//        if (blockpos != null) {
//            compound.setInteger("TargetPosX", blockpos.getX());
//            compound.setInteger("TargetPosY", blockpos.getY());
//            compound.setInteger("TargetPosZ", blockpos.getZ());
//        }
//    }
//
//    public void readEntityFromNBT(NBTTagCompound compound) {
//        super.readEntityFromNBT(compound);
//        this.setIsFlying(compound.getBoolean("pfflying"));
//        this.flyTick = compound.getInteger("pfflytick");
//        this.walkTick = compound.getInteger("pfwalktick");
//        if (compound.hasKey("TargetPosX")) {
//            int i = compound.getInteger("TargetPosX");
//            int j = compound.getInteger("TargetPosY");
//            int k = compound.getInteger("TargetPosZ");
//            this.targetBlock = new BlockPos(i, j, k);
//        } else {
//            this.targetBlock = null;
//        }
//    }
//
//    @Override
//    public float getEyeHeight() {
//        return 0.15F;
//    }
//
//    @Override
//    public void selectNavigator () {
//        if (this.isReallyFlying()) {
//            if ((!(this.moveHelper instanceof EntityPrehistoricFloraAgeableFlyingBase.FlyingMoveHelper))
//                    || (!(this.navigator instanceof PathNavigateFlying))) {
//                this.moveHelper = new EntityPrehistoricFloraAgeableFlyingBase.FlyingMoveHelper();
//                this.navigator = new PathNavigateFlying(this, world);
//            }
//        }
//
//        else if (this.isSwimmingInWater() && (this.canSwim() || this.canFloat())) {
//            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
//                    || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
//                this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
//                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
//            }
//        }
//
//        else if ((!this.isSwimmingInWater()) || ((!this.canSwim()) && (!this.canFloat()))) {
//            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
//                    || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
//                this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
//                this.navigator = new PathNavigateGroundNoWater(this, world);
//            }
//        }
//    }
//
//    public int getFlyTick() {
//        return this.flyTick;
//    }
//
//    public int getWalkTick() {
//        return this.walkTick;
//    }
//
//    public boolean isReallyFlying() {
//        return this.getIsFlying() && this.getAnimation() != this.FLY_ANIMATION;
//    }
//
//    @Override
//    public boolean attackEntityFrom(DamageSource source, float amount)
//    {
//        if (!this.world.isRemote && !this.isReallyFlying())
//        {
//            this.setIsFlying(true);
//            this.setAnimation(FLY_ANIMATION);
//            this.flyTick = this.flyLength() + this.FLY_ANIMATION.getDuration();
//        }
//
//        return super.attackEntityFrom(source, amount);
//    }
//
//    public void onEntityUpdate() {
//        super.onEntityUpdate();
//
//        if (!world.isRemote) {
//            if (this.flyTick > 0) {
//                this.flyTick = this.flyTick - this.rand.nextInt(3);
//                if (this.flyTick < 0) {
//                    this.flyTick = 0;
//                }
//            }
//            if (this.walkTick > 0) {
//                this.walkTick = this.walkTick - this.rand.nextInt(3);
//                if (this.walkTick < 0) {
//                    this.walkTick = 0;
//                }
//            }
//
//            //System.err.println("this.flyTick " + this.flyTick + " / " + this.flyLength());
//
//            //Is it hovering over a nest to lay in?
//            if (this.flyTick > 0 && this.getLaying() && this.getAnimation() != this.FLY_ANIMATION && this.getAnimation() != this.UNFLY_ANIMATION) {
//                if (this.isLayableNest(this.getEntityWorld(), this.getPosition())
//                        || this.isLayableNest(this.getEntityWorld(), this.getPosition().down())
//                        || this.isLayableNest(this.getEntityWorld(), this.getPosition().down(2))
//                        || this.isLayableNest(this.getEntityWorld(), this.getPosition().down(3))) {
//                    this.flyTick = 0;
//                    this.setIsFlying(false);
//                    this.setAnimation(UNFLY_ANIMATION);
//                    this.walkTick = this.walkLength() + this.UNFLY_ANIMATION.getDuration();
//                }
//            }
//
//            if (this.inPFLove > 0) {
//                this.flyTick = 0;
//            }
//
//            if (this.isAboveOrOnGround() && !this.isAboveOrInWater() && (!(this.flyTick > 0)) && this.getIsFlying()) {
//                this.setIsFlying(false);
//                this.setAnimation(UNFLY_ANIMATION);
//                this.walkTick = this.walkLength() + this.UNFLY_ANIMATION.getDuration();
//            }
//            else if (this.canFloat() && this.isAboveOrInWater() && (!(this.flyTick > 0)) && this.getIsFlying()) {
//                this.setIsFlying(false);
//                this.setAnimation(UNFLY_ANIMATION);
//                this.walkTick = this.walkLength() + this.UNFLY_ANIMATION.getDuration();
//            }
//            else if (!this.canFloat() && this.isAboveOrInWater() && this.getIsFlying()) {
//                this.flyTick = this.flyTick + 200; //Stop them drowning or getting stuck in water
//                this.motionY *= 0.6D;
//            }
//            else if (!this.canFloat() && this.isInWater()) {
//                this.setIsFlying(true);
//                this.flyTick = this.flyLength();
//                this.motionY *= 0.6D;
//            }
//
//            if (!this.isAboveOrOnGround() && !this.isAboveOrInWater() && !this.getIsFlying() && !this.isJumping
//                    && this.getAnimation() != this.FLY_ANIMATION && this.getAnimation() != this.UNFLY_ANIMATION) {
//                this.setIsFlying(true);
//                this.setAnimation(FLY_ANIMATION);
//                this.walkTick = 0;
//                this.flyTick = rand.nextInt(this.flyLength()) + 1 + this.FLY_ANIMATION.getDuration();
//                //Sets it in flight as the ground has fallen from under it, though not a full flight
//            }
//            else if ((!(this.walkTick > 0)) && !this.getIsFlying()) {
//                this.setIsFlying(true);
//                this.setAnimation(FLY_ANIMATION);
//                this.flyTick = this.flyLength() + this.FLY_ANIMATION.getDuration();
//            }
//        }
//
//    }
//
//    @Override
//    public void onLivingUpdate() {
//        if (this.isReallyFlying() && this.motionY < 0.0D && (!(this.getFlyTick() > 0)))
//        {
//            this.motionY *= 0.6D;
//        }
//
//        if (this.isReallyFlying()) {
//            float angle = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
//            float rotation = MathHelper.wrapDegrees(angle - this.rotationYaw);
//            this.prevRotationYaw = this.rotationYaw;
//            this.rotationYaw += rotation;
//            //this.renderYawOffset = this.rotationYaw;
//        }
//
//        if (this.isReallyFlying() && getAttackTarget() == null) {
//            if (this.getFlyTarget() != null && this.isReallyFlying()) {
//                if (!isTargetInAir() || !this.isReallyFlying()) {
//                    this.setFlyTarget(null);
//                }
//                setTargetedFlight();
//            }
//        }
//        else if (getAttackTarget() != null) {
//            setTargetedFlight();
//        }
//
//        super.onLivingUpdate();
//
//    }
//
//    protected boolean isTargetInAir() {
//        return this.getFlyTarget() != null && ((world.getBlockState(this.getFlyTarget()).getMaterial() == Material.AIR) || (world.getBlockState(this.getFlyTarget()).getBlock().isPassable(world, this.getFlyTarget())
//                && (world.getBlockState(this.getFlyTarget()).getMaterial() != Material.WATER)
//                && (world.getBlockState(this.getFlyTarget()).getMaterial() != Material.LAVA)
//                && (world.getBlockState(this.getFlyTarget()).getMaterial() != MaterialResin.RESIN)
//                && (world.getBlockState(this.getFlyTarget()).getMaterial() != MaterialLatex.LATEX)
//                && (!(world.getBlockState(this.getFlyTarget()).getBlock() instanceof BlockFluidBase))
//            )
//        );
//    }
//
//    public float getDistanceSquared(Vec3d vec) {
//        float f = (float) (this.posX - vec.x);
//        float f1 = (float) (this.posY - vec.y);
//        float f2 = (float) (this.posZ - vec.z);
//        return f * f + f1 * f1 + f2 * f2;
//    }
//
//    public static BlockPos getInterimBlockTarget(EntityPrehistoricFloraAgeableFlyingBase flier) {
//        float f = flier.getRNG().nextBoolean() ? 1 : -1;
//        float radius = 0.75F * (0.7F * 4) * -3 - flier.rand.nextInt(20);
//        float angle = (0.01745329251F * flier.renderYawOffset) + 3.15F + (flier.rand.nextFloat() * f);
//        double dX = radius * MathHelper.sin((float) (Math.PI + angle));
//        double dZ = radius * MathHelper.cos(angle);
//        BlockPos pos = new BlockPos(flier.posX + dX, 0, flier.posZ + dZ);
//        BlockPos ground = flier.world.getHeight(pos);
//        int distFromGround = (int) flier.posY - ground.getY();
//        BlockPos newPos = pos.up(distFromGround < flier.flightHeight() ? (int) Math.min(255, flier.posY + flier.rand.nextInt(25) - 8) : (int) flier.posY - flier.rand.nextInt(3) - 1);
//        if (flier.getIsFlying()) { //Try to make them descend
//            if ((double)flier.getFlyTick() < ((double)flier.flyLength() * 0.05)) {
//                if (isBlockEmptyForAI(flier.world, newPos.down())) {
//                    newPos = newPos.down();
//                }
//            }
//        }
//        if (!isTargetBlocked(flier, new Vec3d(newPos)) && flier.getDistanceSqToCenter(newPos) > 6) {
//            return newPos;
//        }
//        return null;
//    }
//
//    public static boolean isTargetBlocked(Entity entity, Vec3d target) {
//        if (target != null) {
//            RayTraceResult rayTraceResult = entity.world.rayTraceBlocks(new Vec3d(entity.getPosition()), target, false);
//            if (rayTraceResult != null && rayTraceResult.hitVec != null) {
//                BlockPos side = rayTraceResult.getBlockPos();
//                BlockPos pos = new BlockPos(rayTraceResult.hitVec);
//                Block blockSide = entity.world.getBlockState(side).getBlock();
//                Block blockPos = entity.world.getBlockState(pos).getBlock();
//                //System.err.println("Is this block blocked? " + entity.world.getBlockState(pos).getBlock() + " " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
//                //System.err.println("blocked " + (!entity.world.isAirBlock(pos) || !entity.world.isAirBlock(sidePos)));
//                return (((!entity.world.isAirBlock(side)) && (!blockSide.isPassable(entity.world, side)))
//                    || ((!entity.world.isAirBlock(pos)) && (!blockPos.isPassable(entity.world, pos))));
//            }
//        }
//        return false;
//    }
//
//    public void setTargetedFlight() {
//        double bbLength = this.getEntityBoundingBox().getAverageEdgeLength() * 2.5D;
//        double maxDist = Math.max(6, bbLength * bbLength);
//        if (this.getFlyTarget() != null && isTargetInAir() && this.isReallyFlying()) {
//            if (this.getDistanceSquared(new Vec3d(this.getFlyTarget().getX() + 0.5D, this.getFlyTarget().getY() + 0.5D, this.getFlyTarget().getZ() + 0.5D)) > maxDist){
//                double xPos = this.getFlyTarget().getX() + 0.5D - posX;
//                double yPos = Math.min(this.getFlyTarget().getY(), 256) + 1D - posY;
//                double zPos = this.getFlyTarget().getZ() + 0.5D - posZ;
//                motionX += (Math.signum(xPos) * 0.5D - motionX) * 0.1 * this.getAISpeedFly();
//                motionY += (Math.signum(yPos) * 0.5D - motionY) * 0.2;
//                motionZ += (Math.signum(zPos) * 0.5D - motionZ) * 0.1 * this.getAISpeedFly();
//                float angle = (float) (Math.atan2(motionZ, motionX) * 180.0D / Math.PI) - 90.0F;
//                float rotation = MathHelper.wrapDegrees(angle - rotationYaw);
//                moveForward = (float) this.getAISpeedFly();
//                prevRotationYaw = rotationYaw;
//                rotationYaw += rotation;
//                //renderYawOffset = rotationYaw;
//            }
//            else {
//                this.setFlyTarget(null);
//            }
//        }
//        else {
//            this.setFlyTarget(null);
//        }
//        if (this.collidedHorizontally) {
//            this.setFlyTarget(null);
//        }
//    }
//
//    public boolean isAboveOrInWater() {
//        return this.isInWater() || this.isReallyInWater() || this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER;
//    }
//
//    public boolean isAboveOrOnGround() {
//        IBlockState state = this.world.getBlockState(this.getPosition().down());
//        IBlockState state2 = this.world.getBlockState(this.getPosition().down(2));
//        return this.onGround || state.getBlockFaceShape(this.world, this.getPosition().down(), EnumFacing.UP) == BlockFaceShape.SOLID || state2.getBlockFaceShape(this.world, this.getPosition().down(2), EnumFacing.UP) == BlockFaceShape.SOLID;
//    }
//
//    @Override
//    public void fall(float distance, float damageMultiplier)
//    {
//    }
//
//    @Override
//    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos)
//    {
//    }
//
//    public static boolean isBlockEmptyForAI(World world, BlockPos pos) {
//        if (world.isAirBlock(pos)) {
//            return true;
//        }
//        if (world.getBlockState(pos).getMaterial() == Material.VINE
//                || world.getBlockState(pos).getMaterial() == Material.WEB
//                || world.getBlockState(pos).getMaterial() == Material.PLANTS) {
//            return true;
//        }
//        return ((world.getBlockState(pos).getBlock().isPassable(world, pos)) || (world.getBlockState(pos).getBlockFaceShape(world, pos, EnumFacing.UP) == BlockFaceShape.SOLID));
//    }
//
//    @Override
//    public boolean isOnLadder()
//    {
//        return false;
//    }
//
//    @Override
//    public void travel(float strafe, float vertical, float forward) {
//        float f4;
//        if (this.isServerWorld()) {
//
//            if (this.isReallyFlying() && this.getFlyTick() > 0) {
//
//                if ((!this.canFloat()) && this.isAboveOrInWater())
//                {
//                    this.motionY = 0.6D;
//                    this.flyTick = this.flyTick + 200;
//                }
//
//                this.moveRelative(strafe, vertical, forward, 0.02F);
//                float f = 0.91F;
//
//                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
//                this.motionX *= (double)f;
//                this.motionY *= (double)f;
//                this.motionZ *= (double)f;
//            }
//            else {
//                double yy = this.posY + Math.max((this.getSwimHeight() - 0.2), 0.1);
//                BlockPos posEyes = new BlockPos(this.posX, yy, this.posZ);
//
//                if (this.isReallyInWater() && this.canFloat() &&
//                        (world.getBlockState(posEyes).getMaterial() == Material.WATER
//                                || world.getBlockState(posEyes).getMaterial() == Material.LAVA
//                                || world.getBlockState(posEyes).getMaterial() == MaterialResin.RESIN)
//                ) {
//                    this.motionY = 0.2D;
//                }
//                if ((!this.canFloat()) && this.isAboveOrInWater())
//                {
//                    this.motionY = 0.6D;
//                    this.setIsFlying(true);
//                    this.flyTick = 200;
//                }
//
//                if (this.isReallyInWater()) { //Is in water
//                    //System.err.println("Is in water");
//                    this.moveRelative(strafe, vertical, forward, 0.1F);
//                    f4 = 0.8F;
//                    float speedModifier = (float) EnchantmentHelper.getDepthStriderModifier(this);
//                    if (speedModifier > 3.0F) {
//                        speedModifier = 3.0F;
//                    }
//
//                    BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);
//
//                    if (!this.onGround) {
//                        speedModifier *= 0.5F;
//                    }
//                    if (speedModifier > 0.0F) {
//                        f4 += (0.54600006F - f4) * speedModifier / 3.0F;
//                    }
//                    this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
//
//                    if (this.motionX != 0 || this.motionZ != 0) {
//                        this.setIsMoving(true);
//                    } else {
//                        this.setIsMoving(false);
//                    }
//
//                    this.motionX *= f4;
//                    this.motionX *= 0.9;
//                    this.motionY *= 0.9;
//                    this.motionY *= f4;
//                    this.motionZ *= 0.9;
//                    this.motionZ *= f4;
//                } else { //is not in water:
//                    if (!this.isInLava()) {
//                        float f6 = 0.91F;
//                        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);
//
//                        if (this.onGround) {
//                            IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos);
//                            f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
//                        }
//
//                        float f7 = 0.16277136F / (f6 * f6 * f6);
//                        float f8;
//
//                        if (this.onGround) {
//                            f8 = this.getAIMoveSpeed() * f7;
//                        } else {
//                            f8 = this.jumpMovementFactor;
//                        }
//
//                        this.moveRelative(strafe, vertical, forward, f8);
//                        f6 = 0.91F;
//
//                        if (this.onGround) {
//                            IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos.setPos(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ));
//                            f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
//                        }
//
//                        if (this.isOnLadder()) {
//                            float f9 = 0.15F;
//                            this.motionX = MathHelper.clamp(this.motionX, -0.15000000596046448D, 0.15000000596046448D);
//                            this.motionZ = MathHelper.clamp(this.motionZ, -0.15000000596046448D, 0.15000000596046448D);
//                            this.fallDistance = 0.0F;
//
//                            if (this.motionY < -0.15D) {
//                                this.motionY = -0.15D;
//                            }
//
//                        }
//
//                        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
//
//                        if (this.motionX != 0 || this.motionZ != 0) {
//                            this.setIsMoving(true);
//                        } else {
//                            this.setIsMoving(false);
//                        }
//
//                        if (this.collidedHorizontally && this.isOnLadder()) {
//                            this.motionY = 0.2D;
//                        }
//
//                        if (this.isPotionActive(MobEffects.LEVITATION)) {
//                            this.motionY += (0.05D * (double) (this.getActivePotionEffect(MobEffects.LEVITATION).getAmplifier() + 1) - this.motionY) * 0.2D;
//                        } else {
//                            blockpos$pooledmutableblockpos.setPos(this.posX, 0.0D, this.posZ);
//
//                            if (!this.world.isRemote || this.world.isBlockLoaded(blockpos$pooledmutableblockpos) && this.world.getChunk(blockpos$pooledmutableblockpos).isLoaded()) {
//                                if (!this.hasNoGravity()) {
//                                    this.motionY -= 0.08D;
//                                }
//                            } else if (this.posY > 0.0D) {
//                                this.motionY = -0.1D;
//                            } else {
//                                this.motionY = 0.0D;
//                            }
//                        }
//
//                        this.motionY *= 0.9800000190734863D;
//                        this.motionX *= (double) f6;
//                        this.motionZ *= (double) f6;
//                        blockpos$pooledmutableblockpos.release();
//
//                    } else //is in Lava
//                    {
//                        double d4 = this.posY;
//                        this.moveRelative(strafe, vertical, forward, 0.02F);
//                        this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
//
//                        this.motionX *= 0.5D;
//                        this.motionY *= 0.5D;
//                        this.motionZ *= 0.5D;
//
//                        if (!this.hasNoGravity()) {
//                            this.motionY -= 0.02D;
//                        }
//
//                        if (this.collidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d4, this.motionZ)) {
//                            this.motionY = 0.30000001192092896D;
//                        }
//                    }
//                }
//            }
//        }
//        this.prevLimbSwingAmount = this.limbSwingAmount;
//        double deltaX = this.posX - this.prevPosX;
//        double deltaZ = this.posZ - this.prevPosZ;
//        double deltaY = this.posY - this.prevPosY;
//        float delta = MathHelper.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ) * 4.0F;
//        if (delta > 1.0F) {
//            delta = 1.0F;
//        }
//        this.limbSwingAmount += (delta - this.limbSwingAmount) * 0.4F;
//        this.limbSwing += this.limbSwingAmount;
//    }
//
//    public class FlyingMoveHelper extends EntityMoveHelper {
//
//        public FlyingMoveHelper()
//        {
//            super(EntityPrehistoricFloraAgeableFlyingBase.this);
//        }
//
//    }
//
//    public class AgeableFlyingBaseWanderFly extends EntityAIBase {
//
//        private final EntityPrehistoricFloraAgeableFlyingBase flier;
//
//        public AgeableFlyingBaseWanderFly(EntityPrehistoricFloraAgeableFlyingBase flier) {
//            this.flier = flier;
//        }
//
//        @Override
//        public boolean shouldExecute() {
//            IBlockState state = flier.world.getBlockState(flier.getPosition().down());
//            if (!flier.isReallyFlying() || flier.getLaying()
//            ) {
//                return false;
//            }
//
//            if (flier.getFlyTick() > 0 && flier.getFlyTarget() != null && (flier.getDistanceSquared(new Vec3d(flier.getFlyTarget().getX(), flier.posY, flier.getFlyTarget().getZ())) > 3 || EntityPrehistoricFloraAgeableFlyingBase.isTargetBlocked(flier, new Vec3d(flier.getFlyTarget())))) {
//                flier.setFlyTarget(null);
//            }
//
//            if (flier.getEatTarget() != null) {
//                flier.setFlyTarget(flier.getEatTarget().getPosition());
//            }
//
//            if (!(flier.getFlyTick() > 0)) {
//                BlockPos randPos = this.getLandTarget();
//                if (randPos == null) { //Keep flying until we do find a target!
//                    randPos = this.getAirTarget();
//                    flier.setFlyTarget(randPos);
//                }
//                else {
//                    flier.getMoveHelper().setMoveTo(randPos.getX(), randPos.getY(), randPos.getZ(), 1);
//                }
//            }
//
//            if (flier.getFlyTarget() == null) {
//                BlockPos randPos = null;
//                if (flier.getFlyTick() > 0) {
//                    randPos = this.getAirTarget();
//                }
//                else //come to ground:
//                {
//                    randPos = this.getLandTarget();
//                    if (randPos == null) { //Keep flying until we do find a target!
//                        randPos = this.getAirTarget();
//                    }
//                }
//
//                if (randPos == null) {
//                    return false;
//                }
//                else {
//                    flier.setFlyTarget(randPos);
//                    return true;
//                }
//            }
//            else {
//                return (flier.getFlyTarget() != null); //is not null
//            }
//        }
//
//        @Override
//        public boolean shouldContinueExecuting() {
//            return flier.getFlyTarget() != null && !EntityPrehistoricFloraAgeableFlyingBase.isTargetBlocked(flier, new Vec3d(flier.getFlyTarget()));
//        }
//
//        @Nullable
//        protected BlockPos getLandTarget() {
//            //Pick an air target and then move down from it:
//            BlockPos randPos = getAirTarget();
//            if (randPos == null) {
//                randPos = flier.getPosition();
//            }
//            int descender = flier.rand.nextInt(4) + 1;
//            int i = 0;
//            while (i < descender && EntityPrehistoricFloraAgeableFlyingBase.isBlockEmptyForAI(flier.world, randPos.down())) {
//                randPos = randPos.down();
//                i ++;
//            }
//            //System.err.println("Land Target Y: " + randPos.getY());
//            return randPos;
//        }
//
//        @Nullable
//        public BlockPos getAirTarget() {
//            if (flier.getAttackTarget() == null) {
//                return getFlyTarget();
//            }
//            else {
//                BlockPos pos = new BlockPos((int) flier.getAttackTarget().posX, (int) flier.getAttackTarget().posY, (int) flier.getAttackTarget().posZ);
//                if (flier.world.getBlockState(pos).getMaterial() == Material.AIR) {
//                    return pos;
//                }
//            }
//            return flier.getPosition();
//        }
//
//        @Nullable
//        public BlockPos getFlyTarget(){
//            BlockPos pos = null;
//            for (int i = 0; i < 24; i++) {
//                pos = getInterimBlockTarget(flier);
//                if (pos != null) {
//                    BlockPos ground = flier.world.getHeight(new BlockPos(pos.getX(), 0, pos.getZ()));
//                    pos = new BlockPos(pos.getX(), Math.min(pos.getY(), ground.getY() + flightHeight() + flier.rand.nextInt(5) - 2), pos.getZ());
//                    if (flier.world.getBlockState(pos).getMaterial() == Material.AIR
//                            && !isTargetBlocked(flier, new Vec3d(pos))) {
//                        return pos;
//                    }
//                }
//            }
//            return pos;
//        }
//
//    }
//}
