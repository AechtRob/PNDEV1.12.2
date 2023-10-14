package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockWelwitschiophyllum;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenWelwitschiophyllum extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int offset = 8;
        if (needsWater) {
            offset = 3;
        }
        for (int i = 0; i < 24; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockWelwitschiophyllum.block.canPlaceBlockAt(worldIn, blockpos) &&
                    (
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                    )
            )
            if (!needsWater) {
                {
                    worldIn.setBlockState(blockpos, BlockWelwitschiophyllum.block.getDefaultState(), 2);
                    BlockWelwitschiophyllum.block.onBlockAdded(worldIn, blockpos, BlockWelwitschiophyllum.block.getDefaultState());
                    flag = true;
                }
            }
            else {
                boolean waterCriteria = false;
                //Is there water nearby?
                int xct = -3;
                int yct;
                int zct;
                while ((xct < 4) && (!waterCriteria)) {
                    yct = -2;
                    while ((yct <= 0) && (!waterCriteria)) {
                        zct = -3;
                        while ((zct < 4) && (!waterCriteria)) {
                            if ((worldIn.getBlockState(position.add(xct, yct, zct))).getMaterial() == Material.WATER) {
                                waterCriteria = true;
                            }
                            zct = zct + 1;
                        }
                        yct = yct + 1;
                    }
                    xct = xct + 1;
                }
                if (waterCriteria) {
                    worldIn.setBlockState(blockpos, BlockWelwitschiophyllum.block.getDefaultState(), 2);
                    BlockWelwitschiophyllum.block.onBlockAdded(worldIn, blockpos, BlockWelwitschiophyllum.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
