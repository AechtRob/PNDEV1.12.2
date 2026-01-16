
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
public class ItemEggsKuehneosuchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_kuehneosuchus")
	public static final Item block = null;
	public ItemEggsKuehneosuchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_kuehneosuchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_kuehneosuchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("egg", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsKuehneosuchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsKuehneosuchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_kuehneosuchus");
			setRegistryName("eggs_kuehneosuchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_kuehneosuchus";
		}
	}

}
