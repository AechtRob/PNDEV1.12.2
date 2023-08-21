
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
public class ItemKalligrammatidLiassopsychopsRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:kalligrammatid_liassopsychops_raw")
	public static final Item block = null;
	public ItemKalligrammatidLiassopsychopsRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.kalligrammatid_liassopsychops_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/kalligrammatid_liassopsychops_raw", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_kalligrammatid@liassopsychops", ItemKalligrammatidLiassopsychopsRaw.block);
		OreDictionary.registerOre("pnfurnaceBug", ItemKalligrammatidLiassopsychopsRaw.block);
		OreDictionary.registerOre("pndietBug", ItemKalligrammatidLiassopsychopsRaw.block);
	}

	public static class ItemFoodCustom extends ItemGlassCaseDisplayItem {
		public ItemFoodCustom() {
			super();
			setTranslationKey("pf_kalligrammatid_liassopsychops_raw");
			setRegistryName("kalligrammatid_liassopsychops_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		@Override
		public String getMobStr() {
			return "lepidodendron:prehistoric_flora_kalligrammatid";
		}

		@Nullable
		@Override
		public String getVariantStr() {
			return "liassopsychops";
		}
	}
}
