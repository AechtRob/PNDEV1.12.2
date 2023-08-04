
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingBottomWalkingWaterBase;
import net.lepidodendron.entity.render.entity.RenderProteroctopus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.item.entities.ItemNautiloidEggsProteroctopus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraProteroctopus extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase {
	private static final DataParameter<Boolean> SWIMMING = EntityDataManager.<Boolean>createKey(EntityPrehistoricFloraProteroctopus.class, DataSerializers.BOOLEAN);

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Boolean> SWIMMING = EntityDataManager.createKey(EntityPrehistoricFloraProteroctopus.class, DataSerializers.BOOLEAN);
	//Needs to be here because it is not loaded in time to be accessed by the client if it's on the parent class!

	public EntityPrehistoricFloraProteroctopus(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 4.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SWIMMING, false);
		this.setScaleForAge(false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setIsSwimming(false);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("pfswimming", this.getIsSwimming());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsSwimming(compound.getBoolean("pfswimming"));
	}

	//checks if the animal is actually swimming
	@Override
	public boolean getIsSwimming() {
		return (Boolean)this.dataManager.get(SWIMMING);
	}

	//sets the animal isSwimming variable to true if the data manager detects that the animal is swimming
	@Override
	public void setIsSwimming(boolean isSwimming) {
		this.dataManager.set(SWIMMING, isSwimming);
	}


	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int swimTransitionLength() {
		return 20;
	}

	@Override
	public int unswimTransitionLength() {
		return 20;
	}

	@Override
	public int swimLength() {
		return 1200;
	}

	@Override
	public int walkLength() {
		return 1200;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Jurassic";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	@Override
	protected double getAISpeedSwim() {
		if (!this.isReallySwimming()) {
			return 0.10f;
		} else {
			return 0.075f;
		}
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(2, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Drop an egg perhaps:
		if (!world.isRemote && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = new ItemStack(ItemNautiloidEggsProteroctopus.block, (int) (1));
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			this.setTicks(0);
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.PROTEROCTOPUS_LOOT_YOUNG;
		}
		return LepidodendronMod.PROTEROCTOPUS_LOOT;
	}
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setIsSwimming(false);
		//this.setSwimTick(0);
		//this.setWalkTick(this.rand.nextInt(this.walkLength() + 1));
		return livingdata;
	}
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("pfswimming", this.getIsSwimming());
		//compound.setInteger("pfswimtick", this.getSwimTick());
		//compound.setInteger("pfwalktick", this.getWalkTick());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsSwimming(compound.getBoolean("pfswimming"));
		//this.setSwimTick(compound.getInteger("pfswimtick"));
		//this.setWalkTick(compound.getInteger("pfwalktick"));
	}
	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SWIMMING, false);
	}
	@Override
	public boolean getIsSwimming() {
		//try {
		//if (this.dataManager.get(SWIMMING).getClass().equals(Boolean.TYPE)) {
		return (Boolean)this.dataManager.get(SWIMMING).booleanValue();
		//}
		//} catch (Exception error) {
		//}
		//return false;
	}

	//sets the animal isSwimming variable to true if the data manager detects that the animal is swimming
	@Override
	public void setIsSwimming(boolean isSwimming) {
		this.dataManager.set(SWIMMING, Boolean.valueOf(isSwimming));
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.9;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.02;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderProteroctopus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelProteroctopus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderProteroctopus.getScaler();
	}

}
