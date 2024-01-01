package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCorallineAlgae;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCorallineAlgae extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && canSurviveAt(worldIn, blockpos))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockCorallineAlgae.block.getDefaultState(), 2);
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
            && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.ROCK)
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
    	{
    		return false;
    	}

    	//only place away from the sides:
    	boolean water = true;
    	int x = -2;
    	while (x <= 2) {
            int z = -2;
    	    while (z <= 2) {
                if (worldIn.getBlockState(pos.down().add(x,0, z)).getMaterial() != Material.WATER) {
                    water = false;
                }
    	        z += 1;
            }
    	    x += 1;
        }
        if (!water)
        {
            return false;
        }

        if (pos.getY() > (Functions.getAdjustedSeaLevel(worldIn, pos) + 1) || pos.getY() < (Functions.getAdjustedSeaLevel(worldIn, pos) - 1)) {
            return false;
        }

    	return true;
    	 
    }
}
