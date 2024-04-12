package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAulacera;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAulacera extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAulacera(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAulacera!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAulacera!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAulacera!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAulacera!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TreeHeight = 0;
		double counter = 0;

		if (BlockAulacera.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) y, (int) z))
			) {			
			//world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Tree height: 3-10 blocks
			TreeHeight = 3 + Math.round(Math.random() * 7D);

			int ii = 0;
			while (ii <= TreeHeight && BlockAulacera.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) y + ii, (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + ii, (int) z), BlockAulacera.block.getDefaultState(), 3);
				ii += 1;
			}
				
		}
	}
}