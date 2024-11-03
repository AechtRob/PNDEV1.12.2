
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
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
public class ItemHeteropetalusRawF extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:heteropetalus_raw_f")
	public static final Item block = null;
	public ItemHeteropetalusRawF(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.heteropetalus_f_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/heteropetalus_raw_f", "inventory"));
	}


	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_heteropetalus@female", ItemHeteropetalusRawF.block);
		OreDictionary.registerOre("listAllfishraw", ItemHeteropetalusRawF.block);
		OreDictionary.registerOre("pnfurnaceFish", ItemHeteropetalusRawF.block);
		OreDictionary.registerOre("pndietFish", ItemHeteropetalusRawF.block);
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_heteropetalus_raw_f");
			setRegistryName("heteropetalus_raw_f");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		public String getVariantStr() {
			return "female";
		}
	}
}
