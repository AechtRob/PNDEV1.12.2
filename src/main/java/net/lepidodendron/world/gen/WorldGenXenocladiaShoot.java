package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockWattiezaSapling;
import net.lepidodendron.block.BlockXenocladiaShootPlaceable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenXenocladiaShoot extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockWattiezaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.north().east()).getBlock() != BlockXenocladiaShootPlaceable.block)
            	&& (worldIn.getBlockState(blockpos.north().west()).getBlock() != BlockXenocladiaShootPlaceable.block)
            	&& (worldIn.getBlockState(blockpos.south().east()).getBlock() != BlockXenocladiaShootPlaceable.block)
            	&& (worldIn.getBlockState(blockpos.south().west()).getBlock() != BlockXenocladiaShootPlaceable.block)
            	)
            {
                worldIn.setBlockState(blockpos, BlockXenocladiaShootPlaceable.block.getDefaultState(), 3);
                flag = true;
            }
        }

        return flag;
    }
}
