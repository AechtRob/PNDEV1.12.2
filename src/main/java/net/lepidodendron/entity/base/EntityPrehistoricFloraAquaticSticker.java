package net.lepidodendron.entity.base;

import com.google.common.base.Optional;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.lepidodendron.entity.util.PathNavigateFlyingNoWater;
import net.lepidodendron.entity.util.ShoalingHelper;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandSenderWrapper;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityBoat;
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
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.*;
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
import java.util.Random;

public abstract class EntityPrehistoricFloraAquaticSticker extends EntityPrehistoricFloraFishBase implements IAnimatedEntity, IPrehistoricDiet {
    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;

    private static final DataParameter<Boolean> SITTING = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.BOOLEAN);
    protected static final DataParameter<EnumFacing> SIT_FACE = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.FACING);
    protected static final DataParameter<Optional<BlockPos>> SIT_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraAquaticSticker.class, DataSerializers.OPTIONAL_BLOCK_POS);


    public int sitCooldown = 0;
    public int alarmCooldown;
    public int sitTickCt = 0;
    public float sitProgress;
    public int ticksSitted;
    protected boolean isSitting;
    public boolean isAttached = false;

    public EntityPrehistoricFloraAquaticSticker(World world) {
        super(world);
        this.enablePersistence();
        if (world != null) {
            if (this.isSlowAtBottom()) {
                this.moveHelper = new EntityPrehistoricFloraAquaticSticker.SwimmingMoveHelperBase();
            } else {
                this.moveHelper = new EntityPrehistoricFloraAquaticSticker.SwimmingMoveHelper();
            }
            this.navigator = new PathNavigateSwimmer(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
    }

    public void setNavigator() {
        if (this.isSlowAtBottom()) {
            this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelperBase();
        } else {
            this.moveHelper = new EntityPrehistoricFloraFishBase.SwimmingMoveHelper();
        }
        this.navigator = new PathNavigateSwimmer(this, world);
    }


    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SITTING, false);
        this.dataManager.register(SIT_FACE, EnumFacing.DOWN);
        this.dataManager.register(SIT_BLOCK_POS, Optional.absent());
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

    @Override
    public boolean isMovementBlocked() {
        return isSitting();
    }

    public boolean isMovementBlockedSoft() {
        return isMovementBlocked() ;
    }

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

    }

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

    @Override
    public boolean attackEntityFrom(DamageSource ds, float f) {
        this.sitTickCt = 0;
        sitCooldown = 1500 + rand.nextInt(1200);
        this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
        this.setAttachmentPos(null);
        return super.attackEntityFrom(ds, f);
    }

    public boolean isSwimming() {
        return this.isReallyInWater() && ! this.isSitting();
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.renderYawOffset = this.rotationYaw;

        if (this.isSitting()) {
            ticksSitted++;

        }
        if (!world.isRemote && !this.isBeingRidden() && !this.isSitting() && this.getRNG().nextInt(1000) == 1 && (this.getAnimation() == NO_ANIMATION)) {
            this.setSitting(true);
            ticksSitted = 0;
        }

        if (!world.isRemote && (this.isSitting() && ticksSitted > 100 && this.getRNG().nextInt(100) == 1)) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        if (!this.isInWater()) {
            this.setSitting(false);
            ticksSitted = 0;
        }

        if (sitCooldown > 0) {
            sitCooldown--;
        }

        //TODO this bit is unsure, I want to check if the mod is adjacent to a wall, and if adjacent AND sitCooldown is = 0, then attach, and mob will be rotated in render
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
                    try {
                        if (world.isSideSolid(sidePos, rayTrace.sideHit)) {
                            this.setAttachmentPos(sidePos);
                            this.dataManager.set(SIT_FACE, rayTrace.sideHit.getOpposite());
                            this.motionX = 0.0D;
                            this.motionY = 0.0D;
                            this.motionZ = 0.0D;
                        }
                    }
                    catch (Error e) {}
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
                if (this.getAttachmentFacing() == EnumFacing.NORTH) {
                    this.posZ = this.getPosition().getZ() + (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.SOUTH) {
                    this.posZ = this.getPosition().getZ() + 1 - (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.WEST) {
                    this.posX = this.getPosition().getX() + (this.width / 2F);
                }
                if (this.getAttachmentFacing() == EnumFacing.EAST) {
                    this.posX = this.getPosition().getX() + 1 - (this.width / 2F);
                }
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            } else {
                this.sitTickCt = 0;
                this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
                this.setAttachmentPos(null);
            }

        }
        if (sitTickCt > this.sitTickCtMax() && rand.nextInt(123) == 0 || this.getAttachmentPos() != null) {
            this.sitTickCt = 0;
            sitCooldown = this.sitCooldownSetter();
            this.dataManager.set(SIT_FACE, EnumFacing.DOWN);
            this.setAttachmentPos(null);
        }



    }

    public int sitTickCtMax() {
        return 1150;
    }

    public int sitCooldownSetter() {
        return 1000 + rand.nextInt(1500);
    }

    //TODO not sure how this works
    public static BlockPos getPositionRelativetoWater(Entity entity, World world, double x, double z, Random rand) {
        BlockPos pos = new BlockPos(x, entity.posY, z);

        // Search for the first water block or solid ground below the entity
        while (world.getBlockState(pos.down()).getMaterial() == Material.WATER && pos.getY() > 0) {
            pos = pos.down();
        }


        return pos;
    }

    public class AIWanderAquaticSticker extends EntityAIBase {
        BlockPos target;
        protected EntityPrehistoricFloraAquaticSticker PrehistoricFloraFishBase;

        public AIWanderAquaticSticker(EntityPrehistoricFloraAquaticSticker PrehistoricFloraAquaticSticker) {
            this.setMutexBits(4);
            this.PrehistoricFloraFishBase = PrehistoricFloraAquaticSticker;
        }

        public boolean isAutomatic() {
            return true;
        }

        @Override
        public void startExecuting() {
            super.startExecuting();
        }

        @Override
        public boolean shouldExecute() {
            if (!this.PrehistoricFloraFishBase.isInWater()) {
                return false;
            }
            if (this.PrehistoricFloraFishBase.getRNG().nextFloat() < 0.5F) {
                Path path = this.PrehistoricFloraFishBase.getNavigator().getPath();
                if (
                        ((!this.PrehistoricFloraFishBase.getNavigator().noPath())
                                && (!isDirectPathBetweenPoints(this.PrehistoricFloraFishBase, this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z))))
                                ||
                                (path != null && path.getFinalPathPoint() != null
                                        && this.PrehistoricFloraFishBase.getDistanceSq(path.getFinalPathPoint().x, path.getFinalPathPoint().y, path.getFinalPathPoint().z) <= Math.pow(this.PrehistoricFloraFishBase.width,2))
                )
                {
                    this.PrehistoricFloraFishBase.getNavigator().clearPath();
                }
                if (this.PrehistoricFloraFishBase.getNavigator().noPath()) {
                    Vec3d vec3 = this.findWaterTarget();
                    if (vec3 != null) {
//                    double Xoffset = this.PrehistoricFloraFishBase.posX - this.PrehistoricFloraFishBase.getPosition().getX();
//                    double Zoffset = this.PrehistoricFloraFishBase.posZ - this.PrehistoricFloraFishBase.getPosition().getZ();
                        this.PrehistoricFloraFishBase.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, 1.0);

                        return true;
                    }
                }
            }
            //System.err.println("No path found");
            return false;
        }

        public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
            RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
            return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
        }

        @Override
        public boolean shouldContinueExecuting() {
            return false;
        }

        public Vec3d findWaterTarget() {
            Random rand = this.PrehistoricFloraFishBase.getRNG();
            if (this.PrehistoricFloraFishBase.getAttackTarget() == null) {
                for (int i = 0; i < 10; i++) {
                    Vec3d randPos = this.PrehistoricFloraFishBase.getPositionVector().add(rand.nextInt(17) - 8, rand.nextInt(9) - 4, rand.nextInt(17) - 8);
                    if (this.PrehistoricFloraFishBase.world.isBlockLoaded(new BlockPos(randPos))) {
                        //System.err.println("Target " + randPos.getX() + " " + this.PrehistoricFloraFishBase.getPosition().getY() + " " + randPos.getZ());
                        if (this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(randPos)).getMaterial() == Material.WATER && this.PrehistoricFloraFishBase.isDirectPathBetweenPoints(this.PrehistoricFloraFishBase.getPositionVector(), new Vec3d(randPos.x, randPos.y, randPos.z))) {
                            if (!(randPos.y < 1 || randPos.y >= 254)) {
                                return randPos;
                            }
                        }
                    }
                }
            } else {
                Vec3d blockpos1;
                blockpos1 = this.PrehistoricFloraFishBase.getAttackTarget().getPositionVector();
                if (this.PrehistoricFloraFishBase.world.getBlockState(new BlockPos(blockpos1)).getMaterial() == Material.WATER) {
                    return blockpos1;
                }
            }
            return null;
        }

        public void updateTask() {
            super.updateTask();
        }
    }



}