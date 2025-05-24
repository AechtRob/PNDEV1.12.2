package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSchilderiaLeaves;
import net.lepidodendron.block.BlockSchilderiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSchilderia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSchilderia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenWoodworthia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenWoodworthia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenWoodworthia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenWoodworthia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int BareTrunk = 0;
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

			ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 3), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 4), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 5), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 6), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 7), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);
			createUpright(world, x, (int) (y + 8), (int) z);

			BlockPos pos = doBaseBranch(world, x, y, z, EnumFacing.NORTH);
			createUpright(world, pos.getX(), pos.getY(), pos.getZ());
			pos = doBaseBranch(world, x, y, z, EnumFacing.EAST);
			createUpright(world, pos.getX(), pos.getY(), pos.getZ());
			pos = doBaseBranch(world, x, y, z, EnumFacing.SOUTH);
			createUpright(world, pos.getX(), pos.getY(), pos.getZ());
			pos = doBaseBranch(world, x, y, z, EnumFacing.WEST);
			createUpright(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	public static BlockPos doBaseBranch(World world, int x, int y, int z, EnumFacing facing) {
		BlockPos pos = new BlockPos(x, y, z);
		EnumFacing logAxis = EnumFacing.EAST;
		if (facing == EnumFacing.WEST || facing == EnumFacing.EAST) {
			logAxis = EnumFacing.UP;
		}
		
		//Prefer the basal ones sligtly:
		if (world.rand.nextInt(3) != 0) {
			//two options:
			if (world.rand.nextBoolean()) {
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY(), pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 1, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, logAxis);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 1, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 1, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 3).getX(), pos.offset(facing).getY() + 2, pos.offset(facing, 3).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				return new BlockPos(pos.offset(facing, 3).up(3));
			}
			else {
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 1, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 2, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, logAxis);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 3, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 3).getX(), pos.offset(facing).getY() + 4, pos.offset(facing, 3).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 4).getX(), pos.offset(facing).getY() + 5, pos.offset(facing, 4).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				return new BlockPos(pos.offset(facing, 4).up(6));
			}
		}
		else {
			//two options:
			if (world.rand.nextBoolean()) {
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 3, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 4, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, logAxis);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 5, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 6, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 3).getX(), pos.offset(facing).getY() + 7, pos.offset(facing, 3).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				return new BlockPos(pos.offset(facing, 3).up(8));
			}
			else {
				ProcedureTreeLog.executeProcedure(pos.offset(facing).getX(), pos.offset(facing).getY() + 5, pos.offset(facing).getZ(), world, BlockSchilderiaLog.block, logAxis);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 6, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 2).getX(), pos.offset(facing).getY() + 7, pos.offset(facing, 2).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(pos.offset(facing, 3).getX(), pos.offset(facing).getY() + 8, pos.offset(facing, 3).getZ(), world, BlockSchilderiaLog.block, EnumFacing.NORTH);
				return new BlockPos(pos.offset(facing, 3).up(9));
			}
		}

	}

	public static void createUpright(World world, int x, int y, int z) {
		//Trunk:
		int TrunkHeight = (int)(6 + world.rand.nextInt(4) + world.rand.nextInt(4));
		int BareTrunk = (int)((double)TrunkHeight * 0.625) + world.rand.nextInt(2);
		int counter = 0;
		while (counter <= TrunkHeight) {
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockSchilderiaLog.block, EnumFacing.NORTH);

			if (counter >= 1 + world.rand.nextInt(2)) {
				if (counter <= TrunkHeight - 3 && counter >= BareTrunk) {
					//Do branches:
					if (((float)(TrunkHeight - counter ))%3F == 0) {
						int isBottom = 0;
						if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.775) {
							isBottom = 1;
						}
						if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.475) {
							isBottom = 2;
						}
						StandardBranches(world, x, y, z, counter, isBottom);
					}
				}
				else if (counter == TrunkHeight - 1) {
					//Do top stuff:
					ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);

					for (int xx = -3; xx <= 3; xx++) {
						for (int zz = -3; zz <= 3; zz++) {
							if (Math.abs(xx) + Math.abs(zz) <= 3) {
								ProcedureTreeLeaf.executeProcedure(x + xx, y + counter, z + zz, world, BlockSchilderiaLeaves.block);
							}
						}
					}

					ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 1, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 2, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 1, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 2, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z + 1, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z - 1, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 2, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 2, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z, world, BlockSchilderiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, y + counter + 3, z, world, BlockSchilderiaLeaves.block);

				}
			}
			counter = counter + 1;
		}

	}

	public static void StandardBranches(World world, int xx, int yy, int zz, int counter, int isBottom) {

		int offsetter = 0;
		//South
		int x = xx;
		int y = yy;
		int z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			z = zz + 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			z = zz + 2;
		}
		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			x = xx - 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			x = xx + 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockSchilderiaLeaves.block);
		}

		//North
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			z = zz - 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			z = zz - 2;
		}

		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			x = xx - 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);

			x = xx + 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockSchilderiaLeaves.block);
		}

		//West
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			x = xx - 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			x = xx - 2;
		}

		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			z = zz - 1;
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			z = zz + 1;
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
		}
		else {
            ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
            ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
            ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
        }

		//East
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			x = xx + 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			x = xx + 2;
		}
		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			z = zz - 1;
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			z = zz + 1;
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockSchilderiaLeaves.block);
		}

	}
			
}