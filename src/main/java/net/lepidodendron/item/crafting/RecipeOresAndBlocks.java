
package net.lepidodendron.item.crafting;

import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

//@ElementsLepidodendronMod.ModElement.Tag
public class RecipeOresAndBlocks  {
//	public RecipeOresAndBlocks(ElementsLepidodendronMod instance) {
//		super(instance, 436);
//	}


	public static void registerSmelting() {

		for (ItemStack stack : OreDictionary.getOres("blockSand")) {
			GameRegistry.addSmelting(stack, new ItemStack(Blocks.GLASS, (int) (1)), 0.1F);
		}

		GameRegistry.addSmelting(new ItemStack(BlockMeteorite.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaCobble.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMossy.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaCobbleMolten.block, (int) (1)), new ItemStack(BlockLavaRock.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaRock.block, (int) (1)), new ItemStack(BlockLavaRockPolished.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockPebblestone.block, (int) (1)), new ItemStack(Blocks.STONE, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockPebblestoneMossy.block, (int) (1)), new ItemStack(Blocks.STONE, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaBrick.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickMossy.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockLavaBrickCarved.block, (int) (1)), new ItemStack(BlockLavaBrickCracked.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockSandPaleoproterozoic.block, (int) (1)), new ItemStack(Items.IRON_NUGGET, (int) (1)), 0.05F);

		GameRegistry.addSmelting(new ItemStack(BlockSandstoneBlack.block, (int) (1)), new ItemStack(BlockSandstoneBlackSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstoneWhite.block, (int) (1)), new ItemStack(BlockSandstoneWhiteSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstonePangaean.block, (int) (1)), new ItemStack(BlockSandstonePangaeanSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockSandstonePaleoproterozoic.block, (int) (1)), new ItemStack(BlockSandstonePaleoproterozoicSmooth.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(ItemClayBallRed.block, (int) (1)), new ItemStack(Items.BRICK, (int) (1)), 0.3F);
		GameRegistry.addSmelting(new ItemStack(ItemClayBallBrown.block, (int) (1)), new ItemStack(ItemBrickBrown.block, (int) (1)), 0.3F);

		GameRegistry.addSmelting(new ItemStack(BlockLavaRockZirconOre.block, (int) (1)), new ItemStack(ItemZircon.block, (int) (1)), 0.75F);
		GameRegistry.addSmelting(new ItemStack(BlockZirconOre.block, (int) (1)), new ItemStack(ItemZircon.block, (int) (1)), 0.75F);
		GameRegistry.addSmelting(new ItemStack(BlockObsidianZirconOre.block, (int) (1)), new ItemStack(ItemZircon.block, (int) (1)), 0.75F);

		GameRegistry.addSmelting(new ItemStack(BlockClayRed.block, (int) (1)), new ItemStack(Blocks.HARDENED_CLAY, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(BlockClayBrown.block, (int) (1)), new ItemStack(Blocks.HARDENED_CLAY, (int) (4)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(BlockCarboniferousMud.block, (int) (1)), new ItemStack(BlockDriedMud.block, (int) (1)), 0.15F);

		GameRegistry.addSmelting(new ItemStack(BlockDriedMud.block, (int) (1)), new ItemStack(BlockBrownstone.block, (int) (1)), 0.15F);

		GameRegistry.addSmelting(new ItemStack(BlockBrownstone.block, (int) (1)), new ItemStack(BlockBrownstoneSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStoneScoria.block, (int) (1)), new ItemStack(BlockStoneScoriaSmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStonePorphyry.block, (int) (1)), new ItemStack(BlockStonePorphyrySmooth.block, (int) (1)), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockStonePeridotite.block, (int) (1)), new ItemStack(BlockStonePeridotiteSmooth.block, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(BlockBalticAmberOre.block, (int) (1)), new ItemStack(ItemBalticAmberChunk.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockDominicanAmberOre.block, (int) (1)), new ItemStack(ItemDominicanAmberChunk.block, (int) (1)), 1F);

		GameRegistry.addSmelting(new ItemStack(BlockSaltBlock.block, (int) (1)), new ItemStack(ItemSodiumIngot.block, (int) (1)), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemSalt.block, (int) (1)), new ItemStack(ItemSodiumNugget.block, (int) (1)), 0.5F);

		GameRegistry.addSmelting(new ItemStack(BlockStickBundle.block, (int) (1)), new ItemStack(Items.COAL, (int) (1), 1), 0.5F);

	}
}
