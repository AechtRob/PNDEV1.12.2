package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockConiopteris;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenConiopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 24; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)            		
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.WOOD)
            	)
                && worldIn.getBlockState(blockpos.down()).getBlockFaceShape(worldIn, blockpos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
                && BlockConiopteris.block.canPlaceBlockAt(worldIn, blockpos)
            )
            {
                worldIn.setBlockState(blockpos, BlockConiopteris.block.getDefaultState(), 2);
                BlockConiopteris.block.onBlockAdded(worldIn, blockpos, BlockConiopteris.block.getDefaultState());
                flag = true;
            }
        }

        return flag;
    }
}
