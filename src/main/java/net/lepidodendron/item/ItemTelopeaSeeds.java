
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockTelopea;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemTelopeaSeeds extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:telopea_seeds")
	public static final Item block = null;
	public ItemTelopeaSeeds(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.telopea_seeds);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:telopea_seeds", "inventory"));
	}
	public static class ItemCustom extends ItemPrehistoricPlantable {
		public ItemCustom() {
			super(BlockTelopea.block.getDefaultState(),1);
			setTranslationKey("pf_telopea_seeds");
			setRegistryName("telopea_seeds");
			setCreativeTab(TabLepidodendronPlants.tab);
		}
	}
}
