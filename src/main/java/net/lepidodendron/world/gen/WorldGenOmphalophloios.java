package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenOmphalophloios extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;
        if (position.getY() <= Functions.getAdjustedSeaLevel(worldIn, position)+20) {
        	
	        for (int i = 0; i < 24; ++i)
	        {
	            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
	
	            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockOmphalophloiosSapling.block.canPlaceBlockAt(worldIn, blockpos))
	            {
	                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockOmphalophloiosBase.block.getDefaultState(), 2);
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockOmphalophloiosPlaceable.block.getDefaultState(), 2);
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
					if (worldIn.isAirBlock(blockpos.up(4))) {
						if (Math.random() > 0.7) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(3), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
							if (worldIn.isAirBlock(blockpos.up(5)))
								if (Math.random() > 0.7) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(4), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
									Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(5), BlockOmphalophloiosTop.block.getDefaultState(), 2);
								}
							else {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(4), BlockOmphalophloiosTop.block.getDefaultState(), 2);
							}
						}
					}
					else {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,position.up(3), BlockOmphalophloiosTop.block.getDefaultState(), 2);
					}
	                flag = true;
	            }
	        }
        }

        return flag;
    }
}
