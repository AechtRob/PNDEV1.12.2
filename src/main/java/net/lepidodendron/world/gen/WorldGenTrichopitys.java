package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockTrichopitys;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenTrichopitys extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 24; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockTrichopitys.block.canPlaceBlockAt(worldIn, blockpos) &&
                    (
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                    )
            )
            if (!needsWater) {
                {
                    worldIn.setBlockState(blockpos, BlockTrichopitys.block.getDefaultState(), 2);
                    BlockTrichopitys.block.onBlockAdded(worldIn, blockpos, BlockTrichopitys.block.getDefaultState());
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
                    worldIn.setBlockState(blockpos, BlockTrichopitys.block.getDefaultState(), 2);
                    BlockTrichopitys.block.onBlockAdded(worldIn, blockpos, BlockTrichopitys.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }
}
