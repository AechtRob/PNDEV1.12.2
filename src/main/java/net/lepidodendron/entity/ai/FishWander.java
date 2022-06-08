package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class FishWander extends AnimationAINoAnimation<EntityPrehistoricFloraFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraFishBase PrehistoricFloraFishBase;

    public FishWander(EntityPrehistoricFloraFishBase PrehistoricFloraFishBase, Animation animation)
    {
        super(PrehistoricFloraFishBase);
        setMutexBits(4);
        this.PrehistoricFloraFishBase = PrehistoricFloraFishBase;
        this.animation = animation;
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
        if (!this.PrehistoricFloraFishBase.isInWater()) {
            return false;
        }
        if (this.PrehistoricFloraFishBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraFishBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraFishBase.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraFishBase, this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraFishBase.getDistanceSq(path.getFinalPathPoint().x + 0.5, path.getFinalPathPoint().y + 0.5, path.getFinalPathPoint().z + 0.5) < Math.pow(this.PrehistoricFloraFishBase.width,2))
            )
            {
                this.PrehistoricFloraFishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraFishBase.getNavigator().noPath()) {
                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double Xoffset = this.PrehistoricFloraFishBase.posX - this.PrehistoricFloraFishBase.getPosition().getX();
                    double Zoffset = this.PrehistoricFloraFishBase.posZ - this.PrehistoricFloraFishBase.getPosition().getZ();
                    this.PrehistoricFloraFishBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, vec3.getY() + 0.5D, vec3.getZ() + 0.5D + Zoffset, 1.0);

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

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraFishBase.getRNG();
        if (this.PrehistoricFloraFishBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraFishBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraFishBase.getPosition().getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraFishBase.world.getBlockState(randPos).getMaterial() == Material.WATER && this.PrehistoricFloraFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraFishBase.getAttackTarget());
            if (this.PrehistoricFloraFishBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}