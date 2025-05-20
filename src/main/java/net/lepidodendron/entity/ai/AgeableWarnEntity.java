package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.lepidodendron.entity.EntityPrehistoricFloraEustreptospondylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandCarnivoreBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumDifficulty;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class AgeableWarnEntity <T extends Entity> extends EntityAIBase
{
    private final Predicate<Entity> canBeSeenSelector;
    protected EntityCreature entity;
    protected Random rand = new Random();
    protected T closestLivingEntity;
    private final float warnDistance;
    private final Class<T> classToWarn;
    private final Predicate <? super T > warnTargetSelector;

    public AgeableWarnEntity(EntityCreature entityIn, Class<T> classToWarnIn, float warnDistanceIn)
    {
        this(entityIn, classToWarnIn, Predicates.alwaysTrue(), warnDistanceIn);
    }

    public AgeableWarnEntity(EntityCreature entityIn, Class<T> classToWarnIn, Predicate <? super T > warnTargetSelectorIn, float warnDistanceIn)
    {
        this.canBeSeenSelector = new Predicate<Entity>()
        {
            public boolean apply(@Nullable Entity p_apply_1_)
            {
                return p_apply_1_.isEntityAlive() && AgeableWarnEntity.this.entity.getEntitySenses().canSee(p_apply_1_) && !AgeableWarnEntity.this.entity.isOnSameTeam(p_apply_1_);
            }
        };
        this.entity = entityIn;
        this.classToWarn = classToWarnIn;
        this.warnTargetSelector = warnTargetSelectorIn;
        this.warnDistance = warnDistanceIn;
        this.setMutexBits(1);
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public boolean shouldExecute()
    {

        if (this.entity instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase ageableBase = (EntityPrehistoricFloraAgeableBase) this.entity;
            if (ageableBase.isAnimationDirectionLocked(ageableBase.getAnimation())) {
                return false;
            }
            if ((!ageableBase.isPFAdult()) || ageableBase.getWarnTarget() != null || ageableBase.getAttackTarget() != null || ageableBase.getEatTarget() != null) {
                return false;
            }

            if (ageableBase.getWarnTarget() != null && ageableBase.getAttackTarget() != ageableBase.getWarnTarget()) {
                if (!isDirectPathBetweenPoints(ageableBase.getPositionVector(), ageableBase.getWarnTarget().getPositionVector())) {
                    ageableBase.setWarnTarget(null);
                    ageableBase.setWarnCooldown(0);
                    return false;
                }
            }

            List<T> list = this.entity.world.<T>getEntitiesWithinAABB(this.classToWarn, this.entity.getEntityBoundingBox().grow((double)this.warnDistance, 3.0D, (double)this.warnDistance), Predicates.and(EntitySelectors.CAN_AI_TARGET, this.canBeSeenSelector, this.warnTargetSelector));

            if (list.isEmpty())
            {
                ageableBase.setWarnTarget(null);
                ageableBase.setWarnCooldown(0);
                return false;
            }
            else
            {
                if (ageableBase.getWarnTarget() != null) {
                    ageableBase.faceEntity(ageableBase.getWarnTarget(), 10, 10);
                    ageableBase.getLookHelper().setLookPositionWithEntity(ageableBase.getWarnTarget(), 10.0F, (float)ageableBase.getVerticalFaceSpeed());
                    return false;
                }
                this.closestLivingEntity = list.get(0);
                if (this.entity.world.getDifficulty() == EnumDifficulty.PEACEFUL && this.closestLivingEntity instanceof EntityPlayer) {
                    return false;
                }
                if (this.closestLivingEntity instanceof EntityPlayer) {
                    if (((EntityPlayer)this.closestLivingEntity).capabilities.disableDamage) {
                        return false;
                    }
                }
                if (this.closestLivingEntity.isInvisible()) {
                    return false;
                }
                if (this.closestLivingEntity instanceof EntityLivingBase) {
                    ageableBase.setWarnTarget((EntityLivingBase) this.closestLivingEntity);
                    ageableBase.setWarnCooldown(ageableBase.warnCooldownTime());
                    ageableBase.setAttackTarget(null);
                    ageableBase.getNavigator().clearPath(); //Stop it moving
                    ageableBase.faceEntity(this.closestLivingEntity, 10, 10);
                    ageableBase.getLookHelper().setLookPositionWithEntity(this.closestLivingEntity, 10.0F, (float)ageableBase.getVerticalFaceSpeed());

                    SoundEvent soundevent = null;
                    if (ageableBase instanceof EntityPrehistoricFloraLandCarnivoreBase) {
                        soundevent = ((EntityPrehistoricFloraLandCarnivoreBase) ageableBase).getRoarSound();
                    }
                    else if (ageableBase instanceof EntityPrehistoricFloraEustreptospondylus) {
                        soundevent = ((EntityPrehistoricFloraEustreptospondylus) ageableBase).getRoarSound();
                    }
                    else {
                        soundevent = ageableBase.getAmbientSoundPublic();
                    }
                    if (soundevent != null) {
                        ageableBase.setAnimation(ageableBase.ROAR_ANIMATION);
                        ageableBase.playSound(soundevent, 1, (rand.nextFloat() - rand.nextFloat()) * 0.2F + 1.0F);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean shouldContinueExecuting()
    {
        return false;
    }

    public void startExecuting()
    {

    }

    public void resetTask()
    {

    }

    public void updateTask()
    {

    }
}
