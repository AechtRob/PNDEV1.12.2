package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockLygodium;
import net.lepidodendron.block.BlockPodozamitesLeaves;
import net.lepidodendron.block.BlockPodozamitesLog;
import net.lepidodendron.util.EnumBiomeTypeCretaceousEarly;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPodozamites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPodozamites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenPodozamites!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		double randomiser = 0;
		int branchlength;
		int branchcount;
		int direction = 0;
		int direction2 = 0;
		int direction3 = 0;
		
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z))
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 11;
			if (Math.random()>0.3) {
				TrunkHeight = TrunkHeight + (int) Math.round((Math.random() * 4));
			}
			if (Math.random()>0.6) {
				TrunkHeight = TrunkHeight + (int) Math.round((Math.random() * 5));
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			//Base:
			ProcedureTreeLog.executeProcedure((x - 1), y, z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y + 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y + 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y + 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y + 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);

			counter = ((int) Math.round((double) TrunkHeight/2)); 
			//Start branches here
			while (counter < TrunkHeight) {
				//first branch always places somewhere
				//second branch is only 50% likely
				//third branch only has a 10% chance
				//branches are 2-5 long, but they taper toward the tip of the tree
				//if this is the penultimate layer of the tree, the branch will only be 1 long

				branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
				if (counter == TrunkHeight - 1) {branchlength = 1;}
				if (branchlength < 1) {branchlength = 1;}
				
				//Pick the direction:
				direction = 0;
				if (Math.random() > 0.2 && randomiser != 0) {
					randomiser = randomiser + 0.25;
					if (randomiser >= 1) {randomiser = 0.1;}
				}
				else {
					randomiser = Math.random();
				}
				if (randomiser >= 0.75) {
					direction = 1;
					if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
						branchcount = 1;
						while (branchcount <= branchlength) {
							ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
							branchcount = branchcount + 1;
						}
						PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
					}
				}
				else {
					if (randomiser >= 0.5) {
						direction = 2;
						if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
								branchcount = branchcount + 1;
							}
							PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (randomiser >= 0.25) {	
							direction = 3;
							if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
								PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
							}
						}
						else {			
							direction = 4;
							if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
					}
				}

				if (Math.random() >= 0.5) {
					//Second branch:
					direction2 = 0;
					while (direction2 != direction) {
						randomiser = Math.random();
						if	(randomiser >= 0.75) {
							direction2 = 1;
						}
						else {
							if	(randomiser >= 0.5) {
								direction2 = 2;
							}
							else {
								if	(randomiser >= 0.25) {					
									direction2 = 3;
								}
								else {			
									direction2 = 4;
								}
							}
						}
					}
					branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
					if (counter == TrunkHeight - 1) {branchlength = 1;}
					if (branchlength < 1) {branchlength = 1;}
					//Pick the direction:
					//randomiser = Math.random();
					if (direction2 == 1) {
						if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
								branchcount = branchcount + 1;
							}
							PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (direction2 == 2) {
							if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
						else {
							if (direction2 == 3) {
								if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
								PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
							}
							}
							else {
								if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {			
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
									PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
								}
							}
						}
					}
				}
				
				if (Math.random() >= 0.9) {
					//Third branch:
					direction3 = 0;
					while ((direction3 != direction) && (direction3 != direction2)) {
						randomiser = Math.random();
						if	(randomiser >= 0.75) {
							direction3 = 1;
						}
						else {
							if	(randomiser >= 0.5) {
								direction3 = 2;
							}
							else {
								if	(randomiser >= 0.25) {					
									direction3 = 3;
								}
								else {			
									direction3 = 4;
								}
							}
						}
					}
					branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
					if (counter == TrunkHeight - 1) {branchlength = 1;}
					if (branchlength < 1) {branchlength = 1;}
					//Pick the direction:
					//randomiser = Math.random();
					if (direction3 == 1) {
						if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
								branchcount = branchcount + 1;
							}
							PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (direction3 == 2) {
							if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
						else {
							if (direction3 == 3) {
								if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
										branchcount = branchcount + 1;
									}
									PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
								}
							}
							else {
								if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
									PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
								}
							}
						}
					}
				}
				
				counter = counter + 1;
			}

			//Top of tree:
			PodoLeaves(x, (int) TrunkHeight + y, z, world, BlockPodozamitesLeaves.block);


			//Random placement of lygodium:
			boolean SpawnLygodium = true;

			boolean dimensionCriteria = false;
			if (shouldGenerateInDimension(world.provider.getDimension(), LepidodendronConfigPlants.dimLygodium))
				dimensionCriteria = true;
			if (!LepidodendronConfigPlants.genLygodiumPodozamites && !LepidodendronConfig.genAllPlants)
				dimensionCriteria = false;
			if (!dimensionCriteria)
				SpawnLygodium = false;

			boolean biomeCriteria = false;
			Biome biome = world.getBiome(new BlockPos(x, y, z));
			if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genLygodiumBlacklistBiomes))) {
				biomeCriteria = true;
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
					biomeCriteria = false;
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
					biomeCriteria = false;
			}
			if (matchBiome(biome, LepidodendronConfigPlants.genLygodiumOverrideBiomes))
				biomeCriteria = true;
			if (!biomeCriteria)
				SpawnLygodium = false;
			if ((world.provider.getDimension() == LepidodendronConfig.dimJurassic)
			){
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")
						|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
						|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")) {
					SpawnLygodium = true;
				}
				else {
					SpawnLygodium = false;
				}
			}

			if ((world.provider.getDimension() == LepidodendronConfig.dimCretaceousEarly)
			){
				if (biome instanceof BiomeCretaceousEarly)
				{
					BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
					if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp_open")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys_europe")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_north_america_braided")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_centre")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_patagonia")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_field_copse")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_swamp_lakes")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_swamp_lakes_edge")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland_copse")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_transition")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_patagonia")) {
						SpawnLygodium = true;
					}
					else if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Austro_Antarctica) {
						SpawnLygodium = true;
					}
					else {
						SpawnLygodium = false;
					}
				}
			}

			BlockPos posVine;
			Random rand = new Random();
			int vineLength;
			int vineCount;
			counter = y;
			int xct = -5;
			int zct = -5;
			while (counter <= (y + TrunkHeight + 4)) {
				xct = -8;
				while (xct <= 8) {
					zct = -8;
					while (zct <= 8) {

						if ((world.getBlockState(new BlockPos((int) x + xct, (int) TrunkHeight + counter, (int) z + zct))).getBlock() == BlockPodozamitesLeaves.block) {
							//Lygodium:
							if ((!SaplingSpawn) & (SpawnLygodium)) {
								//System.err.println("Trying to spawn vines");
								//North
								if ((Math.random() > 0.88)
										&& (world.isAirBlock(new BlockPos(x + xct, (int) TrunkHeight + counter, (int) z + zct + 1)))) {
									posVine = new BlockPos(x + xct, (int) TrunkHeight + counter, (int) z + zct + 1);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, true).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
									vineLength = rand.nextInt((int)TrunkHeight) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, true).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//South
								if ((Math.random() > 0.88)
										&& (world.isAirBlock(new BlockPos(x + xct, (int) TrunkHeight + counter, (int) z + zct - 1)))) {
									posVine = new BlockPos(x + xct, (int) TrunkHeight + counter, (int) z + zct - 1);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, true).withProperty(WEST, false));
									vineLength = rand.nextInt((int)TrunkHeight) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, true).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//East
								if ((Math.random() > 0.88)
										&& (world.isAirBlock(new BlockPos(x + xct - 1, (int) TrunkHeight + counter, (int) z + zct)))) {
									posVine = new BlockPos(x + xct - 1, (int) TrunkHeight + counter, (int) z + zct);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, true).withProperty(SOUTH, false).withProperty(WEST, false));
									vineLength = rand.nextInt((int)TrunkHeight) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, true).withProperty(SOUTH, false).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//West
								if ((Math.random() > 0.88)
										&& (world.isAirBlock(new BlockPos(x + xct + 1, (int) TrunkHeight + counter, (int) z + zct)))) {
									posVine = new BlockPos(x + xct + 1, (int) TrunkHeight + counter, (int) z + zct);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, true));
									vineLength = rand.nextInt((int)TrunkHeight) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockLygodium.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, true));
										vineCount += 1;
									}
								}
							}
						}

						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

		}
	}

	public static void PodoLeaves(int x, int y, int z, World world, Block blockLeaf) {

		ProcedureTreeLeaf.executeProcedure(x, (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z - 1), world, blockLeaf);

	}

	public static boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
	}

	public static boolean matchBiome(Biome biome, String[] biomesList) {

		//String regName = biome.getRegistryName().toString();

		String[] var2 = biomesList;
		int var3 = biomesList.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			String checkBiome = var2[var4];
			if (!checkBiome.contains(":")) {
				//System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
				if (checkBiome.equalsIgnoreCase(
						biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
				)) {
					return true;
				}
			}
			if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
				return true;
			}
		}

		return false;
	}
}