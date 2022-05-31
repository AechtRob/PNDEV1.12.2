package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumFLeaves;
import net.lepidodendron.block.BlockDicroidiumFStrobilus;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureDicroidiumFStrobilusNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureDicroidiumFStrobilusNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 370);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DicroidiumFStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DicroidiumFStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DicroidiumFStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DicroidiumFStrobilusNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		BlockPos blockpos = new BlockPos(x,y,z);
		if (world.getBlockState(blockpos).getBlock() == BlockDicroidiumFStrobilus.block) {
			if (world.getBlockState(blockpos.offset(world.getBlockState(blockpos).getValue(BlockDicroidiumFStrobilus.BlockCustom.FACING).getOpposite())).getBlock() != BlockDicroidiumFLeaves.block
				&& (new Object() {
							public boolean getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable") == true)) {
				world.setBlockToAir(blockpos);
			}
		}
	}
}
