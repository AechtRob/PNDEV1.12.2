package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGrassyHorsetail;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGrassyHorsetail extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int k = 24;
        if (needsWater) k = 256;
        for (int i = 0; i < k; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(8) - rand.nextInt(8), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockGrassyHorsetail.block.canPlaceBlockAt(worldIn, blockpos)
            )
            if (!needsWater) {
                {
                    worldIn.setBlockState(blockpos, BlockGrassyHorsetail.block.getDefaultState(), 2);
                    BlockGrassyHorsetail.block.onBlockAdded(worldIn, blockpos, BlockGrassyHorsetail.block.getDefaultState());
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
                    worldIn.setBlockState(blockpos, BlockGrassyHorsetail.block.getDefaultState(), 2);
                    BlockGrassyHorsetail.block.onBlockAdded(worldIn, blockpos, BlockGrassyHorsetail.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
