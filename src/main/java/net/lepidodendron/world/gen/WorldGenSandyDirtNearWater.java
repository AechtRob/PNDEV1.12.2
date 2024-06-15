package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCoarseSandyDirt;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSandyDirtNearWater extends WorldGenerator {

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        boolean flag = false;

        for (int i = 0; i < 48; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));
            //BlockPos blockpos = position.up();
            if (
                    blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && (blockpos.getY() <= Functions.getAdjustedSeaLevel(worldIn, blockpos) + 1) && worldIn.isAirBlock(blockpos)
                    && ((!worldIn.provider.isNether()) || blockpos.getY() < 254)

                    && (
                    ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GROUND)
                            || ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GRASS)
                            || ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.ROCK)
                            || ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.SAND)
                            || ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.CLAY)
            )
            ) {
                //Check for water and make denser near water:
                int ii = 0;
                int water = 0;
                while (ii < 6 && water == 0) {
                    int xx = -ii;
                    while (xx <= ii && water == 0) {
                        int zz = -ii;
                        while (zz <= ii && water == 0) {
                            if (worldIn.getBlockState(blockpos.add(xx, -1, zz)).getMaterial() == Material.WATER) {
                                water = ii;
                            }
                            zz++;
                        }
                        xx++;
                    }
                    ii++;
                }
                //water is a number between 0 and 6:
                if (water != 0) {
                    if (rand.nextInt(water + 1) == 0) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), BlockCoarseSandyDirt.block.getDefaultState(), 2);
                        flag = true;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
}
