package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.lepidodendron.entity.util.*;
import net.lepidodendron.item.ItemNesting;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.lepidodendron.util.patchouli.DimensionSpawns;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.chunk.storage.AnvilChunkLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public abstract class EntityPrehistoricFloraAgeableBase extends EntityTameable implements IAnimatedEntity, IPrehistoricDiet {

    private static final DataParameter<Integer> AGETICKS = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> HUNTING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> CANGROW = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ISFAST = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> ISSNEAKING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> ISMOVING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> ONEHIT = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ISCURIOUSWALKING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> JUVENILE = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<Optional<BlockPos>> NEST_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.OPTIONAL_BLOCK_POS);

    private static final DataParameter<Boolean> BABIES = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> ISBABY = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> SLEEPING = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.BOOLEAN);

    private static final DataParameter<Integer> TICKOFFSET = EntityDataManager.createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> AIR_SPECIAL = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraAgeableBase.class, DataSerializers.VARINT);

    public int screamAlarmCooldown;
    private EntityLivingBase alarmTarget;
    private int alarmTimer;
    //public float minSize;
    public float minWidth;
    public float maxWidth;
    public float maxHeight;
    public double maxHealthAgeable;
    private int animationTick;
    public Animation ATTACK_ANIMATION;
    public Animation ROAR_ANIMATION;
    public Animation LAY_ANIMATION;
    public Animation MAKE_NEST_ANIMATION;
    public static Animation HIDE_ANIMATION;
    private Animation currentAnimation;
    public EntityPrehistoricFloraAgeableBase shoalLeader;
    public int inPFLove;
    public boolean laying;
    public float extraStepHeight = 0F;
    public EntityItem eatTarget;
    public EntityLivingBase warnTarget;
    public EntityLivingBase avoidTarget;
    public EntityLiving grappleTarget;
    public boolean willGrapple;
    public boolean secondGrappleTarget = false;
    public int alarmCooldown;
    public int warnCooldown;
    public int ticksExistedAnimated;
    public float getMaxTurnDistancePerTick;
    public int homeCooldown;

    public EntityPrehistoricFloraAgeableBase(World worldIn) {
        super(worldIn);
        this.enablePersistence();
        if (worldIn != null) {
            this.setScaleForAge(false);
        }
        ATTACK_ANIMATION = Animation.create(this.getAttackLength());
        ROAR_ANIMATION = Animation.create(this.getRoarLength());
        LAY_ANIMATION = Animation.create(this.getLayLength());
        MAKE_NEST_ANIMATION = Animation.create(this.getLayLength()); //Same as laying length
        getMaxTurnDistancePerTick = 20.0F;
    }

    public boolean ighnoreSizeForAvoidance() {
        return false;
    }

    @Nullable
    public String getPNTypeName()
    {
        return null;
    }

    public boolean isAnimationDirectionLocked(Animation animation) {
        /**
         * If it must not pathfind, rotate or change its look angle while it is happening
         * This is used primarily to stop certain AI for pathfinding or targeting happening
         */
        return false;
    }

    @Nullable
    public EntityLivingBase getAlarmTarget()
    {
        return this.alarmTarget;
    }

    public int getAlarmTimer()
    {
        return this.alarmTimer;
    }

    public void setAlarmTarget(@Nullable EntityLivingBase livingBase)
    {
        this.alarmTarget = livingBase;
        this.alarmTimer = this.ticksExisted;
    }

    public void setgetMaxTurnDistancePerTick(float turn) {
        this.getMaxTurnDistancePerTick = turn;
    }

    public float getgetMaxTurnDistancePerTick() {
        if (this.getIsFast() || this.getLaying() || this.isInLove()) {
            return 20.0F;
        }
        if (!this.getNavigator().noPath()) {
            if (this.getDistance(
                    this.getNavigator().getPath().getFinalPathPoint().x,
                    this.posY,
                    this.getNavigator().getPath().getFinalPathPoint().z)
                < this.width * 1.5) {
                return 20.0F;
            }
        }
        return this.getMaxTurnDistancePerTick;
    }

    public int warnDistance() {
        return 16;
    }

    /** Set to true if the mob needs to go into sneak AI mode if you hit it oe on a warn AI
     * When false it only does the sneak AI when in "standard" hunting mode
     *
     * @return
     */
    public boolean sneakOnRevenge() {
        return false;
    }

    public void playStepSoundPublic() {
        if (this.width < 1.5F) {
            return;
        }
        Block blockIn = this.world.getBlockState(this.getPosition().down()).getBlock();
        BlockPos pos = this.getPosition();

        SoundType soundtype = null;
        SoundEvent soundevent = SoundEvents.ENTITY_POLAR_BEAR_STEP;
        SoundEvent soundeventSnow = SoundEvents.BLOCK_SNOW_STEP;
        SoundEvent soundeventWater = SoundEvents.ENTITY_PLAYER_SWIM;
        if (this.world.getBlockState(pos).getBlock() == Blocks.SNOW_LAYER
            || this.world.getBlockState(pos.down()).getBlock() == Blocks.SNOW)
        {
            soundtype = Blocks.SNOW_LAYER.getSoundType();
            this.getEntityWorld().playSound(null, this.getPosition(), soundeventSnow, SoundCategory.BLOCKS, soundtype.getVolume() * 0.15F, soundtype.getPitch());
        }
        else if (this.world.getBlockState(pos).getBlock() == Blocks.WATER)
        {
            soundtype = Blocks.WATER.getSoundType();
            this.getEntityWorld().playSound(null, this.getPosition(), soundeventWater, SoundCategory.BLOCKS, soundtype.getVolume() * 0.15F, soundtype.getPitch());
        }
        else if (!blockIn.getDefaultState().getMaterial().isLiquid())
        {
            soundtype = Blocks.DIRT.getSoundType();
            this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, soundtype.getVolume() * 0.15F, soundtype.getPitch());
        }
    }

    public boolean noMossEggs() {
        return false;
    }

    public float getSneakRange() {
        return 0;
    }

    public float getUnSneakRange() {
        return this.getSneakRange() * 0.5F;
    }

    public int getHomeCooldown() { return this.homeCooldown;}

    @Override
    public void onUpdate() {
        if (!this.updateBlocked) {
            this.ticksExistedAnimated += this.animSpeedAdder();
        }
        super.onUpdate();
    }

    public int animSpeedAdder() {
        if ((this.getIsMoving() || (!this.onGround) || this.isJumping)
            && this.getTicks() >= 0
        ) {
            return 1;
        }
        return 0;
    }

    public boolean hasAlarm() {
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

    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownEgg.block, (int) (1));
    }

    public int getAlarmCooldown() {
        return this.alarmCooldown;
    }

    public int getWarnCooldown() {
        return this.warnCooldown;
    }

    public int warnCooldownTime() {
        return 120; //how long between warning and attack
    }

    public void setWarnCooldown(int cooldown) {
        this.warnCooldown = cooldown;
    }

    public boolean canShoal() {
        return false;
    }

    public int getShoalSize() {
        return 0;
    }

    public int getShoalDist() {
        return 0;
    }

    public Class[] canShoalWith() {
        return new Class[]{this.getClass()};
    }

    public int getShoalInterval() {
        return 200;
    }

    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getRenderBoundingBox()
    {
        if (LepidodendronConfig.renderBigMobsProperly && (this.getMaxWidth() * this.getAgeScale()) > 1F) {
            return this.getEntityBoundingBox().grow(1.0, 0.25, 1.0);
        }
        return this.getEntityBoundingBox();
    }

    @Nullable
    public BlockPos getNestLocation() {
        return (BlockPos) ((Optional) this.dataManager.get(NEST_BLOCK_POS)).orNull();
    }

    public void setNestLocation(@Nullable BlockPos pos) {
        this.dataManager.set(NEST_BLOCK_POS, Optional.fromNullable(pos));
    }

    public boolean canJar() {
        return false;
    }

    @Nullable
    public BlockPos findNest(Entity entity, int dist, boolean empty) {
        int xx;
        int yy;
        int zz;
        BlockPos randPos;
        xx = -dist;
        while (xx <= dist) {
            yy = (int) -Math.ceil((double) dist / 2D);
            while (yy <= (int) Math.ceil((double) dist / 2D)) {
                zz = -dist;
                while (zz <= dist) {
                    if (entity.getPosition().getY() + yy >= 1 && entity.getPosition().getY() + yy <= 255) {
                        randPos = entity.getPosition().add(xx, yy, zz);
                        World world = this.world;
                        if (!empty) {
                            if (this.isHomeableNest(world, randPos)) {
                                if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                                    setNestAsMine(world, randPos);
                                    return randPos;
                                }
                            }
                        }
                        else {
                            if (this.isLayableNest(world, randPos)) {
                                if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                                    setNestAsMine(world, randPos);
                                    return randPos;
                                }
                            }
                        }
                    }
                    zz += 1;
                }
                yy += 1;
            }
            xx += 1;
        }
        return null;
    }

    public void setNestAsMine(World world, BlockPos pos) {
        TileEntity te = world.getTileEntity(pos);
        if (te != null) {
            te.getTileData().setString("creature", getEntityId(this));
        }
    }

    public boolean canSpawnOnLeaves() {
        return false;
    }

    public abstract boolean dropsEggs();

    public abstract boolean laysEggs();

    public boolean hasNest() {return false;}

    public boolean placesNest() {return false;}

    public boolean isHomeableNest (World world, BlockPos pos) {
        if (!world.isBlockLoaded(pos)) {
            return false;
        }
        if (world.getBlockState(pos).getBlock() == BlockNest.block) {
            //System.err.println("Testing layable");

            TileEntity te = world.getTileEntity(pos);
            if (te instanceof BlockNest.TileEntityNest) {
                String nestType = "";
                if (te.getTileData().hasKey("creature")) {
                    nestType = te.getTileData().getString("creature");
                }

                if (nestType.equalsIgnoreCase("")
                        || isMyNest(world, pos)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMyNest(World world, BlockPos pos) {
        if (!world.isBlockLoaded(pos)) {
            return false;
        }
        if (world.getBlockState(pos).getBlock() == BlockNest.block) {
            TileEntity te = world.getTileEntity(pos);
            if (te instanceof BlockNest.TileEntityNest) {
                String nestType = "";
                if (te.getTileData().hasKey("creature")) {
                    nestType = te.getTileData().getString("creature");
                }

                if (nestType.equalsIgnoreCase(this.getEntityId(this))) {
                    return true;
                }
            }
        }
        return false;
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
        return 0; //Default to small eggs
    }

    public boolean isNestMound() {
        return false;
    }

    public boolean isLayableNest(World world, BlockPos pos) {
        if (!world.isBlockLoaded(pos)) {
            return false;
        }
        //is empty of eggs, and either belongs to me or is empty:
        if (world.getBlockState(pos).getBlock() == BlockNest.block) {
            //System.err.println("Testing layable");
            TileEntity te = world.getTileEntity(pos);
            if (te instanceof BlockNest.TileEntityNest) {
                BlockNest.TileEntityNest tileNest = (BlockNest.TileEntityNest) te;
                if (tileNest.getStackInSlot(0).isEmpty()
                    && isHomeableNest(world, pos)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean nestBlockMatch(World world, BlockPos pos) {
        if (!world.isBlockLoaded(pos)) {
            return false;
        }
        if (this.isNestMound()) {
            boolean match = false;
            if (!match) {
                match = ((world.getBlockState(pos.down()).getMaterial() == Material.GROUND
                        || world.getBlockState(pos.down()).getMaterial() == Material.GRASS
                        || world.getBlockState(pos.down()).getMaterial() == Material.CLAY
                        || (world.getBlockState(pos.down()).getMaterial() == Material.SAND
                        && world.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL))
                        && world.isAirBlock(pos));
            }
            return match;
        }
        return false;
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        int i = (int) Math.round(this.getMaxHealthAgeable()/4D);
        if (i < 1) {
            return 0;
        }
        return this.world.rand.nextInt(i);
    }

    public boolean divesToLay() {
        return false;
    }

    public boolean grappleEntityAsMob(Entity entity) {
        return false;
    }

    @Override
    public float getEyeHeight() {
        return Math.max(super.getEyeHeight(), 0.8F);
    }

    public int getAttackLength() {
        return 20;
    }

    public int getRoarLength() {
        return 60;
    }

    public int getLayLength() {
        return 50;
    } //Do not change this

    @Override
    public int getAnimationTick() {
        return animationTick;
    }

    @Override
    public void setAnimationTick(int tick) {
        animationTick = tick;
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
        return new Animation[]{ATTACK_ANIMATION,ROAR_ANIMATION,MAKE_NEST_ANIMATION};
    }

    public SoundEvent getSoundForAnimation(Animation animation) {
        return null;
    }

    protected void initEntityAI() {
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    public String getTexture() {
        return this.getTexture();
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public EnumCreatureAttributePN getPNCreatureAttribute() {
        if (getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD) {
            return EnumCreatureAttributePN.INVERTEBRATE;
        }
        return EnumCreatureAttributePN.VERTEBRATE;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(AGETICKS, getAdultAge() - 1);
        this.dataManager.register(MATEABLE, 0);
        this.dataManager.register(TICKS, 0);
        this.dataManager.register(CANGROW, 0);
        this.dataManager.register(HUNTING, false);
        this.dataManager.register(ISFAST, false);
        this.dataManager.register(ISSNEAKING, false);
        this.dataManager.register(ISCURIOUSWALKING, false);
        this.dataManager.register(ISMOVING, false);
        this.dataManager.register(ONEHIT, false);
        this.dataManager.register(JUVENILE, false);
        this.dataManager.register(NEST_BLOCK_POS, Optional.absent());
        this.dataManager.register(TICKOFFSET, rand.nextInt(1000));
        this.dataManager.register(BABIES, false);
        this.dataManager.register(ISBABY, false);
        this.dataManager.register(AIR_SPECIAL, Integer.valueOf(300));
    }

    @Override
    public boolean isInWater() {
        if (this.world.isAirBlock(this.getPosition())) {return false;}
        return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    public boolean isPFAdult() {
        double adult = (double) LepidodendronConfig.adultAge;
        if (adult > 100) {adult = 100;}
        if (adult < 0) {adult = 0;}
        adult = adult/100D;
        if (this.getAgeScale() >= adult) {
            return true;
        }
        return false;
    }

    public boolean breaksBoat() {
        return false;
    }

    public void launchAttack() {
        IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        if (getAttackTarget() != null) {
            boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue() * this.getAgeScale());
            EntityLivingBase ee = this.getAttackTarget();
            if (ee.isRiding() && this.breaksBoat()) {
                Entity boat = ee.getRidingEntity();
                if (boat instanceof EntityBoat && (!(boat instanceof PrehistoricFloraSubmarine))) {
                    boat.setDead();
                    this.playSound(SoundEvents.ENTITY_ZOMBIE_BREAK_DOOR_WOOD, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }
            }
            if (this.getOneHit()) {
                this.setAttackTarget(null);
                this.setRevengeTarget(null);
                this.setWarnTarget(null);
            }
            this.setOneHit(false);
        }
    }

    public void launchGrapple() {
    }

    public AxisAlignedBB getAttackBoundingBox() {
        float size = this.getRenderSizeModifier() * 0.25F;
        return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
    }

    public AxisAlignedBB getGrappleBoundingBox() {
        return this.getAttackBoundingBox();
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
    }

    public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
        return null;
    }

    public int getAgeTicks() {
        return this.dataManager.get(AGETICKS);
    }

    public void setAgeTicks(int ageticks) {
        this.dataManager.set(AGETICKS, ageticks);
    }

    public int getCanGrow() {
        return this.dataManager.get(CANGROW);
    }

    public void setCanGrow(int growticks) {
        this.dataManager.set(CANGROW, growticks);
    }

    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    public boolean getCanBreed() {
        int breedCooldown = LepidodendronConfig.breedCooldown;
        if (breedCooldown < 1) {
            breedCooldown = 1;
        }
        return (this.isPFAdult() &&
                (this.getTicks() > breedCooldown || this.getTicks() < 0)); //If the mob has done not bred for a MC day
    }

    @Nullable
    public EntityPrehistoricFloraAgeableBase getShoalLeader() {
        return this.shoalLeader;
    }

    public void setShoalLeader(@Nullable EntityPrehistoricFloraAgeableBase leader) {
        this.shoalLeader = leader;
    }

    public int getFootstepOffset() {
        return 0;
    }

    public int getWalkCycleLength() {
        return 0;
    }

    public int tetrapodWalkFootstepOffset() {
        return 0;
    }

    public int getRunFootstepOffset() {
        return 0;
    }

    public int getRunCycleLength() {
        return 0;
    }

    public int tetrapodRunFootstepOffset() {
        return 0;
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

    public boolean getWillHunt() {
        return this.dataManager.get(HUNTING);
    }

    public void setWillHunt(boolean willHunt) {
        this.dataManager.set(HUNTING, willHunt);
    }

    public double getMaxHealthAgeable()
    {
        return maxHealthAgeable;
    }

    public abstract int getAdultAge();

    public boolean getIsCuriousWalking() {
        return this.dataManager.get(ISCURIOUSWALKING);
    }

    public void setIsCuriousWalking(boolean isCurious) {
        this.dataManager.set(ISCURIOUSWALKING, isCurious);
    }

    public boolean getIsFast() {
        return this.dataManager.get(ISFAST);
    }

    public void setIsFast(boolean isFast) {
        this.dataManager.set(ISFAST, isFast);
    }

    public boolean getIsSneaking() {
        return this.dataManager.get(ISSNEAKING);
    }

    public void setIsSneaking(boolean isSneaking) {
        this.dataManager.set(ISSNEAKING, isSneaking);
    }

    public boolean getIsMoving() {
        return this.dataManager.get(ISMOVING);
    }

    public void setIsMoving(boolean isMoving) {
        this.dataManager.set(ISMOVING, isMoving);
    }

    public boolean getOneHit() {
        return this.dataManager.get(ONEHIT);
    }

    public void setOneHit(boolean oneHit) {
        this.dataManager.set(ONEHIT, oneHit);
    }


    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setAgeTicks(this.getAdultAge() - 1);
        this.setMateable(0);
        this.setTicks(0);
        this.setTickOffset(rand.nextInt(1000));
        this.setIsFast(false);
        this.setIsSneaking(false);
        this.setWillHunt(false);
        //this.heal(this.getMaxHealth());
        //this.setNoAI(false);
        ShoalingHelper.updateShoalAgeableBase(this);
        return livingdata;
    }

    public void selectNavigator() {
        //Used for complex navigation only
        this.moveHelper = this.getMoveHelper();
        this.navigator = this.getNavigator();
    }

    public static void summon(World worldIn, String mobToSpawn, String nbtStr, double xpos, double ypos, double zpos) {
        summon(worldIn, mobToSpawn, nbtStr, xpos, ypos, zpos, false);
    }

    public static void summon(World worldIn, String mobToSpawn, String nbtStr, double xpos, double ypos, double zpos, boolean isBaby) {

        if (worldIn.isRemote) {
            return;
        }

        String s = mobToSpawn;

        if (s.equalsIgnoreCase("lepidodendron:prehistoric_flora_myriapod")) {
            int y= 99;
        }

        String variantStr = "";
        if (s.indexOf("@") >= 0) {
            variantStr = s.substring(s.indexOf("@") + 1);
            s = s.substring(0,s.indexOf("@"));
        }

        BlockPos pos = new BlockPos(xpos, ypos,zpos);

        if (!worldIn.isBlockLoaded(pos))
        {
            return;
        }

        NBTTagCompound nbttagcompound = new NBTTagCompound();
        boolean flag = false;
        if (!nbtStr.trim().equalsIgnoreCase(""))
        {
            String s1 = nbtStr;

            try
            {
                nbttagcompound = JsonToNBT.getTagFromJson(s1);
                flag = true;
            }
            catch (NBTException nbtexception)
            {
                return;
            }
        }

        if (nbttagcompound.hasKey("PNType")) {
            if (nbttagcompound.getString("PNType").equalsIgnoreCase("gendered")) {
                if ((new Random()).nextInt(2) == 0) {
                    variantStr = "male";
                } else {
                    variantStr = "female";
                }
            }
        }

        if (!variantStr.equalsIgnoreCase("")) {
            nbttagcompound.setString("PNType", variantStr);
        }
        else {
            variantStr = nbttagcompound.getString("PNType");
        }

        //if (s.substring(0, 10).equalsIgnoreCase("minecraft:")) {
            nbttagcompound.setBoolean("PersistenceRequired", true);
        //}

        nbttagcompound.setString("id", s);
        Entity entity = AnvilChunkLoader.readWorldEntityPos(nbttagcompound, worldIn, xpos, ypos, zpos, true);
        if (entity == null)
        {
            return;
        }
        else {
            //System.err.println("Rand: " + ((world.rand.nextFloat() - 0.5F)/10F));
            entity.setLocationAndAngles(xpos, ypos, zpos, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
            nbttagcompound = entity.writeToNBT(nbttagcompound);

            if (entity instanceof EntityLiving) {
                ((EntityLiving) entity).onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entity)), (IEntityLivingData) null);
                entity.readFromNBT(nbttagcompound); //re-apply nbt from previously in case some was overwritten by the init event
                //Cancel all this if we've summoned an invalid variant!
                if (!variantStr.equalsIgnoreCase("")) {
                    if (!DimensionSpawns.doesVariantExist((EntityLiving) entity, variantStr)) {
                        entity.setDead();
                        return;
                    }
                }
            }

            //Babify mob if required:
            if (isBaby) {
                nbttagcompound.setInteger("AgeTicks", 0);
                entity.readFromNBT(nbttagcompound);
            }

            //Force it to recognise a nest if applicable
            if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                EntityPrehistoricFloraAgeableBase ageable = (EntityPrehistoricFloraAgeableBase) entity;
                if (ageable.isHomeableNest(worldIn, ageable.getPosition())) {
                    ageable.setNestLocation(ageable.getPosition());
                }
                else if (ageable.isHomeableNest(worldIn, ageable.getPosition().down())) {
                    ageable.setNestLocation(ageable.getPosition().down());
                }
                else if (ageable.isHomeableNest(worldIn, ageable.getPosition().down(2))) {
                    ageable.setNestLocation(ageable.getPosition().down(2));
                }
            }

            //Exceptions for variants:
//            if (entity instanceof EntityPrehistoricFloraPalaeodictyoptera && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraPalaeodictyoptera palaeodictyoptera = (EntityPrehistoricFloraPalaeodictyoptera) entity;
//                palaeodictyoptera.setPNType(EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraPalaeodictyopteraNymph && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraPalaeodictyopteraNymph palaeodictyoptera = (EntityPrehistoricFloraPalaeodictyopteraNymph) entity;
//                palaeodictyoptera.setPNType(EntityPrehistoricFloraPalaeodictyopteraNymph.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraDragonfly && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraDragonfly dragonfly = (EntityPrehistoricFloraDragonfly) entity;
//                dragonfly.setPNType(EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraDragonflyNymph && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraDragonflyNymph dragonfly = (EntityPrehistoricFloraDragonflyNymph) entity;
//                dragonfly.setPNType(EntityPrehistoricFloraDragonflyNymph.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraMegasecoptera && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraMegasecoptera dragonfly = (EntityPrehistoricFloraMegasecoptera) entity;
//                dragonfly.setPNType(EntityPrehistoricFloraMegasecoptera.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraTitanoptera && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraTitanoptera titanoptera = (EntityPrehistoricFloraTitanoptera) entity;
//                titanoptera.setPNType(EntityPrehistoricFloraTitanoptera.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraTitanopteraNymph && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraTitanopteraNymph titanoptera = (EntityPrehistoricFloraTitanopteraNymph) entity;
//                titanoptera.setPNType(EntityPrehistoricFloraTitanopteraNymph.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraKalligrammatid && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraKalligrammatid kalligrammatid = (EntityPrehistoricFloraKalligrammatid) entity;
//                kalligrammatid.setPNType(EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraNotostracan && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraNotostracan notostracan = (EntityPrehistoricFloraNotostracan) entity;
//                notostracan.setPNType(EntityPrehistoricFloraNotostracan.Type.getTypeFromString(variantStr));
//            } else if (entity instanceof EntityPrehistoricFloraLacewing && !variantStr.equalsIgnoreCase("")) {
//                EntityPrehistoricFloraLacewing lacewing = (EntityPrehistoricFloraLacewing) entity;
//                lacewing.setPNType(EntityPrehistoricFloraLacewing.Type.getTypeFromString(variantStr));
//            }
        }



//        worldIn.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
//            @Override
//            public String getName() {
//                return "";
//            }
//
//            @Override
//            public boolean canUseCommand(int permission, String command) {
//                return true;
//            }
//
//            @Override
//            public World getEntityWorld() {
//                return worldIn;
//            }
//
//            @Override
//            public MinecraftServer getServer() {
//                return worldIn.getMinecraftServer();
//            }
//
//            @Override
//            public boolean sendCommandFeedback() {
//                return false;
//            }
//
//        }, "pf_summon " + mobToSpawn + " " + xpos + " " + ypos + " " + zpos + " " + nbtStr);
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_terrestrial.name");
    }

    public static String getPeriod() {
        return "undefined";
    }

    @Override
    public void setScaleForAge(boolean child) {
        //System.err.println("AgeScale: " + this.getAgeScale());
        //System.err.println("width: " + (this.getAgeScale() * this.maxWidth));
        //System.err.println("height: " + (this.getAgeScale() * this.maxHeight));
        this.setSizer(this.getAgeScale() * this.getMaxWidth(), this.getAgeScale() * this.getMaxHeight());
    }

    public float getMaxWidth() {
        return this.maxWidth;
    }

    public float getMaxHeight() {
        return this.maxHeight;
    }

    //Taken from the Entity class, not the EntityAgeable class
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
        this.stepHeight = 1F + ((this.extraStepHeight) * this.getAgeScale());
    }

    public float getAgeScale() {
        float step = 1F / ((float)this.getAdultAge() + 1F);
        if (this.getAgeTicks() >= this.getAdultAge()) {
            return 1F;
        }
        return Math.max((this.minWidth/this.getMaxWidth()), (step * (float)this.getAgeTicks()));
    }

    //@Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("AgeTicks", this.getAgeTicks());
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("TickOffset", this.getTickOffset());
        compound.setBoolean("willHunt", this.getWillHunt());
        compound.setBoolean("isFast", this.getIsFast());
        compound.setBoolean("isSneaking", this.getIsSneaking());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setInteger("canGrow", this.getCanGrow());
        compound.setBoolean("laying", this.laying);
        compound.setInteger("homeCooldown", this.homeCooldown);
        compound.setBoolean("juvenile", this.getJuvenile());
        compound.setInteger("mateable", this.getMateable());
        compound.setInteger("AlarmByTimestamp", this.alarmTimer);
        compound.setShort("Air_Special", (short)this.getAirSpecial());
        if (this.getNestLocation() != null) {
            compound.setInteger("PosX", this.getNestLocation().getX());
            compound.setInteger("PosY", this.getNestLocation().getY());
            compound.setInteger("PosZ", this.getNestLocation().getZ());
        }
    }

    //@Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        if (this.world != null) {
            super.readEntityFromNBT(compound);
        }
        this.setAgeTicks(compound.getInteger("AgeTicks"));
        this.setTicks(compound.getInteger("Ticks"));
        this.setTickOffset(compound.getInteger("TickOffset"));
        this.setWillHunt(compound.getBoolean("willHunt"));
        this.setIsFast(compound.getBoolean("isFast"));
        this.setIsSneaking(compound.getBoolean("isSneaking"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.setCanGrow(compound.getInteger("canGrow"));
        this.laying = compound.getBoolean("laying");
        this.homeCooldown = compound.getInteger("homeCooldown");
        this.setJuvenile(compound.getBoolean("juvenile"));
        this.setMateable(compound.getInteger("mateable"));
        this.alarmTimer = compound.getInteger("AlarmByTimestamp");
        this.setAirSpecial(compound.getShort("Air_Special"));
        if (compound.hasKey("PosX")) {
            int i = compound.getInteger("PosX");
            int j = compound.getInteger("PosY");
            int k = compound.getInteger("PosZ");
            this.dataManager.set(NEST_BLOCK_POS, Optional.of(new BlockPos(i, j, k)));
        } else {
            this.dataManager.set(NEST_BLOCK_POS, Optional.absent());
        }
    }

    public void setJuvenile(boolean val)
    {
        this.dataManager.set(JUVENILE, val);
    }

    public boolean getJuvenile() {
        return this.dataManager.get(JUVENILE);
    }

    public boolean getBabies() {
        return this.dataManager.get(BABIES);
    }

    public void setBabies(boolean babies) {
        this.dataManager.set(BABIES, babies);
    }

    public boolean getIsBaby() {
        return this.dataManager.get(ISBABY);
    }

    public void setIsBaby(boolean babies) {
        this.dataManager.set(ISBABY, babies);
    }

    @Override
    protected void updateAITasks()
    {
        if (!this.isPFAdult())
        {
            this.inPFLove = 0;
        }

        super.updateAITasks();
    }

    @Override
    public boolean isEntityInsideOpaqueBlock()
    {
        if (this.noClip)
        {
            return false;
        }
        else
        {
            if (this.world.getBlockState(this.getPosition()).causesSuffocation()) {
                return true;
            }

            return false;
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {

        if (ds == DamageSource.IN_WALL) {
            if (this.isInWater()) {
                return false;
            }
        }

        if (ds == DamageSource.FLY_INTO_WALL) {// || ds == DamageSource.IN_WALL) {
            if (ds.getDamageLocation() != null) {
                if (this.world.getBlockState(new BlockPos(ds.getDamageLocation())).getMaterial() == Material.ICE
                    || this.world.getBlockState(new BlockPos(ds.getDamageLocation())).getMaterial() == Material.PACKED_ICE) {
                    return false;
                }
            }
            if (this.isInWater()) {
                return false;
            }

            boolean isReallySuffocating = false;
            BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();

            for (int ii = 0; ii < 8; ++ii)
            {
                int j = MathHelper.floor(this.posY + (double)(((float)((ii >> 0) % 2) - 0.5F) * this.height * 0.8F));
                int k = MathHelper.floor(this.posX + (double)(((float)((ii >> 1) % 2) - 0.5F) * this.width * 0.8F));
                int l = MathHelper.floor(this.posZ + (double)(((float)((ii >> 2) % 2) - 0.5F) * this.width * 0.8F));

                if (blockpos$pooledmutableblockpos.getX() != k || blockpos$pooledmutableblockpos.getY() != j || blockpos$pooledmutableblockpos.getZ() != l)
                {
                    blockpos$pooledmutableblockpos.setPos(k, j, l);

                    if (this.world.getBlockState(blockpos$pooledmutableblockpos).causesSuffocation())
                    {
                        //blockpos$pooledmutableblockpos.release();
                        isReallySuffocating = true;
                        break;
                    }
                }
            }

            blockpos$pooledmutableblockpos.release();
            if (!isReallySuffocating) {
                return false;
            }

        }

        if (this.getHurtSound(DamageSource.GENERIC) != null && i >= 1) {
            //if (this.getAnimation() != null) {
                if (this.getAnimation() == NO_ANIMATION) {
                    if (this instanceof EntityPrehistoricFloraLandCarnivoreBase) {
                        this.setAnimation(((EntityPrehistoricFloraLandCarnivoreBase)this).HURT_ANIMATION);
                    }
                    else if (this instanceof EntityPrehistoricFloraLandWadingBase) {
                        this.setAnimation(((EntityPrehistoricFloraLandWadingBase)this).HURT_ANIMATION);
                    }
                    else if (this instanceof EntityPrehistoricFloraPanguraptor) {
                        this.setAnimation(((EntityPrehistoricFloraPanguraptor)this).HURT_ANIMATION);
                    }
                    else if (this instanceof EntityPrehistoricFloraGuanlong) {
                        this.setAnimation(((EntityPrehistoricFloraGuanlong)this).HURT_ANIMATION);
                    }
                    else if (this instanceof EntityPrehistoricFloraProceratosaurus) {
                        this.setAnimation(((EntityPrehistoricFloraProceratosaurus)this).HURT_ANIMATION);
                    }
                    else {
                        this.setAnimation(ROAR_ANIMATION);
                    }
                }
            //}
        }
        if (this.isEntityInvulnerable(ds))
        {
            return false;
        }
        else
        {
            this.inPFLove = 0;
            Entity e = ds.getTrueSource();
            if (e instanceof EntityLivingBase) {
                List<EntityPrehistoricFloraAgeableBase> ageableBase = this.world.getEntitiesWithinAABB(this.getClass(), new AxisAlignedBB(this.getPosition().add(-this.getShoalDist(), -this.getShoalDist(), -this.getShoalDist()), this.getPosition().add(this.getShoalDist(), this.getShoalDist(), this.getShoalDist())));
                for (EntityPrehistoricFloraAgeableBase currentageableBase : ageableBase) {
                    currentageableBase.setShoalLeader(null);
                    currentageableBase.alarmCooldown = rand.nextInt(20) + 20;
                }
            }
            return super.attackEntityFrom(ds, i);
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

    @Nullable
    public EntityLivingBase getWarnTarget()
    {
        return this.warnTarget;
    }

    public void setWarnTarget(@Nullable EntityLivingBase entityLivingBase)
    {
        this.warnTarget = entityLivingBase;
    }

    @Nullable
    public EntityLivingBase getAvoidTarget()
    {
        return this.avoidTarget;
    }

    public void setAvoidTarget(@Nullable EntityLivingBase entityLivingBase)
    {
        this.avoidTarget = entityLivingBase;
    }

    @Nullable
    public EntityLiving getGrappleTarget()
    {
        return this.grappleTarget;
    }

    public void setGrappleTarget(@Nullable EntityLiving entityGrappleTarget)
    {
        this.grappleTarget = entityGrappleTarget;
    }

    public boolean panics() {
        return false;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (!world.isRemote) {
            double width = this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX;
            double depth = this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ;
            double height = this.getEntityBoundingBox().maxY - this.getEntityBoundingBox().minY;
            if (height <= 0.9375 && width <= 1.0 && depth <= 1.0) {
                if (!this.getJuvenile()) {
                    this.setJuvenile(true);
                }
            }
            else if (this.getJuvenile()) {
                this.setJuvenile(false);
            }
        }

        if (!world.isRemote) {
            if (this.getAttackTarget() != null) {
                if (this.getAttackTarget().isDead) {
                    this.setAttackTarget(null);
                }
                else if (this.getAttackTarget() instanceof EntityPlayer) {
                    if (((EntityPlayer)this.getAttackTarget()).isCreative()) {
                        this.setAttackTarget(null);
                    }
                }
            }
            if (this.getEatTarget() != null) {
                if (this.getEatTarget().isDead) {
                    this.setEatTarget(null);
                }
            }
            if (this.getWarnTarget() != null) {
                if (this.getWarnTarget().isDead) {
                    this.setWarnTarget(null);
                }
            }
            if (this.getWarnTarget() != null) {
                if (this.getWarnTarget().isDead) {
                    this.setWarnTarget(null);
                }
                else if (this.getWarnTarget() instanceof EntityPlayer) {
                    if (((EntityPlayer)this.getWarnTarget()).isCreative()) {
                        this.setWarnTarget(null);
                    }
                }
                if ((!(this.getWarnCooldown() > 0)) && this.getAttackTarget() == null) {
                    this.setWarnTarget(null);
                }
            }
            if (this.getRevengeTarget() != null) {
                if (this.getRevengeTarget().isDead) {
                    this.setRevengeTarget(null);
                }
                else if (this.getRevengeTarget() instanceof EntityPlayer) {
                    if (((EntityPlayer)this.getRevengeTarget()).isCreative()) {
                        this.setRevengeTarget(null);
                    }
                }
            }
            this.setIsFast(this.getAvoidTarget() != null || this.getAttackTarget() != null || this.getEatTarget() != null || (this.getRevengeTarget() != null & (this.panics() || this.sneakOnRevenge())) || (this.isBurning() & this.panics()));

            if (this.getSneakRange() > 0 && this.getIsFast()
                    && (this.getAttackTarget() != null || (this.getRevengeTarget() != null && this.sneakOnRevenge()))
                    && ((!this.getOneHit()) || this.sneakOnRevenge())
            ) {
                //If this is hunting and is not close enough, sneak up:

                float distEntity;
                if (this.getAttackTarget() != null) {
                    distEntity = this.getDistancePrey(this.getAttackTarget());
                }
                else {
                    distEntity = this.getDistancePrey(this.getRevengeTarget());
                }
                if (distEntity >= this.getUnSneakRange() && distEntity <= (this.getSneakRange())) {
                    this.setIsSneaking(true);
                }
                if (this.getIsSneaking() &&
                        (distEntity >= (this.getSneakRange() * 2.0D) + 2) || distEntity < this.getUnSneakRange()
                ) {
                    this.setIsSneaking(false);
                }
            }
            else {
                this.setIsSneaking(false);
            }

            if ((!this.getIsFast())
                    || (this.getAttackTarget() == this.getRevengeTarget() && !this.sneakOnRevenge())
                    || (this.getOneHit() && !this.sneakOnRevenge())
            ) {
                this.setIsSneaking(false);
            }

        }

        if (!this.isPFAdult())
        {
            this.inPFLove = 0;
        }

        if (this.inPFLove > 0)
        {
            --this.inPFLove;
        }

        if (this.getCanGrow() > 0)
        {
            this.setCanGrow(this.getCanGrow() - 1);
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
        }

        //Grapple with mates?
        if (rand.nextInt(this.grappleChance()) == 0) {
            //Are there any nearby to grapple with?
            this.findGrappleTarget();
        }

        if (this.willGrapple && this.getAnimation() == this.getGrappleAnimation() && this.getAnimationTick() == 5 && this.getGrappleTarget() != null) {
            this.faceEntity(this.getGrappleTarget(), 10, 10);
            launchGrapple();
            if (this.getOneHit()) {
                this.setGrappleTarget(null);
            }
        }

        if (this.homeCooldown > 0) {
            this.homeCooldown -= rand.nextInt(3) + 1;
        }
        if (this.homeCooldown < 0) {
            this.homeCooldown = 0;
        }

        if ((!this.world.isRemote) && this.getNestLocation() != null) {
            if (this.world.isBlockLoaded(this.getNestLocation())) {
                if (this.isMyNest(this.world, this.getNestLocation())) {
                    if (this.getNestLocation().distanceSq(this.posX, this.posY, this.posZ) <= 9) {
                        this.homeCooldown = 12000; //~5 game minutes of non-tethered movement (note the decrements are not in 1s)
                    }
                }
            }
        }
    }

    public float getDistancePrey(Entity entityIn)
    {
        double entityX = this.getEntityBoundingBox().minX + ((this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX)/2.0D);
        double entityZ = this.getEntityBoundingBox().minZ + ((this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ)/2.0D);
        double preyX = entityIn.getEntityBoundingBox().minX + ((entityIn.getEntityBoundingBox().maxX - entityIn.getEntityBoundingBox().minX)/2.0D);
        double preyZ = entityIn.getEntityBoundingBox().minZ + ((entityIn.getEntityBoundingBox().maxZ - entityIn.getEntityBoundingBox().minZ)/2.0D);

        float f = (float)(entityX - preyX);
        float f1 = (float)(this.posY - entityIn.posY);
        float f2 = (float)(entityZ - preyZ);
        return MathHelper.sqrt(f * f + f1 * f1 + f2 * f2);
    }

    public int grappleChance() {
        return 500;
    }

    public Animation getGrappleAnimation() {
        return this.ATTACK_ANIMATION;
    }

    @Nullable
    public boolean findGrappleTarget() {
        return false;
    }

    @Override
    public void playLivingSound() {
        if (this.getAnimation() == NO_ANIMATION && (!this.getIsSneaking())) {
            if (!this.world.isRemote) {
                if (this instanceof EntityPrehistoricFloraLandCarnivoreBase) {
                    this.setAnimation(EntityPrehistoricFloraLandCarnivoreBase.NOISE_ANIMATION);
                }
                else {
                    this.setAnimation(ROAR_ANIMATION);
                }
                super.playLivingSound();
            }
       }
    }

    @Nullable
    public SoundEvent getAmbientSoundPublic() {
        return this.getAmbientSound();
    }

    @Override
    protected float getSoundPitch()
    {
        float pitchAdder = (1F - this.getAgeScale()) * 300F * (this.getMaxWidth() - this.minWidth);
        return ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F) + 1.0F + pitchAdder;
    }

    public boolean isNearWater(INeedsWater entityIn, BlockPos pos) {
        if (!this.world.isBlockLoaded(this.getPosition())) {
            return true;
        }
        if (entityIn.safeDistanceToWater() == 0) {
            return true;
        }
        int distH = (int) entityIn.safeDistanceToWater();
        if (distH < 1) distH = 1;
        if (distH > 32) distH = 32;
        int distV = 4;
        boolean waterCriteria = false;
        int xct = -distH;
        int yct;
        int zct;
        while ((xct <= distH) && (!waterCriteria)) {
            yct = -distV;
            while ((yct <= distV) && (!waterCriteria)) {
                zct = -distH;
                while ((zct <= distH) && (!waterCriteria)) {
                    if (!this.world.isBlockLoaded(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))) {
                        waterCriteria = true;
                    }
                    else if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((this.world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
                        waterCriteria = true;
                    }
                    zct = zct + 1;
                }
                yct = yct + 1;
            }
            xct = xct + 1;
        }

        if (waterCriteria || (entityIn.safeDistanceToWater() == 0)) return true;

        return this.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    public int getAirSpecial()
    {
        return ((Integer)this.dataManager.get(AIR_SPECIAL)).intValue();
    }

    public void setAirSpecial(int airSpecial)
    {
        this.dataManager.set(AIR_SPECIAL, Integer.valueOf(airSpecial));
    }

    public void onEntityUpdate()
    {
        super.onEntityUpdate();

        if (this instanceof INeedsWater && !this.world.isRemote) {
            int i = this.getAirSpecial();
            if ((this.isEntityAlive() && !isInWater())
                    && (!isNearWater(((INeedsWater)this), this.getPosition()) && ((INeedsWater)this).takesDamageAwayFromWater()) //Is not NEAR water
            )
            {
                --i;
                this.setAirSpecial(i);

                if (this.getAirSpecial() == -20)
                {
                    this.setAirSpecial(200);
                    this.attackEntityFrom(DamageSource.DROWN, 0.5F);
                }
            }
            else
            {
                this.setAirSpecial(1000);
            }
        }

        if (this.alarmTarget != null)
        {
            if (this.ticksExisted - this.alarmTimer > 100)
            {
                this.setAlarmTarget((EntityLivingBase)null);
            }
        }

        if (this.getAttackTarget() != null) {
            if (this.getAttackTarget() instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) this.getAttackTarget();
                if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL || player.isCreative()) {
                    this.setAttackTarget(null);
                }
                if (player.capabilities.disableDamage) {
                    this.setAttackTarget(null);
                }
                if (player.isInvisible()) {
                    this.setAttackTarget(null);
                }
            }
        }

        if (!world.isRemote) {
            // Do every 120 seconds provided we're not trying to lay eggs,
            // as the AI searches directly in that case.
            // Colliding with a nest triggers a findNest anyway
            if (!this.getLaying()
                    && ((double) this.getTicks() / 2400D == (int) Math.round((double) this.getTicks() / 2400D))) {
                @Nullable BlockPos pos = this.getNestLocation();
                if (pos == null) {
                    this.setNestLocation(this.findNest(this, 2, false));
                } else {
                    if (!world.isBlockLoaded(pos)) {
                        this.setNestLocation(this.findNest(this, 2, false));
                    }
                    else if (!isHomeableNest(world, pos)) {
                        this.setNestLocation(this.findNest(this, 2, false));
                    }
                }
            }
        }

        //General ticker (for babies etc.)
        int ii = this.getTicks();
        if (this.isEntityAlive() && !this.world.isRemote)
        {
            ++ii;
            //if (!LepidodendronConfig.doMultiplyMobs) {
            //    if (ii <= 10 && ii > 0) {
                    //Don't use this ticker if multiplication is off, unless we are over breeding limit:
                    //this ticker is set to 24000 by some AI, so we do want it to run up at that level sometimes
            //        ii = 0;
            //     }
            //}
            //limit at 24000 + 6000 (one MC day plus 5 minutes) and then reset:
            if (ii >= 30000) {ii = 0;}
            this.setTicks(ii);
        }

        if (this.alarmCooldown > 0) {
            this.alarmCooldown --;
        }

//        if (this.warnCooldown > 0) {
//            this.warnCooldown --;
//        }

//        if ((!world.isRemote) && this.getAttackTarget() != null) {
//            this.faceEntity(this.getAttackTarget(), 10, 10);
//        }
//        if ((!world.isRemote) && this.getRevengeTarget() != null) {
//            this.faceEntity(this.getRevengeTarget(), 10, 10);
//        }

        if (this.getWarnTarget() != null && (!world.isRemote) && this.getAttackTarget() == null) {
            if (this.warnCooldown > 0) {
                this.warnCooldown --;
            }
            this.faceEntity(this.getWarnTarget(), 10, 10);
            //this.getLookHelper().setLookPosition(this.getWarnTarget().posX, this.getWarnTarget().posY + (double)this.getWarnTarget().getEyeHeight(), this.getWarnTarget().posZ, (float)this.getHorizontalFaceSpeed(), (float)this.getVerticalFaceSpeed());
            this.getLookHelper().setLookPositionWithEntity(this.getWarnTarget(), 10.0F, (float)this.getVerticalFaceSpeed());
            //this.getNavigator().tryMoveToEntityLiving(this.closestLivingEntity, 1);
            if (this.getWarnCooldown() == 1) {
                if (this.getDistance(this.getWarnTarget()) <= this.warnDistance()) {
                    if (this instanceof IWarnOnly) { //They do nothing
                        this.setWarnTarget(null);
                        this.setWarnCooldown(0);
                    }
                    else if (this instanceof IBluffer) { //They panic instead
                        this.setRevengeTarget(this.getWarnTarget());
                        this.setWarnCooldown(0);
                    }
                    else { //They attack
                        this.setAttackTarget(this.getWarnTarget());
                        this.setOneHit(true);
                        this.setWarnCooldown(0);
                    }
                }
                else {
                    this.setWarnTarget(null);
                    this.setWarnCooldown(0);
                }
            }
        }

        if (this.getAttackTarget() != null) {
            if (this.getAttackTarget() == this.getWarnTarget() && this.getDistance(this.getAttackTarget()) >= this.warnDistance()) {
                this.setAttackTarget(null);
                this.setWarnTarget(null);
            }
        }

        if (LepidodendronConfig.doShoalingFlocking && this.canShoal() && !world.isRemote) {
            double factor = LepidodendronConfig.doShoalingFlockingFactor;
            if (factor > 100) {
                factor = 100;
            }
            if (factor > 0) {
                if (((double) ii / Math.round((float)this.getShoalInterval() / factor)) == Math.round((double) ii / Math.round((float)this.getShoalInterval() / factor))) {
                    ShoalingHelper.updateShoalAgeableBase(this);
                }
            }
        }

        //if (world.isRemote) {
        //this.setScaleForAge(false);
        //}
        if (this.getGrowingAge() < 0) {
            this.setGrowingAge(0); //Resetting vanilla methods which we don't use
        }

        //Ageing routine, every 100 ticks (once per five seconds)
        int i = this.getAgeTicks();
        boolean didAge = false;
        //Do not grow entities which are in cages, etc:
        Block blockIn = world.getBlockState(this.getPosition()).getBlock();
        boolean wasAlreadyAdult = i >= this.getAdultAge();
        if (this.isEntityAlive()
                && blockIn != BlockCageSmall.block
                && blockIn != BlockGlassJar.block
                && blockIn != BlockTrapAirTop.block
                && blockIn != BlockTrapGround.block
                && blockIn != BlockTrapWater.block
                && (!this.world.isRemote)
                && this.getTicks() % 100 == 0)
        {
            i = i + 100;
            //throttle at limit:
            if (i > this.getAdultAge()) {
                i = this.getAdultAge();
            }
            this.setAgeTicks(i);
            didAge = true;
        }

        if (didAge && !wasAlreadyAdult) {
            //Age the mob:
            this.setScaleForAge(false);
            //Check for collisions:
            BlockPos n = new BlockPos(this.posX, this.posY, this.posZ - (this.width/2));
            BlockPos e = new BlockPos(this.posX + (this.width/2), this.posY, this.posZ);
            BlockPos s = new BlockPos(this.posX, this.posY, this.posZ + (this.width/2));
            BlockPos w = new BlockPos(this.posX - (this.width/2), this.posY, this.posZ);
            BlockPos ne = new BlockPos(this.posX + (this.width/2), this.posY, this.posZ - (this.width/2));
            BlockPos nw = new BlockPos(this.posX - (this.width/2), this.posY, this.posZ - (this.width/2));
            BlockPos se = new BlockPos(this.posX + (this.width/2), this.posY, this.posZ + (this.width/2));
            BlockPos sw = new BlockPos(this.posX - (this.width/2), this.posY, this.posZ + (this.width/2));
            if (this.isEntityInsideOpaqueBlock()
                    || world.getBlockState(n).causesSuffocation()
                    || world.getBlockState(e).causesSuffocation()
                    || world.getBlockState(s).causesSuffocation()
                    || world.getBlockState(w).causesSuffocation()
                    || world.getBlockState(ne).causesSuffocation()
                    || world.getBlockState(nw).causesSuffocation()
                    || world.getBlockState(se).causesSuffocation()
                    || world.getBlockState(sw).causesSuffocation()
            ) {
                //Move the mob out from its collision if possible:
                //Check each vertex:
                boolean nClear = false;
                boolean eClear = false;
                boolean sClear = false;
                boolean wClear = false;
                boolean neClear = false;
                boolean nwClear = false;
                boolean seClear = false;
                boolean swClear = false;
                if (!world.getBlockState(n).causesSuffocation()) {
                    nClear = true;
                }
                if (!world.getBlockState(e).causesSuffocation()) {
                    eClear = true;
                }
                if (!world.getBlockState(s).causesSuffocation()) {
                    sClear = true;
                }
                if (!world.getBlockState(w).causesSuffocation()) {
                    wClear = true;
                }
                if (!world.getBlockState(ne).causesSuffocation()) {
                    neClear = true;
                }
                if (!world.getBlockState(nw).causesSuffocation()) {
                    nwClear = true;
                }
                if (!world.getBlockState(se).causesSuffocation()) {
                    seClear = true;
                }
                if (!world.getBlockState(sw).causesSuffocation()) {
                    swClear = true;
                }
                if (neClear || nwClear || seClear || swClear || nClear|| eClear|| sClear|| wClear) {
                    boolean moved = false;
                    while (!moved) {
                        int m = getRNG().nextInt(8);
                        switch (m) {
                            case 0: default:
                                if (neClear) {
                                    this.setLocationAndAngles(this.posX + (rand.nextFloat()/10.0F), ne.getY(), this.posZ - (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 1:
                                if (nwClear) {
                                    this.setLocationAndAngles(this.posX - (rand.nextFloat()/10.0F), nw.getY(), this.posZ - (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 2:
                                if (seClear) {
                                    this.setLocationAndAngles(this.posX + (rand.nextFloat()/10.0F), se.getY(), this.posZ + (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 3:
                                if (swClear) {
                                    this.setLocationAndAngles(this.posX - (rand.nextFloat()/10.0F), sw.getY(), this.posZ + (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 4:
                                if (nClear) {
                                    this.setLocationAndAngles(this.posX, n.getY(), this.posZ - (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 5:
                                if (eClear) {
                                    this.setLocationAndAngles(this.posX + (rand.nextFloat()/10.0F), e.getY(), this.posZ, this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 6:
                                if (sClear) {
                                    this.setLocationAndAngles(this.posX, s.getY(), this.posZ + (rand.nextFloat()/10.0F), this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                            case 7:
                                if (wClear) {
                                    this.setLocationAndAngles(this.posX - (rand.nextFloat()/10.0F), w.getY(), this.posZ, this.rotationYaw, this.rotationPitch);
                                    moved = true;
                                }
                                break;

                        }
                    }
                }
            }
        }

        double oldHealthMax = this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
        float oldHealth = this.getHealth();
        //System.err.println("Old Max Health: " + oldHealthMax);
        //System.err.println("Old Health: " + oldHealth);

        float oldHealthRatio = (float) (oldHealth / (float) oldHealthMax);
        //System.err.println("Old Health Ratio: " + oldHealthRatio);

        double newHealthMax = (double) (getMaxHealthAgeable() * getAgeScale());
        newHealthMax = Math.min((Math.round((newHealthMax * 2D)))/2D, getMaxHealthAgeable());
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(newHealthMax);

        float newHealth = (float) newHealthMax * oldHealthRatio;
        newHealth = (Math.round((newHealth * 2F)))/2.0F;
        newHealth = Math.min(newHealth,(float)newHealthMax);
        this.setHealth(newHealth);
        //System.err.println("New Health Max: " + newHealthMax);
        //System.err.println("New Health: " + newHealth);

        double aHealth = (double) LepidodendronConfig.attackHealth;
        if (aHealth > 100) {aHealth = 100;}
        if (aHealth < 0) {aHealth = 0;}
        aHealth = aHealth/100D;
        EntityLivingBase attackTarget = this.getAttackTarget();
        if (attackTarget != null ) {
            if (attackTarget instanceof EntityPlayer && LepidodendronConfig.attackPlayerAlways) {
                this.setWillHunt(true);
            }
            else if (attackTarget instanceof EntityPlayer && this.getWarnTarget() == attackTarget) {
                this.setWillHunt(true);
            }
            else {
                this.setWillHunt(oldHealthRatio <= (float) aHealth);
            }
        }
        else {
            this.setWillHunt(oldHealthRatio <= (float) aHealth);
        }
        double adult = (double) LepidodendronConfig.adultAge;
        if (adult > 100) {adult = 100;}
        if (adult < 0) {adult = 0;}
        adult = adult/100D;
        if (getAgeScale() < adult) {
            setWillHunt(false);
        }

        //Drop an egg perhaps:
        if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && this.getLaying()) {
            //if (Math.random() > 0.5) {
                ItemStack itemstack = getPropagule();
                if (!itemstack.hasTagCompound()) {
                    itemstack.setTagCompound(new NBTTagCompound());
                }
                itemstack.getTagCompound().setString("creature", getEntityId(this));
                EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
                entityToSpawn.setPickupDelay(10);
                this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                world.spawnEntity(entityToSpawn);
                this.setLaying(false);
            //}
            this.setTicks(0);
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
                    if (this.placesNest() && nestPos != null ) {
                        world.setBlockState(nestPos, BlockNest.block.getDefaultState(), 3);
                        TileEntity te = world.getTileEntity(nestPos);
                        if (te != null) {
                            te.getTileData().setString("creature", getEntityId(this));
                            te.getTileData().setBoolean("isMound", this.isNestMound());
                        }
                    }
                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                    TileEntity te = world.getTileEntity(nestPos);
                    if (te != null) {
                        if (te instanceof BlockNest.TileEntityNest) {
                            te.getTileData().setString("creature", getEntityId(this));
                            ItemStack stack = BlockNest.BlockCustom.getEggItemStack(getEntityId(this));
                            stack.setCount(1);
                            ((BlockNest.TileEntityNest) te).setInventorySlotContents((int) (0), stack);
                        }
                        else { //It must be moss or wood:
                            te.getTileData().setString("creature", getEntityId(this));
                        }
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
                //Is stationary for egg-laying and this is a rotten-log lay
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

    public boolean testLay(World world, BlockPos pos) {
        return false;
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
                //System.err.println("setting attack anim");
                this.setAnimation(ATTACK_ANIMATION);
                //if (this.getAnimation() == ATTACK_ANIMATION && !world.isRemote) {
                    //System.err.println("is attacking");
                //}
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public void travel(float strafe, float vertical, float forward)
    {
        if (this.isServerWorld() || this.canPassengerSteer())
        {
            if (!this.isInWater())
            {
                if (!this.isInLava())
                {
                    float f6 = 0.91F;
                    BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);

                    if (this.onGround)
                    {
                        IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos);
                        f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
                    }

                    float f7 = 0.16277136F / (f6 * f6 * f6);
                    float f8;

                    if (this.onGround)
                    {
                        f8 = this.getAIMoveSpeed() * f7;
                    }
                    else
                    {
                        f8 = this.jumpMovementFactor;
                    }

                    this.moveRelative(strafe, vertical, forward, f8);
                    f6 = 0.91F;

                    if (this.onGround)
                    {
                        IBlockState underState = this.world.getBlockState(blockpos$pooledmutableblockpos.setPos(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ));
                        f6 = underState.getBlock().getSlipperiness(underState, this.world, blockpos$pooledmutableblockpos, this) * 0.91F;
                    }

                    if (this.isOnLadder())
                    {
                        float f9 = 0.15F;
                        this.motionX = MathHelper.clamp(this.motionX, -0.15000000596046448D, 0.15000000596046448D);
                        this.motionZ = MathHelper.clamp(this.motionZ, -0.15000000596046448D, 0.15000000596046448D);
                        this.fallDistance = 0.0F;

                        if (this.motionY < -0.15D)
                        {
                            this.motionY = -0.15D;
                        }

                    }

                    this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

                    if (this.motionX != 0 || this.motionZ != 0 ) {
                        this.setIsMoving(true);
                    }
                    else {
                        this.setIsMoving(false);
                    }

                    if (this.collidedHorizontally && this.isOnLadder())
                    {
                        this.motionY = 0.2D;
                    }

                    if (this.isPotionActive(MobEffects.LEVITATION))
                    {
                        this.motionY += (0.05D * (double)(this.getActivePotionEffect(MobEffects.LEVITATION).getAmplifier() + 1) - this.motionY) * 0.2D;
                    }
                    else
                    {
                        blockpos$pooledmutableblockpos.setPos(this.posX, 0.0D, this.posZ);

                        if (!this.world.isRemote || this.world.isBlockLoaded(blockpos$pooledmutableblockpos) && this.world.getChunk(blockpos$pooledmutableblockpos).isLoaded())
                        {
                            if (!this.hasNoGravity())
                            {
                                this.motionY -= 0.08D;
                            }
                        }
                        else if (this.posY > 0.0D)
                        {
                            this.motionY = -0.1D;
                        }
                        else
                        {
                            this.motionY = 0.0D;
                        }
                    }

                    this.motionY *= 0.9800000190734863D;
                    this.motionX *= (double)f6;
                    this.motionZ *= (double)f6;
                    blockpos$pooledmutableblockpos.release();

                }
                else
                {
                    double d4 = this.posY;
                    this.moveRelative(strafe, vertical, forward, 0.02F);
                    this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

                    this.motionX *= 0.5D;
                    this.motionY *= 0.5D;
                    this.motionZ *= 0.5D;

                    if (!this.hasNoGravity())
                    {
                        this.motionY -= 0.02D;
                    }

                    if (this.collidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d4, this.motionZ))
                    {
                        this.motionY = 0.30000001192092896D;
                    }
                }
            }
            else
            {
                double d0 = this.posY;
                float f1 = this.getWaterSlowDown();
                float f2 = 0.02F;
                float f3 = (float) EnchantmentHelper.getDepthStriderModifier(this);

                if (f3 > 3.0F)
                {
                    f3 = 3.0F;
                }

                if (!this.onGround)
                {
                    f3 *= 0.5F;
                }

                if (f3 > 0.0F)
                {
                    f1 += (0.54600006F - f1) * f3 / 3.0F;
                    f2 += (this.getAIMoveSpeed() - f2) * f3 / 3.0F;
                }

                this.moveRelative(strafe, vertical, forward, f2);
                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

                this.motionX *= (double)f1;
                this.motionY *= 0.800000011920929D;
                this.motionZ *= (double)f1;

                if (!this.hasNoGravity())
                {
                    this.motionY -= 0.02D;
                }

                if (this.collidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d0, this.motionZ))
                {
                    this.motionY = 0.30000001192092896D;
                }
            }
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double d5 = this.posX - this.prevPosX;
        double d7 = this.posZ - this.prevPosZ;
        double d9 = this instanceof net.minecraft.entity.passive.EntityFlying ? this.posY - this.prevPosY : 0.0D;
        float f10 = MathHelper.sqrt(d5 * d5 + d9 * d9 + d7 * d7) * 4.0F;

        if (f10 > 1.0F)
        {
            f10 = 1.0F;
        }

        this.limbSwingAmount += (f10 - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;

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

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!itemstack.isEmpty())
        {
            if (this.isBreedingItem(itemstack) && this.isPFAdult() && this.inPFLove <= 0 && this.getMateable() == 0)
            {
                boolean canBreed = true;
                if (this instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
                    canBreed = !((EntityPrehistoricFloraLandClimbingFlyingWalkingBase)this).isFlying();
                }
                if (canBreed) {
                    this.consumeItemFromStack(player, itemstack);
                    this.inPFLove = 600;
                    this.world.setEntityState(this, (byte) 18);
                    return true;
                }
            }
            if (this.isBreedingItem(itemstack) && (!this.isPFAdult()) && this.getCanGrow() <= 0) {
                if (!this.world.isRemote) {
                    this.consumeItemFromStack(player, itemstack);
                    this.setCanGrow(2400);
                    this.setAgeTicks(Math.min(this.getAdultAge(), this.getAgeTicks() + 6000));
                }
                if (world.isRemote) {
                    this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
                }
                return true;
            }
            if (this.isPFAdult() && itemstack.getItem() == ItemNesting.block) {
                //Prompt to create a nest:
                //Does this mob have nests like this and is it OK to do this now?
                if (this.hasNest() && (!this.isNestMound()) && (!this.placesNest()) && this.getAnimation() == this.NO_ANIMATION && this.getAttackTarget() == null && this.getEatTarget() == null) {
                    //Does the mob already have a nest?
                    boolean newNest = false;
                    if (this.getNestLocation() != null) {
                        if (!world.isBlockLoaded(this.getNestLocation())) {
                            this.setNestLocation(null);
                            newNest = true;
                        }
                        else {
                            TileEntity te = world.getTileEntity(this.getNestLocation());
                            if (te instanceof BlockNest.TileEntityNest) {
                                BlockNest.TileEntityNest tileNest = (BlockNest.TileEntityNest) te;
                                if (!tileNest.getStackInSlot(0).isEmpty()) {
                                    newNest = true;
                                }
                            }
                        }
                    }
                    if (this.getNestLocation() == null) {
                        //Can we make a nest in this exact spot?
                        if (this instanceof EntityPrehistoricFloraDiictodon) { //Burrowing creatures:
                            if (this.getPosition().getY() > 8) {
                                this.setAnimation(MAKE_NEST_ANIMATION);
                                player.swingArm(hand);
                                this.consumeItemFromStack(player, itemstack);
                                if (world.isRemote) {
                                    this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
                                }
                                if (newNest) {
                                    this.setNestLocation(null);
                                }
                                return true;
                            }
                        }
                        else if (this instanceof EntityPrehistoricFloraHaldanodon) { //Burrowing creatures:
                            if (this.getPosition().getY() > 8) {
                                this.setAnimation(MAKE_NEST_ANIMATION);
                                player.swingArm(hand);
                                this.consumeItemFromStack(player, itemstack);
                                if (world.isRemote) {
                                    this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
                                }
                                if (newNest) {
                                    this.setNestLocation(null);
                                }
                                return true;
                            }
                        }
                        else if (BlockNest.block.canPlaceBlockAt(this.world, this.getPosition())) {
                            this.setAnimation(MAKE_NEST_ANIMATION);
                            player.swingArm(hand);
                            this.consumeItemFromStack(player, itemstack);
                            if (world.isRemote) {
                                this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
                            }
                            if (newNest) {
                                this.setNestLocation(null);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    private void spawnParticles(EnumParticleTypes particleType)
    {
        for (int i = 0; i < 5; ++i)
        {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 1.0D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2);
        }
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

}
