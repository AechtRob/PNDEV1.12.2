package net.lepidodendron.entity.boats;

import com.google.common.collect.Lists;
import net.lepidodendron.ClientProxyLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.item.ItemSubmarineBatterypack;
import net.lepidodendron.item.ItemSubmarineBoatItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.List;

public class PrehistoricFloraSubmarine extends EntityBoat
{
    private static final DataParameter<Integer> TIME_SINCE_HIT = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> FORWARD_DIRECTION = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
    private static final DataParameter<Float> DAMAGE_TAKEN = EntityDataManager.<Float>createKey(PrehistoricFloraSubmarine.class, DataSerializers.FLOAT);
    private static final DataParameter<Integer> RF_SUPPLY = EntityDataManager.<Integer>createKey(PrehistoricFloraSubmarine.class, DataSerializers.VARINT);
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
    private double waterLevel;
    private float boatGlide;
    private PrehistoricFloraSubmarine.Status status;
    private PrehistoricFloraSubmarine.Status previousStatus;
    private double lastYd;

    public PrehistoricFloraSubmarine(World worldIn)
    {
        super(worldIn);
        this.paddlePositions = new float[2];
        this.preventEntitySpawning = true;
        this.setSize(3.0F, 3.0F);
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
    }

    public double getEnergyFraction() {
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

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("RF", this.getRF());
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound)
    {
        this.setRF(compound.getInteger("RF"));
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
                        if (this.getRF() >= 0) {
                            NBTTagCompound stackNBT = new NBTTagCompound();
                            stackNBT.setInteger("rf", this.getRF());
                            stack.setTagCompound(stackNBT);
                        }
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
        if (this.getRF() >= 0) {
            NBTTagCompound stackNBT = new NBTTagCompound();
            stackNBT.setInteger("rf", this.getRF());
            stack.setTagCompound(stackNBT);
        }
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
                f += 0.005F;
            }

            this.rotationYaw += this.deltaRotation;
            //this.rotationPitch += this.deltaPitch;

            if (this.forwardInputDown)
            {
                f += 0.04F;
            }

            if (this.backInputDown)
            {
                f -= 0.005F;
            }

            if (this.upInputDown &&
                (this.status == Status.IN_WATER
                || this.status == Status.UNDER_WATER
                || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                f1 += 0.0666F;
            }

            if (this.downInputDown && (!this.onGround) &&
                (this.status == Status.IN_WATER
                || this.status == Status.UNDER_WATER
                || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                f1 -= 0.1F;
            }

            if (this.rightStrafeInputDown && f == 0.0 &&
                    (this.status == Status.IN_WATER
                            || this.status == Status.UNDER_WATER
                            || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                f2 += 0.035F;
            }

            if (this.leftStrafeInputDown && f == 0.0 &&
                    (this.status == Status.IN_WATER
                            || this.status == Status.UNDER_WATER
                            || this.status == Status.UNDER_FLOWING_WATER)
            ) {
                f2 -= 0.035F;
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

            if (passenger instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) passenger;
                IBlockState state = world.getBlockState(new BlockPos(passenger.posX, passenger.getPosition().getY() + passenger.getEyeHeight(), passenger.posZ));
                if (state.getMaterial() == Material.WATER || passenger.isInsideOfMaterial(Material.WATER)) {
                    player.setAir(300);
                }
                else {
                    if (LepidodendronConfig.submarineNightvision) {
                        player.removePotionEffect(MobEffects.NIGHT_VISION);
                    }
                }
                if (((!player.isPotionActive(MobEffects.NIGHT_VISION))|| player.getActivePotionEffect(MobEffects.NIGHT_VISION).getDuration() < 201) && (state.getMaterial() == Material.WATER || passenger.isInsideOfMaterial(Material.WATER)) && LepidodendronConfig.submarineNightvision) {
                    player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 201, 0, false, false));
                }
                if (((!player.isPotionActive(MobEffects.INVISIBILITY))|| player.getActivePotionEffect(MobEffects.INVISIBILITY).getDuration() < 201) && (state.getMaterial() == Material.WATER || passenger.isInsideOfMaterial(Material.WATER)) && LepidodendronConfig.submarineInvisibility) {
                    player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 201, 0, false, false));
                }
            }
        }
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
            //Central panel (interact with entities)
            if (player.rotationYaw - this.rotationYaw > -22 && player.rotationYaw - this.rotationYaw < 22 && player.rotationPitch - this.rotationPitch > -60 && player.rotationPitch - this.rotationPitch < -30) {


            }
            //Left panel (read battery)
            if (player.rotationYaw - this.rotationYaw > -65 && player.rotationYaw - this.rotationYaw < -38 && player.rotationPitch - this.rotationPitch > -55 && player.rotationPitch - this.rotationPitch < -30) {
                if (player.world.isRemote) {
                    if (this.getRF() == -1) {
                        player.sendMessage(new TextComponentString("Submarine power: no battery!"));
                    }
                    else {
                        if (LepidodendronConfig.machinesRF) {
                            player.sendMessage(new TextComponentString("Submarine power: powered"));
                        } else {
                            DecimalFormat df = new DecimalFormat("###.#");
                            player.sendMessage(new TextComponentString("Submarine power: " + df.format(this.getEnergyFraction() * 100) + "%"));
                        }
                    }
                }
            }
            //Right panel (remove or add battery)
            if (player.rotationYaw - this.rotationYaw > 38 && player.rotationYaw - this.rotationYaw < 65 && player.rotationPitch - this.rotationPitch > -55 && player.rotationPitch - this.rotationPitch < -30) {
                if (!player.world.isRemote) {
                    if (this.getRF() == -1) {
                        //There is no battery: can we add one from our hand?
                        if (player.getHeldItem(hand).getItem() == ItemSubmarineBatterypack.block) {
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
                    }
                    else {
                        //Is our hand empty to remove the battery?
                        if (player.getHeldItem(hand).isEmpty()) {
                            ItemStack stack = new ItemStack(ItemSubmarineBatterypack.block, 1);
                            int rf = this.getRF();
                            NBTTagCompound stackNBT = new NBTTagCompound();
                            stackNBT.setInteger("rf", rf);
                            stack.setTagCompound(stackNBT);
                            ItemHandlerHelper.giveItemToPlayer(player, stack);
                            world.playSound(null, player.getPosition(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
                            this.setRF(Integer.valueOf(-1));
                        }
                    }
                }
            }
            return true;
        }
        else if (player.isSneaking())
        {
            return false;
        }
        else if ((!this.world.isRemote) && player.getHeldItem(hand).getItem() == ItemSubmarineBatterypack.block && this.getRF() == -1) {
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
                            for (int i = 0; i < 3; ++i)
                            {
                                ItemStack stack = new ItemStack(ItemSubmarineBoatItem.block, 1);
                                if (this.getRF() >= 0) {
                                    NBTTagCompound stackNBT = new NBTTagCompound();
                                    stackNBT.setInteger("rf", this.getRF());
                                    stack.setTagCompound(stackNBT);
                                }
                                Block.spawnAsEntity(world, this.getPosition(), stack);
                            }
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
}