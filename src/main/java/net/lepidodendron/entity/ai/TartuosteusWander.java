package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.EntityPrehistoricFloraTartuosteus;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class TartuosteusWander extends AnimationAINoAnimation<EntityPrehistoricFloraTartuosteus> {

    protected Animation animation;
    protected EntityPrehistoricFloraTartuosteus PrehistoricFloraTartuosteus;

    public TartuosteusWander(EntityPrehistoricFloraTartuosteus PrehistoricFloraTartuosteus, Animation animation)
    {
        super(PrehistoricFloraTartuosteus);
        setMutexBits(4);
        this.PrehistoricFloraTartuosteus = PrehistoricFloraTartuosteus;
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
        if (!this.PrehistoricFloraTartuosteus.isInWater()) {
            return false;
        }
        if (this.PrehistoricFloraTartuosteus.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraTartuosteus.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraTartuosteus.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraTartuosteus, this.PrehistoricFloraTartuosteus.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraTartuosteus.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraTartuosteus.width,2))
            )
            {
                this.PrehistoricFloraTartuosteus.getNavigator().clearPath();
            }
            if (!this.PrehistoricFloraTartuosteus.getNavigator().noPath() && this.PrehistoricFloraTartuosteus.isHungry() && (!(isAtBottom(new BlockPos(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))) {
                this.PrehistoricFloraTartuosteus.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraTartuosteus.getNavigator().noPath()) {
                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double feedAdj = 0.5d;
                    if (this.PrehistoricFloraTartuosteus.isHungry()) {feedAdj = -1D;}
//                    double Xoffset = this.PrehistoricFloraTartuosteus.posX - this.PrehistoricFloraTartuosteus.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraTartuosteus.posZ - this.PrehistoricFloraTartuosteus.getPosition().getZ();

                    this.PrehistoricFloraTartuosteus.getNavigator().tryMoveToXYZ(vec3.x, vec3.y + feedAdj, vec3.z, 1.0);
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
        Random rand = this.PrehistoricFloraTartuosteus.getRNG();
        if (this.PrehistoricFloraTartuosteus.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraTartuosteus.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                if (this.PrehistoricFloraTartuosteus.world.isBlockLoaded(new BlockPos(randPos))) {
                    Vec3d randPosVar = randPos;

                    //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraTartuosteus.getPosition().getY() + " " + randPos.getZ());
                    if (this.PrehistoricFloraTartuosteus.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraTartuosteus.isDirectPathBetweenPoints(this.PrehistoricFloraTartuosteus.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        if (this.PrehistoricFloraTartuosteus.isHungry()) {
                            int ii = 0;
                            while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraTartuosteus.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
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
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraTartuosteus.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraTartuosteus.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraTartuosteus.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraTartuosteus.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraTartuosteus.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

}