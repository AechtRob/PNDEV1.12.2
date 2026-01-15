
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
public class ItemEggsTupandactylus_imperator extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_tupandactylus_imperator")
	public static final Item block = null;
	public ItemEggsTupandactylus_imperator(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_tupandactylus_imperator);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_tupandactylus_imperator", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("egg", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("eggCookable", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("listAllegg", ItemEggsTupandactylus_imperator.block);
		OreDictionary.registerOre("objectEgg", ItemEggsTupandactylus_imperator.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_tupandactylus_imperator");
			setRegistryName("eggs_tupandactylus_imperator");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_tupandactylus_imperator";
		}
	}

}
