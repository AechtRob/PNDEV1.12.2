package net.lepidodendron.world.gen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenFern extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && Blocks.TALLGRASS.getStateFromMeta(2).getBlock().canPlaceBlockAt(worldIn, blockpos)
                && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2)))
            {
                worldIn.setBlockState(blockpos, Blocks.TALLGRASS.getStateFromMeta(2), 2);
                flag = true;
            }
        }

        return flag;
    }
}