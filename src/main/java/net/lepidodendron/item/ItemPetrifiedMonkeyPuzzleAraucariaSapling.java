
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockMonkeyPuzzleAraucariaSapling;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPetrifiedMonkeyPuzzleAraucariaSapling extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:petrified_monkey_puzzle_araucaria_sapling")
	public static final Item block = null;
	public ItemPetrifiedMonkeyPuzzleAraucariaSapling(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.petrified_monkey_puzzle_araucaria_sapling);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:petrified_monkey_puzzle_araucaria_sapling", "inventory"));
	}
	public static class ItemCustom extends ItemPetrified {
		public ItemCustom() {
			super(BlockMonkeyPuzzleAraucariaSapling.block);
			setTranslationKey("pf_petrified_monkey_puzzle_araucaria_sapling");
			setRegistryName("petrified_monkey_puzzle_araucaria_sapling");
		}
	}
}
