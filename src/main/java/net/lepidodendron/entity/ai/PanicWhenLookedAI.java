package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.INervous;
import net.lepidodendron.util.Functions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Comparator;
import java.util.List;

public class PanicWhenLookedAI extends EntityAIBase
{
    protected final EntityPrehistoricFloraAgeableBase creature;
    protected double speed;
    private Path path;
    protected double randPosX;
    protected double randPosY;
    protected double randPosZ;
    private final EntitySorter targetSorter;

    public PanicWhenLookedAI(EntityPrehistoricFloraAgeableBase creature, double speedIn)
    {
        this.creature = creature;
        this.targetSorter = new EntitySorter(creature);
        this.speed = speedIn;
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
        Vec3d vec3d = entityIn.getLook(1.0F).normalize();
        Vec3d vec3d1 = new Vec3d(this.creature.posX - entityIn.posX, this.creature.getEntityBoundingBox().minY + (double)this.creature.getEyeHeight() - (entityIn.posY + (double)entityIn.getEyeHeight()), this.creature.posZ - entityIn.posZ);
        double d0 = vec3d1.length();
        vec3d1 = vec3d1.normalize();
        double d1 = vec3d.dotProduct(vec3d1);
        return d1 > 1.0D - 0.025D / d0 ? entityIn.canEntityBeSeen(this.creature) : false;
    }

    public boolean shouldExecute()
    {
        if (this.creature instanceof EntityPrehistoricFloraLandBase) {
            if (((EntityPrehistoricFloraLandBase) this.creature).isAnimationDirectionLocked(this.creature.getAnimation())) {
                return false;
            }
            if (!(((EntityPrehistoricFloraLandBase) this.creature).getAISpeedLand() > 0)) {
                return false;
            }
            if (this.creature.isInWater()) {
                return false;
            }
        }

        if (this.creature instanceof INervous) {
            INervous nervousEntity = (INervous)this.creature;
            if (nervousEntity.getNervousnessTarget() == null) {
                //Check for anything looking at me:
                if (this.creature.ticksExisted % 10 == 0) {
                    List<EntityLivingBase> entityList = Functions.getEntitiesWithinAABBPN(this.creature.world, EntityLivingBase.class, this.creature.getEntityBoundingBox().grow(24, 12, 24), EntitySelectors.NOT_SPECTATING);
                    entityList.sort(this.targetSorter);
                    for (EntityLivingBase currentEntity : entityList) {
                        if (currentEntity.getClass() != this.creature.getClass() && shouldBeScared(currentEntity)) {
                            nervousEntity.setNervousnessTarget(currentEntity);
                            //Propagate into nearby mobs too:
                            List<EntityLivingBase> nearbyEntity = this.creature.world.getEntitiesWithinAABB(this.creature.getClass(), new AxisAlignedBB(this.creature.getPosition().add(-2, -2, -2), this.creature.getPosition().add(2, 2, 2)));
                            for (EntityLivingBase currentNearbyEntity : nearbyEntity) {
                                if (currentNearbyEntity instanceof EntityPrehistoricFloraLandBase) {
                                    if ((!(((EntityPrehistoricFloraLandBase) currentNearbyEntity).isAnimationDirectionLocked(((EntityPrehistoricFloraLandBase) currentNearbyEntity).getAnimation())))
                                            && (((EntityPrehistoricFloraLandBase) currentNearbyEntity).getAISpeedLand() > 0)) {
                                        ((INervous) currentNearbyEntity).setNervousnessTarget(currentEntity);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
            }
            if (nervousEntity.getNervousnessTarget() == null) {
                this.creature.setIsFast(false);
                return false;
            }
            if (!shouldContinueExecuting()) {
                EntityLivingBase nervousnessTarget = nervousEntity.getNervousnessTarget();
                Vec3d vec3d = null;
                for (int ii = 0; ii < 16; ii++) {
                    vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.creature, 32, 6, new Vec3d(nervousnessTarget.posX, nervousnessTarget.posY, nervousnessTarget.posZ));
                    if (vec3d != null) {
                        if (this.creature.world.isBlockLoaded(new BlockPos(vec3d))) {
                            if (this.creature.getDistanceSq(new BlockPos(vec3d)) >= 256) {
                                break;
                            }
                        }
                    }
                    else {
                        vec3d = null;
                    }
                }
                if (vec3d == null) {
                    return false;
                } else if (nervousnessTarget.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < nervousnessTarget.getDistanceSq(this.creature)) {
                    return false;
                } else {
                    this.path = this.creature.getNavigator().getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);

                    this.randPosX = vec3d.x;
                    this.randPosY = vec3d.y;
                    this.randPosZ = vec3d.z;

                    return this.path != null;
                }
            }
            return true;
        }
        return false;
    }

    public boolean shouldContinueExecuting()
    {
        return !this.creature.getNavigator().noPath();
    }

    public void startExecuting()
    {
        if (this.creature instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase entity = (EntityPrehistoricFloraAgeableBase) this.creature;
            entity.setIsFast(true);
        }
        this.creature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
    }

    public void updateTask()
    {
        if (((INervous)this.creature).getNervousnessTarget() == null) {
            return;
        }
        if (this.creature.getDistanceSq(((INervous)this.creature).getNervousnessTarget()) < 64.0D)
        {
            this.creature.setIsFast(true);
        }
        else
        {
            this.creature.setIsFast(false);
        }
        super.updateTask();
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
