package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPrehistoricGroundCoverPlantsLush;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPrehistoricGroundCoverLush extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        boolean flag = false;

        for (int i = 0; i < 100; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPrehistoricGroundCoverPlantsLush.block.canPlaceBlockAt(worldIn, blockpos)
                    && (blockpos.getY() >= minHeight && blockpos.getY() <= maxHeight))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrehistoricGroundCoverPlantsLush.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
