package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTorreyaLeaves;
import net.lepidodendron.block.BlockTorreyaLeavesBerries;
import net.lepidodendron.block.BlockTorreyaLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTorreya extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTorreya(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTorreya!");
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

			TrunkHeight = 8 + rand.nextInt(4);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			counter = counter - 1;
			yy = y + counter;
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockTorreyaLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockTorreyaLeaves.block);

			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLeaves.block);

			yy = yy - 1;
			while (yy > y + 3) {

				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, getLeaves());

				yy--;

				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, getLeaves());

				yy--;

				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.EAST);

				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTorreyaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTorreyaLog.block, EnumFacing.EAST);

				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockTorreyaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockTorreyaLog.block, EnumFacing.EAST);
				
				ProcedureTreeLeaf.executeProcedure((int) x + 4, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 4, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 4, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 4, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 5, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 5, (int) yy, (int) z, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 5, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 5, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 4, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 4, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 4, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 4, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 4, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 4, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 4, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 4, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 2, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 3, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z + 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z - 2, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z - 2, world, getLeaves());

				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z + 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z - 3, world, getLeaves());
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z - 3, world, getLeaves());

				yy--;

			}
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.EAST);

		}
	}

	public static Block getLeaves()
	{
		if (Math.random() > 0.8) {
			return BlockTorreyaLeavesBerries.block;
		}
		return BlockTorreyaLeaves.block;
	}
}