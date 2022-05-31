package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockXihuphyllum;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenXihuphyllum extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!needsWater) {

                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockXihuphyllum.block.canPlaceBlockAt(worldIn, blockpos) &&
                    (
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                                || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                                || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                    )) {
                    worldIn.setBlockState(blockpos, BlockXihuphyllum.block.getDefaultState(), 2);
                    BlockXihuphyllum.block.onBlockAdded(worldIn, blockpos, BlockXihuphyllum.block.getDefaultState());

                    flag = true;
                }
            } else {
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
                    if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockXihuphyllum.block.canPlaceBlockAt(worldIn, blockpos)
                        && (
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                        )
                    ) {
                        worldIn.setBlockState(blockpos, BlockXihuphyllum.block.getDefaultState(), 2);
                        BlockXihuphyllum.block.onBlockAdded(worldIn, blockpos, BlockXihuphyllum.block.getDefaultState());
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
