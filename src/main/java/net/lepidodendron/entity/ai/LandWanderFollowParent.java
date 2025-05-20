package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.entity.ai.EntityAIBase;

import java.util.List;

public class LandWanderFollowParent extends EntityAIBase
{
    EntityPrehistoricFloraAgeableBase childAnimal;
    EntityPrehistoricFloraAgeableBase parentAnimal;
    double moveSpeed;
    private int delayCounter;

    public LandWanderFollowParent(EntityPrehistoricFloraAgeableBase animal, double speed)
    {
        this.childAnimal = animal;
        this.moveSpeed = speed;
    }

    public double getFollowDistanceSq() {
        if (this.childAnimal.getMaxWidth() > 5) {
            return 64.0D;
        }
        else if (this.childAnimal.getMaxWidth() > 4) {
            return 42.0D;
        }
        else if (this.childAnimal.getMaxWidth() > 3) {
            return 36.0D;
        }
        else if (this.childAnimal.getMaxWidth() > 2) {
            return 25.0D;
        }
        else if (this.childAnimal.getMaxWidth() > 1) {
            return 16.0D;
        }
        else return 9.0D;
    }

    public boolean shouldExecute()
    {
        if (this.childAnimal.isAnimationDirectionLocked(this.childAnimal.getAnimation())) {
            return false;
        }

        if (this.childAnimal.isPFAdult())
        {
            return false;
        }
        else
        {
            List<EntityPrehistoricFloraAgeableBase> list = this.childAnimal.world.<EntityPrehistoricFloraAgeableBase>getEntitiesWithinAABB(this.childAnimal.getClass(), this.childAnimal.getEntityBoundingBox().grow(8.0D, 4.0D, 8.0D));
            EntityPrehistoricFloraAgeableBase entityanimal = null;
            double d0 = Double.MAX_VALUE;

            for (EntityPrehistoricFloraAgeableBase entityanimal1 : list)
            {
                if (entityanimal1.isPFAdult())
                {
                    double d1 = this.childAnimal.getDistanceSq(entityanimal1);

                    if (d1 <= d0)
                    {
                        d0 = d1;
                        entityanimal = entityanimal1;
                    }
                }
            }

            if (entityanimal == null)
            {
                return false;
            }
            else if (d0 < getFollowDistanceSq())
            {
                return false;
            }
            else
            {
                this.parentAnimal = entityanimal;
                return true;
            }
        }
    }

    public boolean shouldContinueExecuting()
    {
        if (this.childAnimal.isAnimationDirectionLocked(this.childAnimal.getAnimation())) {
            this.childAnimal.getNavigator().clearPath();
            return false;
        }

        if (this.childAnimal.isPFAdult())
        {
            return false;
        }
        else if (!this.parentAnimal.isEntityAlive())
        {
            return false;
        }
        else
        {
            double d0 = this.childAnimal.getDistanceSq(this.parentAnimal);
            return d0 >= getFollowDistanceSq() && d0 <= 256.0D;
        }
    }

    public void startExecuting()
    {
        this.delayCounter = 0;
    }

    public void resetTask()
    {
        this.parentAnimal = null;
    }

    public void updateTask()
    {
        if (--this.delayCounter <= 0)
        {
            this.delayCounter = 10;
            this.childAnimal.getNavigator().tryMoveToEntityLiving(this.parentAnimal, this.moveSpeed);
        }
    }
}
