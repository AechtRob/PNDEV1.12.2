package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPotamogeton;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPotamogeton extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && canSurviveAt(worldIn, blockpos))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPotamogeton.block.getDefaultState(), 2);
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

    	double getLight = worldIn.getLight(pos);
    	if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
    	{
    		return false;
    	}

    	return true;
    	 
    }
}
