
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBundenbachiellusCooked extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bundenbachiellus_cooked")
	public static final Item block = null;
	public ItemBundenbachiellusCooked(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bundenbachiellus_cooked);
	}

	@Override
	public void initElements() {

		//elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/bundenbachiellus_cooked", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("listAllfishcooked", ItemBundenbachiellusCooked.block);
		//OreDictionary.registerOre("foodCooked", ItemBundenbachiellusCooked.block);
		//OreDictionary.registerOre("foodMeat", ItemBundenbachiellusCooked.block);
		//OreDictionary.registerOre("listAllmeatcooked", ItemBundenbachiellusCooked.block);
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.7f, false);
			setTranslationKey("pf_bundenbachiellus_cooked");
			setRegistryName("bundenbachiellus_cooked");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

	}
}
