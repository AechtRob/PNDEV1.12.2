package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
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
import java.util.Random;

public abstract class EntityPrehistoricFloraLandClimbingFlyingBase extends EntityPrehistoricFloraLandBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.OPTIONAL_BLOCK_POS);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.FACING);
    private static final DataParameter<Boolean> HEADCOLLIDED = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Float> FLYPROGRESS = EntityDataManager.createKey(EntityPrehistoricFloraLandClimbingFlyingBase.class, DataSerializers.FLOAT);

    public int sitCooldown = 0;
    public int sitTickCt = 0;
    //public float flyProgress;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    private EntityItem eatTarget;
    public Animation ATTACK_ANIMATION;
    public Animation LAY_ANIMATION;
    private int inPFLove;
    private int climbingpause;

    public EntityPrehistoricFloraLandClimbingFlyingBase(World world) {
        super(world);
        if (world != null) {
            this.moveHelper = new EntityPrehistoricFloraLandClimbingFlyingBase.FlightMoveHelper(this);
            this.navigator = new PathNavigateFlyingNoWater(this, world);
            this.getNavigator().getNodeProcessor().setCanSwim(false);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    public float headHitHeight() {
        return 0.55F;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!world.isRemote) {
            if (this.motionX != 0 || this.motionZ != 0 || this.motionY != 0) {
                this.setIsMoving(true);
            } else {
                this.setIsMoving(false);
            }
        }
    }

    @Override
    public void selectNavigator () {
        if ((!(this.moveHelper instanceof EntityPrehistoricFloraLandClimbingFlyingBase.FlightMoveHelper))
                || (!(this.navigator instanceof PathNavigateFlyingNoWater))) {
            this.moveHelper = new EntityPrehistoricFloraLandClimbingFlyingBase.FlightMoveHelper(this);
            this.navigator = new PathNavigateFlyingNoWater(this, world);
        }
    }

    public void setFlyProgress(float flyprgress) {
        this.dataManager.set(FLYPROGRESS, flyprgress);
    }

    public float getFlyProgress() {
        return this.dataManager.get(FLYPROGRESS);
    }

    @Override
    public int animSpeedAdder() {
        if (this.getIsMoving() && (!this.getHeadCollided())
                && (!(this.getFlyProgress() != 0 && this.getAttachmentPos() == null))
                && this.getTicks() >= 0
        ) {
            return 1;
        }
        return 0;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setHeadCollided(false);
        this.climbingpause = -99 + rand.nextInt(200);
        return livingdata;
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(FLYPROGRESS, 0F);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
        this.dataManager.register(HEADCOLLIDED, false);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setHeadCollided(compound.getBoolean("headcollided"));
        this.climbingpause = compound.getInteger("climbingpause");
        this.dataManager.set(SIT_FACE, EnumFacing.byIndex(compound.getByte("SitFace")));
        this.sitCooldown = compound.getInteger("SitCooldown");
        this.setTickOffset(compound.getInteger("TickOffset"));
        this.sitTickCt = compound.getInteger("SitTickCt");
        if (compound.hasKey("PosX")) {
            int i = compound.getInteger("PosX");
            int j = compound.getInteger("PosY");
            int k = compound.getInteger("PosZ");
            this.dataManager.set(SIT_BLOCK_POS, Optional.of(new BlockPos(i, j, k)));
        } else {
            this.dataManager.set(SIT_BLOCK_POS, Optional.absent());
        }
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("headcollided", this.getHeadCollided());
        compound.setInteger("climbingpause", climbingpause);
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
    }

    public boolean getHeadCollided()
    {
        return this.dataManager.get(HEADCOLLIDED);
    }

    public void setHeadCollided(boolean collided)
    {
        this.dataManager.set(HEADCOLLIDED, collided);
    }

    public float getClimbSpeed() {
        return 0.01F;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
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
    public float getEyeHeight() {
        return 0.15F;
    }

    public EnumFacing getAttachmentFacing() {
        return this.dataManager.get(SIT_FACE);
    }

    @Override
    public BlockPos getPosition()
    {
        return new BlockPos(this.posX, this.posY + this.getEyeHeight(), this.posZ);
    }

    @Nullable
    public BlockPos getAttachmentPos() {
        return this.dataManager.get(SIT_BLOCK_POS).orNull();
    }

    public void setAttachmentPos(@Nullable BlockPos pos) {
        this.dataManager.set(SIT_BLOCK_POS, Optional.fromNullable(pos));
    }

    @Override
    public boolean attackEntityFrom(DamageSource ds, float f) {
        if (ds == DamageSource.IN_WALL) {
            return false;
        }
        if (ds == DamageSource.FALL) {
            return false;
        }
        this.setFlying();
        this.inPFLove = 0;
        return super.attackEntityFrom(ds, f);
    }

    public void setFlying() {
        if (!world.isRemote) {
            this.setSitting(false);
            this.sitTickCt = 0;
            ticksSitted = 0;
            sitCooldown = 500 + rand.nextInt(this.sitCooldownSetter());
            this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
            this.setAttachmentPos(null);
        }
    }

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

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.getLaying()) {
            this.setFlying();
        }

        if (this.inPFLove > 0) {
            --this.inPFLove;
        }

        if (!world.isRemote) {
            if (this.getMateable() < 0) {
                this.setMateable(this.getMateable() + 1);
            }
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

        if (!world.isRemote) {
            if (this.isInWater()) {
                this.setSitting(false);
                ticksSitted = 0;
            }
        }

        boolean flying = isFlying();
        if (sitCooldown > 0) {
            sitCooldown--;
        }

        if (!world.isRemote) {
            if ((!world.isAirBlock(new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up()))
                    && !world.getBlockState(new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up()).getBlock().isPassable(world, new BlockPos(this.posX, Math.floor(this.posY), this.posZ).up())
                    && this.posY % 1 > this.headHitHeight()) {
                //System.err.println("Is collided at head");
                this.setHeadCollided(true);
            } else {
                this.setHeadCollided(false);
            }

            if (this.getAttachmentPos() == null) {
                sitTickCt = 0;
                if (collided && sitCooldown == 0) {
                    sitCooldown = 5;
                    Vec3d vec3d = this.getPositionEyes(0);
                    Vec3d vec3d1 = this.getLook(0);
                    Vec3d vec3d2 = vec3d.add(vec3d1.x * 1, vec3d1.y * 1, vec3d1.z * 1);
                    RayTraceResult rayTrace = world.rayTraceBlocks(vec3d, vec3d2, true);
                    if (rayTrace != null && rayTrace.hitVec != null) {
                        BlockPos sidePos = rayTrace.getBlockPos();
                        if (world.isSideSolid(sidePos, rayTrace.sideHit) && rayTrace.sideHit != EnumFacing.UP && rayTrace.sideHit != EnumFacing.DOWN) {
                            this.setAttachmentPos(sidePos);
                            this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                            this.motionX = 0.0D;
                            //this.motionY = 0.0D;
                            this.motionZ = 0.0D;
                        }
                    }
                }
            } else {
                BlockPos pos = this.getAttachmentPos();
                if (world.isSideSolid(pos, this.getAttachmentFacing())) {
                    sitTickCt++;
                    sitCooldown = 150;
                    if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                        rotationYaw = 180;
                    } else if (this.getAttachmentFacing() == EnumFacing.EAST) {
                        rotationYaw = 270;
                    } else if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                        rotationYaw = 0;
                    } else if (this.getAttachmentFacing() == EnumFacing.WEST) {
                        rotationYaw = 90;
                    }
                    this.moveHelper.action = EntityMoveHelper.Action.WAIT;
                    if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                        this.posZ = this.getPosition().getZ() + ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                        this.posZ = this.getPosition().getZ() + 1 - ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.WEST) {
                        this.posX = this.getPosition().getX() + ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    if (this.getAttachmentFacing() == EnumFacing.EAST) {
                        this.posX = this.getPosition().getX() + 1 - ((this.getMaxWidth() * this.getAgeScale()) / 2F);
                    }
                    this.setAttachmentPos(this.getPosition().offset(this.getAttachmentFacing()));
                    if (this.climbingpause < 0 && !this.getHeadCollided()) {
                        this.motionY = this.getClimbSpeed();
                        //this.setIsMoving(true);
                    } else {
                        this.motionY = 0;
                        //this.setIsMoving(false);
                    }
                    this.motionX = 0.0D;
                    this.motionZ = 0.0D;
                } else {
                    this.setFlying();
                }
            }

            if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0 || this.getAttachmentPos() != null && (this.getAttackTarget() != null || this.getEatTarget() != null)) {
                if (checkFlyConditions() || rand.nextInt(3000) == 0) {
                    this.setFlying();
                }
            }
            if (flying && getFlyProgress() < 20.0F) {
                setFlyProgress(getFlyProgress() + 0.5F);
                if (sitProgress != 0)
                    sitProgress = 0F;
            } else if (!flying && getFlyProgress() > 0.0F) {
                setFlyProgress(getFlyProgress() - 0.5F);
                if (sitProgress != 0)
                    sitProgress = 0F;
            }

            if (this.getAttachmentPos() == null) {
                //Entity eatTarget = this.getEatTarget();
                //if (eatTarget != null) {
                //    if (eatTarget.posY > this.posZ) {
                //        this.motionY += 0.08D;
                //    }
                //}
                //else {
                if (this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER
                        || this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.LAVA) {
                    this.motionY += 0.12D;
                } else {
                    //this.motionY += 0.022D;
                }
                //}
            } else {
                this.moveHelper.action = EntityMoveHelper.Action.WAIT;
            }
            if (flying && this.ticksExisted % 20 == 0 && !world.isRemote && this.getAttachmentPos() == null && this.FlightSound() != null) {
                this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
                        .getObject(this.FlightSound()), this.getSoundVolume() * 0.5F, 1);
            }

            if (this.climbingpause >= -100) {
                this.climbingpause = this.climbingpause - this.rand.nextInt(3);
            }
            if (this.climbingpause < -100) {
                this.climbingpause = 100;
            }
        }

        if (world.isRemote && this.getAttachmentPos() != null) {
            if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                rotationYaw = 180;
            } else if (this.getAttachmentFacing() == EnumFacing.EAST) {
                rotationYaw = 270;
            } else if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                rotationYaw = 0;
            } else if (this.getAttachmentFacing() == EnumFacing.WEST) {
                rotationYaw = 90;
            }
        }
    }

    public boolean checkFlyConditions() {
        return true;
    }

    public int sitTickCtMax() {
        return 1150;
    }

    public int sitCooldownSetter() {
        return 1000 + rand.nextInt(1500);
    }

    @Override
    public boolean isMovementBlocked() {
        return this.getAttachmentPos() != null || this.collidedHorizontally;
    }

    public ResourceLocation FlightSound() {
        return new ResourceLocation("lepidodendron:anurognathid_flight");
    }

    public boolean isFlying() {
        return this.getAttachmentPos() == null;
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

        if (!world.isRemote) {
            if (this.getAttachmentPos() != null && this.climbingpause < 0 && !this.getHeadCollided()) {
                this.motionY = this.getClimbSpeed();
                //this.setIsMoving(true);
            } else {
                this.motionY = 0;
                //this.setIsMoving(false);
            }
        }

        if (!world.isRemote) {
            if (this.motionX != 0 || this.motionZ != 0 || this.motionY != 0) {
                this.setIsMoving(true);
            } else {
                this.setIsMoving(false);
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
        public FlightMoveHelper(EntityPrehistoricFloraLandClimbingFlyingBase insect) {
            super(insect);
            this.speed = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAISpeedLand();

        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                if (EntityPrehistoricFloraLandClimbingFlyingBase.this.collidedHorizontally) {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw += 180.0F;
                    this.speed = 0.1F;
                    BlockPos target = EntityPrehistoricFloraLandClimbingFlyingBase.getPositionRelativetoGround(EntityPrehistoricFloraLandClimbingFlyingBase.this, EntityPrehistoricFloraLandClimbingFlyingBase.this.world, EntityPrehistoricFloraLandClimbingFlyingBase.this.posX + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ + EntityPrehistoricFloraLandClimbingFlyingBase.this.rand.nextInt(15) - 7, EntityPrehistoricFloraLandClimbingFlyingBase.this.rand);
                    this.posX = target.getX();
                    this.posY = target.getY();
                    this.posZ = target.getZ();
                }
                double d0 = this.posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                double d1 = this.posY - EntityPrehistoricFloraLandClimbingFlyingBase.this.posY;
                double d2 = this.posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = MathHelper.sqrt(d3);

                if (d3 < EntityPrehistoricFloraLandClimbingFlyingBase.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionY *= 0.5D;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ *= 0.5D;
                } else {
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX += d0 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionY += d1 / d3 * 0.1D * this.speed;
                    EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ += d2 / d3 * 0.1D * this.speed;

                    if (EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget() == null && EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget() == null) {
                        EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(EntityPrehistoricFloraLandClimbingFlyingBase.this.motionX, EntityPrehistoricFloraLandClimbingFlyingBase.this.motionZ)) * (180F / (float) Math.PI);
                        EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                    } else {
                        if (EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget() != null) {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget().posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getEatTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                        }
                        else {
                            double d4 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget().posX - EntityPrehistoricFloraLandClimbingFlyingBase.this.posX;
                            double d5 = EntityPrehistoricFloraLandClimbingFlyingBase.this.getAttackTarget().posZ - EntityPrehistoricFloraLandClimbingFlyingBase.this.posZ;
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw = -((float) MathHelper.atan2(d4, d5)) * (180F / (float) Math.PI);
                            EntityPrehistoricFloraLandClimbingFlyingBase.this.renderYawOffset = EntityPrehistoricFloraLandClimbingFlyingBase.this.rotationYaw;
                        }
                    }
                }
            }
        }
    }
    
}