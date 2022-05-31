package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class OesiaGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block oesia;
    private IBlockState state;

    public OesiaGenerator(Block oesiaIn)
    {
        this.setGeneratedBlock(oesiaIn);
    }

    public void setGeneratedBlock(Block oesiaIn)
    {
    	Random rand = new Random();
		int ii = rand.nextInt(4);
        this.oesia = oesiaIn;
        if (ii == 0) {
			this.state = oesiaIn.getDefaultState().withProperty(FACING, EnumFacing.NORTH);
		}
		if (ii == 1) {
			this.state = oesiaIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
			}
		if (ii == 2) {
			this.state = oesiaIn.getDefaultState().withProperty(FACING, EnumFacing.EAST);
		}
		if (ii == 3) {
			this.state = oesiaIn.getDefaultState().withProperty(FACING, EnumFacing.WEST);
		}
        //this.state = oesiaIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimCrinoid))
		dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimCambrian) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return true;

		int bound = 8;

		for (int i = 0; i < 24; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (this.oesia.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
			&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER)){

				//Check that at least enough water is over the position (15 blocks for these):
				boolean waterDepthCheckMin = true;
				int yy = 1;
				while (yy <= 15 && waterDepthCheckMin) {
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
						|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD)))
					{
						worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
						//Assign a variant at random - not needed for sideways rendering but is co-opted for varying height attachments
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().setInteger("variant", rand.nextInt(11));
						}
						worldIn.notifyBlockUpdate(pos, worldIn.getBlockState(new BlockPos(j, k, l)), worldIn.getBlockState(new BlockPos(j, k, l)), 3);
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
