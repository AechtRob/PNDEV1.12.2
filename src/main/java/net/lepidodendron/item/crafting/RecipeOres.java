
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeOres extends ElementsLepidodendronMod.ModElement {
	public RecipeOres(ElementsLepidodendronMod instance) {
		super(instance, 436);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMeteorite.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaCobble.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMossy.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMolten.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaRock.block, (int) (1)), new ItemStack(BlockLavaRockPolished.block, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaBrick.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickMossy.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickCarved.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 1F);

	}
}
