package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraLandClimbingFlyingBase extends EntityPrehistoricFloraLandClimbingBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.OPTIONAL_BLOCK_POS);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.FACING);
    public int sitCooldown = 0;
    public int sitTickCt = 0;
    public float flyProgress;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    private int inPFLove;

    public EntityPrehistoricFloraLandClimbingFlyingBase(World world) {
        super(world);
        if (world != null) {
            this.selectNavigator();
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    @Override
    public void selectNavigator () {
        if (this.isFlying()) {
            if ((!(this.moveHelper instanceof FlightMoveHelper))
                    || (!(this.navigator instanceof PathNavigateFlyingNoWater))) {
                this.moveHelper = new FlightMoveHelper(this);
                this.navigator = new PathNavigateFlyingNoWater(this, world);
            }
        }
        else if (this.isSwimmingInWater() && this.canSwim()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                    || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            }
        }
        else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                    || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
            }
        }
    }

    public boolean isFlying() {
        return (!this.onGround) && (!this.isSitting()) && (!getIsClimbing());
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.dataManager.set(SIT_FACE, EnumFacing.byIndex(compound.getByte("SitFace")));
        this.sitCooldown = compound.getInteger("SitCooldown");
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
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("Sitting", this.isSitting);
        compound.setByte("SitFace", (byte) this.dataManager.get(SIT_FACE).getIndex());
        BlockPos blockpos = this.getAttachmentPos();
        compound.setInteger("SitCooldown", sitCooldown);
        compound.setInteger("SitTickCt", sitTickCt);
        if (blockpos != null) {
            compound.setInteger("PosX", blockpos.getX());
            compound.setInteger("PosY", blockpos.getY());
            compound.setInteger("PosZ", blockpos.getZ());
        }
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

    public EnumFacing getAttachmentFacing() {
        return this.dataManager.get(SIT_FACE);
    }

    @Nullable
    public BlockPos getAttachmentPos() {
        return (BlockPos) ((Optional) this.dataManager.get(SIT_BLOCK_POS)).orNull();
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
        this.sitTickCt = 0;
        this.inPFLove = 0;
        sitCooldown = 1500 + rand.nextInt(1200);
        this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
        this.setAttachmentPos(null);
        return super.attackEntityFrom(ds, f);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.inPFLove > 0)
        {
            --this.inPFLove;
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
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

        if (this.isInWater()) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        boolean flying = isFlying();
        if (sitCooldown > 0) {
            sitCooldown--;
        }

        if (this.getAttachmentPos() == null) {
            sitTickCt = 0;
            if (collided && sitCooldown == 0 && !onGround){
                sitCooldown = 5;
                Vec3d vec3d = this.getPositionEyes(0);
                Vec3d vec3d1 = this.getLook(0);
                Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
                RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
                if (rayTrace != null && rayTrace.hitVec != null) {
                    BlockPos sidePos = rayTrace.getBlockPos();
                    if (world.isSideSolid(sidePos, rayTrace.sideHit)) {
                        this.setAttachmentPos(sidePos);
                        this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                        this.motionX = 0.0D;
                        this.motionY = 0.0D;
                        this.motionZ = 0.0D;
                    }
                }
            }
        } else {
            BlockPos pos = this.getAttachmentPos();
            if (world.isSideSolid(pos, this.getAttachmentFacing())) {
                sitTickCt++;
                sitCooldown = 150;
                this.renderYawOffset = 180.0F;
                this.prevRenderYawOffset = 180.0F;
                this.rotationYaw = 180.0F;
                this.prevRotationYaw = 180.0F;
                this.rotationYawHead = 180.0F;
                this.prevRotationYawHead = 180.0F;
                this.moveHelper.action = EntityMoveHelper.Action.WAIT;
                if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                    this.posZ = this.getPosition().getZ() + (this.width/2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                    this.posZ = this.getPosition().getZ() + 1 - (this.width/2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.WEST) {
                    this.posX = this.getPosition().getX() + (this.width/2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.EAST) {
                    this.posX = this.getPosition().getX() + 1 - (this.width/2F);
                }
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            } else {
                this.sitTickCt = 0;
                this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
                this.setAttachmentPos(null);
            }
        }
        if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0 || this.getAttachmentPos() != null && (this.getAttackTarget() != null || this.getEatTarget() != null)) {
            this.sitTickCt = 0;
            sitCooldown = this.sitCooldownSetter();
            this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
            this.setAttachmentPos(null);
        }
        if (flying && flyProgress < 20.0F) {
            flyProgress += 0.5F;
            if (sitProgress != 0)
                sitProgress = 0F;
        } else if (!flying && flyProgress > 0.0F) {
            flyProgress -= 0.5F;
            if (sitProgress != 0)
                sitProgress = 0F;
        }

        if (!this.isMovementBlockedSoft() && this.getAttachmentPos() == null) {
            //Entity eatTarget = this.getEatTarget();
            //if (eatTarget != null) {
            //    if (eatTarget.posY > this.posZ) {
            //        this.motionY += 0.08D;
            //    }
            //}
            //else {
            this.motionY += 0.08D;
            //}
        } else {
            this.moveHelper.action = EntityMoveHelper.Action.WAIT;
        }
        if (flying && this.ticksExisted % 20 == 0 && !world.isRemote && this.getAttachmentPos() == null && this.FlightSound() != null) {
            this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
                    .getObject(this.FlightSound()), this.getSoundVolume(), 1);
        }

    }

    public int sitTickCtMax() {
        return 1150;
    }

    public int sitCooldownSetter() {
        return 1000 + rand.nextInt(1500);
    }

    @Override
    public boolean isMovementBlocked() {
        return isSitting();
    }

    public boolean isMovementBlockedSoft() {
        return isMovementBlocked() ;
    }

    public ResourceLocation FlightSound() {
        return new ResourceLocation("lepidodendron:anurognathid_flight");
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




    public class FlightMoveHelper extends EntityMoveHelper {
        public FlightMoveHelper(EntityPrehistoricFloraLandClimbingFlyingBase insect) {
            super(insect);
            this.speed = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAISpeedLand();

        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                if (EntityPrehistoricFloraLandClimbingFlyingBase.this.collidedHorizontally) {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw += 180.0F;
                    this.speed = 0.1F;
                    BlockPos target = EntityPrehistoricFloraLandClimbingFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraLandClimbingFlyingBase.this, EntityPrehistoricFloraLandClimbingFlyingBase.this.world, EntityPrehistoricFloraLandClimbingFlyingBase.this.posX + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.rand);
                    this.posX = target.getX();
                    this.posY = target.getY();
                    this.posZ = target.getZ();
                }
                double d0 = this.posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                double d1 = this.posY - EntityPrehistoricFloraLandClimbingFlyingBase.this.posY;
                double d2 = this.posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = MathHelper.sqrt(d3);

                if (d3 < EntityPrehistoricFloraLandClimbingFlyingBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionY *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ *= 0.5D;
                } else {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX += d0 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionY += d1 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

                    if (EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget() == null && EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget() == null) {
                        EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX, EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                    } else {
                        if (EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget() != null) {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget().posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                        }
                        else {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget().posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                        }
                    }
                }
            }
        }
    }

    class AIWanderLandClimbingFlyingBase extends EntityAIBase {
        BlockPos target;
        boolean isGoingToAttach = false;

        public AIWanderLandClimbingFlyingBase() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            if (EntityPrehistoricFloraLandClimbingFlyingBase.this.sitCooldown == 0) {
                for(int i = 0; i < 15; i++){
                    BlockPos randomPos = new BlockPos(EntityPrehistoricFloraLandClimbingFlyingBase.this).add(rand.nextInt(17) - 8, rand.nextInt(11) - 5, rand.nextInt(17) - 8);
                    if ((!world.isAirBlock(randomPos)) && (world.getBlockState(randomPos).getMaterial() != Material.WATER) && (world.getBlockState(randomPos).getMaterial() != Material.LAVA)) {
                        RayTraceResult rayTrace = world.rayTraceBlocks(EntityPrehistoricFloraLandClimbingFlyingBase.this.getPositionVector().add(0, 0.25, 0), new Vec3d(randomPos).add(0.5, 0.5, 0.5), true);
                        if (rayTrace != null && rayTrace.hitVec != null) {
                            if ((!world.isSideSolid(rayTrace.getBlockPos(), rayTrace.sideHit)) && (world.getBlockState(rayTrace.getBlockPos()).getMaterial() != Material.WATER)) {
                                target = rayTrace.getBlockPos();
                                isGoingToAttach = true;
                            }
                        }
                    }
                }
            }

            target = EntityPrehistoricFloraLandClimbingFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraLandClimbingFlyingBase.this, EntityPrehistoricFloraLandClimbingFlyingBase.this.world, EntityPrehistoricFloraLandClimbingFlyingBase.this.posX + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraLandClimbingFlyingBase.this.rand);
            Material material = world.getBlockState(new BlockPos(target)).getMaterial();
            Material material1 = world.getBlockState(new BlockPos(target).up()).getMaterial();
            return (material1 != Material.LAVA) && (material1 != Material.WATER) && (material != Material.LAVA) && (material != Material.WATER) && !EntityPrehistoricFloraLandClimbingFlyingBase.this.isSitting() && EntityPrehistoricFloraLandClimbingFlyingBase.this.isDirectPathBetweenPoints(new Vec3d(target).add(0.5D, 0.5D, 0.5D)) && EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(4) == 0 && EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttachmentPos() == null;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            if (!EntityPrehistoricFloraLandClimbingFlyingBase.this.isDirectPathBetweenPoints(new Vec3d(target))) {
                target = EntityPrehistoricFloraLandClimbingFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraLandClimbingFlyingBase.this, EntityPrehistoricFloraLandClimbingFlyingBase.this.world, EntityPrehistoricFloraLandClimbingFlyingBase.this.posX + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.rand);
            }
            if (EntityPrehistoricFloraLandClimbingFlyingBase.this.world.isAirBlock(target) || isGoingToAttach) {
                if (!EntityPrehistoricFloraLandClimbingFlyingBase.this.isFlying()) {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.selectNavigator();
                }
                EntityPrehistoricFloraLandClimbingFlyingBase.this.moveHelper.setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 0.25D);
                if (EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget() == null) {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

                }
            }
        }
    }

}