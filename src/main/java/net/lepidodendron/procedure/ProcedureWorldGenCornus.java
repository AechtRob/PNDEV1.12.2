package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCornusFlower;
import net.lepidodendron.block.BlockCornusLeaves;
import net.lepidodendron.block.BlockHironoiaLog;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCornus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCornus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure ( Object2ObjectOpenHashMap < String, Object > dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCornus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCornus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCornus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCornus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;


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
			TrunkHeight = 2 + (int) Math.round(Math.random() * 4);
			if (Math.random() > 0.85) {
				TrunkHeight = TrunkHeight + 1;
			}
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockHironoiaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			//if (Math.random() > 0.5) {
				//Little branches:
				//North:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockHironoiaLog.block, EnumFacing.EAST);
				addLeaves(world, new BlockPos(x, yy, z - 2), EnumFacing.NORTH);

				//South:
				yy = y +  (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockHironoiaLog.block, EnumFacing.EAST);
				addLeaves(world, new BlockPos(x, yy, z + 2), EnumFacing.SOUTH);

				//East:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockHironoiaLog.block, EnumFacing.UP);
				addLeaves(world, new BlockPos(x + 2, yy, z), EnumFacing.EAST);

				//West:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockHironoiaLog.block, EnumFacing.UP);
				addLeaves(world, new BlockPos(x - 2, yy, z), EnumFacing.WEST);

			//} else {
				//No branches:
				//North:

				yy = y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x, yy - 2, z - 1), EnumFacing.NORTH);

				//South:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x, yy - 2, z + 1), EnumFacing.SOUTH);

				//East:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x + 1, yy - 2, z), EnumFacing.EAST);

				//West:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x - 1, yy - 2, z), EnumFacing.WEST);
//			}

			//Top off the tree:
			ProcedureTreeLeaf.executeProcedure(new BlockPos(x, (int) TrunkHeight + 1, z), world, BlockCornusLeaves.block);

		}

	}

	public static void addLeaves(World world, BlockPos pos, EnumFacing facing) {
		ProcedureTreeLeaf.executeProcedure(pos, world, BlockCornusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(pos.offset(facing), world, BlockCornusLeaves.block);
		addFlower(world, pos.offset(facing));
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
			ProcedureTreeLeaf.executeProcedure(pos.east(), world, BlockCornusLeaves.block);
			addFlower(world, pos.east());
			ProcedureTreeLeaf.executeProcedure(pos.west(), world, BlockCornusLeaves.block);
			addFlower(world, pos.west());
			ProcedureTreeLeaf.executeProcedure(pos.east().offset(facing.getOpposite()), world, BlockCornusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.west().offset(facing.getOpposite()), world, BlockCornusLeaves.block);
		}
		else {
			ProcedureTreeLeaf.executeProcedure(pos.north(), world, BlockCornusLeaves.block);
			addFlower(world, pos.north());
			ProcedureTreeLeaf.executeProcedure(pos.south(), world, BlockCornusLeaves.block);
			addFlower(world, pos.south());
			ProcedureTreeLeaf.executeProcedure(pos.north().offset(facing.getOpposite()), world, BlockCornusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.south().offset(facing.getOpposite()), world, BlockCornusLeaves.block);
		}
		ProcedureTreeLeaf.executeProcedure(pos.up(), world, BlockCornusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(pos.up().offset(facing.getOpposite()), world, BlockCornusLeaves.block);

	}

	public static void addFlower(World world, BlockPos pos) {

		if ((world.getBlockState(pos).getBlock() == BlockCornusLeaves.block) && (Math.random() > 0.3) && world.isAirBlock(pos.down())) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.down(), BlockCornusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.down();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(pos).getBlock() == BlockCornusLeaves.block) && (Math.random() > 0.3) && world.isAirBlock(pos.east())) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.east(), BlockCornusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.east();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(pos).getBlock() == BlockCornusLeaves.block) && (Math.random() > 0.3) && world.isAirBlock(pos.west())) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.west(), BlockCornusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.west();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(pos).getBlock() == BlockCornusLeaves.block) && (Math.random() > 0.3) && world.isAirBlock(pos.north())) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.north(), BlockCornusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.north();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(pos).getBlock() == BlockCornusLeaves.block) && (Math.random() > 0.3) && world.isAirBlock(pos.south())) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.south(), BlockCornusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.south();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}
}