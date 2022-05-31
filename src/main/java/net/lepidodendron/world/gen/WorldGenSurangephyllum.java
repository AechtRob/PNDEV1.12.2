package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSurangephyllum;
import net.lepidodendron.block.BlockSurangephyllumTop;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSurangephyllum extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSurangephyllum.block.canPlaceBlockAt(worldIn, blockpos) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
            	)
            )
            
            {
                worldIn.setBlockState(blockpos, BlockSurangephyllum.block.getDefaultState(), 2);
                worldIn.setBlockState(blockpos.up(), BlockSurangephyllumTop.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
