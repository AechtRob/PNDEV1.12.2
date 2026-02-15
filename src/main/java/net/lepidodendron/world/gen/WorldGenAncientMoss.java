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
					"lepidodendron:prehistoric_flora_archocyrtus",
					"lepidodendron:prehistoric_flora_arthropleura",
					"lepidodendron:prehistoric_flora_attercopus",
					"lepidodendron:prehistoric_flora_permarachne",
					"lepidodendron:prehistoric_flora_gerarus",
					"lepidodendron:prehistoric_flora_harvestman",
					"lepidodendron:prehistoric_flora_myriacantherpestes",
					"lepidodendron:prehistoric_flora_myriapod@eoarthropleura",
					"lepidodendron:prehistoric_flora_myriapod@pneumodesmus",
					"lepidodendron:prehistoric_flora_palaeontinid",
					"lepidodendron:prehistoric_flora_pycnophlebia",
					"lepidodendron:prehistoric_flora_titanoptera_nymph@clatrotitan",
					"lepidodendron:prehistoric_flora_titanoptera_nymph@gigatitan",
					"lepidodendron:prehistoric_flora_titanoptera_nymph@mesotitan",
					"lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus",
					"lepidodendron:prehistoric_flora_trigonotarbid_eophrynus",
					"lepidodendron:prehistoric_flora_trigonotarbid_kreischeria",
					"lepidodendron:prehistoric_flora_trigonotarbid_palaeocharinus",
					"lepidodendron:prehistoric_flora_trigonotarbid_palaeotarbus",
					"lepidodendron:prehistoric_flora_trigonotarbid_permotarbus",
					"lepidodendron:prehistoric_flora_trigonotarbid_gondwanarachne",
					"lepidodendron:prehistoric_flora_permarachne",
					"lepidodendron:prehistoric_flora_myriapod@latzelia",
					"lepidodendron:prehistoric_flora_myriapod@crussolum",
					"lepidodendron:prehistoric_flora_myriapod@devonobius",
					"lepidodendron:prehistoric_flora_myriapod@fulmenocursor",
					"lepidodendron:prehistoric_flora_myriapod@velocipede",
					"lepidodendron:prehistoric_flora_myriapod@polydesmid",
					"lepidodendron:prehistoric_flora_myriapod@juliform",
					"lepidodendron:prehistoric_flora_santanmantis",
					"lepidodendron:prehistoric_flora_scorpionfly",
					"lepidodendron:prehistoric_flora_hangingfly",
					"lepidodendron:prehistoric_flora_fortiholcorpa",
					"lepidodendron:prehistoric_flora_juracimbrophlebia",
					"lepidodendron:prehistoric_flora_cretosaja",
					"lepidodendron:prehistoric_flora_plesioblattogryllus",
					"lepidodendron:prehistoric_flora_locustopsis",
					"lepidodendron:prehistoric_flora_juramantophasma",
					"lepidodendron:prehistoric_flora_eoproscopia"
			};

			ArrayList<String> mobStringValid = new ArrayList<String>();
			for (String mob : mobString) {
				String spawnMob = mob;
				if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@stonefly")) {
					spawnMob = "lepidodendron:prehistoric_flora_stonefly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@mayfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_mayfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@velisoptera")) {
					spawnMob = "lepidodendron:prehistoric_flora_velisoptera";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@argentinala")) {
					spawnMob = "lepidodendron:prehistoric_flora_argentinala";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@damselfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_damselfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@cratopipa")) {
					spawnMob = "lepidodendron:prehistoric_flora_cratopipa";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@prosalirus")) {
					spawnMob = "lepidodendron:prehistoric_flora_prosalirus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@notobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_notobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@rhadinosteus")) {
					spawnMob = "lepidodendron:prehistoric_flora_rhadinosteus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@hygobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_hygobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@kururubatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@genibatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.indexOf("_nymph") >= 1) {
					spawnMob = spawnMob.replace("_nymph", "");
				}
				else if (mob.contains("lepidodendron:prehistoric_flora_dragonfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_dragonfly";
				}
				if (SpawnLocations.spawnsHere(spawnMob, biome.getRegistryName().toString())) {
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