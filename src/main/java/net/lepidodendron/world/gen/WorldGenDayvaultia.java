package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDayvaultia;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDayvaultia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(worldIn, rand, position, false, 0);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater) {
        return generate(worldIn, rand, position, needsWater, 0);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater, int minHeight)
    {
        if (minHeight == 0) {
            minHeight = Functions.getAdjustedSeaLevel(worldIn, position) - 4;
        }
        boolean flag = false;
        int k = 24;
        if (needsWater) k = 256;
        int offset = 8;
        if (needsWater) {
            offset = 3;
        }
        for (int i = 0; i < k; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(8) - rand.nextInt(8), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() > minHeight + (rand.nextInt(5) - 2) && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockDayvaultia.block.canPlaceBlockAt(worldIn, blockpos)
            )
            if (!needsWater) {
                {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDayvaultia.block.getDefaultState(), 2);
                    BlockDayvaultia.block.onBlockAdded(worldIn, blockpos, BlockDayvaultia.block.getDefaultState());
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
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDayvaultia.block.getDefaultState(), 2);
                    BlockDayvaultia.block.onBlockAdded(worldIn, blockpos, BlockDayvaultia.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
