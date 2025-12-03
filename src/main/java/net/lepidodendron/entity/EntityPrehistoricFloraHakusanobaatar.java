
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.render.entity.RenderHakusanobaatar;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHakusanobaatar extends EntityPrehistoricFloraDiictodon implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public Animation STAND_ANIMATION;
	private int standCooldown;

	public EntityPrehistoricFloraHakusanobaatar(World world) {
		super(world);
		setSize(0.2F, 0.1F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.1F;
		maxHealthAgeable = 3.0D;
		STAND_ANIMATION = Animation.create(34);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_HAKUSANOBAATAR;
	}

	public static String getPeriod() {
		return "Early Cretaceous";
	}

	@Override
	public int getRoarLength() {
		return 9;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	//public static String getHabitat() {
	//	return "Terrestrial mammaliaform";
	//}

	@Override
	public boolean homesToNest() {
		return false;
	}

	@Override
	public boolean hasAlarm() {
		return false;
	}

	@Override
	public boolean hasNest() {
		return false;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean placesNest() {
		return false;
	}

	@Override
	public boolean isNestMound() {
		return false;
	}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		return new EntityPrehistoricFloraHakusanobaatar(this.world);
	}

	@Override
	public int getAttackLength() {
		return 10;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, EAT_ANIMATION, STAND_ANIMATION};
	}


	public float getAISpeedLand() {
		float speedBase = 0.2F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == STAND_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 3.15F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 80;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight() {
		return Math.max(super.getEyeHeight(), this.height * 0.9F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(4, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(5, new PanicAI(this, 1.0));
        tasks.addTask(6, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(7, new LandWanderNestAI(this));
		tasks.addTask(8, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(9, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(10, new LandWanderAvoidWaterAI(this, 1.0D));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(12, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(13, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.0));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG, DietString.MEAT);
	}

	@Override
	public boolean panics() {
		return true;
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
		//this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:hakusanobaatar_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:hakusanobaatar_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:hakusanobaatar_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.80F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}


	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 1 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;


	@Override
	public void onEntityUpdate() {


		//Sometimes stand up and look around:
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null && this.getAlarmTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			this.setAnimation(STAND_ANIMATION);

			this.standCooldown = 2000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION
				&& (this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}
		super.onEntityUpdate();

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
		return LepidodendronMod.HAKUSANOBAATAR_LOOT;
	}
	
	//Rendering taxidermy:
	//--------------------
	public static double offsetPlinth() { return 0.16; }
	public static double offsetWall(@Nullable String variant) { return 0.05; }
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0F;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0F;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0F;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0F;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.0F;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderHakusanobaatar.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelHakusanobaatar;}
	public static float getScaler(@Nullable String variant) {return RenderHakusanobaatar.getScaler();}



}
