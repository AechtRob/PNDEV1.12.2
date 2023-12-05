package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockDiaphorodendronLeaves;
import net.lepidodendron.block.BlockDiaphorodendronLog;
import net.lepidodendron.block.BlockDiaphorodendronStrobilus;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDiaphorodendron extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDiaphorodendron(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenDiaphorodendron!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenDiaphorodendron!");
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
		double counter = 0;
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {		
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk:
			TrunkHeight = 18;
			TrunkHeight = TrunkHeight + Math.round((Math.random() * 100) / 8);

			xx = x + 1;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
				
			xx = x + 2;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
				
			xx = x - 1;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
				
			xx = x - 2;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
				
			xx = x;
			yy = y;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);

			xx = x + 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x + 1;
			yy = y + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x - 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x - 1;
			yy = y + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x;
			yy = y + 1;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x;
			yy = y + 2;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
			
			xx = x;
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);

			//Main trunk
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure(x, (int) (y + counter), z, world, BlockDiaphorodendronLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) TrunkHeight - 4;
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) TrunkHeight - 4;
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			counter = counter - 1;
			
			//Leaves:
			xx = x;
			yy = (int) counter + 1 + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 3;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 3;
			yy = (int) counter + y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			yy = (int) counter + y;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 1;
			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

			yy = (int) counter + y - 2;
			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 3;
			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);


			//North
			if (Math.random() >= 0.75) {
				//Drop the branch a row
				yy = (int) counter + y - 4;
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
					
				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x - 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x - 1;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x;
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x;
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				xx = x;
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

				yy = (int) counter + y - 5;
				xx = x;
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
				//Random flowers here:
				if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy, zz, world);
				}
				if ((vines2) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy, zz, world);
				}

			}
			else {
				//Branch in normal place
				yy = (int) counter + y - 3;
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
					
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);


			xx = x + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
				
			xx = x;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 4;
			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 6;
			xx = x;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
		}

		//South
			if (Math.random() >= 0.75) {
				//Drop the branch a row
				yy = (int) counter + y - 4;
				xx = x;
				zz = z + 1;
				
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
					
			xx = x;
			zz = z + 2;
			
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
				
			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x;
			zz = z + 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

			}
			else {
				//Branch in normal place
				yy = (int) counter + y - 3;
				xx = x;
				zz = z + 1;
				
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);
					
			xx = x;
			zz = z + 2;
			
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.WEST);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 4;
			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 6;
			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
		}


		//East
			if (Math.random() >= 0.75) {
				//Drop the branch a row
				yy = (int) counter + y - 4;
				xx = x + 1;
				zz = z;
				
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
					
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x + 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

			}
			else {
				//Branch in normal place
				yy = (int) counter + y - 3;
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
					
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);

			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 4;
			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 6;
			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
		}

		//West
			if (Math.random() >= 0.75) {
				//Drop the branch a row
				yy = (int) counter + y - 4;
				xx = x - 1;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
					
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x - 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

			}
			else {
				//Branch in normal place
				yy = (int) counter + y - 3;
				xx = x - 1;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);
					
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLog.block, EnumFacing.UP);

			xx = x - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 4;
			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 5;
			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);

			yy = (int) counter + y - 6;
			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockDiaphorodendronLeaves.block);
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy - 1), (int) zz)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) xx, (int) (yy - 1), (int) zz), BlockDiaphorodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}	
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
		}

			
			ProcedureSpawnOdontopteris.executeProcedure(x, y + 3, z, world, LepidodendronConfigPlants.genOdontopterisDiaphorodendron, SaplingSpawn);
			
			}			
	}
}