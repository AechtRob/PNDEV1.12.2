
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemNautiloidEggsAsteroceras;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;


public class EntityPrehistoricFloraAmmonite_Asteroceras extends EntityPrehistoricFloraNautiloidBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraAmmonite_Asteroceras(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 4;
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean canShoal() {
		return (!(this.getAlarmCooldown() > 0));
	}

	@Override
	public int getShoalSize() {
		return 6;
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

	public static String getSize() {return "S";}

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
		return 36000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		return 0.2f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new NautiloidWander(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return DietString.FISHFOOD;
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

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemNautiloidEggsAsteroceras.block, (int) (1));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.ASTEROCERAS_LOOT_YOUNG;
		}
		return LepidodendronMod.ASTEROCERAS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_AMMONITE_ASTEROCERAS;

	}
}

