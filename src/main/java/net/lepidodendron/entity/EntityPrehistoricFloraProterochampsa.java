
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.lepidodendron.entity.render.entity.RenderProterochampsa;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraProterochampsa extends EntityPrehistoricFloraSwimmingAmphibianBase implements IAdvancementGranter, ITrappableWater, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation EAT_ANIMATION;
	public Animation STAND_ANIMATION;
	private int standCooldown;

	public EntityPrehistoricFloraProterochampsa(World world) {
		super(world);
		setSize(0.8F, 0.85F);
		minWidth = 0.1F;
		maxWidth = 0.8F;
		maxHeight = 0.85F;
		maxHealthAgeable = 20.0D;
		EAT_ANIMATION = Animation.create(20);
		STAND_ANIMATION = Animation.create(60);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int getRoarLength() {
		return 20;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, STAND_ANIMATION};
	}

	@Override
	public boolean isSmall() {
		return getAgeScale() < 0.50;
	}


	public static String getPeriod() {
		return "Triassic";
	}

	//public static String getHabitat() {
	//	return "Amphibious Archosauromorph Reptile";
	//}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public boolean breathesAir() {
		return true;
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
		return true;
	}

	@Override
	public boolean isNestMound() {
		return true;
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.205F;
		if (this.isReallyInWater()) {
			calcSpeed = 0.275f;
		}
		//Lemon - here is the fast stuff, if we get animations:
		if (this.getIsFast()) {
			calcSpeed = calcSpeed * 1.7F;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == STAND_ANIMATION) {
			return 0.0F;
		}
		//System.err.println("Speed " + (Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed));
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public void eatItem(ItemStack stack) {
		if (stack != null && stack.getItem() != null) {
			float itemHealth = 0.5F; //Default minimal nutrition
			if (stack.getItem() instanceof ItemFood) {
				itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
			}
			this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			stack.shrink(1);
			if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
				this.setAnimation(EAT_ANIMATION);
				SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
				this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	public int WaterDist() {
		return 0;
	}

	@Override
	public boolean isNearWater(Entity e, BlockPos pos) {
		return true;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 1F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWanderNestInBlockAI(this));
		tasks.addTask(4, new AmphibianWanderNotBound(this, NO_ANIMATION, 0.7, 90));
		tasks.addTask(5, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(5, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(5, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(6, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
//		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:vancleavea_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:vancleavea_hurt"));
	}

	//@Override
	//public SoundEvent getHurtSound(DamageSource ds) {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	//}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:vancleavea_death"));
	}

	//@Override
	//public SoundEvent getDeathSound() {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	//}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(2000);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("standCooldown", this.standCooldown);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.standCooldown = compound.getInteger("standCooldown");
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

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

	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}


	@Override
	public boolean isOnLadder() {
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

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}
	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PROTEROCHAMPSA;
	}
	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.PROTEROCHAMPSA_LOOT_YOUNG;
		}
		return LepidodendronMod.PROTEROCHAMPSA_LOOT;
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {return -0.45;}
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.7;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.5;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.17;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return -0.5;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.5;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.5;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0.5;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.5;}
	public static double lowerbacklineoffset(@Nullable String variant) {return -0.04;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -0.3;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderProterochampsa.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelProterochampsa;}
	public static float getScaler(@Nullable String variant) {return RenderProterochampsa.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.04F;}

}