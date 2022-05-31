package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLycopia;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenLycopia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 48; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!needsWater) {

                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockLycopia.block.canPlaceBlockAt(worldIn, blockpos)
                    && (
                    (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                    )
                ) {
                    worldIn.setBlockState(blockpos, BlockLycopia.block.getDefaultState(), 2);
                    BlockLycopia.block.onBlockAdded(worldIn, blockpos, BlockLycopia.block.getDefaultState());
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
                    if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockLycopia.block.canPlaceBlockAt(worldIn, blockpos)
                        && (
                            (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                            || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY)
                        )
                    ) {
                        worldIn.setBlockState(blockpos, BlockLycopia.block.getDefaultState(), 2);
                        BlockLycopia.block.onBlockAdded(worldIn, blockpos, BlockLycopia.block.getDefaultState());
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
