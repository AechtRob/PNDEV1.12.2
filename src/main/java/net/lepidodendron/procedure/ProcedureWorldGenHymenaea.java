package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockHymenaeaFlower;
import net.lepidodendron.block.BlockHymenaeaLeaves;
import net.lepidodendron.block.BlockHymenaeaLog;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenHymenaea extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenHymenaea(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenHymenaea!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenHymenaea!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenHymenaea!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenHymenaea!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
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
			TrunkHeight = 8 + (int) Math.round(Math.random() * 8);
			

			counter = 0;
			while (counter <= TrunkHeight * 0.7) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//North:
			LateralPosV = 0;
			//Either attach at the top, or one below:
			branchpos = counter - 1;
			if (Math.random() >= 0.5) {branchpos = counter - 2;}
			//We go up to a +/- 2 variable height:
			BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {
				if (BranchSegment == LateralPosH) {
					LateralPosV = branchpos;
				}
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
					BranchSegment = BranchSegment + 1;
				}
				branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			HymenaeaCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.5) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						HymenaeaCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH + 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment + 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment - 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.UP);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.UP);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}


			//South:
			LateralPosV = 0;
			//Either attach at the top, or one below:
			branchpos = counter - 1;
			if (Math.random() >= 0.5) {branchpos = counter - 2;}
			//We go up to a +/- 2 variable height:
			BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {
				if (BranchSegment == LateralPosH) {
					LateralPosV = branchpos;
				}
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
					BranchSegment = BranchSegment + 1;
				}
				branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			HymenaeaCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.5) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						HymenaeaCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.UP);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.UP);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}

			
			//West:
			LateralPosV = 0;
			//Either attach at the top, or one below:
			branchpos = counter - 1;
			if (Math.random() >= 0.5) {branchpos = counter - 2;}
			//We go up to a +/- 2 variable height:
			BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {
				if (BranchSegment == LateralPosH) {
					LateralPosV = branchpos;
				}
				ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
					BranchSegment = BranchSegment + 1;
				}
				branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			HymenaeaCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.5) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						HymenaeaCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH + 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
							BranchSegment = BranchSegment + 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}

			//East:
			LateralPosV = 0;
			//Either attach at the top, or one below:
			branchpos = counter - 1;
			if (Math.random() >= 0.5) {branchpos = counter - 2;}
			//We go up to a +/- 2 variable height:
			BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
			BranchSegment = 1;
			//We need to arbitrarily capture the lateral horizontal position as we build:
			LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
			if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
			if (LateralPosH <= 1) {LateralPosH = 2;}
			while (branchpos < BranchHeight) {
				if (BranchSegment == LateralPosH) {
					LateralPosV = branchpos;
				}
				ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
				BranchSegment = BranchSegment + 1;
				if (Math.random() >= 0.7) {
					if (BranchSegment == LateralPosH) {
						LateralPosV = branchpos;
					}
					ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
					BranchSegment = BranchSegment + 1;
				}
				branchpos = branchpos + 1;
			}
			//Nub on the top for leaves:
			BranchSegment = BranchSegment - 1;
			ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			HymenaeaCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


			if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
				//Laterals either in our axis or perpendicular:
				if (Math.random() >= 0.5) {
					//In our axis:
					//A simple backward branch, RARELY upright:
					if (Math.random() > 0.75) {
						//Upright:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
							branchpos = branchpos + 1;
						}
						HymenaeaCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
					}
					else {
						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));



						//Diagonal:
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV;
						BranchSegment = LateralPosH - 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							BranchSegment = BranchSegment - 1;
							branchpos = branchpos + 1;
						}
						//Nub on the top for leaves:
						BranchSegment = BranchSegment + 1;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));


					}
				}
				else {
					//Perpendicular axis, only two diagonals with 75% chance of each:
					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}

					if (Math.random() >= 0.25) {
						BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
						branchpos = LateralPosV + 1;
						BranchSegment = LateralPosH;
						BranchLatCount = 1;
						while (branchpos < BranchHeight) {
							ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.EAST);
							branchpos = branchpos + 1;
							BranchLatCount = BranchLatCount + 1;
						}
						//Nub on the top for leaves:
						BranchLatCount = BranchLatCount - 1;
						ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
						HymenaeaCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockHymenaeaLeaves.block, (int) Math.round((double) BranchSegment * 0.7));

					}
				}
			}


		}
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void HymenaeaCrown(int x, int y, int z, World world, Block blockLeaf, int radiusCrown) {

		int rad = Math.min(radiusCrown, 6);
		//Size of leaf crown is proportional to distance from centre:
		if (rad > 3) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
		}
		if (rad > 4) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 2, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 2, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 3, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 3, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
		}
		if (rad > 5) {
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z, world, BlockHymenaeaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 3, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 3, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 4, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 4, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 4, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 4, (int) y, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 2, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 2, world, BlockHymenaeaLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) y + 2, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) y + 2, (int) z, world, BlockHymenaeaLog.block, EnumFacing.UP);
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

		//Test for and add flowers in the first three layers
		yct = y;
		rad = Math.min(radiusCrown, 6);
		while ((rad >= 1) && (yct <= (y + 3))) {
			xct = -rad;
			while (xct <= rad) {
				zct = -rad;
				while (zct <= rad) {
					if ((yct == y) && ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int)  Math.abs(rad), 2)))) {
						//Under
						if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHymenaeaLeaves.block) && (Math.random() > 0.9) && (world.isAirBlock(new BlockPos(x + xct, yct - 1, z + zct)))) {
							world.setBlockState(new BlockPos(x + xct, yct - 1, z + zct), BlockHymenaeaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos(x + xct, yct - 1, z + zct);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
					}
					if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) == Math.pow((int) Math.abs(rad), 2))) {
						//This is an outer leaf. Test its NSEW for air
						//North
						if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHymenaeaLeaves.block) && (Math.random() > 0.9) && (world.isAirBlock(new BlockPos(x + xct, yct, z + zct - 1)))) {
							world.setBlockState(new BlockPos(x + xct, yct, z + zct - 1), BlockHymenaeaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos(x + xct, yct, z + zct - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						//South
						if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHymenaeaLeaves.block) && (Math.random() > 0.9) && (world.isAirBlock(new BlockPos(x + xct, yct, z + zct + 1)))) {
							world.setBlockState(new BlockPos(x + xct, yct, z + zct + 1), BlockHymenaeaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos(x + xct, yct, z + zct + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						//East
						if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHymenaeaLeaves.block) && (Math.random() > 0.9) && (world.isAirBlock(new BlockPos(x + xct + 1, yct, z + zct)))) {
							world.setBlockState(new BlockPos(x + xct + 1, yct, z + zct), BlockHymenaeaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos(x + xct + 1, yct, z + zct);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						//West
						if (((world.getBlockState(new BlockPos(x + xct, yct, z + zct))).getBlock() == BlockHymenaeaLeaves.block) && (Math.random() > 0.9) && (world.isAirBlock(new BlockPos(x + xct - 1, yct, z + zct)))) {
							world.setBlockState(new BlockPos(x + xct - 1, yct, z + zct), BlockHymenaeaFlower.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos(x + xct - 1, yct, z + zct);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
					}
					zct = zct + 1;
				}
				xct = xct + 1;
			}
			yct = yct + 1;
			rad = rad - 1;
		}
		
	}
	
			
}