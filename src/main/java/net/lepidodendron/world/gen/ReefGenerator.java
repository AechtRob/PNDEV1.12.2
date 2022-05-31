package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ReefGenerator extends WorldGenerator
{
	private Block reef;
    private IBlockState state;

    public ReefGenerator(Block reefIn)
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
		int[] dimCheck = LepidodendronConfig.dimReef;
		if (shouldGenerateInDimension(dimID, dimCheck))
		dimensionCriteria = true;
		if (!dimensionCriteria)
			return true;

		int bound = 8;
		for (int i = 0; i < 32; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (this.reef.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
				&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER || worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.FLOWING_WATER)
				&& (worldIn.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.WATER || worldIn.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.FLOWING_WATER)
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
