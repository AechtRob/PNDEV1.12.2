package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCalamitesBranch;
import net.lepidodendron.block.BlockCalamitesLog;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureCalamitesStrobilusNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureCalamitesStrobilusNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 370);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CalamitesStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CalamitesStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CalamitesStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CalamitesStrobilusNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockCalamitesBranch.block.getDefaultState()
.getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockCalamitesBranch.block.getDefaultState()
.getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockCalamitesBranch.block
.getDefaultState().getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockCalamitesBranch.block
.getDefaultState().getBlock())) 
			&& (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockCalamitesLog.block.getDefaultState().getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockCalamitesLog.block.getDefaultState().getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockCalamitesLog.block.getDefaultState().getBlock()))
			&& (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockCalamitesLog.block.getDefaultState().getBlock())) 
			&& (new Object() {
						public boolean getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "decayable") == true)) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
