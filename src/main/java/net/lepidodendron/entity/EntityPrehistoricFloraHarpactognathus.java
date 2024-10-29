
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.util.IGuano;
import net.lepidodendron.entity.util.IScreamerFlier;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.state.BlockFaceShape;
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
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraHarpactognathus extends EntityPrehistoricFloraLandClimbingFlyingWalkingBase implements IAdvancementGranter, IScreamerFlier, IGuano, ITrappableLand {

	private boolean screaming;
	public int screamAlarmCooldown;
	public Animation ALERT_ANIMATION;
	public int standCooldown;

	public EntityPrehistoricFloraHarpactognathus(World world) {
		super(world);
		setSize(0.85F, 0.5F);
		minWidth = 0.10F;
		maxWidth = 0.85F;
		maxHeight = 0.5F;
		maxHealthAgeable = 10.0D;
		ALERT_ANIMATION = Animation.create(40);
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public int getTalkInterval() {
		return 90;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public Animation[] getAnimations() {
		//No need for sideways transitions, but added ambient animations
		return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, FLY_ANIMATION, UNFLY_ANIMATION, ALERT_ANIMATION};
	}

	@Override
	public boolean homesToNest() {
		return true;
	}

	@Override
	public int flyTransitionLength() {
		return 30;
	}

	@Override
	public int unflyTransitionLength() {
		return 30;
	}

	@Override
	public boolean checkFlyConditions() {
		return this.world.isDaytime();
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
		if (e instanceof EntityLivingBase && this.hasAlarm() && !this.world.isRemote) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAlarmTarget(ee);
			List<EntityPrehistoricFloraHarpactognathus> harpactognathus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraHarpactognathus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraHarpactognathus currentHarpactognathus : harpactognathus) {
				currentHarpactognathus.setAlarmTarget(ee);
				currentHarpactognathus.setRevengeTarget(ee);
				currentHarpactognathus.screamAlarmCooldown = rand.nextInt(20);
				currentHarpactognathus.setFlying();
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == DRINK_ANIMATION || animation == GRAZE_ANIMATION
			|| animation == ALERT_ANIMATION;
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Override
	public ResourceLocation FlightSound() {
		return null;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_HARPACTOGNATHUS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.HARPACTOGNATHUS_LOOT_YOUNG;
		}
		return LepidodendronMod.HARPACTOGNATHUS_LOOT;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 8 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public boolean canJar() {
		return false;
	}

	public static String getPeriod() {return "Jurassic";}

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
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAttachmentPos() != null) {
			if (this.getAttachmentFacing() == EnumFacing.UP) {
				//Walking:
				if (this.getIsFast()) {
					return 0.35f;
				}
				return 0.24F;
			}
		}
		//Otherwise we are flying:
		if (this.getIsFast()) {
			return 0.295f;
		}
		return 0.225f;
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6);
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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
		return 8;
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
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:harpactognathus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:harpactognathus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:harpactognathus_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:harpactognathus_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 25;
		}
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new PanicScreamAI(this, 1.5F));
		tasks.addTask(4, new LandWanderNestInBlockAI(this));
		tasks.addTask(5, new LandWanderAvoidWaterAI(this, 1.0D, 20));
		tasks.addTask(6, new AgeableClimbingFlyingWalkingFlyHigh(this, false));
		tasks.addTask(7, new LandClimbingFlyingWalkingBaseWanderFlightNearGroundAI(this, false, false));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
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
	public void onEntityUpdate() {
		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		//Alert animation
		if ((!this.world.isRemote) && (!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0
				&& this.getAttachmentFacing() == EnumFacing.UP) {

			this.setAnimation(ALERT_ANIMATION);

			this.standCooldown = 2000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == ALERT_ANIMATION && this.getAnimationTick() == ALERT_ANIMATION.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}

		super.onEntityUpdate();
	}

//	@Override
//	public String getEntityId(Entity entity) {
//		return "lepidodendron:prehistoric_flora_harpactognathus";
//	}

	@Override
	public int getEggType(@Nullable String variantIn) { //0-3
		return 0; //Small eggs
	}

	//Rendering taxidermy:
	//--------------------



}