
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderPrestosuchus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPrestosuchus extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public int ambientSoundTime;
	public Animation NOISE_ANIMATION;
	public ChainBuffer tailBuffer;

	public EntityPrehistoricFloraPrestosuchus(World world) {
		super(world);
		setSize(0.85F, 1.82F);
		minWidth = 0.12F;
		maxWidth = 0.85F;
		maxHeight = 1.82F;
		maxHealthAgeable = 40.0D;
		NOISE_ANIMATION = Animation.create(8);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == ROAR_ANIMATION //warning a player
				|| animation == DRINK_ANIMATION;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 2; //large
	}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean isNestMound() {
		return true;
	}

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, NOISE_ANIMATION};
	}

	@Override
	public int getDrinkLength() {
		return 60;
	}

	@Override
	public int getEatLength() {
		return 18;
	}

	@Override
	public int getRoarLength() {
		return 30;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial Saurischian";}

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
		float speedBase = 0.35F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION) {
			return 0.0F; //Is drinking
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.8F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 260;
	}


	@Override
	public int getAdultAge() {
		return 56000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.95F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		//tasks.addTask(4, new PanicAI(this, 1.6D));
		tasks.addTask(5, new LandWanderNestInBlockAI(this));
		tasks.addTask(6, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(9, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
		//this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));

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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.3D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:postosuchus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:postosuchus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:postosuchus_death"));
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

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

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
			return LepidodendronMod.PRESTOSUCHUS_LOOT_YOUNG;
		}
		return LepidodendronMod.PRESTOSUCHUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {return -0.45;}
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 1.0;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 1.4;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 1.5;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -1.2;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderPrestosuchus.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelPrestosuchus;}
	public static float getScaler(@Nullable String variant) {return RenderPrestosuchus.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.05F;}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PRESTOSUCHUS;
	}
}