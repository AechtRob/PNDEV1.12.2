package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenOmphalophloios extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;
        if (position.getY() <= worldIn.getSeaLevel()+20) {
        	
	        for (int i = 0; i < 24; ++i)
	        {
	            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
	
	            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockOmphalophloiosSapling.block.canPlaceBlockAt(worldIn, blockpos))
	            {
	                worldIn.setBlockState(blockpos, BlockOmphalophloiosBase.block.getDefaultState(), 2);
					worldIn.setBlockState(blockpos.up(), BlockOmphalophloiosPlaceable.block.getDefaultState(), 2);
					worldIn.setBlockState(blockpos.up(2), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
					if (worldIn.isAirBlock(blockpos.up(4))) {
						if (Math.random() > 0.7) {
							worldIn.setBlockState(blockpos.up(3), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
							if (worldIn.isAirBlock(blockpos.up(5)))
								if (Math.random() > 0.7) {
									worldIn.setBlockState(blockpos.up(4), BlockOmphalophloiosCentre.block.getDefaultState(), 2);
									worldIn.setBlockState(blockpos.up(5), BlockOmphalophloiosTop.block.getDefaultState(), 2);
								}
							else {
								worldIn.setBlockState(blockpos.up(4), BlockOmphalophloiosTop.block.getDefaultState(), 2);
							}
						}
					}
					else {
						worldIn.setBlockState(position.up(3), BlockOmphalophloiosTop.block.getDefaultState(), 2);
					}
	                flag = true;
	            }
	        }
        }

        return flag;
    }
}
