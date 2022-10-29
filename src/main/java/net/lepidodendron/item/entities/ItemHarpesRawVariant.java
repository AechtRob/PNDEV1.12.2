
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemHarpesRawVariant extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:harpes_raw_variant")
	public static final Item block = null;
	public ItemHarpesRawVariant(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.harpes_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/harpes_raw_variant", "inventory"));
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("dnaPNHarpes", ItemHarpesRawVariant.block);
		OreDictionary.registerOre("listAllfishraw", ItemHarpesRawVariant.block);
		OreDictionary.registerOre("listAllmeatraw", ItemHarpesRawVariant.block);
		OreDictionary.registerOre("foodMeat", ItemHarpesRawVariant.block);
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_harpes_raw_variant");
			setRegistryName("harpes_raw_variant");
			setCreativeTab(null);
			setMaxStackSize(64);
		}
	}
}
