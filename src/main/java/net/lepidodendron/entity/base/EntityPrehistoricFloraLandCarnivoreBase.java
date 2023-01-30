package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraLandCarnivoreBase extends EntityPrehistoricFloraLandBase {

    public int roarSoundTime;
    public Animation NOISE_ANIMATION; //Additional roaring
    public Animation HURT_ANIMATION;
    private int inPFLove;
    private BlockPos drinkingFrom;

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
    public int getTalkInterval() {
        return 400;
    }

    public int getRoarInterval() {
        return 160;
    }

    @Override
    public void eatItem(ItemStack stack) {
        if (stack != null && stack.getItem() != null) {
            float itemHealth = 0.5F; //Default minimal nutrition
            if (stack.getItem() instanceof ItemFood) {
                itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
            }
            this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            //stack.shrink(1);
            if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
                this.setAnimation(EAT_ANIMATION);
                //stack.shrink(1);
            }
        }
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        //this.setBiteTicks(0);
        return livingdata;
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
        else if (this.isEntityAlive() && this.rand.nextInt(1000) < this.roarSoundTime++ && !this.world.isRemote)
        {
            this.roarSoundTime = -this.getRoarInterval();
            SoundEvent soundevent = this.getRoarSound();
            if (soundevent != null)
            {
                if (this.getAnimation() == NO_ANIMATION) {
                    this.setAnimation(NOISE_ANIMATION);
                    //System.err.println("Playing noise sound on remote: " + (world.isRemote));
                    this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
                }
            }
        }
    }

    public SoundEvent getRoarSound() { //Roar
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(null));
    }

    @Override
    public SoundEvent getAmbientSound() { //Noise
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation(null));
    }


}