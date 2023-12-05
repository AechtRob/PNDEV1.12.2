package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArchaeopterisStunted extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArchaeopterisStunted(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArchaeopterisStunted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArchaeopterisStunted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArchaeopterisStunted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArchaeopterisStunted!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenArchaeopterisStunted!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		boolean vines = (boolean) dependencies.get("vines");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;

		//System.err.println("Spawning tree: " + x + " " + y + " " + z);

		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z))
		) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 7 + (int) Math.round(Math.random());
			counter = 0;

			while (counter < TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockArchaeopterisLog.block, EnumFacing.NORTH);
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.8)) {
					int vinexx = x;
					int vineyy = y + counter;
					int vinezz = z;
					ProcedureVines.executeProcedure(vinexx, vineyy, vinezz, world);
				}
				counter = counter + 1;
			}

			//Four layers always the same:

			Leaves((int) x, (int) (y + TrunkHeight), (int) z, world, EnumFacing.UP);

			LeavesSmall((int) x, (int) (y + TrunkHeight - 1), (int) z - 1, world, EnumFacing.NORTH);
			LeavesSmall((int) x, (int) (y + TrunkHeight - 1), (int) z + 1, world, EnumFacing.SOUTH);
			LeavesSmall((int) x + 1, (int) (y + TrunkHeight - 1), (int) z, world, EnumFacing.EAST);
			LeavesSmall((int) x - 1, (int) (y + TrunkHeight - 1), (int) z, world, EnumFacing.WEST);
		
			Leaves((int) x, (int) (y + TrunkHeight - 2), (int) z - 1, world, EnumFacing.NORTH);
			Leaves((int) x, (int) (y + TrunkHeight - 2), (int) z + 1, world, EnumFacing.SOUTH);
			Leaves((int) x + 1, (int) (y + TrunkHeight - 2), (int) z, world, EnumFacing.EAST);
			Leaves((int) x - 1, (int) (y + TrunkHeight - 2), (int) z, world, EnumFacing.WEST);

			//West
			Leaves((int) (x - 1), (int) (y + TrunkHeight - 3), (int) z, world, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) (x - 1), (int) (y + TrunkHeight - 3), (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
			Leaves((int) (x - 2), (int) (y + TrunkHeight - 3), (int) z, world, EnumFacing.WEST);
			Leaves((int) (x - 1), (int) (y + TrunkHeight - 3), (int) z + 1, world, EnumFacing.SOUTH);

			//East
			Leaves((int) (x + 1), (int) (y + TrunkHeight - 3), (int) z, world, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + TrunkHeight - 3), (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
			Leaves((int) (x + 2), (int) (y + TrunkHeight - 3), (int) z, world, EnumFacing.EAST);
			Leaves((int) (x + 1), (int) (y + TrunkHeight - 3), (int) z - 1, world, EnumFacing.NORTH);

			//South
			Leaves((int) (x), (int) (y + TrunkHeight - 3), (int) z + 1, world, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
			Leaves((int) (x), (int) (y + TrunkHeight - 3), (int) z + 2, world, EnumFacing.SOUTH);
			Leaves((int) (x + 1), (int) (y + TrunkHeight - 3), (int) z + 1, world, EnumFacing.EAST);

			//North
			Leaves((int) (x), (int) (y + TrunkHeight - 3), (int) z - 1, world, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight - 3), (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
			Leaves((int) (x), (int) (y + TrunkHeight - 3), (int) z - 2, world, EnumFacing.NORTH);
			Leaves((int) (x - 1), (int) (y + TrunkHeight - 3), (int) z - 1, world, EnumFacing.WEST);


			ProcedureSpawnXenocladia.executeProcedure(x, (int) dependencies.get("y"), z, world, LepidodendronConfigPlants.genXenocladiaArchaeopteris, SaplingSpawn);

		}

	}

	public static void Leaves(int x, int y, int z, World world, EnumFacing facing) {
		BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
		if ((facing == EnumFacing.UP) || (facing == EnumFacing.DOWN)) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
			) {
				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.NORTH) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.north()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north()), world, pos)
				&& world.getBlockState(pos.north(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north(2)), world, pos)
				&& world.getBlockState(pos.north(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north(3)), world, pos)
			) {
				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.north(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.north(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.north(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.SOUTH) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south()), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south(2)), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south(3)), world, pos)
			) {
				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.south(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.south(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.south(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.EAST) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.east()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east()), world, pos)
				&& world.getBlockState(pos.east(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east(2)), world, pos)
				&& world.getBlockState(pos.east(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east(3)), world, pos)
			) {
				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.east(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.east(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.east(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.WEST) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.west()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west()), world, pos)
				&& world.getBlockState(pos.west(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west(2)), world, pos)
				&& world.getBlockState(pos.west(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west(3)), world, pos)
			) {
				Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.west(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.west(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				Functions.setBlockStateAndCheckForDoublePlant(world,pos.west(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

	}

	public static void LeavesSmall(int x, int y, int z, World world, EnumFacing facing) {
		BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
		if (world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockArchaeopterisLeavesSmall.block.getDefaultState().withProperty(FACING,facing), 3);
		}
	}
	

}