
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
public class ItemEggsAraripemys extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_araripemys")
	public static final Item block = null;
	public ItemEggsAraripemys(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_araripemys);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_araripemys", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAraripemys.block);
		OreDictionary.registerOre("egg", ItemEggsAraripemys.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAraripemys.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAraripemys.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAraripemys.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAraripemys.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAraripemys.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_araripemys");
			setRegistryName("eggs_araripemys");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_araripemys";
		}
	}

}
