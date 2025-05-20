package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.util.Functions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec3d;

import java.util.Comparator;
import java.util.List;

public class LandWanderAvoidWaterAndHumanAI extends EntityAIBase
{
    protected final EntityPrehistoricFloraLandBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected EntityLivingBase entityToAvoid;
    private final EntitySorter targetSorter;
    private Path path;
    private final PathNavigate navigation;

    public LandWanderAvoidWaterAndHumanAI(EntityPrehistoricFloraLandBase creatureIn, double speedIn)
    {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.targetSorter = new EntitySorter(entity);
        this.navigation = creatureIn.getNavigator();
        this.setMutexBits(1);
    }

    private boolean shouldBeScared(EntityLivingBase entityIn)
    {
        if (entityIn.isInvisible()) {
            return false;
        }
        if (entityIn instanceof EntityPlayer) {
            if (((EntityPlayer)entityIn).isSpectator() || ((EntityPlayer)entityIn).isCreative()) {
                return false;
            }
        }
        if (!(entityIn instanceof EntityPlayer || entityIn instanceof EntityVillager)) {
            return false;
        }
        return true;
    }

    public boolean shouldExecute()
    {

        if (entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
            return false;
        }

        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase ptero = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (ptero.getAttachmentFacing() != EnumFacing.UP) {
                return false;
            }
        }

        if (!(entity.getAISpeedLand() > 0)) {
            return false;
        }
        boolean found = false;
        List<EntityLivingBase> entityList = Functions.getEntitiesWithinAABBPN(this.entity.world, EntityLivingBase.class, this.entity.getEntityBoundingBox().grow(8, 4, 8), EntitySelectors.NOT_SPECTATING);
        entityList.sort(this.targetSorter);
        for (EntityLivingBase currentEntity : entityList) {
            if (currentEntity.getClass() != this.entity.getClass() && shouldBeScared(currentEntity)) {
                this.entityToAvoid = currentEntity;
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }

        Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, 16, 7, new Vec3d(this.entityToAvoid.posX, this.entityToAvoid.posY, this.entityToAvoid.posZ));

        if (vec3d == null)
        {
            return false;
        }
        else if (this.entityToAvoid.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < this.entityToAvoid.getDistanceSq(this.entity))
        {
            return false;
        }
        else
        {
            this.path = this.navigation.getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);
            return this.path != null;
        }
    }

    public void startExecuting()
    {
        this.navigation.setPath(this.path, this.speed);
    }

    public void resetTask()
    {
        this.entityToAvoid = null;
    }

    public boolean shouldContinueExecuting()
    {
       if (this.entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
           this.entity.getNavigator().clearPath();
           return false;
       }

        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            EntityPrehistoricFloraLandClimbingFlyingWalkingBase ptero = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) this.entity;
            if (ptero.getAttachmentFacing() != EnumFacing.UP && this.entity.getNavigator() instanceof PathNavigateGroundNoWater) {
                this.entity.getNavigator().clearPath();
                return false;
            }
        }

        return
                !this.entity.getNavigator().noPath();
    }

    public class EntitySorter implements Comparator<Entity> {
        private final Entity e;

        public EntitySorter(Entity entity) {
            this.e = entity;
        }

        @Override
        public int compare(Entity entity1, Entity entity2) {
            double distance1 = this.e.getDistanceSq(entity1);
            double distance2 = this.e.getDistanceSq(entity2);
            return Double.compare(distance1, distance2);
        }
    }
}
