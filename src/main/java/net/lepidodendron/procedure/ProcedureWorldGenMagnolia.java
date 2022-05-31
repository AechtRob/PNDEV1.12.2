package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockMagnoliaLeaves;
import net.lepidodendron.block.BlockMagnoliaLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMagnolia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMagnolia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenMagnolia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenMagnolia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenMagnolia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenMagnolia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double BareTrunkHeight = 1;
		double MainTrunkHeight = 0;
		double counter = 0;
		double counterext = 0;
		double randomiser = 0;
		String BranchAxis = "";
		double layer = 0;
		double branchskip = 0;
		boolean try2 = false;
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			//Trunk up to 15 blocks, and always at least 8:
			MainTrunkHeight = (double) (8);
			if (Math.random() >= 0.75) {
				MainTrunkHeight = MainTrunkHeight + Math.round((Math.random() * 100) / 14);
			}
			else {
				MainTrunkHeight = MainTrunkHeight + Math.round((Math.random() * 100) / 20);
			}

			counter = -1;
			while (counter <= MainTrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z)), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z), BlockMagnoliaLog.block.getDefaultState(), 3);
					}
					counter = (double) (counter + 1);
				}

			//Leaves at the top:
			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1)), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1)), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}


			//Generate random branches:
			counter = counter - 3;
			while (counter >= 1) {
				if ((Math.random() - branchskip) * (counter / MainTrunkHeight) > 0.2) {
					//Add a branch.
					//First pick an axis:
					randomiser = Math.random();
					if (randomiser >= 0.75) {

						if (BranchAxis == "north") {
							counter = counter + 1;
							try2 = false;
						}
						else {

							BranchAxis = "north";
							//Add the randomised extender:
							counterext = 0;
							randomiser = Math.floor(counter/5) - 1 + Math.floor((Math.random() * 3));
							
							while (randomiser > counterext) {
	
							block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1))), world,
								new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1)))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1)), BlockMagnoliaLog.block.getDefaultState(), 3);
								try {
										IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1)));
										for (IProperty<?> prop : _bs.getProperties().keySet()) {
											if (prop.getName().equals("facing")) {
												world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z - counterext - 1)),
														_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
												break;
											}
										}
									} catch (Exception e) {
									}
								
								}
								
								counterext = counterext + 1;
							}
	
							if (counterext < 1) {
								counterext = 1;
								}
							//What layer (out of three) of the tree are we in for picking a branch?
							layer = Math.ceil(counter/(MainTrunkHeight / 3));
							//Launch the branch routine from the (new) point of attachment:
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", x);
							$_dependencies.put("y", (y + (int)counter));
							$_dependencies.put("z", (z - (int)counterext));
							$_dependencies.put("world", world);
							
							if (layer == 3) {
								ProcedureWorldGenMagnoliaBranchNorth1.executeProcedure($_dependencies);
							}
							if (layer == 2) {
								ProcedureWorldGenMagnoliaBranchNorth2.executeProcedure($_dependencies);
							}
							if (layer == 1) {
								ProcedureWorldGenMagnoliaBranchNorth3.executeProcedure($_dependencies);
							}
	
							if (!try2) {
								try2= true;
							} else {
								try2 = false;
							}
						}
						
					}
					else {
						if (randomiser >= 0.55) {

							if (BranchAxis == "east") {
								counter = counter + 1;
								try2 = false;
								}
								else {
								
							BranchAxis = "east";
							//Add the randomised extender:
							counterext = 0;
							randomiser = Math.floor(counter/5) - 1 + Math.floor((Math.random() * 3));
							
							while (randomiser > counterext) {
	
							block = world.getBlockState(new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z)), world,
								new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z))) {
								world.setBlockState(new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z), BlockMagnoliaLog.block.getDefaultState(), 3);
								try {
										IBlockState _bs = world.getBlockState(new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z));
										for (IProperty<?> prop : _bs.getProperties().keySet()) {
											if (prop.getName().equals("facing")) {
												world.setBlockState(new BlockPos((int) (x + counterext + 1), (int) (y + counter), (int) z),
														_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
												break;
											}
										}
									} catch (Exception e) {
									}
								}
							
							counterext = counterext + 1;
							}

							if (counterext < 1) {
								counterext = 1;
								}
							//What layer (out of three) of the tree are we in for picking a branch?
							layer = Math.ceil(counter/(MainTrunkHeight / 3));
							//Launch the branch routine from the (new) point of attachment:
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("x", (x + (int)counterext));
							$_dependencies.put("y", (y + (int)counter));
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							
							if (layer == 3) {
								ProcedureWorldGenMagnoliaBranchEast1.executeProcedure($_dependencies);
							}
							if (layer == 2) {
								ProcedureWorldGenMagnoliaBranchEast2.executeProcedure($_dependencies);
							}
							if (layer == 1) {
								ProcedureWorldGenMagnoliaBranchEast3.executeProcedure($_dependencies);
							}

							if (!try2) {
								try2= true;
							} else {
								try2 = false;
							}

								}
							
						}
						else {
							if (randomiser >= 0.75) {
								if (BranchAxis == "south") {
									counter = counter + 1;
									try2 = false;
									}
									else {
								
								BranchAxis = "south";
								//Add the randomised extender:
								counterext = 0;
								randomiser = Math.floor(counter/5) - 1 + Math.floor((Math.random() * 3));
								
								while (randomiser > counterext) {
		
								block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z + counterext + 1))).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z + counterext - 1))), world,
									new BlockPos((int) x, (int) (y + counter), (int) (z + counterext + 1)))) {
									world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z + counterext + 1)), BlockMagnoliaLog.block.getDefaultState(), 3);
									try {
										IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z + counterext + 1)));
										for (IProperty<?> prop : _bs.getProperties().keySet()) {
											if (prop.getName().equals("facing")) {
												world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) (z + counterext + 1)),
														_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
												break;
											}
										}
									} catch (Exception e) {
									}
									}
								
								if (counterext < 1) {
									counterext = 1;
									}
								//What layer (out of three) of the tree are we in for picking a branch?
								layer = Math.ceil(counter/(MainTrunkHeight / 3));
								//Launch the branch routine from the (new) point of attachment:
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("x", x);
								$_dependencies.put("y", (y + (int)counter));
								$_dependencies.put("z", (z + (int)counterext));
								$_dependencies.put("world", world);
								
								if (layer == 3) {
									ProcedureWorldGenMagnoliaBranchSouth1.executeProcedure($_dependencies);
								}
								if (layer == 2) {
									ProcedureWorldGenMagnoliaBranchSouth2.executeProcedure($_dependencies);
								}
								if (layer == 1) {
									ProcedureWorldGenMagnoliaBranchSouth3.executeProcedure($_dependencies);
								}

								if (!try2) {
									try2= true;
								} else {
									try2 = false;
								}
							}
									}
					
							}
							else {

								if (BranchAxis == "west") {
									counter = counter + 1;
									try2 = false;
									}
									else {
										
					
								BranchAxis = "west";
								//Add the randomised extender:
								counterext = 0;
								randomiser = Math.floor(counter/5) - 1 + Math.floor((Math.random() * 3));
		
								while (randomiser > counterext) {
		
								block = world.getBlockState(new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z)), world,
									new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z))) {
									world.setBlockState(new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z), BlockMagnoliaLog.block.getDefaultState(), 3);
									try {
										IBlockState _bs = world.getBlockState(new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z));
										for (IProperty<?> prop : _bs.getProperties().keySet()) {
											if (prop.getName().equals("facing")) {
												world.setBlockState(new BlockPos((int) (x - counterext - 1), (int) (y + counter), (int) z),
														_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
												break;
											}
										}
									} catch (Exception e) {
									}
									}
		
									counterext = counterext + 1;
								}


								if (counterext < 1) {
									counterext = 1;
								}
								//What layer (out of three) of the tree are we in for picking a branch?
								layer = Math.ceil(counter/(MainTrunkHeight / 3));
								//Launch the branch routine from the (new) point of attachment:
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("x", (x - (int)counterext));
								$_dependencies.put("y", (y + (int)counter));
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								
								if (layer == 3) {
									ProcedureWorldGenMagnoliaBranchWest1.executeProcedure($_dependencies);
								}
								if (layer == 2) {
									ProcedureWorldGenMagnoliaBranchWest2.executeProcedure($_dependencies);
								}
								if (layer == 1) {
									ProcedureWorldGenMagnoliaBranchWest3.executeProcedure($_dependencies);
								}

								if (!try2) {
									try2 = true;
								} else {
									try2 = false;
								}
									}
							}
						}	
					}
				branchskip = Math.random() / 3;
				}
				else {
					branchskip = 0;
				}
				if (!try2) {
					counter = counter - 1;
				}
			}
		}
	}
}