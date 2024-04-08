package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockElatocladusLeaves;
import net.lepidodendron.block.BlockElatocladusLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenElatocladus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenElatocladus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenElatocladus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenElatocladus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenElatocladus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenElatocladus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
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
			TrunkHeight = (double) (16);
			if (Math.random() >= 0.75) {
				TrunkHeight = TrunkHeight + Math.round((Math.random() * 70) / 4);
			}
			else if (Math.random() >= 0.70) {
				TrunkHeight = TrunkHeight + Math.round((Math.random() * 34));
			}
			else {
				TrunkHeight = TrunkHeight + Math.round((Math.random() * 70) / 7);
			}

			counter = 0;
			int branchgap = 1;
			int branchdir = world.rand.nextInt(4);

			boolean branched = false;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockElatocladusLog.block, EnumFacing.NORTH);

				//Do the branches:
				if (counter > 5) {
					if (world.rand.nextInt(8) != 0) {
						branched = true;
					}
					if (branched) {
						branchgap = branchgap - 1;
						if (branchgap <= 0) {
							//Which layer are we at?
							int layerdepth = (int) Math.round((TrunkHeight - 5D) / 4D);
							int layer = 0;
							if ((counter - 5) >= (layerdepth)) {
								layer = 1;
							}
							if ((counter - 5) >= (layerdepth * 2)) {
								layer = 2;
							}
							if ((counter - 5) >= (layerdepth * 3)) {
								layer = 3;
							}
							switch (layer) {
								case 0: default:
									branchLayer0(world, branchdir, x, (int) (y + counter), z);
									rareLeaves(world, x, (int) (y + counter), z);
									break;

								case 1:
									branchLayer1(world, branchdir, x, (int) (y + counter), z);
									rareLeaves(world, x, (int) (y + counter), z);
									break;

								case 2:
									branchLayer2(world, branchdir, x, (int) (y + counter), z);
									rareLeaves(world, x, (int) (y + counter), z);
									break;

								case 3:
									if (counter <= TrunkHeight - 2) {
										branchLayer3(world, branchdir, x, (int) (y + counter), z);
										rareLeaves(world, x, (int) (y + counter), z);
										rareLeaves(world, x, (int) (y + counter), z);
									}
									else {
										branchLayer4(world, branchdir, x, (int) (y + counter), z);
										rareLeaves(world, x, (int) (y + counter), z);
										rareLeaves(world, x, (int) (y + counter), z);
									}
									break;
							}
							branchgap = world.rand.nextInt(2) + 1;
							branchdir = branchdir + 1;
							if (branchdir >= 4) {
								branchdir = 0;
							}
						}
					}
				}
				counter = counter + 1;
			}
			//Top-knot:
			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter), z, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, (int) (y + counter), z, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, (int) (y + counter), z, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter), z + 1, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter), z - 1, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter + 1), z, world, BlockElatocladusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter + 2), z, world, BlockElatocladusLeaves.block);
		}
	}

	public static void branchLayer0(World world, int branchdir, int x, int y, int z) {
		int xx;
		int yy;
		int zz;
		switch (branchdir) {
			case 0: default: //north
				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				xx = x;
				yy = y - 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z - 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				break;

			case 1: //east
				zz = z;
				yy = y;
				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				zz = z;
				yy = y - 1;
				xx = x + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x + 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				break;

			case 2: //south
				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				xx = x;
				yy = y - 1;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z + 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				break;

			case 3: //west
				zz = z;
				yy = y;
				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				zz = z;
				yy = y - 1;
				xx = x - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x - 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				break;
		}
	}

	public static void branchLayer1(World world, int branchdir, int x, int y, int z) {
		int xx;
		int yy;
		int zz;
		switch (branchdir) {
			case 0: default: //north
				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				xx = x;
				yy = y - 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				break;

			case 1: //east
				zz = z;
				yy = y;
				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				zz = z;
				yy = y - 1;
				xx = x + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				break;

			case 2: //south
				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				xx = x + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				xx = x;
				yy = y - 1;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				break;

			case 3: //west
				zz = z;
				yy = y;
				xx = x - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				zz = z;
				yy = y - 1;
				xx = x - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				break;
		}
	}

	public static void branchLayer2(World world, int branchdir, int x, int y, int z) {
		int xx;
		int yy;
		int zz;
		switch (branchdir) {
			case 0: default: //north
				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				break;

			case 1: //east
				xx = x + 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				xx = x + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				break;

			case 2: //south
				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				xx = x - 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				break;

			case 3: //west
				xx = x - 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				xx = x - 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				break;
		}
	}

	public static void branchLayer3(World world, int branchdir, int x, int y, int z) {
		int xx;
		int yy;
		int zz;
		switch (branchdir) {
			case 0: default: //north
				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z - 2;
				yy = y + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				break;

			case 1: //east
				xx = x + 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x + 2;
				yy = y + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				break;

			case 2: //south
				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);

				zz = z + 2;
				yy = y + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				break;

			case 3: //west
				xx = x - 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);

				xx = x - 2;
				yy = y + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				break;
		}
	}

	public static void branchLayer4(World world, int branchdir, int x, int y, int z) {
		int xx;
		int yy;
		int zz;
		switch (branchdir) {
			case 0: default: //north
				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesNorth(world, xx, yy, zz);

				break;

			case 1: //east
				xx = x + 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesEast(world, xx, yy, zz);

				break;

			case 2: //south
				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.EAST);
				leavesSouth(world, xx, yy, zz);

				break;

			case 3: //west
				xx = x - 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockElatocladusLog.block, EnumFacing.UP);
				leavesWest(world, xx, yy, zz);

				break;
		}
	}

	public static void leavesNorth(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockElatocladusLeaves.block);
	}

	public static void leavesEast(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockElatocladusLeaves.block);
	}

	public static void leavesSouth(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockElatocladusLeaves.block);
	}

	public static void leavesWest(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockElatocladusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockElatocladusLeaves.block);
	}

	public static void rareLeaves(World world, int x, int y, int z) {
		if (world.rand.nextInt(24) == 0) {
			ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockElatocladusLeaves.block);
		}
		if (world.rand.nextInt(24) == 0) {
			ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockElatocladusLeaves.block);
		}
		if (world.rand.nextInt(24) == 0) {
			ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockElatocladusLeaves.block);
		}
		if (world.rand.nextInt(24) == 0) {
			ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockElatocladusLeaves.block);
		}
	}



}