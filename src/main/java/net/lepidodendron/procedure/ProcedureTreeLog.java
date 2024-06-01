package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureTreeLog extends ElementsLepidodendronMod.ModElement {
	public ProcedureTreeLog(ElementsLepidodendronMod instance) {
		super(instance, 200);
	}
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	
	public static void executeProcedure(int x, int y, int z, World world, Block blockLog, EnumFacing facing) {
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
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world,
			new BlockPos((int) x, (int) y, (int) z))
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.VINE)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.SNOW)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WEB)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.PLANTS)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.LEAVES)
			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WOOD && !block.isFullCube(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))))) {

			try {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), blockLog.getDefaultState().withProperty(FACING,facing), 3);
			}
			catch (Exception e) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), blockLog.getDefaultState(), 3);
			}
		}
	}

	public static void executeProcedureOnSand(int x, int y, int z, World world, Block blockLog, EnumFacing facing) {

		Block block = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world,
				new BlockPos((int) x, (int) y, (int) z))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.SNOW)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.SAND)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WEB)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.LEAVES)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WOOD && !block.isFullCube(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))))) {

			try {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), blockLog.getDefaultState().withProperty(FACING,facing), 3);
			}
			catch (Exception e) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), blockLog.getDefaultState(), 3);
			}
		}
	}
}
