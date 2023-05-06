
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.render.entity.RenderPseudotherium;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraDocodon extends EntityPrehistoricFloraMorganucodon {

	public EntityPrehistoricFloraDocodon(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.12F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 6.0D;
	}

	public static String getPeriod() {return "Jurassic";}

	//public static String getHabitat() {return "Terrestrial mammaliaform cynodont";}


	protected float getAISpeedLand() {
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
	            .getObject(new ResourceLocation("lepidodendron:pseudotherium_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:pseudotherium_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:pseudotherium_death"));
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.DOCODON_LOOT;
	}


	//Rendering taxidermy:
	//--------------------
	public static double offsetWall() {
		return 0.01;
	}
	public static double upperfrontverticallinedepth() {
		return 1.4;
	}
	public static double upperbackverticallinedepth() {
		return 0.8;
	}
	public static double upperfrontlineoffset() {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular() {
		return -0F;
	}
	public static double upperbacklineoffset() {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular() {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth() {
		return 0;
	}
	public static double lowerbackverticallinedepth() {
		return 0;
	}
	public static double lowerfrontlineoffset() {
		return 0.4;
	}
	public static double lowerfrontlineoffsetperpendiular() {
		return -0F;
	}
	public static double lowerbacklineoffset() {
		return 0.4;
	}
	public static double lowerbacklineoffsetperpendiular() {
		return -0.15F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay() {
		return RenderDisplays.TEXTURE_PSEUDOTHERIUM;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay() {
		return RenderDisplays.modelPseudotherium;
	}
	public static float getScaler() {
		return RenderPseudotherium.getScaler();
	}

}