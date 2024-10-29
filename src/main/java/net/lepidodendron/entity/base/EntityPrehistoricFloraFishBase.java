package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.lepidodendron.entity.util.ShoalingHelper;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

public abstract class EntityPrehistoricFloraFishBase extends EntityTameable implements IAnimatedEntity, IPrehistoricDiet {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraFishBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraFishBase.class, DataSerializers.VARINT);


    public EntityPrehistoricFloraFishBase shoalLeader;
    public int inPFLove;
    public int alarmCooldown;

    public EntityPrehistoricFloraFishBase(World world) {
        super(world);
        this.enablePersistence();
        if (world != null) {
            if (this.isSlowAtBottom()) {
                this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelperBase();
            } else {
                this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelper();
            }
            this.navigator = new PathNavigateSwimmer(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    @Override
    public boolean isChild()
    {
        return false;
    }

    public boolean hasPNVariants() {
        return false;
    }

    @Nullable
    public String getPNTypeName()
    {
        return null;
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

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_aquatic.name");
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

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownEgg.block, (int) (1));
    }

    @Override
    public boolean isPushedByWater()
    {
        return false;
    }

    public abstract boolean isSmall();

    public String getBucketMessage() {
        return "is too grown up to fit into a bucket";
    }

    @Override
    public float getEyeHeight() {
        return Math.max(super.getEyeHeight(), 0.2F);
    }

    private Animation animation = NO_ANIMATION;

    public abstract boolean dropsEggs();

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

    public int getTicks() {
       return this.dataManager.get(TICKS);
    }

    public void setTicks(int ticks) {
        this.dataManager.set(TICKS, ticks);
    }

    @Nullable
    public EntityPrehistoricFloraFishBase getShoalLeader() {
        return this.shoalLeader;
    }

    public void setShoalLeader(@Nullable EntityPrehistoricFloraFishBase leader) {
        this.shoalLeader = leader;
    }

    public boolean getCanBreed() {
        int breedCooldown = LepidodendronConfig.breedCooldown;
        if (breedCooldown < 1) {
            breedCooldown = 1;
        }
        return this.getTicks() > breedCooldown; //If the mob has done not bred for a MC day
    }

    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setInteger("mateable", this.getMateable());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setTicks(compound.getInteger("Ticks"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.setMateable(compound.getInteger("mateable"));
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(TICKS, rand.nextInt(24000));
        this.dataManager.register(MATEABLE, 0);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setTicks(0);
        this.setMateable(0);
        ShoalingHelper.updateShoalFishBase(this);
        return livingdata;
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    protected abstract float getAISpeedFish();

    protected abstract boolean isSlowAtBottom();


    @Override
    public boolean isInWater() {
        return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    public boolean isAtBottom() {
        //System.err.println("Testing position");
        if (this.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
            return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
                && ((this.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)this.getPosition().getY() + 0.334D) > this.posY);
        }
        return true;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
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
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (ds == DamageSource.IN_WALL) {
            if (this.isReallyInWater() || this.isInWater()) {
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
                List<EntityPrehistoricFloraFishBase> fishBase = this.world.getEntitiesWithinAABB(this.getClass(), new AxisAlignedBB(this.getPosition().add(-this.getShoalDist(), -this.getShoalDist(), -this.getShoalDist()), this.getPosition().add(this.getShoalDist(), this.getShoalDist(), this.getShoalDist())));
                for (EntityPrehistoricFloraFishBase currentfishBase : fishBase) {
                    currentfishBase.setShoalLeader(null);
                    currentfishBase.alarmCooldown = rand.nextInt(20) + 20;
                }
            }
            return super.attackEntityFrom(ds, i);
        }
    }

    public boolean isReallyInWater() {
        return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    public boolean isCollidingRim() {
        if (this.isReallyInWater()) {
            //System.err.println("collided");
            Vec3d vec3d = this.getPositionEyes(0);
            Vec3d vec3d1 = this.getLook(0);
            Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
            RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
            if (rayTrace != null && rayTrace.hitVec != null) {
                //System.err.println("raytraced");
                BlockPos sidePos = rayTrace.getBlockPos();
                if (world.getBlockState(sidePos).getMaterial() == Material.WATER) {
                    //System.err.println("colliding rim");
                    return true;
                }
            }
        }
        //System.err.println("not colliding rim");
        return false;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.inPFLove > 0)
        {
            --this.inPFLove;
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
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

    public EnumCreatureAttributePN getPNCreatureAttribute() {
        if (getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD) {
            return EnumCreatureAttributePN.INVERTEBRATE;
        }
        return EnumCreatureAttributePN.VERTEBRATE;
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

    public void setNotMateable()
    {
        this.setMateable(-6000);
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
                ShoalingHelper.updateShoalFishBase(this);
            }
        }

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

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        float f4;
        if (this.isServerWorld()) {
            if (this.isInWater()) {
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

                if (this.collidedHorizontally && this.isCollidingRim())
                {
                    this.motionY = 0.05D;
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

    class SwimmingMoveHelperBase extends EntityMoveHelper {
        private final EntityPrehistoricFloraFishBase EntityBase = EntityPrehistoricFloraFishBase.this;

        public SwimmingMoveHelperBase() {
            super(EntityPrehistoricFloraFishBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            if (this.action == Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                double distanceX = this.posX - this.EntityBase.posX;
                double distanceY = this.posY - this.EntityBase.posY;
                double distanceZ = this.posZ - this.EntityBase.posZ;
                double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                distance = MathHelper.sqrt(distance);
                distanceY /= distance;
                float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;

                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 10.0F);
                float speed = getAISpeedFish();
                this.EntityBase.setAIMoveSpeed(speed);

                if (this.EntityBase.isAtBottom()) {
                    this.EntityBase.setAIMoveSpeed(speed * 0.25F);
                }

                this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
            } else {
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }

    class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraFishBase EntityBase = EntityPrehistoricFloraFishBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraFishBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            //System.err.println("Action " + this.action);
            //System.err.println("NoPath " + this.EntityBase.getNavigator().noPath());
            if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                double distanceX = this.posX - this.EntityBase.posX;
                double distanceY = this.posY - this.EntityBase.posY;
                double distanceZ = this.posZ - this.EntityBase.posZ;
                double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                distance = MathHelper.sqrt(distance);
                distanceY /= distance;
                float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;

                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 20.0F);
                float speed = getAISpeedFish();
                this.EntityBase.setAIMoveSpeed(speed);

                this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
            } else {
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }
}