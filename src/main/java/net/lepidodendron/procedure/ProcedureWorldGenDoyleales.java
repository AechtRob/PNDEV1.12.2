package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDoylealesLeaves;
import net.lepidodendron.block.BlockDoylealesLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDoyleales extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDoyleales(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDoyleales!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDoyleales!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDoyleales!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDoyleales!");
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
			TrunkHeight = rand.nextInt(2) + 7;
			if (world.rand.nextInt(5) == 0) {
				TrunkHeight = rand.nextInt(6) + 8;
			}
			int branchOffsetter = world.rand.nextInt(2);

			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.NORTH);
				if (counter <= TrunkHeight - 2
						&& (counter == 3 + branchOffsetter || counter == 6 + branchOffsetter || counter == 9 + branchOffsetter)) {
					//Add branches:
					ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockDoylealesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + counter, z - 2, world, BlockDoylealesLog.block, EnumFacing.EAST);
					AddLeaves(world, x, y + counter, z - 2);

					ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockDoylealesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + counter, z + 2, world, BlockDoylealesLog.block, EnumFacing.EAST);
					AddLeaves(world, x, y + counter, z + 2);

					ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 2, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					AddLeaves(world, x - 2, y + counter, z);

					ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					AddLeaves(world, x + 2, y + counter, z);
				}
				if (counter == TrunkHeight - 1) {
					//Add branches:
					ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockDoylealesLog.block, EnumFacing.EAST);
					AddLeaves(world, x, y + counter, z - 1);

					ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockDoylealesLog.block, EnumFacing.EAST);
					AddLeaves(world, x, y + counter, z + 1);

					ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					AddLeaves(world, x - 1, y + counter, z);

					ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockDoylealesLog.block, EnumFacing.UP);
					AddLeaves(world, x + 1, y + counter, z);
				}
				if (counter >= 3 + branchOffsetter) {
					ProcedureLeavesAroundLog.executeProcedure(x, y + counter, z, world, BlockDoylealesLeaves.block, 1, 0.95);
				}
				counter += 1;
			}
			AddLeaves(world, x, y + counter - 1, z);
		}	
	}

	public static void AddLeaves(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockDoylealesLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockDoylealesLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockDoylealesLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockDoylealesLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockDoylealesLeaves.block);
	}
}