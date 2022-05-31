package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTelemachusLeaves;
import net.lepidodendron.block.BlockTelemachusLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTelemachus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTelemachus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTelemachus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTelemachus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTelemachus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTelemachus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		Random rand = new Random();

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
			TrunkHeight = 10 + (int) Math.round(Math.random() * 6);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTelemachusLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Top parts:
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z, world, BlockTelemachusLeaves.block);
			if (rand.nextInt(2) == 0) {
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 2, (int) z, world, BlockTelemachusLeaves.block);
			}

			counter = counter - 1;

			while (counter > 1) {
				yy = y + counter;

				if (counter == TrunkHeight) {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
				}
				else if (counter == TrunkHeight - 2) {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy + 1, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy + 1, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 2, world, BlockTelemachusLeaves.block);
				}
				else if (counter == TrunkHeight - 4) {
					if (TrunkHeight >= 13) {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockTelemachusLeaves.block);
					}
					else {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
					}
				}
				else if (counter == TrunkHeight - 6 || counter == TrunkHeight - 8 || counter == TrunkHeight - 10 || counter == TrunkHeight - 12 || counter == TrunkHeight - 14)  {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockTelemachusLeaves.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockTelemachusLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockTelemachusLeaves.block);
				}
				else if (counter < 8) {
					//Random stuff:
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockTelemachusLeaves.block, 1, 0.65);
				}

				counter = counter - 1;
			}

		}
	}
}