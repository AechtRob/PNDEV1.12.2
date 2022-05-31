package net.lepidodendron.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPuddlesLava extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) 
            	&& !worldIn.isAirBlock(blockpos.down(2)) && !worldIn.isAirBlock(blockpos.down().east()) 
            	&& !worldIn.isAirBlock(blockpos.down().west()) 
            	&& !worldIn.isAirBlock(blockpos.down().south()) && !worldIn.isAirBlock(blockpos.down().north()) 
            	&& worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK
            )
            {
                worldIn.setBlockState(blockpos.down(), Blocks.FLOWING_LAVA.getDefaultState(), 2);
                BlockPos blockpos1;

                blockpos1 = blockpos.down().north();
                if (rand.nextInt(3) == 0 && (!worldIn.isAirBlock(blockpos1)) && worldIn.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
                    worldIn.setBlockState(blockpos1, Blocks.MAGMA.getDefaultState());
                }
                blockpos1 = blockpos.down().south();
                if (rand.nextInt(3) == 0 && (!worldIn.isAirBlock(blockpos1)) && worldIn.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
                    worldIn.setBlockState(blockpos1, Blocks.MAGMA.getDefaultState());
                }
                blockpos1 = blockpos.down().east();
                if (rand.nextInt(3) == 0 && (!worldIn.isAirBlock(blockpos1)) && worldIn.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
                    worldIn.setBlockState(blockpos1, Blocks.MAGMA.getDefaultState());
                }
                blockpos1 = blockpos.down().west();
                if (rand.nextInt(3) == 0 && (!worldIn.isAirBlock(blockpos1)) && worldIn.getBlockState(blockpos1).getMaterial() != Material.LAVA) {
                    worldIn.setBlockState(blockpos1, Blocks.MAGMA.getDefaultState());
                }

                flag = true;
            }
        }

        return flag;
    }
}
