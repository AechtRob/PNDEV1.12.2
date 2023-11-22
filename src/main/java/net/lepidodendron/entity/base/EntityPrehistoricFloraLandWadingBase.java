package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.util.PathNavigateAmphibian;
import net.lepidodendron.entity.util.PathNavigateGroundWade;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ReportedException;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPrehistoricFloraLandWadingBase extends EntityPrehistoricFloraLandBase {

    @SideOnly(Side.CLIENT)
    public ChainBuffer tailBuffer;
    private int jumpTicks;
    private int inPFLove;
    public Animation HURT_ANIMATION;

    public EntityPrehistoricFloraLandWadingBase(World world) {
        super(world);
        if (world != null) {
            if (!(this.moveHelper instanceof EntityPrehistoricFloraLandWadingBase.WanderMoveHelper)) {
                this.moveHelper = new EntityPrehistoricFloraLandWadingBase.WanderMoveHelper();
            }
            if (isBlockWadable(this.world, this.getPosition()) && (!(this.navigator instanceof PathNavigateGroundWade))) {
                this.navigator = new PathNavigateGroundWade(this, world);
            }
            else if ((!(isBlockWadable(this.world, this.getPosition()))) && (!(this.navigator instanceof PathNavigateAmphibian))) {
                this.navigator = new PathNavigateAmphibian(this, world);
            }
        }
        HURT_ANIMATION = Animation.create(this.getHurtLength());
    }

    public int getHurtLength() {
        return 30;
    }
    
    @Override
    public void selectNavigator () {
        if (!(this.moveHelper instanceof EntityPrehistoricFloraLandWadingBase.WanderMoveHelper)) {
            this.moveHelper = new EntityPrehistoricFloraLandWadingBase.WanderMoveHelper();
        }
        if (isBlockWadable(this.world, this.getPosition()) && (!(this.navigator instanceof PathNavigateGroundWade))) {
            this.navigator = new PathNavigateGroundWade(this, world);
        }
        else if ((!(isBlockWadable(this.world, this.getPosition()))) && (!(this.navigator instanceof PathNavigateAmphibian))) {
            this.navigator = new PathNavigateAmphibian(this, world);
        }
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{DRINK_ANIMATION, GRAZE_ANIMATION, HURT_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION};
    }

    @Override
    public boolean isSwimmingInWater() {
        return false;
    }

    public abstract int wadeDepth();

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

    public boolean isBlockWadable(IBlockAccess world, BlockPos pos) {
        if (world instanceof World)
        if (!((World)world).isBlockLoaded(pos)) {
            return false;
        }
        boolean flag = false;
        for (int i = 1; i <= this.wadeDepth() ; i++) {
            IBlockState state = world.getBlockState(pos.up(i));
            if (state.getMaterial() != Material.WATER
                    && state.getMaterial() != Material.LAVA
                    && state.getBlock().isPassable(world, pos.up(i))) {
                flag = true;
                if (flag) {
                    break;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean isInWater() {
        if (this.world.isAirBlock(this.getPosition())) {return false;}
        return this.inWater || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    public boolean isReallyInWater() { //is actually in water at all
        return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
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
            if (this.getAnimationTick() >= this.MAKE_NEST_ANIMATION.getDuration() - 5) {
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
                this.setSneaking(false);
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

        private final EntityPrehistoricFloraLandWadingBase EntityBase = EntityPrehistoricFloraLandWadingBase.this;

        public WanderMoveHelper() {
            super(EntityPrehistoricFloraLandWadingBase.this);
        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.STRAFE) {
                float f = (float) this.EntityBase.getAISpeedLand();
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
                this.action = EntityMoveHelper.Action.WAIT;
            } else if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                this.action = EntityMoveHelper.Action.WAIT;
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
                //this.EntityBase.setAIMoveSpeed((float) (this.speed * this.EntityBase.getAISpeedLand()));

                this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * this.EntityBase.getAISpeedLand()));

                //Testing mode:
                //this.EntityBase.setAIMoveSpeed(0f);

                if (d2 > (double) this.EntityBase.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.EntityBase.width)) {
                    this.EntityBase.getJumpHelper().setJumping();
                    this.action = EntityMoveHelper.Action.JUMPING;
                    //System.err.println("Set jump 4");
                }
            } else if (this.action == EntityMoveHelper.Action.JUMPING) {
                this.EntityBase.setAIMoveSpeed((float) (this.speed * this.EntityBase.getAISpeedLand()));

                if (this.EntityBase.onGround) {
                    this.action = EntityMoveHelper.Action.WAIT;
                }
            } else {
                this.EntityBase.setMoveForward(0.0F);
            }
        }
    }
    
}
