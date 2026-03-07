package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockNotocyamus;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenNotocyamus extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight)
    {
        if (minHeight == 0) {
            minHeight = Functions.getAdjustedSeaLevel(worldIn, position) - 4;
        }
        boolean flag = false;

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() > minHeight + (rand.nextInt(5) - 2) && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && canSurviveAt(worldIn, blockpos))
            {
                if (rand.nextInt(3) == 0) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockNotocyamus.block.getDefaultState().withProperty(BlockNotocyamus.BlockCustom.FLOWERS, true), 2);
                }
                else {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockNotocyamus.block.getDefaultState().withProperty(BlockNotocyamus.BlockCustom.FLOWERS, false), 2);
                }
                flag = true;
            }
        }

        return flag;
    }

    public boolean canSurviveAt(World worldIn, BlockPos pos) {
		if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE) 
    	{
    		return false;
    	}
    	if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND) 
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
    	{
    		return false;
    	}

//    	double getLight = worldIn.getLight(pos);
//    	if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
//    	{
//    		return false;
//    	}

    	return true;
    	 
    }
}
