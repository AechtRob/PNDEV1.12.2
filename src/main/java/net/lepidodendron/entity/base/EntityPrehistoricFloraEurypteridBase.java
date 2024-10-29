package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.block.BlockEggsWater;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPrehistoricFloraEurypteridBase extends EntityPrehistoricFloraAgeableBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    public EntityPrehistoricFloraEurypteridBase(World world) {
        super(world);
        //this.spawnableBlock = Blocks.WATER;
        if (world != null) {
            this.moveHelper = new EntityPrehistoricFloraEurypteridBase.SwimmingMoveHelper();
            this.navigator = new PathNavigateSwimmer(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_aquatic.name");
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    public abstract String getTexture();

    protected abstract float getAISpeedEurypterid();

    public abstract boolean isSmall();

    public String getBucketMessage() {
        return "is too grown up to fit into a bucket";
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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

    // @Nullable
    // protected ResourceLocation getLootTable() {
    //     return PrehistoricEntityType.FISH_LOOT;
    // }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    //public void swimTowardsTarget() {
    //    if (currentTarget != null && isTargetInWater() && this.inWater) {
    //        double targetX = currentTarget.getX() + 0.5D - posX;
    //        double targetY = currentTarget.getY() + 1D - posY;
    //        double targetZ = currentTarget.getZ() + 0.5D - posZ;
    //        motionX += (Math.signum(targetX) * 0.5D - motionX) * 0.100000000372529 * getSwimSpeed(); // 0.10000000149011612D
    //        motionY += (Math.signum(targetY) * 0.5D - motionY) * 0.100000000372529 * getSwimSpeed();// 0.10000000149011612D
    //        motionZ += (Math.signum(targetZ) * 0.5D - motionZ) * 0.100000000372529 * getSwimSpeed(); // 0.10000000149011612D
    //       float angle = (float) (Math.atan2(motionZ, motionX) * 180.0D / Math.PI) - 90.0F;
    //        float rotation = MathHelper.wrapDegrees(angle - rotationYaw);
    //        moveForward = 0.5F;
    //        rotationYaw += rotation;
     //   }
    //}

    protected abstract double getSwimSpeed();

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

    //protected boolean isTargetInWater() {
    //    return currentTarget != null && (world.getBlockState(new BlockPos(currentTarget.getX(), currentTarget.getY(), currentTarget.getZ())).getMaterial() == Material.WATER && world.getBlockState(new BlockPos(currentTarget.getX(), currentTarget.getY() + 1, currentTarget.getZ())).getMaterial() == Material.WATER);
    //}

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
        //this.renderYawOffset = this.rotationYaw;
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

        //Lay eggs perhaps:
        if ((!this.dropsEggs()) && (!this.laysEggs()) && (createPFChild(this) == null)) {
            if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getCanBreed() && this.getLaying() && this.getTicks() > 0
                    && (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())
                    || BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down()))
            ) {
                //if (Math.random() > 0.5) {
                this.setTicks(-50); //Flag this as stationary for egg-laying
                //}
            }

            if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getTicks() > -47 && this.getTicks() < 0) {
                //Is stationary for egg-laying:
                //System.err.println("Test2");
                IBlockState eggs = BlockEggsWater.block.getDefaultState();
                if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())) {
                    if (!(world.isRemote)) {
                        world.setBlockState(this.getPosition(), eggs);
                        world.setTileEntity(this.getPosition(), new BlockEggsWater.TileEntityCustom());
                        TileEntity te = world.getTileEntity(this.getPosition());
                        te.getTileData().setString("creature", getEntityId(this));
                        if (this.hasPNVariants() && this.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", this.getPNTypeName());
                        }
                    }
                    this.setLaying(false);
                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }
                if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down())) {
                    if (!(world.isRemote)) {
                        world.setBlockState(this.getPosition().down(), eggs);
                        world.setTileEntity(this.getPosition().down(), new BlockEggsWater.TileEntityCustom());
                        TileEntity te = world.getTileEntity(this.getPosition().down());
                        te.getTileData().setString("creature", getEntityId(this));
                        if (this.hasPNVariants() && this.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", this.getPNTypeName());
                        }
                    }
                    this.setLaying(false);
                    this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }
                this.setTicks(0);
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


                if (this.getEatTarget() != null) { //help to eat items on the bottom:
                    Entity target = this.getEatTarget();
                    if (world.getBlockState(target.getPosition()).getMaterial() == Material.WATER
                            && target.posY < this.posY
                            && (target.getPosition() == this.getPosition().down() || target.getPosition() == this.getPosition())
                    ) {
                        this.motionY = -0.125;
                    }
                }
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
        private final EntityPrehistoricFloraEurypteridBase EntityBase = EntityPrehistoricFloraEurypteridBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraEurypteridBase.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            //System.err.println(this.EntityBase.getClass() + " Action target" + this.posX + " " + this.posY + " "  + this.posZ);
            //System.err.println("NoPath " + this.EntityBase.getNavigator().noPath());
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
                float speed = getAISpeedEurypterid();
                this.EntityBase.setAIMoveSpeed(speed);

                if (this.EntityBase.isAtBottom()) {
                    this.EntityBase.setAIMoveSpeed(speed * 0.5F);
                    //System.err.println("At bottom!");
                }

                //For testing purposes:
                //this.EntityBase.setAIMoveSpeed(0.0F);

                this.EntityBase.motionY += (double) this.EntityBase.getAIMoveSpeed() * distanceY * 0.1D;
            } else {
                //System.err.println("Exception: " + this.EntityBase.getNavigator());
                this.EntityBase.setAIMoveSpeed(0.0F);
            }
        }
    }

    @Override
    public void eatItem(ItemStack stack) { //Jus removing the attack animation from their eating
        if (stack != null && stack.getItem() != null) {
            this.setHealth(Math.min(this.getHealth() + 0.5F, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
            stack.shrink(1);
            if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
                //this.setAnimation(ATTACK_ANIMATION);
                //this.setAnimation(ATTACK_ANIMATION);
                SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }
}