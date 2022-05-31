package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockTmesipteris;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class TmesipterisGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block Tmesipteris;
    private IBlockState state;

    public TmesipterisGenerator(Block TmesipterisIn)
    {
        this.setGeneratedBlock(TmesipterisIn);
    }

    public void setGeneratedBlock(Block TmesipterisIn)
    {
        this.Tmesipteris = TmesipterisIn;
        this.state = TmesipterisIn.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
    	boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimTmesipteris))
			dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic)
			{
				dimensionCriteria = true;
			}
		if (!dimensionCriteria)
			return true;

        for (int i = 0; i < 64; ++i)
        {
            int j = position.getX() + rand.nextInt(8) - rand.nextInt(8);
            int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
            int l = position.getZ() + rand.nextInt(8) - rand.nextInt(8);

            if (k >= worldIn.getSeaLevel() && this.Tmesipteris.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
            	&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial().isReplaceable())
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.LAVA) ){
				//figure out a position and facing to place this at!
				for (EnumFacing enumfacing : FACING.getAllowedValues())
		        {
		        	BlockPos pos = new BlockPos(j, k, l);
		        	if (enumfacing == EnumFacing.NORTH) {pos = new BlockPos(j, k, l + 1);}
		        	if (enumfacing == EnumFacing.SOUTH) {pos = new BlockPos(j, k, l - 1);}
		        	if (enumfacing == EnumFacing.EAST) {pos = new BlockPos(j - 1, k, l);}
		        	if (enumfacing == EnumFacing.WEST) {pos = new BlockPos(j + 1, k, l);}

		            if (BlockTmesipteris.BlockCustom.canPlaceAt(worldIn, new BlockPos(j, k, l), enumfacing)
		            	&& worldIn.getBlockState(pos).getMaterial() == Material.WOOD)
		            {
		                worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing), 3);
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
