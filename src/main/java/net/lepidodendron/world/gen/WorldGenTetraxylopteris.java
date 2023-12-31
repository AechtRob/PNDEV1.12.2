package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockTetraxylopteris;
import net.lepidodendron.block.BlockTetraxylopterisSpore;
import net.lepidodendron.block.BlockTetraxylopterisTop;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenTetraxylopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && worldIn.isAirBlock(blockpos.up()) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockTetraxylopteris.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockTetraxylopteris.block.getDefaultState(), 2);
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockTetraxylopterisTop.block.getDefaultState(), 2);
            	if (Math.random() > 0.75 && worldIn.isAirBlock(blockpos.up(2))) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), BlockTetraxylopterisSpore.block.getDefaultState(), 2);
				}
                flag = true;
            }
        }

        return flag;
    }
}
