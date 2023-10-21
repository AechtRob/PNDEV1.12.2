package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDiskagma;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDiskagma extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

            if (worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockDiskagma.block.canPlaceBlockAt(worldIn, blockpos))
			{
				if (BlockDiskagma.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					worldIn.setBlockState(blockpos, BlockDiskagma.block.getDefaultState(), 2);
					flag = true;
				}
            }
        }

        return flag;
    }
}
