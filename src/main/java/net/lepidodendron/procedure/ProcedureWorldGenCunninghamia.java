package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockCunninghamiaLeaves;
import net.lepidodendron.block.BlockCunninghamiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCunninghamia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCunninghamia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCunninghamia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCunninghamia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCunninghamia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCunninghamia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double counterbase = 0;
		int xct;
		int zct;
		
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
			TrunkHeight = 10 + (Math.random() * 20);
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}

			counter = 0;

			//Buttressed:
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockCunninghamiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockCunninghamiaLog.block, EnumFacing.NORTH);

			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter), z, world, BlockCunninghamiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 1), z, world, BlockCunninghamiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 2), z, world, BlockCunninghamiaLeaves.block);
			
			counterbase = Math.round(Math.random() * 3D) + Math.round(Math.random() * 3D);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 2), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 2), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 4), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 4), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 2), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 2), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 2, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 4), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 4), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);

			
			if (TrunkHeight > 14) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 6), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 6), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 16) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 8), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 8), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 18) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 10), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 10), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 20) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 12), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 12), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 12), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 12), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 22) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 14), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 14), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 14), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 14), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 24) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 16), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 16), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 16), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 16), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 26) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 18), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 18), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 18), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 18), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 28) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 20), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 20), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 20), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 20), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 30) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 22), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 22), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 22), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 22), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 32) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 24), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 24), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 24), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 24), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 34) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 26), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 26), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 26), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 26), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 36) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 28), (int) z + 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 28), (int) z - 1, world, BlockCunninghamiaLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 28), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 28), (int) z, world, BlockCunninghamiaLog.block, EnumFacing.UP);
			}
			
			counter = 0;
			//Easy, neat and tidy design in 5 variant layers:
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.2)) {
				//Add in random emptier layers:
				int radius = 3;
				if (Math.random() > 0.7) {
					radius = radius - (int)Math.round(Math.random() * (double)radius);
				}
				yy = y + (int) counter + (int) counterbase;
				xct = -radius;
				while (xct <= radius) {
					zct = -radius;
					while (zct <= radius) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 5) {
							if (Math.random() * radius > 0 && Math.random() > 0.7) {
								ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockCunninghamiaLeaves.block, 1, 0.2);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.4)) {
				yy = y + (int) counter + (int) counterbase;
				//Add in random emptier layers:
				int radius = 3;
				if (Math.random() > 0.7) {
					radius = radius - (int)Math.round(Math.random() * (double)radius);
				}
				xct = -radius;
				while (xct <= radius) {
					zct = -radius;
					while (zct <= radius) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 4) {
							if (Math.random() * radius > 0 && Math.random() > 0.7) {
								ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockCunninghamiaLeaves.block, 1, 0.2);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.6)) {
				yy = y + (int) counter + (int) counterbase;
				//Add in random emptier layers:
				int radius = 3;
				if (Math.random() > 0.7) {
					radius = radius - (int)Math.round(Math.random() * (double)radius);
				}
				xct = -radius;
				while (xct <= radius) {
					zct = -radius;
					while (zct <= radius) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 3) {
							if (Math.random() * radius > 0 && Math.random() > 0.7) {
								ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockCunninghamiaLeaves.block, 1, 0.2);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.8)) {
				yy = y + (int) counter + (int) counterbase;
				//Add in random emptier layers:
				int radius = 3;
				if (Math.random() > 0.7) {
					radius = radius - (int)Math.round(Math.random() * (double)radius);
				}
				xct = -radius;
				while (xct <= radius) {
					zct = -radius;
					while (zct <= radius) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 2) {
							if (Math.random() * radius > 0 && Math.random() > 0.7) {
								ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockCunninghamiaLeaves.block, 1, 0.2);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) (TrunkHeight - counterbase)) {
				yy = y + (int) counter + (int) counterbase;
				//Add in random emptier layers:
				int radius = 3;
				if (Math.random() > 0.7) {
					radius = radius - (int)Math.round(Math.random() * (double)radius);
				}
				xct = -radius;
				while (xct <= radius) {
					zct = -radius;
					while (zct <= radius) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 1) {
							if (Math.random() * radius > 0 && Math.random() > 0.7) {
								ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockCunninghamiaLeaves.block, 1, 0.2);
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

			//Podzol replacement in a configurable  circle:
			int podzolRadius = LepidodendronConfigPlants.podzolCunninghamia;
			if (podzolRadius < 0) podzolRadius = 0;
			if (podzolRadius > 16) podzolRadius = 16;
			
			if (podzolRadius > 0) {

				int yct = -2;
				while (yct <= 1) {
					xct = -(podzolRadius -1);
					while (xct <= podzolRadius) {
						zct = -podzolRadius;
						while (zct <= (podzolRadius-1)) {

							if (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) podzolRadius, 2)) {
								if (world.canSeeSky(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct))) {
									if ((world.isAirBlock(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct))) 
									&& ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getBlock() != Blocks.DIRT.getStateFromMeta(2).getBlock())
									&& (((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GROUND) || ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GRASS))
									) {
										world.setBlockState(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct), Blocks.DIRT.getStateFromMeta(2), 3);
									}
								}
								else {
									if ((((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GROUND) || ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GRASS))) {
										{
											BlockPos _bp = new BlockPos((int) x + xct, (int) y + yct, (int) z + zct);
											IBlockState _bs = Blocks.DIRT.getStateFromMeta(2);
											world.setBlockState(_bp, _bs, 3);
										}
									}
								}
							}
							zct = zct + 1;
						}
						xct = xct + 1;
					}	
					yct = yct + 1;
				}
			}
		}
			
	}
}