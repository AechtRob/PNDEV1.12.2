package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.EntityPrehistoricFloraPlectronoceras;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class TrilobiteWanderBottom extends AnimationAINoAnimation<EntityPrehistoricFloraTrilobiteBottomBase> {

    protected Animation animation;

    protected EntityPrehistoricFloraTrilobiteBottomBase PrehistoricFloraTrilobiteBase;

    public TrilobiteWanderBottom(EntityPrehistoricFloraTrilobiteBottomBase PrehistoricFloraTrilobiteBase, Animation animation)
    {
        super(PrehistoricFloraTrilobiteBase);
        setMutexBits(1);
        this.PrehistoricFloraTrilobiteBase = PrehistoricFloraTrilobiteBase;
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
        if (!this.PrehistoricFloraTrilobiteBase.isInWater()) {
            //System.err.println("Not in water");
            return false;
        }
        if(this.PrehistoricFloraTrilobiteBase instanceof EntityPrehistoricFloraPlectronoceras){
            EntityPrehistoricFloraPlectronoceras e = (EntityPrehistoricFloraPlectronoceras)this.PrehistoricFloraTrilobiteBase;

            if(e.jumpCooldown > 0 && this.PrehistoricFloraTrilobiteBase.getNavigator().noPath()){
                return false;
            }
        }
        if (this.PrehistoricFloraTrilobiteBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraTrilobiteBase.getNavigator().getPath();
            if (this.PrehistoricFloraTrilobiteBase.getNavigator().noPath()) {

                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraTrilobiteBase.posX - this.PrehistoricFloraTrilobiteBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraTrilobiteBase.posZ - this.PrehistoricFloraTrilobiteBase.getPosition().getZ();

                    this.PrehistoricFloraTrilobiteBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

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
            return (((this.PrehistoricFloraTrilobiteBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraTrilobiteBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraTrilobiteBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.PrehistoricFloraTrilobiteBase.getRNG();
        if (this.PrehistoricFloraTrilobiteBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d randPos = this.PrehistoricFloraTrilobiteBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                //Use targets which are at the bottom:
                if (!(randPos.y < 1 || randPos.y >= 254)) {
                    randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                }
                Vec3d randPosVar = randPos;
                if (this.PrehistoricFloraTrilobiteBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos))) {
                    int ii = 0;
                    while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraTrilobiteBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                        randPosVar = randPos.add(0,-ii,0);
                        ii = ii + 1;
                    }
                    randPos = randPosVar;
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraTrilobiteBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER) {
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraTrilobiteBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraTrilobiteBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }
}