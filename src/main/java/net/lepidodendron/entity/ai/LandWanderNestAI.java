package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.EntityPrehistoricFloraPlateosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class LandWanderNestAI extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableBase> {

    protected EntityPrehistoricFloraAgeableBase PrehistoricFloraAgeableBase;

    public LandWanderNestAI(EntityPrehistoricFloraAgeableBase PrehistoricFloraAgeableBase)
    {
        super(PrehistoricFloraAgeableBase);
        setMutexBits(1);
        this.PrehistoricFloraAgeableBase = PrehistoricFloraAgeableBase;
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

        if (!(this.PrehistoricFloraAgeableBase.laysEggs() && this.PrehistoricFloraAgeableBase.getCanBreed() && LepidodendronConfig.doMultiplyMobs)) {
            return false;
        }

        if (this.PrehistoricFloraAgeableBase instanceof EntityPrehistoricFloraLandBase)
        {
            EntityPrehistoricFloraLandBase LandBase = (EntityPrehistoricFloraLandBase) this.PrehistoricFloraAgeableBase;
            if (LandBase.isReallyInWater()) {
                return false;
            }

            if (LandBase.getAnimation() == LandBase.DRINK_ANIMATION) {
                return false;
            }

            if (this.PrehistoricFloraAgeableBase instanceof EntityPrehistoricFloraPlateosaurus) {
                EntityPrehistoricFloraPlateosaurus PlateosaurusBase = (EntityPrehistoricFloraPlateosaurus) this.PrehistoricFloraAgeableBase;
                if (PlateosaurusBase.getAnimation() == PlateosaurusBase.STAND_ANIMATION) {
                    return false;
                }
            }

            if (this.PrehistoricFloraAgeableBase instanceof EntityPrehistoricFloraPlateosaurus) {
                EntityPrehistoricFloraPlateosaurus PlateosaurusBase = (EntityPrehistoricFloraPlateosaurus) this.PrehistoricFloraAgeableBase;
                if (PlateosaurusBase.getAnimation() == PlateosaurusBase.STAND_ANIMATION) {
                    return false;
                }
            }
        }
        //System.err.println("Ticks: " + this.PrehistoricFloraAgeableBase.getTicks());

        int xx;
        int yy;
        int zz;
        BlockPos vec3 = null;

        Path path = this.PrehistoricFloraAgeableBase.getNavigator().getPath();
        if (!this.PrehistoricFloraAgeableBase.getNavigator().noPath() && path != null) {
            xx = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().x;
            yy = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().y;
            zz = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().z;
            BlockPos pos = new BlockPos(xx, yy, zz);
            World world = this.PrehistoricFloraAgeableBase.world;

            if (this.PrehistoricFloraAgeableBase.isMyNest(world, pos)) {
                vec3 = pos;
            }
            else {
                vec3 = this.findBlockTarget(32);
            }
        }
        else {
            vec3 = this.findBlockTarget(32);
        }
        if (vec3 != null) {
            double Xoffset = this.PrehistoricFloraAgeableBase.posX - this.PrehistoricFloraAgeableBase.getPosition().getX();
            double Zoffset = this.PrehistoricFloraAgeableBase.posZ - this.PrehistoricFloraAgeableBase.getPosition().getZ();

            this.PrehistoricFloraAgeableBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, Math.floor(vec3.getY()) + 0.5D  , vec3.getZ() + 0.5D + Zoffset, 1.0);
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
        Random rand = this.PrehistoricFloraAgeableBase.getRNG();
        if (this.PrehistoricFloraAgeableBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                BlockPos randPos = this.PrehistoricFloraAgeableBase.getPosition().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt((int) (dist/2)+1) - (int) (dist/4), rand.nextInt(dist+1) - (int) (dist/2));
                World world = this.PrehistoricFloraAgeableBase.world;
                if (this.PrehistoricFloraAgeableBase.isMyNest(world, randPos)) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        }
        return null;
    }


}