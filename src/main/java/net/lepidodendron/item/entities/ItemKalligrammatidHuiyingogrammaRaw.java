
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemKalligrammatidHuiyingogrammaRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:kalligrammatid_huiyingogramma_raw")
	public static final Item block = null;
	public ItemKalligrammatidHuiyingogrammaRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.kalligrammatid_huiyingogramma_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/kalligrammatid_huiyingogramma_raw", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_palaeodictyoptera@lithomantis", ItemKalligrammatidHuiyingogrammaRaw.block);
		OreDictionary.registerOre("listAllmeatraw", ItemKalligrammatidHuiyingogrammaRaw.block);
		OreDictionary.registerOre("foodMeat", ItemKalligrammatidHuiyingogrammaRaw.block);
		OreDictionary.registerOre("listAllinsectraw", ItemKalligrammatidHuiyingogrammaRaw.block);
		OreDictionary.registerOre("foodInsect", ItemKalligrammatidHuiyingogrammaRaw.block);
		OreDictionary.registerOre("pndietBug", ItemKalligrammatidHuiyingogrammaRaw.block);
	}

	public static class ItemFoodCustom extends ItemGlassCaseDisplayItem {
		public ItemFoodCustom() {
			super();
			setTranslationKey("pf_kalligrammatid_huiyingogramma_raw");
			setRegistryName("kalligrammatid_huiyingogramma_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		@Override
		public String getMobStr() {
			return "lepidodendron:prehistoric_flora_palaeodictyoptera";
		}

		@Nullable
		@Override
		public String getVariantStr() {
			return "lithomantis";
		}
	}
}
