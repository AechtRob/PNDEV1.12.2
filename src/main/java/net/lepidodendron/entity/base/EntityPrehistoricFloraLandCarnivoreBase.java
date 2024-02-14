package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraLandCarnivoreBase extends EntityPrehistoricFloraLandBase {

    public static Animation NOISE_ANIMATION; //Ambient noises (roar is re-purposed for warning)
    public Animation HURT_ANIMATION;

    public EntityPrehistoricFloraLandCarnivoreBase(World world) {
        super(world);
        NOISE_ANIMATION = Animation.create(this.getNoiseLength());
        HURT_ANIMATION = Animation.create(this.getHurtLength());
    }

    public int getNoiseLength() {
        return 60;
    }

    public int getHurtLength() {
        return 30;
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, HURT_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, NOISE_ANIMATION, MAKE_NEST_ANIMATION};
    }

    @Override
    public boolean isAnimationDirectionLocked(Animation animation) {
        return animation == ROAR_ANIMATION; //warning a player
    }

    @Override
    public int getTalkInterval() {
        return 400;
    }

    @Override
    public void playLivingSound() {
        if (this.getAnimation() == NO_ANIMATION && (!this.getIsSneaking())) {
            if (!this.world.isRemote) {
                this.setAnimation(NOISE_ANIMATION);
                SoundEvent soundevent = this.getAmbientSound();
                if (soundevent != null)
                {
                    this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
                }
            }
        }
    }

    @Override
    public void eatItem(ItemStack stack) {
        if (stack != null && stack.getItem() != null) {
            float itemHealth = 0.5F; //Default minimal nutrition
            if (stack.getItem() instanceof ItemFood) {
                itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
            }
            this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
                this.setAnimation(EAT_ANIMATION);
            }
        }
    }

    public int getEatTick() {return 1;}

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        if (this.getAnimation() == EAT_ANIMATION) {
            if (this.getAnimationTick() == getEatTick()) {
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }

        if (this.getAnimation() == ROAR_ANIMATION && this.getWarnTarget() != null) {
            this.faceEntity(this.getWarnTarget(), 10, 10);
        }

    }

    @Nullable
    public SoundEvent getRoarSound() { //Roar
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getAmbientSound() { //Noise
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(""));
    }

}