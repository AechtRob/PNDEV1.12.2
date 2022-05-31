package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockKomlopterisLeaves;
import net.lepidodendron.block.BlockKomlopterisLog;
import net.lepidodendron.block.BlockKomlopterisStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenKomlopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenKomlopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenKomlopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenKomlopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenKomlopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenKomlopteris!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		int yct;
		int xct;
		int zct;

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
			TrunkHeight = 2 + (int) Math.round(Math.random() * 14);
			counter = 0;
			yct = 0;
			if (TrunkHeight > 8) {yct = 4 + (int) Math.round(Math.random() * 2);}
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 1, z, world, BlockKomlopterisLeaves.block);
			if (Math.random() > 0.3) {
				ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 2, z, world, BlockKomlopterisLeaves.block);
				if (yct != 0 && Math.random() > 0.3) {ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 3, z, world, BlockKomlopterisLeaves.block);}
			}
			ProcedureLeavesAroundLog.executeProcedure(x, y + TrunkHeight, z, world, BlockKomlopterisLeaves.block, 1, 0.2 );
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockKomlopterisLog.block, EnumFacing.NORTH);
				if ((counter > yct) && (counter < TrunkHeight)) {
					if ((double) Math.round(counter/2) == (double) ((double) counter/2)) {
						ProcedureLeavesAroundLog.executeProcedure(x, y + counter, z, world, BlockKomlopterisLeaves.block, 1, 0 );
						ProcedureLeavesAroundLog.executeProcedure(x, y + counter, z, world, BlockKomlopterisLeaves.block, 2, 0.4 );
					}
				}
				counter = counter + 1;
			}

			if (yct == 0) {
				if (TrunkHeight > 2) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockKomlopterisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockKomlopterisLeaves.block, 2, 0.4 );
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockKomlopterisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockKomlopterisLeaves.block, 2, 0.4 );
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockKomlopterisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockKomlopterisLeaves.block, 2, 0.4 );
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockKomlopterisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockKomlopterisLeaves.block, 2, 0.4 );
				}
			}

			counter = yct;
			while (counter <= TrunkHeight) {
				xct = -2;
				while (xct <= 2) {
					zct = -2;
					while (zct <= 2) {
						if (world.isAirBlock(new BlockPos((int) x + xct, (int) y + counter - 1, (int) z + zct))
							&& ((world.getBlockState(new BlockPos((int) x + xct, (int) y + counter, (int) z + zct))).getBlock() == BlockKomlopterisLeaves.block)
							&& Math.random() > 0.65) {
							world.setBlockState(new BlockPos((int) x + xct, (int) y + counter - 1, (int) z + zct), BlockKomlopterisStrobilus.block.getDefaultState(), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos((int) x + xct, (int) y + counter - 1, (int) z + zct);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
		}
	}
}