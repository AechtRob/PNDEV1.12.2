package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WaterPoppyGenerator extends WorldGenerator
{
	private Block WaterPoppy;
    private IBlockState state;

    public WaterPoppyGenerator(Block WaterPoppyIn)
    {
        this.setGeneratedBlock(WaterPoppyIn);
    }

    public void setGeneratedBlock(Block WaterPoppyIn)
    {
        this.WaterPoppy = WaterPoppyIn;
        this.state = WaterPoppyIn.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
    	boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimWaterPoppy))
			dimensionCriteria = true;
//		if ((dimID == LepidodendronConfig.dimJurassic)
//			|| (dimID == LepidodendronConfig.dimCretaceousEarly)
//			)
//			{
//				dimensionCriteria = true;
//			}

		if (!dimensionCriteria)
			return true;

		int multiplier = 1;
//		if (dimID == LepidodendronConfig.dimJurassic
//				|| dimID == LepidodendronConfig.dimCretaceousEarly
//		) {multiplier = 4;}

        for (int i = 0; i < (32 * multiplier); ++i)
        {
            int j = position.getX() + rand.nextInt(8) - rand.nextInt(8);
            int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
            int l = position.getZ() + rand.nextInt(8) - rand.nextInt(8);

            if (k >= Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, k, l)) && canSurviveAt(worldIn, new BlockPos(j, k, l))
            	&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial().isReplaceable())
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.LAVA) ){

		                Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state, 2);
		                return true;
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

	public boolean canSurviveAt(World worldIn, BlockPos pos) {
		if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE)
		{
			return false;
		}
		if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND)
				&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
				&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GRASS)
				&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
		{
			return false;
		}

//		double getLight = worldIn.getLight(pos);
//		if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
//		{
//			return false;
//		}

		return true;

	}

}
