package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPrototaxites;
import net.lepidodendron.block.BlockPrototaxitesStem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPrototaxites extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(2) - rand.nextInt(2), rand.nextInt(2) - rand.nextInt(2), rand.nextInt(2) - rand.nextInt(2));

            if (worldIn.canBlockSeeSky(blockpos.up()) && blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPrototaxites.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockPrototaxites.block.getDefaultState(), 2);

               	//Perhaps a fruiting one....
                if (Math.random() > 0.7) {
                    worldIn.setBlockState(blockpos, BlockPrototaxitesStem.block.getDefaultState(), 2);
                    int p = rand.nextInt(4) + 1;
                    int pp = 1;
                    while (pp < p) {
                        worldIn.setBlockState(blockpos.up(pp), BlockPrototaxitesStem.block.getDefaultState(), 2);
                        pp = pp + 1;
                    }
                }

                flag = true;
            }
        }

        return flag;
    }
}
