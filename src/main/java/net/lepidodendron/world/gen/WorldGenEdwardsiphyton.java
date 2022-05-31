package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEdwardsiphyton;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenEdwardsiphyton extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && (blockpos.getY() < worldIn.getSeaLevel()+10) && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockEdwardsiphyton.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	int orientation = rand.nextInt(6);
            	if (orientation == 0) { //North
            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
	                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
	                	flag = true;
            		}
            	}
            	else {
            		if (orientation == 1) { //South
	            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
		                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
		                	flag = true;
	            		}
	            	}
	            	else {
	            		if (orientation == 2) { //West
		            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
			                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
			                	flag = true;
		            		}
		            	}
		            	else {
		            		if (orientation == 3) { //East
			            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
				                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
				                	flag = true;
			            		}
			            	}
			            	else {
			            		if (orientation == 4) { //Up
				            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										PlaceEggs(rand, worldIn, blockpos);
										flag = true;
				            		}
				            	}
				            	else {
				            		if (orientation == 5) { //Down
					            		if (BlockEdwardsiphyton.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
						                	worldIn.setBlockState(blockpos, BlockEdwardsiphyton.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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

	public void PlaceEggs(Random rand, World worldIn, BlockPos pos) {
		if (Math.random() > 0.925) {
			int dimID = worldIn.provider.getDimension();
			String stringEgg = "";
			int i;

			if (dimID == LepidodendronConfig.dimSilurian) {
				i = rand.nextInt(2); //Trigonotarbid or Eoarthropleura
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_os";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_eoarthropleura";}
			}

			if (dimID == LepidodendronConfig.dimDevonian) {
				i = rand.nextInt(4); //Attercopus, Trigonotarbid, Pneumodesmus or Eoarthropleura
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_dev";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_eoarthropleura";}
				if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_pneumodesmus";}
				if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_attercopus";}
			}

			if (dimID == LepidodendronConfig.dimCarboniferous) {
				i = rand.nextInt(2); //Trigonotarbid
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb";}
			}

			//if (dimID == LepidodendronConfig.dimPermianWetlands) {
			//	i = rand.nextInt(2); //Permian Trigonotarbid
			//	if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
			//	if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
			//}

			TileEntity te = worldIn.getTileEntity(pos);
			if (te != null) {
				te.getTileData().setString("egg", stringEgg);
			}
			IBlockState state = worldIn.getBlockState(pos);
			worldIn.notifyBlockUpdate(pos, state, state, 3);
			//System.err.println("Eggs placed: " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
		}
	}
}