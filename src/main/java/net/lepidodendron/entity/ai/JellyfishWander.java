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
                                    && this.PrehistoricFloraJellyfishBase.getDistanceSq(path.getFinalPathPoint().x + 0.5, path.getFinalPathPoint().y + 0.5, path.getFinalPathPoint().z + 0.5) < Math.pow(this.PrehistoricFloraJellyfishBase.width,2))
            )
            {
                this.PrehistoricFloraJellyfishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraJellyfishBase.getNavigator().noPath()) {
                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double Xoffset = this.entity.posX - this.entity.getPosition().getX();
                    double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();

                    this.PrehistoricFloraJellyfishBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, vec3.getY() + 0.5D, vec3.getZ() + 0.5D + Zoffset, 1.0);

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

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraJellyfishBase.getRNG();
        if (this.PrehistoricFloraJellyfishBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraJellyfishBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                boolean surfaceCheck = false;
                int ii = 0;
                while (ii < 6 && !surfaceCheck
                    && this.PrehistoricFloraJellyfishBase.world.getBlockState(randPos.up(ii-1)).getMaterial() == Material.WATER)
                { //Defines the top 6 layers of water for the jellyfish to be in
                    if (this.PrehistoricFloraJellyfishBase.world.isAirBlock(randPos.up(ii))) {
                        surfaceCheck = true;
                    }
                    ii = ii + 1;
                }

                //Sometimes target a deeper water block:
                if (Math.random() > 0.9) {
                    BlockPos randPosV = this.PrehistoricFloraJellyfishBase.getPosition();
                    int depth = 0;
                    while ((this.PrehistoricFloraJellyfishBase.world.getBlockState(this.PrehistoricFloraJellyfishBase.getPosition().add(0, -depth, 0)).getMaterial() == Material.WATER)
                            && (this.PrehistoricFloraJellyfishBase.getPosition().add(0, -depth, 0).getY() > 1)) {
                        depth = depth + 1;
                    }
                    //Choose somewhere in that water column:
                    if (depth >= 1) {
                        randPosV = this.PrehistoricFloraJellyfishBase.getPosition().add(0, -(depth - rand.nextInt(depth)), 0);
                        if (this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPosV.getX() + 0.5, randPosV.getY() + 0.5, randPosV.getZ() + 0.5))) {
                            if (!(randPosV.getY() < 1 || randPosV.getY() >= 254)) {
                                return randPosV;
                            }
                        }
                    }
                }
                else {
                    //Target a block near the surface:
                    if (surfaceCheck && this.PrehistoricFloraJellyfishBase.world.getBlockState(randPos).getMaterial() == Material.WATER
                        && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                        if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                            return randPos;
                        }
                    }
                    else {
                        //If the jellyfish can just move randomly but generally upwards then do that:
                        if (this.PrehistoricFloraJellyfishBase.world.getBlockState(randPos.add(0, 6, 0)).getMaterial() == Material.WATER
                                && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 6.5, randPos.getZ() + 0.5))) {
                            if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                                return randPos;
                            }
                        }
                        else {
                            //Otherwise just move randomly:
                            if (this.PrehistoricFloraJellyfishBase.world.getBlockState(randPos).getMaterial() == Material.WATER
                                    && this.PrehistoricFloraJellyfishBase.isDirectPathBetweenPoints(this.PrehistoricFloraJellyfishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                                if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                                    return randPos;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraJellyfishBase.getAttackTarget());
            if (this.PrehistoricFloraJellyfishBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}