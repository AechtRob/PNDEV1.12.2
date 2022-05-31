
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBalticAmberOre;
import net.lepidodendron.item.ItemBalticAmberChunk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeAmberBlockFromOre extends ElementsLepidodendronMod.ModElement {
	public RecipeAmberBlockFromOre(ElementsLepidodendronMod instance) {
		super(instance, 436);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBalticAmberOre.block, (int) (1)), new ItemStack(ItemBalticAmberChunk.block, (int) (1)), 1F);
	}
}
