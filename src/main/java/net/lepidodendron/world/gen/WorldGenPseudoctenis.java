package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPseudoctenis;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPseudoctenis extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int offset = 4;
        if (needsWater) {
            offset = 2;
        }
        for (int i = 0; i < 8; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(8) - rand.nextInt(8), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPseudoctenis.block.canPlaceBlockAt(worldIn, blockpos) &&
                    (
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
                    )
            )
            if (!needsWater) {
                {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPseudoctenis.block.getDefaultState(), 2);
                    BlockPseudoctenis.block.onBlockAdded(worldIn, blockpos, BlockPseudoctenis.block.getDefaultState());
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
                    yct = -4;
                    while ((yct <= 2) && (!waterCriteria)) {
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
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPseudoctenis.block.getDefaultState(), 2);
                    BlockPseudoctenis.block.onBlockAdded(worldIn, blockpos, BlockPseudoctenis.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
