package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenSlab extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(null, worldIn, rand, position, 0, 255);
    }

    public boolean generate(@Nullable IBlockState slabBlock, World worldIn, Random rand, BlockPos position)
    {
        return generate(slabBlock, worldIn, rand, position, 0, 255);
    }

    public boolean generate(@Nullable IBlockState slabBlock, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {

        if (slabBlock == null) {
            return false;
        }

        boolean flag = false;
        int offset = 8;

        for (int i = 0; i < 25; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));
            boolean isSuitable = worldIn.getBlockState(blockpos.down()).isTopSolid();

            if (worldIn.getBlockState(blockpos.down()).getMaterial() != Material.GROUND
                    && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.SAND
                    && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.CLAY
                    && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.GRASS
                    && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.ROCK
            ) {
                isSuitable = false;
            }

            if (!isSuitable) {
                continue;
            }
            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && slabBlock.getBlock().canPlaceBlockAt(worldIn, blockpos)
                    && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                    && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                    && slabBlock.getBlock().canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, slabBlock, 2);
                slabBlock.getBlock().onBlockAdded(worldIn, blockpos, slabBlock);
                flag = true;
            }
        }
        return flag;
    }
}