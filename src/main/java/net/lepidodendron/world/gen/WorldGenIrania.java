package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockIraniaLand;
import net.lepidodendron.block.BlockIraniaWater;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenIrania extends WorldGenerator
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

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));

            if (!needsWater) {
                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockIraniaLand.block.canPlaceBlockAt(worldIn, blockpos)) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockIraniaLand.block.getDefaultState(), 2);
                    BlockIraniaLand.BlockCustom.onBlockAddedWorldgen(worldIn, blockpos, BlockIraniaLand.block.getDefaultState());
                    flag = true;
                }
                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && (!worldIn.provider.isNether() || blockpos.getY() < 254)) {
                    BlockPos blockpos1 = blockpos.up();
                    IBlockState iblockstate = worldIn.getBlockState(blockpos);

                    if (canSurviveAt(worldIn, blockpos1) && (iblockstate.getMaterial() == Material.WATER && ((Integer) iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.isAirBlock(blockpos1))
                            && (
                            worldIn.isAirBlock(blockpos1)
                                    && worldIn.isAirBlock(blockpos1.up())
                                    && worldIn.isAirBlock(blockpos1.up(2))
                                    && worldIn.isAirBlock(blockpos1.up(3))
                    )
                    ) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState(), 2);
                        BlockIraniaWater.BlockCustom.onBlockAddedWorldgen(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState());
                        flag = true;
                    }
                }
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
                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockIraniaLand.block.canPlaceBlockAt(worldIn, blockpos)) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockIraniaLand.block.getDefaultState(), 2);
                        BlockIraniaLand.BlockCustom.onBlockAddedWorldgen(worldIn, blockpos, BlockIraniaLand.block.getDefaultState());
                        flag = true;
                    }
                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && (!worldIn.provider.isNether() || blockpos.getY() < 254)) {
                        BlockPos blockpos1 = blockpos.up();
                        IBlockState iblockstate = worldIn.getBlockState(blockpos);

                        if (canSurviveAt(worldIn, blockpos1) && (iblockstate.getMaterial() == Material.WATER && ((Integer) iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.isAirBlock(blockpos1))
                                && (
                                worldIn.isAirBlock(blockpos1)
                                        && worldIn.isAirBlock(blockpos1.up())
                                        && worldIn.isAirBlock(blockpos1.up(2))
                                        && worldIn.isAirBlock(blockpos1.up(3))
                        )
                        ) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState(), 2);
                            BlockIraniaWater.BlockCustom.onBlockAddedWorldgen(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState());
                            flag = true;
                        }
                    }
                }
            }
        }

        return flag;
    }

    public static boolean canSurviveAt(World worldIn, BlockPos pos) {
        if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE)
        {
            return false;
        }
        if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GRASS)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
        {
            return false;
        }

        return true;

    }
}
