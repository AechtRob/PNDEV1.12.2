package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCaytoniales;
import net.lepidodendron.block.BlockCaytoniales2;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCaytoniales extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        boolean flag = false;

        int flag1 = 0;
        if (rand.nextInt(2) == 0) {
            flag1 = 1;
        }

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockCaytoniales.block.canPlaceBlockAt(worldIn, blockpos) &&
                (
                    (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                )
                && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
            )
            {

                if (flag1 == 0) {
                    worldIn.setBlockState(blockpos, BlockCaytoniales.block.getDefaultState(), 2);
                    BlockCaytoniales.block.onBlockAdded(worldIn, blockpos, BlockCaytoniales.block.getDefaultState());
                }
                else {
                    worldIn.setBlockState(blockpos, BlockCaytoniales2.block.getDefaultState(), 2);
                    BlockCaytoniales2.block.onBlockAdded(worldIn, blockpos, BlockCaytoniales2.block.getDefaultState());
                }

                flag = true;
            }
        }

        return flag;
    }
}
