package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class EntityMateAI extends EntityAIBase
{
    private final EntityPrehistoricFloraAgeableBase animal;
    private final Class <? extends EntityPrehistoricFloraAgeableBase > mateClass;
    World world;
    private EntityPrehistoricFloraAgeableBase targetMate;
    int spawnBabyDelay;
    double moveSpeed;

    public EntityMateAI(EntityPrehistoricFloraAgeableBase animal, double speedIn)
    {
        this(animal, speedIn, animal.getClass());
    }

    public EntityMateAI(EntityPrehistoricFloraAgeableBase animal, double p_i47306_2_, Class <? extends EntityPrehistoricFloraAgeableBase > p_i47306_4_)
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

        if (this.spawnBabyDelay >= 60 && this.animal.getDistanceSq(this.targetMate) < 9.0D)
        {
            this.spawnBaby();
        }
    }

    private EntityPrehistoricFloraAgeableBase getNearbyMate()
    {
        List<EntityPrehistoricFloraAgeableBase> list = this.world.<EntityPrehistoricFloraAgeableBase>getEntitiesWithinAABB(this.mateClass, this.animal.getEntityBoundingBox().grow(8.0D));
        double d0 = Double.MAX_VALUE;
        EntityPrehistoricFloraAgeableBase EntityPrehistoricFloraAgeableBase = null;

        for (EntityPrehistoricFloraAgeableBase EntityPrehistoricFloraAgeableBase1 : list)
        {
            if (this.animal.canMateWith(EntityPrehistoricFloraAgeableBase1) && this.animal.getDistanceSq(EntityPrehistoricFloraAgeableBase1) < d0)
            {
                EntityPrehistoricFloraAgeableBase = EntityPrehistoricFloraAgeableBase1;
                d0 = this.animal.getDistanceSq(EntityPrehistoricFloraAgeableBase1);
            }
        }

        return EntityPrehistoricFloraAgeableBase;
    }

    private void spawnBaby()
    {
        EntityPrehistoricFloraAgeableBase entityageable = this.animal.createPFChild(this.targetMate);

        if (entityageable != null)
        {
            this.animal.setGrowingAge(this.animal.getAdultAge()-6000);
            this.targetMate.setGrowingAge(this.targetMate.getAdultAge()-6000);
            this.animal.resetInLove();
            this.targetMate.resetInLove();
            entityageable.setAgeTicks(0);
            entityageable.setLocationAndAngles(this.animal.posX, this.animal.posY, this.animal.posZ, 0.0F, 0.0F);
            this.world.spawnEntity(entityageable);
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

            if (this.world.getGameRules().getBoolean("doMobLoot"))
            {
                this.world.spawnEntity(new EntityXPOrb(this.world, this.animal.posX, this.animal.posY, this.animal.posZ, random.nextInt(7) + 1));
            }
        }
    }
}
