
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnQuasistrobus extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnQuasistrobus(ElementsLepidodendronMod instance) {
		super(instance, 48);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimQuasistrobus))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genQuasistrobus && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genQuasistrobusBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SAVANNA))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.WET))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genQuasistrobusOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;

		int GenChance = 25000;
		double GenMultiplier = LepidodendronConfig.multiplierQuasistrobus;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 5, 300000);
		}
		
		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(3) + 1;
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

				if (!BlockQuasistrobus.block.canPlaceBlockAt(world, new BlockPos(i, j + 1, k)))
					blockCriteria = false;
					
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfig.maxheightQuasistrobus;
				int minheight = LepidodendronConfig.minheightQuasistrobus;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genQuasistrobusBlacklistBiomes))) {
					if ((BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS)) && Math.random() > 0.8)
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SAVANNA))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.WET))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfig.genQuasistrobusOverrideBiomes))
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
					world.setBlockState(spawnTo, BlockQuasistrobus.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.up(), BlockQuasistrobusCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.up(2), BlockQuasistrobusTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.north(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.south(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.north().east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.south().east(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().east().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().east().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.north().west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.north().west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
		
					world.setBlockState(spawnTo.south().west(), BlockQuasistrobusSide.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().west().up(), BlockQuasistrobusSideCentre.block.getDefaultState(), 3);
					world.setBlockState(spawnTo.south().west().up(2), BlockQuasistrobusSideTop.block.getDefaultState(), 3);
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
