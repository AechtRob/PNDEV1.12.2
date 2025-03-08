package net.lepidodendron.entity.boats;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.ClientProxyLepidodendronMod;
import net.lepidodendron.LepidodendronBucketHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.gui.GUISubmarine;
import net.lepidodendron.item.ItemSubmarineBatterypack;
import net.lepidodendron.item.ItemSubmarineBatterypackEnhanced;
import net.lepidodendron.item.ItemSubmarineBoatItem;
import net.lepidodendron.util.BlockSounds;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IInventoryChangedListener;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;

public class PrehistoricFloraSubmarine extends EntityBoat implements IAnimatedEntity, IInventoryChangedListener
{
    private static final DataParameter<Integer> TIME_SINCE_HIT = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> FORWARD_DIRECTION = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
    private static final DataParameter<Float> DAMAGE_TAKEN = EntityDataManager.<Float>createKey(PrehistoricFloraSubmarine.class, DataSerializers.FLOAT);
    private static final DataParameter<Integer> RF_SUPPLY = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ENHANCED = EntityDataManager.<Boolean>createKey(PrehistoricFloraSubmarine.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> SHULKER = EntityDataManager.<Boolean>createKey(PrehistoricFloraSubmarine.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean>[] DATA_ID_PADDLE = new DataParameter[] {EntityDataManager.createKey(PrehistoricFloraSubmarine.class, DataSerializers.BOOLEAN), EntityDataManager.createKey(PrehistoricFloraSubmarine.class, DataSerializers.BOOLEAN)};
     private final float[] paddlePositions;
    private float momentum;
    private float outOfControlTicks;
    private float deltaRotation;
    private float deltaPitch;
    private int lerpSteps;
    private double lerpX;
    private double lerpY;
    private double lerpZ;
    private double lerpYaw;
    private double lerpPitch;
    private boolean leftInputDown;
    private boolean rightInputDown;
    private boolean forwardInputDown;
    private boolean backInputDown;
    private boolean downInputDown;
    private boolean upInputDown;
    private boolean leftStrafeInputDown;
    private boolean rightStrafeInputDown;
    private boolean useBucketDown;
    private boolean useClawDown;
    private int bucketTicks = 0;
    private int clawTicks = 0;
    private double waterLevel;
    private float boatGlide;
    private PrehistoricFloraSubmarine.Status status;
    private PrehistoricFloraSubmarine.Status previousStatus;
    private double lastYd;

    private UUID passengerNightVisionUUID;
    private int passengerNightVisionDuration;
    private int passengerNightVisionAmplifier;
    private boolean passengerNightVisionAmbient;
    private boolean passengerNightVisionParticles;
    private boolean passengerNightVision;
    private UUID passengerNightVisionUUIDPassenger;
    private int passengerNightVisionDurationPassenger;
    private int passengerNightVisionAmplifierPassenger;
    private boolean passengerNightVisionAmbientPassenger;
    private boolean passengerNightVisionParticlesPassenger;
    private boolean passengerNightVisionPassenger;

    private UUID passengerWaterBreathingUUID;
    private int passengerWaterBreathingDuration;
    private int passengerWaterBreathingAmplifier;
    private boolean passengerWaterBreathingAmbient;
    private boolean passengerWaterBreathingParticles;
    private boolean passengerWaterBreathing;
    private UUID passengerWaterBreathingUUIDPassenger;
    private int passengerWaterBreathingDurationPassenger;
    private int passengerWaterBreathingAmplifierPassenger;
    private boolean passengerWaterBreathingAmbientPassenger;
    private boolean passengerWaterBreathingParticlesPassenger;
    private boolean passengerWaterBreathingPassenger;

    public final ContainerSubmarineChest submarineChest = new ContainerSubmarineChest("SubmarineChest", 54);;
    private net.minecraftforge.items.IItemHandler itemHandler = new net.minecraftforge.items.wrapper.InvWrapper(this.submarineChest);

    public static Animation CLAW_ANIMATION;
    private Animation currentAnimation;
    private int animationTick;
    private Entity targetedEntity;

    public PrehistoricFloraSubmarine(World worldIn)
    {
        super(worldIn);
        this.paddlePositions = new float[2];
        this.preventEntitySpawning = true;
        this.setSize(3.0F, 3.0F);
        CLAW_ANIMATION = Animation.create(80);
    }

    public PrehistoricFloraSubmarine(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        CLAW_ANIMATION = Animation.create(80);
    }
    
    public void saveNightVisionPassenger(boolean hasNightVision, int duration, int amplifier, boolean ambient, boolean particles, UUID player) {
        if (this.passengerNightVisionUUID == null) {
            this.passengerNightVisionDuration = duration;
            this.passengerNightVisionAmplifier = amplifier;
            this.passengerNightVisionAmbient = ambient;
            this.passengerNightVisionParticles = particles;
            this.passengerNightVisionUUID = player;
            this.passengerNightVision = hasNightVision;
        }
        else if (this.passengerNightVisionUUIDPassenger == null) {
            this.passengerNightVisionDurationPassenger = duration;
            this.passengerNightVisionAmplifierPassenger = amplifier;
            this.passengerNightVisionAmbientPassenger = ambient;
            this.passengerNightVisionParticlesPassenger = particles;
            this.passengerNightVisionUUIDPassenger = player;
            this.passengerNightVisionPassenger = hasNightVision;
        }
    }

    public void saveWaterBreathingPassenger(boolean hasWaterBreathing, int duration, int amplifier, boolean ambient, boolean particles, UUID player) {
        if (this.passengerWaterBreathingUUID == null) {
            this.passengerWaterBreathingDuration = duration;
            this.passengerWaterBreathingAmplifier = amplifier;
            this.passengerWaterBreathingAmbient = ambient;
            this.passengerWaterBreathingParticles = particles;
            this.passengerWaterBreathingUUID = player;
            this.passengerWaterBreathing = hasWaterBreathing;
        }
        else if (this.passengerWaterBreathingUUIDPassenger == null) {
            this.passengerWaterBreathingDurationPassenger = duration;
            this.passengerWaterBreathingAmplifierPassenger = amplifier;
            this.passengerWaterBreathingAmbientPassenger = ambient;
            this.passengerWaterBreathingParticlesPassenger = particles;
            this.passengerWaterBreathingUUIDPassenger = player;
            this.passengerWaterBreathingPassenger = hasWaterBreathing;
        }
    }
    
    public void grantNightVisionPassenger(EntityPlayer player) {
        if (passengerNightVisionUUID == player.getUniqueID()) {
            if (passengerNightVision) {
                player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, this.passengerNightVisionDuration, this.passengerNightVisionAmplifier, this.passengerNightVisionAmbient, this.passengerNightVisionParticles));
            }
            this.passengerNightVisionUUID = null;
        }
        else if (passengerNightVisionUUIDPassenger == player.getUniqueID()) {
            if (passengerNightVisionPassenger) {
                player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, this.passengerNightVisionDurationPassenger, this.passengerNightVisionAmplifierPassenger, this.passengerNightVisionAmbientPassenger, this.passengerNightVisionParticlesPassenger));
            }
            this.passengerNightVisionUUIDPassenger = null;
        }
    }

    public void grantDamageCapabilityPassenger(EntityPlayer player) {
        if (player instanceof EntityPlayerMP) {
            if (((EntityPlayerMP)player).interactionManager.getGameType() == GameType.CREATIVE
                || ((EntityPlayerMP)player).interactionManager.getGameType() == GameType.SPECTATOR) {
               player.capabilities.disableDamage = true;
            }
            else  {
                player.capabilities.disableDamage = false;
            }
        }
    }

    public void grantWaterBreathingPassenger(EntityPlayer player) {
        if (passengerWaterBreathingUUID == player.getUniqueID()) {
            if (passengerWaterBreathing) {
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, this.passengerWaterBreathingDuration, this.passengerWaterBreathingAmplifier, this.passengerWaterBreathingAmbient, this.passengerWaterBreathingParticles));
            }
            this.passengerWaterBreathingUUID = null;
        }
        else if (passengerWaterBreathingUUIDPassenger == player.getUniqueID()) {
            if (passengerWaterBreathingPassenger) {
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, this.passengerWaterBreathingDurationPassenger, this.passengerWaterBreathingAmplifierPassenger, this.passengerWaterBreathingAmbientPassenger, this.passengerWaterBreathingParticlesPassenger));
            }
            this.passengerWaterBreathingUUIDPassenger = null;
        }
    }

    public double getEnergyFraction() {
        if (this.getEnhanced()) {
            return ((double) this.getRF()) / 5000000D;
        }
        return ((double) this.getRF()) / 1000000D;
    }

    public void setRF(int rf)
    {
        this.dataManager.set(RF_SUPPLY, rf);
    }

    public int getRF()
    {
        return (this.dataManager.get(RF_SUPPLY));
    }

    public void setEnhanced(boolean enhanced)
    {
        this.dataManager.set(ENHANCED, enhanced);
    }

    public boolean getEnhanced()
    {
        return (this.dataManager.get(ENHANCED));
    }

    public void setShulker(boolean shulker)
    {
        this.dataManager.set(SHULKER, shulker);
    }

    public boolean getShulker()
    {
        return (this.dataManager.get(SHULKER));
    }

    public void setBucket(int bucket)
    {
        this.bucketTicks = bucket;
    }

    public int getBucket()
    {
        return this.bucketTicks;
    }

    public void setClaw(int claw)
    {
        this.clawTicks = claw;
    }

    public int getClaw()
    {
        return this.clawTicks;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("RF", this.getRF());
        compound.setBoolean("enhanced", this.getEnhanced());
        compound.setBoolean("shulker", this.getShulker());
        
        if (this.passengerNightVisionUUID == null) {
            compound.setString("passengerNightVisionUUID", "");
        }
        else {
            compound.setString("passengerNightVisionUUID", this.passengerNightVisionUUID.toString());
        }
        compound.setInteger("passengerNightVisionDuration", this.passengerNightVisionDuration);
        compound.setInteger("passengerNightVisionAmplifier", this.passengerNightVisionAmplifier);
        compound.setBoolean("passengerNightVisionAmbient", this.passengerNightVisionAmbient);
        compound.setBoolean("passengerNightVisionParticles", this.passengerNightVisionParticles);
        compound.setBoolean("passengerNightVision", this.passengerNightVision);
        
        if (this.passengerNightVisionUUIDPassenger == null) {
            compound.setString("passengerNightVisionUUIDPassenger", "");
        }
        else {
            compound.setString("passengerNightVisionUUIDPassenger", this.passengerNightVisionUUIDPassenger.toString());
        }
        compound.setInteger("passengerNightVisionDurationPassenger", this.passengerNightVisionDurationPassenger);
        compound.setInteger("passengerNightVisionAmplifierPassenger", this.passengerNightVisionAmplifierPassenger);
        compound.setBoolean("passengerNightVisionAmbientPassenger", this.passengerNightVisionAmbientPassenger);
        compound.setBoolean("passengerNightVisionParticlesPassenger", this.passengerNightVisionParticlesPassenger);
        compound.setBoolean("passengerNightVisionPassenger", this.passengerNightVisionPassenger);

        if (this.passengerWaterBreathingUUID == null) {
            compound.setString("passengerWaterBreathingUUID", "");
        }
        else {
            compound.setString("passengerWaterBreathingUUID", this.passengerWaterBreathingUUID.toString());
        }
        compound.setInteger("passengerWaterBreathingDuration", this.passengerWaterBreathingDuration);
        compound.setInteger("passengerWaterBreathingAmplifier", this.passengerWaterBreathingAmplifier);
        compound.setBoolean("passengerWaterBreathingAmbient", this.passengerWaterBreathingAmbient);
        compound.setBoolean("passengerWaterBreathingParticles", this.passengerWaterBreathingParticles);
        compound.setBoolean("passengerWaterBreathing", this.passengerWaterBreathing);

        if (this.passengerWaterBreathingUUIDPassenger == null) {
            compound.setString("passengerWaterBreathingUUIDPassenger", "");
        }
        else {
            compound.setString("passengerWaterBreathingUUIDPassenger", this.passengerWaterBreathingUUIDPassenger.toString());
        }
        compound.setInteger("passengerWaterBreathingDurationPassenger", this.passengerWaterBreathingDurationPassenger);
        compound.setInteger("passengerWaterBreathingAmplifierPassenger", this.passengerWaterBreathingAmplifierPassenger);
        compound.setBoolean("passengerWaterBreathingAmbientPassenger", this.passengerWaterBreathingAmbientPassenger);
        compound.setBoolean("passengerWaterBreathingParticlesPassenger", this.passengerWaterBreathingParticlesPassenger);
        compound.setBoolean("passengerWaterBreathingPassenger", this.passengerWaterBreathingPassenger);

        if (this.getShulker())
        {
            NBTTagList nbttaglist = new NBTTagList();

            for (int i = 0; i < this.submarineChest.getSizeInventory(); ++i)
            {
                ItemStack itemstack = this.submarineChest.getStackInSlot(i);

                if (!itemstack.isEmpty())
                {
                    NBTTagCompound nbttagcompound = new NBTTagCompound();
                    nbttagcompound.setByte("Slot", (byte)i);
                    itemstack.writeToNBT(nbttagcompound);
                    nbttaglist.appendTag(nbttagcompound);
                }
            }

            compound.setTag("Items", nbttaglist);
        }
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound)
    {
        this.setRF(compound.getInteger("RF"));
        this.setEnhanced(compound.getBoolean("enhanced"));
        this.setShulker(compound.getBoolean("shulker"));

        if (this.getShulker())
        {
            NBTTagList nbttaglist = compound.getTagList("Items", 10);

            for (int i = 0; i < nbttaglist.tagCount(); ++i)
            {
                NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
                int j = nbttagcompound.getByte("Slot") & 255;

                if (j >= 0 && j < this.submarineChest.getSizeInventory())
                {
                    this.submarineChest.setInventorySlotContents(j, new ItemStack(nbttagcompound));
                }
            }
        }

        if (!(compound.getString("passengerNightVisionUUID").equalsIgnoreCase(""))) {
            this.passengerNightVisionUUID = UUID.fromString(compound.getString("passengerNightVisionUUID"));
            this.passengerNightVisionDuration = compound.getInteger("passengerNightVisionDuration");
            this.passengerNightVisionAmplifier = compound.getInteger("passengerNightVisionAmplifier");
            this.passengerNightVisionAmbient = compound.getBoolean("passengerNightVisionAmbient");
            this.passengerNightVisionParticles = compound.getBoolean("passengerNightVisionParticles");
            this.passengerNightVision = compound.getBoolean("passengerNightVision");
        }

        if (!(compound.getString("passengerNightVisionUUIDPassenger").equalsIgnoreCase(""))) {
            this.passengerNightVisionUUIDPassenger = UUID.fromString(compound.getString("passengerNightVisionUUIDPassenger"));
            this.passengerNightVisionDurationPassenger = compound.getInteger("passengerNightVisionDurationPassenger");
            this.passengerNightVisionAmplifierPassenger = compound.getInteger("passengerNightVisionAmplifierPassenger");
            this.passengerNightVisionAmbientPassenger = compound.getBoolean("passengerNightVisionAmbientPassenger");
            this.passengerNightVisionParticlesPassenger = compound.getBoolean("passengerNightVisionParticlesPassenger");
            this.passengerNightVisionPassenger = compound.getBoolean("passengerNightVisionPassenger");
        }

        if (!(compound.getString("passengerWaterBreathingUUID").equalsIgnoreCase(""))) {
            this.passengerWaterBreathingUUID = UUID.fromString(compound.getString("passengerWaterBreathingUUID"));
            this.passengerWaterBreathingDuration = compound.getInteger("passengerWaterBreathingDuration");
            this.passengerWaterBreathingAmplifier = compound.getInteger("passengerWaterBreathingAmplifier");
            this.passengerWaterBreathingAmbient = compound.getBoolean("passengerWaterBreathingAmbient");
            this.passengerWaterBreathingParticles = compound.getBoolean("passengerWaterBreathingParticles");
            this.passengerWaterBreathing = compound.getBoolean("passengerWaterBreathing");
        }

        if (!(compound.getString("passengerWaterBreathingUUIDPassenger").equalsIgnoreCase(""))) {
            this.passengerWaterBreathingUUIDPassenger = UUID.fromString(compound.getString("passengerWaterBreathingUUIDPassenger"));
            this.passengerWaterBreathingDurationPassenger = compound.getInteger("passengerWaterBreathingDurationPassenger");
            this.passengerWaterBreathingAmplifierPassenger = compound.getInteger("passengerWaterBreathingAmplifierPassenger");
            this.passengerWaterBreathingAmbientPassenger = compound.getBoolean("passengerWaterBreathingAmbientPassenger");
            this.passengerWaterBreathingParticlesPassenger = compound.getBoolean("passengerWaterBreathingParticlesPassenger");
            this.passengerWaterBreathingPassenger = compound.getBoolean("passengerWaterBreathingPassenger");
        }

    }

    @Override
    @Nullable
    public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable net.minecraft.util.EnumFacing facing)
    {
        if (capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) itemHandler;
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, @Nullable net.minecraft.util.EnumFacing facing)
    {
        return capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
    }

    @Override
    public boolean shouldDismountInWater(Entity rider)
    {
        return false;
    }

    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    protected void entityInit()
    {
        this.dataManager.register(TIME_SINCE_HIT, Integer.valueOf(0));
        this.dataManager.register(FORWARD_DIRECTION, Integer.valueOf(1));
        this.dataManager.register(DAMAGE_TAKEN, Float.valueOf(0.0F));
        this.dataManager.register(RF_SUPPLY, Integer.valueOf(-1));
        this.dataManager.register(ENHANCED, Boolean.valueOf(false));
        this.dataManager.register(SHULKER, Boolean.valueOf(false));

        for (DataParameter<Boolean> dataparameter : DATA_ID_PADDLE)
        {
            this.dataManager.register(dataparameter, Boolean.valueOf(false));
        }
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBox(Entity entityIn)
    {
        return entityIn.canBePushed() ? entityIn.getEntityBoundingBox() : null;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox()
    {
        return this.getEntityBoundingBox();
    }

    @Override
    public boolean canBePushed()
    {
        return true;
    }

    @Override
    public double getMountedYOffset()
    {
        return 0.0D;
    }

    @Override
    public boolean attackEntityFrom(@Nonnull DamageSource source, float amount)
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
            else if (this.isPassenger(source.getTrueSource())) {
                return false;
            }
            else
            {
                this.setForwardDirection(-this.getForwardDirection());
                this.setTimeSinceHit(10);
                this.setDamageTaken(this.getDamageTaken() + (amount * 1.5F) * 10.0F);
                this.markVelocityChanged();
                boolean flag = source.getTrueSource() instanceof EntityPlayer && ((EntityPlayer)source.getTrueSource()).capabilities.isCreativeMode;

                if (flag || this.getDamageTaken() > 60.0F)
                {
                    if (!flag && this.world.getGameRules().getBoolean("doEntityDrops"))
                    {
                        ItemStack stack = new ItemStack(ItemSubmarineBoatItem.block, 1);
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        if (this.getRF() >= 0) {
                            stackNBT.setInteger("rf", this.getRF());
                        }
                        stackNBT.setBoolean("enhanced", this.getEnhanced());
                        stackNBT.setBoolean("shulker", this.getShulker());
                        if (this.getShulker())
                        {
                            NBTTagList nbttaglist = new NBTTagList();

                            for (int i = 0; i < this.submarineChest.getSizeInventory(); ++i)
                            {
                                ItemStack itemstack = this.submarineChest.getStackInSlot(i);

                                if (!itemstack.isEmpty())
                                {
                                    NBTTagCompound nbttagcompound = new NBTTagCompound();
                                    nbttagcompound.setByte("Slot", (byte)i);
                                    itemstack.writeToNBT(nbttagcompound);
                                    nbttaglist.appendTag(nbttagcompound);
                                }
                            }

                            stackNBT.setTag("Items", nbttaglist);
                        }
                        stack.setTagCompound(stackNBT);

                        Block.spawnAsEntity(world, this.getPosition(), stack);
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

    @Override
    public void applyEntityCollision(Entity entityIn)
    {
        if (entityIn instanceof EntityBoat)
        {
            if (entityIn.getEntityBoundingBox().minY < this.getEntityBoundingBox().maxY)
            {
                super.applyEntityCollision(entityIn);
            }
        }
        else if (entityIn.getEntityBoundingBox().minY <= this.getEntityBoundingBox().minY)
        {
            super.applyEntityCollision(entityIn);
        }
    }

    @Override
    public Item getItemBoat()
    {
        return ItemSubmarineBoatItem.block;
    }

    @Override
    @Nonnull
    public ItemStack getPickedResult(RayTraceResult target)
    {
        ItemStack stack = new ItemStack(ItemSubmarineBoatItem.block, 1);
        NBTTagCompound stackNBT = new NBTTagCompound();
        if (this.getRF() >= 0) {
            stackNBT.setInteger("rf", this.getRF());
        }
        stackNBT.setBoolean("enhanced", this.getEnhanced());
        stackNBT.setBoolean("shulker", this.getShulker());
        //NB do not bring in inventory as well in the pick result!
        stack.setTagCompound(stackNBT);
        return stack;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void performHurtAnimation()
    {
        this.setForwardDirection(-this.getForwardDirection());
        this.setTimeSinceHit(10);
        this.setDamageTaken(this.getDamageTaken() * 11.0F);
    }

    @Override
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
        this.lerpX = x;
        this.lerpY = y;
        this.lerpZ = z;
        this.lerpYaw = (double)yaw;
        this.lerpPitch = (double)pitch;
        this.lerpSteps = 10;
    }

    @Override
    public EnumFacing getAdjustedHorizontalFacing()
    {
        return this.getHorizontalFacing().rotateY();
    }

    @Override
    public void onUpdate()
    {
        //Some code just to tidy up in case something has gone wrong:
        boolean isPlayerPassenger = false;
        for (Entity passengerIn : this.getPassengers()) {
            if (passengerIn instanceof EntityPlayer) {
                isPlayerPassenger = true;
                break;
            }
        }
        if (!isPlayerPassenger) {
            this.passengerNightVisionUUID = null;
            this.passengerNightVisionUUIDPassenger = null;
            this.passengerWaterBreathingUUID = null;
            this.passengerWaterBreathingUUIDPassenger = null;
        }

        //Can I pick up any items?
        if (this.getShulker() && !this.world.isRemote) {
            for (EntityItem entityitem : this.world.getEntitiesWithinAABB(EntityItem.class, this.getEntityBoundingBox().grow(3.0D, 2.0D, 3.0D)))
            {
                if (!entityitem.isDead && !entityitem.getItem().isEmpty() && !entityitem.cannotPickup())
                {
                    if (this.addToInventory(entityitem)) {
                        world.playSound(null, this.getPosition(), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 0.5F, 1.0F);
                        break;
                    }
                }
            }
        }

        if (LepidodendronConfig.machinesRF && this.getRF() >= 1) {
            if ((this.status == Status.IN_WATER
                || this.status == Status.UNDER_FLOWING_WATER
                || this.status == Status.UNDER_WATER)
                &&
                (this.leftInputDown ||
                this.rightInputDown ||
                this.forwardInputDown ||
                this.backInputDown ||
                this.downInputDown ||
                this.upInputDown ||
                this.leftStrafeInputDown ||
                this.rightStrafeInputDown)
            ){
                this.setRF(this.getRF() - 1);
            }
        }

        this.previousStatus = this.status;
        this.status = this.getBoatStatus();

        this.outOfControlTicks = 0.0F;

        if (!this.world.isRemote && this.outOfControlTicks >= 60.0F)
        {
            this.removePassengers();
        }

        if (this.getTimeSinceHit() > 0)
        {
            this.setTimeSinceHit(this.getTimeSinceHit() - 1);
        }

        if (this.getDamageTaken() > 0.0F)
        {
            this.setDamageTaken(this.getDamageTaken() - 1.0F);
        }

        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        //super.onUpdate();
        if (!this.world.isRemote)
        {
            this.setFlag(6, this.isGlowing());

            if (this.getBucket() > 0) {
                this.setBucket(this.getBucket() - 1);

                int bucketSlot = hasBucketSlot(this, null);
                if (this.getBucket() >= 10 && bucketSlot >= 0) {
                    LepidodendronMod.PACKET_HANDLER.sendToAll(new PrehistoricFloraSubmarine.ParticlePacket(Functions.getEntityCentre(this).x, Functions.getEntityCentre(this).y, Functions.getEntityCentre(this).z, this.rotationYaw));
                }
                if (this.getBucket() == 39 && bucketSlot >= 0) {
                    world.playSound(null, this.getPosition(), BlockSounds.SUBMARINE_BUBBLE_JET, SoundCategory.BLOCKS, 1.0F, 1.0F + (rand.nextFloat() * 0.5F));
                }
                if (this.getBucket() == 29 && bucketSlot >= 0) {
                    world.playSound(null, this.getPosition(), BlockSounds.SUBMARINE_BUBBLE_JET, SoundCategory.BLOCKS, 1.0F, 1.0F + (rand.nextFloat() * 0.5F));
                }
                if (this.getBucket() == 35 && bucketSlot >= 0) {
                    double xOffset = (double) (MathHelper.sin((float) Math.toRadians(-this.rotationYaw)) * 4.5F) + (double) (MathHelper.cos((float) Math.toRadians(this.rotationYaw)) * 8.0F);
                    double zOffset = (double) (MathHelper.cos((float) Math.toRadians(this.rotationYaw)) * 4.5F) + (double) (MathHelper.sin((float) Math.toRadians(-this.rotationYaw)) * 8.0F);

                    double xOffsetRoot = (double) (MathHelper.sin((float) Math.toRadians(-this.rotationYaw)) * 1.25F);
                    double zOffsetRoot = (double) (MathHelper.cos((float) Math.toRadians(this.rotationYaw)) * 1.25F);

                    Vec3d min = Functions.getEntityCentre(this).add(xOffsetRoot, 0, zOffsetRoot).add(-xOffset, -2, -zOffset);
                    Vec3d max = Functions.getEntityCentre(this).add(xOffsetRoot, 0, zOffsetRoot).add(xOffset, 2, zOffset);

                    List<Entity> Entities = Functions.getEntitiesWithinAABBPN(world, Entity.class, new AxisAlignedBB(min.x, min.y, min.z, max.x, max.y, max.z), EntitySelectors.NOT_SPECTATING);
                    double d0 = Double.MAX_VALUE;
                    for (Entity ee : Entities) {
                        Entity bucketTest = canBucket(ee);
                        if (bucketTest != null && this.getDistanceSq(ee) < d0 && isDirectPathBetweenPoints(this.getPositionVector(), ee.getPositionVector())) {
                            d0 = this.getDistanceSq(ee);
                            this.targetedEntity = bucketTest;
                        }
                    }
                }

                if (this.targetedEntity != null && !this.targetedEntity.isDead && this.getBucket() >= 10 && this.getBucket() <= 25) {
                    //Where do we want to move this mob TO?
                    double xOffset = (double)(MathHelper.sin((float)Math.toRadians(-this.rotationYaw)) * 1.75F);
                    double zOffset = (double)(MathHelper.cos((float)Math.toRadians(this.rotationYaw)) * 1.75F);
                    xOffset = xOffset + (double)(MathHelper.cos((float)Math.toRadians(this.rotationYaw)) * 0.85F);
                    zOffset = zOffset - (double)(MathHelper.sin((float)Math.toRadians(-this.rotationYaw)) * 0.85F);
                    //The mob will be a target for 15 ticks between selection and bucketing, so move it incrementally:
                    double moveTick = ((double)this.getBucket() - 10D)/11.00D;
                    double xMove = (Functions.getEntityCentre(this).x + xOffset) - ((Functions.getEntityCentre(this).x + xOffset - this.targetedEntity.posX) * moveTick);
                    double yMove = (Functions.getEntityCentre(this).y) - ((Functions.getEntityCentre(this).y - this.targetedEntity.posY) * moveTick);
                    double zMove = (Functions.getEntityCentre(this).z + zOffset) - ((Functions.getEntityCentre(this).z + zOffset - this.targetedEntity.posZ) * moveTick);

                    this.targetedEntity.setPositionAndUpdate(xMove, yMove, zMove);

                }

                if (this.getBucket() == 10 && bucketSlot >= 0) {
                    if (this.targetedEntity != null && !this.targetedEntity.isDead) {
                        this.submarineChest.setInventorySlotContents(bucketSlot, bucketMob(this.targetedEntity, this.submarineChest.getStackInSlot(bucketSlot)));
                        world.playSound(null, this.getPosition(), SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        Entity e = this.getControllingPassenger();
                        if (e instanceof EntityPlayer) {
                            ((EntityPlayer) e).sendMessage(new TextComponentString("Bucketed: " + this.targetedEntity.getName()));
                        }
                        this.targetedEntity.setDead();
                        this.targetedEntity = null;
                    }
                }
            }
            if (this.getClaw() > 0) {
                this.setClaw(this.getClaw() - 1);
                if (this.getClaw() == 80 - 44) {
                    //Try to harvest a block:
                    double xOffset = (double)(MathHelper.sin((float)Math.toRadians(-this.rotationYaw)) * 3.10F);
                    double zOffset = (double)(MathHelper.cos((float)Math.toRadians(this.rotationYaw)) * 3.10F);
                    xOffset = xOffset - (double)(MathHelper.cos((float)Math.toRadians(this.rotationYaw)) * 1.10F);
                    zOffset = zOffset + (double)(MathHelper.sin((float)Math.toRadians(-this.rotationYaw)) * 1.10F);
                    double xPos = (Functions.getEntityCentre(this).x + xOffset);
                    double zPos = (Functions.getEntityCentre(this).z + zOffset);
                    double yPos = this.posY - 1.26D;
                    if (isDirectPathBetweenPoints(this.getPositionVector(), new Vec3d(xPos, yPos, zPos))) {
                        IBlockState stateTarget = world.getBlockState(new BlockPos(xPos, yPos, zPos));
                        if (stateTarget.getBlock() instanceof IShearable) {
                            if (((IShearable) stateTarget.getBlock()).isShearable(new ItemStack(Items.SHEARS, 1), world, new BlockPos(xPos, yPos, zPos))) {
                                List<ItemStack> drops = ((IShearable) stateTarget.getBlock()).onSheared(new ItemStack(Items.SHEARS, 1), world, new BlockPos(xPos, yPos, zPos), 0);
                                String dropslist = "";
                                boolean noroom = false;
                                for (ItemStack stack : drops) {
                                    dropslist = dropslist + " + " + stack.getDisplayName();
                                    stack = this.addToInventoryAndGetRemainder(stack);
                                    if (!stack.isEmpty()) {
                                        EntityItem entityToSpawn = new EntityItem(world, xPos, yPos, zPos, stack);
                                        entityToSpawn.setPickupDelay(10);
                                        world.spawnEntity(entityToSpawn);
                                        noroom = true;
                                    }
                                }
                                if (dropslist.equalsIgnoreCase("")) {
                                    dropslist = "nothing";
                                }
                                else {
                                    dropslist = dropslist.substring(3);
                                    if (noroom) {
                                        dropslist = dropslist + ", but ran out of room in the Submarine inventory!";
                                    }
                                }
                                Entity e = this.getControllingPassenger();
                                if (e instanceof EntityPlayer) {
                                    ((EntityPlayer) e).sendMessage(new TextComponentString("Collected: " + dropslist));
                                }
                                world.destroyBlock(new BlockPos(xPos, yPos, zPos), false);
                            }
                        }
                    }
                }
            }

        }
        super.onEntityUpdate();

        this.tickLerp();

        if (this.canPassengerSteer())
        {
            if (this.getPassengers().isEmpty() || !(this.getPassengers().get(0) instanceof EntityPlayer))
            {
                this.setPaddleState(false, false);
            }

            this.updateMotion();

            if (this.world.isRemote)
            {
                this.controlBoat();
                this.world.sendPacketToServer(new CPacketSteerBoat(this.getPaddleState(0), this.getPaddleState(1)));
            }

            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

            if (this.world.isRemote && this.useBucketDown)
            {
                LepidodendronMod.PACKET_HANDLER.sendToServer(new PrehistoricFloraSubmarine.BucketMessage(this.getEntityId()));
            }

            if (this.world.isRemote && this.useClawDown) {
                LepidodendronMod.PACKET_HANDLER.sendToServer(new PrehistoricFloraSubmarine.ClawMessage(this.getEntityId()));
            }
        }
        else
        {
            this.motionX = 0.0D;
            this.motionY = 0.0D;
            this.motionZ = 0.0D;
        }

        for (int i = 0; i <= 1; ++i)
        {
            if (this.getPaddleState(i))
            {
                if (!this.isSilent() && (double)(this.paddlePositions[i] % ((float)Math.PI * 2F)) <= (Math.PI / 8D) && ((double)this.paddlePositions[i] + 0.39269909262657166D) % (Math.PI * 2D) >= (Math.PI / 8D))
                {
                    SoundEvent soundevent = this.getPaddleSound();

                    if (soundevent != null)
                    {
                        Vec3d vec3d = this.getLook(1.0F);
                        double d0 = i == 1 ? -vec3d.z : vec3d.z;
                        double d1 = i == 1 ? vec3d.x : -vec3d.x;
                        this.world.playSound((EntityPlayer)null, this.posX + d0, this.posY, this.posZ + d1, soundevent, this.getSoundCategory(), 1.0F, 0.8F + 0.4F * this.rand.nextFloat());
                    }
                }

                this.paddlePositions[i] = (float)((double)this.paddlePositions[i] + 0.39269909262657166D);
            }
            else
            {
                this.paddlePositions[i] = 0.0F;
            }
        }

        this.doBlockCollisions();
        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().grow(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), EntitySelectors.getTeamCollisionPredicate(this));

        if (!list.isEmpty())
        {
            boolean flag = !this.world.isRemote && !(this.getControllingPassenger() instanceof EntityPlayer);

            for (int j = 0; j < list.size(); ++j)
            {
                Entity entity = list.get(j);

                if (!entity.isPassenger(this))
                {
                    this.applyEntityCollision(entity);
                }
            }
        }
        AnimationHandler.INSTANCE.updateAnimations(this);
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public static ItemStack bucketMob(Entity entityIn, ItemStack stack) {
        if (entityIn instanceof EntityPrehistoricFloraAgeableFishBase) {
            EntityPrehistoricFloraAgeableFishBase ee = (EntityPrehistoricFloraAgeableFishBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) {
            EntityPrehistoricFloraSwimmingBottomWalkingWaterBase ee = (EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraAmphibianBase) {
            EntityPrehistoricFloraAmphibianBase ee = (EntityPrehistoricFloraAmphibianBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraEurypteridBase) {
            EntityPrehistoricFloraEurypteridBase ee = (EntityPrehistoricFloraEurypteridBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraFishBase) {
            EntityPrehistoricFloraFishBase ee = (EntityPrehistoricFloraFishBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraJellyfishBase) {
            EntityPrehistoricFloraJellyfishBase ee = (EntityPrehistoricFloraJellyfishBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraNautiloidBase) {
            EntityPrehistoricFloraNautiloidBase ee = (EntityPrehistoricFloraNautiloidBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraSlitheringWaterBase) {
            EntityPrehistoricFloraSlitheringWaterBase ee = (EntityPrehistoricFloraSlitheringWaterBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
            EntityPrehistoricFloraTrilobiteBottomBase ee = (EntityPrehistoricFloraTrilobiteBottomBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            EntityPrehistoricFloraTrilobiteSwimBase ee = (EntityPrehistoricFloraTrilobiteSwimBase) entityIn;
            if (!ee.isSmall()) {
                return stack;
            }
            return LepidodendronBucketHandler.createBucketWithEntity(entityIn);
        }
        return stack;
    }

    public static int hasBucketSlot(PrehistoricFloraSubmarine submarine, @Nullable Entity player) {
        if (submarine.getShulker()) {
            for (int i = 0; i < submarine.submarineChest.getSizeInventory(); ++i) {
                if (submarine.submarineChest.getStackInSlot(i).getItem() == Items.WATER_BUCKET) {
                    return i;
                }
            }
            if (player != null && player instanceof EntityPlayer) {
                ((EntityPlayer) player).sendMessage(new TextComponentString("No water buckets in the submarine inventory!"));
            }
        }
        return -1;
    }

    public boolean addToInventory(EntityItem item) {
        boolean stackProcessed = false;
        //First, do we have this item already?
        int slot = -1;
        int freeSlot = -1;
        for (int i = 0; i < this.submarineChest.getSizeInventory(); ++i) {
            if (!this.submarineChest.getStackInSlot(i).isEmpty()) {
                ItemStack stackA = this.submarineChest.getStackInSlot(i).copy();
                stackA.setCount(1);
                ItemStack stackB = item.getItem().copy();
                stackB.setCount(1);
                if (ItemStack.areItemStacksEqual(stackA, stackB)) {
                    if (this.submarineChest.getStackInSlot(i).getCount() < this.submarineChest.getStackInSlot(i).getItem().getItemStackLimit()) {
                        slot = i;
                        break;
                    }
                }
            }
            else if (freeSlot == -1) {
                freeSlot = i;
            }
        }
        if (slot >= 0) {
            ItemStack newStack = this.submarineChest.getStackInSlot(slot);
            newStack.setCount(this.submarineChest.getStackInSlot(slot).getCount() + 1);
            this.submarineChest.setInventorySlotContents(slot, newStack);
            item.getItem().shrink(1);
            stackProcessed = true;
        }
        else if (freeSlot >= 0){ //We have no match, but we do have space:
            ItemStack newStack = item.getItem().copy();
            newStack.setCount(1);
            this.submarineChest.setInventorySlotContents(freeSlot, newStack);
            item.getItem().shrink(1);
            stackProcessed = true;
        }
        if (!item.getItem().isEmpty() && (freeSlot >= 0 || slot >= 0)) { //Iterate to complete the whole stack:
            boolean resultIgnore = addToInventory(item);
        }
        return stackProcessed;
    }

    public ItemStack addToInventoryAndGetRemainder(ItemStack itemstack) {
        boolean stackProcessed = false;
        //First, do we have this item already?
        int slot = -1;
        int freeSlot = -1;
        for (int i = 0; i < this.submarineChest.getSizeInventory(); ++i) {
            if (!this.submarineChest.getStackInSlot(i).isEmpty()) {
                ItemStack stackA = this.submarineChest.getStackInSlot(i).copy();
                stackA.setCount(1);
                ItemStack stackB = itemstack.copy();
                stackB.setCount(1);
                if (ItemStack.areItemStacksEqual(stackA, stackB)) {
                    if (this.submarineChest.getStackInSlot(i).getCount() < this.submarineChest.getStackInSlot(i).getItem().getItemStackLimit()) {
                        slot = i;
                        break;
                    }
                }
            }
            else if (freeSlot == -1) {
                freeSlot = i;
            }
        }
        if (slot >= 0) {
            ItemStack newStack = this.submarineChest.getStackInSlot(slot);
            newStack.setCount(this.submarineChest.getStackInSlot(slot).getCount() + 1);
            this.submarineChest.setInventorySlotContents(slot, newStack);
            itemstack.shrink(1);
        }
        else if (freeSlot >= 0){ //We have no match, but we do have space:
            ItemStack newStack = itemstack.copy();
            newStack.setCount(1);
            this.submarineChest.setInventorySlotContents(freeSlot, newStack);
            itemstack.shrink(1);
        }
        if (!itemstack.isEmpty() && (freeSlot >= 0 || slot >= 0)) { //Iterate to complete the whole stack:
            itemstack = addToInventoryAndGetRemainder(itemstack);
        }
        return itemstack;
    }

    @Nullable
    public static Entity canBucket(Entity entityIn) {
        if (entityIn instanceof EntityPrehistoricFloraAgeableFishBase) {
            EntityPrehistoricFloraAgeableFishBase ee = (EntityPrehistoricFloraAgeableFishBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) {
            EntityPrehistoricFloraSwimmingBottomWalkingWaterBase ee = (EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraAmphibianBase) {
            EntityPrehistoricFloraAmphibianBase ee = (EntityPrehistoricFloraAmphibianBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraEurypteridBase) {
            EntityPrehistoricFloraEurypteridBase ee = (EntityPrehistoricFloraEurypteridBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraFishBase) {
            EntityPrehistoricFloraFishBase ee = (EntityPrehistoricFloraFishBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraJellyfishBase) {
            EntityPrehistoricFloraJellyfishBase ee = (EntityPrehistoricFloraJellyfishBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraNautiloidBase) {
            EntityPrehistoricFloraNautiloidBase ee = (EntityPrehistoricFloraNautiloidBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraSlitheringWaterBase) {
            EntityPrehistoricFloraSlitheringWaterBase ee = (EntityPrehistoricFloraSlitheringWaterBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
            EntityPrehistoricFloraTrilobiteBottomBase ee = (EntityPrehistoricFloraTrilobiteBottomBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            EntityPrehistoricFloraTrilobiteSwimBase ee = (EntityPrehistoricFloraTrilobiteSwimBase) entityIn;
            if (ee.isSmall()) {
                return entityIn;
            }
        }
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getPaddleSound()
    {
        switch (this.getBoatStatus())
        {
            case IN_WATER:
                return (SoundEvent) SoundEvent.REGISTRY
                    .getObject(new ResourceLocation("lepidodendron:submarine"));
            case UNDER_WATER:
            case UNDER_FLOWING_WATER:
                return (SoundEvent) SoundEvent.REGISTRY
                    .getObject(new ResourceLocation("lepidodendron:submarine_underwater"));
            case ON_LAND:
            case IN_AIR:
            default:
                return null;
        }
    }

    private void tickLerp()
    {
        if (this.lerpSteps > 0 && !this.canPassengerSteer())
        {
            double d0 = this.posX + (this.lerpX - this.posX) / (double)this.lerpSteps;
            double d1 = this.posY + (this.lerpY - this.posY) / (double)this.lerpSteps;
            double d2 = this.posZ + (this.lerpZ - this.posZ) / (double)this.lerpSteps;
            double d3 = MathHelper.wrapDegrees(this.lerpYaw - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.lerpSteps);
            //this.rotationPitch = (float)((double)this.rotationPitch + (this.lerpPitch - (double)this.rotationPitch) / (double)this.lerpSteps);
            --this.lerpSteps;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
    }

    @Override
    public void setPaddleState(boolean left, boolean right)
    {
        this.dataManager.set(DATA_ID_PADDLE[0], Boolean.valueOf(left));
        this.dataManager.set(DATA_ID_PADDLE[1], Boolean.valueOf(right));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public float getRowingTime(int side, float limbSwing)
    {
        return this.getPaddleState(side) ? (float)MathHelper.clampedLerp((double)this.paddlePositions[side] - 0.39269909262657166D, (double)this.paddlePositions[side], (double)limbSwing) : 0.0F;
    }

    private PrehistoricFloraSubmarine.Status getBoatStatus()
    {
        PrehistoricFloraSubmarine.Status EntityBoatLepidodendron$status = this.getUnderwaterStatus();

        if (EntityBoatLepidodendron$status != null)
        {
            this.waterLevel = this.getEntityBoundingBox().maxY;
            return EntityBoatLepidodendron$status;
        }
        else if (this.checkInWater())
        {
            return PrehistoricFloraSubmarine.Status.IN_WATER;
        }
        else
        {
            float f = this.getBoatGlide();

            if (f > 0.0F)
            {
                this.boatGlide = f;
                return PrehistoricFloraSubmarine.Status.ON_LAND;
            }
            else
            {
                return PrehistoricFloraSubmarine.Status.IN_AIR;
            }
        }
    }

    @Override
    public float getWaterLevelAbove()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.maxY);
        int l = MathHelper.ceil(axisalignedbb.maxY - this.lastYd);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            label108:

            for (int k1 = k; k1 < l; ++k1)
            {
                float f = 0.0F;
                int l1 = i;

                while (true)
                {
                    if (l1 >= j)
                    {
                        if (f < 1.0F)
                        {
                            float f2 = (float)blockpos$pooledmutableblockpos.getY() + f;
                            return f2;
                        }

                        break;
                    }

                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(l1, k1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER)
                        {
                            f = Math.max(f, BlockLiquid.getBlockLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos));
                        }

                        if (f >= 1.0F)
                        {
                            continue label108;
                        }
                    }

                    ++l1;
                }
            }

            float f1 = (float)(l + 1);
            return f1;
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }
    }

    @Override
    public float getBoatGlide()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        AxisAlignedBB axisalignedbb1 = new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY - 0.001D, axisalignedbb.minZ, axisalignedbb.maxX, axisalignedbb.minY, axisalignedbb.maxZ);
        int i = MathHelper.floor(axisalignedbb1.minX) - 1;
        int j = MathHelper.ceil(axisalignedbb1.maxX) + 1;
        int k = MathHelper.floor(axisalignedbb1.minY) - 1;
        int l = MathHelper.ceil(axisalignedbb1.maxY) + 1;
        int i1 = MathHelper.floor(axisalignedbb1.minZ) - 1;
        int j1 = MathHelper.ceil(axisalignedbb1.maxZ) + 1;
        List<AxisAlignedBB> list = Lists.<AxisAlignedBB>newArrayList();
        float f = 0.0F;
        int k1 = 0;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int l1 = i; l1 < j; ++l1)
            {
                for (int i2 = i1; i2 < j1; ++i2)
                {
                    int j2 = (l1 != i && l1 != j - 1 ? 0 : 1) + (i2 != i1 && i2 != j1 - 1 ? 0 : 1);

                    if (j2 != 2)
                    {
                        for (int k2 = k; k2 < l; ++k2)
                        {
                            if (j2 <= 0 || k2 != k && k2 != l - 1)
                            {
                                blockpos$pooledmutableblockpos.setPos(l1, k2, i2);
                                IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);
                                iblockstate.addCollisionBoxToList(this.world, blockpos$pooledmutableblockpos, axisalignedbb1, list, this, false);

                                if (!list.isEmpty())
                                {
                                    f += iblockstate.getBlock().getSlipperiness(iblockstate, this.world, blockpos$pooledmutableblockpos, this);
                                    ++k1;
                                }

                                list.clear();
                            }
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return f / (float)k1;
    }

    private boolean checkInWater()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.minY);
        int l = MathHelper.ceil(axisalignedbb.minY + 0.001D);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        boolean flag = false;
        this.waterLevel = Double.MIN_VALUE;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int k1 = i; k1 < j; ++k1)
            {
                for (int l1 = k; l1 < l; ++l1)
                {
                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(k1, l1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER)
                        {
                            float f = BlockLiquid.getLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos);
                            this.waterLevel = Math.max((double)f, this.waterLevel);
                            flag |= axisalignedbb.minY < (double)f;
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return flag;
    }

    @Nullable
    private PrehistoricFloraSubmarine.Status getUnderwaterStatus()
    {
        AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
        double d0 = axisalignedbb.maxY + 0.001D;
        int i = MathHelper.floor(axisalignedbb.minX);
        int j = MathHelper.ceil(axisalignedbb.maxX);
        int k = MathHelper.floor(axisalignedbb.maxY);
        int l = MathHelper.ceil(d0);
        int i1 = MathHelper.floor(axisalignedbb.minZ);
        int j1 = MathHelper.ceil(axisalignedbb.maxZ);
        boolean flag = false;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

        try
        {
            for (int k1 = i; k1 < j; ++k1)
            {
                for (int l1 = k; l1 < l; ++l1)
                {
                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        blockpos$pooledmutableblockpos.setPos(k1, l1, i2);
                        IBlockState iblockstate = this.world.getBlockState(blockpos$pooledmutableblockpos);

                        if (iblockstate.getMaterial() == Material.WATER && d0 < (double)BlockLiquid.getLiquidHeight(iblockstate, this.world, blockpos$pooledmutableblockpos))
                        {
                            if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() != 0)
                            {
                                PrehistoricFloraSubmarine.Status EntityBoatLepidodendron$status = PrehistoricFloraSubmarine.Status.UNDER_FLOWING_WATER;
                                return EntityBoatLepidodendron$status;
                            }

                            flag = true;
                        }
                    }
                }
            }
        }
        finally
        {
            blockpos$pooledmutableblockpos.release();
        }

        return flag ? PrehistoricFloraSubmarine.Status.UNDER_WATER : null;
    }

    private void updateMotion()
    {
        double d0 = -0.03999999910593033D;
        double d1 = this.hasNoGravity() ? 0.0D : -0.03999999910593033D;
        double d2 = 0.0D;
        this.momentum = 0.05F;

        if (this.previousStatus == PrehistoricFloraSubmarine.Status.IN_AIR && this.status != PrehistoricFloraSubmarine.Status.IN_AIR && this.status != PrehistoricFloraSubmarine.Status.ON_LAND)
        {
            this.waterLevel = this.getEntityBoundingBox().minY + (double)this.height;
            this.setPosition(this.posX, (double)(this.getWaterLevelAbove() - this.height) + 0.101D, this.posZ);
            this.motionY = 0.0D;
            this.lastYd = 0.0D;
            this.status = PrehistoricFloraSubmarine.Status.IN_WATER;
        }
        else
        {
            if ((this.status == Status.IN_WATER
                || this.status == Status.UNDER_FLOWING_WATER
                || this.status == Status.UNDER_WATER)
            ) {
                d2 = (this.waterLevel - this.getEntityBoundingBox().minY) / (double)this.height;
                this.momentum = 0.9F;
            }
            else if (this.status == PrehistoricFloraSubmarine.Status.UNDER_FLOWING_WATER)
            {
                d1 = -7.0E-4D;
                this.momentum = 0.9F;
            }
            else if (this.status == PrehistoricFloraSubmarine.Status.UNDER_WATER)
            {
                d2 = 0.009999999776482582D;
                this.momentum = 0.45F;
            }
            else if (this.status == PrehistoricFloraSubmarine.Status.IN_AIR)
            {
                this.momentum = 0.9F;
            }
            else if (this.status == PrehistoricFloraSubmarine.Status.ON_LAND)
            {
                this.momentum = this.boatGlide;

                if (this.getControllingPassenger() instanceof EntityPlayer)
                {
                    this.boatGlide /= 2.0F;
                }
            }

            this.motionX *= (double)this.momentum;
            this.motionZ *= (double)this.momentum;
            this.deltaRotation *= this.momentum;
            this.motionY += d1;

            if (d2 > 0.0D)
            {
                double d3 = 0.65D;
                this.motionY += d2 * 0.06153846016296973D;
                double d4 = 0.75D;
                this.motionY *= 0.75D;
                this.motionY = 0;
            }
        }
    }

    private void controlBoat()
    {
        if (this.isBeingRidden())
        {
            float f = 0.0F;
            float f1 = 0.0F;
            float f2 = 0.0F;

            if (this.leftInputDown)
            {
                this.deltaRotation += -1.0F;
            }

            if (this.rightInputDown)
            {
                ++this.deltaRotation;
            }

            if (this.downInputDown)
            {
                this.deltaPitch += -1.0F;
            }

            if (this.upInputDown)
            {
                ++this.deltaPitch;
            }

            if (this.rightInputDown != this.leftInputDown && !this.forwardInputDown && !this.backInputDown)
            {
                if (this.getEnhanced()) {
                    f += 0.02F;
                }
                else {
                    f += 0.005F;
                }
            }

            this.rotationYaw += this.deltaRotation;
            //this.rotationPitch += this.deltaPitch;

            if (this.forwardInputDown)
            {
                if (this.getEnhanced()) {
                    f += 0.175F;
                }
                else {
                    f += 0.04F;
                }
            }

            if (this.backInputDown)
            {
                if (this.getEnhanced()) {
                    f -= 0.02F;
                }
                else {
                    f -= 0.005F;
                }
            }

            if (this.upInputDown &&
                (this.status == Status.IN_WATER
                || this.status == Status.UNDER_WATER
                || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                if (this.getEnhanced()) {
                    f1 += 0.20F;
                }
                else {
                    f1 += 0.0666F;
                }
            }

            if (this.downInputDown && (!this.onGround) &&
                (this.status == Status.IN_WATER
                || this.status == Status.UNDER_WATER
                || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                if (this.getEnhanced()) {
                    f1 -= 0.35F;
                }
                else {
                    f1 -= 0.1F;
                }
            }

            if (this.rightStrafeInputDown && f == 0.0 &&
                    (this.status == Status.IN_WATER
                            || this.status == Status.UNDER_WATER
                            || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                if (this.getEnhanced()) {
                    f2 += 0.100F;
                }
                else {
                    f2 += 0.035F;
                }
            }

            if (this.leftStrafeInputDown && f == 0.0 &&
                    (this.status == Status.IN_WATER
                            || this.status == Status.UNDER_WATER
                            || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                if (this.getEnhanced()) {
                    f2 -= 0.100F;
                }
                else {
                    f2 -= 0.035F;
                }
            }

            this.motionY += (double) (f1);
            f = f * 0.666F;

            this.motionX += (double)(MathHelper.sin(-this.rotationYaw * 0.017453292F) * f) - (double)(MathHelper.cos(-this.rotationYaw * 0.017453292F) * f2);
            this.motionZ += (double)(MathHelper.cos(this.rotationYaw * 0.017453292F) * f) - (double)(MathHelper.sin(this.rotationYaw * 0.017453292F) * f2);

            this.setPaddleState(this.rightInputDown || this.rightStrafeInputDown && !this.leftInputDown || this.forwardInputDown, this.leftInputDown || this.leftStrafeInputDown && !this.rightInputDown || this.forwardInputDown);
        }
    }

    @Override
    public void updatePassenger(Entity passenger)
    {
        if (this.isPassenger(passenger))
        {
            float f = 0.0F;
            float f1 = (float)((this.isDead ? 0.009999999776482582D : this.getMountedYOffset()) + passenger.getYOffset());

            if (this.getPassengers().size() > 1)
            {
                int i = this.getPassengers().indexOf(passenger);

                if (i == 0)
                {
                    f = 0.2F;
                }
                else
                {
                    f = -0.6F;
                }

                if (passenger instanceof EntityAnimal)
                {
                    f = (float)((double)f + 0.2D);
                }
            }

            Vec3d vec3d = (new Vec3d((double)f, 0.0D, 0.0D)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
            passenger.setPosition(this.posX + vec3d.x, this.posY + (double)f1, this.posZ + vec3d.z);
            passenger.rotationYaw += this.deltaRotation;
            passenger.setRotationYawHead(passenger.getRotationYawHead() + this.deltaRotation);
            this.applyYawToEntity(passenger);

            if (passenger instanceof EntityAnimal && this.getPassengers().size() > 1)
            {
                int j = passenger.getEntityId() % 2 == 0 ? 90 : 270;
                passenger.setRenderYawOffset(((EntityAnimal)passenger).renderYawOffset + (float)j);
                passenger.setRotationYawHead(passenger.getRotationYawHead() + (float)j);
            }

            for (Entity passengerIn : this.getPassengers()) {
                if (passengerIn instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) passengerIn;
                    IBlockState state = world.getBlockState(new BlockPos(passengerIn.posX, passengerIn.getPosition().getY() + passengerIn.getEyeHeight(), passengerIn.posZ));
                    if (this.passengerWaterBreathingUUID == player.getUniqueID()
                            || this.passengerWaterBreathingUUIDPassenger == player.getUniqueID()) {
                        player.removePotionEffect(MobEffects.WATER_BREATHING);
                    }
                    if (state.getMaterial() == Material.WATER || passengerIn.isInsideOfMaterial(Material.WATER)) {
                        player.setAir(300);
                    } else {
                        if (LepidodendronConfig.submarineNightvision) {
                            if (this.passengerNightVisionUUID == player.getUniqueID()
                                    || this.passengerNightVisionUUIDPassenger == player.getUniqueID()) {
                                player.removePotionEffect(MobEffects.NIGHT_VISION);
                            }
                        }
                    }
                    if ((!player.isPotionActive(MobEffects.NIGHT_VISION) || player.getActivePotionEffect(MobEffects.NIGHT_VISION).getDuration() < 201) && (state.getMaterial() == Material.WATER || passengerIn.isInsideOfMaterial(Material.WATER)) && LepidodendronConfig.submarineNightvision) {
                        if (this.passengerNightVisionUUID == player.getUniqueID()
                                || this.passengerNightVisionUUIDPassenger == player.getUniqueID()) {
                            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 201, 0, false, false));
                        }
                    }
                    player.capabilities.disableDamage = true;
                }

            }
        }
    }

    @SideOnly(Side.CLIENT)
    public static void seeRed(Minecraft mc, ScaledResolution scaledresolution, double partialTicks) {
        double ticks = Math.sin((float)Math.toRadians(mc.world.getTotalWorldTime() + partialTicks));
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        GlStateManager.depthMask(false);
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.color(1.0F, 1.0F, 1.0F, (float)(0.035F * ticks));
        GlStateManager.disableAlpha();
        mc.getTextureManager().bindTexture(new ResourceLocation("lepidodendron:textures/misc/submarine_power_low.png"));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(0.0D, (double)scaledresolution.getScaledHeight(), -90.0D).tex(0.0D, 1.0D).endVertex();
        bufferbuilder.pos((double)scaledresolution.getScaledWidth(), (double)scaledresolution.getScaledHeight(), -90.0D).tex(1.0D, 1.0D).endVertex();
        bufferbuilder.pos((double)scaledresolution.getScaledWidth(), 0.0D, -90.0D).tex(1.0D, 0.0D).endVertex();
        bufferbuilder.pos(0.0D, 0.0D, -90.0D).tex(0.0D, 0.0D).endVertex();
        tessellator.draw();
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public void dismountRidingEntity() {
        super.dismountRidingEntity();
    }

    @Override
    protected void applyYawToEntity(Entity entityToUpdate)
    {
        entityToUpdate.setRenderYawOffset(this.rotationYaw);
        float f = MathHelper.wrapDegrees(entityToUpdate.rotationYaw - this.rotationYaw);
        float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
        entityToUpdate.prevRotationYaw += f1 - f;
        entityToUpdate.rotationYaw += f1 - f;
        entityToUpdate.setRotationYawHead(entityToUpdate.rotationYaw);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void applyOrientationToEntity(Entity entityToUpdate)
    {
        this.applyYawToEntity(entityToUpdate);
    }

    @Override
    public String getName() {
        if (this.hasCustomName())
        {
            return this.getCustomNameTag();
        }
        else
        {
            return I18n.translateToLocal("item.pf_submarine_boat_item.name");
        }
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
    {
        boolean riding = false;
        if (player.isRiding()) {
            if (player.getRidingEntity() == this) {
                if (this.getControllingPassenger() == player) {
                    riding = true;
                }
            }
        }
        if (riding) {
            //What am I clicking on?
            //Central panel (inventory contents)
            if (player.rotationYaw - this.rotationYaw > -22 && player.rotationYaw - this.rotationYaw < 22 && player.rotationPitch - this.rotationPitch > -60 && player.rotationPitch - this.rotationPitch < -30 && this.getShulker()) {
                player.openGui(LepidodendronMod.instance, GUISubmarine.GUIID, world, this.getEntityId(), 0, 0);
            }
            //Left panel (read battery)
            if (player.rotationYaw - this.rotationYaw > -65 && player.rotationYaw - this.rotationYaw < -38 && player.rotationPitch - this.rotationPitch > -55 && player.rotationPitch - this.rotationPitch < -30) {
                if (!(player.world.isRemote)) {
                    if (this.getRF() == -1) {
                        player.sendMessage(new TextComponentString("Submarine power: no battery!"));
                    }
                    else {
                        if (!LepidodendronConfig.machinesRF) {
                            if (this.getEnhanced()) {
                                player.sendMessage(new TextComponentString("Submarine power: powered (enhanced)"));
                            }
                            else {
                                player.sendMessage(new TextComponentString("Submarine power: powered"));
                            }
                        } else {
                            DecimalFormat df = new DecimalFormat("###.#");
                            if (this.getEnhanced()) {
                                player.sendMessage(new TextComponentString("Submarine power (enhanced): " + df.format(this.getEnergyFraction() * 100) + "%"));
                            }
                            else {
                                player.sendMessage(new TextComponentString("Submarine power: " + df.format(this.getEnergyFraction() * 100) + "%"));
                            }
                        }
                    }
                }
            }
            //Right panel (remove or add battery)
            if (player.rotationYaw - this.rotationYaw > 38 && player.rotationYaw - this.rotationYaw < 65 && player.rotationPitch - this.rotationPitch > -55 && player.rotationPitch - this.rotationPitch < -30) {
//                if (!player.world.isRemote) {
                    if (this.getRF() == -1) {
                        //There is no battery: can we add one from our hand?
                        if (player.getHeldItem(hand).getItem() == ItemSubmarineBatterypack.block) {
                            if (!player.world.isRemote) {
                                int rf = 1000000;
                                ItemStack stack = player.getHeldItem(hand);
                                if (LepidodendronConfig.machinesRF) {
                                    if (stack.hasTagCompound()) {
                                        if (stack.getTagCompound().hasKey("rf")) {
                                            rf = stack.getTagCompound().getInteger("rf");
                                        }
                                        else {
                                            rf = 0;
                                        }
                                    }
                                    else {
                                        rf = 0;
                                    }
                                }
                                this.setRF(rf);
                                stack.shrink(1);
                                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
                            }
                            this.setEnhanced(false);
                        }
                        else if (player.getHeldItem(hand).getItem() == ItemSubmarineBatterypackEnhanced.block) {
                            if (!player.world.isRemote) {
                                int rf = 1000000;
                                ItemStack stack = player.getHeldItem(hand);
                                if (LepidodendronConfig.machinesRF) {
                                    if (stack.hasTagCompound()) {
                                        if (stack.getTagCompound().hasKey("rf")) {
                                            rf = stack.getTagCompound().getInteger("rf");
                                        }
                                        else {
                                            rf = 0;
                                        }
                                    }
                                    else {
                                        rf = 0;
                                    }
                                }
                                this.setRF(rf);
                                stack.shrink(1);
                                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
                            }
                            this.setEnhanced(true);
                        }
                    }
                    else {
                        //Is our hand empty to remove the battery?
                        if (player.getHeldItem(hand).isEmpty()) {
                            if (!player.world.isRemote) {
                                ItemStack stack = new ItemStack(ItemSubmarineBatterypack.block, 1);
                                if (this.getEnhanced()) {
                                    stack = new ItemStack(ItemSubmarineBatterypackEnhanced.block, 1);
                                }
                                int rf = this.getRF();
                                NBTTagCompound stackNBT = new NBTTagCompound();
                                stackNBT.setInteger("rf", rf);
                                stack.setTagCompound(stackNBT);
                                ItemHandlerHelper.giveItemToPlayer(player, stack);
                                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
                                this.setRF(Integer.valueOf(-1));
                            }
                            this.setEnhanced(false);
                        }
                    }
//                }
            }
            return true;
        }
        else if (player.isSneaking())
        {
            return false;
        }
        else if (player.getHeldItem(hand).getItem() == ItemSubmarineBatterypack.block && this.getRF() == -1) {
            if (!player.world.isRemote) {
                int rf = 1000000;
                ItemStack stack = player.getHeldItem(hand);
                if (LepidodendronConfig.machinesRF) {
                    if (stack.hasTagCompound()) {
                        if (stack.getTagCompound().hasKey("rf")) {
                            rf = stack.getTagCompound().getInteger("rf");
                        } else {
                            rf = 0;
                        }
                    } else {
                        rf = 0;
                    }
                }
                this.setRF(rf);
                stack.shrink(1);
                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
            }
            this.setEnhanced(false);
            return true;
        }
        else if (player.getHeldItem(hand).getItem() == ItemSubmarineBatterypackEnhanced.block && this.getRF() == -1) {
            if (!player.world.isRemote) {
                int rf = 5000000;
                ItemStack stack = player.getHeldItem(hand);
                if (LepidodendronConfig.machinesRF) {
                    if (stack.hasTagCompound()) {
                        if (stack.getTagCompound().hasKey("rf")) {
                            rf = stack.getTagCompound().getInteger("rf");
                        } else {
                            rf = 0;
                        }
                    } else {
                        rf = 0;
                    }
                }
                this.setRF(rf);
                stack.shrink(1);
                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
            }
            this.setEnhanced(true);
            return true;
        }
        else if (Block.getBlockFromItem(player.getHeldItem(hand).getItem()) instanceof BlockShulkerBox && !this.getShulker()) {
            if (!player.world.isRemote) {
                ItemStack stack = player.getHeldItem(hand);
                stack.shrink(1);
                world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
            }
            this.setShulker(true);
            return true;
        }
        else
        {
            if (!this.world.isRemote && this.outOfControlTicks < 60.0F)
            {
                player.startRiding(this);
            }

            return true;
        }
    }

    @Override
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos)
    {
        this.lastYd = this.motionY;

        if (!this.isRiding())
        {
            if (onGroundIn)
            {
                if (this.fallDistance > 3.0F)
                {
                    if (this.status != PrehistoricFloraSubmarine.Status.ON_LAND)
                    {
                        this.fallDistance = 0.0F;
                        return;
                    }

                    this.fall(this.fallDistance, 1.0F);

                    if (!this.world.isRemote && !this.isDead)
                    {
                        this.setDead();

                        if (this.world.getGameRules().getBoolean("doEntityDrops"))
                        {
//                            for (int i = 0; i < 3; ++i)
//                            {
                                ItemStack stack = new ItemStack(ItemSubmarineBoatItem.block, 1);
                                NBTTagCompound stackNBT = new NBTTagCompound();
                                if (this.getRF() >= 0) {
                                    stackNBT.setInteger("rf", this.getRF());
                                }
                                stackNBT.setBoolean("enhanced", this.getEnhanced());
                                stackNBT.setBoolean("shulker", this.getShulker());
                                if (this.getShulker())
                                {
                                    NBTTagList nbttaglist = new NBTTagList();

                                    for (int i = 0; i < this.submarineChest.getSizeInventory(); ++i)
                                    {
                                        ItemStack itemstack = this.submarineChest.getStackInSlot(i);

                                        if (!itemstack.isEmpty())
                                        {
                                            NBTTagCompound nbttagcompound = new NBTTagCompound();
                                            nbttagcompound.setByte("Slot", (byte)i);
                                            itemstack.writeToNBT(nbttagcompound);
                                            nbttaglist.appendTag(nbttagcompound);
                                        }
                                    }

                                    stackNBT.setTag("Items", nbttaglist);
                                }
                                stack.setTagCompound(stackNBT);
                                Block.spawnAsEntity(world, this.getPosition(), stack);
//                            }
                        }
                    }
                }

                this.fallDistance = 0.0F;
            }
            else if (this.world.getBlockState((new BlockPos(this)).down()).getMaterial() != Material.WATER && y < 0.0D)
            {
                this.fallDistance = (float)((double)this.fallDistance - y);
            }
        }
    }

    @Override
    public boolean getPaddleState(int side)
    {
        return ((Boolean)this.dataManager.get(DATA_ID_PADDLE[side])).booleanValue() && this.getControllingPassenger() != null;
    }

    @Override
    public void setDamageTaken(float damageTaken)
    {
        this.dataManager.set(DAMAGE_TAKEN, Float.valueOf(damageTaken));
    }

    @Override
    public float getDamageTaken()
    {
        return ((Float)this.dataManager.get(DAMAGE_TAKEN)).floatValue();
    }

    @Override
    public void setTimeSinceHit(int timeSinceHit)
    {
        this.dataManager.set(TIME_SINCE_HIT, Integer.valueOf(timeSinceHit));
    }

    @Override
    public int getTimeSinceHit()
    {
        return ((Integer)this.dataManager.get(TIME_SINCE_HIT)).intValue();
    }

    @Override
    public void setForwardDirection(int forwardDirection)
    {
        this.dataManager.set(FORWARD_DIRECTION, Integer.valueOf(forwardDirection));
    }

    @Override
    public int getForwardDirection()
    {
        return ((Integer)this.dataManager.get(FORWARD_DIRECTION)).intValue();
    }

    @Override
    protected boolean canFitPassenger(Entity passenger)
    {
        return this.getPassengers().size() < 2;
    }

    @Nullable
    @Override
    public Entity getControllingPassenger()
    {
        List<Entity> list = this.getPassengers();
        return list.isEmpty() ? null : (Entity)list.get(0);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void updateInputs(boolean p_184442_1_, boolean p_184442_2_, boolean p_184442_3_, boolean p_184442_4_)
    {
        this.leftInputDown = p_184442_1_;
        this.rightInputDown = p_184442_2_;
        this.forwardInputDown = p_184442_3_;
        this.backInputDown = p_184442_4_;

        if (this.getBoatStatus() == Status.IN_AIR || this.getBoatStatus() == Status.ON_LAND) {
            this.leftInputDown = false;
            this.rightInputDown = false;
            this.forwardInputDown = false;
            this.backInputDown = false;
        }

        if (this.getControllingPassenger() instanceof EntityPlayerSP) {
            this.downInputDown = ClientProxyLepidodendronMod.keyBoatDown.isKeyDown();
            this.upInputDown = ClientProxyLepidodendronMod.keyBoatUp.isKeyDown();
            if (this.downInputDown && this.upInputDown) {
                this.downInputDown = false;
                this.upInputDown = false;
            }

            this.leftStrafeInputDown = ClientProxyLepidodendronMod.keyBoatStrafeLeft.isKeyDown();
            this.rightStrafeInputDown = ClientProxyLepidodendronMod.keyBoatStrafeRight.isKeyDown();
            if (this.leftStrafeInputDown && this.rightStrafeInputDown) {
                this.leftStrafeInputDown = false;
                this.rightStrafeInputDown = false;
            }
        }

        if ((LepidodendronConfig.machinesRF && this.getRF() == 0)
            || this.getRF() == -1) { //Power has run out or battery is absent
            this.leftInputDown = false;
            this.rightInputDown = false;
            this.forwardInputDown = false;
            this.backInputDown = false;
            this.downInputDown = false;
            this.upInputDown = false;
            this.leftStrafeInputDown = false;
            this.rightStrafeInputDown = false;
        }

        this.useBucketDown = ClientProxyLepidodendronMod.keyBoatUseBucket.isKeyDown();
        this.useClawDown = ClientProxyLepidodendronMod.keyBoatUseClaw.isKeyDown();

    }

    @Override
    public void onInventoryChanged(IInventory invBasic) {

    }

    @Override
    public int getAnimationTick() {
        return animationTick;
    }

    @Override
    public void setAnimationTick(int i) {
        animationTick = i;
    }

    @Override
    public Animation getAnimation() {
        return currentAnimation == null ? NO_ANIMATION : currentAnimation;
    }

    @Override
    public void setAnimation(Animation animation) {
        if (this.getAnimation() != animation) {
            this.currentAnimation = animation;
            setAnimationTick(0);
        }
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{NO_ANIMATION, CLAW_ANIMATION};
    }

    public static enum Status
    {
        IN_WATER,
        UNDER_WATER,
        UNDER_FLOWING_WATER,
        ON_LAND,
        IN_AIR;
    }

    // Forge: Fix MC-119811 by instantly completing lerp on board
    @Override
    protected void addPassenger(Entity passenger)
    {
        super.addPassenger(passenger);
        if(this.canPassengerSteer() && this.lerpSteps > 0)
        {
            this.lerpSteps = 0;
            this.posX = this.lerpX;
            this.posY = this.lerpY;
            this.posZ = this.lerpZ;
            this.rotationYaw = (float)this.lerpYaw;
            //this.rotationPitch = (float)this.lerpPitch;
        }
    }

    public class ContainerSubmarineChest extends InventoryBasic
    {
        public ContainerSubmarineChest(String inventoryTitle, int slotCount)
        {
            super(inventoryTitle, false, slotCount);
        }

        @SideOnly(Side.CLIENT)
        public ContainerSubmarineChest(ITextComponent inventoryTitle, int slotCount)
        {
            super(inventoryTitle, slotCount);
        }
    }

    public static class BucketMessageHandler implements IMessageHandler<PrehistoricFloraSubmarine.BucketMessage, IMessage> {
        @Override
        public IMessage onMessage(PrehistoricFloraSubmarine.BucketMessage message, MessageContext context) {

            EntityPlayerMP entity = context.getServerHandler().player;
            Entity e = entity.getServerWorld().getEntityByID(message.value);
            if (e != null && e instanceof PrehistoricFloraSubmarine) {
                if (((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.UNDER_WATER
                        || ((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.UNDER_FLOWING_WATER
                        || ((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.IN_WATER) {
                    if (((PrehistoricFloraSubmarine) e).getBucket() <= 0 && ((PrehistoricFloraSubmarine) e).getShulker()
                            && (((PrehistoricFloraSubmarine) e).getRF() > 0 || !LepidodendronConfig.machinesRF)
                    ) {
                        if (hasBucketSlot((PrehistoricFloraSubmarine) e, ((PrehistoricFloraSubmarine) e).getControllingPassenger()) >= 0) {
                            ((PrehistoricFloraSubmarine) e).setBucket(40);
                            if (LepidodendronConfig.machinesRF) {
                                ((PrehistoricFloraSubmarine) e).setRF(((PrehistoricFloraSubmarine) e).getRF() - 10);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public static class BucketMessage implements IMessage {
        int value;
        public BucketMessage() {
        }

        public BucketMessage(int value) {
            this.value = value;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(value);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            value = buf.readInt();
        }
    }

    public static class ClawMessageHandler implements IMessageHandler<PrehistoricFloraSubmarine.ClawMessage, IMessage> {
        @Override
        public IMessage onMessage(PrehistoricFloraSubmarine.ClawMessage message, MessageContext context) {

            EntityPlayerMP entity = context.getServerHandler().player;
            Entity e = entity.getServerWorld().getEntityByID(message.value);
            if (e != null && e instanceof PrehistoricFloraSubmarine) {
                if (((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.UNDER_WATER
                        || ((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.UNDER_FLOWING_WATER
                        || ((PrehistoricFloraSubmarine) e).getBoatStatus() == Status.IN_WATER) {
                    if (((PrehistoricFloraSubmarine) e).getShulker()
                            && (((PrehistoricFloraSubmarine) e).getRF() > 0 || !LepidodendronConfig.machinesRF)
                    ) {
                        if (((PrehistoricFloraSubmarine) e).getClaw() <= 0) {
                            ((PrehistoricFloraSubmarine) e).setClaw(80);
                            ((PrehistoricFloraSubmarine) e).setAnimation(CLAW_ANIMATION);
                            AnimationHandler.INSTANCE.updateAnimations((PrehistoricFloraSubmarine) e);
                            ((PrehistoricFloraSubmarine) e).world.playSound(null, ((PrehistoricFloraSubmarine) e).getPosition(), BlockSounds.SUBMARINE_CLAW, SoundCategory.BLOCKS, 1.0F, 1.0F);
                            if (LepidodendronConfig.machinesRF) {
                                ((PrehistoricFloraSubmarine) e).setRF(((PrehistoricFloraSubmarine) e).getRF() - 10);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public static class ClawMessage implements IMessage {
        int value;
        public ClawMessage() {
        }

        public ClawMessage(int value) {
            this.value = value;
        }

        @Override
        public void toBytes(io.netty.buffer.ByteBuf buf) {
            buf.writeInt(value);
        }

        @Override
        public void fromBytes(io.netty.buffer.ByteBuf buf) {
            value = buf.readInt();
        }
    }

    public static class ParticlePacket implements IMessage {

        private double x, y, z, rotation;

        public ParticlePacket()
        {
        }

        public ParticlePacket(double x, double y, double z, double rotation)
        {
            this.x = x;
            this.y = y;
            this.z = z;
            this.rotation = rotation;
        }

        @Override
        public void fromBytes(ByteBuf buf)
        {
            try
            {
                this.x = buf.readDouble();
                this.y = buf.readDouble();
                this.z = buf.readDouble();
                this.rotation = buf.readDouble();
            }
            catch(IndexOutOfBoundsException ioe)
            {
                return;
            }
        }

        @Override
        public void toBytes(ByteBuf buf)
        {
            buf.writeDouble(x);
            buf.writeDouble(y);
            buf.writeDouble(z);
            buf.writeDouble(rotation);
        }

        public static class Handler implements IMessageHandler<PrehistoricFloraSubmarine.ParticlePacket, IMessage>
        {

            @Override
            public IMessage onMessage(PrehistoricFloraSubmarine.ParticlePacket message, MessageContext ctx)
            {

                Minecraft minecraft = Minecraft.getMinecraft();
                final WorldClient worldClient = minecraft.world;

                minecraft.addScheduledTask(() -> processMessage(message, worldClient));

                return null;
            }

            void processMessage(PrehistoricFloraSubmarine.ParticlePacket message, WorldClient worldClient)
            {
                float rotation = (float)message.rotation;
                for (int l = 0; l < 15; ++l) {

                    double xOffset = (double)(MathHelper.sin((float)Math.toRadians(-rotation)) * 6.15F) + (worldClient.rand.nextFloat() * (double)(MathHelper.cos((float)Math.toRadians(rotation)) * 10.0F) * ((float)worldClient.rand.nextInt(3) - 1D));
                    double zOffset = (double)(MathHelper.cos((float)Math.toRadians(rotation)) * 6.15F) + (worldClient.rand.nextFloat() * (double)(MathHelper.sin((float)Math.toRadians(-rotation)) * 10.0F) * ((float)worldClient.rand.nextInt(3) - 1D));

                    double xSpeed = 0;
                    xSpeed = -Math.pow(xOffset,2) * 0.080d;
                    if (xOffset < 0) {
                        xSpeed = -xSpeed;
                    }

                    double zSpeed = 0;
                    zSpeed = -Math.pow(zOffset,2) * 0.080d;
                    if (zOffset < 0) {
                        zSpeed = -zSpeed;
                    }

                    double xOffsetPos = (double)(MathHelper.cos((float)Math.toRadians(rotation)) * 0.7F);
                    double zOffsetPos = -(double)(MathHelper.sin((float)Math.toRadians(-rotation)) * 0.7F);

                    double ySpeed = worldClient.rand.nextDouble() * 0.05F * (double)((double)worldClient.rand.nextInt(3) - 1.00);

                    worldClient.spawnParticle(EnumParticleTypes.WATER_BUBBLE, message.x + xOffset + xOffsetPos, message.y, message.z + zOffset + zOffsetPos, xSpeed, ySpeed, zSpeed);
                }
            }

        }

    }
}