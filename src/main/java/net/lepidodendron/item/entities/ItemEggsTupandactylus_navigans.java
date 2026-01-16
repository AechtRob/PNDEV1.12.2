
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
public class ItemEggsTupandactylus_navigans extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_tupandactylus_navigans")
	public static final Item block = null;
	public ItemEggsTupandactylus_navigans(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_tupandactylus_navigans);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_tupandactylus_navigans", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("egg", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("eggCookable", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("listAllegg", ItemEggsTupandactylus_navigans.block);
		OreDictionary.registerOre("objectEgg", ItemEggsTupandactylus_navigans.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_tupandactylus_navigans");
			setRegistryName("eggs_tupandactylus_navigans");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_tupandactylus_navigans";
		}
	}

}
