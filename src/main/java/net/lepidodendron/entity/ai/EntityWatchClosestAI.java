package net.lepidodendron.entity.ai;

import com.google.common.base.Predicates;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.util.ICurious;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class EntityWatchClosestAI extends EntityAIBase
{
    protected EntityLiving entity;
    protected Entity closestEntity;
    protected float maxDistance;
    private boolean noSpin;
    private boolean watchesSelf;
    private int lookTime;
    private final float chance;
    protected Class <? extends Entity > watchedClass;

    public EntityWatchClosestAI(EntityLiving entityIn, Class <? extends Entity > watchTargetClass, float maxDistance)
    {
        this.entity = entityIn;
        this.watchedClass = watchTargetClass;
        this.maxDistance = maxDistance;
        this.chance = 0.02F;
        this.setMutexBits(2);
        /**
         * nospin is set to true only for certain things which must not look around unless they are walking,
         * typically some lizards which have to freeze in place when not moving
         */
        this.noSpin = false;
        this.watchesSelf = true;
    }

    public EntityWatchClosestAI(EntityLiving entityIn, Class <? extends Entity > watchTargetClass, float maxDistance, boolean nospinIn)
    {
        this.entity = entityIn;
        this.watchedClass = watchTargetClass;
        this.maxDistance = maxDistance;
        this.chance = 0.02F;
        this.setMutexBits(2);
        this.noSpin = nospinIn;
        this.watchesSelf = true;
    }

    public EntityWatchClosestAI(EntityLiving entityIn, Class <? extends Entity > watchTargetClass, float maxDistance, boolean nospinIn, boolean watchesSelfIn)
    {
        this.entity = entityIn;
        this.watchedClass = watchTargetClass;
        this.maxDistance = maxDistance;
        this.chance = 0.02F;
        this.setMutexBits(2);
        this.noSpin = nospinIn;
        this.watchesSelf = watchesSelfIn;
    }

    public EntityWatchClosestAI(EntityLiving entityIn, Class <? extends Entity > watchTargetClass, float maxDistance, float chanceIn)
    {
        this.entity = entityIn;
        this.watchedClass = watchTargetClass;
        this.maxDistance = maxDistance;
        this.chance = chanceIn;
        this.setMutexBits(2);
        this.noSpin = false;
        this.watchesSelf = true;
    }

    public EntityWatchClosestAI(EntityLiving entityIn, Class <? extends Entity > watchTargetClass, float maxDistance, float chanceIn, boolean nospinIn, boolean watchesSelfIn)
    {
        this.entity = entityIn;
        this.watchedClass = watchTargetClass;
        this.maxDistance = maxDistance;
        this.chance = chanceIn;
        this.setMutexBits(2);
        this.noSpin = nospinIn;
        this.watchesSelf = watchesSelfIn;
    }

    public boolean shouldExecute()
    {
        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase LandBase = (EntityPrehistoricFloraAgeableBase) this.entity;
            if (LandBase.isAnimationDirectionLocked(LandBase.getAnimation())) {
                return false;
            }
        }
        if (noSpin && this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (!((EntityPrehistoricFloraAgeableBase)this.entity).getIsMoving()) {
                return false;
            }
        }
        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase landbase = (EntityPrehistoricFloraLandBase) this.entity;
            if (landbase.getAnimation() != landbase.NO_ANIMATION) {
                return false;
            }
        }
//        if (this.entity instanceof EntityPrehistoricFloraAgeableFlyingBase) {
//            EntityPrehistoricFloraAgeableFlyingBase flybase = (EntityPrehistoricFloraAgeableFlyingBase) this.entity;
//            if (flybase.isReallyFlying()) {
//                return false;
//            }
//        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase flybase = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (flybase.isReallyFlying()) {
                return false;
            }
            if (flybase.getAttachmentPos() != null) {
                if (flybase.getAttachmentFacing() != EnumFacing.UP && flybase.getAttachmentFacing() != EnumFacing.DOWN)
                    return false;
            }
        }

        if (this.entity.getRNG().nextFloat() >= this.chance)
        {
            return false;
        }
        else
        {
            if (this.entity.getAttackTarget() != null)
            {
                this.closestEntity = this.entity.getAttackTarget();
            }

            if (this.watchedClass == EntityPlayer.class)
            {
                this.closestEntity = this.entity.world.getClosestPlayer(this.entity.posX, this.entity.posY, this.entity.posZ, (double)this.maxDistance, Predicates.and(EntitySelectors.CAN_AI_TARGET, EntitySelectors.notRiding(this.entity)));
            }
            else if (!this.watchesSelf) {
                this.closestEntity = findNearestEntityWithinAABBNotMe(this.watchedClass, this.entity.getEntityBoundingBox().grow((double)this.maxDistance, 3.0D, (double)this.maxDistance), this.entity);
            }
            else
            {
                this.closestEntity = this.entity.world.findNearestEntityWithinAABB(this.watchedClass, this.entity.getEntityBoundingBox().grow((double)this.maxDistance, 3.0D, (double)this.maxDistance), this.entity);
            }

            return this.closestEntity != null;
        }
    }

    public boolean shouldContinueExecuting()
    {

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase LandBase = (EntityPrehistoricFloraAgeableBase) this.entity;
            if (LandBase.isAnimationDirectionLocked(LandBase.getAnimation())) {
                return false;
            }
        }

        if (!this.closestEntity.isEntityAlive())
        {
            return false;
        }
        else if (this.entity.getDistanceSq(this.closestEntity) > (double)(this.maxDistance * this.maxDistance))
        {
            return false;
        }
        else
        {
            return this.lookTime > 0;
        }
    }

    public void startExecuting()
    {
        this.lookTime = 40 + this.entity.getRNG().nextInt(40);
    }

    public void resetTask()
    {
        this.closestEntity = null;
    }

    public void updateTask()
    {
        if (this.entity instanceof ICurious) {
            ICurious curious = (ICurious)this.entity;
            EntityPrehistoricFloraAgeableBase entityBase = (EntityPrehistoricFloraAgeableBase)this.entity;
            if (entityBase.getAnimation() == entityBase.NO_ANIMATION) {
                entityBase.setAnimation(curious.getCuriousAnimation());
            }
        }
        this.entity.faceEntity(this.closestEntity, 10F, 10F);
        this.entity.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + (double)this.closestEntity.getEyeHeight(), this.closestEntity.posZ, (float)this.entity.getHorizontalFaceSpeed(), (float)this.entity.getVerticalFaceSpeed());
        --this.lookTime;
    }

    public <T extends Entity> T findNearestEntityWithinAABBNotMe(Class <? extends T > entityType, AxisAlignedBB aabb, T closestTo)
    {
        List<T> list = this.entity.world.<T>getEntitiesWithinAABB(entityType, aabb);
        T t = null;
        double d0 = Double.MAX_VALUE;

        for (int j2 = 0; j2 < list.size(); ++j2)
        {
            T t1 = list.get(j2);

            if (t1 != closestTo && EntitySelectors.NOT_SPECTATING.apply(t1) && t1.getClass() != this.entity.getClass())
            {
                double d1 = closestTo.getDistanceSq(t1);

                if (d1 <= d0)
                {
                    t = t1;
                    d0 = d1;
                }
            }
        }

        return t;
    }
}
