package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCypressLeaves;
import net.lepidodendron.block.BlockCypressLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCypress extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCypress(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCypress!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCypress!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCypress!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCypress!");
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
			|| (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z)))
			|| (world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z)))
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 12 + (int) Math.round(Math.random() * 10);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockCypressLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Top parts:
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z, world, BlockCypressLeaves.block);
			if (rand.nextInt(2) == 0) {
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 2, (int) z, world, BlockCypressLeaves.block);
			}

			counter = counter - 1;

			while (counter > 1) {
				yy = y + counter;

				if (counter == TrunkHeight) {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
				}
				else if (counter == TrunkHeight - 2) {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy + 1, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy + 1, (int) z, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 2, world, BlockCypressLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 2, world, BlockCypressLeaves.block);
				}
				else if (counter == TrunkHeight - 4) {
					if (TrunkHeight >= 13) {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockCypressLeaves.block);
					}
					else {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
					}
				}
				else
					//if (counter == TrunkHeight - 6 || counter == TrunkHeight - 8 || counter == TrunkHeight - 10 || counter == TrunkHeight - 12 || counter == TrunkHeight - 14)
					if ((double)counter > ((double)TrunkHeight * 0.15D))
					{
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockCypressLeaves.block);
						}

						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockCypressLeaves.block);
						}
						if (rand.nextInt(20) != 0) {
							ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockCypressLeaves.block);
						}
				}

				counter = counter - 1;
			}

		}
	}
}