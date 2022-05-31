package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.pathfinding.Path;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;

public class AttackAI extends EntityAIBase {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final double speed;
    private final boolean memory;
    private Path currentPath;

    public AttackAI(EntityPrehistoricFloraAgeableBase entity, double speed, boolean memory, int attackLength) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.setMutexBits(7);
    }

    @Override
    public boolean shouldExecute() {
        EntityLivingBase target = this.entity.getAttackTarget();
        if (target == null || !target.isEntityAlive()) {

            return false;
        } else if (this.entity.world.getDifficulty() == EnumDifficulty.PEACEFUL && target instanceof EntityPlayer) {

            return false;
        }
        this.currentPath = this.entity.getNavigator().getPathToEntityLiving(target);
        return this.currentPath != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        EntityLivingBase entity = this.entity.getAttackTarget();
        return this.entity.getWillHunt() && entity != null && (entity.isEntityAlive() && (!this.memory ? !this.entity.getNavigator().noPath() : this.entity.isWithinHomeDistanceFromPosition(entity.getPosition())));
    }

    @Override
    public void startExecuting() {
        if (this.entity.getControllingPassenger() == null) {
            this.entity.getNavigator().setPath(this.currentPath, this.speed);
        }
    }

    @Override
    public void resetTask() {
        this.entity.getNavigator().clearPath();
    }

    @Override
    public void updateTask() {
        EntityLivingBase target = this.entity.getAttackTarget();
        if (!this.entity.world.isRemote) {this.entity.selectNavigator();}
        if (target == null) {
            return;
        }
        if (this.entity.getControllingPassenger() == null) {
            //if (!(this.entity instanceof EntityPrehistoricFloraLandBase)) {
                EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) this.entity;
                //ee.setIsFast(true);
           // }
            this.entity.getNavigator().tryMoveToEntityLiving(target, this.speed);
        }
        if (this.entity.getAttackBoundingBox().intersects(target.getEntityBoundingBox())) {
            this.entity.attackEntityAsMob(target);
            //Apply a slight slowdown to the target:
            if (target instanceof EntityLivingBase) {
                ((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 1, false, false));
            }
            if (this.entity.ATTACK_ANIMATION != null) {
                if (this.entity.getAnimation() != this.entity.ATTACK_ANIMATION) {
                    //System.err.println("Set AI");
                    //AnimationHandler.INSTANCE.sendAnimationMessage(this.entity, this.entity.ATTACK_ANIMATION);
                    this.entity.setAnimation(this.entity.ATTACK_ANIMATION);
                }
            }
        } else {
            if (!(this.entity instanceof EntityPrehistoricFloraLandBase)) {
                this.entity.getLookHelper().setLookPositionWithEntity(target, 30.0F, 30.0F);
            }
        }
    }
}