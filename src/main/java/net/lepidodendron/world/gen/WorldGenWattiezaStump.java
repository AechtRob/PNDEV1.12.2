package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenWattiezaStump extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockWattiezaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockWattiezaLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockWattiezaLog.block)
            	)
            {
                int ii = rand.nextInt(3);
                int iii = 0;
                while (iii <= ii) {
                    worldIn.setBlockState(blockpos.up(iii), BlockWattiezaLog.block.getDefaultState(), 3);
                    iii += 1;
                }
                flag = true;
            }
        }

        return flag;
    }
}
