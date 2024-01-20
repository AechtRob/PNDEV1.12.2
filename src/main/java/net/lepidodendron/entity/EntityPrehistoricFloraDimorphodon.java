
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraDimorphodon extends EntityPrehistoricFloraLandClimbingGlidingBase implements IAdvancementGranter, IScreamer {

	public BlockPos currentTarget;
	private boolean screaming;
	public int screamAlarmCooldown;

	public EntityPrehistoricFloraDimorphodon(World world) {
		super(world);
		setSize(0.8F, 0.6F);
		minWidth = 0.10F;
		maxWidth = 0.8F;
		maxHeight = 0.6F;
		maxHealthAgeable = 18.0D;
	}

	@Override
	public int getLaunchCooldown() {
		return 24000;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		boolean result = super.attackEntityFrom(ds, i);
		if (ds.getTrueSource() instanceof EntityLivingBase && !this.world.isRemote) {
			EntityLivingBase ee = (EntityLivingBase) ds.getTrueSource();
			List<EntityPrehistoricFloraDimorphodon> dimorphodon = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraDimorphodon.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraDimorphodon currentDimorphodon : dimorphodon) {
				currentDimorphodon.setRevengeTarget(ee);
				currentDimorphodon.screamAlarmCooldown = rand.nextInt(20);
				if (
						(!currentDimorphodon.getIsFlying())
				) {
					currentDimorphodon.setIsLaunching(true);
					currentDimorphodon.motionY = currentDimorphodon.getJumpUpwardsMotion();
					currentDimorphodon.launchProgress = 100;
				}
			}
			if (
				(!this.getIsFlying())
			) {
				this.setIsLaunching(true);
				this.motionY = this.getJumpUpwardsMotion();
				this.launchProgress = 100;
			}

		}
		return result;
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null && this.getAnimation() == NO_ANIMATION)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 25;
			this.setAnimation(ROAR_ANIMATION);
		}
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dimorphodon_alarm"));
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (!this.world.isRemote) {
			if (this.launchProgress <= 0) {
				this.setIsLaunching(false);
			}

			//Screaming handling:
			if (this.getRevengeTarget() == null && !this.isBurning()) {
				this.setScreaming(false);
			} else {
				this.setIsFast(true);
				this.setScreaming(true);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, EAT_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 40;
	}

	@Override
	public int getAttackLength() {
		return 16;
	}

	@Override
	public int getEatLength() {
		return 30;
	}

	@Override
	public int getClimbCooldown() {
		return 20 + rand.nextInt(40);
	}

	public static String getPeriod() {return "Jurassic";}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	public float getAISpeedLand() {
		if (this.getAnimation() == LAY_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast() && (!this.getIsClimbing()) && (!this.getIsFlying())) {
			return 0.485F;
		}
		return 0.325F;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	@Override
	public float getClimbSpeed() {
		return 0.5F;
	}

	@Override
	public void onEntityUpdate() {

		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		super.onEntityUpdate();

	}

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
		return false;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(1, new GlideAI());
		tasks.addTask(2, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(3, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(4, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(5, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		//tasks.addTask(6, new PanicScreamAI(this, 1.5F));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderAvoidWaterClimbingAI(this, 0.8D, 20));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG, DietString.MEAT);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.2D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
		//this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:dimorphodon_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:dimorphodon_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:dimorphodon_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DIMORPHODON_LOOT_YOUNG;
		}
		return LepidodendronMod.DIMORPHODON_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DIMORPHODON;
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos posNest, String tag) {
					TileEntity tileEntity = world.getTileEntity(posNest);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(posNest), "egg");

			//System.err.println("eggRenderType " + eggRenderType);

			if (eggRenderType.equals("")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}
}