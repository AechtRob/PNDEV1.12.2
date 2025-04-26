
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockUllmanniaSapling;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
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
public class ItemUllmanniaSeed extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:ullmannia_seed")
	public static final Item block = null;
	public ItemUllmanniaSeed(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.ullmannia_seed);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("pndietSeed", ItemUllmanniaSeed.block);
		OreDictionary.registerOre("foodPinenuts", ItemUllmanniaSeed.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:ullmannia_seed", "inventory"));
	}
	public static class ItemFoodCustom extends ItemPrehistoricPlantable {
		public ItemFoodCustom() {
			super(BlockUllmanniaSapling.block.getDefaultState(), 1);
			setTranslationKey("pf_ullmannia_seed");
			setRegistryName("ullmannia_seed");
			setCreativeTab(TabLepidodendronPlants.tab);
		}
	}
}
