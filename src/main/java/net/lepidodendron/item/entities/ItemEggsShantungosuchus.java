
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
public class ItemEggsShantungosuchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_shantungosuchus")
	public static final Item block = null;
	public ItemEggsShantungosuchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_shantungosuchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_shantungosuchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("egg", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsShantungosuchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsShantungosuchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_shantungosuchus");
			setRegistryName("eggs_shantungosuchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_shantungosuchus";
		}
	}

}
