package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockArtocarpusFruitBlock;
import net.lepidodendron.block.BlockArtocarpusLeaves;
import net.lepidodendron.block.BlockArtocarpusLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArtocarpus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArtocarpus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArtocarpus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArtocarpus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArtocarpus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArtocarpus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		int counter = 0;
		int xx = x;
		int yy = y;
		int zz = z;
		int xct = 0;
		int zct = 0;

		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk:
			TrunkHeight = Math.round(Math.random() * 6);
			if (Math.random() > 0.75) {
				TrunkHeight = Math.round(TrunkHeight/2);
			}
			counter = 0;
			
			while (counter <= (int) TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			y = y + (int) TrunkHeight + 1;

			if (TrunkHeight >= 5) {
				//Bigger tree:
				yy = y;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 3, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy + 3, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy + 3, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 3, (int) z + 1, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 3, (int) z - 1, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);

				counter = 1;
				while (counter <= 6) {
					yy = y + counter;
					xx = x + 3;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					yy = y + counter;
					xx = x - 3;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					yy = y + counter;
					xx = x;
					zz = z + 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					yy = y + counter;
					xx = x;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					counter = counter + 1;
				}

				//Leaves and fruits:


				yy = y + 2; //Fruit layer:
				xct = -4;
				while (xct <= 4) {
					zct = -4;
					while (zct <= 4) {
						//if (Math.abs(xct) + Math.abs(zct)) <= 3) {
						if ((Math.abs(xct) + Math.abs(zct) < 5) && (((Math.abs(xct) + Math.abs(zct))%2)!=0)) { //sum is is an odd number
							if ((Math.abs(xct) != 4) && (Math.abs(zct) != 4)) {
								ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
								if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 4) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
									world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
								}
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 3; //Fruit layer:
				xct = -4;
				while (xct <= 4) {
					zct = -4;
					while (zct <= 4) {
						if (Math.abs(xct) + Math.abs(zct) <= 4) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 4) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
								world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 4; //Fruit layer:
				xct = -5;
				while (xct <= 5) {
					zct = -5;
					while (zct <= 5) {
						if (Math.abs(xct) + Math.abs(zct) <= 5) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 5) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
								world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				
				yy = y + 5;
				xct = -5;
				while (xct <= 5) {
					zct = -5;
					while (zct <= 5) {
						if (Math.abs(xct) + Math.abs(zct) <= 5) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 6;
				xct = -4;
				while (xct <= 4) {
					zct = -4;
					while (zct <= 4) {
						if (Math.abs(xct) + Math.abs(zct) <= 4) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 7;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if (Math.abs(xct) + Math.abs(zct) <= 3) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 8;
				xct = -2;
				while (xct <= 2) {
					zct = -2;
					while (zct <= 2) {
						if (Math.abs(xct) + Math.abs(zct) <= 2) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				
			}
			else {
				//Smaller tree
				yy = y;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArtocarpusLog.block, EnumFacing.UP);
				counter = 1;
				while (counter <= 5) {
					yy = y + counter;
					xx = x + 2;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 4) {
						ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					yy = y + counter;
					xx = x - 2;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 4) {
						ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.UP);
					}
					yy = y + counter;
					xx = x;
					zz = z + 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 4) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
					}
					yy = y + counter;
					xx = x;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockArtocarpusLog.block, EnumFacing.NORTH);
					if (counter == 4) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockArtocarpusLog.block, EnumFacing.EAST);
					}
					counter = counter + 1;
				}

				//Leaves and fruits:
				yy = y + 1; //Fruit layer:
				xct = -2;
				while (xct <= 2) {
					zct = -2;
					while (zct <= 2) {
						//if (Math.abs(xct) + Math.abs(zct)) <= 3) {
						if (((Math.abs(xct) + Math.abs(zct))%2)==0) {//sum is is an even number
							if ((Math.abs(xct) != 2) && (Math.abs(zct) != 2)) {
								ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
								if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 2) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
									world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
								}
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				
				yy = y + 2; //Fruit layer:
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if (Math.abs(xct) + Math.abs(zct) <= 3) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 3) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
								world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				
				yy = y + 3; //Fruit layer:
				xct = -4;
				while (xct <= 4) {
					zct = -4;
					while (zct <= 4) {
						if (Math.abs(xct) + Math.abs(zct) <= 4) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							if ((Math.random() > 0.85) && (Math.abs(xct) + Math.abs(zct) == 4) && (world.isAirBlock(new BlockPos(x + xct, yy - 1, z + zct))) && (world.getBlockState(new BlockPos(x + xct, yy, z + zct)).getBlock() == BlockArtocarpusLeaves.block)) {
									world.setBlockState(new BlockPos(x + xct, yy - 1, z + zct), BlockArtocarpusFruitBlock.block.getDefaultState(), 3);
								}
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 4;
				xct = -4;
				while (xct <= 4) {
					zct = -4;
					while (zct <= 4) {
						if (Math.abs(xct) + Math.abs(zct) <= 4) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 5;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if (Math.abs(xct) + Math.abs(zct) <= 3) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}

				yy = y + 6;
				xct = -2;
				while (xct <= 2) {
					zct = -2;
					while (zct <= 2) {
						if (Math.abs(xct) + Math.abs(zct) <= 2) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockArtocarpusLeaves.block);
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				
			}

		}
	}
}