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
public class TrilobiteWanderSwimWaterColumn extends AnimationAINoAnimation<EntityPrehistoricFloraTrilobiteSwimBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraTrilobiteSwimBase PrehistoricFloraTrilobiteSwimBase;

    public TrilobiteWanderSwimWaterColumn(EntityPrehistoricFloraTrilobiteSwimBase PrehistoricFloraTrilobiteSwimBase, Animation animation)
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
                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double Xoffset = this.PrehistoricFloraTrilobiteSwimBase.posX - this.PrehistoricFloraTrilobiteSwimBase.getPosition().getX();
                    double Zoffset = this.PrehistoricFloraTrilobiteSwimBase.posZ - this.PrehistoricFloraTrilobiteSwimBase.getPosition().getZ();

                    this.PrehistoricFloraTrilobiteSwimBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, vec3.getY() - 0.99D  , vec3.getZ() + 0.5D + Zoffset, 1.0);

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

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraTrilobiteSwimBase.getRNG();
        if (this.PrehistoricFloraTrilobiteSwimBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraTrilobiteSwimBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                //Prefer targets which are on the bottom, or very close to it:
                BlockPos randPosVar = randPos;
                if (Math.random() > 0.95) { //5% chance of targeting the bottom!
                    if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos)) {
                        int ii = 0;
                        while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.down(ii);
                            ii = ii + 1;
                        }
                        if (Math.random() > 0.08) {
                            randPos = randPosVar;
                        } else {
                            if (Math.random() > 0.33) {
                                randPos = randPosVar.up();
                            } else {
                                randPos = randPosVar.up(2);
                            }
                        }
                    }
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(randPos).getMaterial() == Material.WATER && this.PrehistoricFloraTrilobiteSwimBase.isDirectPathBetweenPoints(this.PrehistoricFloraTrilobiteSwimBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraTrilobiteSwimBase.getAttackTarget());
            if (this.PrehistoricFloraTrilobiteSwimBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}