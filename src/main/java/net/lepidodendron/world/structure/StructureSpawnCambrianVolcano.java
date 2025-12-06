
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.EntityVolcano;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureSpawnCambrianVolcano extends ElementsLepidodendronMod.ModElement {
	public StructureSpawnCambrianVolcano(ElementsLepidodendronMod instance) {
		super(instance, 48);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if (dimID != LepidodendronConfig.dimCambrian)
			return;
		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea"))
			return;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_abyssal"))
			return;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs"))
			return;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore"))
			return;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_siphusauctum"))
			return;

		//int GenChance = 4000;
		int GenChance = 2500;

		if ((random.nextInt(1000000) + 1) <= GenChance) {
			int count = random.nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = world.getSeaLevel();
				while (height > 0) {
					if (
						(!world.isAirBlock(new BlockPos(i, height, k)))
								&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.VINE)
								&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.WEB)
								&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.PLANTS)
								&& ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.WATER)
					)
						break;
					height--;
				}

				int j = height;

				if (world.isRemote || (world.getBlockState(new BlockPos(i, j + 1, k)).getMaterial() != Material.WATER))
					return;

				BlockPos startpos = new BlockPos(i, j + 1, k);
				int coneRadius = random.nextInt(60) + 50;

				//if (!world.canSeeSky(pos.add(0, (coneRadius-coneHeight) - lavaRadius, 0))) {
				//	return;
				//}

				//System.err.println("Volcano: " + startpos.getX() + " " + startpos.getY() + " " + startpos.getZ());
				//System.err.println("coneRadius: " + coneRadius);

				int yct = 1;
				int xct = 0;
				int zct = 0;
				BlockPos pos = null;
				int heightrandomiser = 0;
				while (yct <= coneRadius) {
					//System.err.println("yct: " + yct);
					pos = startpos.add(random.nextInt(3)-1,0,random.nextInt(3)-1);
					if (Math.random() > 0.66) {
						heightrandomiser = heightrandomiser + random.nextInt(2);
					}
					xct = -((coneRadius - yct) + heightrandomiser);
					while (xct < (coneRadius - yct) + heightrandomiser) {
						//System.err.println("xct: " + xct);
						zct = -((coneRadius - yct)  + heightrandomiser);
						while (zct < (coneRadius - yct) + heightrandomiser) {
							//System.err.println("zct: " + zct);
                            boolean doBlock;
                            if (Math.random() > 0.4) {
                                //Test elliptical:
                                doBlock = ( ( (Math.pow(xct, 2)/Math.pow(((coneRadius - yct) + heightrandomiser - random.nextInt(3)),2)) + (Math.pow(zct, 2)/Math.pow(((coneRadius - yct) + heightrandomiser - random.nextInt(3)),2)))<=1);
                            }
                            else {
                                //Test circular:
                                doBlock = ((Math.pow(xct, 2) + Math.pow(zct, 2)) <= Math.pow((coneRadius - yct) + heightrandomiser, 2));
                            }
							if (doBlock) {
								BlockPos bp = new BlockPos(pos.getX() + xct, yct + 34, pos.getZ() + zct);
								IBlockState bs = world.getBlockState(bp);
								BlockPos bpd = new BlockPos(pos.getX() + xct, yct + 33, pos.getZ() + zct);
								IBlockState bsd = world.getBlockState(bpd);
								if (bs.getMaterial() != Material.ROCK || !world.isBlockFullCube(bp) || bs.getBlock().isReplaceable(world, bp)) {
									//Lava column:
									if (xct == 0 && zct == 0) {
										Functions.setBlockStateAndCheckForDoublePlant(world,bp, Blocks.FLOWING_LAVA.getDefaultState(), 2);
									}
									else {
										if (bsd.getMaterial() == Material.ROCK || bsd.getMaterial() == Material.GROUND || bsd.getMaterial() == Material.SAND) {
											double lavaBlockChance = (double) ((double) yct / (double) coneRadius);
											if (Math.random() > lavaBlockChance) {
												if (Math.random() > 0.1) {
													Functions.setBlockStateAndCheckForDoublePlant(world,bp, Blocks.STONE.getStateFromMeta(0), 2);
												} else {
													if ((bp.getY() < world.getSeaLevel()) && (Math.random() / lavaBlockChance > 0.6)) {
														Functions.setBlockStateAndCheckForDoublePlant(world,bp, Blocks.SAND.getStateFromMeta(0), 2);
													} else {
														Functions.setBlockStateAndCheckForDoublePlant(world,bp, Blocks.STONE.getStateFromMeta(1), 2);
													}
												}
											} else {
												if (Math.random() > 0.1) {
													Functions.setBlockStateAndCheckForDoublePlant(world,bp, BlockLavaRock.block.getDefaultState(), 2);
												} else { //Ashes:
													double randomiser = Math.random();
													if (randomiser > 0.70) {
														Functions.setBlockStateAndCheckForDoublePlant(world,bp, BlockVolcanicAsh.block.getDefaultState(), 2);
													} else {
														if (Math.random() > 0.40) {
															Functions.setBlockStateAndCheckForDoublePlant(world,bp, BlockVolcanicAshLight.block.getDefaultState(), 2);
														} else {
															if (Math.random() > 0.10) {
																Functions.setBlockStateAndCheckForDoublePlant(world,bp, BlockVolcanicAshDark.block.getDefaultState(), 2);
															}
															else {
																Functions.setBlockStateAndCheckForDoublePlant(world,bp, BlockSulphurOre.block.getDefaultState(), 2);
															}
														}
													}
												}
											}
										}
									}
								}
							}
							if (Math.random() > 0.66) {
								zct = zct + random.nextInt(2);
							}
							else {
								zct = zct + 1;
							}
						}
						if (Math.random() > 0.66) {
							xct = xct + random.nextInt(2);
						}
						else {
							xct = xct + 1;
						}
					}
				yct = yct + 1;
				}
				//Volcano is made. Now do a lava lake:
				BlockPos posLake = new BlockPos(pos.getX(), 0, pos.getZ() );
				//What radius do we have here?
				int radiusLake = xct - 1;
				//Dig it out - some will spill over, which is what we want:
				xct = -radiusLake;
				while (xct <= radiusLake) {
					zct = -radiusLake;
					while (zct <= radiusLake) {
						if ((Math.pow((int) xct, 2) + Math.pow((int) zct, 2)) <= Math.pow((int) radiusLake, 2)) {
							Functions.setBlockStateAndCheckForDoublePlant(world,posLake.add(xct, yct + 33, zct), Blocks.FLOWING_LAVA.getDefaultState(), 3);
							if (world.rand.nextInt(240) == 0) {
								EntityVolcano volcanoEntity = new EntityVolcano(world, posLake.add(xct, yct + 33, zct));
								world.spawnEntity(volcanoEntity);
							}
						}
						zct +=1;
					}
					xct +=1;
				}
				//Lake done, shall we make it one deeper?
				if (radiusLake > 3) {
					xct = -(radiusLake - 3);
					while (xct <= (radiusLake - 3)) {
						zct = -(radiusLake - 3);
						while (zct <= (radiusLake - 3)) {
							if ((Math.pow((int) xct, 2) + Math.pow((int) zct, 2)) <= Math.pow((int) (radiusLake - 3), 2)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,posLake.add(xct, yct + 32, zct), Blocks.FLOWING_LAVA.getDefaultState(), 3);
							}
							zct += 1;
						}
						xct += 1;
					}
				}
				//Add diamonds under the lake:
				if (radiusLake > 5) {
					xct = -(radiusLake - 5);
					while (xct <= (radiusLake - 5)) {
						zct = -(radiusLake - 5);
						while (zct <= (radiusLake - 5)) {
							if ((Math.pow((int) xct, 2) + Math.pow((int) zct, 2)) <= Math.pow((int) (radiusLake - 5), 2)) {
								if (Math.random() > 0.8 && world.getBlockState(posLake.add(xct, yct + 31, zct)).getMaterial() != Material.LAVA) {
									Functions.setBlockStateAndCheckForDoublePlant(world,posLake.add(xct, yct + 31, zct), Blocks.DIAMOND_ORE.getDefaultState(), 3);
								}
							}
							zct += 1;
						}
						xct += 1;
					}
				}
				if (radiusLake > 7) {
					xct = -(radiusLake - 7);
					while (xct <= (radiusLake - 7)) {
						zct = -(radiusLake - 7);
						while (zct <= (radiusLake - 7)) {
							if ((Math.pow((int) xct, 2) + Math.pow((int) zct, 2)) <= Math.pow((int) (radiusLake - 7), 2)) {
								if (Math.random() > 0.8 && world.getBlockState(posLake.add(xct, yct + 30, zct)).getMaterial() != Material.LAVA) {
									Functions.setBlockStateAndCheckForDoublePlant(world,posLake.add(xct, yct + 30, zct), Blocks.DIAMOND_ORE.getDefaultState(), 3);
								}
							}
							zct += 1;
						}
						xct += 1;
					}
				}
			}
		}
	}
}
