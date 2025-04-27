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

public abstract class EntityPrehistoricFloraBiQuadLandBase extends EntityPrehistoricFloraLandBase {

    public BlockPos currentTarget;
    @SideOnly(Side.CLIENT)
    public ChainBuffer chainBuffer;
//    private int quadTicks;
//    private int biTicks;
    public Animation TOQUAD_ANIMATION;
    public Animation TOBI_ANIMATION;
//    public boolean isQuad = true;
    private static final DataParameter<Boolean> ISQUAD = EntityDataManager.createKey(EntityPrehistoricFloraBiQuadLandBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> BITICKS = EntityDataManager.createKey(EntityPrehistoricFloraBiQuadLandBase.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> QUADTICKS = EntityDataManager.createKey(EntityPrehistoricFloraBiQuadLandBase.class, DataSerializers.VARINT);


    public EntityPrehistoricFloraBiQuadLandBase(World world) {
        super(world);
        if (world != null) {
            if (this.isSwimmingInWater() && this.canSwim()) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraBiQuadLandBase.SwimmingMoveHelper))
                        || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                    this.moveHelper = new EntityPrehistoricFloraBiQuadLandBase.SwimmingMoveHelper();
                    this.navigator = new PathNavigateSwimmerTopLayer(this, world);
                }
            }
            else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
                if ((!(this.moveHelper instanceof EntityPrehistoricFloraBiQuadLandBase.WanderMoveHelper))
                        || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                    this.moveHelper = new EntityPrehistoricFloraBiQuadLandBase.WanderMoveHelper();
                    this.navigator = new PathNavigateGroundNoWater(this, world);
                }
            }
            if (FMLCommonHandler.instance().getSide().isClient()) {
                this.chainBuffer = new ChainBuffer();
            }
        }
        TOQUAD_ANIMATION = Animation.create(this.getToQuadTransitionLength());
        TOBI_ANIMATION = Animation.create(this.getToBiTransitionLength());
    }

    /**
     * Ticks for the transition animation of Bipedal - to  - Quadrupedal animation
     * @return
     */
    public abstract int getToQuadTransitionLength();

    /**
     * Ticks for the transition animation of Quadrupedal - to  - Bipedal animation
     * @return
     */
    public abstract int getToBiTransitionLength();

    @Override
    public Animation[] getAnimations() {
        return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, TOBI_ANIMATION, TOQUAD_ANIMATION};
    }

    public boolean isQuad() {
        return this.dataManager.get(ISQUAD);
    }

    public void setIsQuad(boolean sitting) {
        this.dataManager.set(ISQUAD, sitting);
    }

    public int getQuadTicks() {
        return this.dataManager.get(QUADTICKS);
    }

    public void setQuadTicks(int ticks) {
        this.dataManager.set(QUADTICKS, ticks);
    }

    public int getBiTicks() {
        return this.dataManager.get(BITICKS);
    }

    public void setBiTicks(int ticks) {
        this.dataManager.set(BITICKS, ticks);
    }

    @Override
    /**
     * Override this in order to set which mode is the default mode. By default, Quadrupedal is the default walking mode
     * While in quadrupedal mode, quadTicks ticks down, when quadTicks reaches zero, switch to bipedal mode, and set random biTicks
     */
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setBiTicks(0);
        this.setQuadTicks(rand.nextInt(2500));
        return livingdata;
    }

    public void setBipedal() {
        if (!world.isRemote) {
            //not in transition, not quad, and quadrupedal time is up
            System.out.println("here");
            if (this.getAnimation() != this.TOBI_ANIMATION && this.isQuad() && this.getQuadTicks() <= 0) {
                if (this.onGround) {
                    this.setAnimation(TOBI_ANIMATION);
                }
            }
            this.setBiTicks(rand.nextInt(2500) + this.getToBiTransitionLength());
            this.setQuadTicks(0);
            this.setIsQuad(false);
        }
    }

    public void setQuadrupedal() {
        if (!world.isRemote) {
            //not in transition, not quad, and quadrupedal time is up
            if (this.getAnimation() != this.TOQUAD_ANIMATION && !this.isQuad() && this.getBiTicks() <= 0) {
                if (this.onGround) {
                    this.setAnimation(TOQUAD_ANIMATION);
                }
            }
            this.setBiTicks(0);
            this.setQuadTicks(rand.nextInt(2500)+ this.getToQuadTransitionLength());
            this.setIsQuad(true);
        }
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(ISQUAD, true);
        this.dataManager.register(BITICKS, 0);
        this.dataManager.register(QUADTICKS, rand.nextInt(2500) + this.getToQuadTransitionLength());
        this.setScaleForAge(false);
    }
    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("animationcountdown", this.getAnimationCountdown());
        compound.setBoolean("IsQuad", this.isQuad());
        compound.setInteger("BiCooldown", this.getBiTicks());
        compound.setInteger("QuadCooldown", this.getQuadTicks());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setAnimationCountdown(compound.getInteger("animationcountdown"));
        this.dataManager.set(BITICKS, compound.getInteger("BiCooldown"));
        this.dataManager.set(QUADTICKS, compound.getInteger("QuadCooldown"));
        this.dataManager.set(ISQUAD, compound.getBoolean("IsQuad"));


    }


    @Override
    public void selectNavigator () {
        if (this.isSwimmingInWater() && this.canSwim()) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraBiQuadLandBase.SwimmingMoveHelper))
                || (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
                this.moveHelper = new EntityPrehistoricFloraBiQuadLandBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            }
        }

        else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
            if ((!(this.moveHelper instanceof EntityPrehistoricFloraBiQuadLandBase.WanderMoveHelper))
                || (!(this.navigator instanceof PathNavigateGroundNoWater))) {
                this.moveHelper = new EntityPrehistoricFloraBiQuadLandBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
            }
        }
    }


    @Override
    public boolean attackEntityFrom(DamageSource ds, float i) {
        if (this.getAnimationCountdown() >= 0) {
            this.setAnimationCountdown(-1);
        }
        if (!(this instanceof EntityPrehistoricFloraBiQuadLandBase)) {
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

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public int getTalkInterval() {
        return 120;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    //TODO extract frog switching into here, but dont forget to make it play proper transition animation first
    @Override
    public void onLivingUpdate()
    {

        super.onLivingUpdate();
        if(!world.isRemote) {
            //is bipedal, decrease bipedal ticks
            if (this.getBiTicks() > 0 && !this.isQuad()) {
                this.setBiTicks(this.getBiTicks() - 1);
            }

            //is jumping, decrease walking cooldown
            if (this.getQuadTicks() > 0 && this.isQuad()) {
                this.setQuadTicks(this.getQuadTicks() - 1);
            }

            //switch to quad if currently in bipedal mode
            if (this.getQuadTicks() <= 0 && this.getBiTicks() <= 0 && !this.isQuad() && (!this.isAnimationDirectionLocked(this.getAnimation()))) {
                this.setQuadrupedal();
            }
            //switch to bipedal if currently in quad mode
            else if (this.getQuadTicks() <= 0 && this.getBiTicks() <= 0 && this.isQuad() && (!this.isAnimationDirectionLocked(this.getAnimation()))) {
                this.setBipedal();
            }
            else if(this.getQuadTicks() == 0 && this.getBiTicks() == 0) {
                this.setBiTicks(this.getBiTicks() + 100);
                this.setIsQuad(false);
            }
            if(this.getIsFast() && this.isQuad()) {
                this.setBipedal();
                this.setBiTicks(50+this.getEatLength());
                this.setIsQuad(false);
            }
        }

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




        this.renderYawOffset = this.rotationYaw;

        if (!this.world.isRemote) {
            selectNavigator();
        }



    }

}