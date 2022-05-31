
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDominicanAmberOre;
import net.lepidodendron.item.ItemDominicanAmberChunk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeAmberBlockFromOreDom extends ElementsLepidodendronMod.ModElement {
	public RecipeAmberBlockFromOreDom(ElementsLepidodendronMod instance) {
		super(instance, 834);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDominicanAmberOre.block, (int) (1)), new ItemStack(ItemDominicanAmberChunk.block, (int) (1)), 1F);
	}
}
