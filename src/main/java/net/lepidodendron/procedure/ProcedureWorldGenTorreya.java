package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTorreyaLeaves;
import net.lepidodendron.block.BlockTorreyaLeavesBerries;
import net.lepidodendron.block.BlockTorreyaLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTorreya extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTorreya(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTorreya!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTorreya!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = (int) Math.round(Math.random() * 2);
		int counter = 0;
		int xx = x;
		int yy = y;
		int zz = z;

		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			//Trunk:
			yy = y;
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockTorreyaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockTorreyaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.UP);

			yy = y + 1;
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);

			yy = y + 2;
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);

			yy = y + 3;
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);

			yy = y + 4;
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockTorreyaLog.block, EnumFacing.NORTH);

			//Place branches for main layer(s):
			yy = y + 3 + TrunkHeight;
			executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.NORTH);
			executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.SOUTH);
			executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.EAST);
			executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.WEST);

			if (Math.random() > 0.6) {
				yy = yy + 3;
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.NORTH);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.SOUTH);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.EAST);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.WEST);
			}

			if (Math.random() > 0.6) {
				yy = yy + 3;
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.NORTH);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.SOUTH);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.EAST);
				executeBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.WEST);
			}

			yy = yy + 3;
			executeTopBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.NORTH);
			executeTopBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.SOUTH);
			executeTopBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.EAST);
			executeTopBranch(world, new BlockPos((int) x, (int) yy, (int) z), EnumFacing.WEST);
			
			//ProcedureLeavesAroundLog.executeProcedure(x, y + TrunkHeight, z, world, BlockNothofagusLeaves.block, 1, 0.0);

		}
	}

	public static void executeBranch(World world, BlockPos pos, EnumFacing facing) {

		BlockPos blockpos = pos;
		if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
			return; //Do not place any branches in ths configuration
		}
		EnumFacing axisNS = EnumFacing.UP;
		EnumFacing axisEW = EnumFacing.WEST;
		EnumFacing axisUD = EnumFacing.NORTH;
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) 
		{
			axisNS = EnumFacing.WEST;
			axisEW = EnumFacing.UP;
		}

		blockpos = getBlockPos(pos, facing, 0, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, 1, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -1, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, -1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 0, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, 1, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -1, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, -1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 0, 2, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, 1, 2, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -1, 2, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 2, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 2, -1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		
		blockpos = getBlockPos(pos, facing, 0, 0, 2);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 3);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 0, 0, 4);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 0, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 0, 0, 6);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 7);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 8);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 9);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 1, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		blockpos = getBlockPos(pos, facing, 2, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		blockpos = getBlockPos(pos, facing, 3, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 2, 1, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, -1, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		blockpos = getBlockPos(pos, facing, -2, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		blockpos = getBlockPos(pos, facing, -3, 0, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -2, 1, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		
		blockpos = getBlockPos(pos, facing, 2, 0, 6);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 2, 0, 7);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos.up());
		blockpos = getBlockPos(pos, facing, 2, 0, 8);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 3, 0, 7);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, -2, 0, 6);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, -2, 0, 7);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos.up());
		blockpos = getBlockPos(pos, facing, -2, 0, 8);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -3, 0, 7);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 0, 1, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, 0, 2, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 2, 6);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		
	}

	public static void executeTopBranch(World world, BlockPos pos, EnumFacing facing) {

		BlockPos blockpos = pos;
		if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
			return; //Do not place any branches in ths configuration
		}
		EnumFacing axisNS = EnumFacing.UP;
		EnumFacing axisEW = EnumFacing.WEST;
		EnumFacing axisUD = EnumFacing.NORTH;
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) 
		{
			axisNS = EnumFacing.WEST;
			axisEW = EnumFacing.UP;
		}

		blockpos = getBlockPos(pos, facing, 0, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, 1, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 0, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 0, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 0, -1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		blockpos = getBlockPos(pos, facing, 0, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 1, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 1, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 1, -1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
		{
			blockpos = getBlockPos(pos, facing, -1, 0, 1);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, -2, 0, 1);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, -2, 0, 2);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, -3, 0, 2);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, -3, 0, 3);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, 1, 0, 1);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, 2, 0, 1);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, 2, 0, 2);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, 3, 0, 2);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisEW);
			PlaceLeaves(world, blockpos);
			blockpos = getBlockPos(pos, facing, 3, 0, 3);
			ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
			PlaceLeaves(world, blockpos);
		}
		
		blockpos = getBlockPos(pos, facing, 0, 0, 2);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 0, 3);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, 3);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, 4);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, 5);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisNS);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 0, 2, 0);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockTorreyaLog.block, axisUD);
		blockpos = getBlockPos(pos, facing, -1, 2, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 2, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 2, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -2, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		
		blockpos = getBlockPos(pos, facing, 0, 3, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 3, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 3, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 0, 3, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 3, -1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 3, -1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());

		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, 1, 2, -1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 2, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
		blockpos = getBlockPos(pos, facing, -1, 2, -1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, getLeaves());
	}

	public static BlockPos getBlockPos(BlockPos pos, EnumFacing facing, int offsetX, int offsetY, int offsetZ)
	{
		BlockPos blockpos = pos; //our final returned position
		if (facing == EnumFacing.NORTH) {
			return blockpos.add(offsetX, offsetY, offsetZ);
		}
		if (facing == EnumFacing.SOUTH) {
			return blockpos.add(-offsetX, offsetY, -offsetZ);
		}
		if (facing == EnumFacing.WEST) {
			return blockpos.add(offsetZ, offsetY, offsetX);
		}
		if (facing == EnumFacing.EAST) {
			return blockpos.add(-offsetZ, offsetY, -offsetX);
		}
		return blockpos.add(offsetX, offsetY, offsetZ);
	}

	public static Block getLeaves()
	{
		if (Math.random() > 0.8) {
			return BlockTorreyaLeavesBerries.block;
		}
		return BlockTorreyaLeaves.block;
	}

	public static void PlaceLeaves(World world, BlockPos pos) 
	{
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY() + 1, pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX() + 1, pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX() - 1, pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() + 1, world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() - 1, world, getLeaves());}
		
	}
	
}