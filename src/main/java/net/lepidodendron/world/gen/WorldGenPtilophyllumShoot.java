package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPtilophyllumLeavesPlaceable;
import net.lepidodendron.block.BlockPtilophyllumShootPlaceable;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPtilophyllumShoot extends WorldGenerator
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
                if (rand.nextInt(4) == 0) {
                    worldIn.setBlockState(blockpos, BlockPtilophyllumShootPlaceable.block.getDefaultState(), 2);
                }
                else {
                    worldIn.setBlockState(blockpos, BlockPtilophyllumLeavesPlaceable.block.getDefaultState(), 2);
                }
                flag = true;
            }
        }

        return flag;
    }
}
