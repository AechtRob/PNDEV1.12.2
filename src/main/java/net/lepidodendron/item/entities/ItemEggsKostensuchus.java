
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
public class ItemEggsKostensuchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_kostensuchus")
	public static final Item block = null;
	public ItemEggsKostensuchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_kostensuchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_kostensuchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("egg", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsKostensuchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsKostensuchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_kostensuchus");
			setRegistryName("eggs_kostensuchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_kostensuchus";
		}
	}

}
