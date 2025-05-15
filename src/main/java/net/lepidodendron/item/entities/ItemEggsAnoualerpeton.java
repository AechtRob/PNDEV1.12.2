
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
public class ItemEggsAnoualerpeton extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_anoualerpeton")
	public static final Item block = null;
	public ItemEggsAnoualerpeton(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_anoualerpeton);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_anoualerpeton", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("egg", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAnoualerpeton.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAnoualerpeton.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_anoualerpeton");
			setRegistryName("eggs_anoualerpeton");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_anoualerpeton";
		}
	}

}
