package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockHironoiaFlower;
import net.lepidodendron.block.BlockHironoiaLeaves;
import net.lepidodendron.block.BlockHironoiaLog;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenHironoia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenHironoia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenHironoia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenHironoia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenHironoia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenHironoia!");
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
			TrunkHeight = (int) Math.round(Math.random() * 2);
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockHironoiaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 1, z, world, BlockHironoiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + TrunkHeight, z, world, BlockHironoiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + TrunkHeight, z, world, BlockHironoiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z + 1, world, BlockHironoiaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z - 1, world, BlockHironoiaLeaves.block);

			//Test for and add flowers in the top two layers
			int yct = y + TrunkHeight;
			int rad = 1;
			while ((rad >= 0) && (yct <= (y + TrunkHeight + 1))) {
				int xct = -rad;
				while (xct <= rad) {
					int zct = -rad;
					while (zct <= rad) {
						if ((yct == y) && ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int)  Math.abs(rad), 2)))) {
							//Upper
							if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHironoiaLeaves.block) && (Math.random() > 0.7) && (world.isAirBlock(new BlockPos(x + xct, yct + 1, z + zct)))) {
								world.setBlockState(new BlockPos(x + xct, yct + 1, z + zct), BlockHironoiaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(x + xct, yct + 1, z + zct);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
							}
						}
						if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) == Math.pow((int) Math.abs(rad), 2))) {
							//This is an outer leaf. Test its NSEW for air
							//North
							if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHironoiaLeaves.block) && (Math.random() > 0.7) && (world.isAirBlock(new BlockPos(x + xct, yct, z + zct - 1)))) {
								world.setBlockState(new BlockPos(x + xct, yct, z + zct - 1), BlockHironoiaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(x + xct, yct, z + zct - 1);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
							}
							//South
							if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHironoiaLeaves.block) && (Math.random() > 0.7) && (world.isAirBlock(new BlockPos(x + xct, yct, z + zct + 1)))) {
								world.setBlockState(new BlockPos(x + xct, yct, z + zct + 1), BlockHironoiaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(x + xct, yct, z + zct + 1);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
							}
							//East
							if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHironoiaLeaves.block) && (Math.random() > 0.7) && (world.isAirBlock(new BlockPos(x + xct + 1, yct, z + zct)))) {
								world.setBlockState(new BlockPos(x + xct + 1, yct, z + zct), BlockHironoiaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(x + xct + 1, yct, z + zct);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
							}
							//West
							if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHironoiaLeaves.block) && (Math.random() > 0.7) && (world.isAirBlock(new BlockPos(x + xct - 1, yct, z + zct)))) {
								world.setBlockState(new BlockPos(x + xct - 1, yct, z + zct), BlockHironoiaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(x + xct - 1, yct, z + zct);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
							}
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				yct = yct + 1;
				rad = rad - 1;
			}
			
		}
	}
}