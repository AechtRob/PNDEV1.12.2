package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.util.Functions;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenLavaFlow extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int altitude)
    {
        boolean flag = false;

        for (int i = 0; i < 2; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(6) - rand.nextInt(6), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(6) - rand.nextInt(6));

            if (worldIn.isAirBlock(blockpos) && worldIn.getBlockState(blockpos.down()).getBlock() == BlockLavaRock.block
                && blockpos.getY() > (Functions.getAdjustedSeaLevel(worldIn, blockpos) + rand.nextInt(10)+altitude))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, Blocks.FLOWING_LAVA.getDefaultState(), 2);
                if (worldIn.isAirBlock(blockpos.west()) && worldIn.getBlockState(blockpos.west().down()).getBlock() == BlockLavaRock.block) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.west(), Blocks.FLOWING_LAVA.getDefaultState(), 2);
                }
                if (worldIn.isAirBlock(blockpos.east()) && worldIn.getBlockState(blockpos.east().down()).getBlock() == BlockLavaRock.block) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(), Blocks.FLOWING_LAVA.getDefaultState(), 2);
                }
                if (worldIn.isAirBlock(blockpos.north()) && worldIn.getBlockState(blockpos.north().down()).getBlock() == BlockLavaRock.block) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(), Blocks.FLOWING_LAVA.getDefaultState(), 2);
                }
                if (worldIn.isAirBlock(blockpos.south()) && worldIn.getBlockState(blockpos.south().down()).getBlock() == BlockLavaRock.block) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.south(), Blocks.FLOWING_LAVA.getDefaultState(), 2);
                }
                flag = true;
            }
        }

        return flag;
    }
}
