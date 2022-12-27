package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumHLog;
import net.lepidodendron.block.BlockDicroidiumHShoot;
import net.lepidodendron.block.BlockDicroidiumHShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDicroidiumH extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDicroidiumH(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDicroidiumH!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDicroidiumH!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDicroidiumH!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDicroidiumH!");
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
			TrunkHeight = Math.round(Math.random() * 4D) + 2D;
			if (!BlockDicroidiumHShootPlaceable.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
				return;
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockDicroidiumHLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockDicroidiumHShoot.block.getDefaultState(), 3);

			if (TrunkHeight == 5 && Math.random() > 0.85) {
				//Random extra crown:
				int i = world.rand.nextInt(4);
				if (i == 0) {
					world.setBlockState(new BlockPos((int) x, (int) (y + counter - 2), (int) z - 1), BlockDicroidiumHShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) (y + counter - 1), (int) z - 1), BlockDicroidiumHLog.block.getDefaultState(), 3);
				}
				if (i == 1) {
					world.setBlockState(new BlockPos((int) x, (int) (y + counter - 2), (int) z + 1), BlockDicroidiumHShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) (y + counter - 1), (int) z + 1), BlockDicroidiumHLog.block.getDefaultState(), 3);
				}
				if (i == 2) {
					world.setBlockState(new BlockPos((int) x - 1, (int) (y + counter - 2), (int) z), BlockDicroidiumHShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x - 1, (int) (y + counter - 1), (int) z), BlockDicroidiumHLog.block.getDefaultState(), 3);
				}
				if (i == 3) {
					world.setBlockState(new BlockPos((int) x + 1, (int) (y + counter - 2), (int) z), BlockDicroidiumHShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x + 1, (int) (y + counter - 1), (int) z), BlockDicroidiumHLog.block.getDefaultState(), 3);
				}
			}
		}
			
	}
}