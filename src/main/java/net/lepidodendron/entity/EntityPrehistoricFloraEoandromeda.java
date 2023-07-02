
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.ai.EntityMateAIJellyfishBase;
import net.lepidodendron.entity.ai.JellyfishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraJellyfishBase;
import net.lepidodendron.item.entities.ItemUnknownPlanula;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPrehistoricFloraEoandromeda extends EntityPrehistoricFloraJellyfishBase {

    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int animationTick;
    private Animation animation = NO_ANIMATION;
    private int rotationDegree;

    public EntityPrehistoricFloraEoandromeda(World world) {
        super(world);
        setSize(0.2F, 0.1F);
    }

    @Override
    public boolean isSmall() {
        return true;
    }

    public static String getPeriod() {return "Ediacaran";}

    //public static String getHabitat() {return "Aquatic";}

    @Override
    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownPlanula.block, (int) (1));
    }

    @Override
    public boolean dropsEggs() {
        return false;
    }

    //Arbitrary for jellyfish as there is no specific AI animation:
    public static final Animation ANIMATION_JELLYFISH_WANDER = Animation.create(0);

    protected void initEntityAI() {
        tasks.addTask(0, new EntityMateAIJellyfishBase(this, 1));
        tasks.addTask(1, new JellyfishWander(this, ANIMATION_JELLYFISH_WANDER));
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    protected float getAISpeedJelly() {
        return 0.02f;
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
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
    }

    @Override
    protected float getSoundVolume() {
        return 1.0F;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        //this.renderYawOffset = this.rotationYaw;
    }

    public void onEntityUpdate()
    {

        if (!(rotationDegree > 0)) {
            rotationDegree = 360;
        }
        if (rotationDegree < 1) {
            rotationDegree = 360;
        } else {
            rotationDegree = rotationDegree - 1;
        }

        super.onEntityUpdate();
        //Drop an egg perhaps:
        if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && LepidodendronConfig.doMultiplyMobs) {
            if (Math.random() > 0.5) {
                ItemStack itemstack = new ItemStack(ItemUnknownPlanula.block, (int) (1));
                if (!itemstack.hasTagCompound()) {
                    itemstack.setTagCompound(new NBTTagCompound());
                }
                String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
                itemstack.getTagCompound().setString("creature", stringEgg);
                EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
                entityToSpawn.setPickupDelay(10);
                this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                world.spawnEntity(entityToSpawn);
            }
            this.setTicks(0);
        }
    }

    public int getRotationDegree() {
        //System.err.println((int) Math.round((double)this.rotationDegree / 1D));
        return (int) Math.round((double)this.rotationDegree / 1D);
    }

    @Override
    protected Item getDropItem() {
        //return new ItemStack(ItemJellyfishMeat.block, (int) (1)).getItem();
        return null;
    }

}