package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDipteris;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDipteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int k = 8;
        if (needsWater) k = 192;
        int offset = 8;
        if (needsWater) {
            offset = 3;
        }
        //Pick an orientation to use for the whole clump (looks better):
        double nsew = Math.random();
        EnumFacing facing;
        if (nsew > 0.75) {
            facing = EnumFacing.NORTH;
        }
        else {
            if (nsew > 0.5) {
                facing = EnumFacing.SOUTH;
            }
            else {
                if (nsew > 0.25) {
                    facing = EnumFacing.EAST;
                }
                else {
                    facing = EnumFacing.WEST;
                }
            }
        }


        for (int i = 0; i < k; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(8) - rand.nextInt(8), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockDipteris.block.canPlaceBlockAt(worldIn, blockpos)
            )
            if (!needsWater) {
                {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDipteris.block.getDefaultState().withProperty(BlockDirectional.FACING, facing), 3);
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
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDipteris.block.getDefaultState().withProperty(BlockDirectional.FACING, facing), 3);
                    flag = true;
                }
            }
        }

        return flag;
    }
}
