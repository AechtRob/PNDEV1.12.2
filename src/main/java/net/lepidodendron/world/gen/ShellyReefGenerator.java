package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockShelly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ShellyReefGenerator extends WorldGenerator
{
	private Block reef;
    private IBlockState state;

    public ShellyReefGenerator(Block reefIn)
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
		int[] dimCheck = LepidodendronConfigPlants.dimShellyReef;

		if (shouldGenerateInDimension(dimID, dimCheck))
			dimensionCriteria = true;

		Biome biome = worldIn.getBiome(position);
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks")
			|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks_raised")) {
			dimensionCriteria = true;
		}

		if (!dimensionCriteria)
			return true;

		int bound = 8;
		for (int i = 0; i < 32; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = worldIn.getSeaLevel() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (k == worldIn.getSeaLevel() - 2) {

				if (this.reef.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER || worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.FLOWING_WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.WATER || worldIn.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.FLOWING_WATER)
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
							worldIn.setBlockState(new BlockPos(j, k, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j, k - 1, l - 1), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j, k - 1, l + 1), getShellyState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								worldIn.setBlockState(new BlockPos(j, k + 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k - 1, l - 2), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k - 1, l + 2), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k, l - 1), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k, l + 1), getShellyState(this.state, rand), 2);
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
							worldIn.setBlockState(new BlockPos(j, k, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j, k - 1, l - 1), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j, k - 1, l + 1), getShellyState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								worldIn.setBlockState(new BlockPos(j, k + 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k - 1, l - 2), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k - 1, l + 2), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k, l - 1), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j, k, l + 1), getShellyState(this.state, rand), 2);
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
							worldIn.setBlockState(new BlockPos(j, k, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j - 1, k - 1, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j + 1, k - 1, l), getShellyState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								worldIn.setBlockState(new BlockPos(j, k + 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j - 2, k - 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j + 2, k - 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j - 1, k, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j + 1, k, l), getShellyState(this.state, rand), 2);
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
							worldIn.setBlockState(new BlockPos(j, k, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j - 1, k - 1, l), getShellyState(this.state, rand), 2);
							worldIn.setBlockState(new BlockPos(j + 1, k - 1, l), getShellyState(this.state, rand), 2);
							if (rand.nextInt(10) ==0) {
								worldIn.setBlockState(new BlockPos(j, k + 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j - 2, k - 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j + 2, k - 1, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j - 1, k, l), getShellyState(this.state, rand), 2);
								worldIn.setBlockState(new BlockPos(j + 1, k, l), getShellyState(this.state, rand), 2);
							}
						}
					}


				}
			}
		}
		return true;
	}
	
	public static IBlockState getShellyState(IBlockState state, Random rand) {
		int i = rand.nextInt(4);
		switch (i) {
			case 0:
			default:
				return state.withProperty(BlockShelly.FACING, EnumFacing.NORTH);

			case 1:
				return state.withProperty(BlockShelly.FACING, EnumFacing.SOUTH);
				
			case 2:
				return state.withProperty(BlockShelly.FACING, EnumFacing.EAST);
				
			case 3:
				return state.withProperty(BlockShelly.FACING, EnumFacing.WEST);

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
