package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAbiesLeaves;
import net.lepidodendron.block.BlockAbiesLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAbies extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAbies(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAbies!");
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
		double counterext = 0;
		double randomiser = 4;
		String BranchAxis = "";
		double layer = 0;
		double branchskip = 0;
		boolean try2 = false;
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		Material material1 = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))).getMaterial();
		Material material2= world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getMaterial();
		Material material3 = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
				&& material != Material.GRASS
				&& material != Material.GROUND
				&& material != Material.GLASS
				&& material != Material.IRON
				&& material != Material.ROCK
				&& material != Material.SAND
				&& material != Material.WOOD
				&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
				&& material1 != Material.GRASS
				&& material1 != Material.GROUND
				&& material1 != Material.GLASS
				&& material1 != Material.IRON
				&& material1 != Material.ROCK
				&& material1 != Material.SAND
				&& material1 != Material.WOOD
				&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
				&& material2 != Material.GRASS
				&& material2 != Material.GROUND
				&& material2 != Material.GLASS
				&& material2 != Material.IRON
				&& material2 != Material.ROCK
				&& material2 != Material.SAND
				&& material2 != Material.WOOD
				&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
				&& material3 != Material.GRASS
				&& material3 != Material.GROUND
				&& material3 != Material.GLASS
				&& material3 != Material.IRON
				&& material3 != Material.ROCK
				&& material3 != Material.SAND
				&& material3 != Material.WOOD
		) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));


			//Trunk:
			TrunkHeight = 24 + (Math.random() * 8) + (Math.random() * 8);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAbiesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			xx = x;
			zz = z;
				
			randomiser = Math.random();
			
			while (counter <= TrunkHeight + 2 + Math.floor(2 * randomiser)) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.NORTH);
				//Add leaves, but not always:
				if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
					ProcedureTreeLeaf.executeProcedure((int) (xx), (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				counter = counter + 1;
			}
			//A last few leaves on the top:
			ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
			if (Math.random() > 0.5) {
				ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter + 1), (int) zz, world, BlockAbiesLeaves.block);
			}

			counter = TrunkHeight;
			//Scatter some leaves around the main trunk top:
			while (counter >= TrunkHeight - 2) {
				if (Math.random() > 0.7) {
						xx = x - 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z - 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z + 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				
				counter = counter - 1;
				}
			}

			//Generate branches:
			//We spiral round the tree, skipping one to three rows each time, picking a random point of attachment and adding 0-2 nubs of branch before the main end:
			//Pick a direction to start:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				BranchAxis = "north";
				}
				else {
					if (randomiser >= 0.5) {
						BranchAxis = "east";
				}
					else {
						if (randomiser >= 0.25) {
						 	BranchAxis = "south";
					}
						else {
							BranchAxis = "west";
						}
					}
				}

			int bareTrunk = 9 + world.rand.nextInt(8);
			
			while (counter >= bareTrunk) {
				//rotate to the next axis
				if (BranchAxis == "north") {
					BranchAxis = "east";
				}
				else {
					if (BranchAxis == "east") {
					BranchAxis = "south";
					}
					else {
						if (BranchAxis == "south") {
						BranchAxis = "west";
					}
						else {
							BranchAxis = "north";
						}
					}
				}

							
				//Get our attachment position:
				if (BranchAxis == "east") {
					xx = x + 1;
					yy = (int) (y + counter);
					zz = z;
					//Instead of randomly adding the extenders, they are proporional to the distance from the top:
					//randomiser = Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 4;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockAbiesLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockAbiesLog.block, EnumFacing.EAST);
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 2, world, BlockAbiesLog.block, EnumFacing.EAST);
							Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz + 2);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchSouth.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockAbiesLog.block, EnumFacing.EAST);
							$_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz - 1);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchNorth.executeProcedure($_dependencies);
						}

						xx = xx + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					yy = (int) (y + counter);
					zz = z;

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 4;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockAbiesLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockAbiesLog.block, EnumFacing.EAST);
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 2, world, BlockAbiesLog.block, EnumFacing.EAST);
							Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz + 2);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchSouth.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockAbiesLog.block, EnumFacing.EAST);
							$_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz - 1);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchNorth.executeProcedure($_dependencies);
						}

						xx = xx - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}

					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x;
					yy = (int) (y + counter);
					zz = z - 1;

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 4;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockAbiesLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) xx + 2, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx + 2);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchEast.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							$_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx - 1);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchWest.executeProcedure($_dependencies);
						}

						zz = zz - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x;
					yy = (int) (y + counter);
					zz = z + 1;

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 4;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockAbiesLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) xx + 2, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx + 2);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchEast.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
							$_dependencies = new Object2ObjectOpenHashMap<>();
							$_dependencies.put("x", xx - 1);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenAbiesBranchWest.executeProcedure($_dependencies);
						}

						zz = zz + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchSouth.executeProcedure($_dependencies);
				}
				
				//Skip 1 to three rows and then trigger next branch
				//if (world.rand.nextInt(2) == 0) {
					counter = counter - Math.round(Math.random());
				//}
				//else {
				//	counter = counter - Math.round(Math.random() * 2);
				//}
			}
			
			
	}
}