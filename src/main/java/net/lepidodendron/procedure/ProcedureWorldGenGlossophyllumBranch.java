package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockGlossophyllumLog;
import net.lepidodendron.block.BlockGlossophyllumShoot;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGlossophyllumBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGlossophyllumBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}

	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGlossophyllumBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGlossophyllumBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGlossophyllumBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGlossophyllumBranch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenGlossophyllumBranch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenGlossophyllumBranch!");
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
			&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockGlossophyllumLog.block)
			)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockGlossophyllumLog.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockGlossophyllumLog.block)
			|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockGlossophyllumLog.block)
			|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockGlossophyllumLog.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockGlossophyllumLog.block)
			) {Trunkable = false;}
							
			if (((Math.random() * (counter/TreeHeight)) < 0.3) && Trunkable) {
				//Just trunk up:
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.85) || (counter > TreeHeight)) {
					//if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockGlossophyllumLog.block) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockGlossophyllumShoot.block.getDefaultState(), 3);
						}
					//}
					break;
				}
				else {
					if (((Math.random()) < 0.06) && Trunkable) {
						//Just trunk up:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);
						}
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenGlossophyllumBranch.executeProcedure($_dependencies);
						//break;
					}
					else {
						//Branch here:
						//Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
						//	world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockGlossophyllumShoot.block.getDefaultState(), 3);
						//}
						//Which way?
						if (Math.random() > 0.5) {
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockGlossophyllumShoot.block.getDefaultState(), 3);
							}
						}

						if (Math.random() > 0.5) {
							//North/South:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1))) 
								&& (block != BlockGlossophyllumShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								)
							{
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockGlossophyllumLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockGlossophyllumLog.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenGlossophyllumBranch.executeProcedure($_dependencies);
								}
							}
							
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) 
								&& (block != BlockGlossophyllumShoot.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockGlossophyllumLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockGlossophyllumLog.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenGlossophyllumBranch.executeProcedure($_dependencies);
								}
							}
						}
						else {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockGlossophyllumShoot.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenGlossophyllumBranch.executeProcedure($_dependencies);
								}
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) 
								&& (block != BlockGlossophyllumShoot.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockGlossophyllumLog.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockGlossophyllumLog.block)
								)
							{
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockGlossophyllumLog.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenGlossophyllumBranch.executeProcedure($_dependencies);
								}
							}
						}
					}

				}
				
			}

			counter = counter + 1;
		}

		if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockGlossophyllumLog.block) {
			block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockGlossophyllumShoot.block.getDefaultState(), 3);
			}
		}
	}
}