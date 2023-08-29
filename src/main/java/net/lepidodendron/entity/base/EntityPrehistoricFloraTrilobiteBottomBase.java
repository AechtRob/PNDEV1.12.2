package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockGreenAlgaeMat;
import net.lepidodendron.block.BlockRedAlgaeMat;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.lepidodendron.entity.util.PathNavigateWaterBottom;
import net.lepidodendron.entity.util.ShoalingHelper;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

public abstract class EntityPrehistoricFloraTrilobiteBottomBase extends EntityTameable implements IAnimatedEntity, IPrehistoricDiet {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int jumpTicks;
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraTrilobiteBottomBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraTrilobiteBottomBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> ISMOVING = EntityDataManager.createKey(EntityPrehistoricFloraTrilobiteBottomBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> TICKOFFSET = EntityDataManager.createKey(EntityPrehistoricFloraTrilobiteBottomBase.class, DataSerializers.VARINT);

    private int inPFLove;

    private EntityPrehistoricFloraTrilobiteBottomBase shoalLeader;
    private int alarmCooldown;

    public EntityPrehistoricFloraTrilobiteBottomBase(World world) {
        super(world);
        this.enablePersistence();
        if (world != null) {
            this.moveHelper = new EntityPrehistoricFloraTrilobiteBottomBase.WanderMoveHelper();
            this.navigator = new PathNavigateWaterBottom(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
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
    public boolean isChild()
    {
        return false;
    }

    public EnumCreatureAttributePN getPNCreatureAttribute() {
        if (getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD) {
            return EnumCreatureAttributePN.INVERTEBRATE;
        }
        return EnumCreatureAttributePN.VERTEBRATE;
    }

    @Override
    public boolean isRiding() {
        if (this.getRidingEntity() != null) {
            if (this.getRidingEntity() instanceof EntityBoat) {
                return false;
            }
        }
        return super.isRiding();
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
        return 100;
    }

    public int getAlarmCooldown() {return this.alarmCooldown;}

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        int i = (int) Math.round(this.getMaxHealth()/4D);
        if (i < 1) {
            return 0;
        }
        return this.world.rand.nextInt(i);
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_aquatic.name");
    }

    public static String getPeriod() {
        return "undefined";
    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownEgg.block, (int) (1));
    }

    public abstract boolean isSmall();

    public String getBucketMessage() {
        return "is too grown up to fit into a bucket";
    }

    public void eatItem(ItemStack stack) {
        if (stack != null && stack.getItem() != null) {
            float itemHealth = 0.2F; //Default minimal nutrition
            if (stack.getItem() instanceof ItemFood) {
                itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
            }
            this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            stack.shrink(1);
            if (!world.isRemote) {
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    public abstract boolean dropsEggs();

    protected abstract float getAISpeedTrilobite();

    private Animation animation = NO_ANIMATION;

    public static final Animation ANIMATION_WANDER = Animation.create(0);

    protected void initEntityAI() {}

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
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(TICKS, rand.nextInt(24000));
        this.dataManager.register(MATEABLE, 0);
        this.dataManager.register(ISMOVING, false);
        this.dataManager.register(TICKOFFSET, rand.nextInt(1000));
    }


    public int getTickOffset() {
        return this.dataManager.get(TICKOFFSET);
    }

    public void setTickOffset(int ticks) {
        this.dataManager.set(TICKOFFSET, ticks);
    }
    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    public int getTicks() {
       return this.dataManager.get(TICKS);
    }

    public void setTicks(int ticks) {
        this.dataManager.set(TICKS, ticks);
    }

    @Nullable
    public EntityPrehistoricFloraTrilobiteBottomBase getShoalLeader() {
        return this.shoalLeader;
    }

    public void setShoalLeader(@Nullable EntityPrehistoricFloraTrilobiteBottomBase leader) {
        this.shoalLeader = leader;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setTicks(0);
        this.setMateable(0);
        this.setTickOffset(rand.nextInt(1000));
        ShoalingHelper.updateShoalTrilobiteBottomBase(this);

        return livingdata;
    }

    public boolean getCanBreed() {
        int breedCooldown = LepidodendronConfig.breedCooldown;
        if (breedCooldown < 1) {
            breedCooldown = 1;
        }
        return this.getTicks() > breedCooldown; //If the mob has done not bred for a MC day
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setInteger("mateable", this.getMateable());
        compound.setInteger("TickOffset", this.getTickOffset());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setTicks(compound.getInteger("Ticks"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.setMateable(compound.getInteger("mateable"));
        this.setTickOffset(compound.getInteger("TickOffset"));
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (ds == DamageSource.IN_WALL) {
            if (this.isInWater()) {
                return false;
            }
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
                List<EntityPrehistoricFloraTrilobiteBottomBase> trilobiteBase = this.world.getEntitiesWithinAABB(this.getClass(), new AxisAlignedBB(this.getPosition().add(-this.getShoalDist(), -this.getShoalDist(), -this.getShoalDist()), this.getPosition().add(this.getShoalDist(), this.getShoalDist(), this.getShoalDist())));
                for (EntityPrehistoricFloraTrilobiteBottomBase currenttrilobiteBase : trilobiteBase) {
                    currenttrilobiteBase.setShoalLeader(null);
                    currenttrilobiteBase.alarmCooldown = rand.nextInt(20) + 20;
                }
            }
            return super.attackEntityFrom(ds, i);
        }
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    public float getMaxTurnDistancePerTick() {
        return 20;
    }

    @Override
    public boolean isInWater() {
        return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    public boolean isAtBottom() {
        //System.err.println("Testing position");
        if (this.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
            return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
                    && ((this.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean isPushedByWater()
    {
        return false;
    }

    public boolean getIsMoving() {
        return this.dataManager.get(ISMOVING);
    }

    public void setIsMoving(boolean isMoving) {
        this.dataManager.set(ISMOVING, isMoving);
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

    @Override
    public void onLivingUpdate() {
        this.renderYawOffset = this.rotationYaw;
        //Updated from vanilla to allow underwater jumping:
        if (this.jumpTicks > 0)
        {
            --this.jumpTicks;
        }

        if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer())
        {
            double d0 = this.posX + (this.interpTargetX - this.posX) / (double)this.newPosRotationIncrements;
            double d1 = this.posY + (this.interpTargetY - this.posY) / (double)this.newPosRotationIncrements;
            double d2 = this.posZ + (this.interpTargetZ - this.posZ) / (double)this.newPosRotationIncrements;
            double d3 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
            --this.newPosRotationIncrements;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
        else if (!this.isServerWorld())
        {
            this.motionX *= 0.98D;
            this.motionY *= 0.98D;
            this.motionZ *= 0.98D;
        }

        if (Math.abs(this.motionX) < 0.003D)
        {
            this.motionX = 0.0D;
        }

        if (Math.abs(this.motionY) < 0.003D)
        {
            this.motionY = 0.0D;
        }

        if (Math.abs(this.motionZ) < 0.003D)
        {
            this.motionZ = 0.0D;
        }

        this.world.profiler.startSection("ai");

        if (this.isMovementBlocked())
        {
            this.isJumping = false;
            this.moveStrafing = 0.0F;
            this.moveForward = 0.0F;
            this.randomYawVelocity = 0.0F;
        }
        else if (this.isServerWorld())
        {
            this.world.profiler.startSection("newAi");
            this.updateEntityActionState();
            this.world.profiler.endSection();
        }

        this.world.profiler.endSection();
        this.world.profiler.startSection("jump");

        if (this.isJumping)
        {
            if (this.isInWater() && this.jumpTicks == 0)
            {
                this.jump();
                this.jumpTicks = 10;
            }
            else if (this.isInLava())
            {
                this.handleJumpLava();
            }
            else if (this.onGround && this.jumpTicks == 0)
            {
                this.jump();
                this.jumpTicks = 10;
            }
        }
        else
        {
            this.jumpTicks = 0;
        }

        this.world.profiler.endSection();
        this.world.profiler.startSection("travel");
        this.moveStrafing *= 0.98F;
        this.moveForward *= 0.98F;
        this.randomYawVelocity *= 0.9F;
        //this.updateElytra();
        this.travel(this.moveStrafing, this.moveVertical, this.moveForward);
        this.world.profiler.endSection();
        this.world.profiler.startSection("push");
        this.collideWithNearbyEntities();
        this.world.profiler.endSection();

        //Eat algae!
        BlockPos pos = this.getPosition();
        if ((this.getHealth() < this.getMaxHealth()) && this.getHealth() > 0
                && ((this.world.getBlockState(pos).getBlock() == BlockGreenAlgaeMat.block)
                || (this.world.getBlockState(pos).getBlock() == BlockRedAlgaeMat.block))
        ) {
            this.world.destroyBlock(pos,false);
            this.setHealth(this.getHealth() + 0.5F);
        }

        if (this.inPFLove > 0)
        {
            --this.inPFLove;
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
        }

    }

    public void onEntityUpdate()
    {
        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !isInWater())
        {
            --i;
            this.setAir(i);

            if (this.getAir() == -20)
            {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
            }
        }
        else
        {
            this.setAir(300);
        }

        //General ticker (for babies etc.)
        int ii = this.getTicks();
        if (this.isEntityAlive())
        {
            ++ii;
            //limit at 48000 (two MC days) and then reset:
            if (ii >= 48000) {ii = 0;}
            this.setTicks(ii);
        }

        if (this.alarmCooldown > 0) {
            this.alarmCooldown -= 1;
        }

        double factor = LepidodendronConfig.doShoalingFlockingFactor;
        if (factor > 100) {
            factor = 100;
        }
        if (factor > 0) {
            if (((double) ii / Math.round((float)this.getShoalInterval() / factor)) == Math.round((double) ii / Math.round((float)this.getShoalInterval() / factor))) {
                ShoalingHelper.updateShoalTrilobiteBottomBase(this);
            }
        }

        //Drop an egg perhaps:
        if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && LepidodendronConfig.doMultiplyMobs) {
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
    }


    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
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

                BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain(this.posX, this.getEntityBoundingBox().minY - 1.0D, this.posZ);

                if (!this.onGround) {
                    speedModifier *= 0.5F;
                }
                if (speedModifier > 0.0F) {
                    f4 += (0.54600006F - f4) * speedModifier / 3.0F;
                }
                this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);

                if (this.motionX != 0 || this.motionZ != 0) {
                    this.setIsMoving(true);
                }
                else {
                    this.setIsMoving(false);
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

    public class WanderMoveHelper extends EntityMoveHelper {

        private final EntityPrehistoricFloraTrilobiteBottomBase EntityBase = EntityPrehistoricFloraTrilobiteBottomBase.this;

        public WanderMoveHelper() {
            super(EntityPrehistoricFloraTrilobiteBottomBase.this);
        }

        public void onUpdateMoveHelper() {
            if (this.action == Action.STRAFE) {
                //float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
                float f = getAISpeedTrilobite();
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
                this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * getAISpeedTrilobite()));


                //Testing mode:
                //this.EntityBase.setAIMoveSpeed(0f);

                if (
                    (this.EntityBase.collidedHorizontally)
                    && (d2 > (double) this.EntityBase.stepHeight && d0 * d0 + d1 * d1 < (double) Math.max(1.0F, this.EntityBase.width))
                    ) {
                    this.EntityBase.getJumpHelper().setJumping();
                    this.action = Action.JUMPING;
                }
            } else if (this.action == Action.JUMPING) {
                //float speed = getAISpeedLand();
                //this.EntityBase.setAIMoveSpeed((float) (speed * this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedTrilobite()));
                this.EntityBase.motionY += 0.04D;
                if (this.EntityBase.onGround) {
                    this.action = Action.WAIT;
                }
            } else {
                this.EntityBase.setMoveForward(0.0F);
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
                this.world.setEntityState(this, (byte)18);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isInLove()
    {
        return this.inPFLove > 0;
    }

    public void setNotMateable()
    {
        this.setMateable(-6000);
    }

    @Override
    public void resetInLove()
    {
        this.inPFLove = 0;
    }

}