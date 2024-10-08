package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteSwimBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class TrilobiteWanderSwim extends AnimationAINoAnimation<EntityPrehistoricFloraTrilobiteSwimBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraTrilobiteSwimBase PrehistoricFloraTrilobiteSwimBase;

    public TrilobiteWanderSwim(EntityPrehistoricFloraTrilobiteSwimBase PrehistoricFloraTrilobiteSwimBase, Animation animation)
    {
        super(PrehistoricFloraTrilobiteSwimBase);
        setMutexBits(1);
        this.PrehistoricFloraTrilobiteSwimBase = PrehistoricFloraTrilobiteSwimBase;
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
        if (!this.PrehistoricFloraTrilobiteSwimBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.PrehistoricFloraTrilobiteSwimBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraTrilobiteSwimBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraTrilobiteSwimBase.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraTrilobiteSwimBase, this.PrehistoricFloraTrilobiteSwimBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraTrilobiteSwimBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraTrilobiteSwimBase.width,2))
            )
            {
                this.PrehistoricFloraTrilobiteSwimBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraTrilobiteSwimBase.getNavigator().noPath()) {
                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraTrilobiteSwimBase.posX - this.PrehistoricFloraTrilobiteSwimBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraTrilobiteSwimBase.posZ - this.PrehistoricFloraTrilobiteSwimBase.getPosition().getZ();

                    this.PrehistoricFloraTrilobiteSwimBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y - 1, vec3.z, 1.0);

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
            return (((this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.PrehistoricFloraTrilobiteSwimBase.getRNG();
        if (this.PrehistoricFloraTrilobiteSwimBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraTrilobiteSwimBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                if (this.PrehistoricFloraTrilobiteSwimBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    //Prefer targets which are on the bottom, or very close to it:

                    Vec3d randPosVar = randPos;
                    if (Math.random() > 0.02) { //Tiny chance of swimming higher!
                        if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos))) {
                            int ii = 0;
                            while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                                randPosVar = randPos.add(0, -ii, 0);
                                ii = ii + 1;
                            }
                            if (Math.random() > 0.08) {
                                randPos = randPosVar;
                            } else {
                                if (Math.random() > 0.33) {
                                    randPos = randPosVar.add(0, 1, 0);
                                } else {
                                    randPos = randPosVar.add(0, 2, 0);
                                }
                            }
                        }
                    }

                    //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraTrilobiteSwimBase.isDirectPathBetweenPoints(this.PrehistoricFloraTrilobiteSwimBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraTrilobiteSwimBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}