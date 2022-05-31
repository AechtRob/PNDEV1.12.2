package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPodozamitesLeaves;
import net.lepidodendron.block.BlockPodozamitesLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPodozamites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPodozamites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPodozamites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPodozamites!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		double randomiser = 0;
		int branchlength;
		int branchcount;
		int direction = 0;
		int direction2 = 0;
		int direction3 = 0;
		
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
			TrunkHeight = 11;
			if (Math.random()>0.3) {
				TrunkHeight = TrunkHeight + (int) Math.round((Math.random() * 4));
			}
			if (Math.random()>0.6) {
				TrunkHeight = TrunkHeight + (int) Math.round((Math.random() * 5));
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			//Base:
			ProcedureTreeLog.executeProcedure((x - 1), y, z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), y, (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y + 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y + 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y + 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y + 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), z, world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x - 1), (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), (z + 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((x + 1), (y - 1), (z - 1), world, BlockPodozamitesLog.block, EnumFacing.NORTH);

			counter = ((int) Math.round((double) TrunkHeight/2)); 
			//Start branches here
			while (counter < TrunkHeight) {
				//first branch always places somewhere
				//second branch is only 50% likely
				//third branch only has a 10% chance
				//branches are 2-5 long, but they taper toward the tip of the tree
				//if this is the penultimate layer of the tree, the branch will only be 1 long

				branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
				if (counter == TrunkHeight - 1) {branchlength = 1;}
				if (branchlength < 1) {branchlength = 1;}
				
				//Pick the direction:
				direction = 0;
				if (Math.random() > 0.2 && randomiser != 0) {
					randomiser = randomiser + 0.25;
					if (randomiser >= 1) {randomiser = 0.1;}
				}
				else {
					randomiser = Math.random();
				}
				if (randomiser >= 0.75) {
					direction = 1;
					if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
						branchcount = 1;
						while (branchcount <= branchlength) {
							ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
							branchcount = branchcount + 1;
						}
						PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
					}
				}
				else {
					if (randomiser >= 0.5) {
						direction = 2;
						if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
								branchcount = branchcount + 1;
							}
							PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (randomiser >= 0.25) {	
							direction = 3;
							if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
								PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
							}
						}
						else {			
							direction = 4;
							if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
					}
				}

				if (Math.random() >= 0.5) {
					//Second branch:
					direction2 = 0;
					while (direction2 != direction) {
						randomiser = Math.random();
						if	(randomiser >= 0.75) {
							direction2 = 1;
						}
						else {
							if	(randomiser >= 0.5) {
								direction2 = 2;
							}
							else {
								if	(randomiser >= 0.25) {					
									direction2 = 3;
								}
								else {			
									direction2 = 4;
								}
							}
						}
					}
					branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
					if (counter == TrunkHeight - 1) {branchlength = 1;}
					if (branchlength < 1) {branchlength = 1;}
					//Pick the direction:
					//randomiser = Math.random();
					if (direction2 == 1) {
						if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
								branchcount = branchcount + 1;
							}
							PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (direction2 == 2) {
							if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
						else {
							if (direction2 == 3) {
								if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
								PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
							}
							}
							else {
								if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {			
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
									PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
								}
							}
						}
					}
				}
				
				if (Math.random() >= 0.9) {
					//Third branch:
					direction3 = 0;
					while ((direction3 != direction) && (direction3 != direction2)) {
						randomiser = Math.random();
						if	(randomiser >= 0.75) {
							direction3 = 1;
						}
						else {
							if	(randomiser >= 0.5) {
								direction3 = 2;
							}
							else {
								if	(randomiser >= 0.25) {					
									direction3 = 3;
								}
								else {			
									direction3 = 4;
								}
							}
						}
					}
					branchlength = (int) Math.round(Math.random() * 2) + (int) (Math.round((((double) ((double)TrunkHeight/2)) / (double) ((double)counter/2))) * (3/2));
					if (counter == TrunkHeight - 1) {branchlength = 1;}
					if (branchlength < 1) {branchlength = 1;}
					//Pick the direction:
					//randomiser = Math.random();
					if (direction3 == 1) {
						if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockPodozamitesLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
								branchcount = branchcount + 1;
							}
							PodoLeaves(x, (y + counter), (z - branchlength), world, BlockPodozamitesLeaves.block);
						}
					}
					else {
						if (direction3 == 2) {
							if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
								PodoLeaves((x + branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
							}
						}
						else {
							if (direction3 == 3) {
								if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockPodozamitesLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockPodozamitesLog.block, EnumFacing.WEST);
										branchcount = branchcount + 1;
									}
									PodoLeaves(x, (y + counter), (z + branchlength), world, BlockPodozamitesLeaves.block);
								}
							}
							else {
								if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockPodozamitesLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockPodozamitesLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
									PodoLeaves((x - branchlength), (y + counter), z, world, BlockPodozamitesLeaves.block);
								}
							}
						}
					}
				}
				
				counter = counter + 1;
			}

			//Top of tree:
			PodoLeaves(x, (int) TrunkHeight + y, z, world, BlockPodozamitesLeaves.block);
				
		}
	}

	public static void PodoLeaves(int x, int y, int z, World world, Block blockLeaf) {

		ProcedureTreeLeaf.executeProcedure(x, (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), y, (z - 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x - 1), (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((x + 1), (y + 1), z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z + 1), world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z - 1), world, blockLeaf);

	}
			
}