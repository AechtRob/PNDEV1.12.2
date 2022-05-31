package net.lepidodendron.world.gen;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenDeadBush extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return true;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, IBlockState bush)
        {
        for (IBlockState iblockstate = worldIn.getBlockState(position); (iblockstate.getBlock().isAir(iblockstate, worldIn, position) || iblockstate.getBlock().isLeaves(iblockstate, worldIn, position)) && position.getY() > 0; iblockstate = worldIn.getBlockState(position))
        {
            position = position.down();
        }

        for (int i = 0; i < 4; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && Blocks.DEADBUSH.canBlockStay(worldIn, blockpos, Blocks.DEADBUSH.getDefaultState()))
            {
                worldIn.setBlockState(blockpos, bush, 2);
            }
        }

        return true;
    }
}
