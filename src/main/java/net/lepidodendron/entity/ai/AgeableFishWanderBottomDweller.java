package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class AgeableFishWanderBottomDweller extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase;

    public AgeableFishWanderBottomDweller(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation)
    {
        super(PrehistoricFloraAgeableFishBase);
        setMutexBits(4);
        this.PrehistoricFloraAgeableFishBase = PrehistoricFloraAgeableFishBase;
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

        if (!this.PrehistoricFloraAgeableFishBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.PrehistoricFloraAgeableFishBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraAgeableFishBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraAgeableFishBase.getNavigator().noPath())
                            && (!isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase, this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                            ||
                            (path != null && path.getFinalPathPoint() != null
                                    && this.PrehistoricFloraAgeableFishBase.getDistanceSq(path.getFinalPathPoint().x + 0.5, path.getFinalPathPoint().y + 0.5, path.getFinalPathPoint().z + 0.5) < Math.pow(this.PrehistoricFloraAgeableFishBase.width,2))
            )
            {
                this.PrehistoricFloraAgeableFishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraAgeableFishBase.getNavigator().noPath()) {

                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    this.PrehistoricFloraAgeableFishBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY())-1D  , vec3.getZ() + 0.5D, 1.0);

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
            return (((this.PrehistoricFloraAgeableFishBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraAgeableFishBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                && ((this.PrehistoricFloraAgeableFishBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraAgeableFishBase.getRNG();
        if (this.PrehistoricFloraAgeableFishBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                //Prefer targets which are at the bottom:
                BlockPos randPosVar = randPos;
                if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos) && Math.random() < 0.85) {
                    int ii = 0;
                    while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
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
                if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos).getMaterial() == Material.WATER && this.PrehistoricFloraAgeableFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }

                    //return randPos;
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraAgeableFishBase.getAttackTarget());
            if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}