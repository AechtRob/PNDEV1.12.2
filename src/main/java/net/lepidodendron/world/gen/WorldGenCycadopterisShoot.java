package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCycadopterisLog;
import net.lepidodendron.block.BlockCycadopterisShoot;
import net.lepidodendron.block.BlockCycadopterisShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCycadopterisShoot extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 30; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) &&
            	(
            		(worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
            		|| (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GRASS)
            	)
            )
            
            {
                if (rand.nextInt(3) != 0) {
                    worldIn.setBlockState(blockpos, BlockCycadopterisShootPlaceable.block.getDefaultState(), 2);
                }
                else {
                    if (worldIn.getBlockState(blockpos.north()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.south()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.east()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.west()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockCycadopterisLog.block
                        && worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockCycadopterisLog.block
                    ) {
                        int ii = rand.nextInt(2);
                        int iii = 0;
                        while (iii <= ii) {
                            worldIn.setBlockState(blockpos.up(iii), BlockCycadopterisLog.block.getDefaultState(), 2);
                            iii += 1;
                        }
                        worldIn.setBlockState(blockpos.up(iii), BlockCycadopterisShoot.block.getDefaultState(), 2);
                    }
                    else {
                        worldIn.setBlockState(blockpos, BlockCycadopterisShootPlaceable.block.getDefaultState(), 2);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
