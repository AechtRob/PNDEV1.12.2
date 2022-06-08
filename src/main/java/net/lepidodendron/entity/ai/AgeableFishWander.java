package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class AgeableFishWander extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase;
    protected double straightness;
    protected int surfacelove;
    protected boolean persistent;

    public AgeableFishWander(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation, double straightness, int surfacelove, boolean persistent)
    {
        super(PrehistoricFloraAgeableFishBase);
        setMutexBits(4);
        this.PrehistoricFloraAgeableFishBase = PrehistoricFloraAgeableFishBase;
        this.animation = animation;
        this.straightness = straightness;
        this.surfacelove = surfacelove; //-10 to +10
        this.persistent = persistent;
    }

    public AgeableFishWander(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation, double straightness, int surfacelove)
    {
        super(PrehistoricFloraAgeableFishBase);
        setMutexBits(4);
        this.PrehistoricFloraAgeableFishBase = PrehistoricFloraAgeableFishBase;
        this.animation = animation;
        this.straightness = straightness;
        this.surfacelove = surfacelove; //-10 to +10
        this.persistent = false;
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
            return false;
        }
        if (this.PrehistoricFloraAgeableFishBase.getRNG().nextFloat() < 0.5F || this.persistent) {
            Path path = this.PrehistoricFloraAgeableFishBase.getNavigator().getPath();
            if (
                    ((!this.PrehistoricFloraAgeableFishBase.getNavigator().noPath())
                        && (!isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase, this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                        ||
                        (path != null && path.getFinalPathPoint() != null
                                && this.PrehistoricFloraAgeableFishBase.getDistanceSq(path.getFinalPathPoint().x + 0.5, path.getFinalPathPoint().y + 0.5, path.getFinalPathPoint().z + 0.5) <= Math.pow(this.PrehistoricFloraAgeableFishBase.width,2))
            )
            {
                this.PrehistoricFloraAgeableFishBase.getNavigator().clearPath();
            }
            if (this.PrehistoricFloraAgeableFishBase.getNavigator().noPath()) {
                BlockPos vec3 = this.findWaterTarget();
                if (vec3 != null) {
                    double Xoffset = this.PrehistoricFloraAgeableFishBase.posX - this.PrehistoricFloraAgeableFishBase.getPosition().getX();
                    double Zoffset = this.PrehistoricFloraAgeableFishBase.posZ - this.PrehistoricFloraAgeableFishBase.getPosition().getZ();
                    this.PrehistoricFloraAgeableFishBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, vec3.getY() + 0.5D, vec3.getZ() + 0.5D + Zoffset, 1.0);

                    return true;
                }
            }
            else {
                return true;
            }
        }

        //System.err.println("No path found 1");
        return false;
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    @Override
    public boolean shouldContinueExecuting() {
        if (this.PrehistoricFloraAgeableFishBase.getNavigator().noPath()) {
            //System.err.println("No path found 2a");
            return false;
        }
        Path path = this.PrehistoricFloraAgeableFishBase.getNavigator().getPath();

        if ((!isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase, this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z)))
            ||
            (path != null && path.getFinalPathPoint() != null
                && this.PrehistoricFloraAgeableFishBase.getDistanceSq(path.getFinalPathPoint().x + 0.5, path.getFinalPathPoint().y + 0.5, path.getFinalPathPoint().z + 0.5) < Math.pow(this.PrehistoricFloraAgeableFishBase.width,2))
        ) {
            //System.err.println("No path found 2b");
            return false;
        }

        return true;
    }

    public BlockPos findWaterTarget() {
        Random rand = this.PrehistoricFloraAgeableFishBase.getRNG();
        if (this.PrehistoricFloraAgeableFishBase.getAttackTarget() == null) {
            for (int i = 0; i < 4; i++) {
                BlockPos randPos = null;
                if (Math.random() > straightness) {
                    if (this.PrehistoricFloraAgeableFishBase.getHorizontalFacing() == EnumFacing.NORTH) {
                        randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(5) - 2, rand.nextInt(9) - 4, rand.nextInt(17) - 16);
                    }
                    if (this.PrehistoricFloraAgeableFishBase.getHorizontalFacing() == EnumFacing.SOUTH) {
                        randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(5) - 2, rand.nextInt(9) - 4, rand.nextInt(17));
                    }
                    if (this.PrehistoricFloraAgeableFishBase.getHorizontalFacing() == EnumFacing.EAST) {
                        randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(17), rand.nextInt(9) - 4, rand.nextInt(5) - 2);
                    }
                    if (this.PrehistoricFloraAgeableFishBase.getHorizontalFacing() == EnumFacing.WEST) {
                        randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(17) - 16, rand.nextInt(9) - 4, rand.nextInt(5) - 2);
                    }
                }
                else {
                    randPos = this.PrehistoricFloraAgeableFishBase.getPosition().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                }
                if (this.PrehistoricFloraAgeableFishBase.divesToLay() && this.PrehistoricFloraAgeableFishBase.getCanBreed()) {
                    //Target the water bottom to lay (within reason):
                    BlockPos randPosVar = randPos;
                    if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos) && Math.random() < 0.90) {
                        int ii = 0;
                        while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.down(ii);
                            ii = ii + 1;
                        }
                        randPos = randPosVar;
                    }
                }
                //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraAgeableFishBase.getPosition().getY() + " " + randPos.getZ());
                if (canTarget(randPos) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(randPos).getMaterial() == Material.WATER && this.PrehistoricFloraAgeableFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(randPos.getX() + 0.5, randPos.getY() + 0.5, randPos.getZ() + 0.5))) {
                    return randPos;
                }
            }
        } else {
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraAgeableFishBase.getAttackTarget());
            if (canTarget(blockpos1) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        //System.err.println("No path found 3");
        return null;
    }

    public boolean canTarget(BlockPos pos) {
        if (pos.getY() < 1 || pos.getY() >= 254) {
            return false;
        }
        if ((entity.getRNG().nextInt(10) + 1 < Math.abs(surfacelove)) && (pos.getY() + surfacelove > 0)) { //It has a preference
            if (surfacelove <= -1) {
                if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(pos.down(10 + surfacelove)).getMaterial() == Material.WATER) {
                    return false;
                }
            }
            if (surfacelove >= 1) {
                if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(pos.up(10 - surfacelove)).getMaterial() == Material.WATER) {
                    return false;
                }
            }
        }
        //Target to the front and prefer not to be at the surface:
        EnumFacing EntityFacing = this.PrehistoricFloraAgeableFishBase.getHorizontalFacing();
        if (Math.random() > straightness && (EntityFacing == EnumFacing.NORTH) && (pos.getZ() > this.PrehistoricFloraAgeableFishBase.getPosition().getZ())) {
            return false;
        }
        if (Math.random() > straightness && (EntityFacing == EnumFacing.SOUTH) && (pos.getZ() < this.PrehistoricFloraAgeableFishBase.getPosition().getZ())) {
            return false;
        }
        if (Math.random() > straightness && (EntityFacing == EnumFacing.WEST) && (pos.getX() > this.PrehistoricFloraAgeableFishBase.getPosition().getX())) {
            return false;
        }
        if (Math.random() > straightness && (EntityFacing == EnumFacing.EAST) && (pos.getX() < this.PrehistoricFloraAgeableFishBase.getPosition().getX())) {
            return false;
        }
        return true;
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
}