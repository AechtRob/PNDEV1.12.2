
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnFrenelopsis extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnFrenelopsis(ElementsLepidodendronMod instance) {
		super(instance, 48);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimFrenelopsis))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genFrenelopsis && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genFrenelopsisBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genFrenelopsisOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;

		int GenChance = 11500;
		double GenMultiplier = LepidodendronConfigPlants.multiplierFrenelopsis;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 5, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(2) + 1;
			for (int a = 0; a < count; a++) {
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = 255;
				if (isNetherType) {
					boolean notpassed = true;
					while (height > 0) {
						if (notpassed && world.isAirBlock(new BlockPos(i, height, k)))
							notpassed = false;
						else if (!notpassed && !world.isAirBlock(new BlockPos(i, height, k)))
							break;
						height--;
					}
				} else {
					while (height > 0) {
						if (
							(!world.isAirBlock(new BlockPos(i, height, k)))
							&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.VINE)
							&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.WEB)
							&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.PLANTS)
						)
							break;
						height--;
					}
				}
				int j = height;
				//IBlockState blockAt = world.getBlockState(new BlockPos(i, j + 1, k));
				boolean blockCriteria = false;
				//Check if this is snow OVER a valid block:
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.SNOW)
				{
					j = j - 1;
				}
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.GRASS)
					blockCriteria = true;
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.GROUND)
					blockCriteria = true;
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.SAND)
					blockCriteria = true;
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfigPlants.maxheightFrenelopsis;
				int minheight = LepidodendronConfigPlants.minheightFrenelopsis;
				if (maxheight < 0) {maxheight = 0;}
				if (maxheight > 250) {maxheight = 250;}
				if (minheight < 1) {minheight = 1;}
				if (minheight > 250) {minheight = 250;}
				if (j < minheight)
					continue;
				if (j > maxheight && maxheight != 0)
					continue;

				biomeCriteria = false;
				biome = world.getBiome(new BlockPos(i, j + 1, k));
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genFrenelopsisBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfigPlants.genFrenelopsisOverrideBiomes))
					biomeCriteria = true;
				if (!biomeCriteria)
					continue;
				if (world.isRemote)
					return;
				//Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
				//		new ResourceLocation("lepidodendron", "spawnvoid"));
				//if (template == null)
				//	return;
				//Rotation rotation = Rotation.NONE;
				//Mirror mirror = Mirror.NONE;
				BlockPos spawnTo = new BlockPos(i, j + 1, k);
				//IBlockState iblockstate = world.getBlockState(spawnTo);
				//world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
				//template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(rotation).setMirror(mirror)
				//		.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", i);
					$_dependencies.put("y", j + 1);
					$_dependencies.put("z", k);
					$_dependencies.put("world", world);
					if ((world.canSeeSky(spawnTo)) || 
					(((world.getBlockState(spawnTo)).getMaterial() == Material.SNOW)
					&& world.canSeeSky(spawnTo.up()))) {
						world.setBlockToAir(spawnTo);
						world.setBlockToAir(spawnTo.up());
					}
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo, BlockFrenelopsis.block.getDefaultState());
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(), BlockFrenelopsis2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(2), BlockFrenelopsis3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(3), BlockFrenelopsis4.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.north(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.south(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.west(), BlockFrenelopsisSide1.block.getDefaultState(),3);

					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.north().east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.north().west(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.south().east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.south().west(), BlockFrenelopsisSide1.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up()).north(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up()).south(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up()).east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up()).west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up().north().east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up().north().west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up().south().east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up().south().west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(2)).north(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(2)).south(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(2)).east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(2)).west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(2).north().east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(2).north().west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(2).south().east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(2).south().west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(3)).north(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(3)).south(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(3)).east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,(spawnTo.up(3)).west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);

					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(3).north().east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(3).north().west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(3).south().east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
					Functions.setBlockStateAndCheckForDoublePlant(world,spawnTo.up(3).south().west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);

				}
			}
		}
	}

	
		public boolean shouldGenerateInDimension(int id, int[] dims) {
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

        for(int var4 = 0; var4 < var3; ++var4) {
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
