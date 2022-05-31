package net.lepidodendron.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCobble extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos)
            	&& (
            		((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.SAND)
                    || ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.CLAY)
            	)
            )
            {
                worldIn.setBlockState(blockpos.down(), Blocks.COBBLESTONE.getDefaultState(), 2);
                if (rand.nextInt(10) == 0) {
                    worldIn.setBlockState(blockpos, Blocks.COBBLESTONE.getDefaultState(), 2);
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos.down().north(), Blocks.COBBLESTONE.getDefaultState(), 2);
                    }
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos.down().south(), Blocks.COBBLESTONE.getDefaultState(), 2);
                    }
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos.down().east(), Blocks.COBBLESTONE.getDefaultState(), 2);
                    }
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos.down().west(), Blocks.COBBLESTONE.getDefaultState(), 2);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
