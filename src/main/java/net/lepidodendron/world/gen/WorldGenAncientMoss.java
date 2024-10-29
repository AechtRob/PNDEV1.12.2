package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockAncientMoss;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.patchouli.SpawnLocations;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.ArrayList;
import java.util.Random;

public class WorldGenAncientMoss extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position) {
		boolean flag = false;

		for (int i = 0; i < 32; ++i)
		{
			BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));
			int orientation = rand.nextInt(6);

			if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
					&& (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAncientMoss.block.canPlaceBlockAt(worldIn, blockpos))
			{
				if (orientation == 0) { //North
					if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
						flag = true;
					}
				}
				else {
					if (orientation == 1) { //South
						if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
							flag = true;
						}
					}
					else {
						if (orientation == 2) { //West
							if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
								flag = true;
							}
						}
						else {
							if (orientation == 3) { //East
								if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
									flag = true;
								}
							}
							else {
								if (orientation == 4) { //Up
									if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
										Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										PlaceEggs(rand, worldIn, blockpos);
										flag = true;
									}
								}
								else {
									if (orientation == 5) { //Down
										if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
											Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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

	public boolean generate(World worldIn, Random rand, BlockPos position, int altitude)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

            if ((blockpos.getY() < Functions.getAdjustedSeaLevel(worldIn, blockpos)+altitude) && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAncientMoss.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	int orientation = rand.nextInt(6);
            	if (orientation == 0) { //North
            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
	                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
	                	flag = true;
            		}
            	}
            	else {
            		if (orientation == 1) { //South
	            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
		                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
		                	flag = true;
	            		}
	            	}
	            	else {
	            		if (orientation == 2) { //West
		            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
			                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
			                	flag = true;
		            		}
		            	}
		            	else {
		            		if (orientation == 3) { //East
			            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
				                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
				                	flag = true;
			            		}
			            	}
			            	else {
			            		if (orientation == 4) { //Up
				            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										PlaceEggs(rand, worldIn, blockpos);
					                	flag = true;
				            		}
				            	}
				            	else {
				            		if (orientation == 5) { //Down
					            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
						                	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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

    public static void PlaceEggs(Random rand, World worldIn, BlockPos pos) {
		if (Math.random() > 0.925) {
			Biome biome = worldIn.getBiome(pos);
			String stringEgg = "";

			String[] mobString = new String[]{
					"lepidodendron:prehistoric_flora_archaboilus",
					"lepidodendron:prehistoric_flora_archoblattina",
					"lepidodendron:prehistoric_flora_archocyrtus",
					"lepidodendron:prehistoric_flora_arthropleura",
					"lepidodendron:prehistoric_flora_attercopus",
					"lepidodendron:prehistoric_flora_daohugoucossus",
					"lepidodendron:prehistoric_flora_eoarthropleura",
					"lepidodendron:prehistoric_flora_gerarus",
					"lepidodendron:prehistoric_flora_harvestman",
					"lepidodendron:prehistoric_flora_myriacantherpestes",
					"lepidodendron:prehistoric_flora_palaeontinid",
					"lepidodendron:prehistoric_flora_pneumodesmus",
					"lepidodendron:prehistoric_flora_pycnophlebia",
					"lepidodendron:prehistoric_flora_roachoid_arid",
					"lepidodendron:prehistoric_flora_roachoid_forest",
					"lepidodendron:prehistoric_flora_roachoid_swamp",
					"lepidodendron:prehistoric_flora_titanoptera@clatrotitan",
					"lepidodendron:prehistoric_flora_titanoptera@gigatitan",
					"lepidodendron:prehistoric_flora_titanoptera@mesotitan",
					"lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus",
					"lepidodendron:prehistoric_flora_trigonotarbid_eophrynus",
					"lepidodendron:prehistoric_flora_trigonotarbid_kreischeria",
					"lepidodendron:prehistoric_flora_trigonotarbid_palaeocharinus",
					"lepidodendron:prehistoric_flora_trigonotarbid_palaeotarbus",
					"lepidodendron:prehistoric_flora_trigonotarbid_permotarbus",
					"lepidodendron:prehistoric_flora_trigonotarbid_gondwanarachne"
			};

			ArrayList<String> mobStringValid = new ArrayList<String>();
			for (String mob : mobString) {
				if (SpawnLocations.spawnsHere(mob, biome.getRegistryName().toString())) {
					mobStringValid.add(mob);
				}
			}

			if (mobStringValid.isEmpty()) {
				return;
			}
			else {
				stringEgg = mobStringValid.get(worldIn.rand.nextInt(mobStringValid.size()));
			}

			TileEntity te = worldIn.getTileEntity(pos);
			if (te != null && !stringEgg.equalsIgnoreCase("")) {
				te.getTileData().setString("creature", stringEgg);
			}
			IBlockState state = worldIn.getBlockState(pos);
			worldIn.notifyBlockUpdate(pos, state, state, 3);
			//System.err.println("Eggs placed: " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
		}
	}
}