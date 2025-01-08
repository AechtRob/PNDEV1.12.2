package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockStromatolite;
import net.lepidodendron.block.BlockThrombolite;
import net.lepidodendron.block.BlockToxicMud;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenToxicMud extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
				&& worldIn.isAirBlock(blockpos.up())
                && (worldIn.getBlockState(blockpos.down()).getBlock() != BlockStromatolite.block)
                && (worldIn.getBlockState(blockpos.down()).getBlock() != BlockThrombolite.block)
            	&& (
            		((worldIn.getBlockState(blockpos)).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos)).getMaterial() == Material.ROCK)
            	)
				&& (((worldIn.getBlockState(blockpos.north())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.south())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.east())).getMaterial() == Material.WATER)
					|| ((worldIn.getBlockState(blockpos.west())).getMaterial() == Material.WATER))
            )
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockToxicMud.block.getDefaultState(), 2);
                flag = true;

        }

        return flag;
    }
}
