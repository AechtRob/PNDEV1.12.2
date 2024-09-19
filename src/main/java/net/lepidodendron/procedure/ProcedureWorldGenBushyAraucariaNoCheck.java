package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockBushyAraucariaLeaves;
import net.lepidodendron.block.BlockBushyAraucariaLog;
import net.lepidodendron.block.BlockLygodium;
import net.lepidodendron.util.EnumBiomeTypeCretaceousEarly;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBushyAraucariaNoCheck extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBushyAraucariaNoCheck(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");

	public static void executeProcedure(Object2ObjectOpenHashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBushyAraucariaNoCheck!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBushyAraucariaNoCheck!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBushyAraucariaNoCheck!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBushyAraucariaNoCheck!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenBushyAraucariaNoCheck!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		double TrunkHeight = 0;
		double counter = 0;
		double counter2 = 0;
		boolean smalltree = false;
		double largeAraucariaAraucana = Math.round(LepidodendronConfigPlants.largeBushyAraucaria);
		
		if (largeAraucariaAraucana > 100) {largeAraucariaAraucana = 100;}
		if (largeAraucariaAraucana < 0) {largeAraucariaAraucana = 0;}
		largeAraucariaAraucana = 1 - (double) largeAraucariaAraucana/100;
		
		if ((Math.random() <= largeAraucariaAraucana) || (largeAraucariaAraucana == 1)) {
			smalltree=true;
		}
		if (largeAraucariaAraucana == 0) {smalltree=false;}
		
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			if (!smalltree) {
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
			}
			
			//Trunk, up to 35 blocks, but makle them uncommon at that size:
			TrunkHeight = 20 + Math.round(Math.random() * 15);
			if (smalltree || ((TrunkHeight >= 30) && (Math.random() > 0.3))) {
				TrunkHeight = Math.round(TrunkHeight * 0.7);
			}
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
				if (!smalltree) {
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockBushyAraucariaLog.block, EnumFacing.NORTH);
				}
				counter = counter + 1;
			}

			ProcedureLeavesAroundLog.executeProcedure(x, (int) TrunkHeight + y, z, world, BlockBushyAraucariaLeaves.block, 2, 0.2);
			if (!smalltree) {
				ProcedureLeavesAroundLog.executeProcedure((x + 1), (int) TrunkHeight + y, (z - 1), world, BlockBushyAraucariaLeaves.block, 2, 0.2);
				ProcedureLeavesAroundLog.executeProcedure((x + 1), (int) TrunkHeight + y, z, world, BlockBushyAraucariaLeaves.block, 2, 0.2);
				ProcedureLeavesAroundLog.executeProcedure(x, (int) TrunkHeight + y, (z - 1), world, BlockBushyAraucariaLeaves.block, 2, 0.2);
			}
			
			//North:
			Object2ObjectOpenHashMap <String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) TrunkHeight + y);
			if (smalltree) {
				$_dependencies.put("z", z - 1);
			}
			else {
				$_dependencies.put("z", z - 2);
			}
			$_dependencies.put("world", world);
			$_dependencies.put("TrunkHeight", TrunkHeight);
			$_dependencies.put("smalltree", smalltree);
			ProcedureWorldGenBushyAraucariaNorthBranch.executeProcedure($_dependencies);

			//South:
			//java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) TrunkHeight + y);
			$_dependencies.put("z", z + 1);
			$_dependencies.put("world", world);
			$_dependencies.put("TrunkHeight", TrunkHeight);
			$_dependencies.put("smalltree", smalltree);
			ProcedureWorldGenBushyAraucariaSouthBranch.executeProcedure($_dependencies);
			
			//East
			if (smalltree) {
				$_dependencies.put("x", x - 1);
			}
			else {
				$_dependencies.put("x", x - 2);
			}
			$_dependencies.put("y", (int) TrunkHeight + y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("TrunkHeight", TrunkHeight);
			$_dependencies.put("smalltree", smalltree);
			ProcedureWorldGenBushyAraucariaEastBranch.executeProcedure($_dependencies);
			
			//West:
			$_dependencies.put("x", x - 1);
			$_dependencies.put("y", (int) TrunkHeight + y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("TrunkHeight", TrunkHeight);
			$_dependencies.put("smalltree", smalltree);
			ProcedureWorldGenBushyAraucariaWestBranch.executeProcedure($_dependencies);

			//Possible nubs and leaves and 3/4 minus 2 to 5 blocks:
			//North:
			if (Math.random() >=0.8) {
				//Get a random position:
				if (smalltree) {
					xx = x;
				}
				else {
					xx = x + (int) Math.round(Math.random());
				}
				//xx = x + (int) Math.round(Math.random());
				yy = y + (int) Math.round(TrunkHeight * 0.75) - 2 - (int) (Math.round(Math.random() * 3));
				//zz = z - 2;
				if (smalltree) {
					zz = z - 1;
				}
				else {
					zz = z - 2;
				}
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.WEST);
				if (Math.random() >0.6) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockBushyAraucariaLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz - 1, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
				else {
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
			}

			//South:
			if (Math.random() >=0.8) {
				//Get a random position:
				if (smalltree) {
					xx = x;
				}
				else {
					xx = x + (int) Math.round(Math.random());
				}
				//xx = x + (int) Math.round(Math.random());
				yy = y + (int) Math.round(TrunkHeight * 0.75) - 2 - (int) (Math.round(Math.random() * 3));
				zz = z + 1;
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.WEST);
				if (Math.random() >0.6) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockBushyAraucariaLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz + 1, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
				else {
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
			}

			//East:
			if (Math.random() >=0.8) {
				//Get a random position:
				if (smalltree) {
					xx = x + 1;
				}
				else {
					xx = x + 2;
				}
				//xx = x + 2;
				yy = y + (int) Math.round(TrunkHeight * 0.75) - 2 - (int) (Math.round(Math.random() * 3));
				//zz = z - (int) Math.round(Math.random());
				if (smalltree) {
					zz = z;
				}
				else {
					zz = z - (int) Math.round(Math.random());
				}
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.UP);
				if (Math.random() >0.6) {
					ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx + 1, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
				else {
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
			}

			//West:
			if (Math.random() >=0.8) {
				//Get a random position:
				xx = x - 1;
				yy = y + (int) Math.round(TrunkHeight * 0.75) - 2 - (int) (Math.round(Math.random() * 3));
				//zz = z - (int) Math.round(Math.random());
				if (smalltree) {
					zz = z;
				}
				else {
					zz = z - (int) Math.round(Math.random());
				}
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.UP);
				if (Math.random() >0.6) {
					ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockBushyAraucariaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx - 1, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
				else {
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBushyAraucariaLeaves.block, 2, 0.45);
				}
				

			}



			//Random placement of lygodium:
			boolean SpawnLygodium = true;

			boolean dimensionCriteria = false;
			if (shouldGenerateInDimension(world.provider.getDimension(), LepidodendronConfigPlants.dimLygodium))
				dimensionCriteria = true;
			if (!LepidodendronConfigPlants.genLygodiumBushyAraucaria && !LepidodendronConfig.genAllPlants)
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
				xct = -10;
				while (xct <= 10) {
					zct = -10;
					while (zct <= 10) {

						if ((world.getBlockState(new BlockPos((int) x + xct, (int) TrunkHeight + counter, (int) z + zct))).getBlock() == BlockBushyAraucariaLeaves.block) {
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


			ProcedureSpawnNilssoniocladus.executeProcedure(x, y, z, world, LepidodendronConfigPlants.genNilssoniocladusBushyAraucaria, SaplingSpawn);

		}
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