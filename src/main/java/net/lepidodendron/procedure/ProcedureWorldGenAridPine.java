package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAridPineLeaves;
import net.lepidodendron.block.BlockAridPineLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAridPine extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAridPine(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAridPine!");
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
			TrunkHeight = 8;
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter), z, world, BlockAridPineLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 1), z, world, BlockAridPineLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 2), z, world, BlockAridPineLeaves.block);

			counterbase = 0;
			if (Math.random() > 0.3) counterbase = 1;

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 2), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 2), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 4), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 4), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 2), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 2), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 2, world, BlockAridPineLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 4), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 4), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);


			if (TrunkHeight > 14) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 6), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 6), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 16) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 8), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 8), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 18) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z + 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z - 1, world, BlockAridPineLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 10), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 10), (int) z, world, BlockAridPineLog.block, EnumFacing.UP);
			}

			counter = 0;
			//Easy, neat and tidy design in 5 variant layers:
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.2)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 5) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockAridPineLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.4)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 4) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockAridPineLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.6)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 3) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockAridPineLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.8)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 2) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockAridPineLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) (TrunkHeight - counterbase)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 1) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockAridPineLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

		}
			
	}
}