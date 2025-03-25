package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockSatpuraphyllumLeaves;
import net.lepidodendron.block.BlockSatpuraphyllumStrobilus;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureSatpuraphyllumStrobilusNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureSatpuraphyllumStrobilusNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 370);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SatpuraphyllumStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SatpuraphyllumStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SatpuraphyllumStrobilusNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SatpuraphyllumStrobilusNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		BlockPos blockpos = new BlockPos(x,y,z);
		if (world.getBlockState(blockpos).getBlock() == BlockSatpuraphyllumStrobilus.block) {
			if (world.getBlockState(blockpos.offset(world.getBlockState(blockpos).getValue(BlockSatpuraphyllumStrobilus.BlockCustom.FACING).getOpposite())).getBlock() != BlockSatpuraphyllumLeaves.block
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
