package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDichopterisLog;
import net.lepidodendron.block.BlockDichopterisShoot;
import net.lepidodendron.block.BlockDichopterisShootPlaceable;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDichopterisShoot extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 30; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
            	)
            )
            
            {
                if (rand.nextInt(3) != 0) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDichopterisShootPlaceable.block.getDefaultState(), 2);
                }
                else {
                    if (worldIn.getBlockState(blockpos.north()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.south()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.east()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.west()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockDichopterisLog.block
                        && worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockDichopterisLog.block
                    ) {
                        int ii = rand.nextInt(2);
                        int iii = 0;
                        while (iii <= ii) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(iii), BlockDichopterisLog.block.getDefaultState(), 2);
                            iii += 1;
                        }
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(iii), BlockDichopterisShoot.block.getDefaultState(), 2);
                    }
                    else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDichopterisShootPlaceable.block.getDefaultState(), 2);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
