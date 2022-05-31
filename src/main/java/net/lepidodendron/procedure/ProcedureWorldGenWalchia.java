package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockWalchiaLeaves;
import net.lepidodendron.block.BlockWalchiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenWalchia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenWalchia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenWalchia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenWalchia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenWalchia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenWalchia!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenWalchia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		double randomiser = 0;
		int branchlength;
		int branchcount;
		int direction = 0;
		int direction2 = 0;
		int direction3 = 0;
		
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
			TrunkHeight = 15;
			if (Math.random()>0.3) {
				TrunkHeight = TrunkHeight + (int) Math.round((Math.random() * 15));
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockWalchiaLog.block, EnumFacing.NORTH);

				if ((counter > 3) && (double) (((double) counter - 1)/3) == Math.round(((counter - 1)/3))) {
					//System.err.println((double) (((double) counter - 1)/3) + "==" + Math.round(((counter - 1)/3)));
					//Branch point:
					if (counter < (double) TrunkHeight/3) {
						//Lower branches:
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 2, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 3, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z + 3, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, y + counter, z - 2, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 3, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z - 3, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, y + counter, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, y + counter - 1, z, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, y + counter, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, y + counter - 1, z, world, BlockWalchiaLeaves.block);


						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z + 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z - 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z + 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z - 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z - 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z - 1, world, BlockWalchiaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z - 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z - 1, world, BlockWalchiaLeaves.block);

					}
					else {
						//Upper branches:
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z + 2, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockWalchiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 2, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z - 2, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter - 1, z, world, BlockWalchiaLeaves.block);

						ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockWalchiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter - 1, z, world, BlockWalchiaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z - 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z + 1, world, BlockWalchiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z - 1, world, BlockWalchiaLeaves.block);

					}
					
				}
				counter = counter + 1;
				}

				ProcedureTreeLeaf.executeProcedure(x + 1, y + TrunkHeight, z, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + TrunkHeight, z, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z + 1, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z - 1, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 1, z, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 2, z, world, BlockWalchiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 3, z, world, BlockWalchiaLeaves.block);

				ProcedureSpawnAnkyropteris.executeProcedure(x, y, z, world, LepidodendronConfig.genAnkyropterisWalchia, SaplingSpawn);
			
			}
	}
			
}