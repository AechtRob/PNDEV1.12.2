package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBothrodendronLeaves;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureBothrodendronStrobilusNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureBothrodendronStrobilusNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 259);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BothrodendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BothrodendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BothrodendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BothrodendronStrobilusNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		boolean decayable = false;
		TileEntity tileEntity = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
		if (tileEntity != null) {
			if (tileEntity.getTileData().hasKey("decayable")) {
				decayable = tileEntity.getTileData().getBoolean("decayable");
			}
		}
		if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockBothrodendronLeaves.block.getDefaultState()
				.getBlock())) && (decayable))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
