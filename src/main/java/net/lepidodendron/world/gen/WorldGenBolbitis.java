package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockBolbitis;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenBolbitis extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ( (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockBolbitis.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockBolbitis.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
