
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
public class ItemEggsDimetrodonTeutonis extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_dimetrodon_teutonis")
	public static final Item block = null;
	public ItemEggsDimetrodonTeutonis(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_dimetrodon_teutonis);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_dimetrodon_teutonis", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("egg", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("eggCookable", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("listAllegg", ItemEggsDimetrodonTeutonis.block);
		OreDictionary.registerOre("objectEgg", ItemEggsDimetrodonTeutonis.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_dimetrodon_teutonis");
			setRegistryName("eggs_dimetrodon_teutonis");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_dimetrodon_teutonis";
		}
	}

}
