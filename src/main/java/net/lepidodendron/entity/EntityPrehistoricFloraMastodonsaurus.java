
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.lepidodendron.entity.render.entity.RenderMastodonsaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
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

public class EntityPrehistoricFloraMastodonsaurus extends EntityPrehistoricFloraSwimmingAmphibianBase implements ITrappableWater {
	private static final DataParameter<Integer> BOTTOM_COOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraMastodonsaurus.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> SWIM_COOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraMastodonsaurus.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean> BOTTOM_FLAG = EntityDataManager.createKey(EntityPrehistoricFloraMastodonsaurus.class, DataSerializers.BOOLEAN);

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;

	public EntityPrehistoricFloraMastodonsaurus(World world) {
		super(world);
		setSize(1.20F, 1.02F);
		minWidth = 0.1F;
		maxWidth = 1.20F;
		maxHeight = 1.02F;
		maxHealthAgeable = 64.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 40; //normal spawn
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BOTTOM_COOLDOWN, 0);
		this.dataManager.register(SWIM_COOLDOWN, 0);
		this.dataManager.register(BOTTOM_FLAG, false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setBottomCooldown(0);
		this.setSwimCooldown(0);
		this.setBottomFlag(false);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("bottomCooldown", this.getBottomCooldown());
		compound.setInteger("swimCooldown", this.getSwimCooldown());
		compound.setBoolean("bottomFlag", this.getBottomFlag());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBottomCooldown(compound.getInteger("bottomCooldown"));
		this.setSwimCooldown(compound.getInteger("swimCooldown"));
		this.setBottomFlag(compound.getBoolean("bottomFlag"));
	}

	public int getBottomCooldown() {
		return this.dataManager.get(BOTTOM_COOLDOWN);
	}

	public void setBottomCooldown(int cooldown) {
		this.dataManager.set(BOTTOM_COOLDOWN, cooldown);
	}

	public int getSwimCooldown() {
		return this.dataManager.get(SWIM_COOLDOWN);
	}

	public void setSwimCooldown(int cooldown) {
		this.dataManager.set(SWIM_COOLDOWN, cooldown);
	}

	public boolean getBottomFlag() {
		return this.dataManager.get(BOTTOM_FLAG);
	}

	public void setBottomFlag(boolean flag) {
		this.dataManager.set(BOTTOM_FLAG, flag);
	}

	@Override
	public boolean isBase() {
		return true;
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.25;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Amphibious";}
	@Override
	public boolean sinks() {
		return this.getSwimCooldown() <= 0;
	}

	@Override
	public int getTalkInterval() {
		return 125;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.15F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.232f;
		}
		//calcSpeed = 0;
		if (this.getTicks() < 0) {
			//System.err.println("Laying");
			return 0.0F; //Is laying eggs
		}
        if (this.getIsFast() && this.isReallyInWater()) {
            calcSpeed = calcSpeed * 1.52F;
        }
		if (this.isAtBottom() && (!this.getIsFast()) && (!this.isInLove()) && this.getEatTarget() == null) {
			return 0;
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 96000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterMastodonsaurus;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.5F + size, 1.5F + size, 1.5F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWander(this, NO_ANIMATION, 1, 20));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(5, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityVillager.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraAmphibamus.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.15));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.MEAT);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.2D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:mastodonsaurus_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:mastodonsaurus_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:mastodonsaurus_death"));
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

		if (!this.world.isRemote) {
			if (this.isAtBottom() && (!this.getBottomFlag()) && !this.getIsFast() && this.getSwimCooldown() <= 0) {
				this.setBottomFlag(true);
				this.setBottomCooldown(300 + rand.nextInt(600));
			}
			if (this.isAtBottom() && (this.getBottomFlag())) {
				this.setBottomCooldown(this.getBottomCooldown() - 1);
			}
			if (this.getBottomCooldown() < 0) {
				this.setBottomCooldown(0);
			}
			if (this.getBottomCooldown() <= 0 && this.getBottomFlag()) {
				this.setBottomFlag(false);
				this.setSwimCooldown(200 + rand.nextInt(300));
			}
			if (!(this.getBottomFlag())) {
				this.setSwimCooldown(this.getSwimCooldown() - 1);
			}
			if (this.getSwimCooldown() <= 0) {
				this.setSwimCooldown(0);
			}

		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public boolean isAtBottom() {
		//System.err.println("Testing position");
		if (this.getPosition().getY() - 1 >= 0) {
			BlockPos pos = new BlockPos(this.getPosition().getX(),this.getPosition().getY() - 1, this.getPosition().getZ());
			return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
					&& ((this.world.getBlockState(pos)).getMaterial() != Material.WATER)
					&& this.getSwimCooldown() <= 0 && this.onGround);
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

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.MASTODONSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.MASTODONSAURUS_LOOT;
	}
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 1.1;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 1.2F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.6F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.1;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.30F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderMastodonsaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelMastodonsaurus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderMastodonsaurus.getScaler();
	}
}