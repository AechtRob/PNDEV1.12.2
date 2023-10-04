package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.EntityPrehistoricFloraGephyrostegus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class AmphibianWander extends AnimationAINoAnimation<EntityPrehistoricFloraSwimmingAmphibianBase> {

    protected float probability;
    protected Animation animation;
    protected double waterPreference;
    protected int executionChance;
    protected boolean mustUpdate;
    protected int maxDepth;
    protected EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase;

    public AmphibianWander(EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase, Animation animation, double waterPreference, int executionchance)
    {
        super(PrehistoricFloraAmphibianBase);
        setMutexBits(1);
        this.PrehistoricFloraAmphibianBase = PrehistoricFloraAmphibianBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
        this.maxDepth = 0;
    }

    public AmphibianWander(EntityPrehistoricFloraSwimmingAmphibianBase PrehistoricFloraAmphibianBase, Animation animation, double waterPreference, int executionchance, int maxDepth)
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
                //Actively seek out water targets if too far from water:
                Vec3d vec3;
                if (!(this.PrehistoricFloraAmphibianBase.isNearWater(this.entity, this.entity.getPosition()))) {
                    vec3 = this.findWaterTargetIgnoreBase(32);
                    if (vec3 == null) {
                        vec3 = this.findLandTarget();
                        if (vec3 == null) {
                            vec3 = this.findAnyTarget();
                        }
                    }
                }
                else {
                    double chooser = this.waterPreference;
                    if (this.PrehistoricFloraAmphibianBase.getLaying() && this.PrehistoricFloraAmphibianBase instanceof EntityPrehistoricFloraGephyrostegus) {
                        chooser = 1;
                    }
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
                        if (!this.PrehistoricFloraAmphibianBase.isReallyInWater()) {
                            vec3 = this.findWaterTargetIgnoreBase(16);
                        }
                        else {
                            vec3 = this.findWaterTarget(16);
                        }
                    }
                }
                if (vec3 != null) {
                    this.PrehistoricFloraAmphibianBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y  , vec3.z, 1.0);
                    this.mustUpdate = false;
                    return true;
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


    public Vec3d findWaterTarget(int dist) {
        Random rand = this.PrehistoricFloraAmphibianBase.getRNG();
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
            if (this.PrehistoricFloraAmphibianBase.isBase()) {
                for (int i = 0; i < 10; i++) {
                    Vec3d randPos = this.PrehistoricFloraAmphibianBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                    //Prefer targets which are at the bottom:
                    randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                    Vec3d randPosVar = randPos;
                    if (this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos)) && Math.random() < 0.85) {
                        int ii = 0;
                        while ((new BlockPos(randPos).down(ii).getY() > 1) && this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.add(0, -ii,0);
                            ii = ii + 1;
                        }
                        //About half the time float over the bottom:
                        randPos = randPosVar;
                        if (Math.random() > 0.5) {
                            randPos = randPosVar.add(0,1,0);
                        }
                    }

                    if (this.maxDepth > 0 && isTooDeep(new BlockPos(randPos))) {
                        break; //This pos is not suitable
                    }

                    //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraAmphibianBase.isDirectPathBetweenPoints(this.PrehistoricFloraAmphibianBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }

                    }
                }
            }
            else {
                for (int i = 0; i < 64; i++) {
                    Vec3d randPos = this.PrehistoricFloraAmphibianBase.getPositionVector().add(rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2));
                    if (this.maxDepth > 0 && isTooDeep(new BlockPos(randPos))) {
                        break; //This pos is not suitable
                    }
                    boolean visibility = true;
                    if (this.PrehistoricFloraAmphibianBase.isReallyInWater()) {
                        visibility = this.PrehistoricFloraAmphibianBase.isDirectPathBetweenPoints(this.PrehistoricFloraAmphibianBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z + 0.5));
                    }
                    if (this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && visibility) {
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }
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

    public Vec3d findWaterTargetIgnoreBase(int dist) {
        Random rand = this.PrehistoricFloraAmphibianBase.getRNG();
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                Vec3d randPos = this.PrehistoricFloraAmphibianBase.getPositionVector().add(rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2));
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
        Vec3d blockpos1;
        if (this.PrehistoricFloraAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 16; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                vec3d = new Vec3d(vec3d.x, Math.floor(vec3d.y), vec3d.z);
                if (vec3d != null) {
                    blockpos1 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
                    if ((this.PrehistoricFloraAmphibianBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER)
                            || (isNearWater(this.entity, new BlockPos(blockpos1), this.PrehistoricFloraAmphibianBase.WaterDist()))
                    ) {
                        if (!(blockpos1.y < 1 || blockpos1.y >= 254)) {
                            return blockpos1;
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
                    blockpos1 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
                    if (!(blockpos1.y < 1 || blockpos1.y >= 254)) {
                        return blockpos1;
                    }
                }
            }
        }
        return null;
    }

    public boolean isNearWater(Entity e, BlockPos pos, int WaterDist) {
        int distH = WaterDist;
        if (distH < 1) distH = 1;
        if (distH > 32) distH = 32;
        int distV = 4;
        boolean waterCriteria = false;
        int xct = -distH;
        int yct;
        int zct;
        while ((xct <= distH) && (!waterCriteria)) {
            yct = -distV;
            while ((yct <= distV) && (!waterCriteria)) {
                zct = -distH;
                while ((zct <= distH) && (!waterCriteria)) {
                    if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((e.world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
                        waterCriteria = true;
                    }
                    zct = zct + 1;
                }
                yct = yct + 1;
            }
            xct = xct + 1;
        }

        if (waterCriteria || (WaterDist == 0)) return true;

        return false;

    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraAmphibianBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraAmphibianBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraAmphibianBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

}