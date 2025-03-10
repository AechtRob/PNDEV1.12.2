
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.render.entity.RenderGueragama;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGueragama extends EntityPrehistoricFloraMorganucodon implements ITrappableLand, IAdvancementGranter {

	public EntityPrehistoricFloraGueragama(World world) {
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
		return ModTriggers.CLICK_GUERAGAMA;
	}


	public static String getPeriod() {return "Early Cretaceous";}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.BUG, DietString.MEAT), DietString.FRUIT);
	}

	public float getAISpeedLand() {
		float speedBase = 0.26F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
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
		return LepidodendronMod.GUERAGAMA_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetPlinth() { return 0.16; }
	public static double offsetWall(@Nullable String variant) { return 0.00; }
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderGueragama.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelGueragama;}
	public static float getScaler(@Nullable String variant) {return RenderGueragama.getScaler();}

}