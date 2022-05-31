
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.procedure.ProcedureWorldGenBothrodendron;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnBothrodendon extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnBothrodendon(ElementsLepidodendronMod instance) {
		super(instance, 48);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimBothrodendron))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genBothrodendron && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genBothrodendronBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genBothrodendronOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 40000;
		double GenMultiplier = LepidodendronConfig.multiplierBothrodendron;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 10, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(1) + 1;
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
				//Allow to spawn IN shallow water:
				if (((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.WATER)
				&& (((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.SAND) 
				|| ((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.GROUND))) {
					blockCriteria = true;
					j = j - 1;
				}
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightBothrodendron;
				int minheight = LepidodendronConfig.minheightBothrodendron;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genBothrodendronBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genBothrodendronOverrideBiomes))
					biomeCriteria = true;
				if (!biomeCriteria)
					continue;

				
				boolean vines = false;
				biome = world.getBiome(new BlockPos(i, j + 1, k));
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genSphenophyllalesBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
						vines = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						vines = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						vines = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						vines = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genSphenophyllalesOverrideBiomes))
					vines = true;
				if (!shouldGenerateInDimension(dimID, LepidodendronConfig.dimSphenophyllales))
					vines = false;
				if (!LepidodendronConfig.genSphenophyllalesBothrodendron && !LepidodendronConfig.genAllPlants)
					vines = false;

				boolean vines2 = false;
				biome = world.getBiome(new BlockPos(i, j + 1, k));
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genCallistophytalesBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
						vines2 = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						vines2 = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						vines2 = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						vines2 = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genCallistophytalesOverrideBiomes))
					vines2 = true;
				if (!shouldGenerateInDimension(dimID, LepidodendronConfig.dimCallistophytales))
					vines2 = false;
				if (!LepidodendronConfig.genCallistophytalesBothrodendron && !LepidodendronConfig.genAllPlants)
					vines2 = false;

					
				if (world.isRemote)
					return;
				Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("lepidodendron", "spawnvoid"));
				if (template == null)
					return;

				if ((world.isAirBlock(new BlockPos(i - 1, j, k)))
					|| (world.isAirBlock(new BlockPos(i + 1, j, k)))
					|| (world.isAirBlock(new BlockPos(i, j, k + 1)))
					|| (world.isAirBlock(new BlockPos(i, j, k - 1)))) {
						world.setBlockToAir(new BlockPos((int) i, (int) j, (int) k));
						j = j - 1;
					}
				
					
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
					$_dependencies.put("vines", vines);
					$_dependencies.put("vines2", vines2);
					$_dependencies.put("SaplingSpawn", false);
					if ((world.canSeeSky(spawnTo)) || 
					(((world.getBlockState(spawnTo)).getMaterial() == Material.SNOW)
					&& world.canSeeSky(spawnTo.up()))) {
						world.setBlockToAir(spawnTo);
						world.setBlockToAir(spawnTo.up());
					}
					ProcedureWorldGenBothrodendron.executeProcedure($_dependencies);
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
