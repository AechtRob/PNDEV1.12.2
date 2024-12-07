package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraFishBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.ShoalFishBaseAI;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraAquaticSticker extends EntityPrehistoricFloraFishBase implements IAnimatedEntity, IPrehistoricDiet {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.FACING);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.OPTIONAL_BLOCK_POS);

    public int sitCooldown = 0;
    public int alarmCooldown;
    public int sitTickCt = 0;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    public float flyProgress;
//    public boolean isAttached = false;

    public EntityPrehistoricFloraAquaticSticker(World world) {
        super(world);
        this.enablePersistence();
        if (world != null) {
            if (this.isSlowAtBottom()) {
                this.moveHelper = new EntityPrehistoricFloraAquaticSticker.SwimmingMoveHelperBase();
            } else {
                this.moveHelper = new EntityPrehistoricFloraAquaticSticker.SwimmingMoveHelper();
            }
            this.navigator = new PathNavigateSwimmer(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    public void setNavigator() {
        if (this.isSlowAtBottom()) {
            this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelperBase();
        } else {
            this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelper();
        }
        this.navigator = new PathNavigateSwimmer(this, world);
    }


    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
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

    @Override
    public boolean isMovementBlocked() {
        return isSitting();
    }

    public boolean isMovementBlockedSoft() {
        return isMovementBlocked() ;
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.dataManager.set(SIT_FACE, EnumFacing.byIndex(compound.getByte("SitFace")));
        this.sitCooldown = compound.getInteger("SitCooldown");
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
        this.sitTickCt = 0;
        sitCooldown = 800 + rand.nextInt(600);
        this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
        this.setAttachmentPos(null);
        return super.attackEntityFrom(ds, f);
    }

    public boolean isSwimming() {
        return this.isReallyInWater() && ! this.isSitting();
    }

    public boolean isFlying() {
        return !this.isSitting();
    }

    @Override
    public void onLivingUpdate() {
//        if (this.getAttachmentFacing() == EnumFacing.DOWN) {
//            isAttached = false;
//        }
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.isSitting()) {
            ticksSitted++;

        }
        if (!world.isRemote && !this.isBeingRidden() && !this.isSitting() && this.getRNG().nextInt(1000) == 1 && (this.getAnimation() == NO_ANIMATION)) {
            this.setSitting(true);
            ticksSitted = 0;
        }

        if (!world.isRemote && (this.isSitting() && ticksSitted > 100 && this.getRNG().nextInt(100) == 1)) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        if (!this.isInWater()) {
            this.setSitting(false);
            ticksSitted = 0;
        }


        boolean flying = isFlying();
        if (sitCooldown > 0) {
            sitCooldown--;
        }


        //TODO this bit is unsure, I want to check if the mod is adjacent to a wall, and if adjacent AND sitCooldown is = 0, then attach, and mob will be rotated in render
        //isAttached is supposed to be usable as a checker elsewehre such as in Model class, however, its being set back to false somewhere even after being set to true, this is a bug
        //the attachment code here also does not account for glass, which these should be allowed to attach to, and does not seem to set the correct attachment facing every time, it sets correctly only some of the times.
        //Attachment code is calculated by checking if the block to the north/east/south/west is solid, as checking just sidePos, results in always false, since the mob is in water.
        if (this.getAttachmentPos() == null) {
            sitTickCt = 0;
            if (collided && sitCooldown == 0 && !onGround){
                sitCooldown = 5;
                Vec3d vec3d = this.getPositionEyes(0);
                Vec3d vec3d1 = this.getLook(0);
                Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
                RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, false);
                if (rayTrace != null && rayTrace.hitVec != null) {
                    BlockPos sidePos = rayTrace.getBlockPos();
                    try {
                        //If collided, check which side, set sit_face to correct side, which will be used in render to rotate model
                        if (world.isSideSolid(sidePos, rayTrace.sideHit)) {
                            this.setAttachmentPos(sidePos);
                            this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                            this.motionX = 0.0D;
                            this.motionY = 0.0D;
                            this.motionZ = 0.0D;
                        }
                    }
                    catch (Error e) {}
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
                    this.posZ = this.getPosition().getZ() + (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                    this.posZ = this.getPosition().getZ() + 1 - (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.WEST) {
                    this.posX = this.getPosition().getX() + (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.EAST) {
                    this.posX = this.getPosition().getX() + 1 - (this.width / 2F);
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
        if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0) {
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

    }

    protected void initEntityAI() {
        tasks.addTask(0, new EntityMateAIFishBase(this, 1));
        tasks.addTask(1, new ShoalFishBaseAI(this, 1, true));
        tasks.addTask(2, new AIWanderAquaticSticker());
        this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraFishBaseAI(this));
    }

    public int sitTickCtMax() {
        return 1150;
    }

    public int sitCooldownSetter() {
        return 500 + rand.nextInt(1500);
    }

    class AIWanderAquaticSticker extends EntityAIBase {
        BlockPos target;
        boolean isGoingToAttach = false;

        public AIWanderAquaticSticker() {
            this.setMutexBits(4);
        }

        public boolean isAutomatic() {
            return true;
        }

        @Override
        public void startExecuting() {
            super.startExecuting();
        }

        @Override
        public boolean shouldExecute() {
            if (!EntityPrehistoricFloraAquaticSticker.this.isInWater()) {
                return false;
            }

            if (EntityPrehistoricFloraAquaticSticker.this.sitCooldown == 0) {
                for(int i = 0; i < 15; i++){
                    BlockPos randomPos = new BlockPos(EntityPrehistoricFloraAquaticSticker.this).add(rand.nextInt(17) - 8, rand.nextInt(11) - 5, rand.nextInt(17) - 8);

                    if ((!world.isAirBlock(randomPos)) && (world.getBlockState(randomPos).getMaterial() != Material.WATER) && (world.getBlockState(randomPos).getMaterial() != Material.LAVA)) {
                        RayTraceResult rayTrace = world.rayTraceBlocks(EntityPrehistoricFloraAquaticSticker.this.getPositionVector().add(0, 0.25, 0), new Vec3d(randomPos).add(0.5, 0.5, 0.5), false);
                        if (rayTrace != null && rayTrace.hitVec != null) {
                            try {
                                if ((!world.isSideSolid(rayTrace.getBlockPos(), rayTrace.sideHit)) && (world.getBlockState(rayTrace.getBlockPos()).getMaterial() != Material.WATER)) {
                                    target = rayTrace.getBlockPos();
                                    isGoingToAttach = true;
                                }
                            }
                            catch (Error e) {}
                        }
                    }
                }
            }

            if (EntityPrehistoricFloraAquaticSticker.this.getRNG().nextFloat() < 0.5F) {
                Path path = EntityPrehistoricFloraAquaticSticker.this.getNavigator().getPath();
                if (
                        ((!EntityPrehistoricFloraAquaticSticker.this.getNavigator().noPath())
                                && (!isDirectPathBetweenPoints(EntityPrehistoricFloraAquaticSticker.this, EntityPrehistoricFloraAquaticSticker.this.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                                ||
                                (path != null && path.getFinalPathPoint() != null
                                        && EntityPrehistoricFloraAquaticSticker.this.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(EntityPrehistoricFloraAquaticSticker.this.width,2))
                )
                {
                    EntityPrehistoricFloraAquaticSticker.this.getNavigator().clearPath();
                }
                if (EntityPrehistoricFloraAquaticSticker.this.getNavigator().noPath()) {
                    Vec3d vec3 = this.findWaterTarget();
                    if (vec3 != null) {
//                    double Xoffset = EntityPrehistoricFloraAquaticSticker.this.posX - EntityPrehistoricFloraAquaticSticker.this.getPosition().getX();
//                    double Zoffset = EntityPrehistoricFloraAquaticSticker.this.posZ - EntityPrehistoricFloraAquaticSticker.this.getPosition().getZ();
                        EntityPrehistoricFloraAquaticSticker.this.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

                        return true;
                    }
                }
            }
            //System.err.println("No path found");
            return false;
        }

        public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
            RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
            return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
        }

        @Override
        public boolean shouldContinueExecuting() {
            return false;
        }

        public Vec3d findWaterTarget() {
            Random rand = EntityPrehistoricFloraAquaticSticker.this.getRNG();
            if (EntityPrehistoricFloraAquaticSticker.this.getAttackTarget() == null) {
                for (int i = 0; i < 10; i++) {
                    Vec3d randPos = EntityPrehistoricFloraAquaticSticker.this.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                    if (EntityPrehistoricFloraAquaticSticker.this.world.isBlockLoaded(new BlockPos(randPos))) {
                        //System.err.println("Target " + randPos.getX() + " " + EntityPrehistoricFloraAquaticSticker.this.getPosition().getY() + " " + randPos.getZ());
                        if (EntityPrehistoricFloraAquaticSticker.this.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && EntityPrehistoricFloraAquaticSticker.this.isDirectPathBetweenPoints(EntityPrehistoricFloraAquaticSticker.this.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                            if (!(randPos.y < 1 || randPos.y >= 254)) {
                                return randPos;
                            }
                        }
                    }
                }
            } else {
                Vec3d blockpos1;
                blockpos1 = EntityPrehistoricFloraAquaticSticker.this.getAttackTarget().getPositionVector();
                if (EntityPrehistoricFloraAquaticSticker.this.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                    return blockpos1;
                }
            }
            return null;
        }

        public void updateTask() {
            super.updateTask();

            if (target != null) {
                if (EntityPrehistoricFloraAquaticSticker.this.world.isBlockLoaded(target)) {
                    if (EntityPrehistoricFloraAquaticSticker.this.world.getBlockState(target).getMaterial() == Material.WATER || isGoingToAttach) {
                        if (!EntityPrehistoricFloraAquaticSticker.this.isFlying()) {
                            EntityPrehistoricFloraAquaticSticker.this.setNavigator();
                        }
                        EntityPrehistoricFloraAquaticSticker.this.moveHelper.setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 0.25D);
                        if (EntityPrehistoricFloraAquaticSticker.this.getAttackTarget() == null) {
                            EntityPrehistoricFloraAquaticSticker.this.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

                        }
                    }
                }
            }
        }
    }



}