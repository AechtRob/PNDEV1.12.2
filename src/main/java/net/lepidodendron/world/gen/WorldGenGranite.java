package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGranite extends WorldGenerator
{

	public boolean generate(World worldIn, Random rand, BlockPos position)
	{
		boolean flag = false;

		for (int i = 0; i < 64; ++i)
		{
			BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos)
					&& (
					((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GROUND)
							|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GRASS)
							|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.SAND)
							|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.CLAY)
			)
			)
			{
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), Blocks.STONE.getStateFromMeta(1), 2);
				if (rand.nextInt(10) == 0) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, Blocks.STONE.getStateFromMeta(1), 2);
					if (rand.nextInt(4) == 0) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down().north(), Blocks.STONE.getStateFromMeta(1), 2);
					}
					if (rand.nextInt(4) == 0) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down().south(), Blocks.STONE.getStateFromMeta(1), 2);
					}
					if (rand.nextInt(4) == 0) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down().east(), Blocks.STONE.getStateFromMeta(1), 2);
					}
					if (rand.nextInt(4) == 0) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down().west(), Blocks.STONE.getStateFromMeta(1), 2);
					}
				}
				flag = true;
			}
		}

		return flag;
	}
}
