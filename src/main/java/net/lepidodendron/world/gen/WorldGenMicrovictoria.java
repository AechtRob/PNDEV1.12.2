package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenMicrovictoria extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), 0, rand.nextInt(8) - rand.nextInt(8));
            blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn).up();

            if ( (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockMicrovictoria.block.canPlaceBlockAt(worldIn, blockpos))
            {
            	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockMicrovictoria.block.getDefaultState(), 2);
                BlockMicrovictoria.block.onBlockAdded(worldIn, blockpos, BlockMicrovictoria.block.getDefaultState());

                //Do a flower?
                if (rand.nextInt(8) == 0 && (worldIn.getBlockState(blockpos.up(2)).getBlock() != BlockMicrovictoriaFlower.block)
                        && (worldIn.getBlockState(blockpos.up(2)).getBlock() != BlockMicrovictoriaBud.block)) {
                    int colWater = 1;
                    while (colWater < 6 && BlockMicrovictoria.BlockCustom.isWaterBlock(worldIn, blockpos.up(colWater))) {
                        //Check the water column and place stems, and then bud/flower, accordingly:
                        if (BlockMicrovictoria.BlockCustom.isWaterBlock(worldIn, blockpos.up(colWater + 1)))
                        {
                            worldIn.setBlockState(blockpos.up(colWater), BlockMicrovictoriaStem.block.getDefaultState(), 3);
                        }
                        colWater = colWater + 1;
                    }
                    if (BlockMicrovictoria.BlockCustom.canFlowerPlaceAt(worldIn, blockpos.up(colWater))) {
                        if ((worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockMicrovictoriaFlower.block)
                                && (worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockMicrovictoriaBud.block
                                && worldIn.getBlockState(blockpos.up(colWater)).getBlock() != BlockMicrovictoriaFlowerPlaceable.block))
                        {
                            if (rand.nextInt(3) != 0) {
                                worldIn.setBlockState(blockpos.up(colWater), BlockMicrovictoriaBud.block.getDefaultState(), 3);
                            }
                            else {
                                worldIn.setBlockState(blockpos.up(colWater), BlockMicrovictoriaFlower.block.getDefaultState(), 3);
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
