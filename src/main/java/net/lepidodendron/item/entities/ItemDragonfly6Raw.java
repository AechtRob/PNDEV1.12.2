
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
public class ItemDragonfly6Raw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dragonfly_dragonfly6_raw")
	public static final Item block = null;
	public ItemDragonfly6Raw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dragonfly_dragonfly6_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/dragonfly_dragonfly6_raw", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_dragonfly@dragonfly1", ItemDragonfly6Raw.block);
		OreDictionary.registerOre("listAllmeatraw", ItemDragonfly6Raw.block);
		OreDictionary.registerOre("foodMeat", ItemDragonfly6Raw.block);
		OreDictionary.registerOre("listAllinsectraw", ItemDragonfly6Raw.block);
		OreDictionary.registerOre("foodInsect", ItemDragonfly6Raw.block);
		OreDictionary.registerOre("pndietBug", ItemDragonfly6Raw.block);
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_dragonfly_dragonfly6_raw");
			setRegistryName("dragonfly_dragonfly6_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
