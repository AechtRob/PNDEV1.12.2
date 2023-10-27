package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class LandWanderAvoidWaterAI extends EntityAIBase
{
    protected final EntityPrehistoricFloraLandBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance; //an integer fom 1 upwards, where 1 means not still
    protected int executionChanceInWater;
    protected boolean mustUpdate;

    public LandWanderAvoidWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120, 1);
    }

    public LandWanderAvoidWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill)
    {
        this(creatureIn, speedIn, chanceStill, 1);
    }

    public LandWanderAvoidWaterAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn, int chanceStill, int chanceStillInWater)
    {
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
            return this.entity.getRNG().nextFloat() >= 0.001 ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : vecRnd;
        }
    }

    public boolean shouldContinueExecuting()
    {
        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase LandBase = (EntityPrehistoricFloraLandBase) this.entity;
            if (LandBase.isAnimationDirectionLocked(this.entity.getAnimation())) {
                this.entity.getNavigator().clearPath();
                return false;
            }
        }

        return
                !this.entity.getNavigator().noPath();
    }

    public void startExecuting()
    {
        //System.err.println(this.getClass() + " " + this.entity.getNavigator() + " move to " + this.x + " " + this.y + " " + this.z);

//        double Xoffset = this.entity.posX - this.entity.getPosition().getX();
//        double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();
//        this.entity.getNavigator().tryMoveToXYZ(this.x + Xoffset, this.y, this.z + Zoffset, this.speed);

        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
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
