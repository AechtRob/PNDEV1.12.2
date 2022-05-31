package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCalamophytonLog;
import net.lepidodendron.block.BlockCalamophytonShoot;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCalamophyton extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCalamophyton(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCalamophyton!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCalamophyton!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCalamophyton!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCalamophyton!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		
		if ((world.isAirBlock(new BlockPos((int) x, (int) y + 1, (int) z)))
				&& (world.isAirBlock(new BlockPos((int) x, (int) y + 2, (int) z)))
				&& (world.isAirBlock(new BlockPos((int) x, (int) y + 3, (int) z)))
			) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk: 2-3 blocks
			TrunkHeight = 2 + Math.round(Math.random());

			while (counter < TrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockCalamophytonLog.block.getDefaultState(), 3);
				}
				counter = counter + 1;
			}

			//Add the main shoot
			Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world,
				new BlockPos((int) x, (int) y + counter, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockCalamophytonShoot.block.getDefaultState(), 3);
				}
		}
	}
}