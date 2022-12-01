package net.lepidodendron.world.gen;

import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.state.IBlockState;
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

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, IBlockState state, int offsetY)
    {
        BlockPos blockpos = position.add(rand.nextInt(16) - rand.nextInt(16), 0, rand.nextInt(16) - rand.nextInt(16));
        blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn);

        if (blockpos.getY() > maxHeight || blockpos.getY() < minHeight) {
            return false;
        }
        BlockPos checkPos = blockpos.add(0, offsetY - 1, 0);
        IBlockState checkState = worldIn.getBlockState(checkPos);
        if (checkState.isSideSolid(worldIn, checkPos, EnumFacing.UP)) {
            worldIn.setBlockState(blockpos.add(0, offsetY, 0), state, 4);
            return true;
        }
        return false;
    }
}
