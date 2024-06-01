package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTicoaLog;
import net.lepidodendron.block.BlockTicoaShoot;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTicoaBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTicoaBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}

	
	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTicoa!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTicoa!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTicoa!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTicoa!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenTicoa!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenTicoa!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		double counter = (double) dependencies.get("counter");
		double TreeHeight = (double) dependencies.get("TreeHeight");
		World world = (World) dependencies.get("world");

		while (
			(counter < TreeHeight) 
			&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockTicoaLog.block)
			)
		{

			if ((Math.random() * (counter/TreeHeight)) <= 0.05
					|| ((counter/TreeHeight) > 0.8 && world.rand.nextInt(8) != 0)) {
				//Just trunk up:
				Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))
					&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter , (int) z), EnumFacing.UP)) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter , (int) z), BlockTicoaLog.block.getDefaultState(), 3);
				}
				else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.5) || (counter > TreeHeight)) {
					if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockTicoaLog.block) {
						Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
							}
						}
					}
					break;
				}
				else {
					if ((Math.random()) < 0.10) {
						//Just trunk up:
						Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))
								&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter , (int) z), EnumFacing.UP)) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter , (int) z), BlockTicoaLog.block.getDefaultState(), 3);
						}
						else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
						}
						Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenTicoaBranch.executeProcedure($_dependencies);
						//break;
					}
					else {
						//Branch here:
						Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter , (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
						}
						//Which way?
						if (Math.random() > 0.3333) {
							//North/South:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1))) 
								&& (block != BlockTicoaShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockTicoaLog.block)
										&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), EnumFacing.SOUTH)
								)
							{
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockTicoaLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))
										&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter, (int) z - 1), EnumFacing.SOUTH)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockTicoaLog.block.getDefaultState(), 3);
									Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenTicoaBranch.executeProcedure($_dependencies);
								}
								else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockTicoaShoot.block.getDefaultState(), 3);
								}
							}
							else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockTicoaShoot.block.getDefaultState(), 3);
							}
							
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) 
								&& (block != BlockTicoaShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockTicoaLog.block)
										&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), EnumFacing.NORTH)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockTicoaLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))
										&& canTrunkHere(world, new BlockPos((int) x, (int) y + counter, (int) z + 1), EnumFacing.NORTH)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockTicoaLog.block.getDefaultState(), 3);
									Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenTicoaBranch.executeProcedure($_dependencies);
								}
								else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockTicoaShoot.block.getDefaultState(), 3);
								}
							}
							else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockTicoaShoot.block.getDefaultState(), 3);
							}
						}
						if (Math.random() > 0.3333) {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockTicoaShoot.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockTicoaLog.block)
										&& canTrunkHere(world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), EnumFacing.EAST)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockTicoaLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))
										&& canTrunkHere(world, new BlockPos((int) x - 1, (int) y + counter, (int) z), EnumFacing.EAST)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockTicoaLog.block.getDefaultState(), 3);
									Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenTicoaBranch.executeProcedure($_dependencies);
								}
								else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
								}
							}
							else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockTicoaShoot.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockTicoaLog.block)
										&& canTrunkHere(world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), EnumFacing.WEST)
								)
							{
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockTicoaLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))
										&& canTrunkHere(world, new BlockPos((int) x + 1, (int) y + counter, (int) z), EnumFacing.WEST)) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockTicoaLog.block.getDefaultState(), 3);
									Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenTicoaBranch.executeProcedure($_dependencies);
								}
								else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
									Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
								}
							}
							else if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
							}
						}
					}

				}
				
			}

			counter = counter + 1;
		}

		if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockTicoaLog.block) {
			Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockTicoaShoot.block.getDefaultState(), 3);
				}
			}
		}
	}

	public static boolean canTrunkHere(World world, BlockPos pos, EnumFacing exception) {
		boolean flag = true;
		if (world.getBlockState(pos.up()).getBlock() == BlockTicoaLog.block && exception != EnumFacing.UP) {
			flag = false;
		}
		if (world.getBlockState(pos.north()).getBlock() == BlockTicoaLog.block&& exception != EnumFacing.NORTH) {
			flag = false;
		}
		if (world.getBlockState(pos.south()).getBlock() == BlockTicoaLog.block&& exception != EnumFacing.SOUTH) {
			flag = false;
		}
		if (world.getBlockState(pos.east()).getBlock() == BlockTicoaLog.block&& exception != EnumFacing.EAST) {
			flag = false;
		}
		if (world.getBlockState(pos.west()).getBlock() == BlockTicoaLog.block&& exception != EnumFacing.WEST) {
			flag = false;
		}
		return flag;
	}
}