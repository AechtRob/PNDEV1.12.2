package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSulphurOre;
import net.lepidodendron.block.BlockSulphurVent;
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

public class WorldGenAddSomethingToTopSolidBlock extends WorldGenerator
{
    public WorldGenAddSomethingToTopSolidBlock()
    {
        super(false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return false;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, IBlockState state, int offsetY) {
        return generate(worldIn, rand, position, minHeight, maxHeight, state, offsetY, true);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, IBlockState state, int offsetY, boolean canBeWater)
    {
        BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), 0, rand.nextInt(8) - rand.nextInt(8));
        blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn).add(0, 1 + offsetY, 0);

        if (blockpos.getY() > maxHeight || blockpos.getY() < minHeight) {
            return false;
        }
        BlockPos checkPos = blockpos.add(0, offsetY - 1, 0);
        IBlockState checkState = worldIn.getBlockState(checkPos);
        if (checkState.isSideSolid(worldIn, checkPos, EnumFacing.UP)) {
            if (canBeWater) {
                if (state.getBlock() == BlockSulphurVent.block) {
                    //Special settings for this block: */
                    int c = rand.nextInt(3);
                    switch (c) {
                        case 0: default:
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), state, 4);
                            break;

                        case 1:
                            if (worldIn.getBlockState(blockpos.add(0, offsetY + 1, 0)).getMaterial() == Material.WATER) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), getSulphurState(rand), 4);
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY + 1, 0), state, 4);
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), state, 4);
                            }
                            break;

                        case 2:
                            if (worldIn.getBlockState(blockpos.add(0, offsetY + 1, 0)).getMaterial() == Material.WATER
                                && worldIn.getBlockState(blockpos.add(0, offsetY + 2, 0)).getMaterial() == Material.WATER) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), getSulphurState(rand), 4);
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY + 1, 0), getSulphurState(rand), 4);
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY + 2, 0), state, 4);
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), state, 4);
                            }
                            break;
                    }
                }
                else {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.add(0, offsetY, 0), state, 4);
                }
                return true;
            }
            else { //Must not be water:
                if (worldIn.getBlockState(blockpos.add(0, offsetY, 0)).getMaterial() != Material.WATER) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.add(0, offsetY, 0), state, 4);
                    return true;
                }
            }
        }
        return false;
    }

    public IBlockState getSulphurState(Random rand) {
        if (rand.nextInt(8) == 0) {
            return BlockSulphurOre.block.getDefaultState();
        }
        return Blocks.STONE.getDefaultState();
    }
}
