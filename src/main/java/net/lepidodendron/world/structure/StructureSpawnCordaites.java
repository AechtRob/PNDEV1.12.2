
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.procedure.ProcedureWorldGenCordaites;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnCordaites extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnCordaites(ElementsLepidodendronMod instance) {
		super(instance, 49);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimCordaites))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genCordaites && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genCordaitesBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.LUSH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genCordaitesOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 20000;
		double GenMultiplier = LepidodendronConfig.multiplierCordaites;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 10, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(5) + 1;
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
				boolean waterCriteria = false;
				//Is there water nearby?
				int xct = -3;
				int yct;
				int zct;
				while ((xct < 2) && (!waterCriteria)) {
					yct = -1;
					while ((yct <= 0) && (!waterCriteria)) {
						zct = -1;
						while ((zct < 2) && (!waterCriteria)) {
							if ((world.getBlockState(new BlockPos(i + xct, j + yct, k + zct))).getMaterial() == Material.WATER) {
								waterCriteria = true;
							}
							zct = zct + 1;
						}
						yct = yct + 1;
					}
					xct = xct + 1;
				}
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.GRASS && waterCriteria)
					blockCriteria = true;
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.SAND && waterCriteria)
					blockCriteria = true;
				if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.GROUND && waterCriteria)
					blockCriteria = true;

				//Allow to spawn IN water up to three blocks deep ONLY:
				if (((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.WATER)
				&& (((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.SAND) 
				|| ((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.GROUND))) {
					blockCriteria = true;
					j = j - 1;
				}
				if (((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.WATER)
				&& ((world.getBlockState(new BlockPos(i, j - 1, k))).getMaterial() == Material.WATER)
				&& (((world.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.SAND) 
				|| ((world.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.GROUND))) {
					blockCriteria = true;
					j = j - 2;
				}
				
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightCordaites;
				int minheight = LepidodendronConfig.minheightCordaites;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genCordaitesBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.LUSH))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genCordaitesOverrideBiomes))
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
				if (!LepidodendronConfig.genSphenophyllalesCordaites && !LepidodendronConfig.genAllPlants)
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
				if (!LepidodendronConfig.genCallistophytalesCordaites && !LepidodendronConfig.genAllPlants)
					vines2 = false;
					
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
					$_dependencies.put("vines", vines);
					$_dependencies.put("vines2", vines2);
					$_dependencies.put("SaplingSpawn", false);
					if ((world.canSeeSky(spawnTo)) || 
					(((world.getBlockState(spawnTo)).getMaterial() == Material.SNOW)
					&& world.canSeeSky(spawnTo.up()))) {
						world.setBlockToAir(spawnTo);
						world.setBlockToAir(spawnTo.up());
					}
					ProcedureWorldGenCordaites.executeProcedure($_dependencies);
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
