
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
public class ItemEggsGigantspinosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_gigantspinosaurus")
	public static final Item block = null;
	public ItemEggsGigantspinosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_gigantspinosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_gigantspinosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsGigantspinosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsGigantspinosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_gigantspinosaurus");
			setRegistryName("eggs_gigantspinosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_gigantspinosaurus";
		}
	}

}
