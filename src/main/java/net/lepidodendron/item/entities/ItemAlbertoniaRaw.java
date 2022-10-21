
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
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
public class ItemAlbertoniaRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:albertonia_raw")
	public static final Item block = null;
	public ItemAlbertoniaRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.albertonia_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/albertonia_raw", "inventory"));
	}
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("dnaPNAlbertonia", ItemAlbertoniaRaw.block);
		OreDictionary.registerOre("listAllfishraw", ItemAlbertoniaRaw.block);
		OreDictionary.registerOre("listAllmeatraw", ItemAlbertoniaRaw.block);
		OreDictionary.registerOre("foodMeat", ItemAlbertoniaRaw.block);
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_albertonia_raw");
			setRegistryName("albertonia_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
