
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
public class ItemEndothiodonRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:endothiodon_raw")
	public static final Item block = null;
	public ItemEndothiodonRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.endothiodon_raw);
	}

	@Override
	public void initElements() {

		//elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/endothiodon_raw", "inventory"));
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("dnaPNEndothiodon", ItemEndothiodonRaw.block);
		//OreDictionary.registerOre("listAllmeatraw", ItemEndothiodonRaw.block);
		//OreDictionary.registerOre("foodMeat", ItemEndothiodonRaw.block);
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_endothiodon_raw");
			setRegistryName("endothiodon_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
