package net.lepidodendron.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenIceOnSea extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) { return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight) {
        boolean flag = false;

        for (int i = 0; i < 256; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && (blockpos.getY() + rand.nextInt(4) - 4) >= minHeight && worldIn.isAirBlock(blockpos.up())
            	&& (
            		((worldIn.getBlockState(blockpos)).getMaterial() == Material.WATER)
            	)
            )
            {
                worldIn.setBlockState(blockpos, Blocks.ICE.getStateFromMeta(0), 2);
                flag = true;
            }
        }

        return flag;
    }
}
