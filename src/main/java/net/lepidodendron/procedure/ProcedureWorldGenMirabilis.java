package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockTallAraucariaLeaves;
import net.lepidodendron.block.BlockTallAraucariaLog;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMirabilis extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMirabilis(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenMirabilis!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenMirabilis!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenMirabilis!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenMirabilis!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenMirabilis!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		int branchpos = 0;
		int BranchSegment = 0;
		int BranchHeight = 0;
		int LateralPosV = 0;
		int LateralPosH = 0;
		int BranchLatCount = 0;
		
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
			TrunkHeight = 30 + (int) (Math.random() * 15) + (int) (Math.random() * 15);
			if (Math.random() < 0.2) { //Add a variation in how we calculate the trunk and also allow to be very tall sometimes:
				TrunkHeight = 30 + (int) Math.round((Math.random() * 100) / 2);
			}

			//Fatteners:
			if (TrunkHeight > 40) {
				counter = 0;
				branchpos = (int) ((TrunkHeight * 0.5) + (Math.random() * ((TrunkHeight * 0.5))));
				while (counter <= branchpos) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				MirabilisCrown((int) x + 1, (int) (y + counter - 1), (int) z - 1, world, BlockTallAraucariaLeaves.block, 1);

				counter = 0;
				branchpos = (int) ((TrunkHeight * 0.5) + (Math.random() * ((TrunkHeight * 0.5))));
				while (counter <= branchpos) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				MirabilisCrown((int) x + 1, (int) (y + counter - 1), (int) z, world, BlockTallAraucariaLeaves.block, 1);

				counter = 0;
				branchpos = (int) ((TrunkHeight * 0.5) + (Math.random() * ((TrunkHeight * 0.5))));
				while (counter <= branchpos) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1 , world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				MirabilisCrown((int) x, (int) (y + counter - 1), (int) z - 1, world, BlockTallAraucariaLeaves.block, 1);

				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			
			}

				
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
				if ((Math.random() > 0.8) && (counter > TrunkHeight * 0.5)) {
					ProcedureLeavesAroundLog.executeProcedure(x, y + counter, z, world, BlockTallAraucariaLeaves.block, 1, 0.9);
				}
				counter = counter + 1;
			}
			MirabilisCrown((int) x, (int) (y + TrunkHeight), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round(TrunkHeight * 0.1));

			counter = (int) Math.round(TrunkHeight * 0.9) + (int) Math.round((Math.random() * 10)) - 10;
			//North:
			LateralPosV = 0;
			branchpos = counter;
			//We go up to a lower variable height:
			BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 15));
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {
				if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
					}
				else { //Steeply inclined:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					branchpos = branchpos + 1;
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					//branchpos = branchpos + 1;
				}
				branchpos = branchpos + 1;
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
					branchpos = branchpos + 1;
					BranchSegment = BranchSegment + 1;
				}
				//branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			MirabilisCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.7) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						MirabilisCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH + 1;
						while (branchpos < BranchHeight) {

							if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
								}
							else { //Steeply inclined:
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
								branchpos = branchpos + 1;
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							}

							//ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockMirabilisLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment + 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment - 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}

			counter = (int) Math.round(TrunkHeight * 0.9) + (int) Math.round((Math.random() * 10)) - 10;
			//South:
			LateralPosV = 0;
			branchpos = counter;
			//We go up to a lower variable height:
			BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 15));
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {

				if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
					}
				else { //Steeply inclined:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					branchpos = branchpos + 1;
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					//branchpos = branchpos + 1;
				}
				branchpos = branchpos + 1;
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
					branchpos = branchpos + 1;
					BranchSegment = BranchSegment + 1;
				}
				//branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			MirabilisCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.7) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						MirabilisCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {

							if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
								}
							else { //Steeply inclined:
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
								branchpos = branchpos + 1;
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							}
							
							//ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockMirabilisLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}

			counter = (int) Math.round(TrunkHeight * 0.9) + (int) Math.round((Math.random() * 10)) - 10;
			//West:
			LateralPosV = 0;
			branchpos = counter;
			//We go up to a lower variable height:
			BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 15));
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {

				if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
					}
				else { //Steeply inclined:
					ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					branchpos = branchpos + 1;
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					//branchpos = branchpos + 1;
				}
				branchpos = branchpos + 1;
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
					branchpos = branchpos + 1;
					BranchSegment = BranchSegment + 1;
				}
				//branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			MirabilisCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.7) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						MirabilisCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH + 1;
						while (branchpos < BranchHeight) {

							if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
								ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
								}
							else { //Steeply inclined:
								ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
								branchpos = branchpos + 1;
								ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							}
							
							//ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockMirabilisLog.block, EnumFacing.UP);
							BranchSegment = BranchSegment + 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}


			counter = (int) Math.round(TrunkHeight * 0.9) + (int) Math.round((Math.random() * 10)) - 10;
			//East:
			LateralPosV = 0;
			branchpos = counter;
			//We go up to a lower variable height:
			BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 15));
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {

				if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
					}
				else { //Steeply inclined:
					ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					branchpos = branchpos + 1;
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
					//branchpos = branchpos + 1;
				}
				branchpos = branchpos + 1;
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
					branchpos = branchpos + 1;
					BranchSegment = BranchSegment + 1;
				}
				//branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			MirabilisCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.7) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						MirabilisCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {

							if ((Math.random() > 0.7) && (BranchSegment <= 6)) {
								ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
								}
							else { //Steeply inclined:
								ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
								branchpos = branchpos + 1;
								ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							}
							
							//ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockMirabilisLog.block, EnumFacing.UP);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));



						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight - (int) (Math.round(Math.random() * 8));
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
						MirabilisCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockTallAraucariaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}
			ProcedureSpawnNilssoniocladus.executeProcedure(x, y, z, world, LepidodendronConfig.genNilssoniocladusTallAraucaria, SaplingSpawn);

		}
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void MirabilisCrown(int x, int y, int z, World world, Block blockLeaf, int radiusCrown) {

		int rad = Math.min(radiusCrown, 8);
		//Size of leaf crown is proportional to distance from centre:
		if (rad > 3) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
		}
		if (rad > 4) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 2, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 2, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 3, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 3, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
		}

		if (rad > 5) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 4, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 4, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x + 4, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 4, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
		}
		
		if (rad > 6) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 5, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z - 3, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z + 3, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) y+ 1, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) y+ 1, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z - 4, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z + 4, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 4, (int) y + 1, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 4, (int) y + 1, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z - 1, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z + 1, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z - 2, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z + 2, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) y + 3, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 4, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 4, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 4, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 4, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 5, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 5, world, BlockTallAraucariaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 5, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 5, (int) y, (int) z, world, BlockTallAraucariaLog.block, EnumFacing.UP);
		
		}
			
		int xct;
		int yct = y;
		int zct;
		while (rad >= 1) {
			xct = -rad;
			while (xct <= rad) {
				zct = -rad;
				while (zct <= rad) {
					if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int)  Math.abs(rad), 2))) {
						ProcedureTreeLeaf.executeProcedure(x + xct, yct, z + zct, world, blockLeaf);
					}
					zct = zct + 1;
				}
				xct = xct + 1;
			}
			yct = yct + 1;
			rad = rad - 1;
		}

		//Backups in case we are at the centre:
		ProcedureTreeLeaf.executeProcedure((int) x, (int) y + 1, (int) z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y, (int) z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y, (int) z, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((int) x, (int) y, (int) z + 1, world, blockLeaf);
		ProcedureTreeLeaf.executeProcedure((int) x, (int) y, (int) z - 1, world, blockLeaf);
		
	}
	
			
}