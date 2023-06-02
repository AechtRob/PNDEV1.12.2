
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
public class ItemEggsSilesaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_silesaurus")
	public static final Item block = null;
	public ItemEggsSilesaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_silesaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_silesaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("egg", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsSilesaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsSilesaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_silesaurus");
			setRegistryName("eggs_silesaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_silesaurus";
		}
	}

}
