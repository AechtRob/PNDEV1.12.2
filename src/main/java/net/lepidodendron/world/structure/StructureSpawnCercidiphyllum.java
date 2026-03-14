
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.block.BlockTrochodendroidesLog;
import net.lepidodendron.procedure.ProcedureWorldGenCercidiphyllum;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnCercidiphyllum extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnCercidiphyllum(ElementsLepidodendronMod instance) {
		super(instance, 48);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimCercidiphyllum))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genCercidiphyllum && (!LepidodendronConfig.genAllPlants) && (!LepidodendronConfig.genAllPlantsModern))
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genCercidiphyllumBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.CONIFEROUS))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genCercidiphyllumOverrideBiomes))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 35000;
		double GenMultiplier = LepidodendronConfigPlants.multiplierCercidiphyllum;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(300000, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
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
					
				if (!blockCriteria)
					continue;
		
				int maxheight = LepidodendronConfigPlants.maxheightCercidiphyllum;
				int minheight = LepidodendronConfigPlants.minheightCercidiphyllum;
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
				if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genCercidiphyllumBlacklistBiomes))) {
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
						biomeCriteria = true;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.CONIFEROUS))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
						biomeCriteria = false;
					if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
						biomeCriteria = false;
				}
				if (matchBiome(biome, LepidodendronConfigPlants.genCercidiphyllumOverrideBiomes))
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
					if ((world.canSeeSky(spawnTo)) ||
							(((world.getBlockState(spawnTo)).getMaterial() == Material.SNOW)
									&& world.canSeeSky(spawnTo.up()))) {
						world.setBlockToAir(spawnTo);
						world.setBlockToAir(spawnTo.up());
					}
					int BareTrunk = 5 + world.rand.nextInt(5);

					for (int log = 0; log < BareTrunk; log++) {
						world.setBlockState(spawnTo.up(log), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					}

					int TreeHeight = 12 + world.rand.nextInt(12);
					if (TreeHeight > 18 && Math.random() > 0.5) {
						TreeHeight = 8 + world.rand.nextInt(9);
					}
					ProcedureWorldGenCercidiphyllum.executeProcedure(world, spawnTo.up(BareTrunk), TreeHeight, false);

					//Surrounding stems:
					for (int d = 0; d <= 3; d++) {
						BlockPos posStem = spawnTo;
						if (world.rand.nextInt(4) == 0) {
							posStem = posStem.up();
						}
						world.setBlockState(posStem.offset(EnumFacing.byHorizontalIndex(d)), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, d == 0 || d == 2 ? EnumFacing.EAST : EnumFacing.UP), 3);
						world.setBlockState(posStem.offset(EnumFacing.byHorizontalIndex(d), 2), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
						world.setBlockState(posStem.up().offset(EnumFacing.byHorizontalIndex(d), 2), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
						world.setBlockState(posStem.up().offset(EnumFacing.byHorizontalIndex(d), 3), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
						world.setBlockState(posStem.up(2).offset(EnumFacing.byHorizontalIndex(d), 3), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
						BlockPos newPos = posStem.up(3).offset(EnumFacing.byHorizontalIndex(d), 3);
						int BareTrunkSide = world.rand.nextInt(3);
						for (int log = 0; log < BareTrunkSide; log++) {
							world.setBlockState(newPos.up(log), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
						}
						TreeHeight = 8 + world.rand.nextInt(8);
						if (TreeHeight > 12 && Math.random() > 0.5) {
							TreeHeight = 4 + world.rand.nextInt(9);
						}
						ProcedureWorldGenCercidiphyllum.executeProcedure(world, newPos.up(BareTrunkSide), TreeHeight - BareTrunkSide, false);
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
	
}
