
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemJuliformRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:myriapod_juliform_raw")
	public static final Item block = null;
	public ItemJuliformRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.juliform_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/myriapod_myriapod_juliform_raw", "inventory"));
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_myriapod@juliform", ItemJuliformRaw.block);
		OreDictionary.registerOre("pnfurnaceBug", ItemJuliformRaw.block);
		OreDictionary.registerOre("pndietBug", ItemJuliformRaw.block);
	}

	public static class ItemFoodCustom extends ItemGlassCaseDisplayItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_myriapod_juliform_raw");
			setRegistryName("myriapod_juliform_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		@Override
		public String getMobStr() {
			return "lepidodendron:prehistoric_flora_myriapod";
		}

		@Nullable
		@Override
		public String getVariantStr() {
			return "juliform";
		}
	}
}
