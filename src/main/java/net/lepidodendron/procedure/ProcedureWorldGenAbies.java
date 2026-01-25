package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAbiesLeaves;
import net.lepidodendron.block.BlockAbiesLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAbies extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAbies(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAbies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		boolean layerone = false;
		int yct;
		Random rand = new Random();

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

			TrunkHeight = 10 + rand.nextInt(6);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockAbiesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			counter = counter - 1;
			yy = y + counter;
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockAbiesLeaves.block);

			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);

			yy = yy - 1;
			while (yy > y) {
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockAbiesLeaves.block);
				yy--;
				if (yy > y) {
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAbiesLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAbiesLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAbiesLeaves.block);
				}
				yy--;
			}

		}
	}
}