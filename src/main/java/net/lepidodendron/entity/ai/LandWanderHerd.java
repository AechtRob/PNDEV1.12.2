package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFlyingBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.ai.EntityAIBase;

import java.util.List;

public class LandWanderHerd extends EntityAIBase
{
    EntityPrehistoricFloraAgeableBase followingAnimal;
    EntityPrehistoricFloraAgeableBase leadingAnimal;
    double moveSpeed;
    float herdDist;
    private int delayCounter;
    private int herdSize;

    public LandWanderHerd(EntityPrehistoricFloraAgeableBase animal, double speed, float herdDist, int herdSize)
    {
        this.followingAnimal = animal;
        this.moveSpeed = speed;
        this.herdDist = herdDist;
        this.herdSize = herdSize;
    }

    public LandWanderHerd(EntityPrehistoricFloraAgeableBase animal, double speed, float herdDist)
    {
        this.followingAnimal = animal;
        this.moveSpeed = speed;
        this.herdDist = herdDist;
        this.herdSize = 15;
    }


    public boolean shouldExecute()
    {

        if (this.followingAnimal instanceof EntityPrehistoricFloraLandBase) {
            if (!(((EntityPrehistoricFloraLandBase)this.followingAnimal).getAISpeedLand() > 0)) {
                return false;
            }
        }

        if (this.followingAnimal instanceof EntityPrehistoricFloraAgeableFlyingBase) {
            EntityPrehistoricFloraAgeableFlyingBase flybase = (EntityPrehistoricFloraAgeableFlyingBase) this.followingAnimal;
            if (flybase.isReallyFlying()) {
                return false;
            }
        }

        if (((double)(this.followingAnimal.ticksExisted + this.followingAnimal.getTickOffset())) % 100D != 0) {
            //throttle the AI to avoid too much lag!
            return false;
        }

        float pathDistance = this.followingAnimal.getNavigator().getPathSearchRange();

        List<EntityPrehistoricFloraAgeableBase> list = this.followingAnimal.world.<EntityPrehistoricFloraAgeableBase>getEntitiesWithinAABB(this.followingAnimal.getClass(), this.followingAnimal.getEntityBoundingBox().grow(pathDistance * 0.75F, pathDistance * 0.75F, pathDistance * 0.75F));
        EntityPrehistoricFloraAgeableBase entityanimal = null;
        double d0 = Double.MAX_VALUE;
        int listSize = 0;

        for (EntityPrehistoricFloraAgeableBase entityanimal1 : list)
        {
            if (entityanimal1.isPFAdult() && (!entityanimal1.isInWater()) && entityanimal1 != followingAnimal)
            {
                double d1 = this.followingAnimal.getDistanceSq(entityanimal1);
                listSize ++;
                if (listSize > this.herdSize)
                {
                    return false;
                }
                if (d1 <= d0)
                {
                    d0 = d1;
                    entityanimal = entityanimal1;
                }
            }
        }

        if (listSize > this.herdSize || entityanimal == null)
        {
            return false;
        }
        else if (d0 < Math.pow(this.herdDist, 2))
        {
            return false;
        }
        else
        {
            this.leadingAnimal = entityanimal;
            return true;
        }
    }


    public boolean shouldContinueExecuting()
    {

        if (this.followingAnimal.isPFAdult())
        {
            return false;
        }
        else if (!this.leadingAnimal.isEntityAlive())
        {
            return false;
        }
        else if (this.followingAnimal.getNavigator().getPath() == null)
        {
            return false;
        }
        else
        {
            double d0 = this.followingAnimal.getDistanceSq(this.leadingAnimal);
            return d0 >= Math.pow(this.herdDist, 2);// && d0 <= 256.0D;
        }
    }

    public void startExecuting()
    {
        this.delayCounter = 0;
    }

    public void resetTask()
    {
        this.leadingAnimal = null;
    }

    public void updateTask()
    {
        if (--this.delayCounter <= 0)
        {
            this.delayCounter = 10;
            this.followingAnimal.getNavigator().tryMoveToEntityLiving(this.leadingAnimal, this.moveSpeed);
        }
    }

}
