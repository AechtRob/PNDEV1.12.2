
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
public class ItemEggsAnurognathidVesperopterylus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_anurognathid_vesperopterylus")
	public static final Item block = null;
	public ItemEggsAnurognathidVesperopterylus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_anurognathid_vesperopterylus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_anurognathid_vesperopterylus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("egg", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAnurognathidVesperopterylus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAnurognathidVesperopterylus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_anurognathid_vesperopterylus");
			setRegistryName("eggs_anurognathid_vesperopterylus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_anurognathid@vesperopterylus";
		}

	}

}
