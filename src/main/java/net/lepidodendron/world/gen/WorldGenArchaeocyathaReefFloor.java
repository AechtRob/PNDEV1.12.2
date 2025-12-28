package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockArchaeocyatha;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenArchaeocyathaReefFloor extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        BlockPos blockpos = ChunkGenSpawner.getTopSolidBlock(position, worldIn);
        if ((!worldIn.provider.isNether() || blockpos.getY() < 254)
            && (
                ((worldIn.getBlockState(blockpos)).getMaterial() == Material.GROUND)
                || ((worldIn.getBlockState(blockpos)).getMaterial() == Material.SAND)
                || ((worldIn.getBlockState(blockpos)).getMaterial() == Material.CLAY)
            )
            && (
            ((worldIn.getBlockState(blockpos.up())).getMaterial() == Material.WATER)
            )
        )
        {
            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockArchaeocyatha.block.getDefaultState().withProperty(BlockArchaeocyatha.FACING, EnumFacing.byHorizontalIndex(rand.nextInt(4))), 2);
            flag = true;
        }

        return flag;
    }
}
