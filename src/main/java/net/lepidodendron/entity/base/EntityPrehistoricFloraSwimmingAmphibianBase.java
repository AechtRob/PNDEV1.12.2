package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.EntityPrehistoricFloraHaldanodon;
import net.lepidodendron.entity.util.IWaterSurfaceEggsAmphibian;
import net.lepidodendron.entity.util.PathNavigateAmphibian;
import net.lepidodendron.entity.util.PathNavigateAmphibianFindWater;
import net.lepidodendron.util.EggLayingConditions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPrehistoricFloraSwimmingAmphibianBase extends EntityPrehistoricFloraAmphibianBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int jumpTicks;

    public EntityPrehistoricFloraSwimmingAmphibianBase(World world) {
        super(world);

        if (world != null) {
            if (this.isInWater()) {
                this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmer(this, world);
                this.isWaterNavigator = true;
                this.isSeekingWater = false;
            }
            else {
                if (isNearWater(this, this.getPosition())) {
                    this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.WanderMoveHelper();
                    this.navigator = new PathNavigateAmphibian(this, world);
                    this.isWaterNavigator = false;
                    this.isSeekingWater = false;
                }
                else {//Find water!
                    this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.WanderMoveHelper();
                    this.navigator = new PathNavigateAmphibianFindWater(this, world);
                    this.setPathPriority(PathNodeType.WATER, 10F);
                    this.isWaterNavigator = false;
                    this.isSeekingWater = true;
                }
            }
        }

        //this.setPathPriority(PathNodeType.WATER, 5.0F);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    protected abstract float getAISpeedSwimmingAmphibian();
    protected boolean isWaterNavigator;
    protected boolean isSeekingWater;
    protected void initEntityAI() {}

    @Override
    public void selectNavigator () {
        if (this.isInWater() && !this.isWaterNavigator) {
            this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.SwimmingMoveHelper();
            this.navigator = new PathNavigateSwimmer(this, world);
            this.isWaterNavigator = true;
            this.isSeekingWater = false;
            this.navigator.clearPath();
            //System.err.println("Navigator changed to " + this.navigator);
        }
        else {
            if (!this.isInWater() && isNearWater(this, this.getPosition()) && (this.isWaterNavigator || this.isSeekingWater)) {
                this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.WanderMoveHelper();
                this.navigator = new PathNavigateAmphibian(this, world);
                this.isWaterNavigator = false;
                this.isSeekingWater = false;
                this.navigator.clearPath();
                //System.err.println("Navigator changed to " + this.navigator);
            }
            else {//Find water!
                if (!this.isInWater() && !isNearWater(this, this.getPosition()) && (this.isWaterNavigator || !this.isSeekingWater)) {
                    this.moveHelper = new EntityPrehistoricFloraSwimmingAmphibianBase.WanderMoveHelper();
                    this.navigator = new PathNavigateAmphibianFindWater(this, world);
                    this.setPathPriority(PathNodeType.WATER, 10F);
                    this.isWaterNavigator = false;
                    this.isSeekingWater = true;
                    this.navigator.clearPath();
                    //System.err.println("Navigator changed to " + this.navigator);
                }
            }
        }
    }

    public boolean sinks() {
        return false;
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_amphibious.name");
    }

    public float getTravelSpeed() {
        return this.getAISpeedSwimmingAmphibian();
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        //this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    public float getMaxTurnDistancePerTick() {
        return 20;
    }

    //@Override
    //public boolean isInWater() { //Is in water if the block above it is also water and it is not on the bottom. i.e. in shallow water it just walks:
    //    if (this.world.isAirBlock(this.getPosition())) {return false;}
    //    IBlockState state = this.world.getBlockState(this.getPosition().down());
    //    return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
    //            && (state.getMaterial() == Material.WATER ));
    //}

    @Override
    public boolean isInWater() {
        if (!this.world.isBlockLoaded(this.getPosition())) {
            return false;
        }
        //Is in water if the block above it or below it are also water.
        //i.e. so that in shallow water it thinks it's not in water and so just walks:
        if (this.world.isAirBlock(this.getPosition())) {return false;}
        IBlockState state = this.world.getBlockState(this.getPosition());
        IBlockState stateU = this.world.getBlockState(this.getPosition().up());
        IBlockState stateD = this.world.getBlockState(this.getPosition().down());
        return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL) || state.getMaterial() == Material.WATER)
                && (stateU.getMaterial() == Material.WATER || stateD.getMaterial() == Material.WATER));
    }

    public boolean isReallyInWater() { //is actually in water at all
        return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        if (this.isReallyInWater()) {
            return; //Do not play footsteps when in one-block deep water - we animate this as swimming there
        }
        super.playStepSound(pos, blockIn);
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (ds == DamageSource.IN_WALL) {
            if (this.isReallyInWater()) {
                return false;
            }
        }
        return super.attackEntityFrom(ds, i);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < (double) this.world.getSeaLevel() && isInWater();
    }

    @Override
    public int getTalkInterval() {
        return 720;
    }

    @Override
    public void playLivingSound() {
        if (this.isReallyInWater()) return;
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
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    public boolean isCollidingRim() {
        if (this.isReallyInWater()) {
            //System.err.println("collided");
            Vec3d vec3d = this.getPositionEyes(0);
            Vec3d vec3d1 = this.getLook(0);
            Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
            RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
            if (rayTrace != null && rayTrace.hitVec != null) {
                //System.err.println("raytraced");
                BlockPos sidePos = rayTrace.getBlockPos();
                if (world.getBlockState(sidePos).getMaterial() == Material.WATER) {
                    //System.err.println("colliding rim");
                    if (this.moveHelper.action != EntityMoveHelper.Action.JUMPING)
                        return true;
                }
            }
        }
        //System.err.println("not colliding rim");
        return false;
    }

    public boolean isAtBottom() {
        //System.err.println("Testing position");
        if (this.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
            return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
                    && ((this.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)this.getPosition().getY() + 0.334D) > this.posY);
        }
        return true;
    }

    @Override
    public void onLivingUpdate() {

        if (this.getAnimation() == this.MAKE_NEST_ANIMATION) {
            if (this.getAnimationTick() == this.MAKE_NEST_ANIMATION.getDuration() - 5) {
                if (this instanceof EntityPrehistoricFloraHaldanodon) { //Burrowing creatures:
                    EntityPrehistoricFloraHaldanodon burrower = (EntityPrehistoricFloraHaldanodon) this;
                    if (!world.isRemote && this.getPosition().getY() > 8) {
                        BlockPos pos = burrower.buildBurrow(this.world, this.getPosition(), burrower.hasLargeBurrow());
                        this.world.setBlockState(pos, BlockNest.block.getDefaultState());
                        TileEntity te = world.getTileEntity(pos);
                        if (te != null) {
                            te.getTileData().setString("creature", getEntityId(this));
                        }
                        this.setNestLocation(pos);
                        SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
                        this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    }
                }
                else {
                    if (!world.isRemote) {
                        this.world.setBlockState(this.getPosition(), BlockNest.block.getDefaultState());
                        TileEntity te = world.getTileEntity(this.getPosition());
                        if (te != null) {
                            te.getTileData().setString("creature", getEntityId(this));
                        }
                        this.setNestLocation(this.getPosition());
                    }
                    SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
                    this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
        }

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
            this.setIsFast(this.getAttackTarget() != null || this.getEatTarget() != null);
        }

        if (!this.world.isRemote) {selectNavigator();}
        if (this.isInWater()) {
            super.onLivingUpdate();
        }
        else {
            this.renderYawOffset = this.rotationYaw;

            if (!world.isRemote) {
                double width = this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX;
                double depth = this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ;
                double height = this.getEntityBoundingBox().maxY - this.getEntityBoundingBox().minY;
                if (height <= 0.9375 && width <= 1.0 && depth <= 1.0) {
                    if (!this.getJuvenile()) {
                        this.setJuvenile(true);
                    }
                }
                else if (this.getJuvenile()) {
                    this.setJuvenile(false);
                }
            }

            if (!world.isRemote) {
                if (this.getAttackTarget() != null) {
                    if (this.getAttackTarget().isDead) {
                        this.setAttackTarget(null);
                    }
                    else if (this.getAttackTarget() instanceof EntityPlayer) {
                        if (((EntityPlayer)this.getAttackTarget()).isCreative()) {
                            this.setAttackTarget(null);
                        }
                    }
                }
                if (this.getEatTarget() != null) {
                    if (this.getEatTarget().isDead) {
                        this.setEatTarget(null);
                    }
                }
                if (this.getWarnTarget() != null) {
                    if (this.getWarnTarget().isDead) {
                        this.setWarnTarget(null);
                    }
                }
                if (this.getWarnTarget() != null) {
                    if (this.getWarnTarget().isDead) {
                        this.setWarnTarget(null);
                    }
                    else if (this.getWarnTarget() instanceof EntityPlayer) {
                        if (((EntityPlayer)this.getWarnTarget()).isCreative()) {
                            this.setWarnTarget(null);
                        }
                    }
                    if ((!(this.getWarnCooldown() > 0)) && this.getAttackTarget() == null) {
                        this.setWarnTarget(null);
                    }
                }
                if (this.getRevengeTarget() != null) {
                    if (this.getRevengeTarget().isDead) {
                        this.setRevengeTarget(null);
                    }
                    else if (this.getRevengeTarget() instanceof EntityPlayer) {
                        if (((EntityPlayer)this.getRevengeTarget()).isCreative()) {
                            this.setRevengeTarget(null);
                        }
                    }
                }
                this.setIsFast(this.getAvoidTarget() != null || this.getAttackTarget() != null || this.getEatTarget() != null || (this.getRevengeTarget() != null & (this.panics() || this.sneakOnRevenge())) || (this.isBurning() & this.panics()));

                if (this.getSneakRange() > 0 && this.getIsFast()
                        && (this.getAttackTarget() != null || (this.getRevengeTarget() != null && this.sneakOnRevenge()))
                        && ((!this.getOneHit()) || this.sneakOnRevenge())
                ) {
                    //If this is hunting and is not close enough, sneak up:

                    float distEntity;
                    if (this.getAttackTarget() != null) {
                        distEntity = this.getDistancePrey(this.getAttackTarget());
                    }
                    else {
                        distEntity = this.getDistancePrey(this.getRevengeTarget());
                    }
                    if (distEntity >= this.getUnSneakRange() && distEntity <= (this.getSneakRange())) {
                        this.setIsSneaking(true);
                    }
                    if (this.getIsSneaking() &&
                            (distEntity >= (this.getSneakRange() * 2.0D) + 2) || distEntity < this.getUnSneakRange()
                    ) {
                        this.setIsSneaking(false);
                    }
                }
                else {
                    this.setIsSneaking(false);
                }

                if ((!this.getIsFast())
                        || (this.getAttackTarget() == this.getRevengeTarget() && !this.sneakOnRevenge())
                        || (this.getOneHit() && !this.sneakOnRevenge())
                ) {
                    this.setIsSneaking(false);
                }

            }

            if (!this.isPFAdult())
            {
                this.inPFLove = 0;
            }

            if (this.inPFLove > 0)
            {
                --this.inPFLove;
            }

            if (this.getCanGrow() > 0)
            {
                this.setCanGrow(this.getCanGrow() - 1);
            }

            if (this.getMateable() < 0) {
                this.setMateable(this.getMateable() + 1);
            }

            //Grapple with mates?
            if (rand.nextInt(this.grappleChance()) == 0) {
                //Are there any nearby to grapple with?
                this.findGrappleTarget();
            }

            if (this.willGrapple && this.getAnimation() == this.getGrappleAnimation() && this.getAnimationTick() == 5 && this.getGrappleTarget() != null) {
                this.faceEntity(this.getGrappleTarget(), 10, 10);
                launchGrapple();
                if (this.getOneHit()) {
                    this.setGrappleTarget(null);
                }
            }

            if (this.homeCooldown > 0) {
                this.homeCooldown -= rand.nextInt(3) + 1;
            }
            if (this.homeCooldown < 0) {
                this.homeCooldown = 0;
            }

            if ((!this.world.isRemote) && this.getNestLocation() != null) {
                if (this.world.isBlockLoaded(this.getNestLocation())) {
                    if (this.isMyNest(this.world, this.getNestLocation())) {
                        if (this.getNestLocation().distanceSq(this.posX, this.posY, this.posZ) <= 9) {
                            this.homeCooldown = 12000; //~5 game minutes of non-tethered movement (note the decrements are not in 1s)
                        }
                    }
                }
            }

            //Updated from vanilla to allow underwater jumping:
            if (this.jumpTicks > 0) {
                --this.jumpTicks;
            }

            if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer()) {
                double d0 = this.posX + (this.interpTargetX - this.posX) / (double) this.newPosRotationIncrements;
                double d1 = this.posY + (this.interpTargetY - this.posY) / (double) this.newPosRotationIncrements;
                double d2 = this.posZ + (this.interpTargetZ - this.posZ) / (double) this.newPosRotationIncrements;
                double d3 = MathHelper.wrapDegrees(this.interpTargetYaw - (double) this.rotationYaw);
                this.rotationYaw = (float) ((double) this.rotationYaw + d3 / (double) this.newPosRotationIncrements);
                this.rotationPitch = (float) ((double) this.rotationPitch + (this.interpTargetPitch - (double) this.rotationPitch) / (double) this.newPosRotationIncrements);
                --this.newPosRotationIncrements;
                this.setPosition(d0, d1, d2);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            } else if (!this.isServerWorld()) {
                this.motionX *= 0.98D;
                this.motionY *= 0.98D;
                this.motionZ *= 0.98D;
            }

            if (Math.abs(this.motionX) < 0.003D) {
                this.motionX = 0.0D;
            }

            if (Math.abs(this.motionY) < 0.003D) {
                this.motionY = 0.0D;
            }

            if (Math.abs(this.motionZ) < 0.003D) {
                this.motionZ = 0.0D;
            }

            this.world.profiler.startSection("ai");

            if (this.isMovementBlocked()) {
                this.isJumping = false;
                this.moveStrafing = 0.0F;
                this.moveForward = 0.0F;
                this.randomYawVelocity = 0.0F;
            } else if (this.isServerWorld()) {
                this.world.profiler.startSection("newAi");
                this.updateEntityActionState();
                this.world.profiler.endSection();
            }

            this.world.profiler.endSection();
            this.world.profiler.startSection("jump");

            if (this.isJumping) {
                if (this.isInWater() && this.jumpTicks == 0 && this.canJumpOutOfWater()) {
                    this.jump();
                    this.jumpTicks = 10;
                } else if (this.isInLava()) {
                    this.handleJumpLava();
                } else if (this.onGround && this.jumpTicks == 0) {
                    this.jump();
                    this.jumpTicks = 10;
                }
            } else {
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
        }
    }

    public void onEntityUpdate()
    {
        super.onEntityUpdate();

        //Lay eggs perhaps:
        if (!this.hasNest()) {
            if (this instanceof IWaterSurfaceEggsAmphibian) {
                EggLayingConditions.layWaterSurfaceEggs(this);
            } else {
                EggLayingConditions.layWaterBottomEggs(this);
            }
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

                if (this.motionX != 0 || this.motionZ != 0) {
                    this.setIsMoving(true);
                }
                else {
                    this.setIsMoving(false);
                }

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

    public class WanderMoveHelper extends EntityMoveHelper {

        private final EntityPrehistoricFloraSwimmingAmphibianBase EntityBase = EntityPrehistoricFloraSwimmingAmphibianBase.this;

        public WanderMoveHelper() {
            super(EntityPrehistoricFloraSwimmingAmphibianBase.this);
        }

        public void onUpdateMoveHelper() {

            if (this.action == Action.STRAFE) {
                //float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
                float f = getAISpeedSwimmingAmphibian();
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
                this.EntityBase.setAIMoveSpeed((float) (0.6f * this.speed * getAISpeedSwimmingAmphibian()));


                //Land:
                //if (!this.EntityBase.isInWater()) {
                //    this.EntityBase.setAIMoveSpeed((float) (0.6f * this.speed * getAISpeedSwimmingAmphibian()));
                //}

                if (
                    (this.EntityBase.collidedHorizontally)
                    && (d2 > (double) this.EntityBase.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.EntityBase.width))
                ) {
                    if (!this.EntityBase.canJumpOutOfWater()) {
                        if (!(this.EntityBase.isReallyInWater())) {
                            this.EntityBase.getJumpHelper().setJumping();
                            this.action = EntityMoveHelper.Action.JUMPING;
                            //System.err.println("Set jump 1");
                        }
                    }
                    else {
                        this.EntityBase.getJumpHelper().setJumping();
                        this.action = Action.JUMPING;
                        //System.err.println("Set jump 2");
                    }
                    //System.err.println("action: " +  this.action);
                }
            } else if (this.action == Action.JUMPING) {
                //float speed = getAISpeedLand();
                //this.EntityBase.setAIMoveSpeed((float) (speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedSwimmingAmphibian()));

                if (this.EntityBase.onGround) {
                    this.action = Action.WAIT;
                }
            } else {
                this.EntityBase.setMoveForward(0.0F);
            }
        }
    }

    public class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraSwimmingAmphibianBase EntityBase = EntityPrehistoricFloraSwimmingAmphibianBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraSwimmingAmphibianBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            //System.err.println("Action " + this.action);
            //System.err.println("NoPath " + this.EntityBase.getNavigator().noPath());
            if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                double distanceX = this.posX - this.EntityBase.posX;
                double distanceY = this.posY - this.EntityBase.posY;
                double distanceZ = this.posZ - this.EntityBase.posZ;
                double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                distance = MathHelper.sqrt(distance);
                distanceY /= distance;
                float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;

                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 20.0F);
                float speed = getAISpeedSwimmingAmphibian();
                this.EntityBase.setAIMoveSpeed(speed);

                if (this.EntityBase.isAtBottom() && this.EntityBase.isBase() && (!this.EntityBase.getIsFast())) {
                    this.EntityBase.setAIMoveSpeed(speed * 0.25F);
                }

                this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
            } else {
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }
}