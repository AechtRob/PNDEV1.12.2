package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLavaCobble;
import net.lepidodendron.block.BlockSulphurOre;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenArcheanSulphurSpikes extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        BlockPos blockpos = position.add(rand.nextInt(7) - rand.nextInt(7), 0, rand.nextInt(7) - rand.nextInt(7));
        blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn);

        if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 6
                && (worldIn.isAirBlock(blockpos) || worldIn.getBlockState(blockpos).getMaterial() == Material.WATER)
                && (!worldIn.provider.isNether() || blockpos.getY() < 254)
            )
        {
            int h = rand.nextInt(5) + 1;
            int i = 1;
            while (i <= h) {
                IBlockState bState = BlockLavaCobble.block.getDefaultState();
                if (rand.nextInt(3) == 0) {
                    bState = Blocks.STONE.getDefaultState();
                }
                if (i >= h - 2 && rand.nextInt(3) == 0) {
                    bState = BlockSulphurOre.block.getDefaultState();
                }
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1), bState, 4);

                if (i == 1) {
                    if (rand.nextInt(4) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).north(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).north(), bState, 4);
                        }
                    }
                    if (rand.nextInt(4) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).east(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).east(), bState, 4);
                        }
                    }
                    if (rand.nextInt(4) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).south(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).south(), bState, 4);
                        }
                    }
                    if (rand.nextInt(4) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).west(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).west(), bState, 4);
                        }
                    }
                }

                if (i == 2) {
                    if (rand.nextInt(3) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).north(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).north(), bState, 4);
                        }
                    }
                    if (rand.nextInt(3) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).east(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).east(), bState, 4);
                        }
                    }
                    if (rand.nextInt(3) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).south(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).south(), bState, 4);
                        }
                    }
                    if (rand.nextInt(3) == 0) {
                        if (worldIn.isSideSolid(blockpos.up(i - 2).west(), EnumFacing.UP)) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(i - 1).west(), bState, 4);
                        }
                    }
                }

                i += 1;
            }
            flag = true;
        }


        return flag;
    }
}
