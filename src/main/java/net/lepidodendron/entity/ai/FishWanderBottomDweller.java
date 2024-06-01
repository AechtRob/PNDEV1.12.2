package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.EntityPrehistoricFloraEglonaspis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class FishWanderBottomDweller extends AnimationAINoAnimation<EntityPrehistoricFloraFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraFishBase PrehistoricFloraFishBase;
    protected int bottomdistance;

    public FishWanderBottomDweller(EntityPrehistoricFloraFishBase PrehistoricFloraFishBase, Animation animation, int bottomDistance)
    {
        super(PrehistoricFloraFishBase);
        setMutexBits(4);
        this.PrehistoricFloraFishBase = PrehistoricFloraFishBase;
        this.animation = animation;
        this.bottomdistance = bottomDistance;
    }

    public FishWanderBottomDweller(EntityPrehistoricFloraFishBase PrehistoricFloraFishBase, Animation animation)
    {
        super(PrehistoricFloraFishBase);
        setMutexBits(4);
        this.PrehistoricFloraFishBase = PrehistoricFloraFishBase;
        this.animation = animation;
        this.bottomdistance = 0;
    }

    @Override
    public Animation getAnimation()
    {
        return animation;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
    }

    @Override
    public void updateTask() {
        super.updateTask();

    }

    @Override
    public boolean shouldExecute() {

        if (this.PrehistoricFloraFishBase instanceof EntityPrehistoricFloraEglonaspis) {
            EntityPrehistoricFloraEglonaspis entity = (EntityPrehistoricFloraEglonaspis) this.PrehistoricFloraFishBase;
            if (entity.getBuriedTick() > 0 || entity.getBuried()) {
                return false;
            }
        }
        if (!this.PrehistoricFloraFishBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.PrehistoricFloraFishBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraFishBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraFishBase.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraFishBase, this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraFishBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraFishBase.width,2))
            )
            {
                this.PrehistoricFloraFishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraFishBase.getNavigator().noPath()) {

                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraFishBase.posX - this.PrehistoricFloraFishBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraFishBase.posZ - this.PrehistoricFloraFishBase.getPosition().getZ();

                    this.PrehistoricFloraFishBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

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

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraFishBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraFishBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                && ((this.PrehistoricFloraFishBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.PrehistoricFloraFishBase.getRNG();
        if (this.PrehistoricFloraFishBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraFishBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                if (this.PrehistoricFloraFishBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    //Prefer targets which are at the bottom:

                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                    }
                    Vec3d randPosVar = randPos;
                    if (this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(randPos).down(this.bottomdistance)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos).down(this.bottomdistance)) && Math.random() < 0.85) {
                        int ii = 0;
                        while ((new BlockPos(randPos).down(ii + this.bottomdistance).getY() > 1) && this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(randPos).down(ii + this.bottomdistance)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.add(0, -ii, 0);
                            ii = ii + 1;
                        }
                        //About half the time float over the bottom:
                        randPos = randPosVar;
                        if (Math.random() > 0.5) {
                            randPos = randPosVar.add(0, 1, 0);
                        }
                    }

                    //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraFishBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}