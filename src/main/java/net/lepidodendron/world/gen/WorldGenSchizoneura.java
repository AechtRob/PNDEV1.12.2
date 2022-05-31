package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSchizoneura extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSchizoneuraSapling.block.canPlaceBlockAt(worldIn, blockpos)
            )
            if (!needsWater) {
                if ((worldIn.canSeeSky(blockpos))
                    && worldIn.isAirBlock(blockpos.up()) && worldIn.isAirBlock((blockpos.up(2))) && worldIn.isAirBlock((blockpos.up(3))) && worldIn.isAirBlock((blockpos.up(4)))) {

                    //Grow:
                    if (Math.random() > 0.7) {
                        //1,2,3
                        worldIn.setBlockState(blockpos, BlockSchizoneura3.block.getDefaultState(), 2);
                        worldIn.setBlockState(blockpos.up(), BlockSchizoneura2.block.getDefaultState(), 2);
                        worldIn.setBlockState(blockpos.up(2), BlockSchizoneura1.block.getDefaultState(), 2);
                    }
                    else {
                        if (Math.random() > 0.6) {
                            //1,2,3,5
                            worldIn.setBlockState(blockpos, BlockSchizoneura5.block.getDefaultState(), 2);
                            worldIn.setBlockState(blockpos.up(), BlockSchizoneura3.block.getDefaultState(), 2);
                            worldIn.setBlockState(blockpos.up(2), BlockSchizoneura2.block.getDefaultState(), 2);
                            worldIn.setBlockState(blockpos.up(3), BlockSchizoneura1.block.getDefaultState(), 2);
                        }
                        else {
                            if (Math.random() > 0.5) {
                                //1,2,3,4,5
                                worldIn.setBlockState(blockpos, BlockSchizoneura5.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(), BlockSchizoneura4.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(2), BlockSchizoneura3.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(3), BlockSchizoneura2.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(4), BlockSchizoneura1.block.getDefaultState(), 2);
                            }
                            else {
                                //1,2,3,4
                                worldIn.setBlockState(blockpos, BlockSchizoneura4.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(), BlockSchizoneura3.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(2), BlockSchizoneura2.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(3), BlockSchizoneura1.block.getDefaultState(), 2);
                            }
                        }
                    }
                }
                flag = true;
            }
            else {
                boolean waterCriteria = false;
                //Is there water nearby?
                int xct = -3;
                int yct;
                int zct;
                while ((xct < 4) && (!waterCriteria)) {
                    yct = -2;
                    while ((yct <= 0) && (!waterCriteria)) {
                        zct = -3;
                        while ((zct < 4) && (!waterCriteria)) {
                            if ((worldIn.getBlockState(position.add(xct, yct, zct))).getMaterial() == Material.WATER) {
                                waterCriteria = true;
                            }
                            zct = zct + 1;
                        }
                        yct = yct + 1;
                    }
                    xct = xct + 1;
                }
                if (waterCriteria) {
                    if ((worldIn.canSeeSky(blockpos))
                            && worldIn.isAirBlock(blockpos.up()) && worldIn.isAirBlock((blockpos.up(2))) && worldIn.isAirBlock((blockpos.up(3))) && worldIn.isAirBlock((blockpos.up(4)))) {

                        //Grow:
                        if (Math.random() > 0.7) {
                            //1,2,3
                            worldIn.setBlockState(blockpos, BlockSchizoneura3.block.getDefaultState(), 2);
                            worldIn.setBlockState(blockpos.up(), BlockSchizoneura2.block.getDefaultState(), 2);
                            worldIn.setBlockState(blockpos.up(2), BlockSchizoneura1.block.getDefaultState(), 2);
                        }
                        else {
                            if (Math.random() > 0.6) {
                                //1,2,3,5
                                worldIn.setBlockState(blockpos, BlockSchizoneura5.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(), BlockSchizoneura3.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(2), BlockSchizoneura2.block.getDefaultState(), 2);
                                worldIn.setBlockState(blockpos.up(3), BlockSchizoneura1.block.getDefaultState(), 2);
                            }
                            else {
                                if (Math.random() > 0.5) {
                                    //1,2,3,4,5
                                    worldIn.setBlockState(blockpos, BlockSchizoneura5.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(), BlockSchizoneura4.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(2), BlockSchizoneura3.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(3), BlockSchizoneura2.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(4), BlockSchizoneura1.block.getDefaultState(), 2);
                                }
                                else {
                                    //1,2,3,4
                                    worldIn.setBlockState(blockpos, BlockSchizoneura4.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(), BlockSchizoneura3.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(2), BlockSchizoneura2.block.getDefaultState(), 2);
                                    worldIn.setBlockState(blockpos.up(3), BlockSchizoneura1.block.getDefaultState(), 2);
                                }
                            }
                        }
                    }
                    flag = true;
                }
            }
        }

        return flag;
    }
}
