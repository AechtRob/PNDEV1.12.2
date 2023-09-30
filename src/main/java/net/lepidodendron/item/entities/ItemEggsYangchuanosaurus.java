
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
public class ItemEggsYangchuanosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_yangchuanosaurus")
	public static final Item block = null;
	public ItemEggsYangchuanosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_yangchuanosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_yangchuanosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsYangchuanosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsYangchuanosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_yangchuanosaurus");
			setRegistryName("eggs_yangchuanosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_yangchuanosaurus";
		}
	}

}

