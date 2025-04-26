package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGigantopteridClimbing extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGigantopteridClimbing(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure(int x, int y, int z, World world) {
		//if (dependencies.get("x") == null) {
		//System.err.println("running WorldGenGigantopteridClimbing!");
		//	return;
		//}
		//if (dependencies.get("y") == null) {
		//	System.err.println("Failed to load dependency y for procedure WorldGenGigantopteridClimbing!");
		//	return;
		//}
		//if (dependencies.get("z") == null) {
		//	System.err.println("Failed to load dependency z for procedure WorldGenGigantopteridClimbing!");
		//	return;
		//}
		//if (dependencies.get("world") == null) {
		//	System.err.println("Failed to load dependency world for procedure WorldGenGigantopteridClimbing!");
		//	return;
		//}
		//int x = (int) dependencies.get("x");
		//int y = (int) dependencies.get("y");
		//int z = (int) dependencies.get("z");
		//World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		boolean FaceN = false;
		boolean FaceS = false;
		boolean FaceE = false;
		boolean FaceW = false;
		
		if (world.isAirBlock(new BlockPos((int) x, (int) y + 1, (int) z)) 
			&& world.isAirBlock(new BlockPos((int) x, (int) y + 2, (int) z))
			&& world.isAirBlock(new BlockPos((int) x, (int) y + 3, (int) z))
		)
		{//Check each axis to try to work out where to grow:

			//System.err.println("running WorldGenGigantopteridClimbing: " + x + " " + y + " " + z );

			//North:
			if (
				(world.getBlockState(new BlockPos((int) x, (int) y, (int) z - 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y, (int) z - 1), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z - 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 1, (int) z - 1), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z - 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 2, (int) z - 1), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 3, (int) z - 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 3, (int) z - 1), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
				) {
					FaceS = true;
				}
			//South:
			if (
				(world.getBlockState(new BlockPos((int) x, (int) y, (int) z + 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y, (int) z + 1), EnumFacing.NORTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z + 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 1, (int) z + 1), EnumFacing.NORTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z + 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 2, (int) z + 1), EnumFacing.NORTH) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x, (int) y + 3, (int) z + 1)).getBlockFaceShape(world, new BlockPos((int) x, (int) y + 3, (int) z + 1), EnumFacing.NORTH) == BlockFaceShape.SOLID)
				) {
					FaceN = true;
				}
			//East:
			if (
				(world.getBlockState(new BlockPos((int) x + 1, (int) y, (int) z)).getBlockFaceShape(world, new BlockPos((int) x + 1, (int) y, (int) z ), EnumFacing.WEST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + 1, (int) z)).getBlockFaceShape(world, new BlockPos((int) x + 1, (int) y + 1, (int) z), EnumFacing.WEST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + 2, (int) z)).getBlockFaceShape(world, new BlockPos((int) x + 1, (int) y + 2, (int) z), EnumFacing.WEST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + 3, (int) z)).getBlockFaceShape(world, new BlockPos((int) x + 1, (int) y + 3, (int) z), EnumFacing.WEST) == BlockFaceShape.SOLID)
				) {
					FaceW = true;
				}
			//West:
			if (
				(world.getBlockState(new BlockPos((int) x - 1, (int) y, (int) z)).getBlockFaceShape(world, new BlockPos((int) x - 1, (int) y, (int) z ), EnumFacing.EAST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + 1, (int) z)).getBlockFaceShape(world, new BlockPos((int) x - 1, (int) y + 1, (int) z), EnumFacing.EAST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + 2, (int) z)).getBlockFaceShape(world, new BlockPos((int) x - 1, (int) y + 2, (int) z), EnumFacing.EAST) == BlockFaceShape.SOLID)
				&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + 3, (int) z)).getBlockFaceShape(world, new BlockPos((int) x - 1, (int) y + 3, (int) z), EnumFacing.EAST) == BlockFaceShape.SOLID)
				) {
					FaceE = true;
				}

			boolean chosen = false;
			if (FaceN || FaceS || FaceE || FaceW) {
				//Pick a face from amongst these:
				while (!chosen) {
					Random rnd = new Random();
					int bf = rnd.nextInt(4);
					if (bf == 0 && (FaceN)) {
						FaceS = false;
						FaceE = false;
						FaceW = false;
						chosen = true;
					}
					if (bf == 1 && (FaceS)) {
						FaceN = false;
						FaceE = false;
						FaceW = false;
						chosen = true;
					}
					if (bf == 2 && (FaceE)) {
						FaceS = false;
						FaceN = false;
						FaceW = false;
						chosen = true;
					}
					if (bf == 3 && (FaceW)) {
						FaceS = false;
						FaceE = false;
						FaceN = false;
						chosen = true;
					}
				}
			}
		}

		if (FaceN || FaceS || FaceE || FaceW)
			{			
			//System.err.println("Spawning!");
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk:
			TrunkHeight = 2 + world.rand.nextInt(9);
			counter = 0;
			if (FaceN) {PlaceSegment(EnumFacing.NORTH, counter, TrunkHeight, world, new BlockPos((int) x, (int) y, (int) z));}
			if (FaceS) {PlaceSegment(EnumFacing.SOUTH, counter, TrunkHeight, world, new BlockPos((int) x, (int) y, (int) z));}
			if (FaceE) {PlaceSegment(EnumFacing.EAST, counter, TrunkHeight, world, new BlockPos((int) x, (int) y, (int) z));}
			if (FaceW) {PlaceSegment(EnumFacing.WEST, counter, TrunkHeight, world, new BlockPos((int) x, (int) y, (int) z));}
		}
	}

	static void PlaceSegment(EnumFacing facing, int counter, int TrunkHeight, World world, BlockPos pos) {
		if (counter >= TrunkHeight) {
			if ((canPlace(pos, world))
					&& world.getBlockState(pos.down()).getBlock() == BlockGigantopteridClimbingStem.block) {
				PlaceBlock(pos, world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
			}
			return; //Should cascade the nested loops shut
		} 
		else {
			boolean Bendplaced = false;
			//First there is a rare chance of a bend, as long as we're not at the top:
			if ((Math.random() > 0.85) && (counter < TrunkHeight - 1)) {
				if (Math.random() > 0.5) {
					//right bend
					//Can we place the bend though?
					if (facing == EnumFacing.NORTH) {
						if (
							(world.getBlockState(pos.west().south()).getBlockFaceShape(world, pos.west().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up().south()).getBlockFaceShape(world, pos.west().up().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(2).south()).getBlockFaceShape(world, pos.west().up(2).south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(3).south()).getBlockFaceShape(world, pos.west().up(3).south(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.west(), world))
							&& (canPlace(pos.west().up(), world))
							&& (canPlace(pos.west().up(2), world))
							&& (canPlace(pos.west().up(3), world))
							) {
								//We can place the bend:
								PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
								PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNW.block, facing);
								//And apply recursion for the next block:
								counter = counter + 1;
								Bendplaced = true;
								PlaceSegment(facing, counter, TrunkHeight, world, pos.west().up());
							}
						else { //Perhaps we can go round a corner and carry on:
							if (
							(world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up().south()).getBlockFaceShape(world, pos.up().south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up(2).south()).getBlockFaceShape(world, pos.up(2).south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up(3).south()).getBlockFaceShape(world, pos.up(3).south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.west().south(), world))
							&& (canPlace(pos.west().up().south(), world))
							&& (canPlace(pos.west().up(2).south(), world))
							&& (canPlace(pos.west().up(3).south(), world))
							) {
								//We can place the bend round the corner::
								PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
								//And swap to the new axis now:
								facing = EnumFacing.WEST;
								PlaceBlock(pos.west().south(), world, BlockGigantopteridClimbingStemNW.block, facing);
								//And apply recursion for the next block:
								counter = counter + 1;
								Bendplaced = true;
								PlaceSegment(facing, counter, TrunkHeight,world, pos.west().south().up());
							}
							
						}
					}
					else {
						if (facing == EnumFacing.SOUTH) {
							if (
								(world.getBlockState(pos.east().north()).getBlockFaceShape(world, pos.east().north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.east().up().north()).getBlockFaceShape(world, pos.east().up().north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.east().up(2).north()).getBlockFaceShape(world, pos.east().up(2).north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.east().up(3).north()).getBlockFaceShape(world, pos.east().up(3).north(), facing) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.east(), world))
								&& (canPlace(pos.east().up(), world))
								&& (canPlace(pos.east().up(2), world))
								&& (canPlace(pos.east().up(3), world))
								) {
									//We can place the bend:
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
									PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNW.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									Bendplaced = true;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.east().up());
								}
							else { //Perhaps we can go round a corner and carry on:
								if (
								(world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().north()).getBlockFaceShape(world, pos.up().north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).north()).getBlockFaceShape(world, pos.up(2).north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).north()).getBlockFaceShape(world, pos.up(3).north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.east().north(), world))
								&& (canPlace(pos.east().up().north(), world))
								&& (canPlace(pos.east().up(2).north(), world))
								&& (canPlace(pos.east().up(3).north(), world))
								) {
									//We can place the bend round the corner::
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
									//And swap to the new axis now:
									facing = EnumFacing.EAST;
									PlaceBlock(pos.east().north(), world, BlockGigantopteridClimbingStemNW.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									Bendplaced = true;
									PlaceSegment(facing, counter, TrunkHeight,world, pos.east().north().up());
								}
								
							}
						}
						else {
							if (facing == EnumFacing.EAST) {
								if (
									(world.getBlockState(pos.south().west()).getBlockFaceShape(world, pos.south().west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up().west()).getBlockFaceShape(world, pos.south().up().west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(2).west()).getBlockFaceShape(world, pos.south().up(2).west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(3).west()).getBlockFaceShape(world, pos.south().up(3).west(), facing) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south(), world))
									&& (canPlace(pos.south().up(), world))
									&& (canPlace(pos.south().up(2), world))
									&& (canPlace(pos.south().up(3), world))
									) {
										//We can place the bend:
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
										PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNW.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.south().up());
									}
								else { //Perhaps we can go round a corner and carry on:
									if (
									(world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up().west()).getBlockFaceShape(world, pos.up().west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(2).west()).getBlockFaceShape(world, pos.up(2).west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(3).west()).getBlockFaceShape(world, pos.up(3).west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south().west(), world))
									&& (canPlace(pos.south().up().west(), world))
									&& (canPlace(pos.south().up(2).west(), world))
									&& (canPlace(pos.south().up(3).west(), world))
									) {
										//We can place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.SOUTH;
										PlaceBlock(pos.south().west(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.south().west().up());
									}
									
								}
							}
							else { //West:
								if (
									(world.getBlockState(pos.south().east()).getBlockFaceShape(world, pos.south().east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up().east()).getBlockFaceShape(world, pos.south().up().east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(2).east()).getBlockFaceShape(world, pos.south().up(2).east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(3).east()).getBlockFaceShape(world, pos.south().up(3).east(), facing) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south(), world))
									&& (canPlace(pos.south().up(), world))
									&& (canPlace(pos.south().up(2), world))
									&& (canPlace(pos.south().up(3), world))
									) {
										//We can place the bend:
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
										PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNW.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.south().up());
									}
								else { //Perhaps we can go round a corner and carry on:
									if (
									(world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up().east()).getBlockFaceShape(world, pos.up().east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(2).east()).getBlockFaceShape(world, pos.up(2).east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(3).east()).getBlockFaceShape(world, pos.up(3).east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south().east(), world))
									&& (canPlace(pos.south().up().east(), world))
									&& (canPlace(pos.south().up(2).east(), world))
									&& (canPlace(pos.south().up(3).east(), world))
									) {
										//We can place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.SOUTH;
										PlaceBlock(pos.south().east(), world, BlockGigantopteridClimbingStemNW.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.south().east().up());
									}
									
								}
							}
						}
					}
				} // End of right bend placement
				
				else {
					//left bend
					//Can we place the bend though?
					if (facing == EnumFacing.NORTH) {
						if (
							(world.getBlockState(pos.east().south()).getBlockFaceShape(world, pos.east().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up().south()).getBlockFaceShape(world, pos.east().up().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(2).south()).getBlockFaceShape(world, pos.east().up(2).south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(3).south()).getBlockFaceShape(world, pos.east().up(3).south(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.east(), world))
							&& (canPlace(pos.east().up(), world))
							&& (canPlace(pos.east().up(2), world))
							&& (canPlace(pos.east().up(3), world))
							) {
								//We can place the bend:									
								PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
								PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNE.block, facing);
								//And apply recurion for the next block:
								counter = counter + 1;
								Bendplaced = true;
								PlaceSegment(facing, counter, TrunkHeight, world, pos.east().up());
							}
						else { //Perhaps we can go round a corner and carry on:
							if (
							(world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up().south()).getBlockFaceShape(world, pos.up().south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up(2).south()).getBlockFaceShape(world, pos.up(2).south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.up(3).south()).getBlockFaceShape(world, pos.up(3).south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.east().south(), world))
							&& (canPlace(pos.east().up().south(), world))
							&& (canPlace(pos.east().up(2).south(), world))
							&& (canPlace(pos.east().up(3).south(), world))
							) {
								//We can place the bend round the corner::
								PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
								//And swap to the new axis now:
								facing = EnumFacing.EAST;
								PlaceBlock(pos.east().south(), world, BlockGigantopteridClimbingStemNE.block, facing);
								//And apply recurion for the next block:
								counter = counter + 1;
								Bendplaced = true;
								PlaceSegment(facing, counter, TrunkHeight,world, pos.east().south().up());
							}
							
						}
					}
					else {
						if (facing == EnumFacing.SOUTH) {
							if (
								(world.getBlockState(pos.west().north()).getBlockFaceShape(world, pos.west().north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.west().up().north()).getBlockFaceShape(world, pos.west().up().north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.west().up(2).north()).getBlockFaceShape(world, pos.west().up(2).north(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.west().up(3).north()).getBlockFaceShape(world, pos.west().up(3).north(), facing) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.west(), world))
								&& (canPlace(pos.west().up(), world))
								&& (canPlace(pos.west().up(2), world))
								&& (canPlace(pos.west().up(3), world))
								) {
									//We can place the bend:									
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
									PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNE.block, facing);
									//And apply recurion for the next block:
									counter = counter + 1;
									Bendplaced = true;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.west().up());
								}
							else { //Perhaps we can go round a corner and carry on:
								if (
								(world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().north()).getBlockFaceShape(world, pos.up().north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).north()).getBlockFaceShape(world, pos.up(2).north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).north()).getBlockFaceShape(world, pos.up(3).north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.west().north(), world))
								&& (canPlace(pos.west().up().north(), world))
								&& (canPlace(pos.west().up(2).north(), world))
								&& (canPlace(pos.west().up(3).north(), world))
								) {
									//We can place the bend round the corner::
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
									//And swap to the new axis now:
									facing = EnumFacing.WEST;
									PlaceBlock(pos.west().north(), world, BlockGigantopteridClimbingStemNE.block, facing);
									//And apply recurion for the next block:
									counter = counter + 1;
									Bendplaced = true;
									PlaceSegment(facing, counter, TrunkHeight,world, pos.west().north().up());
								}
								
							}
						}
						else {
							if (facing == EnumFacing.EAST) {
								if (
									(world.getBlockState(pos.south().west()).getBlockFaceShape(world, pos.south().west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up().west()).getBlockFaceShape(world, pos.south().up().west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(2).west()).getBlockFaceShape(world, pos.south().up(2).west(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.south().up(3).west()).getBlockFaceShape(world, pos.south().up(3).west(), facing) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south(), world))
									&& (canPlace(pos.south().up(), world))
									&& (canPlace(pos.south().up(2), world))
									&& (canPlace(pos.south().up(3), world))
									) {
										//We can place the bend:									
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recurion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.south().up());
									}
								else { //Perhaps we can go round a corner and carry on:
									if (
									(world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up().west()).getBlockFaceShape(world, pos.up().west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(2).west()).getBlockFaceShape(world, pos.up(2).west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(3).west()).getBlockFaceShape(world, pos.up(3).west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.south().west(), world))
									&& (canPlace(pos.south().up().west(), world))
									&& (canPlace(pos.south().up(2).west(), world))
									&& (canPlace(pos.south().up(3).west(), world))
									) {
										//We can place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.SOUTH;
										PlaceBlock(pos.south().west(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recurion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.south().west().up());
									}
									
								}
							}
							else { //West:
								if (
									(world.getBlockState(pos.north().east()).getBlockFaceShape(world, pos.north().east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.north().up().east()).getBlockFaceShape(world, pos.north().up().east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.north().up(2).east()).getBlockFaceShape(world, pos.north().up(2).east(), facing) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.north().up(3).east()).getBlockFaceShape(world, pos.north().up(3).east(), facing) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.north(), world))
									&& (canPlace(pos.north().up(), world))
									&& (canPlace(pos.north().up(2), world))
									&& (canPlace(pos.north().up(3), world))
									) {
										//We can place the bend:									
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										PlaceBlock(pos.north(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recurion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.north().up());
									}
								else { //Perhaps we can go round a corner and carry on:
									if (
									(world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up().east()).getBlockFaceShape(world, pos.up().east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(2).east()).getBlockFaceShape(world, pos.up(2).east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (world.getBlockState(pos.up(3).east()).getBlockFaceShape(world, pos.up(3).east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
									&& (canPlace(pos.north().east(), world))
									&& (canPlace(pos.north().up().east(), world))
									&& (canPlace(pos.north().up(2).east(), world))
									&& (canPlace(pos.north().up(3).east(), world))
									) {
										//We can place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.NORTH;
										PlaceBlock(pos.north().east(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recurion for the next block:
										counter = counter + 1;
										Bendplaced = true;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.north().east().up());
									}
									
								}
							}
						}
					}
					
				} // End of left bend placement
				
			} // End of all bend placement
			
			if (!Bendplaced) {
				boolean Upplaced = false;
				//Can we just go upwards here?
				if (facing == EnumFacing.NORTH) {
					if ((world.getBlockState(pos.south().up()).getBlockFaceShape(world, pos.south().up(), facing) == BlockFaceShape.SOLID) 
						&& (world.getBlockState(pos.south().up(2)).getBlockFaceShape(world, pos.south().up(2), facing) == BlockFaceShape.SOLID)
						&& (canPlace(pos.up(), world))
						&& (canPlace(pos.up(2), world))
						) {
							//Place a simple stem, //with a rare chance of a rosette of leaves:
							PlaceBlock(pos, world, BlockGigantopteridClimbingStem.block, facing);
							//if ((Math.random() > 0.82) && (counter >= 4) && (counter < (TrunkHeight - 1))) {
							//		PlaceBlock(pos.north(), world, BlockGigantopteridClimbingShoot.block, facing);
							//}
							counter = counter + 1;
							if (counter >= TrunkHeight) {
								PlaceBlock(pos.up(), world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
							}
							else {
								if (world.rand.nextInt(4) == 0) {
									//sometimes add a branch joint left:
									if (world.getBlockState(pos.south().east()).getBlockFaceShape(world, pos.south().east(), EnumFacing.NORTH) == BlockFaceShape.SOLID
										&& canPlace(pos.east().up(), world) && canPlace(pos.east().up(2), world)) {
										PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNE.block, facing);
										PlaceBlock(pos.east().up(), world, BlockGigantopteridClimbingStem.block, facing);
										PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.east().up(2));
									}
									else if (world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.EAST) == BlockFaceShape.SOLID
											&& world.getBlockState(pos.east().south()).getMaterial() == Material.AIR
											&& canPlace(pos.east().south().up(), world) && canPlace(pos.east().south().up(2), world)) {
										PlaceBlock(pos.east().south(), world, BlockGigantopteridClimbingStemNE.block, EnumFacing.EAST);
										PlaceBlock(pos.east().south().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.EAST);
										PlaceSegment(EnumFacing.EAST, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.east().south().up(2));
									}
								}
								if (world.rand.nextInt(4) == 0) {
									//sometimes add a branch joint right:
									if (world.getBlockState(pos.south().west()).getBlockFaceShape(world, pos.south().west(), EnumFacing.NORTH) == BlockFaceShape.SOLID
											&& canPlace(pos.west().up(), world) && canPlace(pos.west().up(2), world)) {
										PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNW.block, facing);
										PlaceBlock(pos.west().up(), world, BlockGigantopteridClimbingStem.block, facing);
										PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.west().up(2));
									}
									else if (world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.WEST) == BlockFaceShape.SOLID
											&& world.getBlockState(pos.west().south()).getMaterial() == Material.AIR
											&& canPlace(pos.west().south().up(), world) && canPlace(pos.west().south().up(2), world)) {
										PlaceBlock(pos.west().south(), world, BlockGigantopteridClimbingStemNW.block, EnumFacing.WEST);
										PlaceBlock(pos.west().south().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.WEST);
										PlaceSegment(EnumFacing.WEST, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.west().south().up(2));
									}
								}
							}
							Upplaced = true;
							PlaceSegment(facing, counter, TrunkHeight, world, pos.up());
						}
					else if ((canPlace(pos, world))
							&& (!canPlace(pos.up(), world))
							&& world.getBlockState(pos.down()).getBlock() == BlockGigantopteridClimbingStem.block) {
						PlaceBlock(pos, world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
						Upplaced = true;
					}
				}
				else {
					if (facing == EnumFacing.SOUTH) {
						if ((world.getBlockState(pos.north().up()).getBlockFaceShape(world, pos.north().up(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up(2)).getBlockFaceShape(world, pos.north().up(2), facing) == BlockFaceShape.SOLID)
							&& (canPlace(pos.up(), world))
							&& (canPlace(pos.up(2), world))
							) {
								//Place a simple stem, //with a rare chance of a rosette of leaves:
								PlaceBlock(pos, world, BlockGigantopteridClimbingStem.block, facing);
								//if ((Math.random() > 0.82) && (counter >= 4) && (counter < (TrunkHeight - 1))) {
								//	PlaceBlock(pos.south(), world, BlockGigantopteridClimbingShoot.block, facing);
								//}
								counter = counter + 1;
								if (counter >= TrunkHeight) {
									PlaceBlock(pos.up(), world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
								}
								else {
									if (world.rand.nextInt(4) == 0) {
										//sometimes add a branch joint left:
										if (world.getBlockState(pos.north().west()).getBlockFaceShape(world, pos.north().west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
												&& canPlace(pos.west().up(), world) && canPlace(pos.west().up(2), world)) {
											PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNE.block, facing);
											PlaceBlock(pos.west().up(), world, BlockGigantopteridClimbingStem.block, facing);
											PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.west().up(2));
										}
										else if (world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.WEST) == BlockFaceShape.SOLID
												&& world.getBlockState(pos.west().north()).getMaterial() == Material.AIR
												&& canPlace(pos.west().north().up(), world) && canPlace(pos.west().north().up(2), world)) {
											PlaceBlock(pos.west().north(), world, BlockGigantopteridClimbingStemNE.block, EnumFacing.WEST);
											PlaceBlock(pos.west().north().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.WEST);
											PlaceSegment(EnumFacing.WEST, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.west().north().up(2));
										}
									}
									if (world.rand.nextInt(4) == 0) {
										//sometimes add a branch joint right:
										if (world.getBlockState(pos.north().east()).getBlockFaceShape(world, pos.north().east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
												&& canPlace(pos.east().up(), world) && canPlace(pos.east().up(2), world)) {
											PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNW.block, facing);
											PlaceBlock(pos.east().up(), world, BlockGigantopteridClimbingStem.block, facing);
											PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.east().up(2));
										}
										else if (world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.EAST) == BlockFaceShape.SOLID
												&& world.getBlockState(pos.east().north()).getMaterial() == Material.AIR
												&& canPlace(pos.east().north().up(), world) && canPlace(pos.east().north().up(2), world)) {
											PlaceBlock(pos.east().north(), world, BlockGigantopteridClimbingStemNW.block, EnumFacing.EAST);
											PlaceBlock(pos.east().north().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.EAST);
											PlaceSegment(EnumFacing.EAST, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.east().north().up(2));
										}
									}
								}
								Upplaced = true;
								PlaceSegment(facing, counter, TrunkHeight, world, pos.up());
							}
						else if ((canPlace(pos, world))
								&& (!canPlace(pos.up(), world))
								&& world.getBlockState(pos.down()).getBlock() == BlockGigantopteridClimbingStem.block) {
							PlaceBlock(pos, world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
							Upplaced = true;
						}
					}
					else {
						if (facing == EnumFacing.EAST) {
							if ((world.getBlockState(pos.west().up()).getBlockFaceShape(world, pos.west().up(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.west().up(2)).getBlockFaceShape(world, pos.west().up(2), facing) == BlockFaceShape.SOLID)
								&& (canPlace(pos.up(), world))
								&& (canPlace(pos.up(2), world))
								) {
									//Place a simple stem, //with a rare chance of a rosette of leaves:
									PlaceBlock(pos, world, BlockGigantopteridClimbingStem.block, facing);
									//if ((Math.random() > 0.82) && (counter >= 4) && (counter < (TrunkHeight - 1))) {
									//		PlaceBlock(pos.east(), world, BlockGigantopteridClimbingShoot.block, facing);
									//}
									counter = counter + 1;
									if (counter >= TrunkHeight) {
										PlaceBlock(pos.up(), world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
									}
									else {
										if (world.rand.nextInt(4) == 0) {
											//sometimes add a branch joint left:
											if (world.getBlockState(pos.west().south()).getBlockFaceShape(world, pos.west().south(), EnumFacing.EAST) == BlockFaceShape.SOLID
													&& canPlace(pos.south().up(), world) && canPlace(pos.south().up(2), world)) {
												PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNE.block, facing);
												PlaceBlock(pos.south().up(), world, BlockGigantopteridClimbingStem.block, facing);
												PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.south().up(2));
											}
											else if (world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
												&& world.getBlockState(pos.south().west()).getMaterial() == Material.AIR
													&& canPlace(pos.south().west().up(), world) && canPlace(pos.south().west().up(2), world)) {
												PlaceBlock(pos.south().west(), world, BlockGigantopteridClimbingStemNE.block, EnumFacing.SOUTH);
												PlaceBlock(pos.south().west().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.SOUTH);
												PlaceSegment(EnumFacing.SOUTH, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.south().west().up(2));
											}
										}
										if (world.rand.nextInt(4) == 0) {
											//sometimes add a branch joint right:
											if (world.getBlockState(pos.west().north()).getBlockFaceShape(world, pos.west().north(), EnumFacing.EAST) == BlockFaceShape.SOLID
													&& canPlace(pos.north().up(), world) && canPlace(pos.north().up(2), world)) {
												PlaceBlock(pos.north(), world, BlockGigantopteridClimbingStemNW.block, facing);
												PlaceBlock(pos.north().up(), world, BlockGigantopteridClimbingStem.block, facing);
												PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.north().up(2));
											}
											else if (world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.NORTH) == BlockFaceShape.SOLID
													&& world.getBlockState(pos.north().west()).getMaterial() == Material.AIR
													&& canPlace(pos.north().west().up(), world) && canPlace(pos.north().west().up(2), world)) {
												PlaceBlock(pos.north().west(), world, BlockGigantopteridClimbingStemNW.block, EnumFacing.NORTH);
												PlaceBlock(pos.north().west().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.NORTH);
												PlaceSegment(EnumFacing.NORTH, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.north().west().up(2));
											}
										}
									}
									Upplaced = true;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.up());
								}
							else if ((canPlace(pos, world))
									&& (!canPlace(pos.up(), world))
									&& world.getBlockState(pos.down()).getBlock() == BlockGigantopteridClimbingStem.block) {
								PlaceBlock(pos, world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
								Upplaced = true;
							}
						}
						else { //facing == EnumFacing.WEST
							if ((world.getBlockState(pos.east().up()).getBlockFaceShape(world, pos.east().up(), facing) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.east().up(2)).getBlockFaceShape(world, pos.east().up(2), facing) == BlockFaceShape.SOLID)
								&& (canPlace(pos.up(), world))
								&& (canPlace(pos.up(2), world))
								) {
									//Place a simple stem, //with a rare chance of a rosette of leaves:
									PlaceBlock(pos, world, BlockGigantopteridClimbingStem.block, facing);
									//if ((Math.random() > 0.82) && (counter >= 4) && (counter < (TrunkHeight - 1))) {
									//		PlaceBlock(pos.west(), world, BlockGigantopteridClimbingShoot.block, facing);
									//}
									counter = counter + 1;
									if (counter >= TrunkHeight) {
										PlaceBlock(pos.up(), world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
									}
									else {
										if (world.rand.nextInt(4) == 0) {
											//sometimes add a branch joint left:
											if (world.getBlockState(pos.east().north()).getBlockFaceShape(world, pos.east().north(), EnumFacing.WEST) == BlockFaceShape.SOLID
													&& canPlace(pos.north().up(), world) && canPlace(pos.north().up(2), world)) {
												PlaceBlock(pos.north(), world, BlockGigantopteridClimbingStemNE.block, facing);
												PlaceBlock(pos.north().up(), world, BlockGigantopteridClimbingStem.block, facing);
												PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.north().up());
											}
											else if (world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.NORTH) == BlockFaceShape.SOLID
													&& world.getBlockState(pos.north().east()).getMaterial() == Material.AIR
													&& canPlace(pos.north().east().up(), world) && canPlace(pos.north().east().up(2), world)) {
												PlaceBlock(pos.north().east(), world, BlockGigantopteridClimbingStemNE.block, EnumFacing.NORTH);
												PlaceBlock(pos.north().east().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.NORTH);
												PlaceSegment(EnumFacing.NORTH, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.north().east().up(2));
											}
										}
										if (world.rand.nextInt(4) == 0) {
											//sometimes add a branch joint right:
											if (world.getBlockState(pos.east().south()).getBlockFaceShape(world, pos.east().south(), EnumFacing.WEST) == BlockFaceShape.SOLID
													&& canPlace(pos.south().up(), world) && canPlace(pos.south().up(2), world)) {
												PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNW.block, facing);
												PlaceBlock(pos.south().up(), world, BlockGigantopteridClimbingStem.block, facing);
												PlaceSegment(facing, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.south().up(2));
											}
											else if (world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
													&& world.getBlockState(pos.south().east()).getMaterial() == Material.AIR
													&& canPlace(pos.south().east().up(), world) && canPlace(pos.south().east().up(2), world)) {
												PlaceBlock(pos.south().east(), world, BlockGigantopteridClimbingStemNW.block, EnumFacing.SOUTH);
												PlaceBlock(pos.south().east().up(), world, BlockGigantopteridClimbingStem.block, EnumFacing.SOUTH);
												PlaceSegment(EnumFacing.SOUTH, counter, Math.max(counter, TrunkHeight - world.rand.nextInt(3) + world.rand.nextInt(2)), world, pos.south().east().up(2));
											}
										}
									}
									Upplaced = true;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.up());
								}
							else if ((canPlace(pos, world))
									&& (!canPlace(pos.up(), world))
									&& world.getBlockState(pos.down()).getBlock() == BlockGigantopteridClimbingStem.block) {
								PlaceBlock(pos, world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
								Upplaced = true;
							}
						}
					}
				}
				
				if (!Bendplaced & !Upplaced) {
					//So we cant just go up, we will either go round a bend or else place a final shoot:
					boolean leftSpace = false;
					boolean rightSpace = false;
					boolean changeRightAxis = false;
					boolean changeLeftAxis = false;
					
					if (facing == EnumFacing.NORTH) {

						if (
							(world.getBlockState(pos.west().south()).getBlockFaceShape(world, pos.west().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up().south()).getBlockFaceShape(world, pos.west().up().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(2).south()).getBlockFaceShape(world, pos.west().up(2).south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(3).south()).getBlockFaceShape(world, pos.west().up(3).south(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.west(), world))
							&& (canPlace(pos.west().up(), world))
							&& (canPlace(pos.west().up(2), world))
							&& (canPlace(pos.west().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								rightSpace = true;
								changeRightAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().south()).getBlockFaceShape(world, pos.up().south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).south()).getBlockFaceShape(world, pos.up(2).south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).south()).getBlockFaceShape(world, pos.up(3).south(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.west().south(), world))
								&& (canPlace(pos.west().up().south(), world))
								&& (canPlace(pos.west().up(2).south(), world))
								&& (canPlace(pos.west().up(3).south(), world))
								&& (counter < TrunkHeight - 1)
								) {
									rightSpace = true;
									changeRightAxis = true;
								}
						}
						if (
							(world.getBlockState(pos.east().south()).getBlockFaceShape(world, pos.east().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up().south()).getBlockFaceShape(world, pos.east().up().south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(2).south()).getBlockFaceShape(world, pos.east().up(2).south(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(3).south()).getBlockFaceShape(world, pos.east().up(3).south(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.east(), world))
							&& (canPlace(pos.east().up(), world))
							&& (canPlace(pos.east().up(2), world))
							&& (canPlace(pos.east().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								leftSpace = true;
								changeLeftAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.south()).getBlockFaceShape(world, pos.south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().south()).getBlockFaceShape(world, pos.up().south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).south()).getBlockFaceShape(world, pos.up(2).south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).south()).getBlockFaceShape(world, pos.up(3).south(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.east().south(), world))
								&& (canPlace(pos.east().up().south(), world))
								&& (canPlace(pos.east().up(2).south(), world))
								&& (canPlace(pos.east().up(3).south(), world))
								&& (counter < TrunkHeight - 1)
								) {
									leftSpace = true;
									changeLeftAxis = true;
								}
						}
						
					}
					if (facing == EnumFacing.SOUTH) {
						if (
							(world.getBlockState(pos.east().north()).getBlockFaceShape(world, pos.east().north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up().north()).getBlockFaceShape(world, pos.east().up().north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(2).north()).getBlockFaceShape(world, pos.east().up(2).north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.east().up(3).north()).getBlockFaceShape(world, pos.east().up(3).north(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.east(), world))
							&& (canPlace(pos.east().up(), world))
							&& (canPlace(pos.east().up(2), world))
							&& (canPlace(pos.east().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								rightSpace = true;
								changeRightAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().north()).getBlockFaceShape(world, pos.up().north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).north()).getBlockFaceShape(world, pos.up(2).north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).north()).getBlockFaceShape(world, pos.up(3).north(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.east().north(), world))
								&& (canPlace(pos.east().up().north(), world))
								&& (canPlace(pos.east().up(2).north(), world))
								&& (canPlace(pos.east().up(3).north(), world))
								&& (counter < TrunkHeight - 1)
								) {
									rightSpace = true;
									changeRightAxis = true;
								}
						}
						if (
							(world.getBlockState(pos.west().north()).getBlockFaceShape(world, pos.west().north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up().north()).getBlockFaceShape(world, pos.west().up().north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(2).north()).getBlockFaceShape(world, pos.west().up(2).north(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.west().up(3).north()).getBlockFaceShape(world, pos.west().up(3).north(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.west(), world))
							&& (canPlace(pos.west().up(), world))
							&& (canPlace(pos.west().up(2), world))
							&& (canPlace(pos.west().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								leftSpace = true;
								changeLeftAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.north()).getBlockFaceShape(world, pos.north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().north()).getBlockFaceShape(world, pos.up().north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).north()).getBlockFaceShape(world, pos.up(2).north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).north()).getBlockFaceShape(world, pos.up(3).north(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.west().north(), world))
								&& (canPlace(pos.west().up().north(), world))
								&& (canPlace(pos.west().up(2).north(), world))
								&& (canPlace(pos.west().up(3).north(), world))
								&& (counter < TrunkHeight - 1)
								) {
									leftSpace = true;
									changeLeftAxis = true;
								}
						}
					}
					if (facing == EnumFacing.EAST) {
						if (
							(world.getBlockState(pos.north().west()).getBlockFaceShape(world, pos.north().west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up().west()).getBlockFaceShape(world, pos.north().up().west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up(2).west()).getBlockFaceShape(world, pos.north().up(2).west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up(3).west()).getBlockFaceShape(world, pos.north().up(3).west(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.north(), world))
							&& (canPlace(pos.north().up(), world))
							&& (canPlace(pos.north().up(2), world))
							&& (canPlace(pos.north().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								rightSpace = true;
								changeRightAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().west()).getBlockFaceShape(world, pos.up().west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).west()).getBlockFaceShape(world, pos.up(2).west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).west()).getBlockFaceShape(world, pos.up(3).west(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.north().west(), world))
								&& (canPlace(pos.north().up().west(), world))
								&& (canPlace(pos.north().up(2).west(), world))
								&& (canPlace(pos.north().up(3).west(), world))
								&& (counter < TrunkHeight - 1)
								) {
									rightSpace = true;
									changeRightAxis = true;
								}
						}
						if (
							(world.getBlockState(pos.south().west()).getBlockFaceShape(world, pos.south().west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up().west()).getBlockFaceShape(world, pos.south().up().west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up(2).west()).getBlockFaceShape(world, pos.south().up(2).west(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up(3).west()).getBlockFaceShape(world, pos.south().up(3).west(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.south(), world))
							&& (canPlace(pos.south().up(), world))
							&& (canPlace(pos.south().up(2), world))
							&& (canPlace(pos.south().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								leftSpace = true;
								changeLeftAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.west()).getBlockFaceShape(world, pos.west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().west()).getBlockFaceShape(world, pos.up().west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).west()).getBlockFaceShape(world, pos.up(2).west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).west()).getBlockFaceShape(world, pos.up(3).west(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.south().west(), world))
								&& (canPlace(pos.south().up().west(), world))
								&& (canPlace(pos.south().up(2).west(), world))
								&& (canPlace(pos.south().up(3).west(), world))
								&& (counter < TrunkHeight - 1)
								) {
									leftSpace = true;
									changeLeftAxis = true;
								}
						}
					}
					if (facing == EnumFacing.WEST) {
						if (
							(world.getBlockState(pos.south().east()).getBlockFaceShape(world, pos.south().east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up().east()).getBlockFaceShape(world, pos.south().up().east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up(2).east()).getBlockFaceShape(world, pos.south().up(2).east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.south().up(3).east()).getBlockFaceShape(world, pos.south().up(3).east(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.south(), world))
							&& (canPlace(pos.south().up(), world))
							&& (canPlace(pos.south().up(2), world))
							&& (canPlace(pos.south().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								rightSpace = true;
								changeRightAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().east()).getBlockFaceShape(world, pos.up().east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).east()).getBlockFaceShape(world, pos.up(2).east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).east()).getBlockFaceShape(world, pos.up(3).east(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.south().east(), world))
								&& (canPlace(pos.south().up().east(), world))
								&& (canPlace(pos.south().up(2).east(), world))
								&& (canPlace(pos.south().up(3).east(), world))
								&& (counter < TrunkHeight - 1)
								) {
									rightSpace = true;
									changeRightAxis = true;
								}
						}
						if (
							(world.getBlockState(pos.north().east()).getBlockFaceShape(world, pos.north().east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up().east()).getBlockFaceShape(world, pos.north().up().east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up(2).east()).getBlockFaceShape(world, pos.north().up(2).east(), facing) == BlockFaceShape.SOLID) 
							&& (world.getBlockState(pos.north().up(3).east()).getBlockFaceShape(world, pos.north().up(3).east(), facing) == BlockFaceShape.SOLID) 
							&& (canPlace(pos.north(), world))
							&& (canPlace(pos.north().up(), world))
							&& (canPlace(pos.north().up(2), world))
							&& (canPlace(pos.north().up(3), world))
							&& (counter < TrunkHeight - 1)
							) {
								leftSpace = true;
								changeLeftAxis = false;
							}
						else {
							if (
								(world.getBlockState(pos.east()).getBlockFaceShape(world, pos.east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up().east()).getBlockFaceShape(world, pos.up().east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(2).east()).getBlockFaceShape(world, pos.up(2).east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (world.getBlockState(pos.up(3).east()).getBlockFaceShape(world, pos.up(3).east(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
								&& (canPlace(pos.north().east(), world))
								&& (canPlace(pos.north().up().east(), world))
								&& (canPlace(pos.north().up(2).east(), world))
								&& (canPlace(pos.north().up(3).east(), world))
								&& (counter < TrunkHeight - 1)
								) {
									leftSpace = true;
									changeLeftAxis = true;
								}
						}
					}
	
					if (!leftSpace & !rightSpace) {
						//Just top off then with a stick and force the next addition to be a rosette at the top:
						PlaceBlock(pos, world, BlockGigantopteridClimbingStem.block, facing);
						PlaceBlock(pos.up(), world, BlockGigantopteridClimbingShoot.block, EnumFacing.UP);
						counter = TrunkHeight;
						PlaceSegment(facing, counter, TrunkHeight, world, pos.up());
					}
					else {
						//Pick a random direction:
						if (leftSpace && rightSpace) {
							if (Math.random() > 0.5) {
								leftSpace = false;
							}
							else {
								rightSpace = false;
							}
						}
						//And now go in that direction:
						if (facing == EnumFacing.NORTH) {
							if (rightSpace) {
								if (!changeRightAxis) {
									//place the bend:
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
									PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNW.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.west().up());
								}
								else { //changeAxis = true
									//place the bend round the corner::
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
									//And swap to the new axis now:
									facing = EnumFacing.WEST;
									PlaceBlock(pos.west().south(), world, BlockGigantopteridClimbingStemNW.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									PlaceSegment(facing, counter, TrunkHeight,world, pos.west().south().up());
								}
							}
							else { //leftSpace
								if (!changeLeftAxis) {
									//place the bend:
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
									PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNE.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									PlaceSegment(facing, counter, TrunkHeight, world, pos.east().up());
									}
								else { //changeAxis = true
									//place the bend round the corner::
									PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
									//And swap to the new axis now:
									facing = EnumFacing.EAST;
									PlaceBlock(pos.east().south(), world, BlockGigantopteridClimbingStemNE.block, facing);
									//And apply recursion for the next block:
									counter = counter + 1;
									PlaceSegment(facing, counter, TrunkHeight,world, pos.east().south().up());
								}
							}
						}
						else {
							if (facing == EnumFacing.SOUTH) {
								if (rightSpace) {
									if (!changeRightAxis) {
										//place the bend:
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
										PlaceBlock(pos.east(), world, BlockGigantopteridClimbingStemNW.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.east().up());
									}
									else { //changeAxis = true
										//place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.EAST;
										PlaceBlock(pos.east().north(), world, BlockGigantopteridClimbingStemNW.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.east().north().up());
									}
								}
								else { //leftSpace
									if (!changeLeftAxis) {
										//place the bend:
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										PlaceBlock(pos.west(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										PlaceSegment(facing, counter, TrunkHeight, world, pos.west().up());
										}
									else { //changeAxis = true
										//place the bend round the corner::
										PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
										//And swap to the new axis now:
										facing = EnumFacing.WEST;
										PlaceBlock(pos.west().north(), world, BlockGigantopteridClimbingStemNE.block, facing);
										//And apply recursion for the next block:
										counter = counter + 1;
										PlaceSegment(facing, counter, TrunkHeight,world, pos.west().north().up());
									}
								}
							}
							else {
								if (facing == EnumFacing.EAST) {
									if (rightSpace) {
										if (!changeRightAxis) {
											//place the bend:
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
											PlaceBlock(pos.north(), world, BlockGigantopteridClimbingStemNW.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight, world, pos.north().up());
										}
										else { //changeAxis = true
											//place the bend round the corner::
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
											//And swap to the new axis now:
											facing = EnumFacing.NORTH;
											PlaceBlock(pos.north().west(), world, BlockGigantopteridClimbingStemNW.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight,world, pos.north().west().up());
										}
									}
									else { //leftSpace
										if (!changeLeftAxis) {
											//place the bend:
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
											PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNE.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight, world, pos.south().up());
											}
										else { //changeAxis = true
											//place the bend round the corner::
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
											//And swap to the new axis now:
											facing = EnumFacing.SOUTH;
											PlaceBlock(pos.south().west(), world, BlockGigantopteridClimbingStemNE.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight,world, pos.south().west().up());
										}
									}
								}
								else { //facing == EnumFacing.WEST
									if (rightSpace) {
										if (!changeRightAxis) {
											//place the bend:
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
											PlaceBlock(pos.south(), world, BlockGigantopteridClimbingStemNW.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight, world, pos.south().up());
										}
										else { //changeAxis = true
											//place the bend round the corner::
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSE.block, facing);
											//And swap to the new axis now:
											facing = EnumFacing.SOUTH;
											PlaceBlock(pos.south().east(), world, BlockGigantopteridClimbingStemNW.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight,world, pos.south().east().up());
										}
									}
									else { //leftSpace
										if (!changeLeftAxis) {
											//place the bend:
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
											PlaceBlock(pos.north(), world, BlockGigantopteridClimbingStemNE.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight, world, pos.north().up());
											}
										else { //changeAxis = true
											//place the bend round the corner::
											PlaceBlock(pos, world, BlockGigantopteridClimbingStemSW.block, facing);
											//And swap to the new axis now:
											facing = EnumFacing.NORTH;
											PlaceBlock(pos.north().east(), world, BlockGigantopteridClimbingStemNE.block, facing);
											//And apply recursion for the next block:
											counter = counter + 1;
											PlaceSegment(facing, counter, TrunkHeight,world, pos.north().east().up());
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void PlaceBlock(BlockPos pos, World world, Block blockPlace, EnumFacing facing) {
	
		Block block = world.getBlockState(pos).getBlock();
		if (canPlace(pos, world)) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos, blockPlace.getDefaultState().withProperty(FACING, facing), 3);
		}
		
	}

	static Boolean canPlace(BlockPos pos, World world) {
		Block block = world.getBlockState(pos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(pos), world, pos)) {
			return true;
		}
		return false;
	}
	
}
