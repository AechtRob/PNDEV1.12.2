package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockIliciumFlower;
import net.lepidodendron.block.BlockIliciumLeaves;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureIliciumFlowerNeighbourBlockChanges extends ElementsLepidodendronMod.ModElement {
	public ProcedureIliciumFlowerNeighbourBlockChanges(ElementsLepidodendronMod instance) {
		super(instance, 188);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IliciumFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IliciumFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IliciumFlowerNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IliciumFlowerNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		EnumFacing facing = world.getBlockState(new BlockPos(x, y, z)).getValue(BlockIliciumFlower.BlockCustom.FACING);
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
		boolean decayable = false;
		if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
			decayable = tileEntity.getTileData().getBoolean("decayable");
		}
		if (decayable) {
			if (world.getBlockState(new BlockPos(x, y, z).offset(facing.getOpposite())).getBlock() != BlockIliciumLeaves.block) {
				world.setBlockToAir(new BlockPos(x, y, z));
			}
		}
	}
}
