package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockRhyniaLand;
import net.lepidodendron.block.BlockRhyniaLandSpore;
import net.lepidodendron.block.BlockRhyniaWater;
import net.lepidodendron.block.BlockRhyniaWaterSpore;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenRhynia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockRhyniaLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockRhyniaLand.block.getDefaultState(), 2);
				if ((Math.random() > 0.7)) {
					worldIn.setBlockState(blockpos, BlockRhyniaLandSpore.block.getDefaultState(), 2);
	        	}
                flag = true;
            }
            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockRhyniaWater.block.canPlaceBlockAt(worldIn, blockpos))
            {
                worldIn.setBlockState(blockpos, BlockRhyniaWater.block.getDefaultState(), 2);
                if ((Math.random() > 0.7)) {
                    worldIn.setBlockState(blockpos, BlockRhyniaWaterSpore.block.getDefaultState(), 2);
                }
                flag = true;
            }
        }

        return flag;
    }
}
