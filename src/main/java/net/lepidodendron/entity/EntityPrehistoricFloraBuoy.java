
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraJellyfishBase;
import net.lepidodendron.item.entities.ItemUnknownPlanula;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPrehistoricFloraBuoy extends EntityPrehistoricFloraJellyfishBase {

    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int animationTick;
    private Animation animation = NO_ANIMATION;

    public EntityPrehistoricFloraBuoy(World world) {
        super(world);
        setSize(2.0F, 2.0F);
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
    public boolean attackEntityFrom(DamageSource ds, float i) {
        return false;
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
    public net.minecraft.util.SoundEvent getAmbientSound() {
        return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
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
        //return new ItemStack(ItemBuoy.block, (int) (1)).getItem();
        return null;
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
