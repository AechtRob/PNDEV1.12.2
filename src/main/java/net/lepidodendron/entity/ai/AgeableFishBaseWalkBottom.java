package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class AgeableFishBaseWalkBottom extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraAgeableFishBase EntityPrehistoricFloraAgeableFishBase;

    public AgeableFishBaseWalkBottom(EntityPrehistoricFloraAgeableFishBase EntityPrehistoricFloraAgeableFishBase, Animation animation)
    {
        super(EntityPrehistoricFloraAgeableFishBase);
        setMutexBits(1);
        this.EntityPrehistoricFloraAgeableFishBase = EntityPrehistoricFloraAgeableFishBase;
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
        if (!this.EntityPrehistoricFloraAgeableFishBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.EntityPrehistoricFloraAgeableFishBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.EntityPrehistoricFloraAgeableFishBase.getNavigator().getPath();
            if (this.EntityPrehistoricFloraAgeableFishBase.getNavigator().noPath()) {

                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.EntityPrehistoricFloraAgeableFishBase.posX - this.EntityPrehistoricFloraAgeableFishBase.getPosition().getX();
//                    double Zoffset = this.EntityPrehistoricFloraAgeableFishBase.posZ - this.EntityPrehistoricFloraAgeableFishBase.getPosition().getZ();
//
//                    this.EntityPrehistoricFloraAgeableFishBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, Math.floor(vec3.getY())  , vec3.getZ() + 0.5D + Zoffset, 1.0);
                    this.EntityPrehistoricFloraAgeableFishBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

                    return true;
                }
            }
        }
        //System.err.println("No path found");
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.EntityPrehistoricFloraAgeableFishBase.getRNG();
        if (this.EntityPrehistoricFloraAgeableFishBase.getAttackTarget() == null) {
//            double Xoffset = this.EntityPrehistoricFloraAgeableFishBase.posX - this.EntityPrehistoricFloraAgeableFishBase.getPosition().getX();
//            double Zoffset = this.EntityPrehistoricFloraAgeableFishBase.posZ - this.EntityPrehistoricFloraAgeableFishBase.getPosition().getZ();

            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.EntityPrehistoricFloraAgeableFishBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                if (!(randPos.y < 1 || randPos.y >= 254)) {
                    randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                }
                //Use targets which are at the bottom:
                Vec3d randPosVar = randPos;
                if (this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos))) {
                    int ii = 0;
                    while ((new BlockPos(randPos).down(ii).getY() > 1) && this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                        randPosVar = randPos.add(0, -ii,0);
                        ii = ii + 1;
                    }
                    randPos = randPosVar;
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER) {
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.EntityPrehistoricFloraAgeableFishBase.getAttackTarget().getPositionVector();
            if (this.EntityPrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}