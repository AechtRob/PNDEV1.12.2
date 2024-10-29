package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.BlockEggsWaterSurface;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class LandWanderLayInWater extends AnimationAINoAnimation<EntityPrehistoricFloraLandBase> {

    protected EntityPrehistoricFloraLandBase LandBase;

    public LandWanderLayInWater(EntityPrehistoricFloraLandBase LandBase)
    {
        super(LandBase);
        setMutexBits(1);
        this.LandBase = LandBase;
    }

    @Override
    public Animation getAnimation()
    {
        return null;
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

        if (!(this.LandBase.getLaying())) {
            return false;
        }

        if (LandBase.isAnimationDirectionLocked(LandBase.getAnimation())) {
            return false;
        }

        if (!(LandBase.getAISpeedLand() > 0)) {
            return false;
        }

        if (this.LandBase.isReallyInWater()) {
            return false;
        }

        if (this.LandBase.getRNG().nextFloat() < 0.3F) {
            Path path = this.LandBase.getNavigator().getPath();
            if (this.LandBase.isReallyInWater()) {
                //Path path = this.PrehistoricFloraJellyfishBase.getNavigator().getPath();
                if (
                        ((!this.LandBase.getNavigator().noPath())
                                && (!isDirectPathBetweenPoints(this.LandBase, this.LandBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                                ||
                                (path != null && path.getFinalPathPoint() != null
                                        && this.LandBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.LandBase.width,2))
                )
                {
                    this.LandBase.getNavigator().clearPath();
                }
            }
            Vec3d vec3;
            vec3 = this.findWaterTarget(16);

            if (vec3 != null) {
                this.LandBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y  , vec3.z, 1.0);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public Vec3d findWaterTarget(int dist) {
        Random rand = this.LandBase.getRNG();
        if (this.LandBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                Vec3d randPos = this.LandBase.getPositionVector().add(rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2));
                if (this.LandBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER) {
                    if (BlockEggsWaterSurface.block.canPlaceBlockAt(this.LandBase.world, new BlockPos(randPos).up())) {
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }
                    }
                }
            }
        } else {
            return this.LandBase.getAttackTarget().getPositionVector();
        }
        return null;
    }

    public boolean isNearWater(Entity e, BlockPos pos, int WaterDist) {
        int distH = WaterDist;
        if (distH < 1) distH = 1;
        if (distH > 32) distH = 32;
        int distV = 4;
        boolean waterCriteria = false;
        int xct = -distH;
        int yct;
        int zct;
        while ((xct <= distH) && (!waterCriteria)) {
            yct = -distV;
            while ((yct <= distV) && (!waterCriteria)) {
                zct = -distH;
                while ((zct <= distH) && (!waterCriteria)) {
                    if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((e.world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
                        waterCriteria = true;
                    }
                    zct = zct + 1;
                }
                yct = yct + 1;
            }
            xct = xct + 1;
        }

        if (waterCriteria || (WaterDist == 0)) return true;

        return false;

    }

    public boolean isAtTop(BlockPos blockpos) {
        return this.LandBase.world.isAirBlock(blockpos.up());
    }

}