package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockRudistReef;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class RudistReefGenerator extends WorldGenerator
{
	private Block reef;
    private IBlockState state;

    public RudistReefGenerator(Block reefIn)
    {
        this.setGeneratedBlock(reefIn);
    }

    public void setGeneratedBlock(Block reefIn)
    {
        this.reef = reefIn;
        this.state = reefIn.getDefaultState();
    }

    //marine int: -1  = non-marine, 0 = both 1 = marine only
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		int[] dimCheck = LepidodendronConfigPlants.dimReef;
		if (shouldGenerateInDimension(dimID, dimCheck))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return true;

		int bound = 8;
		for (int i = 0; i < 32; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			//int k = Functions.getAdjustedSeaLevel(worldIn, blockpos) + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, 0, l)) + rand.nextInt(4) - rand.nextInt(4);

			if (k == Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, 0, l)) - 2) {

				if (this.reef.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
					&& (Functions.isWater(worldIn, new BlockPos(j, k, l)))
					&& (Functions.isWater(worldIn, new BlockPos(j, k + 1, l)))
					&& !worldIn.isAirBlock(new BlockPos(j, k, l + 1))
					&& !worldIn.isAirBlock(new BlockPos(j, k, l - 1))
					&& !worldIn.isAirBlock(new BlockPos(j + 1, k, l))
					&& !worldIn.isAirBlock(new BlockPos(j - 1, k, l))) {

					//Test where we are
					//North?
					if (worldIn.getBlockState(new BlockPos(j, k - 1, l - 1)).getMaterial() == Material.WATER
						&& worldIn.getBlockState(new BlockPos(j, k - 1, l + 1)).getMaterial() != Material.WATER
						&& worldIn.getBlockState(new BlockPos(j, k, l - 1)).getMaterial() == Material.WATER) {

						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
						) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l - 1), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l + 1), getRudistState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k + 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l - 2), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l + 2), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l - 1), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l + 1), getRudistState(this.state, rand), 2);
							}
						}
					}

					//South?
					if (worldIn.getBlockState(new BlockPos(j, k - 1, l + 1)).getMaterial() == Material.WATER
						&& worldIn.getBlockState(new BlockPos(j, k - 1, l - 1)).getMaterial() != Material.WATER
						&& worldIn.getBlockState(new BlockPos(j, k, l + 1)).getMaterial() == Material.WATER) {

						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
						) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l - 1), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l + 1), getRudistState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k + 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l - 2), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 1, l + 2), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l - 1), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l + 1), getRudistState(this.state, rand), 2);
							}
						}
					}

					//East?
					if (worldIn.getBlockState(new BlockPos(j + 1, k - 1, l)).getMaterial() == Material.WATER
						&& worldIn.getBlockState(new BlockPos(j - 1, k - 1, l)).getMaterial() != Material.WATER
						&& worldIn.getBlockState(new BlockPos(j + 1, k, l)).getMaterial() == Material.WATER) {

						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
						) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 1, k - 1, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 1, k - 1, l), getRudistState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k + 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 2, k - 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 2, k - 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 1, k, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 1, k, l), getRudistState(this.state, rand), 2);
							}
						}
					}

					//West?
					if (worldIn.getBlockState(new BlockPos(j - 1, k - 1, l)).getMaterial() == Material.WATER
						&& worldIn.getBlockState(new BlockPos(j + 1, k - 1, l)).getMaterial() != Material.WATER
						&& worldIn.getBlockState(new BlockPos(j - 1, k, l)).getMaterial() == Material.WATER) {

						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
						) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 1, k - 1, l), getRudistState(this.state, rand), 2);
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 1, k - 1, l), getRudistState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k + 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 2, k - 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 2, k - 1, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j - 1, k, l), getRudistState(this.state, rand), 2);
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j + 1, k, l), getRudistState(this.state, rand), 2);
							}
						}
					}


				}
			}
		}
		return true;
	}
	
	public static IBlockState getRudistState(IBlockState state, Random rand) {
		int i = rand.nextInt(4);
		switch (i) {
			case 0:
			default:
				return state.withProperty(BlockRudistReef.FACING, EnumFacing.NORTH);

			case 1:
				return state.withProperty(BlockRudistReef.FACING, EnumFacing.SOUTH);
				
			case 2:
				return state.withProperty(BlockRudistReef.FACING, EnumFacing.EAST);
				
			case 3:
				return state.withProperty(BlockRudistReef.FACING, EnumFacing.WEST);

		}
	}

	public boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
    }
}
