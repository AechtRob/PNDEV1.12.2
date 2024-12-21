package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLiverwort;
import net.lepidodendron.util.Functions;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenLiverwort extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && (blockpos.getY() < Functions.getAdjustedSeaLevel(worldIn, blockpos)+10) && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockLiverwort.block.canPlaceBlockAt(worldIn, blockpos))
            {
			    if (BlockLiverwort.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockLiverwort.block.getDefaultState(), 2);
					flag = true;
            	}
            }
        }

        return flag;
    }

}