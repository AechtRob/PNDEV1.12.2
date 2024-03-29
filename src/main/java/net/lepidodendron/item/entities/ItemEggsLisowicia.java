
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
public class ItemEggsLisowicia extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_lisowicia")
	public static final Item block = null;
	public ItemEggsLisowicia(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_lisowicia);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_lisowicia", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsLisowicia.block);
		OreDictionary.registerOre("egg", ItemEggsLisowicia.block);
		OreDictionary.registerOre("eggCookable", ItemEggsLisowicia.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsLisowicia.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsLisowicia.block);
		OreDictionary.registerOre("listAllegg", ItemEggsLisowicia.block);
		OreDictionary.registerOre("objectEgg", ItemEggsLisowicia.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_lisowicia");
			setRegistryName("eggs_lisowicia");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_lisowicia";
		}
	}

}
