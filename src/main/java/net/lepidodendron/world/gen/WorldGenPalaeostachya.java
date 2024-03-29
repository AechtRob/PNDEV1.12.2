package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPalaeostachyaBottom;
import net.lepidodendron.block.BlockPalaeostachyaSapling;
import net.lepidodendron.block.BlockPalaeostachyaStem;
import net.lepidodendron.block.BlockPalaeostachyaTop;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenPalaeostachya extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPalaeostachyaSapling.block.canPlaceBlockAt(worldIn, blockpos)
                    )
            {

                if ((worldIn.canSeeSky(blockpos))
                        && worldIn.isAirBlock(blockpos.up()) && worldIn.isAirBlock((blockpos.up(2))) && worldIn.isAirBlock((blockpos.up(3))) && worldIn.isAirBlock((blockpos.up(4)))) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPalaeostachyaStem.block.getDefaultState(), 3);
                    if (Math.random() > 0.6) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockPalaeostachyaStem.block.getDefaultState(), 3);
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), BlockPalaeostachyaBottom.block.getDefaultState(), 3);
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(3), BlockPalaeostachyaTop.block.getDefaultState(), 3);
                    }
                    else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockPalaeostachyaBottom.block.getDefaultState(), 3);
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), BlockPalaeostachyaTop.block.getDefaultState(), 3);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
