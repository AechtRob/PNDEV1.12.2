package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureSpawnOdontopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureSpawnOdontopteris(ElementsLepidodendronMod instance) {
		super(instance, 1142);
	}

	public static void executeProcedure(int x, int y, int z, World world, boolean TreeChosen, boolean SaplingSpawn) {

			//Try spawn Odontopteris here?
			boolean biomeCriteria = false;
			boolean dimensionCriteria = false;
			int dimID = world.provider.getDimension();
			if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimOdontopteris))
				dimensionCriteria = true;
			if (!TreeChosen && !LepidodendronConfig.genAllPlants)
				dimensionCriteria = false;
			if (dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian)
				dimensionCriteria = true;

			Biome biome = world.getBiome(new BlockPos(x, y, z));
			if (dimensionCriteria && !SaplingSpawn) {
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genOdontopterisBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
					}
					if (matchBiome(biome, LepidodendronConfigPlants.genOdontopterisOverrideBiomes)) {
						biomeCriteria = true;
					}
				}
				if (dimID == LepidodendronConfig.dimCarboniferous)
					biomeCriteria = true;


				if (biome instanceof BiomePermian) {
					if (((BiomePermian)biome).getBiomeType() == EnumBiomeTypePermian.Wetlands) {
						biomeCriteria = true;
					}
					else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain_lake")) {
						biomeCriteria = true;
					}
					else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")) {
						biomeCriteria = true;
					}
					else {
						biomeCriteria = false;
					}
				}

				if (biome instanceof BiomeCarboniferous) {
					if (((BiomeCarboniferous)biome).getBiomeType() == EnumBiomeTypeCarboniferous.Savanna) {
						biomeCriteria = false;
					}
				}

				if (biomeCriteria && !SaplingSpawn) {
					//Try one spot at the foot of the tree:
					//{
						//java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						Random rnd = new Random();
						//$_dependencies.put("x", x + (rnd.nextInt(5) - 2));
						//$_dependencies.put("y", y);
						//$_dependencies.put("z", z + (rnd.nextInt(5) - 2));
						//$_dependencies.put("world", world);
					//}
					ProcedureWorldGenOdontopteris.executeProcedure(x + (rnd.nextInt(5) - 2), y, z + (rnd.nextInt(5) - 2), world);
					ProcedureWorldGenOdontopteris.executeProcedure(x + (rnd.nextInt(5) - 2), y, z + (rnd.nextInt(5) - 2), world);
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