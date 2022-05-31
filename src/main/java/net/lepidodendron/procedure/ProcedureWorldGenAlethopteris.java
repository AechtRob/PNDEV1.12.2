package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAlethopterisLeaves;
import net.lepidodendron.block.BlockAlethopterisLeaves1;
import net.lepidodendron.block.BlockAlethopterisLog;
import net.lepidodendron.block.BlockAlethopterisStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAlethopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAlethopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAlethopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAlethopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAlethopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAlethopteris!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;
		
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
			
			//Trunk: 9-25 blocks
			TrunkHeight = 9 + Math.round(Math.random() * 16);
			
			//Trunk base has "prop roots":
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) z + 1, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) z - 1, world, BlockAlethopterisLog.block, EnumFacing.DOWN);

			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) z + 1, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) z - 1, world, BlockAlethopterisLog.block, EnumFacing.DOWN);

			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) z + 2, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) z - 2, world, BlockAlethopterisLog.block, EnumFacing.DOWN);

			xx = x + 2;
			zz = z;
			counter = 1;
			while ((((int) y - counter) > 0)
			 	&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
				))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			
			xx = x - 2;
			zz = z;
			counter = 1;
			while ((((int) y - counter) > 0)
			 	&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
				))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			
			xx = x;
			zz = z + 2;
			counter = 1;
			while ((((int) y - counter) > 0)
			 	&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
				))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}
			
			xx = x;
			zz = z - 2;
			counter = 1;
			while ((((int) y - counter) > 0)
			 	&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
				))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}

			counter = 1;
			while (counter < TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAlethopterisLog.block, EnumFacing.DOWN);
				counter = counter + 1;
			}

			//Leaves:
			yy = y + (int) TrunkHeight + 1;
			ProcedureTreeLeaf.executeProcedure(x, yy, z, world, BlockAlethopterisLeaves.block);
			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockAlethopterisLeaves.block);
			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockAlethopterisLeaves.block);
			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockAlethopterisLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockAlethopterisLeaves.block);

			counter = 0;
			while (counter < (TrunkHeight/2) - 5)  {
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 4, y + (int) TrunkHeight - (int) counter - 1, z, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 4, y + (int) TrunkHeight - (int) counter - 1, z, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + (int) TrunkHeight - (int) counter - 1, z + 4, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + (int) TrunkHeight - (int) counter - 1, z - 4, world, BlockAlethopterisLeaves1.block);
				counter = counter + 1;
			}
			if (((world.getBlockState(new BlockPos(x + 4, y + (int) TrunkHeight - (int) counter, z))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x + 4, y + (int) TrunkHeight - (int) counter - 1, z)))) {
				world.setBlockState(new BlockPos(x + 4, y + (int) TrunkHeight - (int) counter - 1, z), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x + 4, y + (int) TrunkHeight - (int) counter - 1, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x - 4, y + (int) TrunkHeight - (int) counter, z))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x - 4, y + (int) TrunkHeight - (int) counter - 1, z)))) {
				world.setBlockState(new BlockPos(x - 4, y + (int) TrunkHeight - (int) counter - 1, z), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x - 4, y + (int) TrunkHeight - (int) counter - 1, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter, z + 4))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z + 4)))) {
				world.setBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z + 4), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z + 4);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter, z - 4))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z - 4)))) {
				world.setBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z - 4), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, y + (int) TrunkHeight - (int) counter - 1, z - 4);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}

			counter = 0;
			while (counter < (TrunkHeight/2))  {
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 2, y + (int) TrunkHeight - (int) counter - 3, z, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 2, y + (int) TrunkHeight - (int) counter - 3, z, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + (int) TrunkHeight - (int) counter - 3, z + 2, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + (int) TrunkHeight - (int) counter - 3, z - 2, world, BlockAlethopterisLeaves1.block);
				counter = counter + 1;
			}
			if (((world.getBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 2, z))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z)))) {
				world.setBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 2, z))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z)))) {
				world.setBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 2, z + 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z + 2)))) {
				world.setBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z + 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z + 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 2, z - 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z - 2)))) {
				world.setBlockState(new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z - 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, y + (int) TrunkHeight - (int) counter - 3, z - 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}

			counter = 0;
			while (counter < (TrunkHeight/2) - 3)  {
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 2, y + (int) TrunkHeight - (int) counter - 3, z + 2, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 2, y + (int) TrunkHeight - (int) counter - 3, z - 2, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 2, y + (int) TrunkHeight - (int) counter - 3, z + 2, world, BlockAlethopterisLeaves1.block);
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 2, y + (int) TrunkHeight - (int) counter - 3, z - 2, world, BlockAlethopterisLeaves1.block);
				counter = counter + 1;
			}
			if (((world.getBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 2, z + 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z + 2)))) {
				world.setBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z + 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z + 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 2, z - 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z - 2)))) {
				world.setBlockState(new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z - 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x + 2, y + (int) TrunkHeight - (int) counter - 3, z - 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 2, z + 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z + 2)))) {
				world.setBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z + 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z + 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 2, z - 2))).getBlock() == BlockAlethopterisLeaves1.block) && (world.isAirBlock(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z - 2)))) {
				world.setBlockState(new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z - 2), BlockAlethopterisStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x - 2, y + (int) TrunkHeight - (int) counter - 3, z - 2);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}

			
		}
	}
}