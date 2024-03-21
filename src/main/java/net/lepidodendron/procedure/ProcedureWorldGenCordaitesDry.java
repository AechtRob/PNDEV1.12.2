package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCordaitesDryLeaves;
import net.lepidodendron.block.BlockCordaitesLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCordaitesDry extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCordaitesDry(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCordaitesDry!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCordaitesDry!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCordaitesDry!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCordaitesDry!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		Random rand = new Random();

		int TrunkHeight = 9 + rand.nextInt(12);

		int counter = 0;
		int yy = y;
		int yyy = 0;

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
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Topshoot:
			PlaceLeaves(world, new BlockPos(x, y + counter, z));

			//Top set is always short sides:
			yyy = y + counter - 3;
			int i = rand.nextInt(2);
			switch (i) {

				case 0: default:
					//North-South uppermost:
					ProcedureTreeLog.executeProcedure(x, yyy, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, yyy + 1, z + 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x, yyy + 2, z + 2));

					ProcedureTreeLog.executeProcedure(x, yyy, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, yyy + 1, z - 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x, yyy + 2, z - 2));

					ProcedureTreeLog.executeProcedure(x + 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x + 2, yyy + 1, z));

					ProcedureTreeLog.executeProcedure(x - 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x - 2, yyy + 1, z));

					break;

				case 1:
					//East-West uppermost:
					ProcedureTreeLog.executeProcedure(x + 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x + 2, yyy + 2, z));

					ProcedureTreeLog.executeProcedure(x - 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 2, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x - 2, yyy + 2, z));

					ProcedureTreeLog.executeProcedure(x, yyy - 1, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, yyy, z + 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x, yyy + 1, z + 2));

					ProcedureTreeLog.executeProcedure(x, yyy - 1, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure(x, yyy, z - 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					PlaceLeaves(world, new BlockPos(x, yyy + 1, z - 2));

					break;

			}

			//Top set is always short sides:
			yyy = y + counter - 6 - rand.nextInt(2);
			boolean longer = rand.nextInt(3) == 0;
			i = rand.nextInt(2);
			switch (i) {

				case 0: default:
					//North-South uppermost:
					if (longer) {
						ProcedureTreeLog.executeProcedure(x, yyy, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z + 2, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy + 1, z + 3, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 2, z + 3));

						ProcedureTreeLog.executeProcedure(x, yyy, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z - 2, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy + 1, z - 3, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 2, z - 3));

						ProcedureTreeLog.executeProcedure(x + 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 3, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x + 3, yyy + 1, z));

						ProcedureTreeLog.executeProcedure(x - 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 3, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x - 3, yyy + 1, z));
					}
					else {
						ProcedureTreeLog.executeProcedure(x, yyy, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy + 1, z + 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 2, z + 2));

						ProcedureTreeLog.executeProcedure(x, yyy, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy + 1, z - 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 2, z - 2));

						ProcedureTreeLog.executeProcedure(x + 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x + 2, yyy + 1, z));

						ProcedureTreeLog.executeProcedure(x - 1, yyy - 1, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x - 2, yyy + 1, z));
					}

					break;

				case 1:
					//East-West uppermost:
					if (longer) {
						ProcedureTreeLog.executeProcedure(x + 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 3, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x + 3, yyy + 2, z));

						ProcedureTreeLog.executeProcedure(x - 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 3, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x - 3, yyy + 2, z));

						ProcedureTreeLog.executeProcedure(x, yyy - 1, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy - 1, z + 2, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z + 3, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 1, z + 3));

						ProcedureTreeLog.executeProcedure(x, yyy - 1, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy - 1, z - 2, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z - 3, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 1, z - 3));
					}
					else {
						ProcedureTreeLog.executeProcedure(x + 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x + 2, yyy + 2, z));

						ProcedureTreeLog.executeProcedure(x - 1, yyy, z, world, BlockCordaitesLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yyy + 1, z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x - 2, yyy + 2, z));

						ProcedureTreeLog.executeProcedure(x, yyy - 1, z + 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z + 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 1, z + 2));

						ProcedureTreeLog.executeProcedure(x, yyy - 1, z - 1, world, BlockCordaitesLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yyy, z - 2, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						PlaceLeaves(world, new BlockPos(x, yyy + 1, z - 2));
					}
					break;

			}

		}
	}


	public static Block getLeaves()
	{
		return BlockCordaitesDryLeaves.block;
	}

	public static void PlaceLeaves(World world, BlockPos pos) 
	{
		ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ(), world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY() + 1, pos.getZ(), world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(pos.getX() + 1, pos.getY(), pos.getZ(), world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(pos.getX() - 1, pos.getY(), pos.getZ(), world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() + 1, world, getLeaves());
		ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() - 1, world, getLeaves());

	}
	
}