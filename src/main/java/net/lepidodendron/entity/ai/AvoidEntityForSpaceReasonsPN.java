package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.List;

public class AvoidEntityForSpaceReasonsPN extends EntityAIBase
{
    protected double x;
    protected double y;
    protected double z;
    private final Predicate<Entity> canBeSeenSelector;
    protected EntityCreature entity;
    protected EntityLivingBase closestLivingEntity;
    private Path path;

    public AvoidEntityForSpaceReasonsPN(EntityCreature entityIn)
    {
        this.canBeSeenSelector = new Predicate<Entity>()
        {
            public boolean apply(@Nullable Entity p_apply_1_)
            {
                return p_apply_1_.isEntityAlive() && AvoidEntityForSpaceReasonsPN.this.entity.getEntitySenses().canSee(p_apply_1_) && !AvoidEntityForSpaceReasonsPN.this.entity.isOnSameTeam(p_apply_1_);
            }
        };
        this.entity = entityIn;
        this.setMutexBits(1);
    }

    @Override
    public boolean shouldExecute()
    {

        if (this.entity.width <= 1) {
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            if (((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).isReallyFlying()) {
                ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity.getAttackTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return false;
        }

        if (this.entity.getRevengeTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getAlarmTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getGrappleTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getWarnTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getEatTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getLaying()) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        List<EntityLivingBase> list = this.entity.world.getEntitiesWithinAABB(EntityLivingBase.class, this.entity.getEntityBoundingBox().grow((double)this.entity.width/2, (double)this.entity.height/2, (double)this.entity.width/2), Predicates.and(EntitySelectors.CAN_AI_TARGET, this.canBeSeenSelector, Predicates.alwaysTrue()));

        if (list.isEmpty())
        {
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
            }
            this.closestLivingEntity = null;
            return false;
        }
        else
        {
            for (Entity currentEntity : list) {
                if (this.entity == currentEntity) {
                    continue;
                }
                if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                    if (((EntityPrehistoricFloraAgeableBase)this.entity).getIsSneaking()) {
                        continue;
                    }
                }
                if (currentEntity.width >= this.entity.width) {
                    Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, (int)Math.ceil(this.entity.width * 1.5), 7, new Vec3d(currentEntity.posX, currentEntity.posY, currentEntity.posZ));
                    if (vec3d == null) {
                        continue;
                    }
                    if (currentEntity.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < currentEntity.getDistanceSq(this.entity)) {
                        continue;
                    }
                    this.path = entity.getNavigator().getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);
                    if (this.path != null) {
                        this.x = vec3d.x;
                        this.y = vec3d.y;
                        this.z = vec3d.z;
                        this.closestLivingEntity = (EntityLivingBase) currentEntity;
                        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                            ((EntityPrehistoricFloraAgeableBase) this.entity).setAnimation(((EntityPrehistoricFloraAgeableBase) this.entity).NO_ANIMATION);
                        }
                        return true;
                    }
                }
            }
        }
        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
        }
        this.closestLivingEntity = null;
        return false;
    }

    @Override
    public boolean shouldContinueExecuting()
    {
        if (entity.getNavigator().noPath()) {
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
            }
        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            if (((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).isReallyFlying()) {
                ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity.getAttackTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return false;
        }

        if (this.entity.getRevengeTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getAlarmTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getGrappleTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getWarnTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getEatTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getLaying()) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return false;
            }
        }
        return !entity.getNavigator().noPath();
    }

    @Override
    public void startExecuting() {
        if (this.closestLivingEntity == null) {
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
            }
            return;
        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            if (((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).isReallyFlying()) {
                ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }

        if (this.entity.getAttackTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return;
        }

        if (this.entity.getRevengeTarget() != null) {
            ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
            this.closestLivingEntity = null;
            return;
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getAlarmTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getGrappleTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getWarnTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getEatTarget() != null) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            if (((EntityPrehistoricFloraAgeableBase) this.entity).getLaying()) {
                ((EntityPrehistoricFloraAgeableBase) this.entity).setAvoidTarget(null);
                this.closestLivingEntity = null;
                return;
            }
        }
        entity.getNavigator().tryMoveToXYZ(x, y, z, 1.0);
        if (entity instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase entityBase = (EntityPrehistoricFloraAgeableBase) entity;
            if (entityBase.hasAlarm()) {
                entityBase.setAlarmTarget(this.closestLivingEntity);
                List<EntityPrehistoricFloraAgeableBase> AgeableBases = entity.world.getEntitiesWithinAABB(entityBase.getClass(), new AxisAlignedBB(entityBase.getPosition().add(-8, -4, -8), entityBase.getPosition().add(8, 4, 8)));
                for (EntityPrehistoricFloraAgeableBase currentEntity : AgeableBases) {
                    if (currentEntity.getClass() == entityBase.getClass()) {
                        currentEntity.setAnimation(EntityPrehistoricFloraAgeableBase.NO_ANIMATION);
                        currentEntity.setAlarmTarget(this.closestLivingEntity);
                        currentEntity.screamAlarmCooldown = entity.world.rand.nextInt(20);
                    }
                }
            }
        }
        super.startExecuting();
    }

    @Override
    public void resetTask()
    {
        this.closestLivingEntity = null;
        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
        }
    }

    @Override
    public void updateTask()
    {
        if (this.closestLivingEntity == null || this.closestLivingEntity.isDead) {
            this.closestLivingEntity = null;
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
            }
            return;
        }
        if (this.entity.getDistanceSq(this.closestLivingEntity) < 49.0D)
        {
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(this.closestLivingEntity);
            }
        }
        else
        {
            if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
                ((EntityPrehistoricFloraAgeableBase)this.entity).setAvoidTarget(null);
            }
        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            if (!((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).isReallyFlying()) {
                ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).setAvoidTarget(null);
                ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity).setFlying();
                this.closestLivingEntity = null;
            }
        }
    }
}

