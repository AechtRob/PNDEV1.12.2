package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMagnoliaSpaceChecker extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMagnoliaSpaceChecker(ElementsLepidodendronMod instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GrowMagnoliaSpaceChecker!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GrowMagnoliaSpaceChecker!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GrowMagnoliaSpaceChecker!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GrowMagnoliaSpaceChecker!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x + 2), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x + 3), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x + 4), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x - 2), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x - 3), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) (x - 4), (int) (y + 2), (int) z)))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z + 2))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z + 3))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z + 4))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z - 2))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z - 3))))
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 2), (int) (z - 4))))
			
			&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1))))
			&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z - 1))))
			&& (world.canSeeSky(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z + 1))))
			&& (world.canSeeSky(new BlockPos((int) (x - 1), (int) (y + 2), (int) (z - 1))))
			
			&& (world.canSeeSky(new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 2))))
			&& (world.canSeeSky(new BlockPos((int) (x + 2), (int) (y + 2), (int) (z - 2))))
			&& (world.canSeeSky(new BlockPos((int) (x - 2), (int) (y + 2), (int) (z + 2))))
			&& (world.canSeeSky(new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 2))))
		) {
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureWorldGenMagnolia.executeProcedure($_dependencies);
		}
	}
}