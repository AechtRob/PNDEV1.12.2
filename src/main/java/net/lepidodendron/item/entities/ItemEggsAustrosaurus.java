
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
public class ItemEggsAustrosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_austrosaurus")
	public static final Item block = null;
	public ItemEggsAustrosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_austrosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_austrosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAustrosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAustrosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_austrosaurus");
			setRegistryName("eggs_austrosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_austrosaurus";
		}
	}

}
