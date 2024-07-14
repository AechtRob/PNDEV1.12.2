package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCypressLog;
import net.lepidodendron.block.BlockCypressTwiggyLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCypressTwiggy extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCypressTwiggy(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCypressTwiggy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCypressTwiggy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCypressTwiggy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCypressTwiggy!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
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
			|| (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z)))
			|| (world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z)))
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 18 + (int) Math.round(Math.random() * 6);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockCypressLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Top parts:
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z, world, BlockCypressTwiggyLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 2, (int) z, world, BlockCypressTwiggyLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y + TrunkHeight, (int) z, world, BlockCypressTwiggyLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y + TrunkHeight, (int) z, world, BlockCypressTwiggyLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight, (int) z + 1, world, BlockCypressTwiggyLeaves.block);
			ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight, (int) z - 1, world, BlockCypressTwiggyLeaves.block);

			counter = counter - 3;

			while (counter > (int)((double)TrunkHeight * 0.33D)) {
				yy = y + counter;
				int lowest = 0;
				boolean variant = rand.nextBoolean();
				if (counter > (int)((double)TrunkHeight * 0.6D) || variant) {

					//North
					int picker = world.rand.nextInt(3);
					lowest = Math.max(lowest, picker);
					ProcedureTreeLog.executeProcedure(x, yy - picker, z - 1, world, BlockCypressLog.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure(x, yy - picker + 1, z - 2, world, BlockCypressLog.block, EnumFacing.NORTH);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 2, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 1, z - 3, world, BlockCypressTwiggyLeaves.block);

					//South
					picker = world.rand.nextInt(3);
					lowest = Math.max(lowest, picker);
					ProcedureTreeLog.executeProcedure(x, yy - picker, z + 1, world, BlockCypressLog.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure(x, yy - picker + 1, z + 2, world, BlockCypressLog.block, EnumFacing.NORTH);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 2, z + 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker, z + 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 1, z + 3, world, BlockCypressTwiggyLeaves.block);

					//West
					picker = world.rand.nextInt(3);
					lowest = Math.max(lowest, picker);
					ProcedureTreeLog.executeProcedure(x - 1, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x - 2, yy - picker + 1, z, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 2, z, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker, z, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 1, z, world, BlockCypressTwiggyLeaves.block);

					//East
					picker = world.rand.nextInt(3);
					lowest = Math.max(lowest, picker);
					ProcedureTreeLog.executeProcedure(x + 1, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, yy - picker + 1, z, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 2, z, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker, z, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 1, z, world, BlockCypressTwiggyLeaves.block);

				}
				else {
					//bigger branches:
					int picker = world.rand.nextInt(6);
					lowest = Math.max(lowest, picker);
					ProcedureTreeLog.executeProcedure(x, yy - picker, z - 1, world, BlockCypressLog.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure(x, yy - picker, z - 2, world, BlockCypressLog.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure(x, yy - picker + 1, z - 2, world, BlockCypressLog.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure(x + 1, yy - picker + 1, z - 2, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 2, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z - 3, world, BlockCypressTwiggyLeaves.block);

					ProcedureTreeLog.executeProcedure(x - 1, yy - picker + 1, z - 2, world, BlockCypressLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 2, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z - 3, world, BlockCypressTwiggyLeaves.block);

					ProcedureTreeLog.executeProcedure(x, yy - picker + 2, z - 3, world, BlockCypressLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure(x, yy - picker + 3, z - 3, world, BlockCypressLog.block, EnumFacing.NORTH);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 4, z - 3, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x, yy - picker + 3, z - 4, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 3, z - 3, world, BlockCypressTwiggyLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 3, z - 3, world, BlockCypressTwiggyLeaves.block);

					//SOUTH
					picker = world.rand.nextInt(6);
					if (lowest != picker) {
						lowest = Math.max(lowest, picker);
						ProcedureTreeLog.executeProcedure(x, yy - picker, z + 1, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure(x, yy - picker, z + 2, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure(x, yy - picker + 1, z + 2, world, BlockCypressLog.block, EnumFacing.NORTH);

						ProcedureTreeLog.executeProcedure(x + 1, yy - picker + 1, z + 2, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 2, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z + 3, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x - 1, yy - picker + 1, z + 2, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 2, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z + 3, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x, yy - picker + 2, z + 3, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure(x, yy - picker + 3, z + 3, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLeaf.executeProcedure(x, yy - picker + 4, z + 3, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, yy - picker + 3, z + 4, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 3, z + 3, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 3, z + 3, world, BlockCypressTwiggyLeaves.block);
					}

					//EAST
					picker = world.rand.nextInt(6);
					if (lowest != picker) {
						lowest = Math.max(lowest, picker);
						ProcedureTreeLog.executeProcedure(x + 1, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x + 2, yy - picker + 1, z, world, BlockCypressLog.block, EnumFacing.NORTH);

						ProcedureTreeLog.executeProcedure(x + 2, yy - picker + 1, z + 1, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 2, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x + 2, yy - picker + 1, z - 1, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 2, z - 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x + 3, yy - picker + 2, z, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure(x + 3, yy - picker + 3, z, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 4, z, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 4, yy - picker + 3, z, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 3, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy - picker + 3, z - 1, world, BlockCypressTwiggyLeaves.block);
					}

					//WEST
					picker = world.rand.nextInt(6);
					if (lowest != picker) {
						lowest = Math.max(lowest, picker);
						ProcedureTreeLog.executeProcedure(x - 1, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yy - picker, z, world, BlockCypressLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 2, yy - picker + 1, z, world, BlockCypressLog.block, EnumFacing.NORTH);

						ProcedureTreeLog.executeProcedure(x - 2, yy - picker + 1, z + 1, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 2, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z + 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 1, z + 1, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x - 2, yy - picker + 1, z - 1, world, BlockCypressLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 2, z - 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy - picker + 1, z - 2, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 1, z - 1, world, BlockCypressTwiggyLeaves.block);

						ProcedureTreeLog.executeProcedure(x - 3, yy - picker + 2, z, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure(x - 3, yy - picker + 3, z, world, BlockCypressLog.block, EnumFacing.NORTH);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 4, z, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 4, yy - picker + 3, z, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 3, z + 1, world, BlockCypressTwiggyLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy - picker + 3, z - 1, world, BlockCypressTwiggyLeaves.block);
					}
				}

				counter = counter - lowest - 2;

				//counter = counter - 1;
			}

		}
	}
}