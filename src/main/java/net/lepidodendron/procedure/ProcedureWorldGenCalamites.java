package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCalamites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCalamites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("worldgen") == null) {
			System.err.println("Failed to load dependency worldgen for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("parentx") == null) {
			System.err.println("Failed to load dependency parentx for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("parenty") == null) {
			System.err.println("Failed to load dependency parenty for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("parentz") == null) {
			System.err.println("Failed to load dependency parentz for procedure WorldGenCalamites!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenCalamites!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean worldgen = (boolean) dependencies.get("worldgen");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		if (!LepidodendronConfig.spreadUnlimitedCalamites) {
			int parentx = (int) dependencies.get("parentx");
			int parenty = (int) dependencies.get("parenty");
			int parentz = (int) dependencies.get("parentz");
		}
		else {
			int parentx = (int) dependencies.get("x");
			int parenty = (int) dependencies.get("y");
			int parentz = (int) dependencies.get("z");
		}
		
		double TrunkHeight = 0;
		double StemHeight = 0;
		double counter = 0;
		int branchpos = 0;
		boolean small = false;

		int xx = (int) x;
		int yy = (int) y;
		int zz = (int) z;
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z)))))
			{			
			

			//Place rhizome ticker:
			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial() == Material.WATER) {
				//System.err.println("Water spawn: " + x + " " + y + " " + z);
				
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCalamitesRhizome.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null) {
						_tileEntity.getTileData().setBoolean("worldgen", worldgen);
						_tileEntity.getTileData().setDouble("x", x);
						_tileEntity.getTileData().setDouble("z", z);
					}
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				y = y + 1;
			}
			else {
				world.setBlockState(new BlockPos((int) x, (int) y - 2, (int) z), BlockCalamitesRhizome.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y - 2, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null) {
						_tileEntity.getTileData().setBoolean("worldgen", worldgen);
						_tileEntity.getTileData().setDouble("x", x);
						_tileEntity.getTileData().setDouble("z", z);
					}
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
			}

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			//Trunk: 10-36 blocks, but more likely to be smaller:
			TrunkHeight = 10 + Math.round(Math.random() * 26);
			if ((TrunkHeight>=23) && (Math.random() >=0.65)) TrunkHeight = TrunkHeight * 0.6;

			if (TrunkHeight >=28) {
				//Do a big tree
				counter = 0;
				while (counter <= (TrunkHeight - 3)) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockCalamitesLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				//Add top:
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.UP);
					counter = counter + 1;
				}

				int layer = 3;
				if (TrunkHeight > 30) layer = 4;
				int sectdepth = Math.round((int)TrunkHeight/layer);

				//Top three layers always the same:
				//Sometimes use a strobilus:
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 1, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight), (int) z - 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 1, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 1, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight), (int) z + 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 1, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x + 1, (int) (y + TrunkHeight), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x - 1, (int) (y + TrunkHeight), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
				}

				ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 1), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 1), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight - 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight - 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);
			
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

				//Sometimes use a strobilus:
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z - 2, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight - 2), (int) z - 2);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z - 2, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z + 2, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight - 2), (int) z + 2);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 2), (int) z + 2, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x + 2, (int) (y + TrunkHeight - 2), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x - 2, (int) (y + TrunkHeight - 2), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + TrunkHeight - 2), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
				}


				//Sometimes use a strobilus:
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z - 1, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight - 3), (int) z - 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z - 1, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z + 1, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (y + TrunkHeight - 3), (int) z + 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z + 1, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight - 3), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x + 1, (int) (y + TrunkHeight - 3), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight - 3), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
				}
				if (Math.random() >= 0.8) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight - 3), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x - 1, (int) (y + TrunkHeight - 3), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight - 3), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
				}

				//Now apply the layers in proportion:
				counter = TrunkHeight - 4;
				while (counter >= sectdepth * (layer-1)) {
					//Top layer style:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					//Sometimes use a strobilus:
					if (Math.random() >= 0.8) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 3, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z - 3);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
					}
					else {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 3, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
					}
					if (Math.random() >= 0.8) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 3, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z + 3);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
					}
					else {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 3, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
					}
					if (Math.random() >= 0.8) {
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x + 3, (int) (y + counter), (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
					}
					else {
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
					}
					if (Math.random() >= 0.8) {
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x - 3, (int) (y + counter), (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
					}
					else {
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
					}
						
					counter = counter - 2;
				}

				while (counter >= sectdepth * (layer - 2)) {
					//Second layer style:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.WEST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					//No strobili here - just higher up!
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 4, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 4, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);

					counter = counter - 2;
				}

				while ((counter >= sectdepth * (layer - 3) && counter >= 2)) {
					//Third layer style:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.WEST);
					
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
					
					//No strobili here - just higher up!
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 5, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 5, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
					ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);

					counter = counter - 3;
				}

				//Finally a fourth layer on really big trees, but maybe not al teh way to he ground:
				if (layer == 4) {
					StemHeight = (Math.random() * sectdepth);
					
					while ((counter >= sectdepth * (layer - 4) && counter >= StemHeight)) {
						
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

	
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter + 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter + 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.UP);
						
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z - 6, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z + 6, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 6, (int) (y + counter + 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 6, (int) (y + counter + 1), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);
	
						//Leaves:!
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z - 7, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z + 7, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 7, (int) (y + counter + 1), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 7, (int) (y + counter + 1), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);

						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.WEST);
	
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);

						//Leaves:
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z - 5, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z - 5, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
						
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z + 5, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z + 5, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
	
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z - 2, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter), (int) z + 2, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z - 2, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter), (int) z + 2, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);

						//Zigzag diagonal branches:
						//North
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						//Leaves:
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z - 6, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x + 6, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesLeaves.block, EnumFacing.EAST);

						//South
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						//Leaves:
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z + 6, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x - 6, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesLeaves.block, EnumFacing.WEST);

						//West
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z - 2, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z - 3, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x - 5, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesBranch.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z - 5, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						//Leaves:
						ProcedureTreeLog.executeProcedure((int) x - 6, (int) (y + counter + 1), (int) z - 4, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + counter + 1), (int) z - 6, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);

						//East
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z + 2, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z + 3, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x + 5, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z + 5, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						//Leaves:
						ProcedureTreeLog.executeProcedure((int) x + 6, (int) (y + counter + 1), (int) z + 4, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + counter + 1), (int) z + 6, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);




						counter = counter - 3;
					}
	
				}

			}
			else {
				//Do a smaller tree
				counter = 0;
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.UP);
					counter = counter + 1;
				}
				if (TrunkHeight <=12) {
					//Simple stem:
					counter = Math.round(TrunkHeight/2);
					while (counter <= TrunkHeight) {
						//Sometimes use a strobilus:
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 1, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
						}
						counter = counter + 1;
					}
				}
				else {
					//Complex stem:
					counter = (Math.random() * 4) + 2;
					while (counter <= Math.round(TrunkHeight * 0.8)) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesBranch.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesBranch.block, EnumFacing.SOUTH);
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesBranch.block, EnumFacing.WEST);

						//Sometimes use a strobilus:
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z - 2);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z + 2);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 2, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 2, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 2, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
						}
						counter = counter + 1;
					}

					while (counter <= TrunkHeight) {
						//Sometimes use a strobilus:
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockCalamitesLeaves.block, EnumFacing.NORTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (y + counter), (int) z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockCalamitesLeaves.block, EnumFacing.SOUTH);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.EAST);
						}
						if (Math.random() >= 0.8) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 1, (int) (y + counter), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCalamitesLeaves.block, EnumFacing.WEST);
						}
						counter = counter + 1;
					}
				}
			}

			//All trees have a shoot at the top:
			Block block = world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z)), world, new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 2, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 2, (int) z)), world, new BlockPos((int) x, (int) y + TrunkHeight + 2, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z), BlockCalamitesShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 2, (int) z), BlockCalamitesShootTop.block.getDefaultState(), 3);
				}
			}

			
		ProcedureSpawnAnkyropteris.executeProcedure(x, y, z, world, LepidodendronConfig.genAnkyropterisCalamites, SaplingSpawn);
			
				
		}

	}

}