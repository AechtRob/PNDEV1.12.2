
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBundenbachiellusRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bundenbachiellus_raw")
	public static final Item block = null;
	public ItemBundenbachiellusRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bundenbachiellus_raw);
	}

	@Override
	public void initElements() {

		//elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/bundenbachiellus_raw", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("dnaPNBundenbachiellus", ItemBundenbachiellusRaw.block);
		//OreDictionary.registerOre("listAllfishraw", ItemBundenbachiellusRaw.block);
		//OreDictionary.registerOre("listAllmeatraw", ItemBundenbachiellusRaw.block);
		//OreDictionary.registerOre("foodMeat", ItemBundenbachiellusRaw.block);
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_bundenbachiellus_raw");
			setRegistryName("bundenbachiellus_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
