package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTallAraucariaLeaves;
import net.lepidodendron.block.BlockTallAraucariaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTallAraucaria extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTallAraucaria(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTallAraucaria!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTallAraucaria!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTallAraucaria!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTallAraucaria!");
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
		Random random = new Random();
		double counterext = 0;
		double randomiser = 0;
		String BranchAxis = "";
		double layer = 0;
		double branchskip = 0;
		boolean try2 = false;
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z))
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 30 + (int) (Math.random() * 15) + (int) (Math.random() * 15) + (int) (Math.random() * 15);
			if (Math.random() < 0.4) { //Add a variation in how we calculate the trunk and also allow to be very tall sometimes:
				TrunkHeight = 40 + (int) Math.round((Math.random() * 110D) / 2D);
			}

			int fat = 1;
			double topE = TrunkHeight;
			double topSE = TrunkHeight;
			double topS = TrunkHeight;
			double topW = TrunkHeight;
			double topNW = TrunkHeight;
			double topN = TrunkHeight;
			double topSW = TrunkHeight;
			double topNE = TrunkHeight;
			if (TrunkHeight > 35) {
				fat = 2;
				topE = (int) ((double) TrunkHeight * 0.66) + random.nextInt(4);
				topSE = (int) ((double) TrunkHeight * 0.66) + random.nextInt(4);
				topS = (int) ((double) TrunkHeight * 0.66) + random.nextInt(4);
			};
			if (TrunkHeight > 55) {
				fat = 3;
				topE = (int) ((double) TrunkHeight * 0.5) + random.nextInt(4);
				topSE = (int) ((double) TrunkHeight * 0.5) + random.nextInt(4);
				topS = (int) ((double) TrunkHeight * 0.5) + random.nextInt(4);

				topW = (int) ((double) TrunkHeight * 0.66) + random.nextInt(5);
				topNW = (int) ((double) TrunkHeight * 0.66) + random.nextInt(5);
				topN = (int) ((double) TrunkHeight * 0.66) + random.nextInt(5);
				topSW = (int) ((double) TrunkHeight * 0.66) + random.nextInt(5);
				topNE = (int) ((double) TrunkHeight * 0.66) + random.nextInt(5);
			};

			if (fat == 3) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 1), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 1), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 1), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);

				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 2), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 2), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 2), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 2), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y - 2), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			}
			else if (fat == 2) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);

				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 2), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) (z + 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				if (fat == 3) {
					if (counter <= topE) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topSE) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topS) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}

					if (counter <= topW) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topNW) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topN) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topSW) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topNE) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
				}
				else if (fat == 2) {
					if (counter <= topE) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topSE) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
					if (counter <= topS) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					}
				}
				counter = counter + 1;
			}

			xx = x;
			zz = z;
				
			randomiser = Math.random();

			//A last few leaves on the top:
			ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter), (int) zz, world, BlockTallAraucariaLeaves.block);
			if (Math.random() > 0.5) {
				ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter + 1), (int) zz, world, BlockTallAraucariaLeaves.block);
			}

			counter = TrunkHeight;
			//Scatter some leaves around the main trunk top:
			while (counter >= TrunkHeight - 2) {
				if (Math.random() > 0.7) {
						xx = x - 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockTallAraucariaLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockTallAraucariaLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z - 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockTallAraucariaLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z + 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockTallAraucariaLeaves.block);
				}
				
				counter = counter - 1;
				}
			}

			counter = TrunkHeight;

			//Generate branches:
			//We spiral round the tree, skipping one to two rows each time, picking a random point of attachment and adding 0-2 nubs of branch before the main end:
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

			
			while (counter >= TrunkHeight / 2.5) {
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
					//Instead of randomly adding the extenders, they are propotional to the distance from the top:
					//But also kind of bulge out in the top 4/5 of the tree
					
					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenTallAraucariaBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					yy = (int) (y + counter);
					zz = z;

					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						xx = xx - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenTallAraucariaBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x;
					yy = (int) (y + counter);
					zz = z - 1;
					
					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz - 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz - 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenTallAraucariaBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x;
					yy = (int) (y + counter);
					zz = z + 1;
					randomiser = 0;
					while (randomiser < Math.ceil((TrunkHeight-counter)/(TrunkHeight/5))) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz + 1;
						randomiser = randomiser + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y+1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					if (counter > (TrunkHeight *  0.85) && counter < (TrunkHeight *  0.96) && Math.random() > 0.25F) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTallAraucariaLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure(xx, (int) yy, zz, world, BlockTallAraucariaLeaves.block, 1, 0.6);
						zz = zz + 1;
						if (Math.random() > 0.1) yy = yy - 1;
						if (yy < (y + 1)) yy = y + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) yy);
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenTallAraucariaBranchSouth.executeProcedure($_dependencies);
				}
				
				//Skip 0 to 1 rows and then trigger next branch
				counter = counter - Math.round(Math.random() * 1);
				if (counter < TrunkHeight * 0.8) {
					counter = counter - 1;
				}if (counter < TrunkHeight * 0.6) {
					counter = counter - 1;
				}
			}
			
			
	}
}