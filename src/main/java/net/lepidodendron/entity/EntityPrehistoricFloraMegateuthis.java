
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.render.entity.RenderMegateuthis;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
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

public class EntityPrehistoricFloraMegateuthis extends EntityPrehistoricFloraNautiloidBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraMegateuthis(World world) {
		super(world);
		setSize(1F, 1F);
		minWidth = 0.3F;
		maxWidth = 1.5F;
		maxHeight = 0.8F;
		maxHealthAgeable = 24.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean canShoal() {
		return false;
	}

	@Override
	public int getShoalSize() {
		return 0;
	}

	@Override
	public int getShoalDist() {
		return 3;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Jurassic";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
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
	protected float getAISpeedNautiloid() {
		//return 0;
		return 0.0698f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new ShoalFishAgeableAI(this, 1, true));
		tasks.addTask(2, new NautiloidWander(this, NO_ANIMATION));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT, DietString.FISH);
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
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

//	@Override
//	public ItemStack getPropagule() {
//		return new ItemStack(ItemNautiloidEggsMegateuthis.block, (int) (1));
//	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
//		if (!this.isPFAdult()) {
//			return LepidodendronMod.MEGATEUTHIS_LOOT_YOUNG;
//		}
//		return LepidodendronMod.MEGATEUTHIS_LOOT;
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.55;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.88F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.1F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 1.8;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 1.3;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 1F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.1F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderMegateuthis.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelMegateuthis;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderMegateuthis.getScaler();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_MEGATEUTHIS;
	}
}
