package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockZygopterisLog;
import net.lepidodendron.block.BlockZygopterisShoot;
import net.lepidodendron.block.BlockZygopterisShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenZygopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenZygopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenZygopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenZygopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenZygopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenZygopteris!");
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
			TrunkHeight = Math.round(Math.random() * 5D) + Math.round(Math.random() * 5D) + 4D;
			if (Math.random() > 0.4) TrunkHeight = Math.round(TrunkHeight * 0.5);
			if (!BlockZygopterisShootPlaceable.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
				return;
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockZygopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockZygopterisShoot.block.getDefaultState(), 3);
		}
			
	}
}