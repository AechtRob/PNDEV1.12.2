package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;

public class GrappleAI extends EntityAIBase {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final double speed;
    private final boolean memory;
    private final double chance;
    private final Animation grappleAnimation;
    private Path currentPath;

    public GrappleAI(EntityPrehistoricFloraAgeableBase entity, double speed, boolean memory, int attackLength, Animation grappleAnimation, double chance) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.chance = chance;
        this.grappleAnimation = grappleAnimation;
        this.setMutexBits(7);
    }

    @Override
    public boolean shouldExecute() {
        EntityLiving target = this.entity.getGrappleTarget();
        if (Math.random() > this.chance) {
            return false;
        }
        if (target == null || !target.isEntityAlive()) {
            return false;
        } else if (!this.entity.willGrapple) {
            return false;
        } else if (this.entity.getEatTarget() != null || this.entity.getAttackTarget() != null) {
            this.entity.willGrapple=false;
            return false;
        }
        this.currentPath = this.entity.getNavigator().getPathToEntityLiving(target);
        return this.currentPath != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        Entity entity = this.entity.getGrappleTarget();
        return this.entity.willGrapple && entity != null && (entity.isEntityAlive() && (!this.memory ? !this.entity.getNavigator().noPath() : this.entity.isWithinHomeDistanceFromPosition(entity.getPosition())));
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
        Entity target = this.entity.getGrappleTarget();
        if (!this.entity.world.isRemote) {this.entity.selectNavigator();}
        if (target == null) {
            return;
        }
        if (this.entity.getControllingPassenger() == null) {
            this.entity.getNavigator().tryMoveToEntityLiving(target, this.speed);
        }
        if (this.entity.getGrappleBoundingBox().intersects(target.getEntityBoundingBox())) {
            this.entity.grappleEntityAsMob(target);
            if (this.grappleAnimation != null) {
                if (this.entity.getAnimation() != this.grappleAnimation) {
                    this.entity.setAnimation(this.grappleAnimation);
                    this.entity.setOneHit(true); //Tell the mob it is engaged in the "one-hit" thing
                    //Not sure if that last bit works!
                }
            }

        } else {
            if (!(this.entity instanceof EntityPrehistoricFloraLandBase)) {
                this.entity.getLookHelper().setLookPositionWithEntity(target, 30.0F, 30.0F);
            }
        }
    }
}