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
public class AgeableFishWander extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableFishBase> {

    protected Animation animation;
    protected EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase;
    protected double straightness;
    protected int surfacelove;
    protected boolean persistent;
    protected double chanceStill;
    protected boolean mustUpdate;

    public AgeableFishWander(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation, double straightness, int surfacelove, boolean persistent)
    {
        this(PrehistoricFloraAgeableFishBase, animation, straightness, surfacelove, persistent, 0D);
    }

    public AgeableFishWander(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation, double straightness, int surfacelove)
    {
        this(PrehistoricFloraAgeableFishBase, animation, straightness, surfacelove, false, 00);
    }

    public AgeableFishWander(EntityPrehistoricFloraAgeableFishBase PrehistoricFloraAgeableFishBase, Animation animation, double straightness, int surfacelove, boolean persistent, double chanceStill)
    {
        super(PrehistoricFloraAgeableFishBase);
        setMutexBits(4);
        this.PrehistoricFloraAgeableFishBase = PrehistoricFloraAgeableFishBase;
        this.animation = animation;
        this.straightness = straightness; //0 to 1, the lower the straighter: 1 is not straight and will wander widely
        this.surfacelove = surfacelove; //-10 to +10
        this.persistent = persistent;
        this.chanceStill = chanceStill; //0-1
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

    public void makeUpdate()
    {
        this.mustUpdate = true;
    }

    @Override
    public boolean shouldExecute() {

        //System.err.println("shouldExecute");

        if (!this.PrehistoricFloraAgeableFishBase.isInWater()) {
            return false;
        }

        if (!this.mustUpdate) {
            if (this.entity.getRNG().nextDouble() < chanceStill) {
                return false;
            }
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
                Vec3d vec3 = this.findWaterTarget();
                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraAgeableFishBase.posX - this.PrehistoricFloraAgeableFishBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraAgeableFishBase.posZ - this.PrehistoricFloraAgeableFishBase.getPosition().getZ();

                    //System.err.println("BlockPos: " + (new BlockPos(this.PrehistoricFloraAgeableFishBase.getPosition())));
                    //System.err.println("TargetPos: " + vec3);

                    this.PrehistoricFloraAgeableFishBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

                    this.mustUpdate = false;
                    this.ticksAI = 600;
                    return true;
                }
            }
            else {
                this.mustUpdate = false;
                this.ticksAI = 600;
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
        //System.err.println("ticksAI: " + this.ticksAI);
        this.ticksAI --;
        if (!(this.ticksAI > 0)) {
            this.PrehistoricFloraAgeableFishBase.getNavigator().clearPath();
            return false;
        }

        if (this.PrehistoricFloraAgeableFishBase.getNavigator().noPath()) {
            //System.err.println("No path found 2a");
            return false;
        }
        Path path = this.PrehistoricFloraAgeableFishBase.getNavigator().getPath();

        //System.err.println("EndPathPoint: " + (new BlockPos(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z)));

        if ((!isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase, this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z)))
            ||
            (path != null && path.getFinalPathPoint() != null
                && this.PrehistoricFloraAgeableFishBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraAgeableFishBase.width,2))
        ) {
            //System.err.println("No path found 2b");
            this.PrehistoricFloraAgeableFishBase.getNavigator().clearPath();
            return false;
        }

        return true;
    }

    public Vec3d findWaterTarget() {
        Random rand = this.PrehistoricFloraAgeableFishBase.getRNG();

        if (this.PrehistoricFloraAgeableFishBase.getAttackTarget() == null) {
//            double Xoffset = this.PrehistoricFloraAgeableFishBase.posX - this.PrehistoricFloraAgeableFishBase.getPosition().getX();
//            double Zoffset = this.PrehistoricFloraAgeableFishBase.posZ - this.PrehistoricFloraAgeableFishBase.getPosition().getZ();

            for (int i = 0; i < 4; i++) {
                Vec3d randPos = null;
                if (Math.random() > straightness) {
                    int southPos = rand.nextInt(17) - 8;
                    if (southPos < 0) {
                        southPos = southPos - 16 + (int) Math.round((16D * this.straightness));
                    }
                    if (southPos > 0) {
                        southPos = southPos + 16 - (int) Math.round((16D * this.straightness));
                    }
                    int eastPos = rand.nextInt(17) - 8;
                    if (eastPos < 0) {
                        eastPos = eastPos - 16 + (int) Math.round((16D * this.straightness));
                    }
                    if (eastPos > 0) {
                        eastPos = eastPos + 16 - (int) Math.round((16D * this.straightness));
                    }
                    randPos = this.PrehistoricFloraAgeableFishBase.getPositionVector().add(southPos, rand.nextInt(9) - 4, eastPos);
                }
                else {
                    randPos = this.PrehistoricFloraAgeableFishBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                }
                if (this.PrehistoricFloraAgeableFishBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    if (this.PrehistoricFloraAgeableFishBase.divesToLay() && this.PrehistoricFloraAgeableFishBase.getCanBreed() && this.PrehistoricFloraAgeableFishBase.getLaying()) {
                        //Target the water bottom to lay (within reason):
                        Vec3d randPosVar = randPos;
                        if (this.PrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos)) && Math.random() < 0.90) {
                            int ii = 0;
                            while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                                randPosVar = randPos.add(0, -ii, 0);
                                ii = ii + 1;
                            }
                            randPos = randPosVar;
                        }
                    }
                    //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraAgeableFishBase.getPosition().getY() + " " + randPos.getZ());
                    if (canTarget(new BlockPos(randPos)) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraAgeableFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraAgeableFishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraAgeableFishBase.getAttackTarget().getPositionVector();
            if (canTarget(new BlockPos(blockpos1)) && this.PrehistoricFloraAgeableFishBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
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