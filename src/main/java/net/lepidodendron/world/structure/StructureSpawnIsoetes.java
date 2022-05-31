
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.BlockIsoetes;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnIsoetes extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnIsoetes(ElementsLepidodendronMod instance) {
		super(instance, 49);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		boolean alwaysSpawn = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimIsoetes))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genIsoetes && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genIsoetesBlacklistBiomes))) {
			biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genIsoetesOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
					
		int GenChance = 50000;
		double GenMultiplier = LepidodendronConfig.multiplierIsoetes;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 10, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(20) + 1;
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

				//Allow to spawn in/on shallow water only:
				if (((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.WATER)
				&& (((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.SAND) 
				|| ((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.CLAY) 
				|| ((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.GROUND))) {
					blockCriteria = true;
				}
				
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightIsoetes;
				int minheight = LepidodendronConfig.minheightIsoetes;
				if (maxheight < 0) {maxheight = 0;}
				if (maxheight > 250) {maxheight = 250;}
				if (minheight < 1) {minheight = 1;}
				if (minheight > 250) {minheight = 250;}
				if (j < minheight)
					continue;
				if (j > maxheight && maxheight != 0)
					continue;
					

				if (!canSurviveAt(world, new BlockPos(i, j + 1, k)))
					continue;

				biomeCriteria = false;
				biome = world.getBiome(new BlockPos(i, j + 1, k));
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genIsoetesBlacklistBiomes))) {
					biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genIsoetesOverrideBiomes))
					biomeCriteria = true;
				if (!biomeCriteria)
					continue;

				if (world.isRemote)
					return;
				
				BlockPos spawnTo = new BlockPos(i, j + 1, k);
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
					world.setBlockState(spawnTo, BlockIsoetes.block.getDefaultState(), 3);
					//System.err.println("Spawned " + i + " " + j + " " + k);
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

    public boolean canSurviveAt(World worldIn, BlockPos pos) {
		if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER) 
    	{
    		return false;
    	}
    	if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND) 
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
    	{
    		return false;
    	}

    	if (!worldIn.canSeeSky(pos) && (worldIn.getBlockState(pos).getLightValue() < 7))
    	{
    		return false;
    	}

    	return true;
    	 
    }
	
}
