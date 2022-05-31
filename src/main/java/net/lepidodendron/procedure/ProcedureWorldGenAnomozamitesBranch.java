package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAnomozamitesLeaves;
import net.lepidodendron.block.BlockAnomozamitesLog;
import net.lepidodendron.block.BlockAnomozamitesShoot;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAnomozamitesBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAnomozamitesBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}

	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenAnomozamitesBranch!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		double counter = (double) dependencies.get("counter");
		double TreeHeight = (double) dependencies.get("TreeHeight");
		World world = (World) dependencies.get("world");
		Block block;
		boolean Trunkable;

		while (
			(counter < TreeHeight) 
			&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockAnomozamitesLog.block)
			)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockAnomozamitesLog.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockAnomozamitesLog.block)
			|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockAnomozamitesLog.block)
			|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockAnomozamitesLog.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockAnomozamitesLog.block)
			) {Trunkable = false;}
							
			if (((Math.random() * (counter/TreeHeight)) < 0.2) && Trunkable) {
				//Just trunk up:
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
					AddLeaves(world, new BlockPos((int) x, (int) y + counter , (int) z), false);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.7) || (counter > TreeHeight)) {
					if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockAnomozamitesLog.block) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockAnomozamitesShoot.block.getDefaultState(), 3);
						}
					}
					break;
				}
				else {
					if (((Math.random()) < 0.1) && Trunkable) {
						//Just trunk up:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
							AddLeaves(world, new BlockPos((int) x, (int) y + counter , (int) z), false);
						}
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenAnomozamitesBranch.executeProcedure($_dependencies);
						//break;
					}
					else {
						//Branch here:
						AddLeaves(world, new BlockPos((int) x, (int) y + counter-1, (int) z), true);
						//Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
						//	world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockValmeyerodendronStrobilus.block.getDefaultState(), 3);
						//}
						//Which way?
						if (Math.random() > 0.5) {
							//North/South:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1))) 
								&& (block != BlockAnomozamitesShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								)
							{
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockAnomozamitesLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockAnomozamitesLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x, (int) y + counter, (int) z - 1), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenAnomozamitesBranch.executeProcedure($_dependencies);
								}
							}
							
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) 
								&& (block != BlockAnomozamitesShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockAnomozamitesLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockAnomozamitesLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x, (int) y + counter, (int) z + 1), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenAnomozamitesBranch.executeProcedure($_dependencies);
								}
							}
						}
						else {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockAnomozamitesShoot.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x - 1, (int) y + counter, (int) z), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenAnomozamitesBranch.executeProcedure($_dependencies);
								}
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockAnomozamitesShoot.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockAnomozamitesLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockAnomozamitesLog.block)
								)
							{
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockAnomozamitesLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x + 1, (int) y + counter, (int) z), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenAnomozamitesBranch.executeProcedure($_dependencies);
								}
							}
						}
					}

				}
				
			}

			counter = counter + 1;
		}

		if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockAnomozamitesLog.block) {
			block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockAnomozamitesShoot.block.getDefaultState(), 3);
			}
		}
	}

	public static void AddLeaves(World world, BlockPos pos, boolean Top) {
		Block block;
		if (Math.random() > 0.7) {
			if (Top) {
				if (Math.random() > 0.66) { //Up
					block = world.getBlockState(pos.up()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.up()), world, pos.up())) {
						world.setBlockState(pos.up(), BlockAnomozamitesLeaves.block.getDefaultState().withProperty(BlockAnomozamitesLeaves.BlockCustom.FACING, EnumFacing.UP));
					}
				}
			}
			else {
				if (Math.random() > 0.9) { //North
					block = world.getBlockState(pos.north()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.north()), world, pos.north())) {
						world.setBlockState(pos.north(), BlockAnomozamitesLeaves.block.getDefaultState().withProperty(BlockAnomozamitesLeaves.BlockCustom.FACING, EnumFacing.NORTH));
					}
				}
				if (Math.random() > 0.9) { //South
					block = world.getBlockState(pos.south()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.south()), world, pos.south())) {
						world.setBlockState(pos.south(), BlockAnomozamitesLeaves.block.getDefaultState().withProperty(BlockAnomozamitesLeaves.BlockCustom.FACING, EnumFacing.SOUTH));
					}
				}
				if (Math.random() > 0.9) { //East
					block = world.getBlockState(pos.east()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.east()), world, pos.east())) {
						world.setBlockState(pos.east(), BlockAnomozamitesLeaves.block.getDefaultState().withProperty(BlockAnomozamitesLeaves.BlockCustom.FACING, EnumFacing.EAST));
					}
				}
				if (Math.random() > 0.9) { //West
					block = world.getBlockState(pos.west()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.west()), world, pos.west())) {
						world.setBlockState(pos.west(), BlockAnomozamitesLeaves.block.getDefaultState().withProperty(BlockAnomozamitesLeaves.BlockCustom.FACING, EnumFacing.WEST));
					}
				}
			}
		}
	}
}