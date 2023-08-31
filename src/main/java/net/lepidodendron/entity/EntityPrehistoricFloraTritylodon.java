
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.render.entity.RenderTritylodon;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraTritylodon extends EntityPrehistoricFloraDiictodon {

	public EntityPrehistoricFloraTritylodon(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		minWidth = 0.12F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 8.0D;
	}

	public boolean hasAlarm() {
		return false;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}

	public static String getPeriod() {return "Jurassic";}

	//public static String getHabitat() {return "Terrestrial mammaliaform cynodont";}

	public float getAISpeedLand() {
		float speedBase = 0.26F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.75F;
		}
		return speedBase;
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:tritylodon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:tritylodon_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:tritylodon_death"));
	}

	@Override
	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:tritylodon_idle"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.TRITYLODON_LOOT_YOUNG;
		}
		return LepidodendronMod.TRITYLODON_LOOT;
	}


	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
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
		return RenderTritylodon.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelTritylodon;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderTritylodon.getScaler();
	}

}