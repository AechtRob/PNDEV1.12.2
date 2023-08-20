package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockSpongeReef;
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

public class SpongeReefGenerator extends WorldGenerator
{
	private Block reef;
    private IBlockState state;

    public SpongeReefGenerator(Block reefIn)
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
		int[] dimCheck = LepidodendronConfigPlants.dimSpongeReef;
		if (shouldGenerateInDimension(dimID, dimCheck))
			dimensionCriteria = true;

		/*
		Biome biome = worldIn.getBiome(position);
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")) {
			dimensionCriteria = true;
		}

		 */

		if (!dimensionCriteria)
			return true;


		int bound = 8;
		for (int i = 0; i < 32; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (this.reef.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
				&& (Functions.isWater(worldIn, new BlockPos(j, k, l)))
				&& (Functions.isWater(worldIn, new BlockPos(j, k + 1, l)))
				&& !worldIn.isAirBlock(new BlockPos(j, k, l+1))
				&& !worldIn.isAirBlock(new BlockPos(j, k, l-1))
				&& !worldIn.isAirBlock(new BlockPos(j+1, k, l))
				&& !worldIn.isAirBlock(new BlockPos(j-1, k, l))) {

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
				)
				{
					int ii = rand.nextInt(4);
					if (ii == 0) {
						this.state = this.state.withProperty(BlockSpongeReef.FACING, EnumFacing.NORTH);
					}
					if (ii == 1) {
						this.state = this.state.withProperty(BlockSpongeReef.FACING, EnumFacing.EAST);
					}
					if (ii == 2) {
						this.state = this.state.withProperty(BlockSpongeReef.FACING, EnumFacing.SOUTH);
					}
					if (ii == 3) {
						this.state = this.state.withProperty(BlockSpongeReef.FACING, EnumFacing.WEST);
					}
					worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
				}
			}
		}
		return true;
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
