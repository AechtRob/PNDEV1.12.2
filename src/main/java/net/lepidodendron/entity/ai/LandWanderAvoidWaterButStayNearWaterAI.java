package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.util.INeedsWater;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class LandWanderAvoidWaterButStayNearWaterAI extends AnimationAINoAnimation<EntityPrehistoricFloraLandBase>
{
    protected final EntityPrehistoricFloraLandBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance; //an integer fom 1 upwards, where 1 means not still
    protected int executionChanceInWater;
    protected boolean mustUpdate;
    protected INeedsWater iNeedsWater;

    public LandWanderAvoidWaterButStayNearWaterAI(INeedsWater iNeedsWaterIn, EntityPrehistoricFloraLandBase creatureIn, double speedIn)
    {
        this(iNeedsWaterIn, creatureIn, speedIn, 120, 1);
    }

    public LandWanderAvoidWaterButStayNearWaterAI(INeedsWater iNeedsWaterIn, EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill)
    {
        this(iNeedsWaterIn, creatureIn, speedIn, chanceStill, 1);
    }

    public LandWanderAvoidWaterButStayNearWaterAI(INeedsWater iNeedsWaterIn, EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill, int chanceStillInWater)
    {
        super(creatureIn);
        setMutexBits(1);
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chanceStill;
        this.executionChanceInWater = chanceStillInWater;
        this.iNeedsWater = iNeedsWaterIn;
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
            if (this.entity.getIdleTime() >= 100 && !this.entity.isReallyInWater()
                    && ((!this.iNeedsWater.takesDamageAwayFromWater()) || (isNearWater(this.iNeedsWater, this.entity.getPosition())))
            )
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0 && (!this.entity.isReallyInWater())
                    && ((!iNeedsWater.takesDamageAwayFromWater()) || (isNearWater(iNeedsWater, this.entity.getPosition()))))
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChanceInWater) != 0 && this.entity.isReallyInWater()
                    && ((!iNeedsWater.takesDamageAwayFromWater()) || (isNearWater(iNeedsWater, this.entity.getPosition())))
            )
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
        //First try to find a target within the allowed distance of water:
        if (this.entity instanceof INeedsWater) {
            Vec3d vec3 = null;
            if ((!this.isNearWater(this.iNeedsWater, this.entity.getPosition())) && (!this.entity.isSwimmingInWater())) {
                //vec3 = this.findWaterTargetIgnoreBase(32);
                if (vec3 == null) {
                    vec3 = this.findLandTarget(this.iNeedsWater);
                    if (vec3 == null) {
                        vec3 = this.findAnyTarget();
                    }
                }
            }
            if (vec3 != null) {
                return vec3;
            }
        }

        Vec3d vecRnd = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
        Vec3d vec3d = null;
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (flier.getNestLocation() != null && flier.isSearchingNest() && flier.homesToNest() && (!(flier.ticksFreeflight > 0))) {
                vec3d = new Vec3d(flier.getNestLocation().getX() + 0.5, flier.getNestLocation().getY(), flier.getNestLocation().getZ() + 0.5);
                return vec3d;
            }
        }
        if (this.entity.isSwimmingInWater()) {
            for (int i = 0; i < 16; i++) {
                vec3d = RandomPositionGenerator.getLandPos(this.entity, 15, 7);
                if (vec3d != null) {
                    break;
                }
            }
            return vec3d == null ? vecRnd : vec3d;
        } else {
            return this.entity.getRNG().nextFloat() >= 0.001 ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : vecRnd;
        }

    }

    public boolean shouldContinueExecuting()
    {
        this.ticksAI --;
        if (!(this.ticksAI > 0)) {
            this.entity.getNavigator().clearPath();
            return false;
        }
        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase LandBase = (EntityPrehistoricFloraLandBase) this.entity;
            if (LandBase.isAnimationDirectionLocked(this.entity.getAnimation())) {
                this.entity.getNavigator().clearPath();
                return false;
            }
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

    public boolean isNearWater(INeedsWater entityIn, BlockPos pos) {
        if (!this.entity.world.isBlockLoaded(this.entity.getPosition())) {
            return true;
        }
        if (entityIn.safeDistanceToWater() == 0) {
            return true;
        }
        int distH = (int) entityIn.safeDistanceToWater();
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
                    if (!this.entity.world.isBlockLoaded(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))) {
                        waterCriteria = true;
                    }
                    else if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((this.entity.world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
                        waterCriteria = true;
                    }
                    zct = zct + 1;
                }
                yct = yct + 1;
            }
            xct = xct + 1;
        }

        if (waterCriteria || (entityIn.safeDistanceToWater() == 0)) return true;

        return this.entity.isInWater() || this.entity.isInsideOfMaterial(Material.WATER) || this.entity.isInsideOfMaterial(Material.CORAL);
    }

    public Vec3d findWaterTargetIgnoreBase(int dist) {
        Random rand = this.entity.getRNG();
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                Vec3d randPos = this.entity.getPositionVector().add(rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2), rand.nextInt(dist + 1) - (int) (dist / 2));
                boolean visibility = true;
                if (this.entity.isReallyInWater()) {
                    visibility = this.entity.isDirectPathBetweenPoints(this.entity.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z));
                }
                if (this.entity.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && visibility) {
                    if (!(randPos.y < 1 || randPos.y >= 254)) {
                        return randPos;
                    }
                }
            }
        } else {
            Vec3d blockpos1;
            blockpos1 = this.entity.getAttackTarget().getPositionVector();
            if (this.entity.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public Vec3d findLandTarget(INeedsWater entityIn) {
        Vec3d blockpos1;
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 16; i++) {
                Vec3d vec3d = RandomPositionGenerator.getLandPos(this.entity, 10, 7);
                if (vec3d != null) {
                    vec3d = new Vec3d(vec3d.x, Math.floor(vec3d.y), vec3d.z);
                    blockpos1 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
                    if ((this.entity.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER)
                            || (isNearWater(entityIn, new BlockPos(blockpos1)))
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
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
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
}
