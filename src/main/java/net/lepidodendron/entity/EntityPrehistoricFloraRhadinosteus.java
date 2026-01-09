
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.entity.util.IWaterSurfaceEggsAmphibian;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraRhadinosteus extends EntityPrehistoricFloraSwimmingAmphibianBase implements ITrappableWater, ITrappableLand, IAdvancementGranter, IWaterSurfaceEggsAmphibian {

	public BlockPos currentTarget;
	public Animation STAND_ANIMATION;//blink animation
	public Animation THREAT_ANIMATION;//threat animation
	private int standCooldown;
	public int ambientSoundTime;

	public EntityPrehistoricFloraRhadinosteus(World world) {
		super(world);
		setSize(0.15F, 0.10F);
		minWidth = 0.12F;
		maxWidth = 0.15F;
		maxHeight = 0.10F;
		maxHealthAgeable = 2.0D;
		STAND_ANIMATION = Animation.create(15);
		THREAT_ANIMATION = Animation.create(100);
	}

	//TODO OTHER ANIMS: STAND_ANIMATION = Relax, IDLE1 = Scratch, A_GRAZE = Arboreal Graze, GRAZE = Graze, DRINK = Drink, NOISE = Call, NOISE2 = Call1Variant, ROAR = Call2
	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, STAND_ANIMATION, THREAT_ANIMATION};
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(2000);
		return livingdata;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 47; //Surface spawn
	}

	@Override
	public int getRoarLength() {
		return 20;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Jurassic";}

	//public static String getHabitat() {return "Amphibious";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean hasNest() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		//return 0;
		float calcSpeed = 0.125F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.185f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if(this.getIsFast()){
			calcSpeed *=1.4F;
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 20000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterBalanerpeton;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
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

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	@Override
	public String getEntityId(Entity entity) {
		return "lepidodendron:prehistoric_flora_tadpole@rhadinosteus";
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWander(this, NO_ANIMATION, 0.025, 20));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(5, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, this.getEntityBoundingBox().getAverageEdgeLength() * 10F, this.getEntityBoundingBox().getAverageEdgeLength() * 1.2F, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:rhadinosteus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:rhadinosteus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:rhadinosteus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
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

		//System.err.println("this.getMateable() " + this.getMateable() + " inPFLove " + this.inPFLove);

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public int getAmbientTalkInterval() {
		return 160;
	}

	@Override
	public void onEntityUpdate() {

		super.onEntityUpdate();
		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			//random idle animations
			if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
					&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
				int next = rand.nextInt(10);
				this.setAnimation(STAND_ANIMATION);
				this.standCooldown = 100;
			}
			if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION && this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) {
				this.standCooldown = 100;
				this.setAnimation(NO_ANIMATION);
			}
		}

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
		return LepidodendronMod.RHADINOSTEUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
//	public static double offsetWall(@Nullable String variant) {return -0.45;}
//	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0;}
//	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0;}
//	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
//	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
//	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
//	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
//	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.0;}
//	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0.0;}
//	public static double lowerfrontlineoffset(@Nullable String variant) {return 0.0;}
//	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
//	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
//	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -0.0;}
//	@SideOnly(Side.CLIENT)
//	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderRhadinosteus.TEXTURE;}
//	@SideOnly(Side.CLIENT)
//	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelRhadinosteus;}
//	public static float getScaler(@Nullable String variant) {return RenderRhadinosteus.getScaler();}
//	public static float widthSupport(@Nullable String variant) {return 0.04F;}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_RHADINOSTEUS;
	}

}