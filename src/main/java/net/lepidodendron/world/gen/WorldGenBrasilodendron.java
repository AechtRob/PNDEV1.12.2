package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockBrasilodendron;
import net.lepidodendron.block.BlockBrasilodendronCentre;
import net.lepidodendron.block.BlockBrasilodendronTop;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenBrasilodendron extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockBrasilodendron.block.canPlaceBlockAt(worldIn, blockpos) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
            	)
            )
            
            {
                worldIn.setBlockState(blockpos, BlockBrasilodendron.block.getDefaultState(), 2);
                worldIn.setBlockState(blockpos.up(), BlockBrasilodendronCentre.block.getDefaultState(), 2);
                worldIn.setBlockState(blockpos.up(2), BlockBrasilodendronTop.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
