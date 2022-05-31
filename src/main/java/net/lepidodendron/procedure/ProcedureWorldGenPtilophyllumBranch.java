package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPtilophyllumLeaves;
import net.lepidodendron.block.BlockPtilophyllumLog;
import net.lepidodendron.block.BlockPtilophyllumShoot;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPtilophyllumBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPtilophyllumBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}


	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPtilophyllumBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPtilophyllumBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPtilophyllumBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPtilophyllumBranch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenPtilophyllumBranch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenPtilophyllumBranch!");
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
						&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockPtilophyllumLog.block)
		)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockPtilophyllumLog.block)
					|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockPtilophyllumLog.block)
					|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockPtilophyllumLog.block)
					|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockPtilophyllumLog.block)
					|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockPtilophyllumLog.block)
			) {Trunkable = false;}

			if (((Math.random() * (counter/TreeHeight)) < 0.2) && Trunkable) {
				//Just trunk up:
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
					AddLeaves(world, new BlockPos((int) x, (int) y + counter , (int) z), false);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.7) || (counter > TreeHeight)) {
					if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockPtilophyllumLog.block) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockPtilophyllumShoot.block.getDefaultState(), 3);
						}
					}
					break;
				}
				else {
					if (((Math.random()) < 0.1) && Trunkable) {
						//Just trunk up:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
							AddLeaves(world, new BlockPos((int) x, (int) y + counter , (int) z), false);
						}
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenPtilophyllumBranch.executeProcedure($_dependencies);
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
											&& (block != BlockPtilophyllumShoot.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
							)
							{
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockPtilophyllumLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockPtilophyllumLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x, (int) y + counter, (int) z - 1), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenPtilophyllumBranch.executeProcedure($_dependencies);
								}
							}

							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)))
											&& (block != BlockPtilophyllumShoot.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
							)
							{

								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockPtilophyllumLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockPtilophyllumLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x, (int) y + counter, (int) z + 1), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenPtilophyllumBranch.executeProcedure($_dependencies);
								}
							}
						}
						else {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)))
											&& (block != BlockPtilophyllumShoot.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockPtilophyllumLog.block)
							)
							{

								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x - 1, (int) y + counter, (int) z), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenPtilophyllumBranch.executeProcedure($_dependencies);
								}
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)))
											&& (block != BlockPtilophyllumShoot.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockPtilophyllumLog.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockPtilophyllumLog.block)
							)
							{
								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
								AddLeaves(world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), false);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockPtilophyllumLog.block.getDefaultState(), 3);
									AddLeaves(world, new BlockPos((int) x + 1, (int) y + counter, (int) z), false);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenPtilophyllumBranch.executeProcedure($_dependencies);
								}
							}
						}
					}

				}

			}

			counter = counter + 1;
		}

		if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockPtilophyllumLog.block) {
			block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockPtilophyllumShoot.block.getDefaultState(), 3);
			}
		}
	}

	public static void AddLeaves(World world, BlockPos pos, boolean Top) {
		Block block;
		Block block1;
		if (Math.random() > 0.7) {
			if (Top) {
				if (Math.random() > 0.66) { //Up
					block = world.getBlockState(pos.up()).getBlock();
					block1 = world.getBlockState(pos.down()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.up()), world, pos.up())
						&& block1 == BlockPtilophyllumLog.block) {
						world.setBlockState(pos.up(), BlockPtilophyllumLeaves.block.getDefaultState().withProperty(BlockPtilophyllumLeaves.BlockCustom.FACING, EnumFacing.UP));
					}
				}
			}
			else {
				if (Math.random() > 0.9) { //North
					block = world.getBlockState(pos.north()).getBlock();
					block1 = world.getBlockState(pos.south()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.north()), world, pos.north())
						&& block1 == BlockPtilophyllumLog.block) {
						world.setBlockState(pos.north(), BlockPtilophyllumLeaves.block.getDefaultState().withProperty(BlockPtilophyllumLeaves.BlockCustom.FACING, EnumFacing.NORTH));
					}
				}
				if (Math.random() > 0.9) { //South
					block = world.getBlockState(pos.south()).getBlock();
					block1 = world.getBlockState(pos.north()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.south()), world, pos.south())
						&& block1 == BlockPtilophyllumLog.block) {
						world.setBlockState(pos.south(), BlockPtilophyllumLeaves.block.getDefaultState().withProperty(BlockPtilophyllumLeaves.BlockCustom.FACING, EnumFacing.SOUTH));
					}
				}
				if (Math.random() > 0.9) { //East
					block = world.getBlockState(pos.east()).getBlock();
					block1 = world.getBlockState(pos.west()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.east()), world, pos.east())
						&& block1 == BlockPtilophyllumLog.block) {
						world.setBlockState(pos.east(), BlockPtilophyllumLeaves.block.getDefaultState().withProperty(BlockPtilophyllumLeaves.BlockCustom.FACING, EnumFacing.EAST));
					}
				}
				if (Math.random() > 0.9) { //West
					block = world.getBlockState(pos.west()).getBlock();
					block1 = world.getBlockState(pos.east()).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(pos.west()), world, pos.west())
						&& block1 == BlockPtilophyllumLog.block) {
						world.setBlockState(pos.west(), BlockPtilophyllumLeaves.block.getDefaultState().withProperty(BlockPtilophyllumLeaves.BlockCustom.FACING, EnumFacing.WEST));
					}
				}
			}
		}
	}
}