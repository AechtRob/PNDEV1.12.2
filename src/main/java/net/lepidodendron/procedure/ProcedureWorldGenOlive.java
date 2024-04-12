package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockOliveLeaves;
import net.lepidodendron.block.BlockOliveLeavesBerries;
import net.lepidodendron.block.BlockOliveLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenOlive extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenOlive(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenOlive!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenOlive!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenOlive!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenOlive!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 3 + (int) (Math.round(Math.random() * 3D));
		int counter = 0;
		int yy = y;
		int upright = 0;
		int yyy = 0;
		Random rand = world.rand;

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

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y - 2), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);

			//Trunk:
			int radius = world.rand.nextInt(2) + 5;
			TrunkHeight = 2 + rand.nextInt(3);
			boolean hollow = false;

			counter = 0;
			if (rand.nextInt(20) == 0) {
				//Hollow ones:
				hollow = true;
				int i = rand.nextInt(4);
				int ii = rand.nextInt(TrunkHeight - 1);
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					//East sometimes hollow:
					if (!(i == 2 && counter > ii)) {
						ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
					}
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + counter), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					//West sometimes hollow:
					if (!(i == 3 && counter > ii)) {
						ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + counter), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
					}
					ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + counter), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);

					//North sometimes hollow:
					if (!(i == 0 && counter > ii)) {
						ProcedureTreeLog.executeProcedure((int) (x), (int) (y + counter), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					}

					//South sometimes hollow:
					if (!(i == 1 && counter > ii)) {
						ProcedureTreeLog.executeProcedure((int) (x), (int) (y + counter), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					}

					counter = counter + 1;
				}

				counter = counter - 1;
				//Crown support:
				int offsetter = rand.nextInt(3) - 1;
				ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.EAST);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.UP);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z + offsetter + 2), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z + offsetter - 2), world, BlockOliveLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) (x - 5), (int) (y + counter + 1), (int) (z + offsetter + 2), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x - 5), (int) (y + counter + 1), (int) (z + offsetter - 2), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(3) - 1;
				ProcedureTreeLog.executeProcedure((int) (x + 2), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.EAST);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z + offsetter + 1), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z + offsetter - 1), world, BlockOliveLog.block, EnumFacing.UP);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z + offsetter + 2), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z + offsetter - 2), world, BlockOliveLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) (x + 5), (int) (y + counter + 1), (int) (z + offsetter + 2), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + 5), (int) (y + counter + 1), (int) (z + offsetter - 2), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(3) - 1;
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.UP);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.EAST);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z + 5), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z + 5), world, BlockOliveLog.block, EnumFacing.EAST);
				}

				offsetter = rand.nextInt(3) - 1;
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z - 5), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z - 5), world, BlockOliveLog.block, EnumFacing.EAST);
				}

			}
			else {
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);

					counter = counter + 1;
				}

				counter = counter - 1;
				//Crown support:
				int offsetter = rand.nextInt(2);
				ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter + 1), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.EAST);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.UP);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z - offsetter + 2), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x - 3), (int) (y + counter + 1), (int) (z - offsetter - 2), world, BlockOliveLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z - offsetter + 2), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x - 4), (int) (y + counter + 1), (int) (z - offsetter - 2), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(2);
				ProcedureTreeLog.executeProcedure((int) (x + 2), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.EAST);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter + 1), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter - 1), world, BlockOliveLog.block, EnumFacing.UP);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter + 2), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + 3), (int) (y + counter + 1), (int) (z - offsetter - 2), world, BlockOliveLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z - offsetter + 2), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + 4), (int) (y + counter + 1), (int) (z - offsetter - 2), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(2);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter + 1), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.UP);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.EAST);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z + 3), world, BlockOliveLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z + 4), world, BlockOliveLog.block, EnumFacing.EAST);
				}

				offsetter = rand.nextInt(2);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);
				if (radius > 5) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 1), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.EAST);
				//}
				//if (radius > 6) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z - 3), world, BlockOliveLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure((int) (x + offsetter + 2), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) (x + offsetter - 2), (int) (y + counter + 1), (int) (z - 4), world, BlockOliveLog.block, EnumFacing.EAST);
				}

			}

			//Decorative bits and bobs:
			if (!hollow) {
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y), (int) (z), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) (z), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}

				//Nubs
				int offsetter = rand.nextInt(2);
				int offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x - 1), (int) (y + offsetterY + 1), (int) (z - offsetter))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x - 1), (int) (y + offsetterY - 1), (int) (z - offsetter))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + offsetterY), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(2);
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + 2), (int) (y + offsetterY + 1), (int) (z - offsetter))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + 2), (int) (y + offsetterY - 1), (int) (z - offsetter))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + 2), (int) (y + counter), (int) (z - offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(2);
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + offsetterY + 1), (int) (y + counter), (int) (z + 1))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY - 1), (int) (z + 1))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.EAST);
				}

				offsetter = rand.nextInt(2);
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + offsetterY + 1), (int) (y + counter), (int) (z - 2))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY - 1), (int) (z - 2))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + counter), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.EAST);
				}
			}
			else {
				//Hollow:
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y), (int) (z), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) (z + 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) (z), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) (z - 1), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}
				if (rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.NORTH);
				}

				//Nubs
				int offsetter = rand.nextInt(3) - 1;
				int offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x - 2), (int) (y + offsetterY + 1), (int) (z + offsetter))).getBlock() != BlockOliveLog.block
					&& world.getBlockState(new BlockPos((int) (x - 2), (int) (y + offsetterY - 1), (int) (z + offsetter))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x - 2), (int) (y + offsetterY), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				}
				offsetter = rand.nextInt(3) - 1;
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + 2), (int) (y + offsetterY + 1), (int) (z + offsetter))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + 2), (int) (y + offsetterY - 1), (int) (z + offsetter))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + 2), (int) (y + offsetterY), (int) (z + offsetter), world, BlockOliveLog.block, EnumFacing.UP);
				}

				offsetter = rand.nextInt(3) - 1;
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY + 1), (int) (z + 2))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY - 1), (int) (z + 2))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + offsetterY), (int) (z + 2), world, BlockOliveLog.block, EnumFacing.EAST);
				}

				offsetter = rand.nextInt(3) - 1;
				offsetterY = rand.nextInt(TrunkHeight - 1) + 1;
				if (rand.nextInt(4) == 0 && world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY + 1), (int) (z - 2))).getBlock() != BlockOliveLog.block
						&& world.getBlockState(new BlockPos((int) (x + offsetter), (int) (y + offsetterY - 1), (int) (z - 2))).getBlock() != BlockOliveLog.block) {
					ProcedureTreeLog.executeProcedure((int) (x + offsetter), (int) (y + offsetterY), (int) (z - 2), world, BlockOliveLog.block, EnumFacing.EAST);
				}
			}

			placeCrown(world, new BlockPos(x, y + counter, z), radius);
		}
	}


	public static Block getLeaves()
	{
		if (Math.random() > 0.8) {
			return BlockOliveLeavesBerries.block;
		}
		return BlockOliveLeaves.block;
	}

	public static void placeCrown(World world, BlockPos pos, int radius) {
		int rad = radius;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		boolean skip = true;

		int xct;
		int yct = y;
		int zct;
		while (rad >= 3) {
			xct = -rad;
			while (xct <= rad) {
				zct = -rad;
				while (zct <= rad) {
					if (xct == 0 && zct == 0 && rad >= 4) {
						ProcedureTreeLog.executeProcedure(x + xct, yct, z + zct, world, BlockOliveLog.block, EnumFacing.NORTH);
					} else if (Math.abs(xct) == 1 && Math.abs(zct) == 0 && rad >= 5) {
						ProcedureTreeLog.executeProcedure(x + xct, yct, z + zct, world, BlockOliveLog.block, EnumFacing.UP);
					} else if (Math.abs(xct) == 0 && Math.abs(zct) == 1 && rad >= 5) {
						ProcedureTreeLog.executeProcedure(x + xct, yct, z + zct, world, BlockOliveLog.block, EnumFacing.EAST);
					} else if ((Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) Math.abs(rad), 2))) {
						//if (!(world.rand.nextInt(10) == 0 && (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) == Math.pow((int) Math.abs(rad), 2)))) {
							ProcedureTreeLeaf.executeProcedure(x + xct, yct, z + zct, world, getLeaves());
						//}
					}
					zct = zct + 1;
				}
				xct = xct + 1;
			}
			yct = yct + 1;
			if (!skip) {
				rad = rad - 1;
			}
			skip = false;
		}
	}
}



