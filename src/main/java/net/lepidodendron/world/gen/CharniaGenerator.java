package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockStromatolite;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class CharniaGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block charnia;
    private IBlockState state;

    public CharniaGenerator(Block charniaIn)
    {
        this.setGeneratedBlock(charniaIn);
    }

    public void setGeneratedBlock(Block charniaIn)
    {
    	Random rand = new Random();
		int ii = rand.nextInt(4);
        this.charnia = charniaIn;
        if (ii == 0) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.NORTH);
		}
		if (ii == 1) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
			}
		if (ii == 2) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.EAST);
		}
		if (ii == 3) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.WEST);
		}
        //this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimEdiacaran))
		dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimPrecambrian) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return true;

		int bound = 8;

		for (int i = 0; i < 32; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (this.charnia.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
			&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER)){

				//Check that at least enough water is over the position (2 blocks):
				boolean waterDepthCheckMin = true;
				int yy = 1;
				while (yy <= 2 && waterDepthCheckMin) {
					if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
						waterDepthCheckMin = false;
					}
					yy += 1;
				}

				if (waterDepthCheckMin) {
					//figure out a position and facing to place this at!
					BlockPos pos = new BlockPos(j, k - 1, l);
					if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
						&& (worldIn.getBlockState(pos).getBlock() != BlockStromatolite.block))
					{ //Do not generate on top of Stromatolites: they have their own different community
						worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
						return true;
					}
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
