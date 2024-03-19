package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSanfordiacaulisLog;
import net.lepidodendron.block.BlockSanfordiacaulisShoot;
import net.lepidodendron.block.BlockSanfordiacaulisShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSanfordiacaulis extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSanfordiacaulis(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenSanfordiacaulis!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenSanfordiacaulis!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenSanfordiacaulis!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenSanfordiacaulis!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;
		int xct = 0;
		int yct = 0;
		int zct = 0;
		int TreeType = 0;
		Boolean TreeCheck = true;
		
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
			
			//Trunk:
			TrunkHeight = 1 + (int) Math.round(Math.random());

			//Test for space:
			TreeCheck = true;
			xct = -2;
			while (xct <= 2 && TreeCheck) {
				zct = -2;
				while (zct <= 2 && TreeCheck) {
					if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 4) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight, (int) z + zct)))) {
						TreeCheck = false;
					}
					if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 4) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight + 1, (int) z + zct)))) {
						TreeCheck = false;
					}
					zct = zct + 1;
				}
				xct = xct + 1;
			}

			if (!TreeCheck) return;

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockSanfordiacaulisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockSanfordiacaulisShoot.block.getDefaultState(), 2);
			BlockSanfordiacaulisShootPlaceable.block.onBlockAdded(world, new BlockPos((int) x, (int) (y + counter), (int) z), BlockSanfordiacaulisShoot.block.getDefaultState());
		}
	}
}