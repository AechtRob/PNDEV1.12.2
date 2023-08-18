
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSciadopitysLog;
import net.lepidodendron.item.ItemBalticAmberChunk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeAmberFromLogs extends ElementsLepidodendronMod.ModElement {
	public RecipeAmberFromLogs(ElementsLepidodendronMod instance) {
		super(instance, 477);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSciadopitysLog.block, (int) (1)), new ItemStack(ItemBalticAmberChunk.block, (int) (1)), 1F);
	}
}
