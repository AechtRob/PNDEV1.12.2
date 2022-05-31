package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;

public abstract class AnimationAINoAnimation<T extends Entity & IAnimatedEntity> extends EntityAIBase {
    protected T entity;

    public AnimationAINoAnimation(T entity) {
        this.entity = entity;
        this.setMutexBits(7);
    }

    public abstract Animation getAnimation();

    public boolean isAutomatic() {
        return false;
    }

    public boolean shouldAnimate() {
        return false;
    }

    @Override
    public void startExecuting() {
    }

}
