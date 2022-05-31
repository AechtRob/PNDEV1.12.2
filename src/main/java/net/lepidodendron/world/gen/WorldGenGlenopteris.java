package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGlenopteris;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGlenopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int k = 8;
        if (needsWater) k = 192;
        for (int i = 0; i < k; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(8) - rand.nextInt(8), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockGlenopteris.block.canPlaceBlockAt(worldIn, blockpos)
            )
            if (!needsWater) {
                {
                    worldIn.setBlockState(blockpos, BlockGlenopteris.block.getDefaultState(), 2);
                    BlockGlenopteris.block.onBlockAdded(worldIn, blockpos, BlockGlenopteris.block.getDefaultState());
                    flag = true;
                }
            }
            else {
                boolean waterCriteria = false;
                //Is there water nearby?
                int xct = -5;
                int yct;
                int zct;
                while ((xct < 6) && (!waterCriteria)) {
                    yct = -6;
                    while ((yct <= 1) && (!waterCriteria)) {
                        zct = -5;
                        while ((zct < 6) && (!waterCriteria)) {
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
                    worldIn.setBlockState(blockpos, BlockGlenopteris.block.getDefaultState(), 2);
                    BlockGlenopteris.block.onBlockAdded(worldIn, blockpos, BlockGlenopteris.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
