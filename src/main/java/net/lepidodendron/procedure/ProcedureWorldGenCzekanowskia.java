package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCzekanowskiaLeaves;
import net.lepidodendron.block.BlockCzekanowskiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCzekanowskia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCzekanowskia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCzekanowskia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCzekanowskia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCzekanowskia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCzekanowskia!");
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
		int bending = rand.nextInt(4);
		if (bending == 1) {BranchDirection = EnumFacing.SOUTH;}
		if (bending == 2) {BranchDirection = EnumFacing.EAST;}
		if (bending == 3) {BranchDirection = EnumFacing.WEST;}

		bending = rand.nextInt(2); //Reset this to use below

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
			TrunkHeight = rand.nextInt(5) + 4;
			if (bending == 1) {
				bendDirection = rand.nextInt(4);
				//A more secure root-like base to support the bend:
				ProcedureTreeLog.executeProcedure(x + 1, y, z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x - 1, y, z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, y, z + 1, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, y, z - 1, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
					if (counter > 0) {
						if (bendDirection == 0) { //North
							zNew = zNew - 1;
							facing = EnumFacing.EAST;
						}
						if (bendDirection == 1) { //South
							zNew = zNew + 1;
							facing = EnumFacing.EAST;
						}
						if (bendDirection == 2) { //East
							xNew = xNew + 1;
							facing = EnumFacing.UP;
						}
						if (bendDirection == 3) { //West
							xNew = xNew - 1;
							facing = EnumFacing.UP;
						}
						ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLog.block, facing);
					}

					if (counter >= TrunkHeight - 5) {//Top five layers have high chance of branches;
						if (BranchDirection == EnumFacing.NORTH) {
							BranchDirection = EnumFacing.EAST;
						}
						else {
							if (BranchDirection == EnumFacing.EAST) {
								BranchDirection = EnumFacing.SOUTH;
							}
							else {
								if (BranchDirection == EnumFacing.SOUTH) {
									BranchDirection = EnumFacing.WEST;
								} else {
									if (BranchDirection == EnumFacing.WEST) {
										BranchDirection = EnumFacing.NORTH;
									}
								}
							}
						}
						if (
							!(bendDirection == 0 && BranchDirection == EnumFacing.NORTH) &&
							!(bendDirection == 1 && BranchDirection == EnumFacing.SOUTH) &&
							!(bendDirection == 2 && BranchDirection == EnumFacing.EAST) &&
							!(bendDirection == 3 && BranchDirection == EnumFacing.WEST)
						) { //Dont add a branch in the same way the tree slants
							AddBranch(world, xNew, y + counter, zNew, BranchDirection, TrunkHeight - counter);
						}
					}
					counter += 1;
				}
				//Final leaves:
				if (bendDirection == 0) {BranchDirection = EnumFacing.NORTH;}
				if (bendDirection == 1) {BranchDirection = EnumFacing.SOUTH;}
				if (bendDirection == 2) {BranchDirection = EnumFacing.EAST;}
				if (bendDirection == 3) {BranchDirection = EnumFacing.WEST;}
				AddLeaves(world, xNew, y + counter - 1, zNew, BranchDirection);
			}
			else { //straight tree
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure(x, y + counter, z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);

					if (counter >= TrunkHeight - 5) { //Top five layers have high chance of branches;
						if (BranchDirection == EnumFacing.NORTH) {
							BranchDirection = EnumFacing.EAST;
						}
						else {
							if (BranchDirection == EnumFacing.EAST) {
								BranchDirection = EnumFacing.SOUTH;
							}
							else {
								if (BranchDirection == EnumFacing.SOUTH) {
									BranchDirection = EnumFacing.WEST;
								} else {
									if (BranchDirection == EnumFacing.WEST) {
										BranchDirection = EnumFacing.NORTH;
									}
								}
							}
						}
						AddBranch(world, x, y + counter, z, BranchDirection, TrunkHeight - counter);
					}
					counter += 1;
				}
			}
		}	
	}

	public static void AddBranch(World world, int x, int y, int z, EnumFacing facing, double TrunkHeight) {
		EnumFacing facingA = EnumFacing.UP;
		EnumFacing facingB = EnumFacing.EAST;
		EnumFacing leavesFacing;
		Random rand = new Random();
		int counter = 0;
		int BranchHeight;
		int xBranchoffset = 0;
		int zBranchoffset = 0;
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) { //North/South adjust the branches
			facingA = EnumFacing.EAST;
			facingB = EnumFacing.UP;
		}

		if (facing == EnumFacing.NORTH) {zBranchoffset = -1;}
		if (facing == EnumFacing.SOUTH) {zBranchoffset = 1;}
		if (facing == EnumFacing.EAST) {xBranchoffset = 1;}
		if (facing == EnumFacing.WEST) {xBranchoffset = -1;}

		int xNew = x + xBranchoffset;
		int zNew = z + zBranchoffset;

		//Branch can be 2-5 blocks "tall" unless it's very near the top:
		if (TrunkHeight <= 2) {
			BranchHeight = rand.nextInt(2) + 1;
		}
		else {
			BranchHeight = rand.nextInt(3) + 2;
		}
		while (counter <= BranchHeight) {
			if (counter >= BranchHeight - 1) {
				facingA = EnumFacing.NORTH; //Logs face up at the end sof the branches
			}
			ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingA);
			//Tiny chance of surrounding leaves on a branch nub
			if (Math.random() > 0.92) {
				if (Math.random() > 0.5) {
					ProcedureLeavesAroundLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLeaves.block, 1, 0);
				}
				else { //A little branch here
					if (Math.random() > 0.5) { //one side of the branch
						if (facingB == EnumFacing.UP) {
							ProcedureTreeLog.executeProcedure(xNew + 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
							AddLeaves(world, xNew + 1, y + counter, zNew, EnumFacing.EAST);
						}
						else {
							ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew + 1, world, BlockCzekanowskiaLog.block, facingB);
							AddLeaves(world, xNew, y + counter, zNew + 1, EnumFacing.SOUTH);
						}
					}
					else { //the other side of the branch
						if (facingB == EnumFacing.UP) {
							ProcedureTreeLog.executeProcedure(xNew - 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
							AddLeaves(world, xNew - 1, y + counter, zNew, EnumFacing.WEST);
						}
						else {
							ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew - 1, world, BlockCzekanowskiaLog.block, facingB);
							AddLeaves(world, xNew, y + counter, zNew - 1, EnumFacing.NORTH);
						}
					}
				}
			}
			if (counter == 0 && Math.random() > 0.66) {
				//Sometimes extend out the first section:
				xNew = xNew + xBranchoffset;
				zNew = zNew + zBranchoffset;
				ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingA);
				//Tiny chance of surrounding leaves on a branch nub
				if (Math.random() > 0.92) {
					if (Math.random() > 0.5) {
						ProcedureLeavesAroundLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLeaves.block, 1, 0);
					}
					else { //A little branch here
						if (Math.random() > 0.5) { //one side of the branch
							if (facingB == EnumFacing.UP) {
								ProcedureTreeLog.executeProcedure(xNew + 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
								AddLeaves(world, xNew + 1, y + counter, zNew, EnumFacing.EAST);
							}
							else {
								ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew + 1, world, BlockCzekanowskiaLog.block, facingB);
								AddLeaves(world, xNew, y + counter, zNew + 1, EnumFacing.SOUTH);
							}
						}
						else { //the other side of the branch
							if (facingB == EnumFacing.UP) {
								ProcedureTreeLog.executeProcedure(xNew - 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
								AddLeaves(world, xNew - 1, y + counter, zNew, EnumFacing.WEST);
							}
							else {
								ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew - 1, world, BlockCzekanowskiaLog.block, facingB);
								AddLeaves(world, xNew, y + counter, zNew - 1, EnumFacing.NORTH);
							}
						}
					}
				}
			}
			if (counter != 0 && counter <= (BranchHeight-1) && facingA == EnumFacing.NORTH && Math.random() > 0.66) {
				//Sometimes go up two blocks:
				counter += 1;
				ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
			}
			xNew = xNew + xBranchoffset;
			zNew = zNew + zBranchoffset;
			counter += 1;
		}

		xNew = xNew - xBranchoffset;
		zNew = zNew - zBranchoffset;
		counter -= 1;

		//Branch end small chance of a three-pronged end:
		if (rand.nextInt(4) == 0) {
			//Extended end:
			ProcedureTreeLog.executeProcedure(xNew, y + counter + 1, zNew, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(xNew, y + counter + 2, zNew, world, BlockCzekanowskiaLeaves.block);

			//End:
			ProcedureTreeLog.executeProcedure(xNew + xBranchoffset, y + counter, zNew + zBranchoffset, world, BlockCzekanowskiaLog.block, facingA);
			AddLeaves(world, xNew + xBranchoffset, y + counter, zNew + zBranchoffset, facing);

			//Sides:
			if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
				ProcedureTreeLog.executeProcedure(xNew + 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
				AddLeaves(world, xNew + 1, y + counter, zNew, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure(xNew - 1, y + counter, zNew, world, BlockCzekanowskiaLog.block, facingB);
				AddLeaves(world, xNew - 1, y + counter, zNew, EnumFacing.WEST);
			}
			if (facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
				ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew - 1, world, BlockCzekanowskiaLog.block, facingB);
				AddLeaves(world, xNew, y + counter, zNew - 1, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew + 1, world, BlockCzekanowskiaLog.block, facingB);
				AddLeaves(world, xNew, y + counter, zNew + 1, EnumFacing.SOUTH);
			}
		}
		else { //Simple end:
			AddLeaves(world, xNew, y + counter, zNew, facing);
		}
	}

	public static void AddLeaves(World world, int x, int y, int z, EnumFacing facing) {
		Random rand = new Random();
		int LeafType = rand.nextInt(3);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockCzekanowskiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockCzekanowskiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockCzekanowskiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockCzekanowskiaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockCzekanowskiaLeaves.block);

		if (facing == EnumFacing.NORTH) {
			ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 2, z - 1, world, BlockCzekanowskiaLeaves.block);
			if (LeafType == 0) { //Longer ones:
				ProcedureTreeLeaf.executeProcedure(x, y - 3, z - 1, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y - 1, z, world, BlockCzekanowskiaLeaves.block);
			}
		}

		if (facing == EnumFacing.SOUTH) {
			ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 2, z + 1, world, BlockCzekanowskiaLeaves.block);
			if (LeafType == 0) { //Longer ones:
				ProcedureTreeLeaf.executeProcedure(x, y - 3, z + 1, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
			}
		}

		if (facing == EnumFacing.EAST) {
			ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y - 2, z, world, BlockCzekanowskiaLeaves.block);
			if (LeafType == 0) { //Longer ones:
				ProcedureTreeLeaf.executeProcedure(x + 1, y - 3, z, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockCzekanowskiaLeaves.block);
			}
		}

		if (facing == EnumFacing.WEST) {
			ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockCzekanowskiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y - 2, z, world, BlockCzekanowskiaLeaves.block);
			if (LeafType == 0) { //Longer ones:
				ProcedureTreeLeaf.executeProcedure(x - 1, y - 3, z, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockCzekanowskiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockCzekanowskiaLeaves.block);
			}
		}

	}
}