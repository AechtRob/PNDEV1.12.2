package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumOLeaves;
import net.lepidodendron.block.BlockDicroidiumOLog;
import net.lepidodendron.block.BlockDicroidiumOStrobilus;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDicroidiumO extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDicroidiumO(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDicroidiumO!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDicroidiumO!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDicroidiumO!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDicroidiumO!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int bareTrunk = 0;
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
			TrunkHeight = 12 + (int) Math.round(Math.random() * 4);
			bareTrunk = (int) Math.round((double)TrunkHeight / 2D);


			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			yy = bareTrunk + 1 + y;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);

			yy = yy + 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 3, yy, z), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 3, yy, z), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x, yy, z + 3), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x, yy, z - 3), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 4, yy, z, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 4, yy, z), world, EnumFacing.DOWN);

			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 4, yy, z, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 4, yy, z), world, EnumFacing.DOWN);

			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockDicroidiumOLog.block, EnumFacing.WEST);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 4, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x, yy, z + 4), world, EnumFacing.DOWN);

			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockDicroidiumOLog.block, EnumFacing.WEST);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 4, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x, yy, z - 4), world, EnumFacing.DOWN);

			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);

			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 2, yy, z + 1), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 2, yy, z - 1), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 2, yy, z + 1), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 2, yy, z - 1), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 2, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 1, yy, z + 2), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 2, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x + 1, yy, z - 2), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 2, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 1, yy, z + 2), world, EnumFacing.DOWN);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 2, world, BlockDicroidiumOLeaves.block);
			setStrobilus(new BlockPos(x - 1, yy, z - 2), world, EnumFacing.DOWN);

			yy = yy + 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z , world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x -2, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockDicroidiumOLeaves.block);

			yy = yy + 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockDicroidiumOLeaves.block);

			yy = yy + 2;
			if (world.rand.nextInt(2) == 0 && yy >= TrunkHeight + y) {
				//Small top:

				ProcedureTreeLog.executeProcedure(x, yy - 1, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, yy - 2, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);

				ProcedureTreeLeaf.executeProcedure(x, yy, z, world, BlockDicroidiumOLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x + 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x - 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z + 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z - 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy + 1, z, world, BlockDicroidiumOLeaves.block);

			}
			else {
				//Bigger top:

				ProcedureTreeLog.executeProcedure(x, yy - 1, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, yy - 2, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);

				ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, yy + 1, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, yy + 2, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);

				ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x + 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x - 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z + 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z - 1), world, EnumFacing.DOWN);


				ProcedureTreeLeaf.executeProcedure(x + 1, yy + 2, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x + 1, yy + 2, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x - 1, yy + 2, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x - 1, yy + 2, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy + 2, z + 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy + 2, z + 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy + 2, z - 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy + 2, z - 1), world, EnumFacing.DOWN);

				yy = yy + 2;

				ProcedureTreeLog.executeProcedure(x, yy - 1, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure(x, yy - 2, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);

				ProcedureTreeLeaf.executeProcedure(x, yy, z, world, BlockDicroidiumOLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x + 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x - 1, yy, z), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z + 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
				setStrobilus(new BlockPos(x, yy, z - 1), world, EnumFacing.DOWN);
				ProcedureTreeLeaf.executeProcedure(x, yy + 1, z, world, BlockDicroidiumOLeaves.block);

				if (yy + 1 <= TrunkHeight + y) {
					yy = TrunkHeight + y + 1;

					ProcedureTreeLog.executeProcedure(x, yy - 1, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure(x, yy - 2, z, world, BlockDicroidiumOLog.block, EnumFacing.NORTH);

					ProcedureTreeLeaf.executeProcedure(x, yy, z, world, BlockDicroidiumOLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockDicroidiumOLeaves.block);
					setStrobilus(new BlockPos(x + 1, yy, z), world, EnumFacing.DOWN);
					ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockDicroidiumOLeaves.block);
					setStrobilus(new BlockPos(x - 1, yy, z), world, EnumFacing.DOWN);
					ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockDicroidiumOLeaves.block);
					setStrobilus(new BlockPos(x, yy, z + 1), world, EnumFacing.DOWN);
					ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockDicroidiumOLeaves.block);
					setStrobilus(new BlockPos(x, yy, z - 1), world, EnumFacing.DOWN);
					ProcedureTreeLeaf.executeProcedure(x, yy + 1, z, world, BlockDicroidiumOLeaves.block);

				}

			}

		}
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	private static void setStrobilus(BlockPos pos, World world, EnumFacing facing) {
		if (Math.random() < 0.65) {
			return;
		}
		BlockPos blockpos = pos.offset(facing);
		Block block = world.getBlockState(blockpos).getBlock();
		IBlockState state = BlockDicroidiumOStrobilus.block.getDefaultState().withProperty(FACING, facing);
		if (!block.canBeReplacedByLeaves(world.getBlockState(blockpos), world,blockpos)) {
			return;
		}
		Functions.setBlockStateAndCheckForDoublePlant(world,blockpos, state, 2);
		if (!world.isRemote) {
			TileEntity _tileEntity = world.getTileEntity(blockpos);
			IBlockState _bs = world.getBlockState(blockpos);
			if (_tileEntity != null)
				_tileEntity.getTileData().setBoolean("decayable", (true));
			world.notifyBlockUpdate(blockpos, _bs, _bs, 3);
		}
	}
}