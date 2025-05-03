package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSawdonia;
import net.lepidodendron.block.BlockSawdoniaSpore;
import net.lepidodendron.block.BlockSawdoniaStem;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSawdonia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSawdonia.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockSawdonia.block.getDefaultState(), 2);
				if ((Math.random() > 0.7)) {
					if ((Math.random() > 0.7)) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockSawdoniaStem.block.getDefaultState(), 2);
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockSawdoniaSpore.block.getDefaultState(), 2);
					}
	        	}
                flag = true;
            }
        }

        return flag;
    }
}
