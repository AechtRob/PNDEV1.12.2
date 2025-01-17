
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EntityLookIdleAI;
import net.lepidodendron.entity.ai.EntityMateAISlitheringWaterBase;
import net.lepidodendron.entity.ai.SlitheringWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemUnknownBlob;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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

public class EntityPrehistoricFloraKarakhtia extends EntityPrehistoricFloraSlitheringWaterBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraKarakhtia(World world) {
		super(world, 40);
		setSize(0.65F, 0.25F);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemUnknownBlob.block, 1);
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Neoproterozoic (Ediacaran)";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	protected float getAISpeedSlithering() {
		return 0.03f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAISlitheringWaterBase(this, 1));
		tasks.addTask(1, new SlitheringWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MICROBIAL);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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
	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_KARAKHTIA;
	}
}