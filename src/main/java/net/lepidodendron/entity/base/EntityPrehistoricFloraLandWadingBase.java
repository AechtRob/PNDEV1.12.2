package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.util.PathNavigateGroundNoDeepWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.MaterialLatex;
import net.lepidodendron.util.MaterialResin;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.MoverType;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraLandWadingBase extends EntityPrehistoricFloraLandBase {

    @SideOnly(Side.CLIENT)
    public ChainBuffer tailBuffer;
    private int jumpTicks;
    public Animation HURT_ANIMATION;
    public static Animation NOISE_ANIMATION; //Ambient noises (roar is re-purposed for warning)

    public EntityPrehistoricFloraLandWadingBase(World world) {
        super(world);
        if (world != null) {
            if (this.isSwimmingInWater() && this.canSwim()) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                        || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                    this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                    this.navigator = new PathNavigateSwimmerTopLayer(this, world);
                }
            }
            else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                        || (!(this.navigator instanceof PathNavigateGroundNoDeepWater))) {
                    this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                    this.navigator = new PathNavigateGroundNoDeepWater(this, world);
                }
            }
        }
        this.setPathPriority(PathNodeType.WATER, 10F);
        NOISE_ANIMATION = Animation.create(this.getNoiseLength());
        HURT_ANIMATION = Animation.create(this.getHurtLength());
    }

    public int getHurtLength() {
        return 30;
    }

    public int getNoiseLength() {
        return 60;
    }

    public int getRoarLength() {
        return 60;
    }

    @Override
    public void playLivingSound() {
        if (this.getAnimation() == NO_ANIMATION && (!this.getIsSneaking())) {
            if (!this.world.isRemote) {
                this.setAnimation(NOISE_ANIMATION);
                SoundEvent soundevent = this.getAmbientSound();
                if (soundevent != null)
                {
                    this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
                }
            }
        }
    }

    @Nullable
    public SoundEvent getRoarSound() { //Roar
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getAmbientSound() { //Noise
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(""));
    }
    
    @Override
    public void selectNavigator () {
        if (this.isSwimmingInWater() && this.canSwim()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                    || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            }
        }

        else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                    || (!(this.navigator instanceof PathNavigateGroundNoDeepWater))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoDeepWater(this, world);
            }
        }
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{DRINK_ANIMATION, GRAZE_ANIMATION, HURT_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, NOISE_ANIMATION};
    }

    @Override
    public boolean isAnimationDirectionLocked(Animation animation) {
        return animation == ROAR_ANIMATION || animation == DRINK_ANIMATION; //warning a player
    }

    @Override
    public boolean isSwimmingInWater() {
        return PathNavigateGroundNoDeepWater.isUnacceptableWater(this);
    }

    @Override
    protected float getJumpUpwardsMotion()
    {
        if (this.isReallyInWater()) {
            //Assists to jump out of water:
            if (this.getIsFast()) {
                return 0.55F;
            }
            return 0.52F;
        }
        return super.getJumpUpwardsMotion();
    }

    @Override
    protected void doBlockCollisions() {
        //Bespoke so these can destroy waterlilies!
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(axisalignedbb.minX + 0.001D, axisalignedbb.minY + 0.001D, axisalignedbb.minZ + 0.001D);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos1 = BlockPos.PooledMutableBlockPos.retain(axisalignedbb.maxX - 0.001D, axisalignedbb.maxY - 0.001D, axisalignedbb.maxZ - 0.001D);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos2 = BlockPos.PooledMutableBlockPos.retain();

        if (this.world.isAreaLoaded(blockpos$pooledmutableblockpos, blockpos$pooledmutableblockpos1))
        {
            for (int i = blockpos$pooledmutableblockpos.getX(); i <= blockpos$pooledmutableblockpos1.getX(); ++i)
            {
                for (int j = blockpos$pooledmutableblockpos.getY(); j <= blockpos$pooledmutableblockpos1.getY(); ++j)
                {
                    for (int k = blockpos$pooledmutableblockpos.getZ(); k <= blockpos$pooledmutableblockpos1.getZ(); ++k)
                    {
                        blockpos$pooledmutableblockpos2.setPos(i, j, k);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos2);

                        boolean blockDestroyed = false;
                        if (!this.world.isRemote) {
                            if (matchBlock(iblockstate.getBlock().getRegistryName().toString())) {
                                this.world.destroyBlock(new BlockPos(i, j, k), true);
                                blockDestroyed = true;
                            }
                            if (this.isJumping) {
                                if (matchBlock( this.world.getBlockState(new BlockPos(i, j + 1, k)).getBlock().getRegistryName().toString())) {
                                    this.world.destroyBlock(new BlockPos(i, j + 1, k), true);
                                    blockDestroyed = true;
                                }
                            }
                        }
                        if (!blockDestroyed) {
                            try {
                                iblockstate.getBlock().onEntityCollision(this.world, blockpos$pooledmutableblockpos2, iblockstate, this);
                                this.onInsideBlock(iblockstate);
                            } catch (Throwable throwable) {
                                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Colliding entity with block");
                                CrashReportCategory crashreportcategory = crashreport.makeCategory("Block being collided with");
                                CrashReportCategory.addBlockInfo(crashreportcategory, blockpos$pooledmutableblockpos2, iblockstate);
                                throw new ReportedException(crashreport);
                            }
                        }
                    }
                }
            }
        }

        blockpos$pooledmutableblockpos.release();
        blockpos$pooledmutableblockpos1.release();
        blockpos$pooledmutableblockpos2.release();
    }

    public static boolean matchBlock(String blockName) {

        String[] var2 = LepidodendronConfig.genWadeableBreaks;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String checkBlock = var2[var4];
            if (checkBlock.equalsIgnoreCase(blockName)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isInWater() {
        if (this.world.isAirBlock(this.getPosition())) {return false;}
        return this.inWater || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    public boolean isReallyInWater() { //is actually in water at all
        return (this.world.getBlockState(Functions.getEntityBlockPos(this)).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
        if (distance <= this.getMaxFallHeight()) {
            return;
        }
        super.fall(distance, damageMultiplier);
    }

    public int getEatTick() {return 1;}

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        if (this.getAnimation() == EAT_ANIMATION) {
            if (this.getAnimationTick() == getEatTick()) {
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }

        if (this.getAnimation() == ROAR_ANIMATION && this.getWarnTarget() != null) {
            this.faceEntity(this.getWarnTarget(), 10, 10);
        }

    }

    @Override
    public void onLivingUpdate() {
        if (this.getAnimation() == DRINK_ANIMATION) {
            this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
        }

        if (this.getAnimation() == GRAZE_ANIMATION) {
            this.faceBlock(this.getGrazingFrom(), 10F, 10F);
        }

        this.renderYawOffset = this.rotationYaw;

        if (this.getAnimation() == this.MAKE_NEST_ANIMATION) {
            if (this.getAnimationTick() == this.MAKE_NEST_ANIMATION.getDuration() - 5) {
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

        if (this.getIsMoving() && !this.isSneaking()) {
            if (this.getIsFast()) {
                int animCycle = this.getRunCycleLength();
                if (animCycle > 0) {
                    double tickAnim = (this.ticksExisted + this.getTickOffset() + this.getRunFootstepOffset()) - (int) (Math.floor((double) (this.ticksExisted + this.getTickOffset() + this.getRunFootstepOffset()) / (double) animCycle) * (double) animCycle);
                    if (this.tetrapodRunFootstepOffset() != 0) {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D
                                || Math.floor(tickAnim) == this.tetrapodRunFootstepOffset() || Math.floor(tickAnim) == (animCycle / 2D) + this.tetrapodRunFootstepOffset()) {
                            playStepSoundPublic();
                        }
                    }
                    else {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D) {
                            playStepSoundPublic();
                        }
                    }
                }
            }
            else {
                int animCycle = this.getWalkCycleLength();
                if (animCycle > 0) {
                    double tickAnim = (this.ticksExisted + this.getTickOffset() + this.getFootstepOffset()) - (int) (Math.floor((double) (this.ticksExisted + this.getTickOffset() + this.getFootstepOffset()) / (double) animCycle) * (double) animCycle);
                    if (this.tetrapodWalkFootstepOffset() != 0) {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D
                                || Math.floor(tickAnim) == this.tetrapodRunFootstepOffset() || Math.floor(tickAnim) == (animCycle / 2D) + this.tetrapodRunFootstepOffset()) {
                            playStepSoundPublic();
                        }
                    }
                    else {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D) {
                            playStepSoundPublic();
                        }
                    }
                }
            }
        }

        if (!this.world.isRemote) {
            selectNavigator();
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

        //Additional:
        if (!world.isRemote) {
            if (this.getAttackTarget() != null) {
                if (this.getAttackTarget().isDead) {
                    this.setAttackTarget(null);
                }
            }
            if (this.getWarnTarget() != null) {
                if (this.getWarnTarget().isDead) {
                    this.setWarnTarget(null);
                }
                if ((!(this.getWarnCooldown() > 0)) && this.getAttackTarget() == null) {
                    this.setWarnTarget(null);
                }
            }
            if (this.getRevengeTarget() != null) {
                if (this.getRevengeTarget().isDead) {
                    this.setRevengeTarget(null);
                }
            }
            if (this.getEatTarget() != null) {
                if (this.getEatTarget().isDead) {
                    this.setEatTarget(null);
                }
            }
            if (this.isSwimmingInWater()) {
                this.setAttackTarget(null);
                this.setEatTarget(null);
                this.setWarnTarget(null);
                this.setRevengeTarget(null);
            }
            this.setIsFast(this.getAttackTarget() != null || this.getEatTarget() != null || (this.getRevengeTarget() != null & this.panics()) || (this.isBurning() & this.panics()));

            if (this.getSneakRange() > 0 && this.getIsFast() && this.getAttackTarget() != null && (!this.getOneHit())) {
                //If this is hunting and is not close enough, sneak up:
                float distEntity = this.getDistancePrey(this.getAttackTarget());
                if (distEntity >= this.getSneakRange() && distEntity <= (this.getSneakRange() * 1.5D)) {
                    this.setIsSneaking(true);
                }
                if (this.getIsSneaking() &&
                        (distEntity >= (this.getSneakRange() * 2.0D) + 2) || distEntity <= (this.getSneakRange() * 0.5)
                ) {
                    this.setIsSneaking(false);
                }
            }
            else {
                this.setIsSneaking(false);
            }

            if ((!this.getIsFast()) || this.getAttackTarget() == this.getRevengeTarget() || this.getOneHit()) {
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

        if (this.getPFDrinking() > 0)
        {
            this.setIsDrinking(this.getPFDrinking() - 1);
        }

        if (this.getPFGrazing() > 0)
        {
            this.setIsGrazing(this.getPFGrazing() - 1);
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
        }

        //Grapple with mates?
        if (rand.nextInt(1000) == 0) {
            //Are there any nearby to grapple with?
            this.findGrappleTarget();
        }

        if (this.getAnimation() == this.getGrappleAnimation() && this.getAnimationTick() == this.headbutTick() && this.getGrappleTarget() != null) {
            this.faceEntity(this.getGrappleTarget(), 10, 10);
            launchGrapple();
            if (this.getGrappleTarget() instanceof EntityPrehistoricFloraAgeableBase) {
                EntityPrehistoricFloraAgeableBase grappleTarget = (EntityPrehistoricFloraAgeableBase) this.getGrappleTarget();
                grappleTarget.setGrappleTarget(null);
                grappleTarget.willGrapple = false;
            }
            this.setGrappleTarget(null);
            this.willGrapple = false;
        }
        else if (this.getAnimation() == this.getGrappleAnimation() && this.getGrappleTarget() != null) {
            this.faceEntity(this.getGrappleTarget(), 10, 10);
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

            double yy = this.posY + Math.max((this.getSwimHeight() - 0.2), 0.1);
            BlockPos posEyes = new BlockPos(this.posX, yy, this.posZ);

            if (this.isSwimmingInWater() &&
                    (world.getBlockState(posEyes).getMaterial() == Material.WATER
                            || world.getBlockState(posEyes).getMaterial() == Material.LAVA
                            || world.getBlockState(posEyes).getMaterial() == MaterialResin.RESIN
                            || world.getBlockState(posEyes).getMaterial() == MaterialLatex.LATEX)
            ) {
                this.motionY = 0.2D;
            }

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
    
}
