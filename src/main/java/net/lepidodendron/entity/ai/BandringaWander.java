package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.EntityPrehistoricFloraBandringa;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class BandringaWander extends AnimationAINoAnimation<EntityPrehistoricFloraBandringa> {

    protected Animation animation;
    protected EntityPrehistoricFloraBandringa PrehistoricFloraBandringa;

    public BandringaWander(EntityPrehistoricFloraBandringa PrehistoricFloraBandringa, Animation animation)
    {
        super(PrehistoricFloraBandringa);
        setMutexBits(4);
        this.PrehistoricFloraBandringa = PrehistoricFloraBandringa;
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
        if (!this.PrehistoricFloraBandringa.isInWater()) {
            return false;
        }
        if (this.PrehistoricFloraBandringa.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraBandringa.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraBandringa.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraBandringa, this.PrehistoricFloraBandringa.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraBandringa.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraBandringa.width,2))
            )
            {
                this.PrehistoricFloraBandringa.getNavigator().clearPath();
            }
            if (!this.PrehistoricFloraBandringa.getNavigator().noPath() && this.PrehistoricFloraBandringa.isHungry() && (!(isAtBottom(new BlockPos(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))) {
                this.PrehistoricFloraBandringa.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraBandringa.getNavigator().noPath()) {
                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double feedAdj = 0.5d;
                    if (this.PrehistoricFloraBandringa.isHungry()) {feedAdj = -1D;}

                    this.PrehistoricFloraBandringa.getNavigator().tryMoveToXYZ(vec3.x, vec3.y + feedAdj, vec3.z, 1.0);
                    //System.err.println("Vector target: " + (vec3.getX() + 0.5D) + " " + (vec3.getY() + feedAdj) + " " + (vec3.getZ() + 0.5D));
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
        Random rand = this.PrehistoricFloraBandringa.getRNG();
        if (this.PrehistoricFloraBandringa.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraBandringa.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                Vec3d randPosVar = randPos;
                //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraBandringa.getPosition().getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraBandringa.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraBandringa.isDirectPathBetweenPoints(this.PrehistoricFloraBandringa.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.x))) {
                    if (this.PrehistoricFloraBandringa.isHungry()) {
                        int ii = 0;
                        while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraBandringa.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.add(0, -ii, 0);
                            ii = ii + 1;
                        }
                        randPos = randPosVar;
                    }
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraBandringa.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraBandringa.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraBandringa.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraBandringa.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraBandringa.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

}