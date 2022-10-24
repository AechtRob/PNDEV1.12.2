
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
public class ItemEggsCaptorhinus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_captorhinus")
	public static final Item block = null;
	public ItemEggsCaptorhinus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_captorhinus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_captorhinus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("egg", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsCaptorhinus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsCaptorhinus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_captorhinus");
			setRegistryName("eggs_captorhinus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_captorhinus";
		}
	}

}
