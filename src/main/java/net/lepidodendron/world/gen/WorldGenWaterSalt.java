package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSaltBlock;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenWaterSalt extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int seaLevel)
    {
        if (seaLevel == 0) {
            seaLevel = Functions.getAdjustedSeaLevel(worldIn, position);
        }
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
				&& (blockpos.getY() == seaLevel || blockpos.getY() == seaLevel + 1 || blockpos.getY() == seaLevel - 1 || blockpos.getY() == seaLevel - 2)
            	&& (
            		((worldIn.getBlockState(blockpos)).getMaterial() == Material.GROUND)
                    || ((worldIn.getBlockState(blockpos)).getMaterial() == Material.SAND)
            		|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.ROCK)
            	)
				&& (((worldIn.getBlockState(blockpos.north())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.south())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.east())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.west())).getMaterial() == Material.WATER)
                    || ((worldIn.getBlockState(blockpos.down().north())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.down().south())).getMaterial() == Material.WATER)
                    || ((worldIn.getBlockState(blockpos.down().east())).getMaterial() == Material.WATER)
                    || ((worldIn.getBlockState(blockpos.down().west())).getMaterial() == Material.WATER))
            )
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockSaltBlock.block.getDefaultState(), 2);
                flag = true;

        }

        return flag;
    }
}
