
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureJurassicRaft extends ElementsLepidodendronMod.ModElement {
	public StructureJurassicRaft(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if (world.isRemote)
			return;

		if (dimID != LepidodendronConfig.dimJurassic)
			return;

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (biome instanceof BiomeJurassic) {
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() != EnumBiomeTypeJurassic.Ocean) {
				return;
			}
		}
		else {
			return;
		}
		int GenChance = 2000;
		int genTries = 1;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")) {
			GenChance = 500000;
			genTries = random.nextInt(6) + 1;
		}
		for (int tryGo = 1; tryGo <= genTries; tryGo++) {
			if ((random.nextInt(1000000) + 1) <= GenChance) {
				boolean doSpawn = true;
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = world.getSeaLevel() - 1;
				if (
						(!world.isAirBlock(new BlockPos(i, height, k)))
								&& world.getBlockState(new BlockPos(i, height, k)).getMaterial() == Material.WATER
				) {
					int d = 1;
					while (d < 10 && doSpawn) {
						if (!(world.getBlockState(new BlockPos(i, (height - d), k)).getMaterial() == Material.WATER
								&& (world.getBlockState(new BlockPos(i, (height - d), k)).getBlock() instanceof BlockFluidBase
								|| world.getBlockState(new BlockPos(i, (height - d), k)).getBlock() instanceof BlockLiquid)
						)) {
							doSpawn = false;
						}
						d += 1;
					}
				} else {
					doSpawn = false;
				}

				if (!doSpawn)
					return;

				int x = i;
				int y = height;
				int z = k;

				//System.err.println("Spawned log " + x + " " + y + " " + z);
				Block log = BlockBrachyphyllumLog.block;
				boolean fat = false;
				boolean big = true;
				if (random.nextInt(6) == 0) {
					log = BlockDeadLog.block;
					big = false;
				}
				if (random.nextInt(5) == 0) {
					log = BlockGinkgoLog.block;
					big = false;
				}
				if (random.nextInt(5) == 0) {
					log = BlockTallAraucariaLog.block;
					fat = true;
				}

				int dir = random.nextInt(4);
				int l = 3 + random.nextInt(8);
				if (big) {
					l = l * 2;
				}
				int ll;
				switch (dir) {
					case 0: { //North
						ll = 0;
						while (ll <= l) {
							ProcedureTreeLog.executeProcedure(x, y, z - ll, world, log, EnumFacing.EAST);
							spawnLife(world, x, y, z - ll, random);
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x, y + 1, z - ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x, y + 1, z - ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x, y + 1, z - ll, world, log, EnumFacing.NORTH);
								spawnLife(world, x, y + 1, z - ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x, y - 1, z - ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x, y - 1, z - ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x, y - 1, z - ll, world, log, EnumFacing.NORTH);
								spawnLife(world, x, y - 1, z - ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + 1, y, z - ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + 1, y, z - ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + 1, y, z - ll, world, log, EnumFacing.UP);
								spawnLife(world, x + 1, y, z - ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - 1, y, z - ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - 1, y, z - ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - 1, y, z - ll, world, log, EnumFacing.UP);
								spawnLife(world, x - 1, y, z - ll, random);
							}
							ll += 1;
						}
						break;
					}

					case 1: { //South
						ll = 0;
						while (ll <= l) {
							ProcedureTreeLog.executeProcedure(x, y, z + ll, world, log, EnumFacing.EAST);
							spawnLife(world, x, y, z + ll, random);
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x, y + 1, z + ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x, y + 1, z + ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x, y + 1, z + ll, world, log, EnumFacing.NORTH);
								spawnLife(world, x, y + 1, z + ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x, y - 1, z + ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x, y - 1, z + ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x, y - 1, z + ll, world, log, EnumFacing.NORTH);
								spawnLife(world, x, y - 1, z + ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + 1, y, z + ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + 1, y, z + ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + 1, y, z + ll, world, log, EnumFacing.UP);
								spawnLife(world, x + 1, y, z + ll, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - 1, y, z + ll + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - 1, y, z + ll - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - 1, y, z + ll, world, log, EnumFacing.UP);
								spawnLife(world, x - 1, y, z + ll, random);
							}
							ll += 1;
						}
						break;
					}


					case 2: { //West
						ll = 0;
						while (ll <= l) {
							ProcedureTreeLog.executeProcedure(x - ll, y, z, world, log, EnumFacing.UP);
							spawnLife(world, x - ll, y, z, random);
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - ll + 1, y + 1, z)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - ll - 1, y + 1, z)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - ll, y + 1, z, world, log, EnumFacing.NORTH);
								spawnLife(world, x - ll, y + 1, z, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - ll + 1, y - 1, z)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - ll - 1, y - 1, z)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - ll, y - 1, z, world, log, EnumFacing.NORTH);
								spawnLife(world, x - ll, y - 1, z, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - ll - 1, y, z + 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - ll, y, z + 1, world, log, EnumFacing.EAST);
								spawnLife(world, x - ll, y, z + 1, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z - 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x - ll - 1, y, z - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x - ll, y, z - 1, world, log, EnumFacing.EAST);
								spawnLife(world, x - ll, y, z - 1, random);
							}
							ll += 1;
						}
						break;
					}

					case 3: { //East
						ll = 0;
						while (ll <= l) {
							ProcedureTreeLog.executeProcedure(x + ll, y, z, world, log, EnumFacing.UP);
							spawnLife(world, x + ll, y, z, random);
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + ll + 1, y + 1, z)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + ll - 1, y + 1, z)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + ll, y + 1, z, world, log, EnumFacing.NORTH);
								spawnLife(world, x + ll, y + 1, z, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + ll + 1, y - 1, z)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + ll - 1, y - 1, z)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + ll, y - 1, z, world, log, EnumFacing.NORTH);
								spawnLife(world, x + ll, y - 1, z, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z + 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + ll - 1, y, z + 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + ll, y, z + 1, world, log, EnumFacing.EAST);
								spawnLife(world, x + ll, y, z + 1, random);
							}
							if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
									&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z - 1)).getBlock() == log
									|| world.getBlockState(new BlockPos(x + ll - 1, y, z - 1)).getBlock() == log)) {
								ProcedureTreeLog.executeProcedure(x + ll, y, z - 1, world, log, EnumFacing.EAST);
								spawnLife(world, x + ll, y, z - 1, random);
							}
							ll += 1;
						}
						break;
					}
				}
			}
		}
	}

	public void spawnLife(World world, int x, int y, int z, Random random) {
		int c;
		int cc;
		if (random.nextInt(10) != 0) {
			c = 1;
			if (random.nextInt(3) != 0) {
				cc = random.nextInt(20);
				while (c <= cc && (world.getBlockState(new BlockPos(x, (y - c), z)).getMaterial() == Material.WATER
						&& (world.getBlockState(new BlockPos(x, (y - c), z)).getBlock() instanceof BlockFluidBase
						|| world.getBlockState(new BlockPos(x, (y - c), z)).getBlock() instanceof BlockLiquid)
				)) {
					world.setBlockState(new BlockPos(x, (y - c), z), BlockCrinoidSeirocrinus.block.getDefaultState());
					c += 1;
				}
			}
			else {
				cc = random.nextInt(5);
				while (c <= cc && (world.getBlockState(new BlockPos(x, (y - c), z)).getMaterial() == Material.WATER
						&& (world.getBlockState(new BlockPos(x, (y - c), z)).getBlock() instanceof BlockFluidBase
						|| world.getBlockState(new BlockPos(x, (y - c), z)).getBlock() instanceof BlockLiquid)
				)) {
					world.setBlockState(new BlockPos(x, (y - c), z), BlockCrinoidPentacrinites.block.getDefaultState());
					c += 1;
				}
			}
		}
		//else { //Non-crinoid life:
			BlockPos pos = new BlockPos(x, y, z);
			//Moss:
			if (random.nextInt(2) == 0 && BlockAncientMoss.block.canPlaceBlockAt(world, pos.up())) {
				world.setBlockState(pos.up(), BlockAncientMoss.block.getDefaultState().withProperty(BlockAncientMoss.BlockCustom.FACING, EnumFacing.UP));
			}
			//Algae:
			if (random.nextInt(3) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockAt(world, pos.north())) {
				world.setBlockState(pos.north(), BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.SOUTH));
			}
			if (random.nextInt(3) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockAt(world, pos.south())) {
				world.setBlockState(pos.south(), BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.NORTH));
			}
			if (random.nextInt(3) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockAt(world, pos.east())) {
				world.setBlockState(pos.east(), BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.WEST));
			}
			if (random.nextInt(3) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockAt(world, pos.west())) {
				world.setBlockState(pos.west(), BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.EAST));
			}

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
