package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPseudovoltzia;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPseudovoltzia extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position) {return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        boolean flag = false;

        for (int i = 0; i < 16; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPseudovoltzia.block.canPlaceBlockAt(worldIn, blockpos) &&
                (
                    (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND)
                        || (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK)
                )
                && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
            )
            {

                worldIn.setBlockState(blockpos, BlockPseudovoltzia.block.getDefaultState(), 2);
                BlockPseudovoltzia.block.onBlockAdded(worldIn, blockpos, BlockPseudovoltzia.block.getDefaultState());

                flag = true;
            }
        }

        return flag;
    }
}
