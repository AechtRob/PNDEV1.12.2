package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLichen;
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

public class LichenGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block Lichen;
    private IBlockState state;

    public LichenGenerator(Block LichenIn)
    {
        this.setGeneratedBlock(LichenIn);
    }

    public void setGeneratedBlock(Block LichenIn)
    {
        this.Lichen = LichenIn;
        this.state = LichenIn.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 24; ++i)
        {
            int j = position.getX() + rand.nextInt(8) - rand.nextInt(8);
            int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
            int l = position.getZ() + rand.nextInt(8) - rand.nextInt(8);

            if (k >= worldIn.getSeaLevel() && this.Lichen.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
            	&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial().isReplaceable())
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.LAVA) ){
				//figure out a position and facing to place this at!
				for (EnumFacing enumfacing : FACING.getAllowedValues())
		        {
		        	BlockPos pos = new BlockPos(j, k, l);
		        	//if (enumfacing == EnumFacing.NORTH) {pos = new BlockPos(j, k, l + 1);}
		        	//if (enumfacing == EnumFacing.SOUTH) {pos = new BlockPos(j, k, l - 1);}
		        	//if (enumfacing == EnumFacing.EAST) {pos = new BlockPos(j - 1, k, l);}
		        	//if (enumfacing == EnumFacing.WEST) {pos = new BlockPos(j + 1, k, l);}

		            if (BlockLichen.BlockCustom.canPlaceAt(worldIn, pos, enumfacing)
		            	&& worldIn.canSeeSky(pos))
		            {
		                worldIn.setBlockState(pos, this.state.withProperty(FACING, enumfacing), 3);
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
