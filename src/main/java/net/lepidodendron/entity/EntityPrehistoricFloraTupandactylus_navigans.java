
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
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
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

public class EntityPrehistoricFloraTupandactylus_navigans extends EntityPrehistoricFloraLandClimbingFlyingWalkingBase implements IAdvancementGranter, IGuano, IScreamerFlier, ITrappableLand {

	private boolean screaming;
	public int screamAlarmCooldown;
	public int standCooldown;
	public Animation STAND_ANIMATION;
	public Animation ALERT_ANIMATION;

	public EntityPrehistoricFloraTupandactylus_navigans(World world) {
		super(world);
		setSize(0.9F, 0.9F);
		minWidth = 0.10F;
		maxWidth = 0.9F;
		maxHeight = 0.9F;
		maxHealthAgeable = 18.0;
		setNoAI(!true);
		enablePersistence();
		STAND_ANIMATION = Animation.create(105);
		ALERT_ANIMATION = Animation.create(115);
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
		return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, FLY_ANIMATION, UNFLY_ANIMATION, STAND_ANIMATION, ALERT_ANIMATION};
	}

	@Override
	public boolean homesToNest() {
		return true;
	}

	//Walking for very long as opposed to flight
	@Override
	public int sitTickCtMax() {
		return 800 + rand.nextInt(5000);
	}
	//lower number =  less flight
	@Override
	public int sitCooldownSetter() {
		return 200 + rand.nextInt(800);
	}

	@Override
	public int flyTransitionLength() {
		return 15;
	}

	@Override
	public int unflyTransitionLength() {
		return 40;
	}

	@Override
	public boolean checkFlyConditions() {
		return this.world.isDaytime();
	}

	@Override
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
			List<EntityPrehistoricFloraTupandactylus_navigans> thalassodromeus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraTupandactylus_navigans.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraTupandactylus_navigans currentTapejara : thalassodromeus) {
				currentTapejara.setAnimation(NO_ANIMATION);
				currentTapejara.setAlarmTarget(ee);
				currentTapejara.setRevengeTarget(ee);
				currentTapejara.screamAlarmCooldown = rand.nextInt(20);
				currentTapejara.setFlying();
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == DRINK_ANIMATION || animation == GRAZE_ANIMATION;
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
		return ModTriggers.CLICK_TUPANDACTYLUS_NAVIGANS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.TUPANDACTYLUS_NAVIGANS_LOOT_YOUNG;
		}
		return LepidodendronMod.TUPANDACTYLUS_NAVIGANS_LOOT;
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

	public static String getPeriod() {return "Early Cretaceous";}

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
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == STAND_ANIMATION || this.getAnimation() == ALERT_ANIMATION) {
			return 0.0F;
		}
		if (this.getAttachmentPos() != null) {
			if (this.getAttachmentFacing() == EnumFacing.UP) {
				//Walking:
//				if(this.getAnimation() == ROAR_ANIMATION) {
//					return 0F;
//				}
				if (this.getIsFast()) {
					return 0.35f;
				}
				return 0.27F;
			}
		}
		//Otherwise we are flying:
		if (this.getIsFast()) {
			return 0.5f;
		}
		return 0.9f;
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
		return 50;
	}

	@Override
	public int getAttackLength() {
		return 15;
	}

	@Override
	public void playLivingSound() {
		if (this.getAnimation() == NO_ANIMATION && ((this.getAttachmentPos() != null && this.checkFlyConditions())
				|| this.getAttachmentPos() == null)) {
			if (!this.world.isRemote) {
//				this.setAnimation(ROAR_ANIMATION);
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
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:thalassodromeus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:thalassodromeus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:thalassodromeus_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:thalassodromeus_alarm"));
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
		return ArrayUtils.addAll(DietString.FISH);
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
//		tasks.addTask(8, new EntityLookIdleAI(this));
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

		//Sometimes stand up and look around:
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null && this.getAlarmTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0 && !this.isReallyFlying()) {
			int num = this.rand.nextInt(10);

			if(num < 5) {
				this.setAnimation(STAND_ANIMATION);
			} else  {
				this.setAnimation(ALERT_ANIMATION);
			}

			this.standCooldown = 3000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION
				&& (this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}

		if ((!this.world.isRemote) && this.getAnimation() == ALERT_ANIMATION
				&& (this.getAnimationTick() == ALERT_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}

		super.onEntityUpdate();
	}

	@Override
	public int getDrinkCooldown() {
		return 600;
	}
	@Override
	public int getDrinkLength() {
		return 140;
	}

	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}

		return true;
	}

	@Override
	public boolean isDrinking()
	{
		if (!this.isPFAdult()) {
			return false;
		}

		if (this.isReallyFlying()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		//boolean test2 = false;
		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						(this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

								|| (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

								|| (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

								|| (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is water?
			EnumFacing facing = null;
			if (this.world.getBlockState(entityPos.north(1).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(entityPos.south(1).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.SOUTH;

			}
			else if (this.world.getBlockState(entityPos.east(1).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.EAST;

			}
			else if (this.world.getBlockState(entityPos.west(1).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.WEST;

			}
			if (facing != null && test) { // & test2) {
				this.setDrinkingFrom(entityPos.offset(facing).offset(facing));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;// && test2;
	}

	@Override
	public int getEggType(@Nullable String variantIn) { //0-3
		return 0; //Small eggs
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.05;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.85;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.04;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 1.55;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.03;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	



}