package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockArchaeanthusFlower;
import net.lepidodendron.block.BlockArchaeanthusLeaves;
import net.lepidodendron.block.BlockArchaeanthusLog;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArchaeanthus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArchaeanthus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArchaeanthus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArchaeanthus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArchaeanthus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArchaeanthus!");
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
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockArchaeanthusLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			if (Math.random() > 0.5) {
				//Little branches:
				//North:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArchaeanthusLog.block, EnumFacing.EAST);
				addLeaves(world, new BlockPos(x, yy, z - 2), EnumFacing.NORTH);

				//South:
				yy = y +  (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArchaeanthusLog.block, EnumFacing.EAST);
				addLeaves(world, new BlockPos(x, yy, z + 2), EnumFacing.SOUTH);

				//East:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArchaeanthusLog.block, EnumFacing.UP);
				addLeaves(world, new BlockPos(x + 2, yy, z), EnumFacing.EAST);

				//West:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArchaeanthusLog.block, EnumFacing.UP);
				addLeaves(world, new BlockPos(x - 2, yy, z), EnumFacing.WEST);

			} else {
				//No branches:
				//North:
				yy = y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x, yy, z - 1), EnumFacing.NORTH);

				//South:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x, yy, z + 1), EnumFacing.SOUTH);

				//East:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x + 1, yy, z), EnumFacing.EAST);

				//West:
				yy =  y + (int) (TrunkHeight - Math.round(Math.random()));
				addLeaves(world, new BlockPos(x - 1, yy, z), EnumFacing.WEST);
			}

			//Top off the tree:
			ProcedureTreeLeaf.executeProcedure(new BlockPos(x, (int) TrunkHeight + 1, z), world, BlockArchaeanthusLeaves.block);

		}

	}

	public static void addLeaves(World world, BlockPos pos, EnumFacing facing) {
		ProcedureTreeLeaf.executeProcedure(pos, world, BlockArchaeanthusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(pos.offset(facing), world, BlockArchaeanthusLeaves.block);
		addFlower(world, pos.offset(facing));
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
			ProcedureTreeLeaf.executeProcedure(pos.east(), world, BlockArchaeanthusLeaves.block);
			addFlower(world, pos.east());
			ProcedureTreeLeaf.executeProcedure(pos.west(), world, BlockArchaeanthusLeaves.block);
			addFlower(world, pos.west());
			ProcedureTreeLeaf.executeProcedure(pos.east().offset(facing.getOpposite()), world, BlockArchaeanthusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.west().offset(facing.getOpposite()), world, BlockArchaeanthusLeaves.block);
		}
		else {
			ProcedureTreeLeaf.executeProcedure(pos.north(), world, BlockArchaeanthusLeaves.block);
			addFlower(world, pos.north());
			ProcedureTreeLeaf.executeProcedure(pos.south(), world, BlockArchaeanthusLeaves.block);
			addFlower(world, pos.south());
			ProcedureTreeLeaf.executeProcedure(pos.north().offset(facing.getOpposite()), world, BlockArchaeanthusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.south().offset(facing.getOpposite()), world, BlockArchaeanthusLeaves.block);
		}
		ProcedureTreeLeaf.executeProcedure(pos.up(), world, BlockArchaeanthusLeaves.block);
		ProcedureTreeLeaf.executeProcedure(pos.up().offset(facing.getOpposite()), world, BlockArchaeanthusLeaves.block);

	}

	public static void addFlower(World world, BlockPos pos) {

		if ((world.getBlockState(pos).getBlock() == BlockArchaeanthusLeaves.block) && (Math.random() > 0.4) && world.isAirBlock(pos.down())) {
			world.setBlockState(pos.down(), BlockArchaeanthusFlower.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 3);
			if (!world.isRemote) {
				BlockPos _bp = pos.down();
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}
}