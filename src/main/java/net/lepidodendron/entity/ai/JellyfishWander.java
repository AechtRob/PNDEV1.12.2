package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraJellyfishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class JellyfishWander extends AnimationAINoAnimation<EntityPrehistoricFloraJellyfishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraJellyfishBase PrehistoricFloraJellyfishBase;

    public JellyfishWander(EntityPrehistoricFloraJellyfishBase PrehistoricFloraJellyfishBase, Animation animation)
    {
        super(PrehistoricFloraJellyfishBase);
        setMutexBits(4);
        this.PrehistoricFloraJellyfishBase = PrehistoricFloraJellyfishBase;
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
        if (!this.PrehistoricFloraJellyfishBase.isInWater()) {
            return false;
        }
        if (this.PrehistoricFloraJellyfishBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraJellyfishBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraJellyfishBase.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase, this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraJellyfishBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraJellyfishBase.width,2))
            )
            {
                this.PrehistoricFloraJellyfishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraJellyfishBase.getNavigator().noPath()) {
                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.entity.posX - this.entity.getPosition().getX();
//                    double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();

                    this.PrehistoricFloraJellyfishBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

                    return true;
                }
            }
        }
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
        Random rand = this.PrehistoricFloraJellyfishBase.getRNG();
        if (this.PrehistoricFloraJellyfishBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraJellyfishBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                if (this.PrehistoricFloraJellyfishBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    boolean surfaceCheck = false;

                    int ii = 0;
                    while (ii < 6 && !surfaceCheck
                            && this.PrehistoricFloraJellyfishBase.world.getBlockState(new BlockPos(randPos).up(ii - 1)).getMaterial() == Material.WATER) { //Defines the top 6 layers of water for the jellyfish to be in
                        if (this.PrehistoricFloraJellyfishBase.world.isAirBlock(new BlockPos(randPos).up(ii))) {
                            surfaceCheck = true;
                        }
                        ii = ii + 1;
                    }

                    //Sometimes target a deeper water block:
                    if (Math.random() > 0.9) {
                        Vec3d randPosV = this.PrehistoricFloraJellyfishBase.getPositionVector();
                        int depth = 0;
                        while ((this.PrehistoricFloraJellyfishBase.world.getBlockState(this.PrehistoricFloraJellyfishBase.getPosition().add(0, -depth, 0)).getMaterial() == Material.WATER)
                                && (this.PrehistoricFloraJellyfishBase.getPositionVector().add(0, -depth, 0).y > 1)) {
                            depth = depth + 1;
                        }
                        //Choose somewhere in that water column:
                        if (depth >= 1) {
                            randPosV = this.PrehistoricFloraJellyfishBase.getPositionVector().add(0, -(depth - rand.nextInt(depth)), 0);
                            if (this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPosV.x, randPosV.y, randPosV.z))) {
                                if (!(randPosV.y < 1 || randPosV.y >= 254)) {
                                    return randPosV;
                                }
                            }
                        }
                    } else {
                        //Target a block near the surface:
                        if (surfaceCheck && this.PrehistoricFloraJellyfishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER
                                && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                            if (!(randPos.y < 1 || randPos.y >= 254)) {
                                return randPos;
                            }
                        } else {
                            //If the jellyfish can just move randomly but generally upwards then do that:
                            if (this.PrehistoricFloraJellyfishBase.world.getBlockState(new BlockPos(randPos).add(0, 6, 0)).getMaterial() == Material.WATER
                                    && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y + 6.0, randPos.z))) {
                                if (!(randPos.y < 1 || randPos.y >= 254)) {
                                    return randPos;
                                }
                            } else {
                                //Otherwise just move randomly:
                                if (this.PrehistoricFloraJellyfishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER
                                        && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                                        return randPos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraJellyfishBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraJellyfishBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}