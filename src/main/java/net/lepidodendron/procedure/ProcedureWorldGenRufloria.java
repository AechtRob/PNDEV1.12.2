package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockRufloriaLog;
import net.lepidodendron.block.BlockRufloriaShoot;
import net.lepidodendron.block.BlockRufloriaShootCentre;
import net.lepidodendron.block.BlockRufloriaShootTop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenRufloria extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenRufloria(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenRufloria!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenRufloria!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenRufloria!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenRufloria!");
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
			TrunkHeight = 3 + (int) Math.round(Math.random() * 5);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockRufloriaLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			yy = y + counter;
			Block block = world.getBlockState(new BlockPos((int) x, (int) yy, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy, (int) z)), world, new BlockPos((int) x, (int) yy, (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) yy + 1, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy + 1, (int) z)), world, new BlockPos((int) x, (int) yy + 1, (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) yy + 2, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy + 2, (int) z)), world, new BlockPos((int) x, (int) yy + 2, (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) yy, (int) z), BlockRufloriaShoot.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) yy + 1, (int) z), BlockRufloriaShootCentre.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) yy + 2, (int) z), BlockRufloriaShootTop.block.getDefaultState(), 3);
					}
				}
			}
		}
	}
}