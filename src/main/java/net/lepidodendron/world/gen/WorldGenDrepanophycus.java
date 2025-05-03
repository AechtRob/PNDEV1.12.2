package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDrepanophycusLand;
import net.lepidodendron.block.BlockDrepanophycusWater;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDrepanophycus extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(6) - rand.nextInt(6), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(6) - rand.nextInt(6));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockDrepanophycusLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDrepanophycusLand.block.getDefaultState(), 2);
                flag = true;
            }
            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockDrepanophycusWater.block.canPlaceBlockAt(worldIn, blockpos))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDrepanophycusWater.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
