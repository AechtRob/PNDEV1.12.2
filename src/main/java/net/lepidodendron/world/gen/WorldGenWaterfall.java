package net.lepidodendron.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenWaterfall extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

        if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
            && (worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND)
            && !worldIn.isAirBlock(blockpos.down())
            //&& !worldIn.isAirBlock(blockpos.up())
            && worldIn.isAirBlock(blockpos.north())
            && worldIn.isAirBlock(blockpos.north().down())
            && !worldIn.isAirBlock(blockpos.south())
            && !worldIn.isAirBlock(blockpos.east())
            && !worldIn.isAirBlock(blockpos.west())
            && worldIn.canBlockSeeSky(blockpos.north())
        )
        {
            worldIn.setBlockState(blockpos, Blocks.FLOWING_WATER.getDefaultState(), 2);
            flag = true;
        }

        if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
                && (worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND)
                && !worldIn.isAirBlock(blockpos.down())
                //&& !worldIn.isAirBlock(blockpos.up())
                && worldIn.isAirBlock(blockpos.south())
                && worldIn.isAirBlock(blockpos.south().down())
                && !worldIn.isAirBlock(blockpos.north())
                && !worldIn.isAirBlock(blockpos.east())
                && !worldIn.isAirBlock(blockpos.west())
                && worldIn.canBlockSeeSky(blockpos.south())
        )
        {
            worldIn.setBlockState(blockpos, Blocks.FLOWING_WATER.getDefaultState(), 2);
            flag = true;
        }

        if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
                && (worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND)
                && !worldIn.isAirBlock(blockpos.down())
                //&& !worldIn.isAirBlock(blockpos.up())
                && worldIn.isAirBlock(blockpos.east())
                && worldIn.isAirBlock(blockpos.east().down())
                && !worldIn.isAirBlock(blockpos.south())
                && !worldIn.isAirBlock(blockpos.north())
                && !worldIn.isAirBlock(blockpos.west())
                && worldIn.canBlockSeeSky(blockpos.east())
        )
        {
            worldIn.setBlockState(blockpos, Blocks.FLOWING_WATER.getDefaultState(), 2);
            flag = true;
        }

        if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
                && (worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND)
                && !worldIn.isAirBlock(blockpos.down())
                //&& !worldIn.isAirBlock(blockpos.up())
                && worldIn.isAirBlock(blockpos.west())
                && worldIn.isAirBlock(blockpos.west().down())
                && !worldIn.isAirBlock(blockpos.south())
                && !worldIn.isAirBlock(blockpos.east())
                && !worldIn.isAirBlock(blockpos.north())
                && worldIn.canBlockSeeSky(blockpos.west())
        )
        {
            worldIn.setBlockState(blockpos, Blocks.FLOWING_WATER.getDefaultState(), 2);
            flag = true;
        }

        return flag;
    }
}
