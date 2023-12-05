package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockRibCage;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenRibCage extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int maxY)
    {
        boolean flag = false;

        for (int i = 0; i < 2; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() <= maxY && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
                    || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                    || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                    || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK)
            	)
                && worldIn.getBlockState(blockpos.down()).getBlockFaceShape(worldIn, blockpos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
            )
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockRibCage.block.getDefaultState(), 2);
                TileEntity te = worldIn.getTileEntity(blockpos);
                if (te != null) {
                    if (te instanceof BlockRibCage.TileEntityCustom) {
                        BlockRibCage.TileEntityCustom ribcage = (BlockRibCage.TileEntityCustom) te;
                        ribcage.getTileData().setInteger("rotation", rand.nextInt(24) * 15);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
