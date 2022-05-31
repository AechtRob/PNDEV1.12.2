package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAgathis extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAgathis(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAgathis!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAgathis!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAgathis!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAgathis!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenAgathis!");
			return;
		}

		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		Material material1 = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))).getMaterial();
		Material material2= world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getMaterial();
		Material material3 = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
				&& material1 != Material.GRASS
				&& material1 != Material.GROUND
				&& material1 != Material.GLASS
				&& material1 != Material.IRON
				&& material1 != Material.ROCK
				&& material1 != Material.SAND
				&& material1 != Material.WOOD
			&& (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
				&& material2 != Material.GRASS
				&& material2 != Material.GROUND
				&& material2 != Material.GLASS
				&& material2 != Material.IRON
				&& material2 != Material.ROCK
				&& material2 != Material.SAND
				&& material2 != Material.WOOD
			&& (world.canSeeSky(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
				&& material3 != Material.GRASS
				&& material3 != Material.GROUND
				&& material3 != Material.GLASS
				&& material3 != Material.IRON
				&& material3 != Material.ROCK
				&& material3 != Material.SAND
				&& material3 != Material.WOOD
			) {			
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("SaplingSpawn", SaplingSpawn);
				ProcedureWorldGenAgathisNoCheck.executeProcedure($_dependencies);
		}
	}
}