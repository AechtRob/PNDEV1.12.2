package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAlbertiaLeaves;
import net.lepidodendron.block.BlockAlbertiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAlbertia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAlbertia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAlbertia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAlbertia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAlbertia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAlbertia!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenAlbertia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		
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
			TrunkHeight = 8 + (int) Math.round((Math.random() * 5D));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAlbertiaLog.block, EnumFacing.NORTH);

				if (counter >= 1 + world.rand.nextInt(2)) {
					if (counter <= TrunkHeight - 3) {
						//Do branches:
						if (((float)(TrunkHeight-counter))%3F == 0) {
							StandardBranches(world, x, y, z, counter);
						}
					}
					else if (counter == TrunkHeight - 1) {
						//Do top stuff:
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockAlbertiaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockAlbertiaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockAlbertiaLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockAlbertiaLog.block, EnumFacing.UP);

						for (int xx = -3; xx <= 3; xx++) {
							for (int zz = -3; zz <= 3; zz++) {
								if (Math.abs(xx) + Math.abs(zz) <= 3) {
									ProcedureTreeLeaf.executeProcedure(x + xx, y + counter, z + zz, world, BlockAlbertiaLeaves.block);
								}
							}
						}

						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 1, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 2, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 1, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 2, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z + 1, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z - 1, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 2, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 2, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z, world, BlockAlbertiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 3, z, world, BlockAlbertiaLeaves.block);


					}
				}
				counter = counter + 1;
				}

			}
	}

	public static void StandardBranches(World world, int x, int y, int z, int counter) {
		int offsetter = 0;
		//South
		offsetter = world.rand.nextInt(2);
		ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockAlbertiaLog.block, EnumFacing.EAST);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockAlbertiaLeaves.block);

		//North
		offsetter = world.rand.nextInt(2);
		ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockAlbertiaLog.block, EnumFacing.EAST);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockAlbertiaLeaves.block);

		//West
		offsetter = world.rand.nextInt(2);
		ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockAlbertiaLog.block, EnumFacing.UP);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);

		//East
		offsetter = world.rand.nextInt(2);
		ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockAlbertiaLog.block, EnumFacing.UP);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockAlbertiaLeaves.block);


	}
			
}