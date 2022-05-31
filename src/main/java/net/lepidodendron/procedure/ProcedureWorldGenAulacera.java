package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAulacera;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAulacera extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAulacera(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
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
			
			//Tree height: 1-8 blocks
			TreeHeight = 1 + Math.round(Math.random() * 7);

			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockAulacera.block.getDefaultState(), 3);

			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y + 1);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("TreeHeight", TreeHeight);
			$_dependencies.put("counter", counter);
			//System.err.println("Y2 = " + (y + 1));
			ProcedureWorldGenAulaceraBranch.executeProcedure($_dependencies);
				
		}
	}
}