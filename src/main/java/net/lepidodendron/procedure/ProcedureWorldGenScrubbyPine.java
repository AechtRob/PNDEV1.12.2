package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockScrubbyPineLeaves;
import net.lepidodendron.block.BlockScrubbyPineLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenScrubbyPine extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenScrubbyPine(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenScrubbyPine!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenScrubbyPine!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenScrubbyPine!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenScrubbyPine!");
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
			TrunkHeight = (double) (12);
			if (Math.random() >= 0.35) {
				TrunkHeight = TrunkHeight + Math.round((Math.random() * 100) / 5);
			}
			else {
				TrunkHeight = TrunkHeight + Math.round((Math.random() * 100) / 7);
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			xx = x;
			zz = z;
				
			randomiser = Math.random();
			
			while (counter <= TrunkHeight + 2 + Math.floor(2 * randomiser)) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
					//Add leaves, but not always:
					if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) (xx + 1), (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
					}
					if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) (xx - 1), (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
					}
					if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz + 1), world, BlockScrubbyPineLeaves.block);
					}
					if (((Math.random() > 0.2) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz - 1), world, BlockScrubbyPineLeaves.block);
					}
					counter = counter + 1;
				}
			//A last few leaves on the top:
			ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
			if (Math.random() > 0.5) {
				ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter + 1), (int) zz, world, BlockScrubbyPineLeaves.block);
			}


			//Top layer, a bit random....
			yy = y + (int)counter - 2;
			if (Math.random() > 0.85) {
				//North
				ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockScrubbyPineLeaves.block, 1, 0.3);
			}
			if (Math.random() > 0.85) {
				//South
				ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockScrubbyPineLeaves.block, 1, 0.3);
			}
			if (Math.random() > 0.85) {
				//East
				ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
			}
			if (Math.random() > 0.85) {
				//West
				ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
			}

			yy = y + (int)counter - 3;
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0);
			yy = yy - 1;
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.2);

			yy = yy - 1;

			int yyy = 0;
			int upright = 0;
			Random rand = new Random();

			while (yy > (Math.round((double)TrunkHeight * 0.38) + y)) {
				boolean branch = false;
				//Try north:
				if (Math.random() > 0.66) {
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
					ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockScrubbyPineLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockScrubbyPineLeaves.block, 1, 0.2);
					ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockScrubbyPineLog.block, EnumFacing.EAST);
					upright = rand.nextInt(2);
					yyy = 1;
					while (yyy <= upright) {
						ProcedureTreeLog.executeProcedure(x, yy + yyy, z - 2, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
						ProcedureLeavesAroundLog.executeProcedure(x, yy + yyy, z - 2, world, BlockScrubbyPineLeaves.block, 1, 0.2);
						yyy = yyy + 1;
					}
					branch = true;
				}

				//Try south:
				if (Math.random() > 0.66) {
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
					ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockScrubbyPineLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockScrubbyPineLeaves.block, 1, 0.2);
					ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockScrubbyPineLog.block, EnumFacing.EAST);
					upright = rand.nextInt(2);
					yyy = 1;
					while (yyy <= upright) {
						ProcedureTreeLog.executeProcedure(x, yy + yyy, z + 2, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
						ProcedureLeavesAroundLog.executeProcedure(x, yy + yyy, z + 2, world, BlockScrubbyPineLeaves.block, 1, 0.2);
						yyy = yyy + 1;
					}
					branch = true;
				}

				//Try east:
				if (Math.random() > 0.66) {
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
					ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.2);
					ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
					upright = rand.nextInt(2);
					yyy = 1;
					while (yyy <= upright) {
						ProcedureTreeLog.executeProcedure(x + 2, yy + yyy, z, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
						ProcedureLeavesAroundLog.executeProcedure(x + 2, yy + yyy, z, world, BlockScrubbyPineLeaves.block, 1, 0.2);
						yyy = yyy + 1;
					}
					branch = true;
				}

				//Try west:
				if (Math.random() > 0.66) {
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.3);
					ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockScrubbyPineLeaves.block, 1, 0.2);
					ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockScrubbyPineLog.block, EnumFacing.UP);
					upright = rand.nextInt(2);
					yyy = 1;
					while (yyy <= upright) {
						ProcedureTreeLog.executeProcedure(x - 2, yy + yyy, z, world, BlockScrubbyPineLog.block, EnumFacing.NORTH);
						ProcedureLeavesAroundLog.executeProcedure(x - 2, yy + yyy, z, world, BlockScrubbyPineLeaves.block, 1, 0.2);
						yyy = yyy + 1;
					}
					branch = true;
				}

				if (!branch) {
					yy = yy - 1;
				}
				else {
					yy = yy - 2 - (int) Math.round((Math.random() * 2D));
				}

			}
			
			counter = TrunkHeight;
			//Scatter some leaves around the main trunk top:
			while (counter >= TrunkHeight - 2) {
				if (Math.random() > 0.7) {
						xx = x - 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z - 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z + 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLeaves.block);
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

			
			while (counter >= TrunkHeight / 3) {
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
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.UP);
						xx = xx + 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.UP);
						xx = xx + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenScrubbyPineBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.UP);
						xx = xx - 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.UP);
						xx = xx - 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenScrubbyPineBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x;
					zz = z - 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
						zz = zz - 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
						zz = zz - 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenScrubbyPineBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x;
					zz = z + 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
						zz = zz + 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockScrubbyPineLog.block, EnumFacing.WEST);
						zz = zz + 1;
					}
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenScrubbyPineBranchSouth.executeProcedure($_dependencies);
				}
				
				//Skip 1 to three rows and then trigger next branch
				counter = counter - Math.round(Math.random() * 2);
			}
			

	}
}