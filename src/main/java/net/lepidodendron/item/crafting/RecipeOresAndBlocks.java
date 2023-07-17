
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.item.ItemRedClayBall;
import net.lepidodendron.item.ItemZircon;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeOresAndBlocks extends ElementsLepidodendronMod.ModElement {
	public RecipeOresAndBlocks(ElementsLepidodendronMod instance) {
		super(instance, 436);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMeteorite.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaCobble.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMossy.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMolten.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaRock.block, (int) (1)), new ItemStack(BlockLavaRockPolished.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaBrick.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickMossy.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickCarved.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockSandPaleoproterozoic.block, (int) (1)), new ItemStack(Items.IRON_NUGGET, (int) (1)), 0.05F);

		GameRegistry.addSmelting(new ItemStack(BlockSandstoneBlack.block, (int) (1)), new ItemStack(BlockSandstoneBlackSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstoneWhite.block, (int) (1)), new ItemStack(BlockSandstoneWhiteSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstonePangaean.block, (int) (1)), new ItemStack(BlockSandstonePangaeanSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstonePaleoproterozoic.block, (int) (1)), new ItemStack(BlockSandstonePaleoproterozoicSmooth.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(ItemRedClayBall.block, (int) (1)), new ItemStack(Items.BRICK, (int) (1)), 0.3F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaRockZirconOre.block, (int) (1)), new ItemStack(ItemZircon.block, (int) (1)), 0.75F);

		GameRegistry.addSmelting(new ItemStack(BlockRedClay.block, (int) (1)), new ItemStack(Blocks.HARDENED_CLAY, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(BlockCarboniferousMud.block, (int) (1)), new ItemStack(BlockDriedMud.block, (int) (1)), 0.15F);

		GameRegistry.addSmelting(new ItemStack(BlockDriedMud.block, (int) (1)), new ItemStack(BlockBrownstone.block, (int) (1)), 0.15F);

		GameRegistry.addSmelting(new ItemStack(BlockBrownstone.block, (int) (1)), new ItemStack(BlockBrownstoneSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStoneScoria.block, (int) (1)), new ItemStack(BlockStoneScoriaSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStonePorphyry.block, (int) (1)), new ItemStack(BlockStonePorphyrySmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStonePeridotite.block, (int) (1)), new ItemStack(BlockStonePeridotiteSmooth.block, (int) (1)), 0.1F);

	}
}
