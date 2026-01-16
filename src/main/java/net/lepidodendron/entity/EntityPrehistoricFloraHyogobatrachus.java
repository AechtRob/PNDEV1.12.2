
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

public class EntityPrehistoricFloraHyogobatrachus extends EntityPrehistoricFloraSwimmingAmphibianBase implements ITrappableWater, ITrappableLand, IAdvancementGranter, IWaterSurfaceEggsAmphibian {

	public BlockPos currentTarget;
	public Animation STAND_ANIMATION;//blink animation
	public Animation JUMP_ANIMATION;
	private Animation currentAnimation;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public int jumpCooldown;
	public int walkCooldown;
	private int standCooldown;
	public int ambientSoundTime;
	public boolean isWalking = false;

	public EntityPrehistoricFloraHyogobatrachus(World world) {
		super(world);
		setSize(0.15F, 0.20F);
		minWidth = 0.12F;
		maxWidth = 0.15F;
		maxHeight = 0.20F;
		maxHealthAgeable = 2.0D;
		STAND_ANIMATION = Animation.create(17);
		JUMP_ANIMATION = Animation.create(this.getJumpLength());
	}

	public int getJumpLength() {
		return 17;
	}

	//TODO OTHER ANIMS: STAND_ANIMATION = Relax, IDLE1 = Scratch, A_GRAZE = Arboreal Graze, GRAZE = Graze, DRINK = Drink, NOISE = Call, NOISE2 = Call1Variant, ROAR = Call2
	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, STAND_ANIMATION, JUMP_ANIMATION};
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(2000);
		this.jumpCooldown = 0;
		this.walkCooldown = (rand.nextInt(800));
		return livingdata;
	}
	@Override
	public int getRoarLength() {
		return 20;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 47; //Surface spawn
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Early Cretaceous";}

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
		float calcSpeed = 0.15F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.185f;
		}
		if ( this.getAnimation() == ROAR_ANIMATION) {
			return 0.0F;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		//this is needed to control the distance of the jump, higher number = larger blocks jumped
		if (!this.isWalking && (!this.isReallyInWater())) {
			calcSpeed = 0.3F;
		}
		if(this.getIsFast()){
			calcSpeed *=1.4F;
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	//start of the methods needed for jump

	//Collision check causes the mob to jump when it is collided with
	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if(this.getIsMoving() && (!this.isJumping) && this.onGround && !this.isReallyInWater()){
			this.jumpPN();
			this.setAnimation(JUMP_ANIMATION);
		}

	}

	//control jump height
	protected void jumpPN()
	{
		this.motionY = (double)this.getJumpUpwardsMotion()*0.3f; //edit this to be a diff value
		this.isAirBorne = true;
	}

	@Override
	public String getEntityId(Entity entity) {
		return "lepidodendron:prehistoric_flora_tadpole@hyogobatrachus";
	}


	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		//is walking, decrease jumping cooldown
		if(this.jumpCooldown > 0 && this.isWalking) {
			this.jumpCooldown--;
		}

		//is jumping, decrease walking cooldown
		if(this.walkCooldown > 0 && !this.isWalking) {
			this.walkCooldown--;
		}

		//switch to jumping
		if(this.getIsMoving() && this.onGround && !this.isReallyInWater() && this.getAnimation() != JUMP_ANIMATION && !this.isWalking){
			this.jumpPN();
			this.setAnimation(JUMP_ANIMATION);
		}

		//switch to walking if currently in jump mode
		if(this.walkCooldown <= 0 && this.jumpCooldown <=0 && !this.isWalking && !this.world.isRemote) {
			this.jumpCooldown = rand.nextInt(1000);
			this.isWalking = true;
			this.getNavigator().clearPath();
		}
		//switch to jumping if currently in walk mode
		else if(this.walkCooldown <= 0 && this.jumpCooldown <=0 && this.isWalking && !this.world.isRemote) {
			this.walkCooldown = rand.nextInt(800);
			this.isWalking = false;
			this.getNavigator().clearPath();
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

	//this causes the mob to jump away if attacked, with a lower cooldown to next jump
	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.getAnimation() != JUMP_ANIMATION) {
			this.jumpPN();
			this.setAnimation(JUMP_ANIMATION);
		}
		return super.attackEntityFrom(ds, i);
	}

	//end methods needed for jumping

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
	            .getObject(new ResourceLocation("lepidodendron:hyogobatrachus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:hyogobatrachus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:hyogobatrachus_death"));
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
		return LepidodendronMod.HYOGOBATRACHUS_LOOT;
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
//	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderTriadobatrachus.TEXTURE;}
//	@SideOnly(Side.CLIENT)
//	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelTriadobatrachus;}
//	public static float getScaler(@Nullable String variant) {return RenderTriadobatrachus.getScaler();}
//	public static float widthSupport(@Nullable String variant) {return 0.04F;}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_HYOGOBATRACHUS;
	}

}