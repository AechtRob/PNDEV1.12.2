package net.lepidodendron.world.gen;

import net.lepidodendron.world.biome.BiomeOliveGrove;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenOliveGroveGrassPath extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(2) - rand.nextInt(2), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(2) - rand.nextInt(2));

            if ((!worldIn.provider.isNether() || position.getY() < 254) && worldIn.isAirBlock(position)
            	&& (
            		((worldIn.getBlockState(position.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(position.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(position.down())).getMaterial() == Material.SAND)
                    || ((worldIn.getBlockState(position.down())).getMaterial() == Material.CLAY)
            	)
            )
            {
                if ((position.getX() + 8 - (rand.nextInt(2))) % 15 != 0) {
                    //try again:
                }
                else {
                    if (rand.nextInt(3) != 0 && worldIn.getBiome(position) == BiomeOliveGrove.biome) {
                        worldIn.setBlockState(position.down(), Blocks.GRASS_PATH.getDefaultState(), 2);
                        flag = true;
                    }
                }
                if ((position.getZ() + 8 - (rand.nextInt(2))) % 15 != 0) {
                    //try again:
                }
                else {
                    if (rand.nextInt(3) != 0 && worldIn.getBiome(position) == BiomeOliveGrove.biome) {
                        worldIn.setBlockState(position.down(), Blocks.GRASS_PATH.getDefaultState(), 2);
                        flag = true;
                    }
                }
            }
        }

        return flag;
    }
}
