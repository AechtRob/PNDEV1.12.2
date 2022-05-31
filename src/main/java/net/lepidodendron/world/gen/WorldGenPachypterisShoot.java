package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPachypterisLog;
import net.lepidodendron.block.BlockPachypterisShoot;
import net.lepidodendron.block.BlockPachypterisShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPachypterisShoot extends WorldGenerator
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
                    worldIn.setBlockState(blockpos, BlockPachypterisShootPlaceable.block.getDefaultState(), 2);
                }
                else {
                    if (worldIn.getBlockState(blockpos.north()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.south()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.east()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.west()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockPachypterisLog.block
                        && worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockPachypterisLog.block
                    ) {
                        int ii = rand.nextInt(3);
                        int iii = 0;
                        while (iii <= ii) {
                            worldIn.setBlockState(blockpos.up(iii), BlockPachypterisLog.block.getDefaultState(), 2);
                            iii += 1;
                        }
                        worldIn.setBlockState(blockpos.up(iii), BlockPachypterisShoot.block.getDefaultState(), 2);
                    }
                    else {
                        worldIn.setBlockState(blockpos, BlockPachypterisShootPlaceable.block.getDefaultState(), 2);
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
