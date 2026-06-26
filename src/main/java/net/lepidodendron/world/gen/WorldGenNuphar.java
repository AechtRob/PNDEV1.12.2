package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenNuphar extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), 0, rand.nextInt(8) - rand.nextInt(8));
            blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn).up();

            if ( (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockNuphar.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockNuphar.block.getDefaultState(), 2);
                BlockNuphar.block.onBlockAdded(worldIn, blockpos, BlockNuphar.block.getDefaultState());

                //Do a flower?
                if (rand.nextInt(8) == 0 && (worldIn.getBlockState(blockpos.up(2)).getBlock() != BlockNupharFlower.block)
                        && (worldIn.getBlockState(blockpos.up(2)).getBlock() != BlockNupharBud.block)) {
                    int colWater = 1;
                    while (colWater < 6 && BlockNuphar.BlockCustom.isWaterBlock(worldIn, blockpos.up(colWater))) {
                        //Check the water column and place stems, and then bud/flower, accordingly:
                        if (BlockNuphar.BlockCustom.isWaterBlock(worldIn, blockpos.up(colWater + 1)))
                        {
                            worldIn.setBlockState(blockpos.up(colWater), BlockNupharStem.block.getDefaultState(), 3);
                        }
                        colWater = colWater + 1;
                    }
                    if (BlockNuphar.BlockCustom.canFlowerPlaceAt(worldIn, blockpos.up(colWater))) {
                        if ((worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockNupharFlower.block)
                                && (worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockNupharBud.block
                                && worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockNupharFlowerPlaceable.block))
                        {
                            if (rand.nextInt(3) != 0) {
                                worldIn.setBlockState(blockpos.up(colWater), BlockNupharBud.block.getDefaultState(), 3);
                            }
                            else {
                                worldIn.setBlockState(blockpos.up(colWater), BlockNupharFlower.block.getDefaultState(), 3);
                            }
                        }
                    }
                }

                flag = true;
            }
        }

        return flag;
    }
}
