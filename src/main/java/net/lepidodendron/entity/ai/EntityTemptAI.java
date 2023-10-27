package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;

public class EntityTemptAI extends EntityAIBase
{
    private final EntityPrehistoricFloraAgeableBase temptedEntity;
    private final double speed;
    private double targetX;
    private double targetY;
    private double targetZ;
    private double pitch;
    private double yaw;
    private EntityPlayer temptingPlayer;
    private int delayTemptCounter;
    private int delaySnatchCounter;
    private boolean isRunning;
    private boolean willSnatch;
    private float snatchDamage;
    private final boolean scaredByPlayerMovement;

    public EntityTemptAI(EntityPrehistoricFloraAgeableBase temptedEntityIn, double speedIn, boolean scaredByPlayerMovementIn, boolean willSnatchIn, float snatchDamageIn)
    {
        this.temptedEntity = temptedEntityIn;
        this.speed = speedIn;
        this.snatchDamage = snatchDamageIn;
        this.scaredByPlayerMovement = scaredByPlayerMovementIn;
        this.willSnatch = willSnatchIn;
        this.setMutexBits(3);

    }

    public boolean shouldExecute()
    {

        if (this.temptedEntity.getEatTarget() != null) {
            return false;
        }

        if (this.temptedEntity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase landbase = (EntityPrehistoricFloraLandBase) this.temptedEntity;
            if (landbase.isAnimationDirectionLocked(landbase.getAnimation())) {
                return false;
            }
        }

        if (this.delaySnatchCounter > 0)
        {
            --this.delaySnatchCounter;
            return false;
        }

        if (this.delayTemptCounter > 0)
        {
            --this.delayTemptCounter;
            return false;
        }
        else
        {
            this.temptingPlayer = this.temptedEntity.world.getClosestPlayerToEntity(this.temptedEntity, 10.0D);

            if (this.temptingPlayer == null)
            {
                return false;
            }
            else
            {
                return this.isTempting(this.temptingPlayer.getHeldItemMainhand()) || this.isTempting(this.temptingPlayer.getHeldItemOffhand());
            }
        }
    }

    protected boolean isTempting(ItemStack stack)
    {
        //return this.temptItem.contains(stack.getItem());
        return this.temptedEntity.isBreedingItem(stack);
    }

    public boolean shouldContinueExecuting()
    {
        if (this.temptedEntity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase landbase = (EntityPrehistoricFloraLandBase) this.temptedEntity;
            if (landbase.isAnimationDirectionLocked(landbase.getAnimation())) {
                landbase.getNavigator().clearPath();
                return false;
            }
        }
        if (this.scaredByPlayerMovement)
        {
            if (this.temptedEntity.getDistanceSq(this.temptingPlayer) < 36.0D)
            {
                if (this.temptingPlayer.getDistanceSq(this.targetX, this.targetY, this.targetZ) > 0.010000000000000002D)
                {
                    return false;
                }

                if (Math.abs((double)this.temptingPlayer.rotationPitch - this.pitch) > 5.0D || Math.abs((double)this.temptingPlayer.rotationYaw - this.yaw) > 5.0D)
                {
                    return false;
                }
            }
            else
            {
                this.targetX = this.temptingPlayer.posX;
                this.targetY = this.temptingPlayer.posY;
                this.targetZ = this.temptingPlayer.posZ;
            }

            this.pitch = (double)this.temptingPlayer.rotationPitch;
            this.yaw = (double)this.temptingPlayer.rotationYaw;
        }

        return this.shouldExecute();
    }

    public void startExecuting()
    {
        this.targetX = this.temptingPlayer.posX;
        this.targetY = this.temptingPlayer.posY;
        this.targetZ = this.temptingPlayer.posZ;
        this.isRunning = true;
    }

    public void resetTask()
    {
        this.temptingPlayer = null;
        this.temptedEntity.getNavigator().clearPath();
        this.delayTemptCounter = 100;
        this.isRunning = false;
    }

