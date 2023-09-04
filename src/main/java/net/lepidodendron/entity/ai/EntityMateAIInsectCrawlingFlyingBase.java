package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class EntityMateAIInsectCrawlingFlyingBase extends EntityAIBase
{
    private final EntityPrehistoricFloraCrawlingFlyingInsectBase animal;
    private final Class <? extends EntityPrehistoricFloraCrawlingFlyingInsectBase> mateClass;
    World world;
    private EntityPrehistoricFloraCrawlingFlyingInsectBase targetMate;
    int spawnBabyDelay;
    double moveSpeed;

    public EntityMateAIInsectCrawlingFlyingBase(EntityPrehistoricFloraCrawlingFlyingInsectBase animal, double speedIn)
    {
        this(animal, speedIn, animal.getClass());
    }

    public EntityMateAIInsectCrawlingFlyingBase(EntityPrehistoricFloraCrawlingFlyingInsectBase animal, double p_i47306_2_, Class <? extends EntityPrehistoricFloraCrawlingFlyingInsectBase> p_i47306_4_)
    {
        this.animal = animal;
        this.world = animal.world;
        this.mateClass = p_i47306_4_;
        this.moveSpeed = p_i47306_2_;
        this.setMutexBits(3);
    }

    public boolean shouldExecute()
    {
        if (!this.animal.isInLove())
        {
            return false;
        }
        else
        {
            this.targetMate = this.getNearbyMate();
            return this.targetMate != null;
        }
    }

    public boolean shouldContinueExecuting()
    {
        return this.targetMate.isEntityAlive() && this.targetMate.isInLove() && this.spawnBabyDelay < 60;
    }

    public void resetTask()
    {
        this.targetMate = null;
        this.spawnBabyDelay = 0;
    }

    public void updateTask()
    {
        this.animal.getLookHelper().setLookPositionWithEntity(this.targetMate, 10.0F, (float)this.animal.getVerticalFaceSpeed());
        this.animal.getNavigator().tryMoveToEntityLiving(this.targetMate, this.moveSpeed);
        ++this.spawnBabyDelay;

        double breedDist = 9.0D * this.animal.width;
        if ((this.animal.width > 1) || (this.targetMate.width > 1)) {
            breedDist = Math.pow((double)(3F + (((this.animal.width + this.targetMate.width)/2F) - 1F)), 2D);
        }

        if (this.spawnBabyDelay >= 60 && this.animal.getDistanceSq(this.targetMate) < breedDist)
        {
            this.spawnBaby();
        }
    }

    private EntityPrehistoricFloraCrawlingFlyingInsectBase getNearbyMate()
    {
        List<EntityPrehistoricFloraCrawlingFlyingInsectBase> list = this.world.<EntityPrehistoricFloraCrawlingFlyingInsectBase>getEntitiesWithinAABB(this.mateClass, this.animal.getEntityBoundingBox().grow(8.0D));
        double d0 = Double.MAX_VALUE;
        EntityPrehistoricFloraCrawlingFlyingInsectBase EntityPrehistoricFloraCrawlingFlyingInsectBase = null;

        for (EntityPrehistoricFloraCrawlingFlyingInsectBase EntityPrehistoricFloraCrawlingFlyingInsectBase1 : list)
        {
            if (this.animal.canMateWith(EntityPrehistoricFloraCrawlingFlyingInsectBase1) && this.animal.getDistanceSq(EntityPrehistoricFloraCrawlingFlyingInsectBase1) < d0)
            {
                EntityPrehistoricFloraCrawlingFlyingInsectBase = EntityPrehistoricFloraCrawlingFlyingInsectBase1;
                d0 = this.animal.getDistanceSq(EntityPrehistoricFloraCrawlingFlyingInsectBase1);
            }
        }

        return EntityPrehistoricFloraCrawlingFlyingInsectBase;
    }

    private void spawnBaby()
    {
        Random random = this.animal.getRNG();
        for (int i = 0; i < 7; ++i)
        {
            double d0 = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            double d3 = random.nextDouble() * (double)this.animal.width * 2.0D - (double)this.animal.width;
            double d4 = 0.5D + random.nextDouble() * (double)this.animal.height;
            double d5 = random.nextDouble() * (double)this.animal.width * 2.0D - (double)this.animal.width;
            this.world.spawnParticle(EnumParticleTypes.HEART, this.animal.posX + d3, this.animal.posY + d4, this.animal.posZ + d5, d0, d1, d2);
        }
        this.animal.setTicks(24000);
        this.animal.setLaying(true);
        this.animal.resetInLove();
        this.targetMate.resetInLove();
        this.animal.setNotMateable();
        this.targetMate.setNotMateable();
    }
}
