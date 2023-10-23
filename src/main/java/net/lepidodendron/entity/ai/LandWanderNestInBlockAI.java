package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class LandWanderNestInBlockAI extends AnimationAINoAnimation<EntityPrehistoricFloraLandBase> {

    protected EntityPrehistoricFloraLandBase PrehistoricFloraLandBase;

    public LandWanderNestInBlockAI(EntityPrehistoricFloraLandBase PrehistoricFloraLandBase)
    {
        super(PrehistoricFloraLandBase);
        setMutexBits(1);
        this.PrehistoricFloraLandBase = PrehistoricFloraLandBase;
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

        if (!(this.PrehistoricFloraLandBase.laysEggs() && this.PrehistoricFloraLandBase.getLaying())) {
            return false;
        }

        if (this.PrehistoricFloraLandBase.isReallyInWater()) {
            return false;
        }

        if (PrehistoricFloraLandBase.isAnimationDirectionLocked(PrehistoricFloraLandBase.getAnimation())) {
            return false;
        }

        if (!(PrehistoricFloraLandBase.getAISpeedLand() > 0)) {
            return false;
        }

        //System.err.println("Ticks: " + this.PrehistoricFloraLandBase.getTicks());

        int xx;
        int yy;
        int zz;
        BlockPos vec3 = null;

        Path path = this.PrehistoricFloraLandBase.getNavigator().getPath();
        if ((!this.PrehistoricFloraLandBase.getNavigator().noPath()) && path != null) {
            xx = this.PrehistoricFloraLandBase.getNavigator().getPath().getFinalPathPoint().x;
            yy = this.PrehistoricFloraLandBase.getNavigator().getPath().getFinalPathPoint().y;
            zz = this.PrehistoricFloraLandBase.getNavigator().getPath().getFinalPathPoint().z;
            if (nestBlockMatch(this.PrehistoricFloraLandBase.world, new BlockPos(xx, yy, zz))) {
                vec3 = new BlockPos(xx, yy, zz);
            }
            else {
                vec3 = this.findBlockTarget(32);
            }
        }
        else {
            vec3 = this.findBlockTarget(32);
        }
        if (vec3 != null) {
//            double Xoffset = this.PrehistoricFloraLandBase.posX - this.PrehistoricFloraLandBase.getPosition().getX();
//            double Zoffset = this.PrehistoricFloraLandBase.posZ - this.PrehistoricFloraLandBase.getPosition().getZ();

            this.PrehistoricFloraLandBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY())  , vec3.getZ() + 0.5D, 1.0);
            return true;
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

    public BlockPos findBlockTarget(int dist) {
        Random rand = this.PrehistoricFloraLandBase.getRNG();
        if (this.PrehistoricFloraLandBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                BlockPos randPos = this.PrehistoricFloraLandBase.getPosition().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt((int) (dist/2)+1) - (int) (dist/4), rand.nextInt(dist+1) - (int) (dist/2));
                if (nestBlockMatch(this.PrehistoricFloraLandBase.world, randPos)) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        }
        return null;
    }

    public boolean nestBlockMatch(World world, BlockPos pos) {
        return this.PrehistoricFloraLandBase.nestBlockMatch(world, pos);
    }


}