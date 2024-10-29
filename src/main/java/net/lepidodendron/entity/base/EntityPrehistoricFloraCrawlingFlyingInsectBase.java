package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.BlockRottenLog;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraCrawlingFlyingInsectBaseAI;
import net.lepidodendron.entity.ai.EntityLookIdleAI;
import net.lepidodendron.entity.ai.EntityMateAIInsectCrawlingFlyingBase;
import net.lepidodendron.entity.ai.FlyingLandWanderAvoidWaterAI;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraCrawlingFlyingInsectBase extends EntityTameable implements IAnimatedEntity, IPrehistoricDiet {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    public Animation LAY_ANIMATION;
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ISMOVING = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> FLYING = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> FLYCOOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> WANDERCOOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.VARINT);

    private static final DataParameter<Integer> TICKOFFSET = EntityDataManager.createKey(EntityPrehistoricFloraCrawlingFlyingInsectBase.class, DataSerializers.VARINT);
    public int inPFLove;
    public boolean laying;
    public EntityItem eatTarget;

    public EntityPrehistoricFloraCrawlingFlyingInsectBase(World world) {
        super(world);
        this.enablePersistence();
        if (world != null) {
            this.selectNavigator();
            this.getNavigator().getNodeProcessor().setCanSwim(false);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        LAY_ANIMATION = Animation.create(this.getLayLength());
    }

    public String getEggNBT() {
        return getEntityId(this);
    }

    @Nullable
    public String getPNTypeName()
    {
        return null;
    }

    public String getEntityId(Entity entity) {
        String mobid = "";
        net.minecraftforge.fml.common.registry.EntityEntry entry =
                net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(entity.getClass());
        if (entry != null) {
            mobid = entry.getRegistryName().toString();
        }
        if (this.hasPNVariants() && this.getPNTypeName() != null) {
            mobid = mobid + "@" + this.getPNTypeName();
        }
        return mobid;
    }

    public ResourceLocation getEggTexture(@Nullable String variantIn) {
        String entityString = this.getEntityString();
        ResourceLocation resourceLocation;
        entityString = entityString.replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
        if (variantIn == null) {
            resourceLocation = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_" + entityString + ".png");
        }
        else {
            resourceLocation = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_" + entityString + "_" + variantIn + ".png");
        }
        if (resourceLocation == null) { //splice in something obvious so we can see it is broken!
            return new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png");
        }
        return resourceLocation;
    }

    public int getEggType(@Nullable String variantIn) { //0-3
        return 20; //Default to insect eggs
    }

    @Override
    public float getEyeHeight() {
        return 0.15F;
    }

    public void eatItem(ItemStack stack) {
        if (stack != null && stack.getItem() != null) {
            float itemHealth = 0.5F; //Default minimal nutrition
            if (stack.getItem() instanceof ItemFood) {
                itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
            }
            this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            stack.shrink(1);

            if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    @Nullable
    public EntityItem getEatTarget()
    {
        return this.eatTarget;
    }

    public void setEatTarget(@Nullable EntityItem entityItem)
    {
        this.eatTarget = entityItem;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        for (String oreDict : this.getFoodOreDicts()) {
            if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), stack)) {
                return true;
            }
        }
        return false;
    }

    public EnumCreatureAttributePN getPNCreatureAttribute() {
        if (getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD) {
            return EnumCreatureAttributePN.INVERTEBRATE;
        }
        return EnumCreatureAttributePN.VERTEBRATE;
    }

    @Override
    public boolean isChild()
    {
        return false;
    }

    public boolean hasPNVariants() {
        return false;
    }

    /**
     * If there are variants, do they need to match, not match, or not care about matches in order to breed?
     * -1 = the variants must be different to breed
     * 0 = the variants can be either different or the same to breed
     * 1 = the variants must be the same to breed
     */
    public byte breedPNVariantsMatch() {
        return 0;
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_terrestrial.name");
    }

    public static String getPeriod() {
        return "undefined";
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        int i = (int) Math.round(this.getMaxHealth()/4D);
        if (i < 1) {
            return 0;
        }
        return this.world.rand.nextInt(i);
    }

    public void selectNavigator () {
        if (this.getIsFlying()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase.FlightMoveHelper))
            || (!(this.navigator instanceof PathNavigateFlyingNoWater))) {
                this.moveHelper = new EntityPrehistoricFloraCrawlingFlyingInsectBase.FlightMoveHelper(this);
                this.navigator = new PathNavigateFlyingNoWater(this, world);
                //if (this instanceof EntityPrehistoricFloraGerarus) {
                //    System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
                //}
            }
        }
        else {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase.WanderMoveHelper))
            || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                this.moveHelper = new EntityPrehistoricFloraCrawlingFlyingInsectBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
                //if (this instanceof EntityPrehistoricFloraGerarus) {
               //    System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
                //}
            }
        }
        this.getNavigator().getNodeProcessor().setCanSwim(false);
    }

    public int getLayLength() {
        return 50;
    } //Do not change this

    protected abstract float getAISpeedLand();

    public abstract boolean laysEggs();

    public abstract boolean dropsEggs();

    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    public float getMaxTurnDistancePerTick() {
        return 20;
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(FLYING, false);
        this.dataManager.register(ISMOVING, false);
        this.dataManager.register(TICKS, rand.nextInt(24000));
        this.dataManager.register(FLYCOOLDOWN, 0);
        this.dataManager.register(WANDERCOOLDOWN, 0);
        this.dataManager.register(MATEABLE, 0);
        this.dataManager.register(TICKOFFSET, rand.nextInt(1000));
    }

    public boolean canJar() {
        return false;
    }

    public boolean getIsMoving() {
        return this.dataManager.get(ISMOVING);
    }

    public void setIsMoving(boolean isMoving) {
        this.dataManager.set(ISMOVING, isMoving);
    }

    public int getWanderCooldown() {
        return this.dataManager.get(WANDERCOOLDOWN);
    }

    public void setWanderCooldown(int WanderCooldown) {
        this.dataManager.set(WANDERCOOLDOWN, WanderCooldown);
    }

    public int getFlyCooldown() {
        return this.dataManager.get(FLYCOOLDOWN);
    }

    public void setFlyCooldown(int FlyCooldown) {
        this.dataManager.set(FLYCOOLDOWN, FlyCooldown);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setTicks(0);
        this.setMateable(0);
        return livingdata;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
    }

    public boolean getIsFlying() {
        return this.dataManager.get(FLYING);
    }

    public void setFlying(boolean flying) {
        this.dataManager.set(FLYING, flying);
    }

    public static BlockPos getPositionRelativetoGround(Entity entity, World world, double x, double z, Random rand) {
        BlockPos pos = new BlockPos(x, entity.posY, z);
        while ((world.getBlockState(pos.down()).getMaterial() != Material.WATER) && (world.getBlockState(pos.down()).getMaterial() != Material.LAVA) && world.isAirBlock(pos.down()) && pos.getY() > 0) {
            pos = pos.down();
        }
        return pos.up(2 + rand.nextInt(3));
    }

    //@Override
    //public boolean isMovementBlocked() {
    //    return isSitting();
    //}

    public boolean isMovementBlockedSoft() {
        return isMovementBlocked() ;
    }

    public int getTickOffset() {
        return this.dataManager.get(TICKOFFSET);
    }

    public void setTickOffset(int ticks) {
        this.dataManager.set(TICKOFFSET, ticks);
    }

    public int getTicks() {
       return this.dataManager.get(TICKS);
    }

    public void setTicks(int ticks) {
        this.dataManager.set(TICKS, ticks);
    }

    public boolean getCanBreed() {
        int breedCooldown = LepidodendronConfig.breedCooldown;
        if (breedCooldown < 1) {
            breedCooldown = 1;
        }
        return this.getTicks() > breedCooldown; //If the mob has done not bred for a MC day
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setFlyCooldown(compound.getInteger("FlyCooldown"));
        this.setWanderCooldown(compound.getInteger("WanderCooldown"));
        compound.setInteger("TickOffset", this.getTickOffset());
        this.setTicks(compound.getInteger("Ticks"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.laying = compound.getBoolean("laying");
        this.setMateable(compound.getInteger("mateable"));
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("FlyCooldown", this.getFlyCooldown());
        compound.setInteger("WanderCooldown", this.getWanderCooldown());
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("TickOffset", this.getTickOffset());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setBoolean("laying", this.laying);
        compound.setInteger("mateable", this.getMateable());
    }

    private Animation animation = NO_ANIMATION;

    public static final Animation ANIMATION_WANDER = Animation.create(20);

    //@Override
    //protected void updateAITasks()
    //{
        //this.inPFLove = 0; //why is this even here????
    //   super.updateAITasks();
    //}

    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityMateAIInsectCrawlingFlyingBase(this, 1));
        this.tasks.addTask(2, new AIWanderInsect());
        this.tasks.addTask(3, new FlyingLandWanderAvoidWaterAI(this, 1, 10));
        this.tasks.addTask(4, new EntityLookIdleAI(this));
        this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraCrawlingFlyingInsectBaseAI(this));
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    public abstract String getTexture();

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    public int defaultFlyCooldown() {
        return 2000;
    }

    public int defaultWanderCooldown() {
        return 500;
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float f) {
        if (ds == DamageSource.IN_WALL) {
            return false;
        }
        if (ds == DamageSource.FALL) {
            return false;
        }
        if (this.getIsFlying()) {
            this.setFlying(false);
        }
        else {
            this.setFlying(true);
        }
        this.inPFLove = 0;
        this.setFlyCooldown(this.defaultFlyCooldown() + rand.nextInt(500));
        this.setWanderCooldown(this.defaultWanderCooldown() + rand.nextInt(500));
        return super.attackEntityFrom(ds, f);
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ARTHROPOD;
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    protected abstract float getAISpeedInsect();

    @Override
    public boolean canBreatheUnderwater() {
        return false;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < (double) this.world.getSeaLevel() && isInWater();
    }

    @Override
    public int getTalkInterval() {
        return 120;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    protected void setSizer(float width, float height)
    {
        if (width != this.width || height != this.height)
        {
            float f = this.width;
            this.width = width;
            this.height = height;
            if (this.width != f) {
                double d0 = (double) width / 2.0D;
                this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
            }
        }
    }

    public void onEntityUpdate()
    {
        //System.err.println("updateEntity");
        super.onEntityUpdate();
        if (!this.world.isRemote) {
            if (
                    //this.onGround &&
                    this.getIsFlying() && this.getWanderCooldown() <= 0) {
                this.setFlying(false);
                this.setFlyCooldown(this.defaultFlyCooldown() + rand.nextInt(500));
                this.setWanderCooldown(this.defaultWanderCooldown() + rand.nextInt(500));
            } else {
                if (this.getFlyCooldown() >= 0 && !this.getIsFlying()) {
                    this.setFlyCooldown(this.getFlyCooldown() - 1);
                }
                if (this.getWanderCooldown() >= 0 && this.getIsFlying()) {
                    this.setWanderCooldown(this.getWanderCooldown() - 1);
                }
            }
        }

        if (this.world.getBlockState(this.getPosition()).getBlock() == BlockGlassJar.block
                && this.canJar()) {
            this.setEntityBoundingBox(new AxisAlignedBB(this.posX - 0.05, this.posY, this.posZ - 0.05, this.posX + 0.05, this.posY + 0.1, this.posZ + 0.05));
        }
        else {
            this.setSizer(this.width, this.height);
        }

        //General ticker (for babies etc.)
        int ii = this.getTicks();
        if (this.isEntityAlive())
        {
            ++ii;
            //limit at 24000 + 3600 (one MC day plus 3 minutes) and then reset:
            if (ii >= 27600) {ii = 0;}
            this.setTicks(ii);
        }

        //Lay eggs perhaps:
        if (!world.isRemote && this.laysEggs() && this.getCanBreed() && this.getLaying()
        ) {
            if (this.testLay(world, this.getPosition()) && this.getTicks() > 0
            ) {
                //if (Math.random() > 0.5) {
                this.setTicks(-50); //Flag this as stationary for egg-laying
                this.setAnimation(LAY_ANIMATION);
                //}
            }
            else if (this.testLay(world, this.getPosition()) && this.getTicks() > -47 && this.getTicks() < 0) {
                //Is stationary for egg-laying:
                //System.err.println("Laying an egg in it");

                //this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                if (this.testLay(world, this.getPosition())) {
                    BlockPos nestPos = this.getPosition();

                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                    TileEntity te = world.getTileEntity(nestPos);
                    if (te != null) {
                        te.getTileData().setString("creature", getEntityId(this));
                    }
                    IBlockState state = world.getBlockState(nestPos);
                    world.notifyBlockUpdate(nestPos, state, state, 3);
                    this.setLaying(false);
                }
                this.setTicks(0);
            }
            else if (this.testLay(world, this.getPosition().down()) && this.getTicks() > 0
            ) {
                //if (Math.random() > 0.5) {
                this.setTicks(-50); //Flag this as stationary for egg-laying
                this.setAnimation(LAY_ANIMATION);
                //}
            }
            else if (this.testLay(world, this.getPosition().down()) && this.getTicks() > -47 && this.getTicks() < 0) {
                //Is stationary for egg-laying and this is a rotten-log / etc lay
                //System.err.println("Laying an egg in it");

                //this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                if (this.testLay(world, this.getPosition().down()) && world.getBlockState(this.getPosition().down()).getBlock() == BlockRottenLog.block) {
                    BlockPos nestPos = this.getPosition().down();
                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                    TileEntity te = world.getTileEntity(nestPos);
                    if (te != null) {
                        te.getTileData().setString("creature", getEntityId(this));
                    }
                    IBlockState state = world.getBlockState(nestPos);
                    world.notifyBlockUpdate(nestPos, state, state, 3);
                    this.setLaying(false);
                }
                this.setTicks(0);
            }
        }
    }

    public boolean testLay(World world, BlockPos pos) {
        return false;
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!itemstack.isEmpty())
        {
            if (this.isBreedingItem(itemstack) && this.inPFLove <= 0 && this.getMateable() == 0)
            {
                this.consumeItemFromStack(player, itemstack);
                this.inPFLove = 600;
                this.world.setEntityState(this, (byte) 18);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onLivingUpdate() {
        this.renderYawOffset = this.rotationYaw;

        if (this.inPFLove > 0)
        {
            --this.inPFLove;
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
        }


        if (!this.world.isRemote) {
            this.fallDistance = 0;
        }

        if (!this.world.isRemote) {
            if (this.isInWater() && !this.getIsFlying()) {
                this.setWanderCooldown(this.defaultWanderCooldown() + rand.nextInt(100));
                this.setFlyCooldown(this.defaultFlyCooldown() + rand.nextInt(100));
                setFlying(true);
            }

            //System.err.println("Fly cooldown " + this.flyCooldown + " Wander cooldown " + this.wanderCooldown);

            selectNavigator();
        }

        super.onLivingUpdate();

        if (!this.world.isRemote) {
            if (this.getFlyCooldown() <= 0) {
                setFlying(true);
                this.setFlyCooldown(this.defaultFlyCooldown() + rand.nextInt(500));
                this.setWanderCooldown(this.defaultWanderCooldown() + rand.nextInt(500));
            }

            if (this.getWanderCooldown() <= 0) {
                setFlying(false);
                this.setFlyCooldown(this.defaultFlyCooldown() + rand.nextInt(500));
                this.setWanderCooldown(this.defaultWanderCooldown() + rand.nextInt(500));
            }

            if (this.getIsFlying() && !this.isMovementBlockedSoft()) {
                this.motionY += 0.08D;
            }

            if (this.getIsFlying() && this.ticksExisted % 20 == 0 && !world.isRemote) {
                this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
                        .getObject(this.FlightSound()), this.getSoundVolume(), 1);
            }

            //if (this instanceof EntityPrehistoricFloraGerarus) {
            //    System.err.println(this.getClass() + " FlyCooldown: " + this.getFlyCooldown());
            //    System.err.println(this.getClass() + " WanderCooldown: " + this.getWanderCooldown());
            //    System.err.println(this.getClass() + " Flying: " + this.getIsFlying());
            //}
        }

    }

    public ResourceLocation FlightSound() {
        return new ResourceLocation("lepidodendron:bug_flight");
    }

    @Override
    public SoundEvent getAmbientSound() {
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:bug_hurt"));
    }

    @Override
    public boolean isInLove()
    {
        return this.inPFLove > 0;
    }

    @Override
    public void resetInLove()
    {
        this.inPFLove = 0;
    }

    public void setNotMateable()
    {
        this.setMateable(-6000);
    }

    public void setLaying(boolean bool)
    {
        this.laying = bool;
    }

    public boolean getLaying()
    {
        return this.laying;
    }

    @Override
    public SoundEvent getDeathSound() {
        return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:bug_death"));
    }

    public boolean isDirectPathBetweenPoints(Vec3d target) {
        RayTraceResult rayTrace = world.rayTraceBlocks(this.getPositionVector().add(0, -0.25, 0), target, true);
        if (rayTrace != null && rayTrace.hitVec != null) {
            BlockPos sidePos = rayTrace.getBlockPos();
            BlockPos pos = new BlockPos(rayTrace.hitVec);
            if (!world.isAirBlock(pos) || !world.isAirBlock(sidePos)) {
                return true;
            } else {
                return rayTrace.typeOfHit != RayTraceResult.Type.MISS;
            }
        }
        return true;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        float f4;
        if (this.isServerWorld()) {
            if (isInWater()) {
                this.moveRelative(strafe, vertical, forward, 0.1F);
                f4 = 0.8F;
                float speedModifier = (float) EnchantmentHelper.getDepthStriderModifier(this);
                if (speedModifier > 3.0F) {
                    speedModifier = 3.0F;
                }
                if (!this.onGround) {
                    speedModifier *= 0.5F;
                }
                if (speedModifier > 0.0F) {
                    f4 += (0.54600006F - f4) * speedModifier / 3.0F;
                }
                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
                this.motionX *= f4;
                this.motionX *= 0.9;
                this.motionY *= 0.9;
                this.motionY *= f4;
                this.motionZ *= 0.9;
                this.motionZ *= f4;
            } else {
                super.travel(strafe, vertical, forward);

                if (this.motionX != 0 || this.motionZ != 0) {
                    this.setIsMoving(true);
                }
                else {
                    this.setIsMoving(false);
                }

            }
        }
        this.prevLimbSwingAmount = this.limbSwingAmount;
        double deltaX = this.posX - this.prevPosX;
        double deltaZ = this.posZ - this.prevPosZ;
        double deltaY = this.posY - this.prevPosY;
        float delta = MathHelper.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ) * 4.0F;
        if (delta > 1.0F) {
            delta = 1.0F;
        }
        this.limbSwingAmount += (delta - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }

    public class FlightMoveHelper extends EntityMoveHelper {
        public FlightMoveHelper(EntityPrehistoricFloraCrawlingFlyingInsectBase insect) {
            super(insect);
            this.speed = EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getAISpeedInsect();
        }

        public void onUpdateMoveHelper() {
            if (this.action == Action.MOVE_TO) {
                if (EntityPrehistoricFloraCrawlingFlyingInsectBase.this.collidedHorizontally) {
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rotationYaw += 180.0F;
                    this.speed = 0.1F;
                    BlockPos target = EntityPrehistoricFloraCrawlingFlyingInsectBase.getPositionRelativetoGround(EntityPrehistoricFloraCrawlingFlyingInsectBase.this, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.world, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posX + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posZ + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand);
                    this.posX = target.getX();
                    this.posY = target.getY();
                    this.posZ = target.getZ();
                }
                double d0 = this.posX - EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posX;
                double d1 = this.posY - EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posY;
                double d2 = this.posZ - EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = MathHelper.sqrt(d3);

                if (d3 < EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = Action.WAIT;
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionX *= 0.5D;
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionY *= 0.5D;
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionZ *= 0.5D;
                } else {
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionX += d0 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionY += d1 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

                    if (EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getAttackTarget() == null) {
                        EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionX, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.motionZ)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraCrawlingFlyingInsectBase.this.renderYawOffset = EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rotationYaw;
                    } else {
                        double d4 = EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getAttackTarget().posX - EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posX;
                        double d5 = EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getAttackTarget().posZ - EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posZ;
                        EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraCrawlingFlyingInsectBase.this.renderYawOffset = EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rotationYaw;
                    }
                }
            }
        }
    }

    public class WanderMoveHelper extends EntityMoveHelper {

        private final EntityPrehistoricFloraCrawlingFlyingInsectBase EntityBase = EntityPrehistoricFloraCrawlingFlyingInsectBase.this;

        public WanderMoveHelper() {
            super(EntityPrehistoricFloraCrawlingFlyingInsectBase.this);
        }

        public void onUpdateMoveHelper() {

            if (this.action == Action.STRAFE) {
                //float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
                float f = getAISpeedLand();
                float f1 = (float) this.speed * f;
                float f2 = this.moveForward;
                float f3 = this.moveStrafe;
                float f4 = MathHelper.sqrt(f2 * f2 + f3 * f3);

                if (f4 < 1.0F) {
                    f4 = 1.0F;
                }

                f4 = f1 / f4;
                f2 = f2 * f4;
                f3 = f3 * f4;
                float f5 = MathHelper.sin(this.EntityBase.rotationYaw * 0.017453292F);
                float f6 = MathHelper.cos(this.EntityBase.rotationYaw * 0.017453292F);
                float f7 = f2 * f6 - f3 * f5;
                float f8 = f3 * f6 + f2 * f5;
                PathNavigate pathnavigate = this.EntityBase.getNavigator();

                if (pathnavigate != null) {
                    NodeProcessor nodeprocessor = pathnavigate.getNodeProcessor();

                    if (nodeprocessor != null && nodeprocessor.getPathNodeType(this.EntityBase.world, MathHelper.floor(this.EntityBase.posX + (double) f7), MathHelper.floor(this.EntityBase.posY), MathHelper.floor(this.EntityBase.posZ + (double) f8)) != PathNodeType.WALKABLE) {
                        this.moveForward = 1.0F;
                        this.moveStrafe = 0.0F;
                        f1 = f;
                    }
                }

                this.EntityBase.setAIMoveSpeed(f1);
                this.EntityBase.setMoveForward(this.moveForward);
                this.EntityBase.setMoveStrafing(this.moveStrafe);
                this.action = Action.WAIT;
            } else if (this.action == Action.MOVE_TO) {
                this.action = Action.WAIT;
                double d0 = this.posX - this.EntityBase.posX;
                double d1 = this.posZ - this.EntityBase.posZ;
                double d2 = this.posY - this.EntityBase.posY;
                double d3 = d0 * d0 + d2 * d2 + d1 * d1;

                if (d3 < 2.500000277905201E-7D) {
                    this.EntityBase.setMoveForward(0.0F);
                    return;
                }

                float turn = (EntityBase.getMaxTurnDistancePerTick());
                float f9 = (float) (MathHelper.atan2(d1, d0) * (180D / Math.PI)) - 90;
                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, f9, turn);
                //this.EntityBase.setAIMoveSpeed((float) (this.speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));

                //float speed = getAISpeedLand();
                //this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * getAISpeedLand()));


                //Testing mode:
                //this.EntityBase.setAIMoveSpeed(0f);

                if ((this.EntityBase.collidedHorizontally)
                        && (d2 > (double) this.EntityBase.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.EntityBase.width))
                ) {
                    this.EntityBase.getJumpHelper().setJumping();
                    this.action = Action.JUMPING;
                }
            } else if (this.action == Action.JUMPING) {
                //float speed = getAISpeedLand();
                //this.EntityBase.setAIMoveSpeed((float) (speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedLand()));

                if (this.EntityBase.onGround) {
                    this.action = Action.WAIT;
                }
            } else {
                this.EntityBase.setMoveForward(0.0F);
            }
        }
    }

    public class AIWanderInsect extends EntityAIBase {
        BlockPos target;

        public AIWanderInsect() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            if (!EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getIsFlying()) {
                return false;
            }

            target = EntityPrehistoricFloraCrawlingFlyingInsectBase.getPositionRelativetoGround(EntityPrehistoricFloraCrawlingFlyingInsectBase.this, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.world, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posX + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posZ + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand);
            Material material = world.getBlockState(new BlockPos(target)).getMaterial();
            Material material1 = world.getBlockState(new BlockPos(target).up()).getMaterial();
            return (material1 != Material.LAVA)
                && (material1 != Material.WATER) && (material != Material.LAVA) && (material != Material.WATER) && EntityPrehistoricFloraCrawlingFlyingInsectBase.this.isDirectPathBetweenPoints(new Vec3d(target).add(0.5D, 0.5D, 0.5D)) && EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(4) == 0;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            if (!EntityPrehistoricFloraCrawlingFlyingInsectBase.this.isDirectPathBetweenPoints(new Vec3d(target))) {
                target = EntityPrehistoricFloraCrawlingFlyingInsectBase.getPositionRelativetoGround(EntityPrehistoricFloraCrawlingFlyingInsectBase.this, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.world, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posX + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.posZ + EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraCrawlingFlyingInsectBase.this.rand);
            }
            if (EntityPrehistoricFloraCrawlingFlyingInsectBase.this.world.isAirBlock(target)) {
                EntityPrehistoricFloraCrawlingFlyingInsectBase.this.moveHelper.setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 0.15D);
                if (EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getAttackTarget() == null) {
                    EntityPrehistoricFloraCrawlingFlyingInsectBase.this.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

                }
            }
        }
    }

}