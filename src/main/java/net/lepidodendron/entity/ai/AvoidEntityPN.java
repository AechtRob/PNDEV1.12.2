package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.lepidodendron.entity.ai.helpers.TestPrey;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.List;

public class AvoidEntityPN<T extends Entity> extends EntityAIBase
{
    private final Predicate<Entity> canBeSeenSelector;
    protected EntityCreature entity;
    private final double farSpeed;
    private final double nearSpeed;
    protected EntityLivingBase closestLivingEntity;
    private final float avoidDistance;
    private Path path;
    private final PathNavigate navigation;
    private final Class<T> classToAvoid;

    public AvoidEntityPN(EntityCreature entityIn, Class<T> classToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn)
    {
        this.canBeSeenSelector = new Predicate<Entity>()
        {
            public boolean apply(@Nullable Entity p_apply_1_)
            {
                return p_apply_1_.isEntityAlive() && AvoidEntityPN.this.entity.getEntitySenses().canSee(p_apply_1_) && !AvoidEntityPN.this.entity.isOnSameTeam(p_apply_1_);
            }
        };
        this.entity = entityIn;
        this.classToAvoid = classToAvoidIn;
        this.avoidDistance = avoidDistanceIn;
        this.farSpeed = farSpeedIn;
        this.nearSpeed = nearSpeedIn;
        this.navigation = entityIn.getNavigator();
        this.setMutexBits(1);
    }

    public boolean shouldExecute()
    {
        List<T> list = this.entity.world.<T>getEntitiesWithinAABB(this.classToAvoid, this.entity.getEntityBoundingBox().grow((double)this.avoidDistance, 3.0D, (double)this.avoidDistance), Predicates.and(EntitySelectors.CAN_AI_TARGET, this.canBeSeenSelector, Predicates.alwaysTrue()));

        if (list.isEmpty())
        {
            this.closestLivingEntity = null;
            return false;
        }
        else
        {
            for (Entity currentEntity : list) {
                if (TestPrey.result(currentEntity, this.entity) != this.entity) {
                    Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, 16, 7, new Vec3d(currentEntity.posX, currentEntity.posY, currentEntity.posZ));

                    if (vec3d == null) {
                        continue;
                    } else if (currentEntity.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < currentEntity.getDistanceSq(this.entity)) {
                        continue;
                    } else {
                        this.path = this.navigation.getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);
                        if (this.path != null) {
                            this.closestLivingEntity = (EntityLivingBase) currentEntity;
                            return true;
                        }
                    }
                }
            }
        }
        this.closestLivingEntity = null;
        return false;
    }

    public boolean shouldContinueExecuting()
    {
        return !this.navigation.noPath();
    }

    public void startExecuting()
    {
        this.navigation.setPath(this.path, this.farSpeed);
    }

    public void resetTask()
    {
        this.closestLivingEntity = null;
    }

    public void updateTask()
    {
        if (this.entity.getDistanceSq(this.closestLivingEntity) < 49.0D)
        {
            this.entity.getNavigator().setSpeed(this.nearSpeed);
        }
        else
        {
            this.entity.getNavigator().setSpeed(this.farSpeed);
        }
    }
}

