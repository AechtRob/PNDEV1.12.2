
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockBrachyphyllumLog;
import net.lepidodendron.block.BlockCrinoidTraumatocrinus;
import net.lepidodendron.block.BlockDeadLog;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
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
public class StructureTriassicDriftwood extends ElementsLepidodendronMod.ModElement {
	public StructureTriassicDriftwood(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if (world.isRemote)
			return;

		if (dimID != LepidodendronConfig.dimTriassic)
			return;

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (biome instanceof BiomeTriassic) {
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() != EnumBiomeTypeTriassic.Ocean) {
				return;
			}
		}
		else {
			return;
		}

		int GenChance = 8000;
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
			}
			else {
				doSpawn = false;
			}

			if (!doSpawn)
				return;

			int x = i;
			int y = height;
			int z = k;

			//System.err.println("Spawned log " + x + " " + y + " " + z);
			Block log = BlockBrachyphyllumLog.block;
			if (random.nextInt(6) == 0) {
				log = BlockDeadLog.block;
			}

			int dir = random.nextInt(4);
			int l = 3 + random.nextInt(8);
			int ll;
			int c;
			int cc;
			switch (dir) {
				case 0: { //North
					ll = 0;
					while (ll <= l) {
						ProcedureTreeLog.executeProcedure(x, y, z - ll, world, log, EnumFacing.EAST);
						if (random.nextInt(3) != 0) {
							c = 1;
							cc = random.nextInt(10);
							while (c <= cc && (world.getBlockState(new BlockPos(x, (y - c), z - ll)).getMaterial() == Material.WATER
									&& (world.getBlockState(new BlockPos(x, (y - c), z - ll)).getBlock() instanceof BlockFluidBase
									|| world.getBlockState(new BlockPos(x, (y - c), z - ll)).getBlock() instanceof BlockLiquid)
							)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y - c), z - ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
								c += 1;
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
							&& !(world.getBlockState(new BlockPos(x, y + 1, z - ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x, y + 1, z - ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x, y + 1, z - ll, world, log, EnumFacing.NORTH);
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x, y - 1, z - ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x, y - 1, z - ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x, y - 1, z - ll, world, log, EnumFacing.NORTH);
							if (random.nextInt(3) != 0) {
								c = 0;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x, (y - 1 - c), z - ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x, (y - 1 - c), z - ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x, (y - 1 - c), z - ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y - 1 - c), z - ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + 1, y, z - ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + 1, y, z - ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + 1, y, z - ll, world, log, EnumFacing.UP);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x + 1, (y - c), z - ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x + 1, (y - c), z - ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x + 1, (y - c), z - ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + 1, (y - c), z - ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - 1, y, z - ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - 1, y, z - ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - 1, y, z - ll, world, log, EnumFacing.UP);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x - 1, (y - c), z - ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x - 1, (y - c), z - ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x - 1, (y - c), z - ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - 1, (y - c), z - ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						ll += 1;
					}
					break;
				}

				case 1: { //South
					ll = 0;
					while (ll <= l) {
						ProcedureTreeLog.executeProcedure(x, y, z + ll, world, log, EnumFacing.EAST);
						if (random.nextInt(3) != 0) {
							c = 1;
							cc = random.nextInt(10);
							while (c <= cc && (world.getBlockState(new BlockPos(x, (y - c), z + ll)).getMaterial() == Material.WATER
									&& (world.getBlockState(new BlockPos(x, (y - c), z + ll)).getBlock() instanceof BlockFluidBase
									|| world.getBlockState(new BlockPos(x, (y - c), z + ll)).getBlock() instanceof BlockLiquid)
							)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y - c), z + ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
								c += 1;
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x, y + 1, z + ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x, y + 1, z + ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x, y + 1, z + ll, world, log, EnumFacing.NORTH);
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x, y - 1, z + ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x, y - 1, z + ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x, y - 1, z + ll, world, log, EnumFacing.NORTH);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x, (y - 1 - c), z + ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x, (y - 1 - c), z + ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x, (y - 1 - c), z + ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y - 1 - c), z + ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + 1, y, z + ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + 1, y, z + ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + 1, y, z + ll, world, log, EnumFacing.UP);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x + 1, (y - c), z + ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x + 1, (y - c), z + ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x + 1, (y - c), z + ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + 1, (y - c), z + ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - 1, y, z + ll + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - 1, y, z + ll - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - 1, y, z + ll, world, log, EnumFacing.UP);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x - 1, (y - c), z + ll)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x - 1, (y - c), z + ll)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x - 1, (y - c), z + ll)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - 1, (y - c), z + ll), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						ll += 1;
					}
					break;
				}



				case 2: { //West
					ll = 0;
					while (ll <= l) {
						ProcedureTreeLog.executeProcedure(x - ll, y, z, world, log, EnumFacing.UP);
						if (random.nextInt(3) != 0) {
							c = 1;
							cc = random.nextInt(10);
							while (c <= cc && (world.getBlockState(new BlockPos(x - ll, (y - c), z)).getMaterial() == Material.WATER
									&& (world.getBlockState(new BlockPos(x - ll, (y - c), z)).getBlock() instanceof BlockFluidBase
									|| world.getBlockState(new BlockPos(x - ll, (y - c), z)).getBlock() instanceof BlockLiquid)
							)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - ll, (y - c), z), BlockCrinoidTraumatocrinus.block.getDefaultState());
								c += 1;
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - ll + 1, y + 1, z)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - ll - 1, y + 1, z)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - ll, y + 1, z, world, log, EnumFacing.NORTH);
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - ll + 1, y - 1, z)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - ll - 1, y - 1, z)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - ll, y - 1, z, world, log, EnumFacing.NORTH);
							if (random.nextInt(3) != 0) {
								c = 0;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x - ll, (y - 1 - c), z)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x - ll, (y - 1 - c), z)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x - ll, (y - 1 - c), z)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - ll, (y - 1 - c), z), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - ll - 1, y, z + 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - ll, y, z + 1, world, log, EnumFacing.EAST);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x - ll, (y - c), z + 1)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x - ll, (y - c), z + 1)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x - ll, (y - c), z + 1)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - ll, (y - c), z + 1), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z - 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x - ll - 1, y, z - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x - ll, y, z - 1, world, log, EnumFacing.EAST);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x - ll, (y - c), z - 1)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x - ll, (y - c), z - 1)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x - ll, (y - c), z - 1)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x - ll, (y - c), z - 1), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						ll += 1;
					}
					break;
				}

				case 3: { //East
					ll = 0;
					while (ll <= l) {
						ProcedureTreeLog.executeProcedure(x + ll, y, z, world, log, EnumFacing.UP);
						if (random.nextInt(3) != 0) {
							c = 1;
							cc = random.nextInt(10);
							while (c <= cc && (world.getBlockState(new BlockPos(x + ll, (y - c), z)).getMaterial() == Material.WATER
									&& (world.getBlockState(new BlockPos(x + ll, (y - c), z)).getBlock() instanceof BlockFluidBase
									|| world.getBlockState(new BlockPos(x + ll, (y - c), z)).getBlock() instanceof BlockLiquid)
							)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + ll, (y - c), z), BlockCrinoidTraumatocrinus.block.getDefaultState());
								c += 1;
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + ll + 1, y + 1, z)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + ll - 1, y + 1, z)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + ll, y + 1, z, world, log, EnumFacing.NORTH);
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + ll + 1, y - 1, z)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + ll - 1, y - 1, z)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + ll, y - 1, z, world, log, EnumFacing.NORTH);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x + ll, (y - 1 - c), z)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x + ll, (y - 1 - c), z)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x + ll, (y - 1 - c), z)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + ll, (y - 1 - c), z), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z + 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + ll - 1, y, z + 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + ll, y, z + 1, world, log, EnumFacing.EAST);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x + ll, (y - c), z + 1)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x + ll, (y - c), z + 1)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x + ll, (y - c), z + 1)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + ll, (y - c), z + 1), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
								&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z - 1)).getBlock() == log
								|| world.getBlockState(new BlockPos(x + ll - 1, y, z - 1)).getBlock() == log)) {
							ProcedureTreeLog.executeProcedure(x + ll, y, z - 1, world, log, EnumFacing.EAST);
							if (random.nextInt(3) != 0) {
								c = 1;
								cc = random.nextInt(10);
								while (c <= cc && (world.getBlockState(new BlockPos(x + ll, (y - c), z - 1)).getMaterial() == Material.WATER
										&& (world.getBlockState(new BlockPos(x + ll, (y - c), z - 1)).getBlock() instanceof BlockFluidBase
										|| world.getBlockState(new BlockPos(x + ll, (y - c), z - 1)).getBlock() instanceof BlockLiquid)
								)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x + ll, (y - c), z - 1), BlockCrinoidTraumatocrinus.block.getDefaultState());
									c += 1;
								}
							}
						}
						ll += 1;
					}
					break;
				}



			}

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
