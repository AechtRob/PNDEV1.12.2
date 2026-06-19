
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
public class ItemEggsSinotyrannus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_sinotyrannus")
	public static final Item block = null;
	public ItemEggsSinotyrannus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_sinotyrannus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_sinotyrannus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("egg", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsSinotyrannus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsSinotyrannus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_sinotyrannus");
			setRegistryName("eggs_sinotyrannus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_sinotyrannus";
		}
	}

}
