package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGuangdedendron;
import net.lepidodendron.block.BlockGuangdedendronTop;
import net.lepidodendron.block.BlockGuangdedendronTopNospore;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGuangdedendron extends WorldGenerator
{
	
	public static final Block block = null;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockGuangdedendron.block.canPlaceBlockAt(worldIn, blockpos))
            {
            
				BlockPos blockpos2 = blockpos.down();
				int j = 1 + rand.nextInt(rand.nextInt(7) + 1);
				j = Math.min(7, j);
				for (int k = 0; k <= j; ++k){
					if (BlockGuangdedendron.block.canPlaceBlockAt(worldIn, blockpos)) {
						if (k != j) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(k), BlockGuangdedendron.block.getDefaultState(), 2);}
						if ((k == j) 
							&& ((worldIn.isAirBlock(blockpos.up(k))) || (worldIn.getBlockState(blockpos.up(k)).getBlock() == BlockGuangdedendronTopNospore.block))
							) {
							//System.err.println("k value: " + k);
							if (k >= 7) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(k), BlockGuangdedendronTop.block.getDefaultState(), 2);
							}
							else {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(k), BlockGuangdedendronTopNospore.block.getDefaultState(), 2);
							}
						}
					}
				}

                flag = true;
            }
        }

        return flag;
    }
}



