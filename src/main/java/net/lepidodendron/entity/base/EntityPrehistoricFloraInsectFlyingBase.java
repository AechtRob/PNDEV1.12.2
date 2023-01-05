package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockMobSpawn;
import net.lepidodendron.entity.ai.EntityMateAIInsectFlyingBase;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
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
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class EntityPrehistoricFloraInsectFlyingBase extends EntityTameable implements IAnimatedEntity {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraInsectFlyingBase.class, DataSerializers.VARINT);

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraInsectFlyingBase.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraInsectFlyingBase.class, DataSerializers.OPTIONAL_BLOCK_POS);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraInsectFlyingBase.class, DataSerializers.FACING);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraInsectFlyingBase.class, DataSerializers.VARINT);
    public int sitCooldown = 0;
    public int sitTickCt = 0;
    public float flyProgress;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    private EntityItem eatTarget;
    public Animation ATTACK_ANIMATION;
    public Animation LAY_ANIMATION;
    private int inPFLove;
    private boolean laying;

    public EntityPrehistoricFloraInsectFlyingBase(World world) {
        super(world);
        //this.spawnableBlock = Blocks.WATER;
        this.moveHelper = new EntityPrehistoricFloraInsectFlyingBase.FlightMoveHelper(this);
        this.navigator = new PathNavigateFlyingNoWater(this, world);
        this.getNavigator().getNodeProcessor().setCanSwim(false);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        ATTACK_ANIMATION = Animation.create(this.getAttackLength());
        LAY_ANIMATION = Animation.create(this.getLayLength());
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        int i = (int) Math.round(this.getMaxHealth()/4D);
        if (i < 1) {
            return 0;
        }
        return this.world.rand.nextInt(i);
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_terrestrial.name");
    }

    public static String getPeriod() {
        return "undefined";
    }

    public int getLayLength() {
        return 50;
    } //Do not change this


    public boolean canJar() {
        return false;
    }

    public int getAttackLength() {
        return 0;
    }

    public abstract boolean laysEggs();

    public abstract boolean dropsEggs();

    public abstract IBlockState getEggBlockState();

    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
        this.dataManager.register(TICKS, rand.nextInt(24000));
        this.dataManager.register(MATEABLE, 0);
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

    @Override
    public boolean isSitting() {
        if (world.isRemote) {
            boolean isSitting = this.dataManager.get(SITTING);
            if ((isSitting != this.isSitting)) {
                ticksSitted = 0;
            }
            this.isSitting = isSitting;
            return isSitting;
        }

        return isSitting;
    }

    @Override
    public void setSitting(boolean sitting) {
        this.dataManager.set(SITTING, sitting);
        if (!world.isRemote) {
            this.isSitting = sitting;
        }
    }

    public static BlockPos getPositionRelativetoGround(Entity entity, World world, double x, double z, Random rand) {
        BlockPos pos = new BlockPos(x, entity.posY, z);
        while ((world.getBlockState(pos.down()).getMaterial() != Material.WATER) && (world.getBlockState(pos.down()).getMaterial() != Material.LAVA) && world.isAirBlock(pos.down()) && pos.getY() > 0) {
            pos = pos.down();
        }
        return pos.up(2 + rand.nextInt(3));
    }

    @Override
    public boolean isMovementBlocked() {
        return isSitting();
    }

    public boolean isMovementBlockedSoft() {
        return isMovementBlocked() ;
    }

    public int getTicks() {
       return this.dataManager.get(TICKS);
    }

    public void setTicks(int ticks) {
        this.dataManager.set(TICKS, ticks);
    }

    public boolean getCanBreed() {
        return this.getTicks() > 24000; //If the mob has done not bred for a MC day
    }

    public String tagEgg () {return "";}

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.dataManager.set(SIT_FACE, EnumFacing.byIndex(compound.getByte("SitFace")));
        this.sitCooldown = compound.getInteger("SitCooldown");
        this.sitTickCt = compound.getInteger("SitTickCt");
        if (compound.hasKey("PosX")) {
            int i = compound.getInteger("PosX");
            int j = compound.getInteger("PosY");
            int k = compound.getInteger("PosZ");
            this.dataManager.set(SIT_BLOCK_POS, Optional.of(new BlockPos(i, j, k)));
        } else {
            this.dataManager.set(SIT_BLOCK_POS, Optional.absent());
        }
        this.setTicks(compound.getInteger("Ticks"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.laying = compound.getBoolean("laying");
        this.setMateable(compound.getInteger("mateable"));
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("Sitting", this.isSitting);
        compound.setByte("SitFace", (byte) this.dataManager.get(SIT_FACE).getIndex());
        BlockPos blockpos = this.getAttachmentPos();
        compound.setInteger("SitCooldown", sitCooldown);
        compound.setInteger("SitTickCt", sitTickCt);
        if (blockpos != null) {
            compound.setInteger("PosX", blockpos.getX());
            compound.setInteger("PosY", blockpos.getY());
            compound.setInteger("PosZ", blockpos.getZ());
        }
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setBoolean("laying", this.laying);
        compound.setInteger("mateable", this.getMateable());
    }

    //@Override
    //protected void updateAITasks()
    //{
    //    this.inPFLove = 0;
    //    super.updateAITasks();
    //}

    public EnumFacing getAttachmentFacing() {
        return this.dataManager.get(SIT_FACE);
    }

    @Nullable
    public BlockPos getAttachmentPos() {
        return (BlockPos) ((Optional) this.dataManager.get(SIT_BLOCK_POS)).orNull();
    }

    public void setAttachmentPos(@Nullable BlockPos pos) {
        this.dataManager.set(SIT_BLOCK_POS, Optional.fromNullable(pos));
    }

    private Animation animation = NO_ANIMATION;

    public static final Animation ANIMATION_WANDER = Animation.create(20);

    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityMateAIInsectFlyingBase(this, 1.0D));
        this.tasks.addTask(1, new AIWanderInsect());
        this.tasks.addTask(2, new EntityAILookIdle(this));
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return (
            (OreDictionary.containsMatch(false, OreDictionary.getOres("plant"), stack))
        );
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

    @Override
    public boolean attackEntityFrom(DamageSource ds, float f) {
        if (ds == DamageSource.IN_WALL) {
            return false;
        }
        if (ds == DamageSource.FALL) {
            return false;
        }
        this.sitTickCt = 0;
        this.inPFLove = 0;
        sitCooldown = 1500 + rand.nextInt(1200);
        this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
        this.setAttachmentPos(null);
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

    public boolean isNotColliding() {
        return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
    }

    @Override
    public int getTalkInterval() {
        return 120;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    public void setNavigator() {
        this.moveHelper = new FlightMoveHelper(this);
        this.navigator = new PathNavigateFlyingNoWater(this, world);
    }

    public boolean spaceCheckEggs() {
        int xct;
        int yct;
        int zct;
        yct = -4;
        while (yct <= 4) {
            xct = -4;
            while (xct <= 4) {
                zct = -4;
                while (zct <= 4) {
                    if (world.getBlockState(this.getPosition().add(xct, yct, zct)).getBlock() instanceof BlockMobSpawn) {
                        return false;
                    }
                    zct += 1;
                }
                xct += 1;
            }
            yct += 1;
        }
        return true;
    }

    protected void setSizer(float width, float height)
    {
        if (width != this.width || height != this.height)
        {
            float f = this.width;
            this.width = width;
            this.height = height;
            if (this.width < f) {
                double d0 = (double) width / 2.0D;
                this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
            }
        }
    }

    public boolean laysInBlock() {
        return false;
    }

    public void onEntityUpdate()
    {
        super.onEntityUpdate();

        if (this.getAttackTarget() != null) {
            if (this.getAttackTarget() instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) this.getAttackTarget();
                if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL || player.isCreative()) {
                    this.setAttackTarget(null);
                }
            }
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

        //Drop an egg perhaps:
        if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())) {
            if (Math.random() > 0.5) {
                ItemStack itemstack = new ItemStack(ItemUnknownEgg.block, (int) (1));
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

        //Lay eggs perhaps:
        if (!this.laysInBlock()) { //lays into water of something like that:
            if (!world.isRemote && this.laysEggs() && ((this.getCanBreed() && LepidodendronConfig.doMultiplyMobs) || this.getLaying())
            ) {
                if (spaceCheckEggs() && canPlaceSpawn(world, this.getPosition())) {
                    //Is stationary for egg-laying:
                    IBlockState eggs = getEggBlockState();
                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                    world.setBlockState(this.getPosition(), eggs);
                    this.setLaying(false);
                    this.setTicks(0);
                } else {
                    if (spaceCheckEggs() && canPlaceSpawn(world, this.getPosition().down())) {
                        //Is stationary for egg-laying:
                        IBlockState eggs = getEggBlockState();
                        this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                        world.setBlockState(this.getPosition().down(), eggs);
                        this.setLaying(false);
                        this.setTicks(0);
                    } else {
                        if (spaceCheckEggs() && canPlaceSpawn(world, this.getPosition().down(2))) {
                            //Is stationary for egg-laying:
                            IBlockState eggs = getEggBlockState();
                            this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                            world.setBlockState(this.getPosition().down(2), eggs);
                            this.setLaying(false);
                            this.setTicks(0);
                        }
                    }
                }
            }
        }
        else { //Lays with nbt into moss etc.
            if (!world.isRemote && this.laysEggs() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())
            ) {
                if ((this.testLay(world, this.getPosition()) || this.testLay(world, this.getPosition().down())) && this.getTicks() > 0
                ) {
                    if (Math.random() > 0.5) {
                        this.setTicks(-50); //Flag this as stationary for egg-laying
                        this.setAnimation(LAY_ANIMATION);
                    }
                }
                if ((this.testLay(world, this.getPosition()) || this.testLay(world, this.getPosition().down())) && this.getTicks() > -30 && this.getTicks() < 0) {
                    //Is stationary for egg-laying:
                    //System.err.println("Laying an egg in it");

                    String stringEgg = LepidodendronMod.MODID + ":" + this.tagEgg();
                    //this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                    if (this.testLay(world, this.getPosition())) {
                        this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                        TileEntity te = world.getTileEntity(this.getPosition());
                        if (te != null) {
                            te.getTileData().setString("egg", stringEgg);
                        }
                        IBlockState state = world.getBlockState(this.getPosition());
                        this.setLaying(false);
                        world.notifyBlockUpdate(this.getPosition(), state, state, 3);
                    } else if (this.testLay(world, this.getPosition().down())) {
                        this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                        TileEntity te = world.getTileEntity(this.getPosition().down());
                        if (te != null) {
                            te.getTileData().setString("egg", stringEgg);
                        }
                        IBlockState state = world.getBlockState(this.getPosition().down());
                        this.setLaying(false);
                        world.notifyBlockUpdate(this.getPosition().down(), state, state, 3);
                    }
                    this.setTicks(0);
                }
            }
        }

        if (this.getHealth() <= 0) {
            this.motionX = 0;
            this.motionY = 0;
            this.motionZ = 0;
        }
    }

    public boolean testLay(World world, BlockPos pos) {
        return false;
    }

    public boolean canPlaceSpawn(World worldIn, BlockPos pos) {
        return (isWaterBlock(worldIn, pos) && isWaterBlock(worldIn, pos.up())
            && worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
            && worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos));
    }

    public boolean isWaterBlock(World world, BlockPos pos) {
        if (world.getBlockState(pos).getMaterial() == Material.WATER) {
            return true;
        }
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
                //this.setAnimation(ATTACK_ANIMATION);
                this.setAnimation(ATTACK_ANIMATION);
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
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
        super.onLivingUpdate();

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

        if (this.isSitting()) {
            ticksSitted++;
        }
        if (!world.isRemote && !this.isInWater() && !this.isBeingRidden() && !this.isSitting() && this.getRNG().nextInt(1000) == 1 && (this.getAnimation() == NO_ANIMATION)) {
            this.setSitting(true);
            ticksSitted = 0;
        }

        if (!world.isRemote && !this.isInWater() && (this.isSitting() && ticksSitted > 100 && this.getRNG().nextInt(100) == 1)) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        if (this.isInWater()) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        boolean flying = isFlying();
        if (sitCooldown > 0) {
            sitCooldown--;
        }

        if (this.getAttachmentPos() == null) {
            sitTickCt = 0;
            if (collided && sitCooldown == 0 && !onGround){
                sitCooldown = 5;
                Vec3d vec3d = this.getPositionEyes(0);
                Vec3d vec3d1 = this.getLook(0);
                Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
                RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
                if (rayTrace != null && rayTrace.hitVec != null) {
                    BlockPos sidePos = rayTrace.getBlockPos();
                    if(world.isSideSolid(sidePos, rayTrace.sideHit)){
                        this.setAttachmentPos(sidePos);
                        this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                        this.motionX = 0.0D;
                        this.motionY = 0.0D;
                        this.motionZ = 0.0D;
                    }
                }
            }
        } else {
            BlockPos pos = this.getAttachmentPos();
            if (world.isSideSolid(pos, this.getAttachmentFacing())) {
                sitTickCt++;
                sitCooldown = 150;
                this.renderYawOffset = 180.0F;
                this.prevRenderYawOffset = 180.0F;
                this.rotationYaw = 180.0F;
                this.prevRotationYaw = 180.0F;
                this.rotationYawHead = 180.0F;
                this.prevRotationYawHead = 180.0F;
                this.moveHelper.action = EntityMoveHelper.Action.WAIT;
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            } else {
                this.sitTickCt = 0;
                this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
                this.setAttachmentPos(null);
            }
        }
        if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0 || this.getAttachmentPos() != null && (this.getAttackTarget() != null || this.getEatTarget() != null)) {
            this.sitTickCt = 0;
            sitCooldown = this.sitCooldownSetter();
            this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
            this.setAttachmentPos(null);
        }
        if (flying && flyProgress < 20.0F) {
            flyProgress += 0.5F;
            if (sitProgress != 0)
                sitProgress = 0F;
        } else if (!flying && flyProgress > 0.0F) {
            flyProgress -= 0.5F;
            if (sitProgress != 0)
                sitProgress = 0F;
        }

        if (!this.isMovementBlockedSoft() && this.getAttachmentPos() == null) {
            //Entity eatTarget = this.getEatTarget();
            //if (eatTarget != null) {
            //    if (eatTarget.posY > this.posZ) {
            //        this.motionY += 0.08D;
            //    }
            //}
            //else {
                this.motionY += 0.08D;
            //}
        } else {
            this.moveHelper.action = EntityMoveHelper.Action.WAIT;
        }
        if (flying && this.ticksExisted % 20 == 0 && !world.isRemote && this.getAttachmentPos() == null && this.FlightSound() != null) {
            this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
                    .getObject(this.FlightSound()), this.getSoundVolume(), 1);
        }

    }

    public int sitTickCtMax() {
        return 1150;
    }

    public int sitCooldownSetter() {
        return 1000 + rand.nextInt(1500);
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

    @Nullable
    public EntityItem getEatTarget() {
        return this.eatTarget;
    }

    public void setEatTarget(@Nullable EntityItem entityItem) {
        this.eatTarget = entityItem;
        //net.minecraftforge.common.ForgeHooks.onLivingSetAttackTarget(this, entityItem);
    }

    public ResourceLocation FlightSound() {
        return new ResourceLocation("lepidodendron:palaeodictyoptera_flight");
    }

    public boolean isFlying() {
        return !this.onGround && ! this.isSitting();
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
        public FlightMoveHelper(EntityPrehistoricFloraInsectFlyingBase insect) {
            super(insect);
            this.speed = EntityPrehistoricFloraInsectFlyingBase.this.getAISpeedInsect();

        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                if (EntityPrehistoricFloraInsectFlyingBase.this.collidedHorizontally) {
                    EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw += 180.0F;
                    this.speed = 0.1F;
                    BlockPos target = EntityPrehistoricFloraInsectFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraInsectFlyingBase.this, EntityPrehistoricFloraInsectFlyingBase.this.world, EntityPrehistoricFloraInsectFlyingBase.this.posX + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraInsectFlyingBase.this.posZ + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraInsectFlyingBase.this.rand);
                    this.posX = target.getX();
                    this.posY = target.getY();
                    this.posZ = target.getZ();
                }
                double d0 = this.posX - EntityPrehistoricFloraInsectFlyingBase.this.posX;
                double d1 = this.posY - EntityPrehistoricFloraInsectFlyingBase.this.posY;
                double d2 = this.posZ - EntityPrehistoricFloraInsectFlyingBase.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = MathHelper.sqrt(d3);

                if (d3 < EntityPrehistoricFloraInsectFlyingBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityPrehistoricFloraInsectFlyingBase.this.motionX *= 0.5D;
                    EntityPrehistoricFloraInsectFlyingBase.this.motionY *= 0.5D;
                    EntityPrehistoricFloraInsectFlyingBase.this.motionZ *= 0.5D;
                } else {
                    EntityPrehistoricFloraInsectFlyingBase.this.motionX += d0 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraInsectFlyingBase.this.motionY += d1 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraInsectFlyingBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

                    if (EntityPrehistoricFloraInsectFlyingBase.this.getAttackTarget() == null && EntityPrehistoricFloraInsectFlyingBase.this.getEatTarget() == null) {
                        EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraInsectFlyingBase.this.motionX, EntityPrehistoricFloraInsectFlyingBase.this.motionZ)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraInsectFlyingBase.this.renderYawOffset = EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw;
                    } else {
                        if (EntityPrehistoricFloraInsectFlyingBase.this.getEatTarget() != null) {
                            double d4 = EntityPrehistoricFloraInsectFlyingBase.this.getEatTarget().posX - EntityPrehistoricFloraInsectFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraInsectFlyingBase.this.getEatTarget().posZ - EntityPrehistoricFloraInsectFlyingBase.this.posZ;
                            EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraInsectFlyingBase.this.renderYawOffset = EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw;
                        }
                        else {
                            double d4 = EntityPrehistoricFloraInsectFlyingBase.this.getAttackTarget().posX - EntityPrehistoricFloraInsectFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraInsectFlyingBase.this.getAttackTarget().posZ - EntityPrehistoricFloraInsectFlyingBase.this.posZ;
                            EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraInsectFlyingBase.this.renderYawOffset = EntityPrehistoricFloraInsectFlyingBase.this.rotationYaw;
                        }
                    }
                }
            }
        }
    }

    class AIWanderInsect extends EntityAIBase {
        BlockPos target;
        boolean isGoingToAttach = false;

        public AIWanderInsect() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            if(EntityPrehistoricFloraInsectFlyingBase.this.sitCooldown == 0) {
                for(int i = 0; i < 15; i++){
                    BlockPos randomPos = new BlockPos(EntityPrehistoricFloraInsectFlyingBase.this).add(rand.nextInt(17) - 8, rand.nextInt(11) - 5, rand.nextInt(17) - 8);
                    if ((!world.isAirBlock(randomPos)) && (world.getBlockState(randomPos).getMaterial() != Material.WATER) && (world.getBlockState(randomPos).getMaterial() != Material.LAVA)) {
                        RayTraceResult rayTrace = world.rayTraceBlocks(EntityPrehistoricFloraInsectFlyingBase.this.getPositionVector().add(0, 0.25, 0), new Vec3d(randomPos).add(0.5, 0.5, 0.5), true);
                        if (rayTrace != null && rayTrace.hitVec != null) {
                            if ((!world.isSideSolid(rayTrace.getBlockPos(), rayTrace.sideHit)) && (world.getBlockState(rayTrace.getBlockPos()).getMaterial() != Material.WATER)) {
                                target = rayTrace.getBlockPos();
                                isGoingToAttach = true;
                            }
                        }
                    }
                }
            }

            target = EntityPrehistoricFloraInsectFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraInsectFlyingBase.this, EntityPrehistoricFloraInsectFlyingBase.this.world, EntityPrehistoricFloraInsectFlyingBase.this.posX + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraInsectFlyingBase.this.posZ + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(17) - 8, EntityPrehistoricFloraInsectFlyingBase.this.rand);
            Material material = world.getBlockState(new BlockPos(target)).getMaterial();
            Material material1 = world.getBlockState(new BlockPos(target).up()).getMaterial();
            return (material1 != Material.LAVA) && (material1 != Material.WATER) && (material != Material.LAVA) && (material != Material.WATER) && !EntityPrehistoricFloraInsectFlyingBase.this.isSitting() && EntityPrehistoricFloraInsectFlyingBase.this.isDirectPathBetweenPoints(new Vec3d(target).add(0.5D, 0.5D, 0.5D)) && EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(4) == 0 && EntityPrehistoricFloraInsectFlyingBase.this.getAttachmentPos() == null;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            if (!EntityPrehistoricFloraInsectFlyingBase.this.isDirectPathBetweenPoints(new Vec3d(target))) {
                target = EntityPrehistoricFloraInsectFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraInsectFlyingBase.this, EntityPrehistoricFloraInsectFlyingBase.this.world, EntityPrehistoricFloraInsectFlyingBase.this.posX + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraInsectFlyingBase.this.posZ + EntityPrehistoricFloraInsectFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraInsectFlyingBase.this.rand);
            }
            if (EntityPrehistoricFloraInsectFlyingBase.this.world.isAirBlock(target) || isGoingToAttach) {
                if (!EntityPrehistoricFloraInsectFlyingBase.this.isFlying()) {
                    EntityPrehistoricFloraInsectFlyingBase.this.setNavigator();
                }
                EntityPrehistoricFloraInsectFlyingBase.this.moveHelper.setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 0.25D);
                if (EntityPrehistoricFloraInsectFlyingBase.this.getAttackTarget() == null) {
                    EntityPrehistoricFloraInsectFlyingBase.this.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

                }
            }
        }
    }

}