package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateWaterBottom;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.NodeProcessor;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraSwimmingBottomWalkingWaterBase extends EntityPrehistoricFloraAgeableBase {

    public Animation SWIM_ANIMATION;
    public Animation UNSWIM_ANIMATION;
    public Animation EAT_ANIMATION;
    private int inPFLove;
    private int jumpTicks;

    private static final DataParameter<Boolean> SWIMMING = EntityDataManager.createKey(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> SWIMTICK = EntityDataManager.createKey(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> WALKTICK = EntityDataManager.createKey(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.class, DataSerializers.VARINT);

    //standard constructor, calls the parent class, adds a navigator and creates three animations, eat, swim and unswim
    public EntityPrehistoricFloraSwimmingBottomWalkingWaterBase(World world) {
        super(world);
        this.selectNavigator();
        SWIM_ANIMATION = Animation.create(this.swimTransitionLength());
        UNSWIM_ANIMATION = Animation.create(this.unswimTransitionLength());
        EAT_ANIMATION = Animation.create(this.getEatLength());
    }

    //an array of all the animations
    @Override
    public Animation[] getAnimations() {
        return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, SWIM_ANIMATION, UNSWIM_ANIMATION};
    }
    //how long is the eat animation
    public int getEatLength() {
        return 10;
    }

    protected abstract double getAISpeedSwim();

    //how long is the transition animation length for walking -> swimming
    public abstract int swimTransitionLength();

    //how long is the transition animation length for swimming -> walking
    public abstract int unswimTransitionLength();

    //how long is the animals swimming (in ticks) gets reduced by a random amount each tick
    public abstract int swimLength();

    //how long is the animal walking (in ticks) gets reduced by a random amount each tick
    public abstract int walkLength();

    //if true, then is bucketable, else not bucketable
    public abstract boolean isSmall();

    //message if the animal cant be bucketed
    public String getBucketMessage() {
        return "is too grown up to fit into a bucket";
    }

    //checks if the animal is actually swimming
    public boolean getIsSwimming() {
        return this.dataManager.get(SWIMMING);
    }

    //sets the animal isSwimming variable to true if the data manager detects that the animal is swimming
    public void setIsSwimming(boolean isSwimming) {
        this.dataManager.set(SWIMMING, isSwimming);
    }

    //returns the length, in ticks, of the swim cycle
    public int getSwimTick() {
        return this.dataManager.get(SWIMTICK);
    }
    //sets the length, in ticks, of the swim cycle
    public void setSwimTick(int swimTick) {
        this.dataManager.set(SWIMTICK, swimTick);
    }
    //returns the length, in ticks, of the walk cycle
    public int getWalkTick() {
        return this.dataManager.get(WALKTICK);
    }
    //sets the length, in ticks, of the walk cycle
    public void setWalkTick(int swimTick) {
        this.dataManager.set(WALKTICK, swimTick);
    }


    @Override
    public boolean isAIDisabled() {
        return false;
    }

    @Override
    public String getTexture() {
        return this.getTexture();
    }

    //checks if the animal is underwater
    @Override
    public boolean isInWater() {
        return super.isInWater() || (this.world.getBlockState(this.getPosition()).getMaterial() == Material.WATER) || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
    }

    //a more strict check if the animal is underwater
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
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean isPushedByWater() {
        return false;
    }


    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SWIMMING, false);
        this.dataManager.register(SWIMTICK, 0);
        this.dataManager.register(WALKTICK, this.rand.nextInt(this.walkLength() + 1));
        this.setScaleForAge(false);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setIsSwimming(false);
        this.setSwimTick(0);
        this.setWalkTick(this.rand.nextInt(this.walkLength() + 1));
        return livingdata;
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("pfswimming", this.getIsSwimming());
        compound.setInteger("pfswimtick", this.getSwimTick());
        compound.setInteger("pfwalktick", this.getWalkTick());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setIsSwimming(compound.getBoolean("pfswimming"));
        this.setSwimTick(compound.getInteger("pfswimtick"));
        this.setWalkTick(compound.getInteger("pfwalktick"));
    }

    @Override
    public void selectNavigator() {
        //Swimming:
        if (this.isReallySwimming()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.SwimmingMoveHelper))
                    || (!(this.navigator instanceof PathNavigateSwimmer))) {
                this.moveHelper = new EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmer(this, world);
            }
        }
        //Walking:
        else if ((!(this.moveHelper instanceof WalkMoveHelper))
                || (!(this.navigator instanceof PathNavigateWaterBottom))) {
            this.moveHelper = new EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.WalkMoveHelper();
            this.navigator = new PathNavigateWaterBottom(this, world);
        }
    }

    public float getMaxTurnDistancePerTick() {
        return 20;
    }

    public float maxTurnAngle() {
        if (this.getIsFast() || this.isInLove() || (this.getEatTarget() != null)) {
            return 1000F;
        }
        if (this.width <= 0.5) {
            return 10F;
        }
        float i = Math.min(this.width - 0.5F, 1.5F) - 0.5F; //returns a number from 0 to 1
        return 10F - (i * 9F); //returns a number from 10 to 1
    }

    //a stricter check on if the animal is swimming, (It is not doing its transition animation)
    public boolean isReallySwimming() {
        return this.getIsSwimming() && this.getAnimation() != this.SWIM_ANIMATION;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (!this.world.isRemote && !this.isReallySwimming()) {
            this.setIsSwimming(true);
            this.setAnimation(SWIM_ANIMATION);
            this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
        }

        return super.attackEntityFrom(source, amount);
    }

    public void onEntityUpdate() {
        super.onEntityUpdate();

        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !isInWater()) {
            --i;
            this.setAir(i);

            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
            }
        } else {
            this.setAir(300);
        }

        if (!world.isRemote) {
            if (this.getSwimTick() > 0) {
                this.setSwimTick(this.getSwimTick() - this.rand.nextInt(3));
                if (this.getSwimTick() < 0) {
                    this.setSwimTick(0);
                }
            }
            if (this.getWalkTick() > 0) {
                this.setWalkTick(this.getWalkTick() - this.rand.nextInt(3));
                if (this.getWalkTick() < 0) {
                    this.setWalkTick(0);
                }
            }

            if ((!(this.getSwimTick() > 0)) && this.getIsSwimming()) {
                this.setIsSwimming(false);
                this.setAnimation(UNSWIM_ANIMATION);
                this.setWalkTick(this.walkLength() + this.UNSWIM_ANIMATION.getDuration());
            }

            if ((!(this.getWalkTick() > 0)) && !this.getIsSwimming()) {
                this.setIsSwimming(true);
                this.setAnimation(SWIM_ANIMATION);
                this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
            }

            //System.err.println("IsSwimming: " + this.isReallySwimming() + " walkTick " + this.getWalkTick() + " swimTick " + this.getSwimTick());

        }

    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
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
    public void travel(float strafe, float vertical, float forward) {
        float f4;
        //IF IS SWIMMING:
        if (this.isReallySwimming()) {
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

                    if (this.motionX != 0 || this.motionZ != 0) {
                        this.setIsMoving(true);
                    } else {
                        this.setIsMoving(false);
                    }

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

                    int body = (int) Math.floor(this.posY + (this.height/2D) + 0.1);
                    if (this.getAttackTarget() != null) {
                        EntityLivingBase target = this.getAttackTarget();
                        if ((world.getBlockState(target.getPosition()).getMaterial() == Material.WATER
                                || world.getBlockState(target.getPosition().down()).getMaterial() == Material.WATER)
                                && target.posY > this.posY
                                && this.getDistance(target) <= (this.getAttackBoundingBox().getAverageEdgeLength() + target.getEntityBoundingBox().getAverageEdgeLength())
                                && isDirectPathBetweenPoints(this.getPositionVector(), target.getPositionVector())
                                && (world.getBlockState(new BlockPos(this.getPosition().getX(), body, this.getPosition().getZ())).getMaterial() == Material.WATER)
                        ) {
                            this.motionY = 0.125;
                        }
                        //Also descend if need to swim further to re-hit the target:
                        int eyes = (int) Math.floor(this.posY + this.getEyeHeight());
                        if (this.getDistance(target) > (this.getAttackBoundingBox().getAverageEdgeLength() + target.getEntityBoundingBox().getAverageEdgeLength())
                                && world.getBlockState(new BlockPos(this.getPosition().getX(), eyes, this.getPosition().getZ())).getMaterial() != Material.WATER
                                && world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER
                        ) {
                            this.motionY = -0.075;
                        }
                    }
                    else { //descend if there is no target
                        int eyes = (int) Math.floor(this.posY + this.getEyeHeight());
                        if (world.getBlockState(new BlockPos(this.getPosition().getX(), eyes, this.getPosition().getZ())).getMaterial() != Material.WATER
                                && (world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER)) {
                            this.motionY = -0.075;
                        }
                    }

                } else { //is not in water:
                    super.travel(strafe, vertical, forward);
                    //Make fish sink properly if it is somehow "beached" at the top (which should be impossible in theory)
                    if (world.getBlockState(this.getPosition().down()).getMaterial() == Material.WATER) {
                        this.motionY = -0.075;
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
        else {
        //IS WALKING:
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
                    } else {
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
    }

    @Override
    public void onLivingUpdate() {

        if (!this.world.isRemote) {
            selectNavigator();
        }

        //IF IS SWIMMING:
        if (this.isReallySwimming()) {
            super.onLivingUpdate();
            this.renderYawOffset = this.rotationYaw;
        }
        else {
            //ELSE:
            //Updated from vanilla to allow underwater jumping:
            if (this.jumpTicks > 0) {
                --this.jumpTicks;
            }

            if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer()) {
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

            if (this.inPFLove > 0) {
                --this.inPFLove;
            }

            if (this.getMateable() < 0) {
                this.setMateable(this.getMateable() + 1);
            }
        }

    }


    public class WalkMoveHelper extends EntityMoveHelper {

        private final EntityPrehistoricFloraSwimmingBottomWalkingWaterBase EntityBase = EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.this;

        public WalkMoveHelper() {
            super(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.this);
        }

        public void onUpdateMoveHelper() {
            if (this.action == Action.STRAFE) {
                //float f = (float) this.EntityBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue();
                float f = (float)getAISpeedSwim();
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
                this.EntityBase.setAIMoveSpeed((float) (0.4f * this.speed * (float)getAISpeedSwim()));


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
                this.EntityBase.setAIMoveSpeed((float) (this.speed * (float)getAISpeedSwim()));
                this.EntityBase.motionY += 0.04D;
                if (this.EntityBase.onGround) {
                    this.action = Action.WAIT;
                }
            } else {
                this.EntityBase.setMoveForward(0.0F);
            }
        }
    }

    class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraSwimmingBottomWalkingWaterBase EntityBase = EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            //System.err.println("Action " + this.action);
            //System.err.println("NoPath " + this.EntityBase.getNavigator().noPath());
            if (this.action == Action.MOVE_TO && !this.EntityBase.getNavigator().noPath()) {
                double distanceX = this.posX - this.EntityBase.posX;
                double distanceY = this.posY - this.EntityBase.posY;
                double distanceZ = this.posZ - this.EntityBase.posZ;
                double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                distance = MathHelper.sqrt(distance);
                distanceY /= distance;
                float angle = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;

                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, this.EntityBase.maxTurnAngle());
                float speed = (float)getAISpeedSwim();
                this.EntityBase.setAIMoveSpeed(speed);

//                if (this.EntityBase.isAtBottom() && this.EntityBase.isSlowAtBottom()) {
//                    this.EntityBase.setAIMoveSpeed(speed * 0.25F);
//                }

                if (this.EntityBase.getEatTarget() != null) {
                    if (this.EntityBase.posY > this.EntityBase.getEatTarget().posY && distance <= 1) {
                        //System.err.println("Above food");
                        this.EntityBase.motionY = -0.075;
                    }
                    else {
                        this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
                    }
                }
                else if (this.EntityBase.getAttackTarget() != null) {
                    if (this.EntityBase.posY > this.EntityBase.getAttackTarget().posY && distance <= 1) {
                        //System.err.println("Above prey");
                        this.EntityBase.motionY += -(double) this.EntityBase.getAIMoveSpeed() * 0.1D;
                    }
                    else {
                        this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
                    }
                }
                else {
                    this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
                }
            } else {
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }
}
