package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockChaunograptus;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenChaunograptus extends WorldGenerator {

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");

	public boolean generate(World worldIn, Random rand, BlockPos position) {
		boolean flag = false;

		for (int i = 0; i < 48; ++i) {
			BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(4) - rand.nextInt(4));
			//System.err.println("testing Y " + blockpos.getY());
			if (blockpos.getY() <= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 2 && isWaterBlock(worldIn, blockpos)
					&& !worldIn.provider.isNether() ) {
				int orientation = rand.nextInt(4);
				if (orientation == 0) { //North
					if (BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockChaunograptus.block.getDefaultState().withProperty(SOUTH, true), 2);
						flag = true;
						//Extend downwards:
						int yct = 1;
						while (isWaterBlock(worldIn, blockpos.down(yct)) && blockpos.down(yct).getY() > 1 && BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos.down(yct), EnumFacing.NORTH)) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(yct), BlockChaunograptus.block.getDefaultState().withProperty(SOUTH, true), 2);
							yct += 1;
						}
					}
				} else {
					if (orientation == 1) { //South
						if (BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockChaunograptus.block.getDefaultState().withProperty(NORTH, true), 2);
							flag = true;
							//Extend downwards:
							int yct = 1;
							while (isWaterBlock(worldIn, blockpos.down(yct)) && blockpos.down(yct).getY() > 1 && BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos.down(yct), EnumFacing.SOUTH)) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(yct), BlockChaunograptus.block.getDefaultState().withProperty(NORTH, true), 2);
								yct += 1;
							}
						}
					} else {
						if (orientation == 2) { //West
							if (BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockChaunograptus.block.getDefaultState().withProperty(EAST, true), 2);
								flag = true;
								//Extend downwards:
								int yct = 1;
								while (isWaterBlock(worldIn, blockpos.down(yct)) && blockpos.down(yct).getY() > 1 && BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos.down(yct), EnumFacing.WEST)) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(yct), BlockChaunograptus.block.getDefaultState().withProperty(EAST, true), 2);
									yct += 1;
								}
							}
						} else {
							if (orientation == 3) { //East
								if (BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockChaunograptus.block.getDefaultState().withProperty(WEST, true), 2);
									flag = true;
									//Extend downwards:
									int yct = 1;
									while (isWaterBlock(worldIn, blockpos.down(yct)) && blockpos.down(yct).getY() > 1 && BlockChaunograptus.block.canPlaceBlockOnSide(worldIn, blockpos.down(yct), EnumFacing.EAST)) {
										Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(yct), BlockChaunograptus.block.getDefaultState().withProperty(WEST, true), 2);
										yct += 1;
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

	public boolean isWaterBlock(World world, BlockPos pos) {

		if (!((Functions.isWater(world, pos.up())
				|| world.getBlockState(pos.up()).getBlock() == BlockChaunograptus.block)
				&& !world.isAirBlock(pos.north())
				&& !world.isAirBlock(pos.south())
				&& !world.isAirBlock(pos.east())
				&& !world.isAirBlock(pos.west()))) {
			return false;
		}

		if (world.getBlockState(pos).getMaterial() == Material.WATER) {
			return true;
		}
		return false;
	}
}