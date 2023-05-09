package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockGunneraLeaves;
import net.lepidodendron.block.BlockGunneraSapling;
import net.lepidodendron.block.BlockGunneraShoot;
import net.lepidodendron.block.BlockGunneraShootFlower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGunnera extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGunnera(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGunnera!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGunnera!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGunnera!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGunnera!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		Material material = world.getBlockState(new BlockPos((int) x, (int) y - 1, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
				&& (material == Material.GRASS
				|| material == Material.GROUND
				|| material == Material.CLAY
				|| material == Material.SAND)
		) {
			BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
			world.setBlockToAir(pos);
			int nodesMax = world.rand.nextInt(6) + 3;
			int nodesN = world.rand.nextInt(3) + 1;
			int nodesE = world.rand.nextInt(3) + 1;
			int nodesS = world.rand.nextInt(3) + 1;
			int nodesW = world.rand.nextInt(3) + 1;
			int node = 0;

			setShoot(world, pos);

			Integer[] intList = {0, 1, 2, 3};
			List<Integer> list = Arrays.asList(intList);
			Collections.shuffle(list);
			list.toArray(intList);
			for (int ii = 0; ii <= 3; ii++) {
				Integer iii = intList[ii];
				switch (iii) {
					case 0:
					default: //North:
						node = addNodeN(world, pos.north(), nodesMax, nodesN, node, 0);
						break;

					case 1: //East:
						node = addNodeE(world, pos.east(), nodesMax, nodesE, node, 0);
						break;

					case 2: //South:
						node = addNodeS(world, pos.south(), nodesMax, nodesS, node, 0);
						break;

					case 3: //West:
						node = addNodeW(world, pos.west(), nodesMax, nodesW, node, 0);
						break;
				}
			}
		}
	}

	public static EnumFacing pickDirection(EnumFacing facing) {
		if (Math.random() > 0.8) {
			return facing;
		}
		Integer[] intList = {0, 1, 2, 3};
		List<Integer> list = Arrays.asList(intList);
		Collections.shuffle(list);
		list.toArray(intList);
		switch (intList[0]) {
			case 0: default: //North:
				return EnumFacing.NORTH;

			case 1: //East:
				return EnumFacing.EAST;

			case 2: //South:
				return EnumFacing.SOUTH;

			case 3: //West:
				return EnumFacing.WEST;
		}
	}

	public static int addNodeN(World world, BlockPos pos, int nodesMax, int nodesDirectionMax, int node, int nodeDirection) {
		node ++;
		nodeDirection ++;
		if (nodeDirection > nodesDirectionMax || node > nodesMax) {
			//We have made enough nodes for this one
			return node;
		}
		if (canPlaceNode(world, pos)) {
			setShoot(world, pos);
			node = addNodeN(world, pos.offset(pickDirection(EnumFacing.NORTH)), nodesMax, nodesDirectionMax, node, nodeDirection);
		}
		else {
			return node;
		}
		return node;
	}

	public static int addNodeE(World world, BlockPos pos, int nodesMax, int nodesDirectionMax, int node, int nodeDirection) {
		node ++;
		nodeDirection ++;
		if (nodeDirection > nodesDirectionMax || node > nodesMax) {
			//We have made enough nodes for this one
			return node;
		}
		if (canPlaceNode(world, pos)) {
			setShoot(world, pos);
			node = addNodeE(world, pos.offset(pickDirection(EnumFacing.EAST)), nodesMax, nodesDirectionMax, node, nodeDirection);
		}
		else {
			return node;
		}
		return node;
	}

	public static int addNodeS(World world, BlockPos pos, int nodesMax, int nodesDirectionMax, int node, int nodeDirection) {
		node ++;
		nodeDirection ++;
		if (nodeDirection > nodesDirectionMax || node > nodesMax) {
			//We have made enough nodes for this one
			return node;
		}
		if (canPlaceNode(world, pos)) {
			setShoot(world, pos);
			node = addNodeS(world, pos.offset(pickDirection(EnumFacing.SOUTH)), nodesMax, nodesDirectionMax, node, nodeDirection);
		}
		else {
			return node;
		}
		return node;
	}

	public static int addNodeW(World world, BlockPos pos, int nodesMax, int nodesDirectionMax, int node, int nodeDirection) {
		node ++;
		nodeDirection ++;
		if (nodeDirection > nodesDirectionMax || node > nodesMax) {
			//We have made enough nodes for this one
			return node;
		}
		if (canPlaceNode(world, pos)) {
			setShoot(world, pos);
			node = addNodeW(world, pos.offset(pickDirection(EnumFacing.WEST)), nodesMax, nodesDirectionMax, node, nodeDirection);
		}
		else {
			return node;
		}
		return node;
	}

	public static boolean canPlaceNode(World world, BlockPos pos) {
		IBlockState blockstate = world.getBlockState(pos);
		Block block = blockstate.getBlock();
		Material material = blockstate.getMaterial();
		if (block.canBeReplacedByLeaves(blockstate, world, pos)
				|| block == BlockGunneraShoot.block
				|| block == BlockGunneraShootFlower.block
				|| (material == Material.VINE)
				|| (material == Material.SNOW)
				|| (material == Material.WEB)
				|| (material == Material.WATER)
				|| (material == Material.PLANTS)
				|| (material == Material.LEAVES)
				|| (material == Material.WOOD && !block.isFullCube(blockstate))) {
			return couldPlaceSapling(world, pos);
		}
		return false;
	}

	public static boolean couldPlaceSapling(World world, BlockPos pos) {
		Block block2 = world.getBlockState(pos.down()).getBlock();
		return (((world.getBlockState(pos.down())).getMaterial() == Material.SAND) || block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, new BlockGunneraSapling.BlockCustom()) || block2 == null);
	}

	public static boolean canPlaceLeaves(World world, BlockPos pos) {
		IBlockState blockstate = world.getBlockState(pos);
		Block block = blockstate.getBlock();
		Material material = blockstate.getMaterial();
		if (block.canBeReplacedByLeaves(blockstate, world, pos)
			|| material.isReplaceable()
		) {
			return true;
		}
		return false;
	}

	public static void setShoot(World world, BlockPos pos) {
		if (Math.random() > 0.9) {
			world.setBlockState(pos, BlockGunneraShootFlower.block.getDefaultState());
		}
		else {
			world.setBlockState(pos, BlockGunneraShootFlower.block.getDefaultState());
		}
		if (Math.random() > 0.3) {
			if (canPlaceLeaves(world, pos.up())) {
				world.setBlockState(pos.up(), BlockGunneraLeaves.block.getDefaultState().withProperty(BlockGunneraLeaves.BlockCustom.FACING, EnumFacing.UP));
			}
		}
		if (Math.random() > 0.1) {
			if (canPlaceLeaves(world, pos.north())) {
				world.setBlockState(pos.north(), BlockGunneraLeaves.block.getDefaultState().withProperty(BlockGunneraLeaves.BlockCustom.FACING, EnumFacing.NORTH));
			}
		}
		if (Math.random() > 0.1) {
			if (canPlaceLeaves(world, pos.east())) {
				world.setBlockState(pos.east(), BlockGunneraLeaves.block.getDefaultState().withProperty(BlockGunneraLeaves.BlockCustom.FACING, EnumFacing.EAST));
			}
		}
		if (Math.random() > 0.1) {
			if (canPlaceLeaves(world, pos.south())) {
				world.setBlockState(pos.south(), BlockGunneraLeaves.block.getDefaultState().withProperty(BlockGunneraLeaves.BlockCustom.FACING, EnumFacing.SOUTH));
			}
		}
		if (Math.random() > 0.1) {
			if (canPlaceLeaves(world, pos.west())) {
				world.setBlockState(pos.west(), BlockGunneraLeaves.block.getDefaultState().withProperty(BlockGunneraLeaves.BlockCustom.FACING, EnumFacing.WEST));
			}
		}
	}

}