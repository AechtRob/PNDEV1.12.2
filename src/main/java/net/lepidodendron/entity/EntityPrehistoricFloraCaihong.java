
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.render.entity.RenderCaihong;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraCaihong extends EntityPrehistoricFloraLandClimbingGlidingBase implements IAdvancementGranter, IScreamer, ITrappableLand {

	public BlockPos currentTarget;
	private boolean screaming;
	public Animation STAND_ANIMATION;
	public Animation DISPLAY_ANIMATION;
	public int screamAlarmCooldown;
	private int standCooldown;

	public EntityPrehistoricFloraCaihong(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.3F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 4.0D;
		STAND_ANIMATION = Animation.create(85);
		DISPLAY_ANIMATION = Animation.create(45);
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
	public int getLaunchCooldown() {
		return 0;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		boolean result = super.attackEntityFrom(ds, i);
		if (ds.getTrueSource() instanceof EntityLivingBase && !this.world.isRemote) {
			EntityLivingBase ee = (EntityLivingBase) ds.getTrueSource();
			this.setAlarmTarget(ee);
			List<EntityPrehistoricFloraCaihong> caihong = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraCaihong.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraCaihong currentCaihong : caihong) {
				currentCaihong.setAnimation(NO_ANIMATION);
				currentCaihong.setAlarmTarget(ee);
				currentCaihong.setRevengeTarget(ee);
				currentCaihong.screamAlarmCooldown = rand.nextInt(20);
			}

		}
		return result;
	}

	public void playThreatSound()
	{
		SoundEvent soundevent = (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:caihong_threat"));
		if (soundevent != null)
		{
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
		}
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
				.getObject(new ResourceLocation("lepidodendron:caihong_alarm"));
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
			if (this.getAlarmTarget() == null && !this.isBurning()) {
				this.setScreaming(false);
			} else {
				this.setIsFast(true);
				this.setScreaming(true);
			}
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
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, EAT_ANIMATION, STAND_ANIMATION, DISPLAY_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 20;
	}

	@Override
	public int getAttackLength() {
		return 30;
	}

	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public int getClimbCooldown() {
		return 20 + rand.nextInt(40);
	}

	public static String getPeriod() {return "Jurassic";}

	@Override
	public int getAdultAge() {
		return 0;
	}

	@Override
	public float getAISpeedLand() {
		if (this.getAnimation() == LAY_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
				|| this.getAnimation() == STAND_ANIMATION || this.getAnimation() == DISPLAY_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast() && (!this.getIsClimbing()) && (!this.getIsFlying())) {
			return 0.485F;
		}
		return 0.225F;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	@Override
	public float getClimbSpeed() {
		return 0.425F;
	}

	@Override
	public void onEntityUpdate() {

		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		//random idle animations
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getAlarmTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && !this.getIsFlying() && !this.getIsClimbing() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			if (rand.nextInt(5) != 0) {
				this.setAnimation(STAND_ANIMATION);
			}
			else {
				this.setAnimation(DISPLAY_ANIMATION);
				this.playThreatSound();
			}
			this.standCooldown = 2000;
		}
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION && this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}
		if ((!this.world.isRemote) && this.getAnimation() == DISPLAY_ANIMATION && this.getAnimationTick() == DISPLAY_ANIMATION.getDuration() - 1) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
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
		tasks.addTask(6, new PanicScreamAI(this, 1.5F));
        tasks.addTask(7, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(8, new LandWanderNestAI(this));
		tasks.addTask(9, new LandWanderAvoidWaterClimbingAI(this, 0.8D, 20));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.MEAT);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
		//this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:caihong_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:caihong_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
			.getObject(new ResourceLocation("lepidodendron:caihong_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.CAIHONG_LOOT_YOUNG;
		}
		return LepidodendronMod.CAIHONG_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_CAIHONG;
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
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.7;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.7;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
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
		return 0.0;
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
	public static float widthSupport(@Nullable String variant) {return 0.03F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderCaihong.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelCaihong;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderCaihong.getScaler();
	}


}