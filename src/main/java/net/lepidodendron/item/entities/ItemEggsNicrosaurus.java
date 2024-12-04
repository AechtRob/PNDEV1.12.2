
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
public class ItemEggsNicrosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_nicrosaurus")
	public static final Item block = null;
	public ItemEggsNicrosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_nicrosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_nicrosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsNicrosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsNicrosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_nicrosaurus");
			setRegistryName("eggs_nicrosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_nicrosaurus";
		}
	}

}
