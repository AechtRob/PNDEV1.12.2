
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraMegachirella extends EntityPrehistoricFloraMorganucodon implements ITrappableLand, IAdvancementGranter {

	public EntityPrehistoricFloraMegachirella(World world) {
		super(world);
		setSize(0.3F, 0.15F);
		minWidth = 0.12F;
		maxWidth = 0.3F;
		maxHeight = 0.15F;
		maxHealthAgeable = 4.0D;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_MEGACHIRELLA;
	}


	public static String getPeriod() {return "Triassic";}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.BUG, DietString.MEAT));
	}

	public float getAISpeedLand() {
		float speedBase = 0.20F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.25F;
		}
		return speedBase;
	}


	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:clevosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:clevosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:clevosaurus_death"));
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.MEGACHIRELLA_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
}