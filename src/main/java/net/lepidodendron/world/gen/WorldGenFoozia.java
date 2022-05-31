package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockFoozia;
import net.lepidodendron.block.BlockFooziaSpore;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenFoozia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockFoozia.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockFoozia.block.getDefaultState(), 2);
				if ((Math.random() > 0.7)) {
					worldIn.setBlockState(blockpos, BlockFooziaSpore.block.getDefaultState(), 2);
	        	}
                flag = true;
            }
        }

        return flag;
    }
}
