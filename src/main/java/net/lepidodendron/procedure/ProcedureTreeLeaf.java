package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureTreeLeaf extends ElementsLepidodendronMod.ModElement {
	public ProcedureTreeLeaf(ElementsLepidodendronMod instance) {
		super(instance, 202);
	}

	public static void executeProcedure(int x, int y, int z, World world, Block blockLeaf) {
		if (!world.isBlockLoaded(new BlockPos((int) x, (int) y, (int) z))) {
			return;
		}
		if (!world.isBlockLoaded(new BlockPos((int) x + 1, (int) y, (int) z))) {
			return;
		}
		if (!world.isBlockLoaded(new BlockPos((int) x - 1, (int) y, (int) z))) {
			return;
		}
		if (!world.isBlockLoaded(new BlockPos((int) x, (int) y, (int) z + 1))) {
			return;
		}
		if (!world.isBlockLoaded(new BlockPos((int) x, (int) y, (int) z - 1))) {
			return;
		}
		Block block = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock();
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world,
				new BlockPos((int) x, (int) y, (int) z))
				|| material.isReplaceable()
		) {
			Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), blockLeaf.getDefaultState(), 3);
		}

	}

	public static void executeProcedure(BlockPos pos, World world, Block blockLeaf) {
		if (!world.isBlockLoaded(pos)) {
			return;
		}
		if (!world.isBlockLoaded(pos.east())) {
			return;
		}
		if (!world.isBlockLoaded(pos.north())) {
			return;
		}
		if (!world.isBlockLoaded(pos.south())) {
			return;
		}
		if (!world.isBlockLoaded(pos.west())) {
			return;
		}
		Block block = world.getBlockState(pos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(pos), world,
				pos)) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos, blockLeaf.getDefaultState(), 3);
		}
	}
}
