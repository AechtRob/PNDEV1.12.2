package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandWadingBase;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class LandWanderWader extends AnimationAINoAnimation<EntityPrehistoricFloraLandWadingBase> {

    protected float probability;
    protected Animation animation;
    protected double waterPreference;
    protected int executionChance;
    protected boolean mustUpdate;
    protected int maxDepth;
    protected EntityPrehistoricFloraLandWadingBase EntityPrehistoricFloraLandWadingBase;

    public LandWanderWader(EntityPrehistoricFloraLandWadingBase EntityPrehistoricFloraLandWadingBase, Animation animation, double waterPreference, int executionchance)
    {
        super(EntityPrehistoricFloraLandWadingBase);
        setMutexBits(1);
        this.EntityPrehistoricFloraLandWadingBase = EntityPrehistoricFloraLandWadingBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
        this.maxDepth = 0;
    }

    public LandWanderWader(EntityPrehistoricFloraLandWadingBase EntityPrehistoricFloraLandWadingBase, Animation animation, double waterPreference, int executionchance, int maxDepth)
    {
        super(EntityPrehistoricFloraLandWadingBase);
        setMutexBits(1);
        this.EntityPrehistoricFloraLandWadingBase = EntityPrehistoricFloraLandWadingBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
        this.maxDepth = maxDepth;
    }

    public boolean isTooDeep(BlockPos pos) {
        return !entity.isBlockWadable(entity.world, pos);
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

        if (entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
            return false;
        }

        if (!(entity.getAISpeedLand() > 0)) {
            return false;
        }

        if (this.EntityPrehistoricFloraLandWadingBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.EntityPrehistoricFloraLandWadingBase.getNavigator().getPath();
            if (this.EntityPrehistoricFloraLandWadingBase.getNavigator().noPath()) {
                //Prefer water targets:
                Vec3d vec3;

                if (Math.random() > this.waterPreference) {

                    if (!this.mustUpdate && (!this.EntityPrehistoricFloraLandWadingBase.isReallyInWater()) && this.executionChance > 0)
                    {
                        if (this.EntityPrehistoricFloraLandWadingBase.getIdleTime() >= 100)
                        {
                            return false;
                        }

                        if (this.EntityPrehistoricFloraLandWadingBase.getRNG().nextInt(this.executionChance) != 0)
                        {
                            return false;
                        }
                    }

                    vec3 = this.findLandTarget();
                } else {
                    vec3 = this.findWaterTarget(16);
                }

                if (vec3 != null) {
//                    double Xoffset = this.EntityPrehistoricFloraLandWadingBase.posX - this.EntityPrehistoricFloraLandWadingBase.getPosition().getX();
//                    double Zoffset = this.EntityPrehistoricFloraLandWadingBase.posZ - this.EntityPrehistoricFloraLandWadingBase.getPosition().getZ();

                    this.EntityPrehistoricFloraLandWadingBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);
                    this.mustUpdate = false;
                    return true;
                }
            }
            else {
                return true;
            }
        }
        //System.err.println("No path found");
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return !this.entity.getNavigator().noPath();
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public Vec3d findWaterTarget(int dist) {
        //System.err.println("Find Water Target");
        Random rand = this.EntityPrehistoricFloraLandWadingBase.getRNG();
        if (this.EntityPrehistoricFloraLandWadingBase.getAttackTarget() == null) {
            for (int i = 0; i < dist * 2; i++) {
                Vec3d randPos = this.EntityPrehistoricFloraLandWadingBase.getPositionVector().add(rand.nextInt(dist + 1) - (int) (dist/2), 0, rand.nextInt(dist + 1) - (int) (dist/2));
                BlockPos topBlock = ChunkGenSpawner.getTopSolidOrLiquidBlockIncludingLeaves(new BlockPos(randPos), entity.world);
                randPos = new Vec3d(randPos.x, topBlock.getY(), randPos.z);
                if (this.EntityPrehistoricFloraLandWadingBase.world.isBlockLoaded(new BlockPos(randPos))) {
                    //Use targets which are at the bottom:
                    if (this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(new BlockPos(randPos)).getMaterial() != Material.WATER) {
                        continue;
                    }
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        randPos = new Vec3d(randPos.x, Math.floor(randPos.y), randPos.z);
                    }
                    Vec3d randPosVar = randPos;
                    if (this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && !isAtBottom(new BlockPos(randPos))) {
                        int ii = 0;
                        while ((new BlockPos(randPos).down(ii).getY() > 1) && this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(new BlockPos(randPos).down(ii)).getMaterial() == Material.WATER) {
                            randPosVar = randPos.add(0, -ii, 0);
                            ii = ii + 1;
                        }
                        randPos = randPosVar;
                    }

                    if (this.maxDepth > 0 & isTooDeep(new BlockPos(randPos))) {
                        break; //This pos is not suitable
                    }
                    //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (this.EntityPrehistoricFloraLandWadingBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER) {
                        //System.err.println("Target :" + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                        if (!(randPos.y < 1 || randPos.y >= 254)) {
                            return randPos;
                        }
                    }
                }
            }
        } else { //allow attacks:
            return this.EntityPrehistoricFloraLandWadingBase.getAttackTarget().getPositionVector();
        }
        //Try to return ANY target:
        for (int i = 0; i < 10; i++) {
            Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.entity, dist, dist);
            if (vec3d != null) {
                if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                    return vec3d;
                }
            }
        }
        return null;
    }

    public Vec3d findLandTarget() {
        //System.err.println("Find Land Target");
        //Vec3d blockpos1;
        if (this.EntityPrehistoricFloraLandWadingBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                if (vec3d != null) {
                    if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                        return vec3d;
                    }
                }
            }
        }
        else { //allow attacks:
            return this.EntityPrehistoricFloraLandWadingBase.getAttackTarget().getPositionVector();
        }
        return null;
    }

}