
package net.lepidodendron.item.entities;
import net.lepidodendron.ElementsLepidodendronMod;
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
public class ItemAphnelepisRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:aphnelepis_raw")
	public static final Item block = null;
	public ItemAphnelepisRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.aphnelepis_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/aphnelepis_raw", "inventory"));
	}
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_aphnelepis", ItemAphnelepisRaw.block);
		OreDictionary.registerOre("listAllfishraw", ItemAphnelepisRaw.block);
		OreDictionary.registerOre("foodFish", ItemAphnelepisRaw.block);
		OreDictionary.registerOre("pndietFish", ItemAphnelepisRaw.block);
	}
	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_aphnelepis_raw");
			setRegistryName("aphnelepis_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

	}
}


