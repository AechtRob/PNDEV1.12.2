
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.BlockPachypteris;
import net.lepidodendron.block.BlockPachypterisStem;
import net.lepidodendron.block.BlockPachypterisTop;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnPachypteris extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnPachypteris(ElementsLepidodendronMod instance) {
		super(instance, 49);
	}

	public static final PropertyBool DEEP = PropertyBool.create("deep");

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimPachypteris))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genPachypteris && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genPachypterisBlacklistBiomes))) {
			biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genPachypterisOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 22000;
		double GenMultiplier = LepidodendronConfig.multiplierPachypteris;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 10, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(8) + 3;
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
				
				//Allow to spawn in 2-3 block water only. Spawns can be one block above ground due to prop-roots:
				if (
					(isWaterBlock(world, new BlockPos(i, j, k)) 
					&& isWaterBlock(world, new BlockPos(i, j - 1, k)))
					&& (((world.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.SAND) 
					|| ((world.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.CLAY) 
					|| ((world.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.GROUND))) {
					j = j - 2;
					blockCriteria = true;
				}

				if (
					(isWaterBlock(world, new BlockPos(i, j, k)) 
					&& isWaterBlock(world, new BlockPos(i, j - 1, k))
					&& isWaterBlock(world, new BlockPos(i, j - 2, k)))
					&& (((world.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.SAND) 
					|| ((world.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.CLAY) 
					|| ((world.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.GROUND))) {
					j = j - 3;
					blockCriteria = true;
				}

				if (
					(isWaterBlock(world, new BlockPos(i, j, k)) 
					&& isWaterBlock(world, new BlockPos(i, j - 1, k))
					&& isWaterBlock(world, new BlockPos(i, j - 2, k))
					&& isWaterBlock(world, new BlockPos(i, j - 3, k)))
					&& (((world.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.SAND) 
					|| ((world.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.CLAY) 
					|| ((world.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.GROUND))) {
					j = j - 3; // NB!!
					blockCriteria = true;
				}
				
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightPachypteris;
				int minheight = LepidodendronConfig.minheightPachypteris;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genPachypterisBlacklistBiomes))) {
					biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genPachypterisOverrideBiomes))
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

					if (isWaterBlock(world, spawnTo.up()) && isWaterBlock(world, spawnTo) && isWaterBlock(world, spawnTo.up(2))
			        	&& (world.isAirBlock(spawnTo.up(3)))
						) {
			        		world.setBlockState(spawnTo, BlockPachypteris.block.getDefaultState().withProperty(DEEP, true));
			        	}
					else {
						world.setBlockState(spawnTo, BlockPachypteris.block.getDefaultState().withProperty(DEEP, false));
					}


					if (isWaterBlock(world, spawnTo.up()) && isWaterBlock(world, spawnTo) && isWaterBlock(world, spawnTo.up(2))
		        	&& (world.isAirBlock(spawnTo.up(3)))
					) { //Vary the heights:
						//System.err.println("Large");
						if (Math.random() > 0.66) {
		        			world.setBlockState(spawnTo.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
						}
						else {
							if ((Math.random() > 0.5) && (world.isAirBlock(spawnTo.up(4)))) {
								world.setBlockState(spawnTo.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(spawnTo.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
							}
							else {
								if ((world.isAirBlock(spawnTo.up(5))) && (world.isAirBlock(spawnTo.up(4)))) {
									world.setBlockState(spawnTo.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
									world.setBlockState(spawnTo.up(4), BlockPachypterisStem.block.getDefaultState(), 3);
									world.setBlockState(spawnTo.up(5), BlockPachypterisTop.block.getDefaultState(), 3);
								}
								else {
									world.setBlockState(spawnTo.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
								}
							}
						}
		        	}
		        	
			    if (isWaterBlock(world, spawnTo.up()) && isWaterBlock(world, spawnTo)
		        	&& (world.isAirBlock(spawnTo.up(2)))
					) { //Vary the heights:
						if (Math.random() > 0.66) {
		        			world.setBlockState(spawnTo.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
						}
						else {
							if ((Math.random() > 0.5) && (world.isAirBlock(spawnTo.up(3)))) {
								world.setBlockState(spawnTo.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(spawnTo.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
							}
							else {
								if ((world.isAirBlock(spawnTo.up(4))) && (world.isAirBlock(spawnTo.up(3)))) {
									world.setBlockState(spawnTo.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
									world.setBlockState(spawnTo.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
									world.setBlockState(spawnTo.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
								}
								else {
									world.setBlockState(spawnTo.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
								}
							}
						}
		        	}
					
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

    public boolean isWaterBlock(World world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial() == Material.WATER) {
			IBlockState iblockstate = world.getBlockState(pos);
			if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
				return true;
			}
		}
    	return false;
    }
	
}
