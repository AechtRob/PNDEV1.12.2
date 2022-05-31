package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockFurculaLeaves;
import net.lepidodendron.block.BlockFurculaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenFurcula extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenFurcula(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenFurcula!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenFurcula!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenFurcula!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenFurcula!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		Random rand = new Random();
		double TrunkHeight = 0;
		int counter = 0;
		int bendDirection = 0;
		int xNew = x;
		int zNew = z;
		EnumFacing facing = EnumFacing.EAST;
		EnumFacing BranchDirection = EnumFacing.NORTH;

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
			TrunkHeight = rand.nextInt(3) + 3;

			boolean north = false;
			boolean south = false;
			boolean east = false;
			boolean west = false;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, y + counter, z, world, BlockFurculaLog.block, EnumFacing.NORTH);
				counter += 1;
			}
			if (TrunkHeight >= 4) {
				if (rand.nextInt(3) == 0) {
					largeVar(world, x, y + counter, z);
				}
				else {
					smallVar(world, x, y + counter, z);
				}
			}
			else {
				smallVar(world, x, y + counter, z);
			}
		}	
	}

	public static void largeVar(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 2, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 2, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y - 1, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y - 1, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 2, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 2, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 3, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 3, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 3, z + 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 3, z - 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 4, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 4, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 4, z + 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 4, z - 1, world, BlockFurculaLeaves.block);
	}

	public static void smallVar(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 2, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 2, z, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 2, z + 1, world, BlockFurculaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 2, z - 1, world, BlockFurculaLeaves.block);
	}

}