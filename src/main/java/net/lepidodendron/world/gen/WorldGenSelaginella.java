package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSelaginella;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSelaginella extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSelaginella.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	int orientation = rand.nextInt(6);
            	if (orientation == 0) { //North
            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
	                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
	                	flag = true;
            		}
            	}
            	else {
            		if (orientation == 1) { //South
	            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
		                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
		                	flag = true;
	            		}
	            	}
	            	else {
	            		if (orientation == 2) { //West
		            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
			                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
			                	flag = true;
		            		}
		            	}
		            	else {
		            		if (orientation == 3) { //East
			            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
				                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
				                	flag = true;
			            		}
			            	}
			            	else {
			            		if (orientation == 4) { //Up
				            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										WorldGenAncientMoss.PlaceEggs(rand, worldIn, blockpos);
										flag = true;
				            		}
				            	}
				            	else {
				            		if (orientation == 5) { //Down
					            		if (BlockSelaginella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
						                	worldIn.setBlockState(blockpos, BlockSelaginella.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
						                	flag = true;
					            		}
					            	}
				            	}
			            	}
		            	}
	            	}
            	}
            }
        }

        return flag;
    }

}