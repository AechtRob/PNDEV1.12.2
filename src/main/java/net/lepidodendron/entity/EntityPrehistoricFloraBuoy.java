
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraJellyfishBase;
import net.lepidodendron.item.ItemBuoyItem;
import net.lepidodendron.item.entities.ItemUnknownPlanula;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPrehistoricFloraBuoy extends EntityPrehistoricFloraJellyfishBase {
    private static final DataParameter<Integer> TIME_SINCE_HIT = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraBuoy.class, DataSerializers.VARINT);
    private static final DataParameter<Float> DAMAGE_TAKEN = EntityDataManager.<Float>createKey(EntityPrehistoricFloraBuoy.class, DataSerializers.FLOAT);

    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int animationTick;
    private Animation animation = NO_ANIMATION;

    public EntityPrehistoricFloraBuoy(World world) {
        super(world);
        setSize(1.5F, 2.0F);
    }

    public EntityPrehistoricFloraBuoy(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(TIME_SINCE_HIT, Integer.valueOf(0));
        this.dataManager.register(DAMAGE_TAKEN, Float.valueOf(0.0F));
    }

    @Override
    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownPlanula.block, (int) (1));
    }

    @Override
    public boolean isSmall() {
        return false;
    }

    @Override
    public boolean isRiding() {
        return false;
    }

    @Override
    public boolean getCanBreed() {
        return false;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else if (!this.world.isRemote && !this.isDead)
        {
            if (source instanceof EntityDamageSourceIndirect && source.getTrueSource() != null && this.isPassenger(source.getTrueSource()))
            {
                return false;
            }
            else
            {
                this.setTimeSinceHit(10);
                this.setDamageTaken(this.getDamageTaken() + amount * 10.0F);
                this.markVelocityChanged();
                boolean flag = source.getTrueSource() instanceof EntityPlayer && ((EntityPlayer)source.getTrueSource()).capabilities.isCreativeMode;

                if (flag || this.getDamageTaken() > 40.0F)
                {
                    if (!flag && this.world.getGameRules().getBoolean("doEntityDrops"))
                    {
                        this.dropItemWithOffset(ItemBuoyItem.block, 1, 0.0F);
                    }

                    this.setDead();
                }

                return true;
            }
        }
        else
        {
            return true;
        }
    }

    public void setDamageTaken(float damageTaken)
    {
        this.dataManager.set(DAMAGE_TAKEN, Float.valueOf(damageTaken));
    }

    public float getDamageTaken()
    {
        return ((Float)this.dataManager.get(DAMAGE_TAKEN)).floatValue();
    }

    public void setTimeSinceHit(int timeSinceHit)
    {
        this.dataManager.set(TIME_SINCE_HIT, Integer.valueOf(timeSinceHit));
    }

    public int getTimeSinceHit()
    {
        return ((Integer)this.dataManager.get(TIME_SINCE_HIT)).intValue();
    }


    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
        this.setAir(300); //Workaround!
    }

    @Override
    public String getBucketMessage() {
        return "";
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        return 0;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return false;
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        return false;
    }

    @Override
    public boolean isPushedByWater()
    {
        return true;
    }

    public boolean isSurface() {
        return true;
    }

    public static String getPeriod() {return "N/A";}

    //public static String getHabitat() {return "Aquatic";}

    @Override
    public boolean dropsEggs() {
        return false;
    }

    protected void initEntityAI() {
    }

    @Override
    public String getTexture() {
        return this.getTexture();
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(0.01D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    protected float getAISpeedJelly() {
        return 0.00f;
    }

    @Override
    public int getAnimationTick() {
        return getAnimationTick();
    }

    @Override
    public void setAnimationTick(int tick)
    {
        animationTick = tick;
    }

    @Override
    public Animation getAnimation()
    {
        return null;
    }

    @Override
    public void setAnimation(Animation animation)
    {
        this.animation = animation;
    }

    @Override
    public Animation[] getAnimations()
    {
        return null;
    }

    @Override
    public boolean isInWater() {
        return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    @Override
    public SoundEvent getAmbientSound() {
        return (SoundEvent) SoundEvent.REGISTRY
                .getObject(new ResourceLocation("lepidodendron:buoy_bell"));
    }

    @Override
    public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
    }

    @Override
    public net.minecraft.util.SoundEvent getDeathSound() {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
    }

    @Override
    protected float getSoundVolume() {
        return 1.0F;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;
    }

    @Override
    protected Item getDropItem() {
        return new ItemStack(ItemBuoyItem.block, (int) (1)).getItem();
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.2F;
    }

    @Override
    public float getDistance(Entity entityIn)
    {
        float f = (float)(this.posX - entityIn.posX);
        float f1 = (float)(this.posY - entityIn.posY);
        float f2 = (float)(this.posZ - entityIn.posZ);
        if (entityIn instanceof EntityPrehistoricFloraBuoyRopeEnd) {
            return MathHelper.sqrt(f * f + f1 * f1 + f2 * f2) - 64;
        }
        return MathHelper.sqrt(f * f + f1 * f1 + f2 * f2);
    }




}
