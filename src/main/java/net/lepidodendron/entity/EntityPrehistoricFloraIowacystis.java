
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraFishBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWanderBottomDweller;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderIowacystis;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemEchinodermEggsIowacystis;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraIowacystis extends EntityPrehistoricFloraFishBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraIowacystis(World world) {
		super(world);
		setSize(0.3F, 0.2F);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Ordovician";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		return 0.05f;
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
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new FishWanderBottomDweller(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraFishBaseAI(this));
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemEchinodermEggsIowacystis.block, 1);
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
		//this.renderYawOffset = this.rotationYaw;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.IOWACYSTIS_LOOT;
	}
	public static double offsetWall(@Nullable String variant) {
		return -0.45;
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
		return 0.1;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -1.2;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderIowacystis.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelIowacystis;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderIowacystis.getScaler();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_IOWACYSTIS;
	}
}

