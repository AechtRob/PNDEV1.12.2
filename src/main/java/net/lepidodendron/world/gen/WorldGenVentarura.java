package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockVentarura;
import net.lepidodendron.block.BlockVentaruraSpore;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenVentarura extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockVentarura.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVentarura.block.getDefaultState(), 2);
				if ((Math.random() > 0.7)) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVentaruraSpore.block.getDefaultState(), 2);
	        	}
                flag = true;
            }
        }

        return flag;
    }
}
