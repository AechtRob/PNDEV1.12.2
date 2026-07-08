
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
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
public class ItemEggsXinjiangtitan extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_xinjiangtitan")
	public static final Item block = null;
	public ItemEggsXinjiangtitan(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_xinjiangtitan);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_xinjiangtitan", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("egg", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("eggCookable", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("listAllegg", ItemEggsXinjiangtitan.block);
		OreDictionary.registerOre("objectEgg", ItemEggsXinjiangtitan.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_xinjiangtitan");
			setRegistryName("eggs_xinjiangtitan");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_xinjiangtitan";
		}
	}

}
