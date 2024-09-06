
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockBurntLog;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureFallenBurnedTree extends ElementsLepidodendronMod.ModElement {
	public StructureFallenBurnedTree(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if (world.isRemote)
			return;

		if (dimID != LepidodendronConfig.dimCretaceousEarly)
			return;

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (biome instanceof BiomeCretaceousEarly) {
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
			if ((!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland"))
			) {
				return;
			}
		}
		else {
			return;
		}

		int GenChance = 1500;
		int genTries = 1;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland")
		) {
			GenChance = 220000;
			genTries = random.nextInt(3) + 1;
		}
		for (int tryGo = 1; tryGo <= genTries; tryGo++) {
			if ((random.nextInt(1000000) + 1) <= GenChance) {
				boolean doSpawn = true;
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = ChunkGenSpawner.getTopSolidBlock(new BlockPos(i, 0, k), world).getY();
				if (
						(world.getBlockState(new BlockPos(i, height + 1, k)).getMaterial() == Material.AIR
						|| world.getBlockState(new BlockPos(i, height + 1, k)).getMaterial() == Material.WATER)
					&& (world.getBlockState(new BlockPos(i, height, k)).getMaterial() == Material.SAND
						|| world.getBlockState(new BlockPos(i, height, k)).getMaterial() == Material.GROUND)
				) {
				} else {
					doSpawn = false;
				}

				if (!doSpawn)
					return;

				int x = i;
				int y = height;
				if (random.nextInt(2) == 0) {
					y = height + 1;
				}
				int z = k;

				//System.err.println("Spawned log " + x + " " + y + " " + z);
				Block log = BlockBurntLog.block;
				boolean fat = false;
				boolean big = true;

				int dir = random.nextInt(4);
				int l = 3 + random.nextInt(8);
				if (big) {
					l = l * 2;
				}
				if (random.nextInt(3) != 0) {
					l = random.nextInt(3) + 1;
					fat = false;
					big = false;
				}
				int ll;
				if (!fat) {
					switch (dir) {
						case 0: { //North
							ll = 0;
							while (ll <= l) {
								if (!world.getBlockState(new BlockPos(x, y - 1, z - ll)).getMaterial().isSolid()) {
									y = y - 1;
								}
								ProcedureTreeLog.executeProcedureOnSand(x, y, z - ll, world, log, EnumFacing.EAST);
								spawnLife(world, x, y, z - ll, random);
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x, y + 1, z - ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x, y + 1, z - ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x, y + 1, z - ll, world, log, EnumFacing.NORTH);
									spawnLife(world, x, y + 1, z - ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x, y - 1, z - ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x, y - 1, z - ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x, y - 1, z - ll, world, log, EnumFacing.NORTH);
									spawnLife(world, x, y - 1, z - ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + 1, y, z - ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + 1, y, z - ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y, z - ll, world, log, EnumFacing.UP);
									spawnLife(world, x + 1, y, z - ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - 1, y, z - ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - 1, y, z - ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - 1, y, z - ll, world, log, EnumFacing.UP);
									spawnLife(world, x - 1, y, z - ll, random);
								}
								ll += 1;
							}
							break;
						}

						case 1: { //South
							ll = 0;
							while (ll <= l) {
								if (!world.getBlockState(new BlockPos(x, y - 1, z + ll)).getMaterial().isSolid()) {
									y = y - 1;
								}
								ProcedureTreeLog.executeProcedureOnSand(x, y, z + ll, world, log, EnumFacing.EAST);
								spawnLife(world, x, y, z + ll, random);
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x, y + 1, z + ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x, y + 1, z + ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x, y + 1, z + ll, world, log, EnumFacing.NORTH);
									spawnLife(world, x, y + 1, z + ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x, y - 1, z + ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x, y - 1, z + ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x, y - 1, z + ll, world, log, EnumFacing.NORTH);
									spawnLife(world, x, y - 1, z + ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + 1, y, z + ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + 1, y, z + ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y, z + ll, world, log, EnumFacing.UP);
									spawnLife(world, x + 1, y, z + ll, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - 1, y, z + ll + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - 1, y, z + ll - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - 1, y, z + ll, world, log, EnumFacing.UP);
									spawnLife(world, x - 1, y, z + ll, random);
								}
								ll += 1;
							}
							break;
						}


						case 2: { //West
							ll = 0;
							while (ll <= l) {
								if (!world.getBlockState(new BlockPos(x - ll, y - 1, z)).getMaterial().isSolid()) {
									y = y - 1;
								}
								ProcedureTreeLog.executeProcedureOnSand(x - ll, y, z, world, log, EnumFacing.UP);
								spawnLife(world, x - ll, y, z, random);
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - ll + 1, y + 1, z)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - ll - 1, y + 1, z)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y + 1, z, world, log, EnumFacing.NORTH);
									spawnLife(world, x - ll, y + 1, z, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - ll + 1, y - 1, z)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - ll - 1, y - 1, z)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y - 1, z, world, log, EnumFacing.NORTH);
									spawnLife(world, x - ll, y - 1, z, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - ll - 1, y, z + 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y, z + 1, world, log, EnumFacing.EAST);
									spawnLife(world, x - ll, y, z + 1, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x - ll + 1, y, z - 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x - ll - 1, y, z - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y, z - 1, world, log, EnumFacing.EAST);
									spawnLife(world, x - ll, y, z - 1, random);
								}
								ll += 1;
							}
							break;
						}

						case 3: { //East
							ll = 0;
							while (ll <= l) {
								if (!world.getBlockState(new BlockPos(x + ll, y - 1, z)).getMaterial().isSolid()) {
									y = y - 1;
								}
								ProcedureTreeLog.executeProcedureOnSand(x + ll, y, z, world, log, EnumFacing.UP);
								spawnLife(world, x + ll, y, z, random);
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + ll + 1, y + 1, z)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + ll - 1, y + 1, z)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y + 1, z, world, log, EnumFacing.NORTH);
									spawnLife(world, x + ll, y + 1, z, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + ll + 1, y - 1, z)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + ll - 1, y - 1, z)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y - 1, z, world, log, EnumFacing.NORTH);
									spawnLife(world, x + ll, y - 1, z, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z + 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + ll - 1, y, z + 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y, z + 1, world, log, EnumFacing.EAST);
									spawnLife(world, x + ll, y, z + 1, random);
								}
								if (ll <= 3 + random.nextInt(2) && random.nextInt(4) == 0
										&& !(world.getBlockState(new BlockPos(x + ll + 1, y, z - 1)).getBlock() == log
										|| world.getBlockState(new BlockPos(x + ll - 1, y, z - 1)).getBlock() == log)) {
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y, z - 1, world, log, EnumFacing.EAST);
									spawnLife(world, x + ll, y, z - 1, random);
								}
								ll += 1;
							}
							break;
						}
					}
				}
				else {
					//fat logs which can also do diagonal like shapes:
					int diagonal = random.nextInt(3) - 1;
					//if (random.nextInt(4) != 0) {
					//	diagonal = 0;
					//}
					switch (dir) {
						case 0: { //North
							ll = 0;
							while (ll <= l) {
								if (random.nextInt(5) != 0) {
									x = x + diagonal;
									if (!world.getBlockState(new BlockPos(x, y - 1, z - ll)).getMaterial().isSolid()) {
										y = y - 1;
									}
									ProcedureTreeLog.executeProcedureOnSand(x, y, z - ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y, z - ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x, y - 1, z - ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y - 1, z - ll, world, log, EnumFacing.EAST);
									spawnLife(world, x, y, z - ll, random);
									spawnLife(world, x + 1, y, z - ll, random);
									spawnLife(world, x, y - 1, z - ll, random);
									spawnLife(world, x + 1, y - 1, z - ll, random);
									if (random.nextInt(3) == 0) {
										createBigBranch(world, x + (random.nextInt(2) - Math.abs(diagonal)), y - random.nextInt(2), z - ll, random, log, diagonal);
									}
									ll += 1;
								}
							}
							break;
						}
						case 1: { //South
							ll = 0;
							while (ll <= l) {
								if (random.nextInt(5) != 0) {
									x = x + diagonal;
									if (!world.getBlockState(new BlockPos(x, y - 1, z + ll)).getMaterial().isSolid()) {
										y = y - 1;
									}
									ProcedureTreeLog.executeProcedureOnSand(x, y, z + ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y, z + ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x, y - 1, z + ll, world, log, EnumFacing.EAST);
									ProcedureTreeLog.executeProcedureOnSand(x + 1, y - 1, z + ll, world, log, EnumFacing.EAST);
									spawnLife(world, x, y, z + ll, random);
									spawnLife(world, x + 1, y, z + ll, random);
									spawnLife(world, x, y - 1, z + ll, random);
									spawnLife(world, x + 1, y - 1, z + ll, random);
									if (random.nextInt(3) == 0) {
										createBigBranch(world, x + (random.nextInt(2) - Math.abs(diagonal)), y - random.nextInt(2), z + ll, random, log, diagonal);
									}
									ll += 1;
								}
							}
							break;
						}
						case 2: { //East
							ll = 0;
							while (ll <= l) {
								if (random.nextInt(5) != 0) {
									z = z + diagonal;
									if (!world.getBlockState(new BlockPos(x + ll, y - 1, z)).getMaterial().isSolid()) {
										y = y - 1;
									}
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y, z, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y, z + 1, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y - 1, z, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x + ll, y - 1, z + 1, world, log, EnumFacing.UP);
									spawnLife(world, x + ll, y, z, random);
									spawnLife(world, x + 1, y, z + 1, random);
									spawnLife(world, x + ll, y - 1, z, random);
									spawnLife(world, x + ll, y - 1, z + 1, random);
									if (random.nextInt(3) == 0) {
										createBigBranch(world, x + ll, y - random.nextInt(2), z + (random.nextInt(2) - Math.abs(diagonal)), random, log, diagonal);
									}
									ll += 1;
								}
							}
							break;
						}
						case 3: { //West
							ll = 0;
							while (ll <= l) {
								if (random.nextInt(5) != 0) {
									z = z + diagonal;
									if (!world.getBlockState(new BlockPos(x - ll, y - 1, z)).getMaterial().isSolid()) {
										y = y - 1;
									}
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y, z, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y, z + 1, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y - 1, z, world, log, EnumFacing.UP);
									ProcedureTreeLog.executeProcedureOnSand(x - ll, y - 1, z + 1, world, log, EnumFacing.UP);
									spawnLife(world, x - ll, y, z, random);
									spawnLife(world, x - ll, y, z + 1, random);
									spawnLife(world, x - ll, y - 1, z, random);
									spawnLife(world, x - ll, y - 1, z + 1, random);
									if (random.nextInt(3) == 0) {
										createBigBranch(world, x - ll, y - random.nextInt(2), z + (random.nextInt(2) - Math.abs(diagonal)), random, log, diagonal);
									}
									ll += 1;
								}
							}
							break;
						}
					}
				}
			}
		}
	}

	public void createBigBranch(World world, int x, int y, int z, Random random, Block log, int diagonal) {
		if (random.nextInt(3) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x, y + 1, z, world, log, EnumFacing.NORTH);
			spawnLife(world, x, y + 1, z, random);
			if (world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x, y + 2, z, world, log, EnumFacing.NORTH);
				spawnLife(world, x, y + 2, z, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x, y + 2, z)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x, y + 3, z, world, log, EnumFacing.NORTH);
					spawnLife(world, x, y + 3, z, random);
				}
			}
		}

		if (random.nextInt(5) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x, y - 1, z, world, log, EnumFacing.NORTH);
			spawnLife(world, x, y - 1, z, random);
			if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x, y - 2, z, world, log, EnumFacing.NORTH);
				spawnLife(world, x, y - 2, z, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x, y - 2, z)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x, y - 3, z, world, log, EnumFacing.NORTH);
					spawnLife(world, x, y - 3, z, random);
				}
			}
		}

		if (random.nextInt(5) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x, y, z + 1, world, log, EnumFacing.EAST);
			spawnLife(world, x, y, z + 1, random);
			if (world.getBlockState(new BlockPos(x, y, z + 1)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x, y, z + 2, world, log, EnumFacing.EAST);
				spawnLife(world, x, y, z, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x, y, z + 2)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x, y, z + 3, world, log, EnumFacing.EAST);
					spawnLife(world, x, y, z + 3, random);
					if (random.nextInt(2) == 0 && diagonal != 0 && world.getBlockState(new BlockPos(x, y, z + 3)).getBlock() == log) {
						ProcedureTreeLog.executeProcedureOnSand(x, y, z + 4, world, log, EnumFacing.EAST);
						spawnLife(world, x, y, z + 4, random);
					}
				}
			}
		}

		if (random.nextInt(5) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x, y, z - 1, world, log, EnumFacing.EAST);
			spawnLife(world, x, y, z - 1, random);
			if (world.getBlockState(new BlockPos(x, y, z - 1)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x, y, z - 2, world, log, EnumFacing.EAST);
				spawnLife(world, x, y, z - 2, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x, y, z - 2)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x, y, z - 3, world, log, EnumFacing.EAST);
					spawnLife(world, x, y, z - 3, random);
					if (random.nextInt(2) == 0 && diagonal != 0 && world.getBlockState(new BlockPos(x, y, z - 3)).getBlock() == log) {
						ProcedureTreeLog.executeProcedureOnSand(x, y, z - 4, world, log, EnumFacing.EAST);
						spawnLife(world, x, y, z - 4, random);
					}
				}
			}
		}

		if (random.nextInt(5) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x + 1, y, z, world, log, EnumFacing.UP);
			spawnLife(world, x + 1, y, z, random);
			if (world.getBlockState(new BlockPos(x + 1, y, z)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x + 2, y, z, world, log, EnumFacing.UP);
				spawnLife(world, x + 2, y, z, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x + 2, y, z)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x + 3, y, z, world, log, EnumFacing.UP);
					spawnLife(world, x + 3, y, z, random);
					if (random.nextInt(2) == 0 && diagonal != 0 && world.getBlockState(new BlockPos(x + 3, y, z)).getBlock() == log) {
						ProcedureTreeLog.executeProcedureOnSand(x + 4, y, z, world, log, EnumFacing.UP);
						spawnLife(world, x + 4, y, z, random);
					}
				}
			}
		}

		if (random.nextInt(5) == 0) {
			ProcedureTreeLog.executeProcedureOnSand(x - 1, y, z, world, log, EnumFacing.UP);
			spawnLife(world, x - 1, y, z, random);
			if (world.getBlockState(new BlockPos(x - 1, y, z)).getBlock() == log) {
				ProcedureTreeLog.executeProcedureOnSand(x - 2, y, z, world, log, EnumFacing.UP);
				spawnLife(world, x - 2, y, z, random);
				if (random.nextInt(2) == 0 && world.getBlockState(new BlockPos(x - 2, y, z)).getBlock() == log) {
					ProcedureTreeLog.executeProcedureOnSand(x - 3, y, z, world, log, EnumFacing.UP);
					spawnLife(world, x - 3, y, z, random);
					if (random.nextInt(2) == 0 && diagonal != 0 && world.getBlockState(new BlockPos(x - 3, y, z)).getBlock() == log) {
						ProcedureTreeLog.executeProcedureOnSand(x - 4, y, z, world, log, EnumFacing.UP);
						spawnLife(world, x - 4, y, z, random);
					}
				}
			}
		}
	}

	public void spawnLife(World world, int x, int y, int z, Random random) {
//		int c;
//		int cc;
//		if (random.nextInt(10) != 0) {
//			c = 1;
//			if (random.nextInt(4) != 0) {
//				cc = random.nextInt(5);
//				while (c <= cc && (world.getBlockState(new BlockPos(x, (y + c), z)).getMaterial() == Material.WATER
//						&& (world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockFluidBase
//						|| world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockLiquid)
//				)) {
//					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y + c), z), BlockBrownAscendingAlgae.block.getDefaultState());
//					c += 1;
//				}
//			}
//			else if (random.nextInt(4) != 0) {
//				cc = random.nextInt(5);
//				while (c <= cc && (world.getBlockState(new BlockPos(x, (y + c), z)).getMaterial() == Material.WATER
//						&& (world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockFluidBase
//						|| world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockLiquid)
//				)) {
//					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y + c), z), BlockGreenStemmedAlgae.block.getDefaultState());
//					c += 1;
//				}
//			}
//			else if (random.nextInt(3) != 0) {
//				cc = random.nextInt(3);
//				while (c <= cc && (world.getBlockState(new BlockPos(x, (y + c), z)).getMaterial() == Material.WATER
//						&& (world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockFluidBase
//						|| world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockLiquid)
//				)) {
//					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y + c), z), BlockCrinoidPhyllocrinus.block.getDefaultState());
//					c += 1;
//				}
//			}
//			else if (random.nextInt(3) != 0) {
//				cc = random.nextInt(4);
//				while (c <= cc && (world.getBlockState(new BlockPos(x, (y + c), z)).getMaterial() == Material.WATER
//						&& (world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockFluidBase
//						|| world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockLiquid)
//				)) {
//					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y + c), z), BlockCrinoidEugeniacrinites.block.getDefaultState());
//					c += 1;
//				}
//			}
//			else if (random.nextInt(3) != 0) {
//				cc = random.nextInt(2);
//				while (c <= cc && (world.getBlockState(new BlockPos(x, (y + c), z)).getMaterial() == Material.WATER
//						&& (world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockFluidBase
//						|| world.getBlockState(new BlockPos(x, (y + c), z)).getBlock() instanceof BlockLiquid)
//				)) {
//					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos(x, (y + c), z), BlockCrinoidBalanocrinus.block.getDefaultState());
//					c += 1;
//				}
//			}
//		}
//
//		for (int ii = 0; ii <=4; ii++) {
//			BlockPos pos = new BlockPos(x, y, z).add(random.nextInt(3) - 1, random.nextInt(3) - 1, random.nextInt(3) - 1);
//			//Algae:
//			if (random.nextInt(4) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(4) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(4) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(4) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.WEST));
//			}
//			if (random.nextInt(4) == 0 && BlockGreenAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGreenAlgaeMat.block.getDefaultState().withProperty(BlockGreenAlgaeMat.BlockCustom.FACING, EnumFacing.EAST));
//			}
//
//
//			if (random.nextInt(4) == 0 && BlockRedAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedAlgaeMat.block.getDefaultState().withProperty(BlockRedAlgaeMat.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(4) == 0 && BlockRedAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedAlgaeMat.block.getDefaultState().withProperty(BlockRedAlgaeMat.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(4) == 0 && BlockRedAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedAlgaeMat.block.getDefaultState().withProperty(BlockRedAlgaeMat.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(4) == 0 && BlockRedAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedAlgaeMat.block.getDefaultState().withProperty(BlockRedAlgaeMat.BlockCustom.FACING, EnumFacing.WEST));
//			}
//			if (random.nextInt(4) == 0 && BlockRedAlgaeMat.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedAlgaeMat.block.getDefaultState().withProperty(BlockRedAlgaeMat.BlockCustom.FACING, EnumFacing.EAST));
//			}
//
//			if (random.nextInt(5) == 0 && BlockRedLeafyAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedLeafyAlgae.block.getDefaultState().withProperty(BlockRedLeafyAlgae.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(5) == 0 && BlockRedLeafyAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedLeafyAlgae.block.getDefaultState().withProperty(BlockRedLeafyAlgae.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(5) == 0 && BlockRedLeafyAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedLeafyAlgae.block.getDefaultState().withProperty(BlockRedLeafyAlgae.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(5) == 0 && BlockRedLeafyAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedLeafyAlgae.block.getDefaultState().withProperty(BlockRedLeafyAlgae.BlockCustom.FACING, EnumFacing.WEST));
//			}
//			if (random.nextInt(5) == 0 && BlockRedLeafyAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedLeafyAlgae.block.getDefaultState().withProperty(BlockRedLeafyAlgae.BlockCustom.FACING, EnumFacing.EAST));
//			}
//
//			if (random.nextInt(5) == 0 && BlockRedTuftedAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedTuftedAlgae.block.getDefaultState().withProperty(BlockRedTuftedAlgae.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(5) == 0 && BlockRedTuftedAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedTuftedAlgae.block.getDefaultState().withProperty(BlockRedTuftedAlgae.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(5) == 0 && BlockRedTuftedAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedTuftedAlgae.block.getDefaultState().withProperty(BlockRedTuftedAlgae.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(5) == 0 && BlockRedTuftedAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedTuftedAlgae.block.getDefaultState().withProperty(BlockRedTuftedAlgae.BlockCustom.FACING, EnumFacing.WEST));
//			}
//			if (random.nextInt(5) == 0 && BlockRedTuftedAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockRedTuftedAlgae.block.getDefaultState().withProperty(BlockRedTuftedAlgae.BlockCustom.FACING, EnumFacing.EAST));
//			}
//
//			if (random.nextInt(5) == 0 && BlockBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockBrownAlgae.block.getDefaultState().withProperty(BlockBrownAlgae.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(5) == 0 && BlockBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockBrownAlgae.block.getDefaultState().withProperty(BlockBrownAlgae.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(5) == 0 && BlockBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockBrownAlgae.block.getDefaultState().withProperty(BlockBrownAlgae.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(5) == 0 && BlockBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockBrownAlgae.block.getDefaultState().withProperty(BlockBrownAlgae.BlockCustom.FACING, EnumFacing.EAST));
//			}
//			if (random.nextInt(5) == 0 && BlockBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockBrownAlgae.block.getDefaultState().withProperty(BlockBrownAlgae.BlockCustom.FACING, EnumFacing.WEST));
//			}
//
//			if (random.nextInt(5) == 0 && BlockStalkyBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.UP)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockStalkyBrownAlgae.block.getDefaultState().withProperty(BlockStalkyBrownAlgae.BlockCustom.FACING, EnumFacing.UP));
//			}
//			if (random.nextInt(5) == 0 && BlockStalkyBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.SOUTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockStalkyBrownAlgae.block.getDefaultState().withProperty(BlockStalkyBrownAlgae.BlockCustom.FACING, EnumFacing.SOUTH));
//			}
//			if (random.nextInt(5) == 0 && BlockStalkyBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.NORTH)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockStalkyBrownAlgae.block.getDefaultState().withProperty(BlockStalkyBrownAlgae.BlockCustom.FACING, EnumFacing.NORTH));
//			}
//			if (random.nextInt(5) == 0 && BlockStalkyBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.WEST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockStalkyBrownAlgae.block.getDefaultState().withProperty(BlockStalkyBrownAlgae.BlockCustom.FACING, EnumFacing.WEST));
//			}
//			if (random.nextInt(5) == 0 && BlockStalkyBrownAlgae.block.canPlaceBlockOnSide(world, pos, EnumFacing.EAST)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockStalkyBrownAlgae.block.getDefaultState().withProperty(BlockStalkyBrownAlgae.BlockCustom.FACING, EnumFacing.EAST));
//			}
//		}

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
