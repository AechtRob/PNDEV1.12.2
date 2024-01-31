
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.render.entity.RenderCaelestiventus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IGuano;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraCaelestiventus extends EntityPrehistoricFloraLandClimbingFlyingWalkingBase implements IAdvancementGranter, IGuano {

	public EntityPrehistoricFloraCaelestiventus(World world) {
		super(world);
		setSize(0.62F, 0.72F);
		minWidth = 0.12F;
		maxWidth = 0.62F;
		maxHeight = 0.72F;
		maxHealthAgeable = 18.0D;
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public int flightHeight() {
		return 15;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, FLY_ANIMATION, UNFLY_ANIMATION};
	}

	@Override
	public boolean homesToNest() {
		return true;
	}

	@Override
	public int flyTransitionLength() {
		return 40;
	}

	@Override
	public int unflyTransitionLength() {
		return 40;
	}

	@Override
	public boolean checkFlyConditions() {
		return true;
	}

	public boolean hasAlarm() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraCaelestiventus> caelestiventus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraCaelestiventus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraCaelestiventus currentCaelestiventus : caelestiventus) {
				currentCaelestiventus.setRevengeTarget(ee);
				//currentCaelestiventus.screamAlarmCooldown = rand.nextInt(20);
				currentCaelestiventus.setFlying();
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == DRINK_ANIMATION || animation == GRAZE_ANIMATION;
	}

	@Override
	public ResourceLocation FlightSound() {
		return null;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_CAELESTIVENTUS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.CAELESTIVENTUS_LOOT_YOUNG;
		}
		return LepidodendronMod.CAELESTIVENTUS_LOOT;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public boolean canJar() {
		return false;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		if (isLayableNest(world, pos)) {
			return true;
		}
		return world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID;
	}

	@Override
	public boolean canSpawnOnLeaves() {
		return true;
	}

	@Override
	public float getAISpeedLand() {
		float speedBase = 0.285F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getAttachmentPos() != null) {
			if (this.getAttachmentFacing() == EnumFacing.UP) {
				//Walking:
				if (this.getIsFast()) {
					return speedBase * 1.50F;
				}
				else if (this.getAnimation() == FLY_ANIMATION) {
					return speedBase + (speedBase * ((float) this.getAnimationTick() / (float) this.FLY_ANIMATION.getDuration()));
				}
				else if (this.getAnimation() == UNFLY_ANIMATION) {
					return (speedBase + speedBase) - (speedBase * ((float) this.getAnimationTick() / (float) this.UNFLY_ANIMATION.getDuration()));
				}
				return speedBase;
			}
		}
		//Otherwise we are flying:
		if (this.getIsFast()) {
			return 0.385F;
		}
		return 0.385F;
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2);
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public int getRoarLength() {
		return 10;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public void playLivingSound() {
		if (this.getAnimation() == NO_ANIMATION && ((this.getAttachmentPos() != null && this.checkFlyConditions())
				|| this.getAttachmentPos() == null)) {
			if (!this.world.isRemote) {
				this.setAnimation(ROAR_ANIMATION);
				SoundEvent soundevent = this.getAmbientSound();
				if (soundevent != null)
				{
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:caelestiventus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:caelestiventus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:caelestiventus_death"));
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new PanicAI(this, 1.0));

		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderAvoidWaterAI(this, 1.0D, 20));
		tasks.addTask(6, new AgeableClimbingFlyingWalkingFlyHigh(this, true));
		tasks.addTask(7, new LandClimbingFlyingWalkingBaseWanderFlightNearGroundAI(this, true, false));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.MEAT, DietString.FISH), DietString.ROTTEN);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public String getEntityId(Entity entity) {
		return "lepidodendron:prehistoric_flora_caelestiventus";
	}

	@Override
	public int getEggType(@Nullable String variantIn) { //0-3
		return 0; //Small eggs
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.45;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.7;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 1.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderCaelestiventus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelCaelestiventus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderCaelestiventus.getScaler();
	}
}