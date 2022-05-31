package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPentoxylalesLeaves;
import net.lepidodendron.block.BlockPentoxylalesLeavesSeeds;
import net.lepidodendron.block.BlockPentoxylalesLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPentoxylales extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPentoxylales(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPentoxylales!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPentoxylales!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPentoxylales!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPentoxylales!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		double randomiser = 0;
		boolean log1 = false;
		boolean log2 = false;
		boolean log3 = false;
		BlockPos leafPos = null;
		
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

			//Which direction?
			randomiser = Math.random();
			if (randomiser >= 0.75) { //NORTH
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockPentoxylalesLog.block, EnumFacing.UP);
				//Log1:
				log1 = genStem(world, x, y, z + 1, EnumFacing.SOUTH, EnumFacing.SOUTH);
				//Log2:
				log2 = genStem(world, x + 1, y, z - 1, EnumFacing.NORTH, EnumFacing.EAST);
				//Log3
				log3 = genStem(world, x - 1, y, z - 1, EnumFacing.NORTH, EnumFacing.WEST);
			} else if (randomiser >= 0.50) { //SOUTH
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockPentoxylalesLog.block, EnumFacing.UP);
				//Log1:
				log1 = genStem(world, x, y, z - 1, EnumFacing.NORTH, EnumFacing.NORTH);
				//Log2:
				log2 = genStem(world, x + 1, y, z + 1, EnumFacing.SOUTH, EnumFacing.EAST);
				//Log3
				log3 = genStem(world, x - 1, y, z + 1, EnumFacing.SOUTH, EnumFacing.WEST);
			} else if (randomiser >= 0.25) { //EAST
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.WEST);
				//Log1:
				log1 = genStem(world, x - 1, y, z, EnumFacing.WEST, EnumFacing.WEST);
				//Log2:
				log2 = genStem(world, x + 1, y, z + 1, EnumFacing.EAST, EnumFacing.SOUTH);
				//Log3
				log3 = genStem(world, x + 1, y, z - 1, EnumFacing.EAST, EnumFacing.NORTH);
			} else { //WEST
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockPentoxylalesLog.block, EnumFacing.WEST);
				//Log1:
				log1 = genStem(world, x + 1, y, z, EnumFacing.EAST, EnumFacing.EAST);
				//Log2:
				log2 = genStem(world, x - 1, y, z + 1, EnumFacing.WEST, EnumFacing.SOUTH);
				//Log3
				log3 = genStem(world, x - 1, y, z - 1, EnumFacing.WEST, EnumFacing.NORTH);
			}

			if (!log1 && !log2 && log3) {
				//A single stem:
				TrunkHeight = 2 + (int) (Math.random() * 4);
				ProcedureTreeLog.executeProcedure(x , y, z, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
				counter = 1;
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure(x, y + counter, z, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
					leafPos = new BlockPos(x, y + counter, z);
					counter += 1;
				}
				if (TrunkHeight <=3) {
					placeLeavesSmall(world, leafPos);
				}
				else {
					placeLeavesLarge(world, leafPos);
				}
			}
		}
	}

	public static boolean genStem(World world, int x, int y, int z, EnumFacing facing1, EnumFacing facing2) {
		int TrunkHeight = 0;
		int counter = 0;
		BlockPos leafPos = null;
		if (facing1 == facing2 && Math.random() > 0.1) {
			int xx = x;
			int zz = z;
			TrunkHeight = 2 + (int) (Math.random() * 4);
			ProcedureTreeLog.executeProcedure(x , y, z, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
			counter = 1;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(xx, y + counter, zz, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
				leafPos = new BlockPos(xx, y + counter, zz);
				if (Math.random() > 0.58) {
					if (facing1 == EnumFacing.NORTH) {
						zz = zz - 1;
					}
					if (facing1 == EnumFacing.SOUTH) {
						zz = zz + 1;
					}
					if (facing1 == EnumFacing.EAST) {
						xx = xx + 1;
					}
					if (facing1 == EnumFacing.WEST) {
						zz = zz - 1;
					}
				}
				counter += 1;
			}
			if (TrunkHeight <=2) {
				placeLeavesSmall(world, leafPos);
			}
			else {
				placeLeavesLarge(world, leafPos);
			}
			return true;
		}
		else if (Math.random() > 0.1) { //Double trunks:
			int xx = x;
			int zz = z;
			TrunkHeight = 2 + (int) (Math.random() * 4);
			ProcedureTreeLog.executeProcedure(x , y, z, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
			counter = 1;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(xx, y + counter, zz, world, BlockPentoxylalesLog.block, EnumFacing.NORTH);
				leafPos = new BlockPos(xx, y + counter, zz);
				if (Math.random() > 0.68) {
					if (facing1 == EnumFacing.NORTH) {
						zz = zz - 1;
					}
					if (facing1 == EnumFacing.SOUTH) {
						zz = zz + 1;
					}
					if (facing1 == EnumFacing.EAST) {
						xx = xx + 1;
					}
					if (facing1 == EnumFacing.WEST) {
						zz = zz - 1;
					}
				}
				if (Math.random() > 0.75) {
					if (facing2 == EnumFacing.WEST) {
						xx = xx - 1;
					}
					if (facing2 == EnumFacing.EAST) {
						xx = xx + 1;
					}
					if (facing2 == EnumFacing.NORTH) {
						zz = zz - 1;
					}
					if (facing2 == EnumFacing.SOUTH) {
						zz = zz + 1;
					}
				}
				counter += 1;
			}
			if (TrunkHeight <=2) {
				placeLeavesSmall(world, leafPos);
			}
			else {
				placeLeavesLarge(world, leafPos);
			}
			return true;
		}
		return false;
	}

	public static void placeLeavesSmall(World world, BlockPos pos) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 2, z, world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 1, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 1, world, getLeaves());

	}


	public static void placeLeavesLarge(World world, BlockPos pos) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 2, z, world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 1, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 1, world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(x + 2, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x - 2, y + 1, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 2, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 2, world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(x + 2, y, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x - 2, y, z, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y, z + 2, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(x, y, z - 2, world, getLeaves());

	}
	
	public static Block getLeaves() {
		if (Math.random() > 0.825) {
			return BlockPentoxylalesLeavesSeeds.block;
		}
		return BlockPentoxylalesLeaves.block;
	}
	
}