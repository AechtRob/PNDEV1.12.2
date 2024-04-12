package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockMonkeyPuzzleAraucariaLeaves;
import net.lepidodendron.block.BlockMonkeyPuzzleAraucariaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMonkeyPuzzleAraucaria extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMonkeyPuzzleAraucaria(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenMonkeyPuzzleAraucaria!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenMonkeyPuzzleAraucaria!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenMonkeyPuzzleAraucaria!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenMonkeyPuzzleAraucaria!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenMonkeyPuzzleAraucaria!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		int CrownRadius = 0;
		int Joint = 0;
		int i;
		int ii;
		int j;

		//System.err.println("canSeeSky " + world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)));

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
			TrunkHeight = 22 + (int) Math.round(Math.random() * 12D) + (int) (Math.random() * 8D);
			if (Math.random() < 0.2) {
				TrunkHeight = (int) Math.round(((double) TrunkHeight * 1.25D));
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			setLeaves(world, x, y + TrunkHeight, z);

			CrownRadius = 7 + (int) Math.round(Math.random() * 4D);

			//NSEW branches:
			//North:
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			Joint = Math.max(3, (int) Math.round(Math.random() * (double) CrownRadius));
			while (i <= CrownRadius) {
				if (i >= Joint) {
					ProcedureTreeLog.executeProcedure(x, y + TrunkHeight - ii + 1, z - i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				}
				else {
					ProcedureTreeLog.executeProcedure(x, y + TrunkHeight - ii, z - i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				}
				ProcedureLeavesAroundLog.executeProcedure(x, y + TrunkHeight - ii + 1, z - i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
			}
			i = i - 1;
			setLeaves(world, x, y + TrunkHeight - ii + 1, z - i);

			//South:
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			Joint = Math.max(3, (int) Math.round(Math.random() * (double) CrownRadius));
			while (i <= CrownRadius) {
				if (i >= Joint) {
					ProcedureTreeLog.executeProcedure(x, y + TrunkHeight - ii + 1, z + i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				}
				else {
					ProcedureTreeLog.executeProcedure(x, y + TrunkHeight - ii, z + i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				}
				ProcedureLeavesAroundLog.executeProcedure(x, y + TrunkHeight - ii + 1, z + i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
			}
			i = i - 1;
			setLeaves(world, x, y + TrunkHeight - ii + 1, z + i);

			//East:
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			Joint = Math.max(3, (int) Math.round(Math.random() * (double) CrownRadius));
			while (i <= CrownRadius) {
				if (i >= Joint) {
					ProcedureTreeLog.executeProcedure(x + i, y + TrunkHeight - ii + 1, z, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				}
				else {
					ProcedureTreeLog.executeProcedure(x + i, y + TrunkHeight - ii, z, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(x + i, y + TrunkHeight - ii + 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
			}
			i = i - 1;
			setLeaves(world, x + i, y + TrunkHeight - ii + 1, z);

			//West:
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			Joint = Math.max(3, (int) Math.round(Math.random() * (double) CrownRadius));
			while (i <= CrownRadius) {
				if (i >= Joint) {
					ProcedureTreeLog.executeProcedure(x - i, y + TrunkHeight - ii + 1, z, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				}
				else {
					ProcedureTreeLog.executeProcedure(x - i, y + TrunkHeight - ii, z, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(x - i, y + TrunkHeight - ii + 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
			}
			i = i - 1;
			setLeaves(world, x - i, y + TrunkHeight - ii + 1, z);

			//Lower diagonal branches:
			//North-East: (log faces north)
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius,2)) {
				if (Math.random() > 0.78) {
					ii = ii + 1;
				}
				ProcedureTreeLog.executeProcedure(x + j, y + TrunkHeight - ii, z - i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(x + j, y + TrunkHeight - ii, z - i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.45) {
					i = i - 1;
				}
				if (Math.random() > 0.45) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x + j, y + TrunkHeight - ii, z - i);

			//South-West: (log faces north)
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius,2)) {
				if (Math.random() > 0.78) {
					ii = ii + 1;
				}
				ProcedureTreeLog.executeProcedure(x - j, y + TrunkHeight - ii, z + i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(x - j, y + TrunkHeight - ii, z + i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.45) {
					i = i - 1;
				}
				if (Math.random() > 0.45) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x - j, y + TrunkHeight - ii, z + i);

			//North-West: (log faces east)
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius,2)) {
				if (Math.random() > 0.78) {
					ii = ii + 1;
				}
				ProcedureTreeLog.executeProcedure(x - i, y + TrunkHeight - ii, z - j, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - i, y + TrunkHeight - ii, z - j, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.45) {
					i = i - 1;
				}
				if (Math.random() > 0.45) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x - i, y + TrunkHeight - ii, z - j);

			//South-East: (log faces east)
			i = 1;
			ii = (int) Math.round(Math.random() * 6D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius,2)) {
				if (Math.random() > 0.78) {
					ii = ii + 1;
				}
				ProcedureTreeLog.executeProcedure(x + i, y + TrunkHeight - ii, z + j, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + i, y + TrunkHeight - ii, z + j, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.45) {
					i = i - 1;
				}
				if (Math.random() > 0.45) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x + i, y + TrunkHeight - ii, z + j);


			//Upper diagonal branches:
			//North-East: (log faces east)
			i = 1;
			ii = (int) Math.round(Math.random() * 3D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius-1-(Math.random()* 2),2)) {
					if (Math.random() > 0.55) {
					ii = ii - 1;
				}
				ProcedureTreeLog.executeProcedure(x + j, y + TrunkHeight - ii, z - i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + j, y + TrunkHeight - ii, z - i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.65) {
					i = i - 1;
				}
				if (Math.random() > 0.65) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x + j, y + TrunkHeight - ii, z - i);

			//South-West: (log faces east)
			i = 1;
			ii = (int) Math.round(Math.random() * 3D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius-1-(Math.random()* 2),2)) {
				if (Math.random() > 0.55) {
					ii = ii - 1;
				}
				ProcedureTreeLog.executeProcedure(x - j, y + TrunkHeight - ii, z + i, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - j, y + TrunkHeight - ii, z + i, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.65) {
					i = i - 1;
				}
				if (Math.random() > 0.65) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x - j, y + TrunkHeight - ii, z + i);

			//North-West: (log faces north)
			i = 1;
			ii = (int) Math.round(Math.random() * 3D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius-1-(Math.random()* 2),2)) {
				if (Math.random() > 0.55) {
					ii = ii - 1;
				}
				ProcedureTreeLog.executeProcedure(x - i, y + TrunkHeight - ii, z - j, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(x - i, y + TrunkHeight - ii, z - j, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.65) {
					i = i - 1;
				}
				if (Math.random() > 0.65) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x - i, y + TrunkHeight - ii, z - j);

			//South-East: (log faces north)
			i = 1;
			ii = (int) Math.round(Math.random() * 3D); //attachmenmt height
			j = 0;
			while (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(CrownRadius-1-(Math.random()* 2),2)) {
				if (Math.random() > 0.55) {
					ii = ii - 1;
				}
				ProcedureTreeLog.executeProcedure(x + i, y + TrunkHeight - ii, z + j, world, BlockMonkeyPuzzleAraucariaLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(x + i, y + TrunkHeight - ii, z + j, world, BlockMonkeyPuzzleAraucariaLeaves.block, 1, 0.96);
				i += 1;
				j += 1;
				if (Math.random() > 0.65) {
					i = i - 1;
				}
				if (Math.random() > 0.65) {
					j = j - 1;
				}
			}
			i = i - 1;
			j = j - 1;
			setLeaves(world, x + i, y + TrunkHeight - ii, z + j);
		}
	}

	public static void setLeaves(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z - 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z + 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z - 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z + 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 2, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 2, world, BlockMonkeyPuzzleAraucariaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 1, world, BlockMonkeyPuzzleAraucariaLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y + 2, z, world, BlockMonkeyPuzzleAraucariaLeaves.block);

		if (Math.random() > 0.7) {
			ProcedureLeavesAroundLog.executeProcedure(x, y, z, world, BlockMonkeyPuzzleAraucariaLeaves.block, 2, 0.3);
		}

	}
}