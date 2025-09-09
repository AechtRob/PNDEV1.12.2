package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockAngiopteris;
import net.lepidodendron.block.BlockTetraxylopteris;
import net.lepidodendron.block.BlockTetraxylopterisSpore;
import net.lepidodendron.block.BlockTetraxylopterisTop;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenTetraxylopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int offset = 8;
        if (needsWater) {
            offset = 6;
        }

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && worldIn.isAirBlock(blockpos.up()) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockTetraxylopteris.block.canPlaceBlockAt(worldIn, blockpos))
            {
                if (!needsWater) {

                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTetraxylopteris.block.getDefaultState(), 2);
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(), BlockTetraxylopterisTop.block.getDefaultState(), 2);
                    if (Math.random() > 0.75 && worldIn.isAirBlock(blockpos.up(2))) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(2), BlockTetraxylopterisSpore.block.getDefaultState(), 2);
                    }
                    flag = true;
                }
                else {
                    boolean waterCriteria = false;
                    //Is there water nearby?
                    int xct = -2;
                    int yct;
                    int zct;
                    while ((xct < 3) && (!waterCriteria)) {
                        yct = -2;
                        while ((yct <= 0) && (!waterCriteria)) {
                            zct = -2;
                            while ((zct < 3) && (!waterCriteria)) {
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
                        if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAngiopteris.block.canPlaceBlockAt(worldIn, blockpos)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTetraxylopteris.block.getDefaultState(), 2);
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(), BlockTetraxylopterisTop.block.getDefaultState(), 2);
                            if (Math.random() > 0.75 && worldIn.isAirBlock(blockpos.up(2))) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(2), BlockTetraxylopterisSpore.block.getDefaultState(), 2);
                            }
                            flag = true;
                        }
                    }
                }
            }
        }

        return flag;
    }
}
