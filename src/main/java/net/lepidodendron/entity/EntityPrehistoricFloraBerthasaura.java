
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderBerthasaura;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
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
import java.util.List;

public class EntityPrehistoricFloraBerthasaura extends EntityPrehistoricFloraLandBase implements IScreamer, ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public int ambientSoundTime;
	public Animation ALERT_ANIMATION;
	private int standCooldown;
	private boolean screaming;
	public int screamAlarmCooldown;

	public EntityPrehistoricFloraBerthasaura(World world) {
		super(world);
		setSize(0.425F, 0.4F);
		minWidth = 0.05F;
		maxWidth = 0.425F;
		maxHeight = 0.4F;
		maxHealthAgeable = 10.0D;
		ALERT_ANIMATION = Animation.create(60);
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

//		if (world.isRemote) {
//			System.err.println(Math.sin((float)this.getTicks() / 100F));
//		}

	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //small
	}

	@Override
	public int getDrinkLength() {
		return 0;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	public static String getPeriod() {return "Early Cretaceous";}

	//public static String getHabitat() {return "Terrestrial Pseudosuchian";}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, ALERT_ANIMATION, GRAZE_ANIMATION};
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	public boolean hasAlarm() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 8;
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
		float speedBase = 0.4F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == ALERT_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.55F;
		}
		return speedBase * 0.7F;
	}

	@Override
	public int getTalkInterval() {
		return 180;
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
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.95F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new PanicAI(this, 1.0));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 20;
		}
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.PLANTS));
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public int getGrazeLength() {
		return 150;
	}

	@Override
	public int getGrazeCooldown() {
		return 2400;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.GRASS);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		return true;
	}

	@Override
	public boolean isGrazing()
	{
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test2 = false;
		boolean test = (this.getPFGrazing() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.GRAZE_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						(isBlockGrazable(this.world.getBlockState(entityPos.north()))
								&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.south()))
								&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.east()))
								&& isGrazable(this.world, entityPos, EnumFacing.EAST))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.west()))
								&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is Grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.7D
						&& Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.7D
						&& Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() >= 0.7D
						&& Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west()))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() >= 0.7D
						&& Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() <= 0.9D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setGrazingFrom(entityPos.offset(facing));
				this.faceBlock(this.getGrazingFrom(), 10F, 10F);
			}
		}
		return test && test2;

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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:berthasaura_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:berthasaura_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:berthasaura_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:berthasaura_alarm"));
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
	public void onEntityUpdate() {
		super.onEntityUpdate();

		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		//Sometimes stand up and look around:
		if ((!this.getScreaming()) && (!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null && this.getAlarmTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			this.setAnimation(ALERT_ANIMATION);
			SoundEvent soundevent = this.getAlarmSound();
			if (soundevent != null)
			{
				this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			}
			this.standCooldown = 2000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == ALERT_ANIMATION && this.getAnimationTick() == ALERT_ANIMATION.getDuration() - 1) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}


	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 6 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.getAnimation() == GRAZE_ANIMATION && !world.isRemote) {
			if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				ItemStack item = world.getBlockState(this.getGrazingFrom()).getBlock().getPickBlock(world.getBlockState(this.getGrazingFrom()), null, world, this.getGrazingFrom(), null);
				world.destroyBlock(this.getGrazingFrom(), true);
				float itemHealth = 0.5F; //Default minimal nutrition
				if (item.getItem() instanceof ItemFood) {
					itemHealth = ((ItemFood) item.getItem()).getHealAmount(item);
				}
				this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
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
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAlarmTarget(ee);
			List<EntityPrehistoricFloraBerthasaura> Berthasaura = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraBerthasaura.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraBerthasaura currentBerthasaura : Berthasaura) {
				currentBerthasaura.setAnimation(NO_ANIMATION);
				currentBerthasaura.setRevengeTarget(ee);
				currentBerthasaura.setAlarmTarget(ee);
				currentBerthasaura.screamAlarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.BERTHASAURA_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_BERTHASAURA;
	}


	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.225;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
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
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderBerthasaura.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelBerthasaura;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderBerthasaura.getScaler();
	}

}