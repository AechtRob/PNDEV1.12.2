package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class EurypteridWander extends EntityAIBase {
public class EurypteridWanderBottomDweller extends AnimationAINoAnimation<EntityPrehistoricFloraEurypteridBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraEurypteridBase PrehistoricFloraEurypteridBase;

    public EurypteridWanderBottomDweller(EntityPrehistoricFloraEurypteridBase PrehistoricFloraEurypteridBase, Animation animation)
    {
        super(PrehistoricFloraEurypteridBase);
        setMutexBits(4);
        this.PrehistoricFloraEurypteridBase = PrehistoricFloraEurypteridBase;
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
        if (!this.PrehistoricFloraEurypteridBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.PrehistoricFloraEurypteridBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraEurypteridBase.getNavigator().getPath();
            if (!this.PrehistoricFloraEurypteridBase.getNavigator().noPath() && !isDirectPathBetweenPoints(this.PrehistoricFloraEurypteridBase, this.PrehistoricFloraEurypteridBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))) {
                this.PrehistoricFloraEurypteridBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraEurypteridBase.getNavigator().noPath()) {

                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraEurypteridBase.posX - this.PrehistoricFloraEurypteridBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraEurypteridBase.posZ - this.PrehistoricFloraEurypteridBase.getPosition().getZ();

                    this.PrehistoricFloraEurypteridBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y , vec3.z, 1.0);
                    //System.err.println("Movetotarget: " + vec3.getX() + " " + vec3.getY() + " " + vec3.getZ());
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
            return (((this.PrehistoricFloraEurypteridBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraEurypteridBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                && ((this.PrehistoricFloraEurypteridBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.PrehistoricFloraEurypteridBase.getRNG();
        if (this.PrehistoricFloraEurypteridBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraEurypteridBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                if (this.PrehistoricFloraEurypteridBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    //Prefer targets which are at the bottom:

                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                    }
                    Vec3d randPosVar = randPos;
                    if (this.PrehistoricFloraEurypteridBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos)) && Math.random() < 0.90) {
                        int ii = 0;
                        while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraEurypteridBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.add(0, -ii, 0);
                            ii = ii + 1;
                        }
                        //About half the time float over the bottom:
                        randPos = randPosVar;
                        if (Math.random() > 0.5) {
                            randPos = randPosVar.add(0, 1, 0);
                        }
                    }

                    //System.err.println("Path to target " + this.PrehistoricFloraEurypteridBase.isDirectPathBetweenPoints(this.PrehistoricFloraEurypteridBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5)));
                    //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (this.PrehistoricFloraEurypteridBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraEurypteridBase.isDirectPathBetweenPoints(this.PrehistoricFloraEurypteridBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        //System.err.println("Movetotarget1: " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                        if (!(randPos.y < 2 || randPos.y >= 254)) {
                            return randPos;
                        }
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraEurypteridBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraEurypteridBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                //System.err.println("Movetotarget1: " + blockpos1.getX() + " " + blockpos1.getY() + " " + blockpos1.getZ());
                return blockpos1;
            }
        }
        //System.err.println("Returning null target");
        return null;
    }
}