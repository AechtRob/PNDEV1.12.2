
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.render.entity.RenderTitanichthys;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraTitanichthys extends EntityPrehistoricFloraAgeableFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraTitanichthys(World world) {
		super(world);
		setSize(1.5F, 2.0F);
		minWidth = 0.2F;
		maxWidth = 1.5F;
		maxHeight = 2F;
		maxHealthAgeable = 46.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.2;
	}

	public static String getPeriod() {return "Devonian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return false;
	}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		return new EntityPrehistoricFloraTitanichthys(this.world);
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	@Override
	protected float getAISpeedFish() {
		return 0.275f;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source != DamageSource.DROWN) {
			return super.attackEntityFrom(source, (amount * 0.5F));
		}
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(1, new AgeableFishWander(this, NO_ANIMATION, 0.1, -2, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}


	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		//this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
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

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		////this.renderYawOffset = this.rotationYaw;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.TITANICHTHYS_LOOT_YOUNG;
		}
		return LepidodendronMod.TITANICHTHYS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 1.3;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 1.3;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.8F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 2.2;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 1.2;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 1.4;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.78F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderTitanichthys.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelTitanicthys;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderTitanichthys.getScaler();
	}
}

