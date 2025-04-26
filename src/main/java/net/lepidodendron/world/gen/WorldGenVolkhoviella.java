package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockVolkhoviella;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenVolkhoviella extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return generate(worldIn, rand, position, false);
	}

	public boolean generate(World worldIn, Random rand, BlockPos position, boolean forced)
	{
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && (blockpos.getY() < Functions.getAdjustedSeaLevel(worldIn, blockpos)+10) && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockVolkhoviella.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	int orientation = rand.nextInt(6);
            	if (orientation == 0) { //North
            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
	                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
	                	flag = true;
            		}
            	}
            	else {
            		if (orientation == 1) { //South
	            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
		                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
		                	flag = true;
	            		}
	            	}
	            	else {
	            		if (orientation == 2) { //West
		            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
			                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
			                	flag = true;
		            		}
		            	}
		            	else {
		            		if (orientation == 3) { //East
			            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
				                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
				                	flag = true;
			            		}
			            	}
			            	else {
			            		if (orientation == 4) { //Up
				            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										WorldGenAncientMoss.PlaceEggs(rand, worldIn, blockpos);
										for (int n = 0; n < 28; n++) {
											BlockVolkhoviella.BlockCustom.updateTickForced(worldIn, blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.UP), rand, forced);
										}
										flag = true;
				            		}
				            	}
				            	else {
				            		if (orientation == 5) { //Down
					            		if (BlockVolkhoviella.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
						                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockVolkhoviella.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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