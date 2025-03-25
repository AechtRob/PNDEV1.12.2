package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSupaiaLog;
import net.lepidodendron.block.BlockSupaiaShoot;
import net.lepidodendron.block.BlockSupaiaShootPlaceable;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSupaia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSupaia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenSupaia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenSupaia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenSupaia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenSupaia!");
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
			
			//Trunk:
			TrunkHeight = 1 + world.rand.nextInt(4);
			if (!BlockSupaiaShootPlaceable.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) (y + TrunkHeight), (int) z))) {
				return;
			}

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockSupaiaLog.block, EnumFacing.DOWN);
				if (world.rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockSupaiaLog.block, EnumFacing.DOWN);
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter + 1), (int) z + 1), BlockSupaiaShoot.block.getDefaultState(), 3);
				}
				if (world.rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockSupaiaLog.block, EnumFacing.DOWN);
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter + 1), (int) z - 1), BlockSupaiaShoot.block.getDefaultState(), 3);
				}
				if (world.rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockSupaiaLog.block, EnumFacing.DOWN);
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockSupaiaShoot.block.getDefaultState(), 3);
				}
				if (world.rand.nextInt(12) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockSupaiaLog.block, EnumFacing.DOWN);
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockSupaiaShoot.block.getDefaultState(), 3);
				}

				counter = counter + 1;
				}

			Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter), (int) z), BlockSupaiaShoot.block.getDefaultState(), 3);

		}
			
	}
}