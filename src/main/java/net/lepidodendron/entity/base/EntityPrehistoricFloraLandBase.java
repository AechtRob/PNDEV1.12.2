package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.EntityPrehistoricFloraDiictodon;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.MaterialLatex;
import net.lepidodendron.util.MaterialResin;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
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
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraLandBase extends EntityPrehistoricFloraAgeableBase {

    private static final DataParameter<Integer> PFDRINKING = EntityDataManager.createKey(EntityPrehistoricFloraLandBase.class, DataSerializers.VARINT);
    private static final DataParameter<Optional<BlockPos>> DRINKINGFROM = EntityDataManager.createKey(EntityPrehistoricFloraLandBase.class, DataSerializers.OPTIONAL_BLOCK_POS);

    private static final DataParameter<Integer> PFGRAZING = EntityDataManager.createKey(EntityPrehistoricFloraLandBase.class, DataSerializers.VARINT);
    private static final DataParameter<Optional<BlockPos>> GRAZINGFROM = EntityDataManager.createKey(EntityPrehistoricFloraLandBase.class, DataSerializers.OPTIONAL_BLOCK_POS);

    private static final DataParameter<Integer> PFANIMATIONCOUNDOWN = EntityDataManager.createKey(EntityPrehistoricFloraLandBase.class, DataSerializers.VARINT);

    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
    private int jumpTicks;
    public Animation EAT_ANIMATION;
    public Animation DRINK_ANIMATION;
    public Animation GRAZE_ANIMATION;

    public EntityPrehistoricFloraLandBase(World world) {
        super(world);
        if (world != null) {
            if (this.isSwimmingInWater() && this.canSwim()) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                        || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                    this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                    this.navigator = new PathNavigateSwimmerTopLayer(this, world);
                }
            }
            else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                        || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                    this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                    this.navigator = new PathNavigateGroundNoWater(this, world);
                }
            }
            if (FMLCommonHandler.instance().getSide().isClient()) {
                this.chainBuffer = new ChainBuffer();
            }
        }
        EAT_ANIMATION = Animation.create(this.getEatLength());
        DRINK_ANIMATION = Animation.create(this.getDrinkLength());
        GRAZE_ANIMATION = Animation.create(this.getGrazeLength());
    }

    @Override
    public boolean isAnimationDirectionLocked(Animation animation) {
         /**
         * If it must not pathfind, rotate or change its look angle while it is happening
         * This is used primarily to stop certain AI for pathfinding or targeting happening
         */
        return animation == DRINK_ANIMATION || animation == GRAZE_ANIMATION;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setIsDrinking(rand.nextInt(1000));
        this.setIsGrazing(rand.nextInt(1000));
        return livingdata;
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(PFDRINKING, 0);
        this.dataManager.register(DRINKINGFROM, Optional.absent());
        this.dataManager.register(PFGRAZING, 0);
        this.dataManager.register(GRAZINGFROM, Optional.absent());
        this.dataManager.register(PFANIMATIONCOUNDOWN, -1);
        this.setScaleForAge(false);
    }

    @Nullable
    public BlockPos getDrinkingFrom() {
        return (BlockPos) ((Optional) this.dataManager.get(DRINKINGFROM)).orNull();
    }

    public void setDrinkingFrom(@Nullable BlockPos pos) {
        this.dataManager.set(DRINKINGFROM, Optional.fromNullable(pos));
    }

    @Nullable
    public BlockPos getGrazingFrom() {
        return (BlockPos) ((Optional) this.dataManager.get(GRAZINGFROM)).orNull();
    }

    public void setGrazingFrom(@Nullable BlockPos pos) {
        this.dataManager.set(GRAZINGFROM, Optional.fromNullable(pos));
    }

    public boolean canSwim() {
        return true;
    }

    public float getSwimHeight() {
        return getEyeHeight();
    }

    public boolean homesToNest() {
        return false;
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("drinking", this.getPFDrinking());
        compound.setInteger("grazing", this.getPFGrazing());
        compound.setInteger("animationcountdown", this.getAnimationCountdown());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setIsDrinking(compound.getInteger("drinking"));
        this.setIsGrazing(compound.getInteger("grazing"));
        this.setAnimationCountdown(compound.getInteger("animationcountdown"));
    }

    public boolean drinksWater() {
        return true;
    }

    public boolean isGrazing() {
        return false;
    }

    public boolean isDrinking()
    {

        BlockPos entityPos = Functions.getEntityBlockPos(this);
        
        if (this.drinksWater()) {
            boolean test = (this.getPFDrinking() <= 0
                    && (!world.isRemote)
                    && (!this.getIsFast())
                    //&& !this.getIsMoving()
                    && this.DRINK_ANIMATION.getDuration() > 0
                    && this.getAnimation() == NO_ANIMATION
                    && this.onGround
                    && (!this.isReallyInWater())
                    &&
                        (this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.WATER
                        || this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.WATER
                        || this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.WATER
                        || this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.WATER
                        )
                );
            if (test) {
                //Which one is water?
                EnumFacing facing = null;
                if (this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.WATER) {
                    facing = EnumFacing.NORTH;
                }
                else if (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.WATER) {
                    facing = EnumFacing.SOUTH;
                }
                else if (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.WATER) {
                    facing = EnumFacing.EAST;
                }
                else if (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.WATER) {
                    facing = EnumFacing.WEST;
                }
                if (facing != null
                        && !this.world.getBlockState(entityPos.offset(facing)).causesSuffocation()) {
                    this.setDrinkingFrom(entityPos.offset(facing));
                    this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
                }
            }
            return test;
        }
        else {
            //Is GRAZING!
            EnumFacing facing = this.getAdjustedHorizontalFacing();
            boolean test = (this.getPFDrinking() <= 0
                    && (!world.isRemote)
                    && (!this.getIsFast())
                    //&& !this.getIsMoving()
                    && this.DRINK_ANIMATION.getDuration() > 0
                    && this.getAnimation() == NO_ANIMATION
                    && this.onGround
                    && (!this.isReallyInWater())
                    && (!this.world.getBlockState(entityPos.offset(facing)).causesSuffocation())
                    && (this.world.getBlockState(entityPos.offset(facing).down()).getMaterial() == Material.GROUND
                    || this.world.getBlockState(entityPos.offset(facing).down()).getMaterial() == Material.GRASS)
            );
            if (test) {
                //Which one is grazeable?
                facing = null;
                if (this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.GROUND
                    || this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.GRASS) {
                    facing = EnumFacing.NORTH;
                }
                else if (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.GROUND
                        || this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.GRASS) {
                    facing = EnumFacing.SOUTH;
                }
                else if (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.GROUND
                        || this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.GRASS) {
                    facing = EnumFacing.EAST;
                }
                else if (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.GROUND
                        || this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.GRASS) {
                    facing = EnumFacing.WEST;
                }
                if (facing != null) {
                    this.setDrinkingFrom(entityPos.offset(facing));
                    this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
                }
            }
            return test;
        }
    }

    public void faceBlock(@Nullable BlockPos pos, float maxYawIncrease, float maxPitchIncrease)
    {
        if (pos == null) {
            return;
        }

        double entityX = this.getEntityBoundingBox().minX + ((this.getEntityBoundingBox().maxX - this.getEntityBoundingBox().minX)/2.0D);
        double entityZ = this.getEntityBoundingBox().minZ + ((this.getEntityBoundingBox().maxZ - this.getEntityBoundingBox().minZ)/2.0D);

        double d0 = (pos.getX() + 0.5) - entityX;
        double d2 = (pos.getZ() + 0.5) - entityZ;

        float f = (float)(MathHelper.atan2(d2, d0) * (180D / Math.PI)) - 90.0F;
        this.rotationYaw = this.updateRotation(this.rotationYaw, f, maxYawIncrease);
        //this.renderYawOffset = this.rotationYaw;
    }

    public float updateRotation(float angle, float targetAngle, float maxIncrease)
    {
        float f = MathHelper.wrapDegrees(targetAngle - angle);

        if (f > maxIncrease)
        {
            f = maxIncrease;
        }

        if (f < -maxIncrease)
        {
            f = -maxIncrease;
        }

        return angle + f;
    }

    public void setIsDrinking(int val)
    {
        this.dataManager.set(PFDRINKING, val);
    }

    public int getPFDrinking() {
        return this.dataManager.get(PFDRINKING);
    }

    public void setIsGrazing(int val)
    {
        this.dataManager.set(PFGRAZING, val);
    }

    public int getPFGrazing() {
        return this.dataManager.get(PFGRAZING);
    }

    public void setAnimationCountdown(int val)
    {
        this.dataManager.set(PFANIMATIONCOUNDOWN, val);
    }

    public int getAnimationCountdown() {
        return this.dataManager.get(PFANIMATIONCOUNDOWN);
    }

    @Override
    public void selectNavigator () {
        if (this.isSwimmingInWater() && this.canSwim()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.SwimmingMoveHelper))
                || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            }
        }

        else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandBase.WanderMoveHelper))
                || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                this.moveHelper = new EntityPrehistoricFloraLandBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
            }
        }
    }

    public int getEatLength() {
        return 10;
    }

    public int getDrinkLength() {
        return 0;
    }

    public int getGrazeLength() {
        return 0;
    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{DRINK_ANIMATION, GRAZE_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION};
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (this.getAnimationCountdown() >= 0) {
            this.setAnimationCountdown(-1);
        }
        if (this.getAnimation() == DRINK_ANIMATION) {
            this.setAnimation(NO_ANIMATION);
            this.setIsDrinking(rand.nextInt(1000));
        }
        if (this.getAnimation() == GRAZE_ANIMATION) {
            this.setAnimation(NO_ANIMATION);
            this.setIsGrazing(rand.nextInt(1000));
        }
        if (!(this instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase)) {
            if (this.getAnimation() != this.ATTACK_ANIMATION) {
                if (this.getAnimation() != this.HIDE_ANIMATION) {
                    this.setAnimation(NO_ANIMATION);
                }
            }
        }
        this.getNavigator().clearPath();
        this.setDrinkingFrom(null);
        this.setGrazingFrom(null);
        if (this.getAnimation() == this.HIDE_ANIMATION && this.HIDE_ANIMATION != null && this.getAnimation() != null) {
            return false;
        }
        return super.attackEntityFrom(ds, i);
    }

    public float getTravelSpeed() {
        return this.getAISpeedLand();
    }

    public abstract float getAISpeedLand();

    protected float getAISpeedSwimmingLand() {
        return getAISpeedLand();
    }

    public boolean isReallyInWater() { //is actually in water at all
        //return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
        return this.isInWater();
    }

    public boolean isSwimmingInWater() { //is actually in water at all
        if (!this.world.isBlockLoaded(this.getPosition())) {
            return false;
        }
        return (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL)
            || (this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER
                && !this.onGround)
        );
    }

    @Override
    public boolean canBreatheUnderwater() {
        return this.canSwim();
    }

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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
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

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        if (!world.isRemote) {
            if (this.isDrinking() && this.getAnimation() != DRINK_ANIMATION && this.getAnimation() != GRAZE_ANIMATION) {
                this.setAnimation(DRINK_ANIMATION);
            }

            if (this.getAnimation() == DRINK_ANIMATION && this.getAnimationTick() >= DRINK_ANIMATION.getDuration() - 1) {
                int i = Math.max((int)Math.round(getDrinkCooldown()/2), 1);
                this.setIsDrinking(rand.nextInt(i) + i);
                this.getNavigator().clearPath();
                this.setDrinkingFrom(null);
                this.setAnimation(NO_ANIMATION);
            }

            if (this.isGrazing() && this.getAnimation() != DRINK_ANIMATION && this.getAnimation() != GRAZE_ANIMATION) {
                this.setAnimation(GRAZE_ANIMATION);
            }

            if (this.getAnimation() == GRAZE_ANIMATION && this.getAnimationTick() >= GRAZE_ANIMATION.getDuration() - 1) {
                int i = Math.max((int)Math.round(getGrazeCooldown()/2), 1);
                this.setIsGrazing(rand.nextInt(i) + i);
                this.getNavigator().clearPath();
                this.setGrazingFrom(null);
                this.setAnimation(NO_ANIMATION);
            }

            if (this.getDrinkingFrom() != null) {
                this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
            }

            if (this.getGrazingFrom() != null) {
                this.faceBlock(this.getGrazingFrom(), 10F, 10F);
            }

            if (this.getAnimation() == this.getGrappleAnimation() && this.getGrappleTarget() != null) {
                this.faceEntity(this.getGrappleTarget(), 10F, 10F);
            }

            if (this.getAnimationCountdown() >= 0) {
                this.setAnimationCountdown(this.getAnimationCountdown() - 1);
            }
        }
    }

    public int getDrinkCooldown() {
        return 1400;
    }

    public int getGrazeCooldown() {
        return 1400;
    }

    public void onLivingUpdate()
    {

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

        if (this.getAnimation() == DRINK_ANIMATION) {
            this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
        }

        if (this.getAnimation() == GRAZE_ANIMATION) {
            this.faceBlock(this.getGrazingFrom(), 10F, 10F);
        }

        this.renderYawOffset = this.rotationYaw;

        if (this.getAnimation() == this.MAKE_NEST_ANIMATION) {
            if (this.getAnimationTick() == this.MAKE_NEST_ANIMATION.getDuration() - 5) {
                if (this instanceof EntityPrehistoricFloraDiictodon) { //Burrowing creatures:
                    EntityPrehistoricFloraDiictodon burrower = (EntityPrehistoricFloraDiictodon) this;
                    if (!world.isRemote && this.getPosition().getY() > 8) {
                        BlockPos pos = burrower.buildBurrow(this.world, this.getPosition(), burrower.hasLargeBurrow());
                        this.world.setBlockState(pos, BlockNest.block.getDefaultState());
                        TileEntity te = world.getTileEntity(pos);
                        if (te != null) {
                            te.getTileData().setString("creature", getEntityId(this));
                        }
                        this.setNestLocation(pos);
                        SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
                        this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    }
                }
                else {
                    if (!world.isRemote) {
                        this.world.setBlockState(this.getPosition(), BlockNest.block.getDefaultState());
                        TileEntity te = world.getTileEntity(this.getPosition());
                        if (te != null) {
                            te.getTileData().setString("creature", getEntityId(this));
                        }
                        this.setNestLocation(this.getPosition());
                    }
                    SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
                    this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
        }

        if (this.getIsMoving() && !this.isSneaking()) {
            if (this.getIsFast()) {
                int animCycle = this.getRunCycleLength();
                if (animCycle > 0) {
                    double tickAnim = (this.ticksExisted + this.getTickOffset() + this.getRunFootstepOffset()) - (int) (Math.floor((double) (this.ticksExisted + this.getTickOffset() + this.getRunFootstepOffset()) / (double) animCycle) * (double) animCycle);
                    if (this.tetrapodRunFootstepOffset() != 0) {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D
                            || Math.floor(tickAnim) == this.tetrapodRunFootstepOffset() || Math.floor(tickAnim) == (animCycle / 2D) + this.tetrapodRunFootstepOffset()) {
                            playStepSoundPublic();
                        }
                    }
                    else {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D) {
                            playStepSoundPublic();
                        }
                    }
                }
            }
            else {
                int animCycle = this.getWalkCycleLength();
                if (animCycle > 0) {
                    double tickAnim = (this.ticksExisted + this.getTickOffset() + this.getFootstepOffset()) - (int) (Math.floor((double) (this.ticksExisted + this.getTickOffset() + this.getFootstepOffset()) / (double) animCycle) * (double) animCycle);
                    if (this.tetrapodWalkFootstepOffset() != 0) {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D
                                || Math.floor(tickAnim) == this.tetrapodRunFootstepOffset() || Math.floor(tickAnim) == (animCycle / 2D) + this.tetrapodRunFootstepOffset()) {
                            playStepSoundPublic();
                        }
                    }
                    else {
                        if (Math.floor(tickAnim) == 0 || Math.floor(tickAnim) == animCycle / 2D) {
                            playStepSoundPublic();
                        }
                    }
                }
            }
        }

        if (!this.world.isRemote) {
            selectNavigator();
        }

        //Updated from vanilla to allow underwater jumping:
        if (this.jumpTicks > 0) {
            --this.jumpTicks;
        }

        if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer() && this.getAnimation() != DRINK_ANIMATION && this.getAnimation() != GRAZE_ANIMATION) {
            double d0 = this.posX + (this.interpTargetX - this.posX) / (double) this.newPosRotationIncrements;
            double d1 = this.posY + (this.interpTargetY - this.posY) / (double) this.newPosRotationIncrements;
            double d2 = this.posZ + (this.interpTargetZ - this.posZ) / (double) this.newPosRotationIncrements;
            double d3 = MathHelper.wrapDegrees(this.interpTargetYaw - (double) this.rotationYaw);
            this.rotationYaw = (float) ((double) this.rotationYaw + d3 / (double) this.newPosRotationIncrements);
            this.rotationPitch = (float) ((double) this.rotationPitch + (this.interpTargetPitch - (double) this.rotationPitch) / (double) this.newPosRotationIncrements);
            --this.newPosRotationIncrements;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        } else if (!this.isServerWorld()) {
            this.motionX *= 0.98D;
            this.motionY *= 0.98D;
            this.motionZ *= 0.98D;
        }

        if (Math.abs(this.motionX) < 0.003D) {
            this.motionX = 0.0D;
        }

        if (Math.abs(this.motionY) < 0.003D) {
            this.motionY = 0.0D;
        }

        if (Math.abs(this.motionZ) < 0.003D) {
            this.motionZ = 0.0D;
        }

        this.world.profiler.startSection("ai");

        if (this.isMovementBlocked()) {
            this.isJumping = false;
            this.moveStrafing = 0.0F;
            this.moveForward = 0.0F;
            this.randomYawVelocity = 0.0F;
        } else if (this.isServerWorld()) {
            this.world.profiler.startSection("newAi");
            this.updateEntityActionState();
            this.world.profiler.endSection();
        }

        this.world.profiler.endSection();
        this.world.profiler.startSection("jump");

        if (this.isJumping) {
            if (this.isInWater() && this.jumpTicks == 0) {
                this.jump();
                this.jumpTicks = 10;
            } else if (this.isInLava()) {
                this.handleJumpLava();
            } else if (this.onGround && this.jumpTicks == 0) {
                this.jump();
                this.jumpTicks = 10;
            }
        } else {
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

        //Additional:
        if (!world.isRemote) {
            if (this.getAttackTarget() != null) {
                if (this.getAttackTarget().isDead) {
                    this.setAttackTarget(null);
                }
                if (this.getAttackTarget() instanceof EntityPlayer) {
                    if (((EntityPlayer)this.getAttackTarget()).isCreative()) {
                        this.setAttackTarget(null);
                    }
                }
            }
            if (this.getWarnTarget() != null) {
                if (this.getWarnTarget().isDead) {
                    this.setWarnTarget(null);
                }
                if (this.getWarnTarget() instanceof EntityPlayer) {
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
                if (this.getRevengeTarget() instanceof EntityPlayer) {
                    if (((EntityPlayer)this.getRevengeTarget()).isCreative()) {
                        this.setRevengeTarget(null);
                    }
                }
            }
            if (this.getEatTarget() != null) {
                if (this.getEatTarget().isDead) {
                    this.setEatTarget(null);
                }
            }
            if (this.isSwimmingInWater()) {
                this.setAttackTarget(null);
                this.setEatTarget(null);
                this.setWarnTarget(null);
                this.setRevengeTarget(null);
            }
            this.setIsFast(this.getAvoidTarget() != null ||this.getAttackTarget() != null || this.getEatTarget() != null || (this.getRevengeTarget() != null & (this.panics() || this.sneakOnRevenge())) || (this.isBurning() & this.panics()));

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
                    (distEntity >= (this.getSneakRange() * 2.0D) + 2) || distEntity <= (this.getUnSneakRange())
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

        if (this.getPFDrinking() > 0)
        {
            this.setIsDrinking(this.getPFDrinking() - 1);
        }

        if (this.getPFGrazing() > 0)
        {
            this.setIsGrazing(this.getPFGrazing() - 1);
        }

        if (this.getMateable() < 0) {
            this.setMateable(this.getMateable() + 1);
        }

        //Grapple with mates?
        if (rand.nextInt(1000) == 0) {
            //Are there any nearby to grapple with?
            this.findGrappleTarget();
        }

        if (this.getAnimation() == this.getGrappleAnimation() && this.getAnimationTick() == this.headbutTick() && this.getGrappleTarget() != null) {
            this.faceEntity(this.getGrappleTarget(), 10, 10);
            launchGrapple();
            if (this.getGrappleTarget() instanceof EntityPrehistoricFloraAgeableBase) {
                EntityPrehistoricFloraAgeableBase grappleTarget = (EntityPrehistoricFloraAgeableBase) this.getGrappleTarget();
                grappleTarget.setGrappleTarget(null);
                grappleTarget.willGrapple = false;
            }
            this.setGrappleTarget(null);
            this.willGrapple = false;
        }
        else if (this.getAnimation() == this.getGrappleAnimation() && this.getGrappleTarget() != null) {
            this.faceEntity(this.getGrappleTarget(), 10, 10);
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

    public int headbutTick() {
        return -1;
    }

    @Override
    protected float getJumpUpwardsMotion()
    {
        if (this.getIsFast()) {
            return 0.45F;
        }
        return 0.42F;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        float f4;
        if (this.isServerWorld()) {

            double yy = this.posY + Math.max((this.getSwimHeight() - 0.2), 0.1);
            BlockPos posEyes = new BlockPos(this.posX, yy, this.posZ);

            if (this.isInWater() &&
                    (world.getBlockState(posEyes).getMaterial() == Material.WATER
                        || world.getBlockState(posEyes).getMaterial() == Material.LAVA
                        || world.getBlockState(posEyes).getMaterial() == MaterialResin.RESIN
                        || world.getBlockState(posEyes).getMaterial() == MaterialLatex.LATEX)
            ) {
                this.motionY = 0.2D;
            }


            if (this.isInWater()) { //Is in water
                //System.err.println("Is in water");
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

                this.motionX *= f4;
                this.motionX *= 0.9;
                this.motionY *= 0.9;
                this.motionY *= f4;
                this.motionZ *= 0.9;
                this.motionZ *= f4;
            }
            else { //is not in water:
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

                    if (this.motionX != 0 || this.motionZ != 0) {
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
                else //is in Lava
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

        private final EntityPrehistoricFloraLandBase EntityBase = EntityPrehistoricFloraLandBase.this;

        public WanderMoveHelper() {
            super(EntityPrehistoricFloraLandBase.this);
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
                double heightfactor = Math.max(0, Math.ceil(this.EntityBase.height) - 2);
                double d3 = d0 * d0 + d2 * d2 + d1 * d1;
                d2 = d2 + heightfactor;

                if (d3 < 2.500000277905201E-7D) {
                    this.EntityBase.setMoveForward(0.0F);
                    return;
                }

                float turn = (EntityBase.getgetMaxTurnDistancePerTick());
                float f9 = (float) (MathHelper.atan2(d1, d0) * (180D / Math.PI)) - 90;
                if (this.EntityBase.getAnimation() != DRINK_ANIMATION && this.EntityBase.getAnimation() != GRAZE_ANIMATION
                        && this.EntityBase.getIsMoving()) {
                    this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, f9, turn);
                }
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

    @Override
    public void eatItem(ItemStack stack) {
        if (stack != null && stack.getItem() != null) {
            float itemHealth = 0.5F; //Default minimal nutrition
            if (stack.getItem() instanceof ItemFood) {
                itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
            }
            this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            stack.shrink(1);
            if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
                this.setAnimation(EAT_ANIMATION);
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    public class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraLandBase EntityBase = EntityPrehistoricFloraLandBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraLandBase.this);
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

                if (this.EntityBase.getAnimation() != DRINK_ANIMATION && this.EntityBase.getAnimation() != GRAZE_ANIMATION
                    && this.EntityBase.getIsMoving()) {
                    this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 20.0F);
                }
                float speed = getAISpeedSwimmingLand();
                this.EntityBase.setAIMoveSpeed(speed);

                this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;


                //System.err.println("Testing jump");
                if (
                    (this.EntityBase.collidedHorizontally)
                        //&& (distanceY > (double) this.EntityBase.stepHeight && distanceX * distanceX + distanceZ * distanceZ < (double) Math.max(1.0F, this.EntityBase.width))
                ) {
                    this.EntityBase.getJumpHelper().setJumping();
                    this.action = Action.JUMPING;
                    //System.err.println("Set jump?");
                }
            } else if (this.action == Action.JUMPING) {
                this.EntityBase.setAIMoveSpeed((float) (this.speed * getAISpeedSwimmingLand()));
                this.EntityBase.motionY += 0.04D;
                //System.err.println("Is jumping");
                if (this.EntityBase.onGround) {
                    this.action = Action.WAIT;
                }

            } else {
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }
}