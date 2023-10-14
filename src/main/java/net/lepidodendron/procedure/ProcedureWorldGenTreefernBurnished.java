package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTreefernBurnishedLog;
import net.lepidodendron.block.BlockTreefernBurnishedShoot;
import net.lepidodendron.block.BlockTreefernBurnishedShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTreefernBurnished extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTreefernBurnished(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TreefernBurnished!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TreefernBurnished!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TreefernBurnished!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TreefernBurnished!");
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
			TrunkHeight = Math.round(Math.random() * 4D) + Math.round(Math.random() * 2D) + 2D;
			if (Math.random() > 0.4) TrunkHeight = Math.round(TrunkHeight * 0.66);
			if (!BlockTreefernBurnishedShootPlaceable.block.canPlaceBlockAt(world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
				return;
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockTreefernBurnishedLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockTreefernBurnishedShoot.block.getDefaultState(), 3);
		}
			
	}
}