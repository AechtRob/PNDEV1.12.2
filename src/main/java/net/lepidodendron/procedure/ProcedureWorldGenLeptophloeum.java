package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockLeptophloeumLeaves;
import net.lepidodendron.block.BlockLeptophloeumLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenLeptophloeum extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLeptophloeum(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenLeptophloeum!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenLeptophloeum!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean vines = (boolean) dependencies.get("vines");
		boolean vines2 = (boolean) dependencies.get("vines2");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		double TrunkHeight = 0;
		double LeafHeight = 0;
		double counter = 0;
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk:
			TrunkHeight = 15 + world.rand.nextInt(7);
			LeafHeight = world.rand.nextInt(2) + 3;

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, (int) (y + counter), z, world, BlockLeptophloeumLog.block, EnumFacing.NORTH);
				if (counter > TrunkHeight * 0.65D) {
					int dir = world.rand.nextInt(4);
					BlockPos bp = new BlockPos(x, (int) (y + counter), z);
					if (counter == TrunkHeight - LeafHeight) {
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir)).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).getX(), (int) (y + counter - 1), bp.offset(EnumFacing.byHorizontalIndex(dir)).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir)).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir)).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
					}
					if (counter == TrunkHeight - LeafHeight - 2) {
						dir = world.rand.nextInt(4);
						EnumFacing log = EnumFacing.UP;
						if ((dir & 1) == 0) {
							log = EnumFacing.EAST;
						}
						ProcedureTreeLog.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir)).getZ(), world, BlockLeptophloeumLog.block, log);

						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getX(), (int) (y + counter - 1), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 4).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 4).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
					}

					if (counter == TrunkHeight - LeafHeight - 4) {
						dir = world.rand.nextInt(4);
						EnumFacing log = EnumFacing.UP;
						if ((dir & 1) == 0) {
							log = EnumFacing.EAST;
						}
						ProcedureTreeLog.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir)).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir)).getZ(), world, BlockLeptophloeumLog.block, log);

						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getX(), (int) (y + counter - 1), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 3).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 4).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 4).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
						ProcedureTreeLeaf.executeProcedure(bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getX(), (int) (y + counter), bp.offset(EnumFacing.byHorizontalIndex(dir), 2).offset(EnumFacing.byHorizontalIndex(dir).rotateY().rotateY().rotateY()).getZ(), world, BlockLeptophloeumLeaves.block);
					}
				}

				counter = counter + 1;
			}
			
			//Top of tree:
			xx = x;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLeptophloeumLeaves.block);

			xx = x;
			yy = (int) counter + 1 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLeptophloeumLeaves.block);

			xx = x;
			yy = (int) counter + 2 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLeptophloeumLeaves.block);

			for (int n = 0; n < LeafHeight; n++) {
				xx = x;
				yy = (int) counter + y - n;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockLeptophloeumLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockLeptophloeumLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockLeptophloeumLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockLeptophloeumLeaves.block);
			}

		}			
	}
}