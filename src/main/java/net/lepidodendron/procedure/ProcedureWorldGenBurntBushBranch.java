package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBurntStem;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBurntBushBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBurntBushBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}

	
	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBurntBushBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBurntBushBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBurntBushBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBurntBushBranch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenBurntBushBranch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenBurntBushBranch!");
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
			&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockBurntStem.block)
			)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockBurntStem.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockBurntStem.block)
			|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockBurntStem.block)
			|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockBurntStem.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockBurntStem.block)
			) {Trunkable = false;}
							
			if (((Math.random() * (counter/TreeHeight)) < 0.35) && Trunkable) {
				//Just trunk up:
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockBurntStem.block.getDefaultState(), 3);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.7) || (counter > TreeHeight)) {
					break;
				}
				else {
					if (((Math.random()) < 0.1) && Trunkable) {
						//Just trunk up:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockBurntStem.block.getDefaultState(), 3);
						}
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenBurntBushBranch.executeProcedure($_dependencies);
						//break;
					}
					else {
						//Branch here:
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
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockBurntStem.block)
								)
							{
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockBurntStem.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockBurntStem.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBurntBushBranch.executeProcedure($_dependencies);
								}
							}
							
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)))
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockBurntStem.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockBurntStem.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockBurntStem.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBurntBushBranch.executeProcedure($_dependencies);
								}
							}
						}
						else {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)))
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockBurntStem.block)
								)
							{
							
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockBurntStem.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockBurntStem.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBurntBushBranch.executeProcedure($_dependencies);
								}
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
								(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)))
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBurntStem.block)
								&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockBurntStem.block)
								)
							{
							//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockBurntStem.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockBurntStem.block.getDefaultState(), 3);		
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBurntBushBranch.executeProcedure($_dependencies);
								}
							}
						}
					}

				}
				
			}

			counter = counter + 1;
		}

	}
}