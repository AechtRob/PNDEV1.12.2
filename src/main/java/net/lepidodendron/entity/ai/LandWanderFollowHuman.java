package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.util.ICurious;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

import java.util.List;

public class LandWanderFollowHuman extends EntityAIBase
{
    EntityPrehistoricFloraAgeableBase curiousAnimal;
    EntityLivingBase humanToFollow;
    double moveSpeed;
    private int delayCounter;
    private int distanceApproached;

    public LandWanderFollowHuman(EntityPrehistoricFloraAgeableBase animal, double speed, int distanceApproached)
    {
        this.curiousAnimal = animal;
        this.moveSpeed = speed;
        this.distanceApproached = distanceApproached;
    }

    public static boolean isHumanoid(EntityLivingBase entity) {
        return false;
    }

    public boolean shouldExecute()
    {
        if (this.curiousAnimal.isAnimationDirectionLocked(this.curiousAnimal.getAnimation())) {
            this.curiousAnimal.setIsCuriousWalking(false);
            return false;
        }

        if (this.curiousAnimal instanceof ICurious) {
            ICurious CuriousBase = (ICurious) this.curiousAnimal;
            if (!CuriousBase.isCurious()) {
                return false;
            }
        }
        else {
            return false;
        }

        List<EntityLivingBase> list = this.curiousAnimal.world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, this.curiousAnimal.getEntityBoundingBox().grow(16.0D, 8.0D, 16.0D));
        EntityLivingBase entityHumanToFollow = null;
        double d0 = Double.MAX_VALUE;

        for (EntityLivingBase entityHuman : list)
        {
            boolean flag = true;
            if (entityHuman instanceof EntityPlayer) {
                flag = (!((EntityPlayer)entityHuman).isSpectator()) && (!((EntityPlayer)entityHuman).isCreative());
            }
            if ((entityHuman instanceof EntityPlayer || entityHuman instanceof EntityVillager
                || this.isHumanoid(entityHuman))
                && flag
                && !entityHuman.isInvisible())
            {
                double d1 = this.curiousAnimal.getDistanceSq(entityHuman);

                if (d1 <= d0)
                {
                    d0 = d1;
                    entityHumanToFollow = entityHuman;
                }
            }
        }

        if (entityHumanToFollow == null)
        {
            this.curiousAnimal.setIsCuriousWalking(false);
            return false;
        }
        else if (d0 < Math.pow(this.distanceApproached, 2))
        {
            this.curiousAnimal.setIsCuriousWalking(false);
            return false;
        }
        else
        {
            this.humanToFollow = entityHumanToFollow;
            this.curiousAnimal.setIsCuriousWalking(true);
            return true;
        }
    }


    public boolean shouldContinueExecuting()
    {
        if (this.curiousAnimal.isAnimationDirectionLocked(this.curiousAnimal.getAnimation())) {
            this.curiousAnimal.getNavigator().clearPath();
            this.curiousAnimal.setIsCuriousWalking(false);
            return false;
        }

        if (this.humanToFollow != null) {
            if (!this.humanToFollow.isEntityAlive())
            {
                this.curiousAnimal.setIsCuriousWalking(false);
                return false;
            }
            double d0 = this.curiousAnimal.getDistanceSq(this.humanToFollow);
            boolean flag =  d0 >= Math.pow(this.distanceApproached, 2) && d0 <= 256.0D;
            if (!flag) {
                this.humanToFollow = null;
                curiousAnimal.getNavigator().clearPath();
                this.curiousAnimal.setIsCuriousWalking(false);
            }
            else {
                this.curiousAnimal.setIsCuriousWalking(true);
            }
            return flag;
        }
        this.curiousAnimal.setIsCuriousWalking(false);
        return false;
    }

    public void startExecuting()
    {
        this.delayCounter = 0;
    }

    public void resetTask()
    {
        this.humanToFollow = null;
    }

    public void updateTask()
    {
        if (--this.delayCounter <= 0)
        {
            this.delayCounter = 10;
            this.curiousAnimal.getNavigator().tryMoveToEntityLiving(this.humanToFollow, this.moveSpeed);
        }
    }
}
