package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPrehistoricFloraAgeableFishBase extends EntityPrehistoricFloraAgeableBase {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    public EntityPrehistoricFloraAgeableFishBase(World world) {
        super(world);
        //this.spawnableBlock = Blocks.WATER;
        if (this.isBase()) {
            this.moveHelper = new EntityPrehistoricFloraAgeableFishBase.SwimmingMoveHelperBase();
        }
        else{
            this.moveHelper = new EntityPrehistoricFloraAgeableFishBase.SwimmingMoveHelper();
        }
        this.navigator = new PathNavigateSwimmer(this, world);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_aquatic.name");
    }

    public String getBucketMessage() {
        return "is too grown up to fit into a bucket";
    }

    protected void initEntityAI() {}

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    public abstract String getTexture();

    public abstract boolean isSmall();

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    protected abstract float getAISpeedFish();

    public float getTravelSpeed() {
        return this.getAISpeedFish();
    }

    protected abstract boolean isBase();

    public boolean isPushedByWater()
    {
        return false;
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
            this.setAir(this.airTime());
        }
    }

    public int airTime() {
        return 300;
    }

    public float maxTurnAngle() {
        if (this.getIsFast() || this.isInLove() || (this.getEatTarget() != null)) {
           //System.err.println("MaxAngle " + (float)Math.toRadians(180D));
            return 1000F;
        }
        if (this.width <= 0.5) {
            return 10F;
        }
        float i = Math.min(this.width - 0.5F, 1.5F) - 0.5F; //returns a number from 0 to 1
        return 10F - (i * 9F); //returns a number from 10 to 1
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

    class SwimmingMoveHelperBase extends EntityMoveHelper {
        private final EntityPrehistoricFloraAgeableFishBase EntityBase = EntityPrehistoricFloraAgeableFishBase.this;

        public SwimmingMoveHelperBase() {
            super(EntityPrehistoricFloraAgeableFishBase.this);
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

                //this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, 1000);
                this.EntityBase.rotationYaw = this.limitAngle(this.EntityBase.rotationYaw, angle, this.EntityBase.maxTurnAngle());
                float speed = getAISpeedFish();
                this.EntityBase.setAIMoveSpeed(speed);

                if (this.EntityBase.isAtBottom()) {
                    this.EntityBase.setAIMoveSpeed(speed * 0.25F);
                }

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

    class SwimmingMoveHelper extends EntityMoveHelper {
        private final EntityPrehistoricFloraAgeableFishBase EntityBase = EntityPrehistoricFloraAgeableFishBase.this;

        public SwimmingMoveHelper() {
            super(EntityPrehistoricFloraAgeableFishBase.this);
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
                float speed = getAISpeedFish();
                this.EntityBase.setAIMoveSpeed(speed);

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