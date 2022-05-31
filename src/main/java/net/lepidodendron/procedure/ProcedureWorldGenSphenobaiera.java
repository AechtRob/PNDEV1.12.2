package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSphenobaieraLeaves;
import net.lepidodendron.block.BlockSphenobaieraLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSphenobaiera extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSphenobaiera(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenSphenobaiera!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenSphenobaiera!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenSphenobaiera!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenSphenobaiera!");
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
			TrunkHeight = rand.nextInt(4) + 4;

			boolean north = false;
			boolean south = false;
			boolean east = false;
			boolean west = false;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, y + counter, z, world, BlockSphenobaieraLog.block, EnumFacing.NORTH);
				if (counter >= TrunkHeight - (rand.nextInt(2) + 1) && counter >= 2) {
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
						(!(BranchDirection == EnumFacing.NORTH && north))
						&& (!(BranchDirection == EnumFacing.SOUTH && south))
						&& (!(BranchDirection == EnumFacing.EAST && east))
						&& (!(BranchDirection == EnumFacing.WEST && west))
					) {
						AddBranch(world, x, y + counter, z, BranchDirection, TrunkHeight - counter);
					}
					if (BranchDirection == EnumFacing.NORTH) {
						north = true;
					}
					if (BranchDirection == EnumFacing.SOUTH) {
						south = true;
					}
					if (BranchDirection == EnumFacing.EAST) {
						east = true;
					}
					if (BranchDirection == EnumFacing.WEST) {
						west = true;
					}

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
						(!(BranchDirection == EnumFacing.NORTH && north))
						&& (!(BranchDirection == EnumFacing.SOUTH && south))
						&& (!(BranchDirection == EnumFacing.EAST && east))
						&& (!(BranchDirection == EnumFacing.WEST && west))
					) {
						AddBranch(world, x, y + counter - 1, z, BranchDirection, TrunkHeight - counter);
					}
					if (BranchDirection == EnumFacing.NORTH) {
						north = true;
					}
					if (BranchDirection == EnumFacing.SOUTH) {
						south = true;
					}
					if (BranchDirection == EnumFacing.EAST) {
						east = true;
					}
					if (BranchDirection == EnumFacing.WEST) {
						west = true;
					}
				}
				counter += 1;
			}
			AddLeaves(world, x, y + counter - 1, z, EnumFacing.NORTH);
			AddLeaves(world, x, y + counter - 1, z, EnumFacing.SOUTH);
			AddLeaves(world, x, y + counter - 1, z, EnumFacing.EAST);
			AddLeaves(world, x, y + counter - 1, z, EnumFacing.WEST);
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

		//Branch can be 1-3 blocks "tall" unless it's very near the top:

		BranchHeight = rand.nextInt(3) + 1;
		while (counter < BranchHeight) {
			if (counter >= BranchHeight - 2) {
				facingA = EnumFacing.NORTH; //Logs face up at the ends of the branches
			}
			ProcedureTreeLog.executeProcedure(xNew, y + counter, zNew, world, BlockSphenobaieraLog.block, facingA);
			//chance of surrounding leaves
			if (Math.random() > 0.65) {
				if (Math.random() > 0.33) {
					ProcedureLeavesAroundLog.executeProcedure(xNew, y + counter, zNew, world, BlockSphenobaieraLeaves.block, 1, 0);
				}
				else {
					AddLeaves(world, xNew, y + counter, zNew, facing);
				}
			}

			xNew = xNew + xBranchoffset;
			zNew = zNew + zBranchoffset;
			counter += 1;
		}

		xNew = xNew - xBranchoffset;
		zNew = zNew - zBranchoffset;
		counter -= 1;

		AddLeaves(world, xNew, y + counter, zNew, facing);
	}

	public static void AddLeaves(World world, int x, int y, int z, EnumFacing facing) {
		Random rand = new Random();
		int LeafType = rand.nextInt(3);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockSphenobaieraLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockSphenobaieraLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockSphenobaieraLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockSphenobaieraLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockSphenobaieraLeaves.block);

		if (facing == EnumFacing.NORTH) {
			ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockSphenobaieraLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockSphenobaieraLeaves.block);
		}

		if (facing == EnumFacing.SOUTH) {
			ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockSphenobaieraLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockSphenobaieraLeaves.block);
		}

		if (facing == EnumFacing.EAST) {
			ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockSphenobaieraLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockSphenobaieraLeaves.block);
		}

		if (facing == EnumFacing.WEST) {
			ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockSphenobaieraLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockSphenobaieraLeaves.block);
		}

	}
}