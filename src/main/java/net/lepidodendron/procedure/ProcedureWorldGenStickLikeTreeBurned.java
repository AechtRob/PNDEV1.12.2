package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBurntLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenStickLikeTreeBurned extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenStickLikeTreeBurned(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenStickLikeTreeBurned!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenStickLikeTreeBurned!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenStickLikeTreeBurned!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenStickLikeTreeBurned!");
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
			) {			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				
				//Trunk:
				TrunkHeight = 3 + world.rand.nextInt(14);
				

				counter = 0;
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockBurntLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}

				//Occasional nubs
				counter = ((int) Math.round(((double) TrunkHeight) * 0.666D));
				//Start branches here
				while (counter < TrunkHeight) {
					//first branch always places somewhere
					//second branch is only 50% likely
					//third branch only has a 10% chance
					//branches are 2-5 long, but they taper toward the tip of the tree
					//if this is the penultimate layer of the tree, the branch will only be 1 long

					branchlength = 1;

					//Pick the direction:
					direction = 0;
					if (Math.random() > 0.2 && randomiser != 0) {
						randomiser = randomiser + 0.25;
						if (randomiser >= 1) {randomiser = 0.1;}
					}
					else {
						randomiser = Math.random();
					}
					if (randomiser >= 0.75 && world.rand.nextInt(20) == 0) {
						direction = 1;
						if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockBurntLog.block) {
							branchcount = 1;
							while (branchcount <= branchlength) {
								ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
								branchcount = branchcount + 1;
							}
						}
					}
					else {
						if (randomiser >= 0.5 && world.rand.nextInt(20) == 0) {
							direction = 2;
							if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
									branchcount = branchcount + 1;
								}
							}
						}
						else {
							if (randomiser >= 0.25 && world.rand.nextInt(20) == 0) {
								direction = 3;
								if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockBurntLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
										branchcount = branchcount + 1;
									}
								}
							}
							else if ( world.rand.nextInt(20) == 0) {{
								direction = 4;
								if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
								}
							}
						}
					}

					if (Math.random() >= 0.5  && world.rand.nextInt(20) == 0) {
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
							if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockBurntLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
							}
						}
						else {
							if (direction2 == 2) {
								if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
								}
							}
							else {
								if (direction2 == 3) {
									if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockBurntLog.block) {
										branchcount = 1;
										while (branchcount <= branchlength) {
											ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
											branchcount = branchcount + 1;
										}
									}
								}
								else {
									if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
										branchcount = 1;
										while (branchcount <= branchlength) {
											ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
											branchcount = branchcount + 1;
										}
									}
								}
							}
						}
					}

					if (Math.random() >= 0.9 && world.rand.nextInt(20) == 0) {
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
							if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z - 1))).getBlock() != BlockBurntLog.block) {
								branchcount = 1;
								while (branchcount <= branchlength) {
									ProcedureTreeLog.executeProcedure(x, (y + counter), (z - branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
									branchcount = branchcount + 1;
								}
							}
						}
						else {
							if (direction3 == 2) {
								if (world.getBlockState(new BlockPos((x + 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
									branchcount = 1;
									while (branchcount <= branchlength) {
										ProcedureTreeLog.executeProcedure((x + branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
										branchcount = branchcount + 1;
									}
								}
							}
							else {
								if (direction3 == 3) {
									if (world.getBlockState(new BlockPos(x, (y + counter - 1), (z + 1))).getBlock() != BlockBurntLog.block) {
										branchcount = 1;
										while (branchcount <= branchlength) {
											ProcedureTreeLog.executeProcedure(x, (y + counter), (z + branchcount), world, BlockBurntLog.block, EnumFacing.WEST);
											branchcount = branchcount + 1;
										}
									}
								}
								else {
									if (world.getBlockState(new BlockPos((x - 1), (y + counter - 1), z)).getBlock() != BlockBurntLog.block) {
										branchcount = 1;
										while (branchcount <= branchlength) {
											ProcedureTreeLog.executeProcedure((x - branchcount), (y + counter), z, world, BlockBurntLog.block, EnumFacing.UP);
											branchcount = branchcount + 1;
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
	}
			
}