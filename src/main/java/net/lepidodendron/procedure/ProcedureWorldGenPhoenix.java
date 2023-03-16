package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPhoenixLeaves;
import net.lepidodendron.block.BlockPhoenixLeaves1;
import net.lepidodendron.block.BlockPhoenixLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPhoenix extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPhoenix(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPhoenix!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPhoenix!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPhoenix!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPhoenix!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 10 + (int) Math.round(Math.random() * 8);
		int counter = 0;

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
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockPhoenixLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Place crown:
			int yy = y + counter - 2;

			int xx = x + 3;
			int zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x + 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 6;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 6;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 6;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 6;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves.block);

			xx = x + 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);


			xx = x;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 6;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 6;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 6;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 6;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves.block);

			xx = x + 4;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 4;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 4;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 4;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 2;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 2;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 2;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 2;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 5;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 5;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 5;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 5;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves.block);

			xx = x + 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 4;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 4;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 4;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 4;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 4;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 4;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 2;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 2;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 2;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 2;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 3;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 3;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 4;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x - 1;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 2;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 4;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 2;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 4;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);


			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 3;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z + 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x;
			zz = z - 3;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

			xx = x + 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x + 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 1;
			zz = z + 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);
			xx = x - 1;
			zz = z - 1;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);


			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);


			//---------
			yy = yy + 1;

			xx = x;
			zz = z;
			ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockPhoenixLeaves1.block);

		}
	}

}