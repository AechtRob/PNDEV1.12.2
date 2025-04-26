package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockUllmanniaLeaves;
import net.lepidodendron.block.BlockUllmanniaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenUllmannia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenUllmannia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenUllmannia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenUllmannia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenUllmannia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenUllmannia!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenUllmannia!");
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
			TrunkHeight = 14 + (int) Math.round((Math.random() * 12));

			counter = 0;
			int firstbranches = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockUllmanniaLog.block, EnumFacing.NORTH);

				if (counter >= ((float)(TrunkHeight) * 0.45F)) {
					if (counter < TrunkHeight - 3) {
						//Do branches:
						if (((float)counter)%3F == 0) {
							StandardBranches(world, x, y, z, counter);
							if (firstbranches == 0) {
								firstbranches = counter;
							}
						}
					}
					else if (counter == TrunkHeight - 3) {
						//Do top stuff:
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);

						ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z + 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z + 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, y + counter, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, y + counter, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z - 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z - 1, world, BlockUllmanniaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 3, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 3, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, y + counter, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, y + counter, z, world, BlockUllmanniaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter - 1, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter - 1, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z - 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z + 1, world, BlockUllmanniaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + 1, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + 1, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 3, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 3, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z - 2, world, BlockUllmanniaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 2, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 2, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 3, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 2, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 2, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 3, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z + 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 3, z + 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z - 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z - 2, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 3, z - 2, world, BlockUllmanniaLeaves.block);

						ProcedureTreeLeaf.executeProcedure(x, y + counter + 4, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 4, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 4, z, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 4, z + 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 4, z - 1, world, BlockUllmanniaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 5, z, world, BlockUllmanniaLeaves.block);

					}
				}
				counter = counter + 1;
				}

				if (firstbranches > 0) {
					//Do the bottom whorl:
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z + 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z - 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x + 1, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 1, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z + 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z - 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x + 2, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 2, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z + 3, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + firstbranches - 4, z - 3, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x + 3, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 3, y + firstbranches - 4, z, world, BlockUllmanniaLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure(x - 1, y + firstbranches - 4, z + 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x - 2, y + firstbranches - 4, z + 2, world, BlockUllmanniaLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure(x + 1, y + firstbranches - 4, z + 1, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, y + firstbranches - 4, z + 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure(x + 1, y + firstbranches - 4, z - 1, world, BlockUllmanniaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, y + firstbranches - 4, z - 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure(x - 1, y + firstbranches - 4, z - 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x - 2, y + firstbranches - 4, z - 2, world, BlockUllmanniaLog.block, EnumFacing.UP);

					//Leaves
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4, z - 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4, z - 5, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z - 5, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z - 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 2, z - 3, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4, z + 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4, z + 5, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z + 5, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z + 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 1, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + firstbranches - 4 + 2, z + 3, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x - 4, y + firstbranches - 4, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 5, y + firstbranches - 4, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 5, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4 + 2, z, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x + 4, y + firstbranches - 4, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 5, y + firstbranches - 4, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 5, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4 + 1, z, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4 + 2, z, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x - 1, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z - 2, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z - 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z + 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z + 2, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z + 2, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z + 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z - 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z - 2, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x - 1, y + firstbranches - 4, z - 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z - 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, y + firstbranches - 4, z + 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4, z + 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + firstbranches - 4, z - 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z - 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + firstbranches - 4, z + 4, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4, z + 4, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x - 4, y + firstbranches - 4, z - 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 4, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 4, y + firstbranches - 4, z - 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 4, y + firstbranches - 4, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 4, y + firstbranches - 4, z + 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 4, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 4, y + firstbranches - 4, z + 1, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 4, y + firstbranches - 4, z + 3, world, BlockUllmanniaLeaves.block);

					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4 + 1, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4 + 1, z + 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, y + firstbranches - 4 + 1, z - 3, world, BlockUllmanniaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, y + firstbranches - 4 + 1, z - 3, world, BlockUllmanniaLeaves.block);


				}

			ProcedureSpawnGigantopteridClimbing.executeProcedure(x, y, z, world, LepidodendronConfigPlants.genGigantopteridClimbingUllmannia, SaplingSpawn);

			}
	}

	public static void StandardBranches(World world, int x, int y, int z, int counter) {
		ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
		ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockUllmanniaLog.block, EnumFacing.EAST);
		ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
		ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
		ProcedureTreeLog.executeProcedure(x, y + counter, z + 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);
		ProcedureTreeLog.executeProcedure(x, y + counter, z - 2, world, BlockUllmanniaLog.block, EnumFacing.EAST);
		ProcedureTreeLog.executeProcedure(x + 2, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);
		ProcedureTreeLog.executeProcedure(x - 2, y + counter, z, world, BlockUllmanniaLog.block, EnumFacing.UP);

		ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 3, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z + 1, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z + 1, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 3, y + counter, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 3, y + counter, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 3, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z - 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter, z - 1, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter, z - 1, world, BlockUllmanniaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 4, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 4, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 4, y + counter, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 4, y + counter, z, world, BlockUllmanniaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x - 4, y + counter + 1, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 4, y + counter + 1, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 4, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 4, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z + 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z - 2, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z - 2, world, BlockUllmanniaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z - 1, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + counter - 1, z - 1, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + counter - 1, z, world, BlockUllmanniaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + counter - 1, z, world, BlockUllmanniaLeaves.block);

	}
			
}