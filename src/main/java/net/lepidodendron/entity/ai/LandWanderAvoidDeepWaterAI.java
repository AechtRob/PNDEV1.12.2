package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandWadingBase;
import net.lepidodendron.entity.util.PathNavigateGroundNoDeepWater;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class LandWanderAvoidDeepWaterAI extends AnimationAINoAnimation<EntityPrehistoricFloraLandBase>
{
    protected final EntityPrehistoricFloraLandBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance; //an integer fom 1 upwards, where 1 means not still
    protected int executionChanceInWater;
    protected boolean mustUpdate;

    public LandWanderAvoidDeepWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120, 1);
    }

    public LandWanderAvoidDeepWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill)
    {
        this(creatureIn, speedIn, chanceStill, 1);
    }

    public LandWanderAvoidDeepWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill, int chanceStillInWater)
    {
        super(creatureIn);
        setMutexBits(1);
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chanceStill;
        this.executionChanceInWater = chanceStillInWater;
        this.setMutexBits(1);
    }

    public boolean shouldExecute()
    {
        if (entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase ptero = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (ptero.getAttachmentFacing() != EnumFacing.UP) {
                return false;
            }
        }

        if (!(entity.getAISpeedLand() > 0)) {
            return false;
        }

        if (!this.mustUpdate)
        {
            if (this.entity.getIdleTime() >= 100 && !this.entity.isReallyInWater())
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0 && !this.entity.isReallyInWater())
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChanceInWater) != 0 && this.entity.isReallyInWater())
            {
                return false;
            }
        }

        Vec3d vec3d = this.getPosition();

        if (vec3d == null)
        {
            return false;
        }
        else
        {
            this.x = vec3d.x;
            this.y = vec3d.y;
            this.z = vec3d.z;
            this.mustUpdate = false;
            return true;
        }
    }

    protected Vec3d getPosition()
    {
        Vec3d vecRnd = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
        Vec3d vec3d = null;
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (flier.getNestLocation() != null && flier.isSearchingNest() && flier.homesToNest() && (!(flier.ticksFreeflight > 0))) {
                vec3d = new Vec3d(flier.getNestLocation().getX() + 0.5, flier.getNestLocation().getY(), flier.getNestLocation().getZ() + 0.5);
                return vec3d;
            }
        }
        if (this.entity.isSwimmingInWater())
        {
            for (int i = 0; i < 16; i++) {
                vec3d = RandomPositionGenerator.getLandPos(this.entity, 15, 7);
                if (vec3d != null) {
                    break;
                }
            }
            return vec3d == null ? vecRnd : vec3d;
        }
        else
        {
            //If it's already in water, make it more likely to stay?
            if (this.entity.isReallyInWater() && this.entity.getRNG().nextInt(3) != 0) {
                return this.entity.getRNG().nextFloat() >= 0.001 ? getTargetWater() : vecRnd;
            }
            else if (this.entity.getRNG().nextInt(4) == 0) {
                return this.entity.getRNG().nextFloat() >= 0.001 ? RandomPositionGenerator.getLandPos(this.entity, 15, 7) : vecRnd;
            }
            else {
                return this.entity.getRNG().nextFloat() >= 0.001 ? getTargetWater() : vecRnd;
            }
        }
    }
    
    Vec3d getTargetWater() {
        Random rand = this.entity.getRNG();
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 256; i++) {
                Vec3d randPos = this.entity.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(17) - 8, rand.nextInt(17) - 8);
                if (this.entity.world.isBlockLoaded(new BlockPos(randPos))) {
                    if (this.entity.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER) {
                        if (this.entity.world.getBlockState(new BlockPos(randPos)).getBlock().isPassable(this.entity.world, new BlockPos(randPos))) {
                            if (!PathNavigateGroundNoDeepWater.isTooDeep(this.entity.world, new BlockPos(randPos))) {
                                return randPos;
                            }
                        }
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.entity.getAttackTarget().getPositionVector();
            if (this.entity.world.getBlockState(new BlockPos(blockpos1)).getMaterial() != Material.WATER) {
                return blockpos1;
            }
            else if (!PathNavigateGroundNoDeepWater.isTooDeep(this.entity.world, new BlockPos(blockpos1))) {
                return blockpos1;
            }
        }
        return null;
    }

    public boolean shouldContinueExecuting()
    {
        this.ticksAI --;
        if (!(this.ticksAI > 0)) {
            this.entity.getNavigator().clearPath();
            return false;
        }
        if (this.entity instanceof EntityPrehistoricFloraLandWadingBase && !this.entity.getNavigator().noPath()) {
            if (this.entity.getNavigator().getPath() != null) {
                if (this.entity.getNavigator().getPath().getCurrentPathIndex() < this.entity.getNavigator().getPath().getCurrentPathLength() - 1) {
                    PathPoint pathNext = this.entity.getNavigator().getPath().getPathPointFromIndex(this.entity.getNavigator().getPath().getCurrentPathIndex() + 1);
                    BlockPos posNext = new BlockPos(pathNext.x, pathNext.y, pathNext.z);
                    if (PathNavigateGroundNoDeepWater.isTooDeep(this.entity.world, posNext)) {
                        this.entity.getNavigator().clearPath();
                        return false;
                    }
                }
            }
        }
       if (this.entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
            this.entity.getNavigator().clearPath();
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase ptero = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (ptero.getAttachmentFacing() != EnumFacing.UP && this.entity.getNavigator() instanceof PathNavigateGroundNoWater) {
                this.entity.getNavigator().clearPath();
                return false;
            }
        }

        return
                !this.entity.getNavigator().noPath();
    }

    @Override
    public Animation getAnimation()
    {
        return null;
    }

    public void startExecuting()
    {
        //System.err.println(this.getClass() + " " + this.entity.getNavigator() + " move to " + this.x + " " + this.y + " " + this.z);

//        double Xoffset = this.entity.posX - this.entity.getPosition().getX();
//        double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();
//        this.entity.getNavigator().tryMoveToXYZ(this.x + Xoffset, this.y, this.z + Zoffset, this.speed);

        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
        this.ticksAI = 600;
    }

    public void makeUpdate()
    {
        this.mustUpdate = true;
    }

    public void setExecutionChance(int newchance)
    {
        this.executionChance = newchance;
    }
}
