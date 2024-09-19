package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSynchysidendronLeaves;
import net.lepidodendron.block.BlockSynchysidendronStrobilus;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureSynchysidendronStrobilusNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureSynchysidendronStrobilusNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 219);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SynchysidendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SynchysidendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SynchysidendronStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SynchysidendronStrobilusNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean decayable = false;
		TileEntity te = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
		if (te != null) {
			if (te instanceof BlockSynchysidendronStrobilus.TileEntityCustom) {
				BlockSynchysidendronStrobilus.TileEntityCustom tileStrobilus = (BlockSynchysidendronStrobilus.TileEntityCustom) te;
				if (tileStrobilus.getTileData().hasKey("decayable")) {
					decayable = tileStrobilus.getTileData().getBoolean("decayable");
				}
			}
		}
		if (((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockSynchysidendronLeaves.block.getDefaultState()
				.getBlock())) && (decayable))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
