package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSinocarpus;
import net.lepidodendron.block.BlockSinoherba;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSinoherba extends WorldGenerator
{
	
	public static final Block block = null;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSinocarpus.block.canPlaceBlockAt(worldIn, blockpos))
            {
				worldIn.setBlockState(blockpos, BlockSinoherba.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}



