package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenSigillariaSmall extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSigillariaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockSigillariaStem.block)
            	)
            {
                int ii = rand.nextInt(10);
                int iii = 0;
                while (iii <= ii) {
                    worldIn.setBlockState(blockpos.up(iii), BlockSigillariaStem.block.getDefaultState(), 3);
                    iii += 1;
                }
                worldIn.setBlockState(blockpos.up(iii), BlockSigillariaShoot.block.getDefaultState(), 3);
                worldIn.setBlockState(blockpos.up(iii + 1), BlockSigillariaShootCentre.block.getDefaultState(), 3);
                worldIn.setBlockState(blockpos.up(iii + 2), BlockSigillariaShootTop.block.getDefaultState(), 3);
                flag = true;
            }
        }

        return flag;
    }
}
