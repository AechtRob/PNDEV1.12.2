package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class SlitheringWanderBottom extends AnimationAINoAnimation<EntityPrehistoricFloraSlitheringWaterBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraSlitheringWaterBase PrehistoricFloraSlitheringWaterBase;

    public SlitheringWanderBottom(EntityPrehistoricFloraSlitheringWaterBase PrehistoricFloraSlitheringWaterBase, Animation animation)
    {
        super(PrehistoricFloraSlitheringWaterBase);
        setMutexBits(1);
        this.PrehistoricFloraSlitheringWaterBase = PrehistoricFloraSlitheringWaterBase;
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
        if (!this.PrehistoricFloraSlitheringWaterBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if (this.PrehistoricFloraSlitheringWaterBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraSlitheringWaterBase.getNavigator().getPath();
            if (this.PrehistoricFloraSlitheringWaterBase.getNavigator().noPath()) {

                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    this.PrehistoricFloraSlitheringWaterBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY())  , vec3.getZ() + 0.5D, 1.0);

                    return true;
                }
            }
        }
        //System.err.println("No path found");
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return !this.PrehistoricFloraSlitheringWaterBase.getNavigator().noPath();
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraSlitheringWaterBase.getRNG();
        if (this.PrehistoricFloraSlitheringWaterBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                BlockPos randPos = this.PrehistoricFloraSlitheringWaterBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                //Use targets which are at the bottom:
                BlockPos randPosVar = randPos;
                if (this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos)) {
                    int ii = 0;
                    while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
                        randPosVar = randPos.down(ii);
                        ii = ii + 1;
                    }
                    randPos = randPosVar;
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(randPos).getMaterial() == Material.WATER) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraSlitheringWaterBase.getAttackTarget());
            if (this.PrehistoricFloraSlitheringWaterBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}