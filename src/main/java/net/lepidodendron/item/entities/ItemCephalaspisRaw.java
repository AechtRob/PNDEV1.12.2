
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

@ElementsLepidodendronMod.ModElement.Tag
public class ItemCephalaspisRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:cephalaspis_raw")
	public static final Item block = null;
	public ItemCephalaspisRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.cephalaspis_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/cephalaspis_raw", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_cephalaspis", ItemCephalaspisRaw.block);
		OreDictionary.registerOre("listAllfishraw", ItemCephalaspisRaw.block);
		OreDictionary.registerOre("foodFish", ItemCephalaspisRaw.block);
		OreDictionary.registerOre("pndietFish", ItemCephalaspisRaw.block);
	}
	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_cephalaspis_raw");
			setRegistryName("cephalaspis_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
