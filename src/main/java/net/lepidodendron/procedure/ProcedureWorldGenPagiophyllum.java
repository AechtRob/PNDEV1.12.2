package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPagiophyllumLeaves;
import net.lepidodendron.block.BlockPagiophyllumLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPagiophyllum extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPagiophyllum(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPagiophyllum!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPagiophyllum!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPagiophyllum!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPagiophyllum!");
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
		double randomiser = 0;
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
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockPagiophyllumLog.block, EnumFacing.NORTH);


			//Trunk:
			TrunkHeight = 24 + (Math.random() * 8) + (Math.random() * 8);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
				if (counter < TrunkHeight * 0.90D) {
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
				}
				if (counter >= TrunkHeight * 0.90D && counter < TrunkHeight - 2) {
					ProcedureTreeLeaf.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockPagiophyllumLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockPagiophyllumLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockPagiophyllumLeaves.block);
				}
				counter = counter + 1;
			}

			xx = x;
			zz = z;
				
			randomiser = Math.random();
			
			while (counter <= TrunkHeight + 2 + Math.floor(2 * randomiser)) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.NORTH);
				//Add leaves, but not always:
				if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
					ProcedureTreeLeaf.executeProcedure((int) (xx + 1), (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
					ProcedureTreeLeaf.executeProcedure((int) (xx - 1), (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
					ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz + 1), world, BlockPagiophyllumLeaves.block);
				}
				if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
					ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz - 1), world, BlockPagiophyllumLeaves.block);
				}
				counter = counter + 1;
			}
			//A last few leaves on the top:
			ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
			if (Math.random() > 0.5) {
				ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter + 1), (int) zz, world, BlockPagiophyllumLeaves.block);
			}

			counter = TrunkHeight;
			//Scatter some leaves around the main trunk top:
			while (counter >= TrunkHeight - 2) {
				if (Math.random() > 0.7) {
						xx = x - 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z - 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z + 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockPagiophyllumLeaves.block);
				}
				
				counter = counter - 1;
				}
			}

			//Generate branches:
			//We spiral round the tree, skipping one to three rows each time, picking a random point of attachment and adding 0-2 nubs of branch befor the main end:
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

			
			while (counter >= 0) {
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
					xx = x + 2;
					yy = (int) (y + counter);
					zz = z - world.rand.nextInt(2);
					//Instead of randomly adding the extenders, they are proporional to the distance from the top:
					//randomiser = Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockPagiophyllumLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 2, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz + 2);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchSouth.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							$_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz - 1);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchNorth.executeProcedure($_dependencies);
						}

						xx = xx + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenPagiophyllumBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					yy = (int) (y + counter);
					zz = z - world.rand.nextInt(2);

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockPagiophyllumLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 1, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz + 2, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz + 2);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchSouth.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz - 1, world, BlockPagiophyllumLog.block, EnumFacing.EAST);
							$_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz - 1);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchNorth.executeProcedure($_dependencies);
						}

						xx = xx - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenPagiophyllumBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x + world.rand.nextInt(2);
					yy = (int) (y + counter);
					zz = z - 2;

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockPagiophyllumLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) xx + 2, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx + 2);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchEast.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							$_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx - 1);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchWest.executeProcedure($_dependencies);
						}

						zz = zz - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenPagiophyllumBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x + world.rand.nextInt(2);
					yy = (int) (y + counter);
					zz = z + 1;

					int siderandomiser = world.rand.nextInt(4);

					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/14))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockPagiophyllumLeaves.block, 1, 0.6);

						if (Math.ceil((TrunkHeight-counter)/(TrunkHeight/14)) >= 5 && randomiser == 3 + siderandomiser) {
							//Do side branches here too!
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) xx + 2, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx + 2);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchEast.executeProcedure($_dependencies);

							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) yy, (int) zz, world, BlockPagiophyllumLog.block, EnumFacing.UP);
							$_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", xx - 1);
							$_dependencies.put("y", (int) yy);
							$_dependencies.put("z", zz);
							$_dependencies.put("world", world);
							ProcedureWorldGenPagiophyllumBranchWest.executeProcedure($_dependencies);
						}

						zz = zz + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenPagiophyllumBranchSouth.executeProcedure($_dependencies);
				}
				
				//Skip 1 to three rows and then trigger next branch
				if (world.rand.nextInt(2) == 0) {
					counter = counter - Math.round(Math.random());
				}
				else {
					counter = counter - Math.round(Math.random() * 2);
				}
			}
			
			
	}
}