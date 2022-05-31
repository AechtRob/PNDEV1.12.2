
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.BlockNelumbo;
import net.lepidodendron.block.BlockNelumboLeaves;
import net.lepidodendron.block.BlockNelumboStem;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnNelumbo extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnNelumbo(ElementsLepidodendronMod instance) {
		super(instance, 49);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimNelumbo))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genNelumbo && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genNelumboBlacklistBiomes))) {
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
		if (matchBiome(biome, LepidodendronConfig.genNelumboOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 22000;
		double GenMultiplier = LepidodendronConfig.multiplierNelumbo;
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
				
				//Allow to spawn in 2-5 block water only:
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
					j = j - 4;
					blockCriteria = true;
				}

				if (
					(isWaterBlock(world, new BlockPos(i, j, k)) 
					&& isWaterBlock(world, new BlockPos(i, j - 1, k))
					&& isWaterBlock(world, new BlockPos(i, j - 2, k))
					&& isWaterBlock(world, new BlockPos(i, j - 3, k))
					&& isWaterBlock(world, new BlockPos(i, j - 4, k)))
					&& (((world.getBlockState(new BlockPos(i, j - 5, k))).getMaterial() == Material.SAND) 
					|| ((world.getBlockState(new BlockPos(i, j - 5, k))).getMaterial() == Material.CLAY) 
					|| ((world.getBlockState(new BlockPos(i, j - 5, k))).getMaterial() == Material.GROUND))) {
					j = j - 5;
					blockCriteria = true;
				}

				if (
					(isWaterBlock(world, new BlockPos(i, j, k)) 
					&& isWaterBlock(world, new BlockPos(i, j - 1, k))
					&& isWaterBlock(world, new BlockPos(i, j - 2, k))
					&& isWaterBlock(world, new BlockPos(i, j - 3, k))
					&& isWaterBlock(world, new BlockPos(i, j - 4, k))
					&& isWaterBlock(world, new BlockPos(i, j - 5, k)))
					&& (((world.getBlockState(new BlockPos(i, j - 6, k))).getMaterial() == Material.SAND) 
					|| ((world.getBlockState(new BlockPos(i, j - 6, k))).getMaterial() == Material.CLAY) 
					|| ((world.getBlockState(new BlockPos(i, j - 6, k))).getMaterial() == Material.GROUND))) {
					j = j - 6;
					blockCriteria = true;
				}
				
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightNelumbo;
				int minheight = LepidodendronConfig.minheightNelumbo;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genNelumboBlacklistBiomes))) {
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
				if (matchBiome(biome, LepidodendronConfig.genNelumboOverrideBiomes))
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
					
					world.setBlockState(spawnTo, BlockNelumbo.block.getDefaultState(), 3);
					
			    	int colWater = 1; //North
			    	if (isWaterBlock(world, spawnTo.north())) {
				    	while (colWater < 6 && isWaterBlock(world, spawnTo.north().up(colWater))) {
				    		//Check the water column and place stems, and then leaves, accordingly:
				    		if (isWaterBlock(world, spawnTo.north().up(colWater + 1)))
				    		{
				    			world.setBlockState(spawnTo.north().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
				    	if (canLeavesPlaceAt(world, spawnTo.north().up(colWater))) {
				    		world.setBlockState(spawnTo.north().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
				    	}
			    	}
		
			    	colWater = 1; //South
			    	if (isWaterBlock(world, spawnTo.south())) {
				    	while (colWater < 6 && isWaterBlock(world, spawnTo.south().up(colWater))) {
				    		//Check the water column and place stems, and then leaves, accordingly:
				    		if (isWaterBlock(world, spawnTo.south().up(colWater + 1)))
				    		{
				    			world.setBlockState(spawnTo.south().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
				    	if (canLeavesPlaceAt(world, spawnTo.south().up(colWater))) {
				    		world.setBlockState(spawnTo.south().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
				    	}
			    	}
		
			    	colWater = 1; //East
			    	if (isWaterBlock(world, spawnTo.east())) {
				    	while (colWater < 6 && isWaterBlock(world, spawnTo.east().up(colWater))) {
				    		//Check the water column and place stems, and then leaves, accordingly:
				    		if (isWaterBlock(world, spawnTo.east().up(colWater + 1)))
				    		{
				    			world.setBlockState(spawnTo.east().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
				    	if (canLeavesPlaceAt(world, spawnTo.east().up(colWater))) {
				    		world.setBlockState(spawnTo.east().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
				    	}
			    	}
		
			    	colWater = 1; //West
			    	if (isWaterBlock(world, spawnTo.west())) {
				    	while (colWater < 6 && isWaterBlock(world, spawnTo.west().up(colWater))) {
				    		//Check the water column and place stems, and then leaves, accordingly:
				    		if (isWaterBlock(world, spawnTo.west().up(colWater + 1)))
				    		{
				    			world.setBlockState(spawnTo.west().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
				    	if (canLeavesPlaceAt(world, spawnTo.west().up(colWater))) {
				    		world.setBlockState(spawnTo.west().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
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

   public boolean canLeavesPlaceAt(World worldIn, BlockPos pos) {
    	IBlockState iblockstate1 = worldIn.getBlockState(pos.down());
		if (!isWaterBlock(worldIn, pos.down()))
    	{
    		return false;
    	}
    	if (!worldIn.isAirBlock(pos)) 
    	{
    		return false;
    	}
		if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockNelumboStem.block) {
			return true;
		}
    	if ((worldIn.getBlockState(pos.down(2).east()).getBlock() != BlockNelumbo.block) 
    		&& (worldIn.getBlockState(pos.down(2).west()).getBlock() != BlockNelumbo.block)
    		&& (worldIn.getBlockState(pos.down(2).north()).getBlock() != BlockNelumbo.block)
    		&& (worldIn.getBlockState(pos.down(2).south()).getBlock() != BlockNelumbo.block))
    	{
    		return false;
    	}

    	return true;
    	 
    }
	
}
