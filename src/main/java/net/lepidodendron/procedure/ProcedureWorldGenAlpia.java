package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAlpiaLeaves;
import net.lepidodendron.block.BlockAlpiaLeaves1;
import net.lepidodendron.block.BlockAlpiaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAlpia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAlpia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAlpia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAlpia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAlpia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAlpia!");
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
		Random rand = new Random();

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

			if (Math.random() >= 0.66) {
				//Smaller variants:
				//---------------
				if (Math.random() >= 0.5) { //smallest type:
					TrunkHeight = 6 + rand.nextInt(3);
					counter = 0;
					while (counter <= TrunkHeight) {
						yy = y + counter;
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockAlpiaLog.block, EnumFacing.NORTH);
						counter = counter + 1;
					}
					counter = counter - 1;
					yy = y + counter;
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockAlpiaLeaves.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);

					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z + 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z - 2, world, BlockAlpiaLeaves1.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 2, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 2, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 2, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 2, (int) z - 1, world, BlockAlpiaLeaves.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z - 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z + 2, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z - 2, world, BlockAlpiaLeaves.block);
				}
				else { //medium-small:
					TrunkHeight = 10 + rand.nextInt(10);
					counter = 0;
					while (counter <= TrunkHeight) {
						yy = y + counter;
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockAlpiaLog.block, EnumFacing.NORTH);
						counter = counter + 1;
					}
					counter = counter - 1;
					yy = y + counter;
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockAlpiaLeaves.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);

					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z + 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z - 2, world, BlockAlpiaLeaves1.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 2, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 2, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 2, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 2, (int) z - 1, world, BlockAlpiaLeaves.block);

					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 3, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 3, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 3, (int) z + 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 3, (int) z - 2, world, BlockAlpiaLeaves1.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy - 3, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy - 3, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 3, (int) z + 3, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 3, (int) z - 3, world, BlockAlpiaLeaves.block);

					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 4, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 4, (int) z - 1, world, BlockAlpiaLeaves.block);

					//Layers:
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 6, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 6, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 6, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 6, (int) z - 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 6, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 6, (int) z - 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 6, (int) z + 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 6, (int) z - 1, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 6, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 6, (int) z, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 6, (int) z + 2, world, BlockAlpiaLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 6, (int) z - 2, world, BlockAlpiaLeaves.block);

					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy - 5, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy - 5, (int) z, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 5, (int) z + 3, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 5, (int) z - 3, world, BlockAlpiaLeaves1.block);

					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 5, (int) z + 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 5, (int) z - 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 5, (int) z + 2, world, BlockAlpiaLeaves1.block);
					ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 5, (int) z - 2, world, BlockAlpiaLeaves1.block);

					if (TrunkHeight > 11) {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 8, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 8, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 8, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 8, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 8, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 8, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 8, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 8, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 8, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 8, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 8, (int) z + 2, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 8, (int) z - 2, world, BlockAlpiaLeaves.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy - 7, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy - 7, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 7, (int) z + 3, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 7, (int) z - 3, world, BlockAlpiaLeaves1.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 7, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 7, (int) z - 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 7, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 7, (int) z - 2, world, BlockAlpiaLeaves1.block);
					}

					if (TrunkHeight > 13) {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 10, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 10, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 10, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 10, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 10, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 10, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 10, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 10, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 10, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 10, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 10, (int) z + 2, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 10, (int) z - 2, world, BlockAlpiaLeaves.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy - 9, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy - 9, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 9, (int) z + 3, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 9, (int) z - 3, world, BlockAlpiaLeaves1.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 9, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 9, (int) z - 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 9, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 9, (int) z - 2, world, BlockAlpiaLeaves1.block);
					}

					if (TrunkHeight > 15) {
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 12, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 12, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 12, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 12, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 12, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy - 12, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 12, (int) z + 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy - 12, (int) z - 1, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 12, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 12, (int) z, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 12, (int) z + 2, world, BlockAlpiaLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 12, (int) z - 2, world, BlockAlpiaLeaves.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy - 11, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy - 11, (int) z, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 11, (int) z + 3, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy - 11, (int) z - 3, world, BlockAlpiaLeaves1.block);

						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 11, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy - 11, (int) z - 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 11, (int) z + 2, world, BlockAlpiaLeaves1.block);
						ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy - 11, (int) z - 2, world, BlockAlpiaLeaves1.block);
					}

				}

			}
			else {
				//Larger variants:
				//---------------
				TrunkHeight = 18 + (int) Math.round(Math.random() * 14);
				counter = 0;
				yct = 3 + (int) Math.round(Math.random() * 2);
				while (counter <= TrunkHeight) {
					yy = y + counter;
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockAlpiaLog.block, EnumFacing.NORTH);
					if ((counter > yct) && (counter < TrunkHeight - 3)) {
						if ((double) Math.round(counter / 5) == (double) ((double) counter / 5)) {
							//Add a branch whorl:
							if (counter < (int) Math.round(TrunkHeight / 2)) {
								//Lower whorl:
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAlpiaLog.block, EnumFacing.EAST);
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAlpiaLog.block, EnumFacing.EAST);
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAlpiaLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAlpiaLog.block, EnumFacing.UP);

								ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x + 4, (int) yy + 1, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 5, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 5, (int) yy + 1, (int) z + 1, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 5, (int) yy + 1, (int) z - 1, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 6, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 6, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);
								if (layerone) {
									ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 7, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);
								}

								ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 4, (int) yy + 1, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 5, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 5, (int) yy + 1, (int) z + 1, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 5, (int) yy + 1, (int) z - 1, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 6, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 6, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);
								if (layerone) {
									ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 7, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);
								}

								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 4, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 1, (int) yy + 1, (int) z + 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 1, (int) yy + 1, (int) z + 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 6, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z + 6, world, BlockAlpiaLeaves1.block);
								if (layerone) {
									ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z + 7, world, BlockAlpiaLeaves1.block);
								}

								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 4, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 1, (int) yy + 1, (int) z - 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 1, (int) yy + 1, (int) z - 5, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 6, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z - 6, world, BlockAlpiaLeaves1.block);
								if (!layerone) {
									ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z - 7, world, BlockAlpiaLeaves1.block);
								}

								//diagonals:
								ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 1, (int) z + 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 2, (int) z + 4, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 1, (int) z + 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 2, (int) z + 4, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 1, (int) z - 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 2, (int) z - 4, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 1, (int) z - 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 2, (int) z - 4, world, BlockAlpiaLeaves1.block);

								layerone = true;
							} else {
								//Is this the topmost whorl?
								if (counter > (TrunkHeight - 6)) {
									yy = yy - 1;
									//System.err.println("Top layer moved to " + yy);
								}

								//Upper whorl:
								ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 4, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 1, (int) z, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 4, (int) yy + 2, (int) z, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z + 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z + 4, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockAlpiaLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 1, (int) z - 4, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) yy + 2, (int) z - 4, world, BlockAlpiaLeaves1.block);

								//diagonals:
								ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy + 1, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 2, (int) z + 3, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy + 1, (int) z + 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z + 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 2, (int) z + 3, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) yy + 1, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 3, (int) yy + 2, (int) z - 3, world, BlockAlpiaLeaves1.block);

								ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockAlpiaLeaves.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) yy + 1, (int) z - 2, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 1, (int) z - 3, world, BlockAlpiaLeaves1.block);
								ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 3, (int) yy + 2, (int) z - 3, world, BlockAlpiaLeaves1.block);
							}

						}
					}
					counter = counter + 1;
				}

				//Topknot:
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 3, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y + TrunkHeight, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y + TrunkHeight, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight, (int) z + 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight, (int) z - 1, world, BlockAlpiaLeaves.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure((int) x + 2, (int) y + TrunkHeight + 1, (int) z, world, BlockAlpiaLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure((int) x - 2, (int) y + TrunkHeight + 1, (int) z, world, BlockAlpiaLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z + 2, world, BlockAlpiaLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight + 1, (int) z - 2, world, BlockAlpiaLeaves1.block);


				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z + 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z - 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y + TrunkHeight - 2, (int) z + 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y + TrunkHeight - 2, (int) z - 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y + TrunkHeight - 2, (int) z + 1, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y + TrunkHeight - 2, (int) z - 1, world, BlockAlpiaLeaves.block);


				ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z + 2, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z - 2, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) y + TrunkHeight - 2, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z + 3, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 2, (int) z - 3, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) y + TrunkHeight - 1, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) y + TrunkHeight - 1, (int) z, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 1, (int) z + 3, world, BlockAlpiaLeaves.block);
				ProcedureTreeLeaf.executeProcedure((int) x, (int) y + TrunkHeight - 1, (int) z - 3, world, BlockAlpiaLeaves.block);
			}

		}
	}
}