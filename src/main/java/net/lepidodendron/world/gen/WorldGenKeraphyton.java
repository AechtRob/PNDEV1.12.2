package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockKeraphyton;
import net.lepidodendron.block.BlockPietzschia;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenKeraphyton extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(7) - rand.nextInt(7), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(7) - rand.nextInt(7));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPietzschia.block.canPlaceBlockAt(worldIn, blockpos)
            	)
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockKeraphyton.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
