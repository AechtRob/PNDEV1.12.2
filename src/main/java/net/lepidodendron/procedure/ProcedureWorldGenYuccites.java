package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockYuccitesLog;
import net.lepidodendron.block.BlockYuccitesShoot;
import net.lepidodendron.block.BlockYuccitesShootCentre;
import net.lepidodendron.block.BlockYuccitesShootTop;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenYuccites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenYuccites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenYuccites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenYuccites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenYuccites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenYuccites!");
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
			TrunkHeight = 1 + world.rand.nextInt(4);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockYuccitesLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			yy = y + counter;
			Block block = world.getBlockState(new BlockPos((int) x, (int) yy, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy, (int) z)), world, new BlockPos((int) x, (int) yy, (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) yy + 1, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy + 1, (int) z)), world, new BlockPos((int) x, (int) yy + 1, (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) yy + 2, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy + 2, (int) z)), world, new BlockPos((int) x, (int) yy + 2, (int) z))) {
						Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) yy, (int) z), BlockYuccitesShoot.block.getDefaultState(), 3);
						Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) yy + 1, (int) z), BlockYuccitesShootCentre.block.getDefaultState(), 3);
						Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) yy + 2, (int) z), BlockYuccitesShootTop.block.getDefaultState(), 3);
					}
				}
			}
		}
	}
}