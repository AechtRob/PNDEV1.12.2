package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAncientMoss;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.silurian.BiomeSilurianLushPatch;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

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

			if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
					&& (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAncientMoss.block.canPlaceBlockAt(worldIn, blockpos))
			{
				if (orientation == 0) { //North
					if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
						worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
						flag = true;
					}
				}
				else {
					if (orientation == 1) { //South
						if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
							worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
							flag = true;
						}
					}
					else {
						if (orientation == 2) { //West
							if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
								worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
								flag = true;
							}
						}
						else {
							if (orientation == 3) { //East
								if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
									worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
									flag = true;
								}
							}
							else {
								if (orientation == 4) { //Up
									if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
										worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										PlaceEggs(rand, worldIn, blockpos);
										flag = true;
									}
								}
								else {
									if (orientation == 5) { //Down
										if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
											worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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

            if ((blockpos.getY() < worldIn.getSeaLevel()+altitude) && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAncientMoss.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	int orientation = rand.nextInt(6);
            	if (orientation == 0) { //North
            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.NORTH)) {
	                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 2);
	                	flag = true;
            		}
            	}
            	else {
            		if (orientation == 1) { //South
	            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.SOUTH)) {
		                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 2);
		                	flag = true;
	            		}
	            	}
	            	else {
	            		if (orientation == 2) { //West
		            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.WEST)) {
			                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 2);
			                	flag = true;
		            		}
		            	}
		            	else {
		            		if (orientation == 3) { //East
			            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.EAST)) {
				                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 2);
				                	flag = true;
			            		}
			            	}
			            	else {
			            		if (orientation == 4) { //Up
				            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
										PlaceEggs(rand, worldIn, blockpos);
					                	flag = true;
				            		}
				            	}
				            	else {
				            		if (orientation == 5) { //Down
					            		if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.DOWN)) {
						                	worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 2);
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
			int dimID = worldIn.provider.getDimension();
			String stringEgg = "";
			int i;

			if (dimID == LepidodendronConfig.dimSilurian && worldIn.getBiome(pos) == BiomeSilurianLushPatch.biome) {
				i = rand.nextInt(2); //Trigonotarbid or Eoarthropleura
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_os";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_eoarthropleura";}
			}

			if (dimID == LepidodendronConfig.dimDevonian) {
				i = rand.nextInt(5); //Attercopus, Harvestman, Trigonotarbid, Pneumodesmus or Eoarthropleura
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_dev";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_eoarthropleura";}
				if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_pneumodesmus";}
				if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_attercopus";}
				if (i == 4) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
			}

			if (dimID == LepidodendronConfig.dimCarboniferous) {
				i = rand.nextInt(7); //Trigonotarbids etc
				if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb";}
				if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb";}
				if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_gerarus";}
				if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_archoblattina";}
				if (i == 4) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
				if (i == 5) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
				if (i == 6) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
			}

			if (dimID == LepidodendronConfig.dimPermian) {
				Biome biome = worldIn.getBiome(pos);
				if (biome instanceof BiomePermian) {
					BiomePermian biomePermian = (BiomePermian) biome;
					if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands) {
						i = rand.nextInt(3);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
					}
					if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Lowlands) {
						i = rand.nextInt(3);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
					}
					if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Forest) {
						i = rand.nextInt(4);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
					}
					if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
						i = rand.nextInt(4);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
					}
					if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Arid) {
						i = rand.nextInt(3);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_arid";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
					}
				}
			}

			if (dimID == LepidodendronConfig.dimTriassic) {
				Biome biome = worldIn.getBiome(pos);
				if (biome instanceof BiomeTriassic) {
					BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
					if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Desert) {
						stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_arid";
					}
					if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Island) {
						stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";
					}
					if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Mountain) {
						i = rand.nextInt(2);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_arid";}
					}
					else if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Xeric) {
						i = rand.nextInt(4);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_titanoptera";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
					}
					else if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Swamp) {
						i = rand.nextInt(5);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_titanoptera";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
						if (i == 4) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_italophlebia";}
					}
					else if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Cool) {
						i = rand.nextInt(5);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_titanoptera";}
						if (i == 4) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
					}
					else if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Warm
							||	biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.River ) {
						i = rand.nextInt(6);
						if (i == 0) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_palaeontinid";}
						if (i == 1) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp";}
						if (i == 2) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_titanoptera";}
						if (i == 3) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_harvestman";}
						if (i == 4) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_italophlebia";}
						if (i == 5) {stringEgg = LepidodendronMod.MODID + ":insect_eggs_roachoid_forest";}
					}
				}
			}

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