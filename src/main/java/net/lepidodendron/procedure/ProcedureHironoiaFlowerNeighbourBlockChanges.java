package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockHironoiaLeaves;
import net.minecraft.block.BlockDirectional;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureHironoiaFlowerNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureHironoiaFlowerNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 826);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HironoiaFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HironoiaFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HironoiaFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HironoiaFlowerNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		//North
		if (((world.getBlockState(new BlockPos((int) (x), (int) y, (int) z))).getValue(BlockDirectional.FACING) == EnumFacing.NORTH) 
			&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() != BlockHironoiaLeaves.block)
			&& ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable")) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			return;
		}
		//South
		if (((world.getBlockState(new BlockPos((int) (x), (int) y, (int) z))).getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) 
			&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() != BlockHironoiaLeaves.block)
			&& ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable")) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			return;
		}
		//East
		if (((world.getBlockState(new BlockPos((int) (x), (int) y, (int) z))).getValue(BlockDirectional.FACING) == EnumFacing.EAST) 
			&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z)))).getBlock() != BlockHironoiaLeaves.block)
			&& ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable")) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			return;
		}
		//West
		if (((world.getBlockState(new BlockPos((int) (x), (int) y, (int) z))).getValue(BlockDirectional.FACING) == EnumFacing.WEST) 
			&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z)))).getBlock() != BlockHironoiaLeaves.block)
			&& ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable")) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			return;
		}
		//Down
		if (((world.getBlockState(new BlockPos((int) (x), (int) y, (int) z))).getValue(BlockDirectional.FACING) == EnumFacing.DOWN) 
			&& ((world.getBlockState(new BlockPos((int) (x), (int) (y + 1), (int) (z)))).getBlock() != BlockHironoiaLeaves.block)
			&& ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable")) == (true))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			return;
		}
	}
}
