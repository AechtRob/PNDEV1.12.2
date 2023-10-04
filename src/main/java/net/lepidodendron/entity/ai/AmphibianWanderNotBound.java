package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class AmphibianWanderNotBound extends AnimationAINoAnimation<EntityPrehistoricFloraSwimmingAmphibianBase> {

    protected float probability;
    protected Animation animation;
    protected double waterPreference;
    protected int executionChance;
    protected boolean mustUpdate;
    protected int maxDepth;
    protected EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase;

    public AmphibianWanderNotBound(EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase, Animation animation, double waterPreference, int executionchance)
    {
        super(PrehistoricFloraAmphibianBase);
        setMutexBits(1);
        this.PrehistoricFloraAmphibianBase = PrehistoricFloraAmphibianBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
        this.maxDepth = 0;
    }

    public AmphibianWanderNotBound(EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase, Animation animation, double waterPreference, int executionchance, int maxDepth)
    {
        super(PrehistoricFloraAmphibianBase);
        setMutexBits(1);
        this.PrehistoricFloraAmphibianBase = PrehistoricFloraAmphibianBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
        this.maxDepth = maxDepth;
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

        if (this.PrehistoricFloraAmphibianBase.getRNG().nextFloat() < 0.3F) {
            Path path = this.PrehistoricFloraAmphibianBase.getNavigator().getPath();
            if (this.PrehistoricFloraAmphibianBase.isInWater()) {
                //Path path = this.PrehistoricFloraJellyfishBase.getNavigator().getPath();
                if (
                        ((!this.PrehistoricFloraAmphibianBase.getNavigator().noPath())
                                && (!isDirectPathBetweenPoints(this.PrehistoricFloraAmphibianBase, this.PrehistoricFloraAmphibianBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                                ||
                                (path != null && path.getFinalPathPoint() != null
                                        && this.PrehistoricFloraAmphibianBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraAmphibianBase.width,2))
                )
                {
                    this.PrehistoricFloraAmphibianBase.getNavigator().clearPath();
                }
            }
            if (this.PrehistoricFloraAmphibianBase.getNavigator().noPath()) {
                Vec3d vec3;

                double chooser = this.waterPreference;
                if (Math.random() > chooser) { //Equal chance of land or water, but sometimes stay still if it's not doing the water thing
                    if (!this.mustUpdate && (!this.PrehistoricFloraAmphibianBase.isReallyInWater()) && this.executionChance > 0)
                    {
                        if (this.PrehistoricFloraAmphibianBase.getIdleTime() >= 100)
                        {
                            return false;
                        }

                        if (this.PrehistoricFloraAmphibianBase.getRNG().nextInt(this.executionChance) != 0)
                        {
                            return false;
                        }
                    }
                    vec3 = this.findLandTarget();
                }
                else {
                    vec3 = this.findWaterTarget(16);
                }

                if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraAmphibianBase.posX - this.PrehistoricFloraAmphibianBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraAmphibianBase.posZ - this.PrehistoricFloraAmphibianBase.getPosition().getZ();

                    this.PrehistoricFloraAmphibianBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);
                    this.mustUpdate = false;
                    return true;
                }
                else {
                    vec3 = this.findAnyTarget();
                    if (vec3 != null) {
//                        double Xoffset = this.PrehistoricFloraAmphibianBase.posX - this.PrehistoricFloraAmphibianBase.getPosition().getX();
//                        double Zoffset = this.PrehistoricFloraAmphibianBase.posZ - this.PrehistoricFloraAmphibianBase.getPosition().getZ();
//
//                        this.PrehistoricFloraAmphibianBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D + Xoffset, Math.floor(vec3.getY()) + 0.5D  , vec3.getZ() + 0.5D + Zoffset, 1.0);
                        this.PrehistoricFloraAmphibianBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);
                        this.mustUpdate = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public boolean isTooDeep(BlockPos pos) {
        int i = 0;
        while (this.PrehistoricFloraAmphibianBase.world.getBlockState(pos.down(i)).getMaterial() == Material.WATER) {
            i ++;
        }
        if (this.PrehistoricFloraAmphibianBase.world.getBlockState(pos.down(i).up(this.maxDepth)).getMaterial() == Material.WATER) {
            return true;
        }
        return false;
    }

    public Vec3d findWaterTarget(int dist) {
        Random rand = this.PrehistoricFloraAmphibianBase.getRNG();
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
//            double Xoffset = this.PrehistoricFloraAmphibianBase.posX - this.entity.getPosition().getX();
//            double Zoffset = this.PrehistoricFloraAmphibianBase.posZ - this.entity.getPosition().getZ();
            for (int i = 0; i < 64; i++) {
                Vec3d randPos = this.PrehistoricFloraAmphibianBase.getPositionVector().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt(dist+1) - (int) (dist/2));
                if (this.maxDepth > 0 && isTooDeep(new BlockPos(randPos))) {
                    break; //This pos is not suitable
                }
                boolean visibility = true;
                if (this.PrehistoricFloraAmphibianBase.isReallyInWater()) {
                    visibility = this.PrehistoricFloraAmphibianBase.isDirectPathBetweenPoints(this.PrehistoricFloraAmphibianBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z));
                }
                if (this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && visibility) {
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.PrehistoricFloraAmphibianBase.getAttackTarget().getPositionVector();
            if (this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public Vec3d findLandTarget() {
        BlockPos blockpos1;
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 16; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                vec3d = new Vec3d(vec3d.x, Math.floor(vec3d.y), vec3d.z);
                if (vec3d != null) {
                    blockpos1 = new BlockPos(vec3d);
                    if ((this.PrehistoricFloraAmphibianBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER)
                            || (isNearWater(this.entity, blockpos1, this.PrehistoricFloraAmphibianBase.WaterDist()))
                    ) {
                        if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                            return vec3d;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Vec3d findAnyTarget() {
        Vec3d blockpos1;
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                if (vec3d != null) {
                    //blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                    if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                        return vec3d;
                    }
                }
            }
        }
        return null;
    }

    public boolean isNearWater(Entity e, BlockPos pos, int WaterDist) {
        return true;
    }

}