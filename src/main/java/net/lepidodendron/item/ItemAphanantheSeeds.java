
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockAphanantheSapling;
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
public class ItemAphanantheSeeds extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:aphananthe_seeds")
	public static final Item block = null;
	public ItemAphanantheSeeds(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.aphananthe_seeds);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("pndietSeed", ItemAphanantheSeeds.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:aphananthe_seeds", "inventory"));
	}
	public static class ItemFoodCustom extends ItemPrehistoricPlantable {
		public ItemFoodCustom() {
			super(BlockAphanantheSapling.block.getDefaultState(), 1);
			setTranslationKey("pf_aphananthe_seeds");
			setRegistryName("aphananthe_seeds");
			setCreativeTab(TabLepidodendronPlants.tab);
		}
	}
}
