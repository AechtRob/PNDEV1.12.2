
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
public class ItemEggsHeterodontosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_heterodontosaurus")
	public static final Item block = null;
	public ItemEggsHeterodontosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_heterodontosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_heterodontosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsHeterodontosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsHeterodontosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_heterodontosaurus");
			setRegistryName("eggs_heterodontosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_heterodontosaurus";
		}
	}

}
