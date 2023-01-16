package net.lepidodendron.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSandNearWater extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {return false;}

    public boolean generate(World worldIn, Random rand, BlockPos position, IBlockState state)
    {
        boolean flag = false;

        //for (int i = 0; i < 24; ++i)
        //{
            //BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            boolean isAir = worldIn.isAirBlock(position);
            if (isAir) {}
            Block block = worldIn.getBlockState(position.down()).getBlock();

            if (worldIn.isAirBlock(position)
            	&& (
            		((worldIn.getBlockState(position.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(position.down())).getMaterial() == Material.GRASS)
                    || ((worldIn.getBlockState(position.down())).getMaterial() == Material.ROCK)
            		|| ((worldIn.getBlockState(position.down())).getMaterial() == Material.SAND)
                    || ((worldIn.getBlockState(position.down())).getMaterial() == Material.CLAY)
            	)
            )
            {
                //Check for water and make denser near water:
                int ii = 0;
                int water = 0;
                while (ii < 6 && water == 0) {
                    int xx = -ii;
                    while (xx <= ii && water == 0) {
                        int zz = -ii;
                        while (zz <= ii && water == 0) {
                            if (worldIn.getBlockState(position.add(xx, -1, zz)).getMaterial() == Material.WATER) {
                                water = ii;
                            }
                            zz ++;
                        }
                        xx ++;
                    }
                    ii ++;
                }
                //water is a number between 0 and 6:
                if (water != 0) {
                    if (rand.nextInt(water + 1) == 0) {
                        worldIn.setBlockState(position.down(), state, 2);
                        flag = true;
                    }
                }
            }
        //}

        return flag;
    }
}
