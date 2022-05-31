package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockBothrodendronLeaves;
import net.lepidodendron.block.BlockBothrodendronLog;
import net.lepidodendron.block.BlockBothrodendronStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBothrodendron extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBothrodendron(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenBothrodendron!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenBothrodendron!");
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
			TrunkHeight = 15;
			TrunkHeight = TrunkHeight + Math.round((Math.random() * 100) / 10);

			LeafHeight = 6;
			LeafHeight = LeafHeight + Math.round((Math.random() * 100) / 20);

			if (LeafHeight >= TrunkHeight - 5) {
				LeafHeight = TrunkHeight / 3;
			}

			xx = x + 1;
			yy = y;
			zz = z;			
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.UP);
				
			xx = x + 2;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.UP);
				
			xx = x - 1;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.UP);
				
			xx = x - 2;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.UP);
				
			xx = x;
			yy = y;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBothrodendronLog.block, EnumFacing.WEST);
				
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, (int) (y + counter), z, world, BlockBothrodendronLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) TrunkHeight - (int) LeafHeight - 3;
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) TrunkHeight - (int) LeafHeight - 3;
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			//Top of tree:
			xx = x;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);

			xx = x;
			yy = (int) counter + 1 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);

			xx = x;
			yy = (int) counter + 2 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);

			xx = x;
			yy = (int) counter + 3 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);

			if (Math.random()>=0.5) {
				xx = x + 1;
				yy = (int) counter + y;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);

			}
			if (Math.random()>=0.5) {
				xx = x - 1;
				yy = (int) counter + y;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
			}
			if (Math.random()>=0.5) {
				xx = x;
				yy = (int) counter + y;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
			}
			if (Math.random()>=0.5) {
				xx = x;
				yy = (int) counter + y;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
			}
			

			//Rest of tree:
			counter = y + (counter - 1);
			boolean vinesplaced = false;	
			while (counter > (y + (TrunkHeight - LeafHeight))) {
				xx = x + 1;
				yy = (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				if ((vines2) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				
				xx = x - 1;
				yy = (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				if ((vines2) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				
				xx = x;
				yy = (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				if ((vines2) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				
				xx = x;
				yy = (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
				if ((vines2) && (!vinesplaced) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy, zz, world);
					vinesplaced = true;
				}
			
				counter = counter - 1;
				}

				if (Math.random() > 0.5) {
					xx = x + 1;
					yy = (int) counter;
					zz = z;
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
					//Random flowers here:
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				else {
					//Random flowers here:
					xx = x + 1;
					yy = (int) counter;
					zz = z;
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) yy, (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) yy, (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				if (Math.random() > 0.5) {
					xx = x - 1;
					yy = (int) counter;
					zz = z;
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
					//Random flowers here:
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				else {
					//Random flowers here:
					xx = x - 1;
					yy = (int) counter;
					zz = z;
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) yy, (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) yy, (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				if (Math.random() > 0.5) {
					xx = x;
					yy = (int) counter;
					zz = z + 1;
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
					//Random flowers here:
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				else {
					//Random flowers here:
					xx = x;
					yy = (int) counter;
					zz = z + 1;
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) yy, (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) yy, (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				if (Math.random() > 0.5) {
					xx = x;
					yy = (int) counter;
					zz = z - 1;
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBothrodendronLeaves.block);
					//Random flowers here:
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}
				else {
					//Random flowers here:
					xx = x;
					yy = (int) counter;
					zz = z - 1;
					if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) yy, (int) zz)))) {
						world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockBothrodendronStrobilus.block.getDefaultState(), 3);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) xx, (int) yy, (int) zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
				}

				

			ProcedureSpawnOdontopteris.executeProcedure(x, y + 1, z, world, LepidodendronConfig.genOdontopterisBothrodendron, SaplingSpawn);
			
		}			
	}
}