    public void updateTask()
    {
        this.temptedEntity.getLookHelper().setLookPositionWithEntity(this.temptingPlayer, (float)(this.temptedEntity.getHorizontalFaceSpeed() + 20), (float)this.temptedEntity.getVerticalFaceSpeed());

        if (this.temptedEntity.getDistanceSq(this.temptingPlayer) < 6.25D && !this.willSnatch)
        {
            this.temptedEntity.getNavigator().clearPath();
        }
        else if (this.temptedEntity.getDistanceSq(this.temptingPlayer) < 3.00D && this.willSnatch && (!this.temptingPlayer.capabilities.isCreativeMode) && this.delaySnatchCounter == 0) {
            //Snatch this food from the player and damage the player:
            
            //Leap toward the player:
            double d0 = this.temptingPlayer.posX - this.temptedEntity.posX;
            double d1 = this.temptingPlayer.posZ - this.temptedEntity.posZ;
            float f = MathHelper.sqrt(d0 * d0 + d1 * d1);
            if ((double)f >= 1.0E-4D)
            {
                this.temptedEntity.motionX += d0 / (double)f * 0.5D * 0.800000011920929D + this.temptedEntity.motionX * 0.20000000298023224D;
                this.temptedEntity.motionZ += d1 / (double)f * 0.5D * 0.800000011920929D + this.temptedEntity.motionZ * 0.20000000298023224D;
            }
            
            //Remove the item and eat it:
            if (this.isTempting(this.temptingPlayer.getHeldItemMainhand())) {
                ItemStack itemstack = this.temptingPlayer.getHeldItem(EnumHand.MAIN_HAND);
                float itemHealth = 0.5F; //Default minimal nutrition
                if (itemstack.getItem() instanceof ItemFood) {
                    itemHealth = ((ItemFood) itemstack.getItem()).getHealAmount(itemstack);
                }
                this.temptedEntity.setHealth(Math.min(this.temptedEntity.getHealth() + itemHealth, (float) this.temptedEntity.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
                if (this.temptedEntity.getAnimation() == this.temptedEntity.NO_ANIMATION) {
                    //this.setAnimation(ATTACK_ANIMATION);
                    this.temptedEntity.setAnimation(this.temptedEntity.ATTACK_ANIMATION);
                    SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                    this.temptedEntity.getEntityWorld().playSound(null, this.temptedEntity.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                itemstack.shrink(1);
            }
            else if (this.isTempting(this.temptingPlayer.getHeldItemOffhand())) {
                ItemStack itemstack = this.temptingPlayer.getHeldItem(EnumHand.OFF_HAND);
                float itemHealth = 0.5F; //Default minimal nutrition
                if (itemstack.getItem() instanceof ItemFood) {
                    itemHealth = ((ItemFood) itemstack.getItem()).getHealAmount(itemstack);
                }
                this.temptedEntity.setHealth(Math.min(this.temptedEntity.getHealth() + itemHealth, (float) this.temptedEntity.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
                if (this.temptedEntity.getAnimation() == this.temptedEntity.NO_ANIMATION) {
                    //this.setAnimation(ATTACK_ANIMATION);
                    this.temptedEntity.setAnimation(this.temptedEntity.ATTACK_ANIMATION);
                    SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                    this.temptedEntity.getEntityWorld().playSound(null, this.temptedEntity.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                itemstack.shrink(1);
            }

            //And damage the player partially:
            if (this.snatchDamage != 0) {
                boolean b = this.temptingPlayer.attackEntityFrom(DamageSource.causeMobDamage(this.temptedEntity), this.snatchDamage);
            }
            this.temptedEntity.getNavigator().clearPath();
            this.delaySnatchCounter = 100;
        }
        else
        {
            this.temptedEntity.getNavigator().tryMoveToEntityLiving(this.temptingPlayer, this.speed);
        }
    }

    public boolean isRunning()
    {
        return this.isRunning;
    }
}
