package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.item.ItemFishFood;
import net.lepidodendron.item.entities.ItemUnknownPlanula;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraJellyfishBase extends EntityTameable implements IAnimatedEntity {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int rotationStage;
    private int jumpTicks;
    private static final DataParameter<Integer> TICKS = EntityDataManager.createKey(EntityPrehistoricFloraJellyfishBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> MATEABLE = EntityDataManager.createKey(EntityPrehistoricFloraJellyfishBase.class, DataSerializers.VARINT);
    private int inPFLove;

    public EntityPrehistoricFloraJellyfishBase(World world) {
        super(world);
        //this.spawnableBlock = Blocks.WATER;
        this.moveHelper = new EntityPrehistoricFloraJellyfishBase.SwimmingMoveHelper();
        this.navigator = new PathNavigateSwimmer(this, world);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }
    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    public ItemStack getPropagule() {
        return new ItemStack(ItemUnknownPlanula.block, (int) (1));
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return (stack.getItem() == new ItemStack(ItemFishFood.block, (int) (1)).getItem());
    }

    @Override
    public boolean isPushedByWater()
    {
        return false;
    }

    public abstract boolean dropsEggs();

    private Animation animation = NO_ANIMATION;

    public static final Animation ANIMATION_FISH_WANDER = Animation.create(0);

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
    }

    public int getTicks() {
       return this.dataManager.get(TICKS);
    }

    public void setTicks(int ticks) {
        this.dataManager.set(TICKS, ticks);
    }

    public int getMateable() {
        return this.dataManager.get(MATEABLE);
    }

    public void setMateable(int ticks) {
        this.dataManager.set(MATEABLE, ticks);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setTicks(0);
        this.setMateable(0);
        return livingdata;
    }

    public boolean getCanBreed() {
        return this.getTicks() > 24000; //If the mob has done not bred for a MC day
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Ticks", this.getTicks());
        compound.setInteger("InPFLove", this.inPFLove);
        compound.setInteger("mateable", this.getMateable());
    }

    //@Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setTicks(compound.getInteger("Ticks"));
        this.inPFLove = compound.getInteger("InPFLove");
        this.setMateable(compound.getInteger("mateable"));
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (ds == DamageSource.IN_WALL) {
            return false;
        }
        if (this.isEntityInvulnerable(ds))
        {
            return false;
        }
        else
        {
            this.inPFLove = 0;
            return super.attackEntityFrom(ds, i);
        }
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    protected abstract float getAISpeedJelly();

    @Override
    public boolean isInWater() {
        return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
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
    protected int getExperiencePoints(EntityPlayer player) {
        return 1 + this.world.rand.nextInt(3);
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    @Override
    public void onLivingUpdate() {
        //this.renderYawOffset = this.rotationYaw;
        //Updated from vanilla to disable jumping and limit rotations
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
            if (this.rotationStage > 155) {
                this.rotationYaw = (float) ((double) this.rotationYaw + Math.min(2, (d3 / (double) this.newPosRotationIncrements)));
            }
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

        if (!(rotationStage > 0)) {rotationStage = 0;}
        if (rotationStage > 180) {
            rotationStage = 1;
        } else {
            rotationStage = rotationStage + rand.nextInt(2);
        }

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

    class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraJellyfishBase EntityBase = EntityPrehistoricFloraJellyfishBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraJellyfishBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            if (this.action == Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                if (this.action == Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                    double distanceX = this.posX - this.EntityBase.posX;
                    double distanceY = this.posY - this.EntityBase.posY;
                    double distanceZ = this.posZ - this.EntityBase.posZ;
                    double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                    distance = MathHelper.sqrt(distance);
                    distanceY /= distance;
                    float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;
                    //this.PrehistoricFloraFishBase.rotationYaw = this.limitAngle(this.PrehistoricFloraFishBase.rotationYaw, angle, 30.0F);
                    //this.PrehistoricFloraFishBase.setAIMoveSpeed(0.65F);

                    this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 10.0F);

                    //this.EntityBase.setAIMoveSpeed(0.05F);
                    float speed = getAISpeedJelly();
                    this.EntityBase.setAIMoveSpeed(speed);

                    this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
                } else {
                    this.EntityBase.setAIMoveSpeed(0.0F);
                }
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