package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class FlyingLandWanderAvoidWaterAI extends EntityAIBase
{
    protected final EntityPrehistoricFloraCrawlingFlyingInsectBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected int executionChanceInWater;
    protected boolean mustUpdate;

    public FlyingLandWanderAvoidWaterAI(EntityPrehistoricFloraCrawlingFlyingInsectBase creatureIn, double speedIn)
    {
        this(creatureIn, speedIn, 120, 1);
    }

    public FlyingLandWanderAvoidWaterAI(EntityPrehistoricFloraCrawlingFlyingInsectBase creatureIn, double speedIn, int chanceStill)
    {
        this(creatureIn, speedIn, chanceStill, 1);
    }

    public FlyingLandWanderAvoidWaterAI(EntityPrehistoricFloraCrawlingFlyingInsectBase creatureIn, double speedIn, int chanceStill, int chanceStillInWater)
    {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chanceStill;
        this.executionChanceInWater = chanceStillInWater;
        this.setMutexBits(1);
    }

    public boolean shouldExecute()
    {

        if (!this.mustUpdate)
        {
            if (this.entity.getIdleTime() >= 100 && !this.entity.isInWater())
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0 && !this.entity.isInWater())
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChanceInWater) != 0 && this.entity.isInWater())
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
        if (this.entity.isInWater())
        {
            Vec3d vec3d = RandomPositionGenerator.getLandPos(this.entity, 15, 7);
            return vec3d == null ? vecRnd : vec3d;
        }
        else
        {
            return this.entity.getRNG().nextFloat() >= 0.001 ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : vecRnd;
        }
    }

    public boolean shouldContinueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    public void startExecuting()
    {
        double Xoffset = this.entity.posX - this.entity.getPosition().getX();
        double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();

        //System.err.println(this.getClass() + " " + this.entity.getNavigator() + " move to " + this.x + " " + this.y + " " + this.z);
        this.entity.getNavigator().tryMoveToXYZ(this.x + Xoffset, this.y, this.z + Zoffset , this.speed);
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
