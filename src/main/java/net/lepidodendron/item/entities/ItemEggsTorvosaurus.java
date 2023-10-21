
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
public class ItemEggsTorvosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_torvosaurus")
	public static final Item block = null;
	public ItemEggsTorvosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_torvosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_torvosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsTorvosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsTorvosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_torvosaurus");
			setRegistryName("eggs_torvosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_torvosaurus";
		}
	}

}

