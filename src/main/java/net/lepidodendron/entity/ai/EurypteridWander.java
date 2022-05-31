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

//public class FishWander extends EntityAIBase {
public class EurypteridWander extends AnimationAINoAnimation<EntityPrehistoricFloraEurypteridBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraEurypteridBase PrehistoricFloraEurypteridBase;

    public EurypteridWander(EntityPrehistoricFloraEurypteridBase PrehistoricFloraEurypteridBase, Animation animation)
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
                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    this.PrehistoricFloraEurypteridBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, vec3.getY() - 0.99D  , vec3.getZ() + 0.5D, 1.0);

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

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraEurypteridBase.getRNG();
        if (this.PrehistoricFloraEurypteridBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraEurypteridBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                //Prefer targets which are at the bottom:
                BlockPos randPosVar = randPos;
                if (this.PrehistoricFloraEurypteridBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos) && Math.random() < 0.60) {
                    int ii = 0;
                    while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraEurypteridBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
                        randPosVar = randPos.down(ii);
                        ii = ii + 1;
                    }
                    //About half the time float over the bottom:
                    randPos = randPosVar;
                    if (Math.random() > 0.5) {
                        randPos = randPosVar.up();
                    }
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraEurypteridBase.world.getBlockState(randPos).getMaterial() == Material.WATER && this.PrehistoricFloraEurypteridBase.isDirectPathBetweenPoints(this.PrehistoricFloraEurypteridBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraEurypteridBase.getAttackTarget());
            if (this.PrehistoricFloraEurypteridBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}