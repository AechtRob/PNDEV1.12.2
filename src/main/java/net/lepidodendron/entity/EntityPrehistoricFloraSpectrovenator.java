
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandCarnivoreBase;
import net.lepidodendron.entity.render.entity.RenderSpectrovenator;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraSpectrovenator extends EntityPrehistoricFloraLandCarnivoreBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation GRAPPLE_ANIMATION;

	public EntityPrehistoricFloraSpectrovenator(World world) {
		super(world);
		setSize(0.6F, 0.9F);
		minWidth = 0.20F;
		maxWidth = 0.6F;
		maxHeight = 0.9F;
		maxHealthAgeable = 20.0F;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		GRAPPLE_ANIMATION = Animation.create(this.getGrappleLength());

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int grappleChance() {
		return 4000;
	}

	@Override
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple || this.getIsCuriousWalking()) {
			return false;
		}
		List<EntityPrehistoricFloraSpectrovenator> Spectrovenator = world.getEntitiesWithinAABB(EntityPrehistoricFloraSpectrovenator.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityPrehistoricFloraSpectrovenator currentSpectrovenator : Spectrovenator) {
			if ((!currentSpectrovenator.getIsCuriousWalking()) && currentSpectrovenator.isPFAdult() && this.isPFAdult() && currentSpectrovenator != this && (!currentSpectrovenator.willGrapple) && this.canEntityBeSeen(currentSpectrovenator)) {
				this.setGrappleTarget(currentSpectrovenator);
				currentSpectrovenator.willGrapple = true;
				this.willGrapple = true;
				currentSpectrovenator.setGrappleTarget(this);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean grappleEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(this.getGrappleAnimation());
			//System.err.println("set attack");
		}
		return false;
	}
	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == GRAPPLE_ANIMATION
				|| super.isAnimationDirectionLocked(animation);
	}

	public int getGrappleLength() {
		return 170;
	}

	@Override
	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}


	@Override
	public int getWalkCycleLength() {
		return 50;
	}

	@Override
	public int getFootstepOffset() {
		return 10;
	}

	@Override
	public int getRunCycleLength() {
		return 20;
	}

	@Override
	public int getRunFootstepOffset() {
		return 0;
	}

	@Override
	public int getEatTick() {return 12;}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //large
	}

	public static String getPeriod() {return "Early Cretaceous";}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public int getRoarLength() {
		return 45;
	} //Idle

	@Override
	public int getNoiseLength() {
		return 26;
	} //Roar

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 12;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	public float getAISpeedLand() {
		float speedBase = 0.38F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {

			speedBase = speedBase *2.7F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 360;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 1.50F * this.getAgeScale();
		return this.getEntityBoundingBox().grow(0.5F + size, 0.2F, 0.5F + size);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(3.0, 1.00, 3.0);
		}
		return this.getEntityBoundingBox();
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.9F);
	}

	@Override
	public float getSwimHeight()
	{
		return this.height * 1.1F;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AgeableWarnEntity(this, EntityPlayer.class, 4));
		tasks.addTask(4, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
	}

	@Override
	public SoundEvent getRoarSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spectrovenator_threat"));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:spectrovenator_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spectrovenator_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spectrovenator_death"));
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		super.playStepSound(pos, blockIn);
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	@Override
	public void onLivingUpdate() {

		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAttackTarget() != null) {
			if (this.getAnimationTick() == 18) {
				double d1 = this.posX - this.getAttackTarget().posX;
				double d0;
				for (d0 = this.posZ -  this.getAttackTarget().posZ; d1 * d1 + d0 * d0 < 1.0E-4D; d0 = (Math.random() - Math.random()) * 0.01D)
				{
					d1 = (Math.random() - Math.random()) * 0.01D;
				}
				this.getAttackTarget().knockBack(this, 0.15F, d1, d0);
				this.getAttackTarget().addVelocity(0, 0.115, 0);
				launchAttack();
			}
		}

		if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getAnimationTick() == this.headbutTick() && this.getGrappleTarget() != null) {
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
		else if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10, 10);
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			TileEntity te = world.getTileEntity(pos);
			return (((BlockNest.TileEntityNest)te).getStackInSlot(0).isEmpty());
		}
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.SPECTROVENATOR_LOOT_YOUNG;
		}
		return LepidodendronMod.SPECTROVENATOR_LOOT;
	}
    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.CLICK_SPECTROVENATOR;
    }

	//Rendering taxidermy:
	//--------------------
    public static double offsetWall(@Nullable String variant) {
        return -0.225;
    }
    public static double upperfrontverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double upperbackverticallinedepth(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffset(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {        return 0.04;    }
    public static double upperbacklineoffset(@Nullable String variant) {        return 0.0;}
    public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.0;
    }
    public static double lowerfrontverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double lowerbackverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double lowerfrontlineoffset(@Nullable String variant) {return 0.2;}
    public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
        return -0.2;
    }
    public static double lowerbacklineoffset(@Nullable String variant) {
        return 0.045;
    }
    public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.7;
    }
    @SideOnly(Side.CLIENT)
    public static ResourceLocation textureDisplay(@Nullable String variant) { return RenderSpectrovenator.TEXTURE;
    }
    @SideOnly(Side.CLIENT)
    public static ModelBase modelDisplay(@Nullable String variant) {
        return RenderDisplays.modelSpectrovenator;
    }
    public static float getScaler(@Nullable String variant) {
        return RenderSpectrovenator.getScaler();
    }

}