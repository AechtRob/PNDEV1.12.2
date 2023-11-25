package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGuano;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGuano extends WorldGenerator
{
    public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, worldIn.getSeaLevel());
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight) {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.getBlockState(blockpos).getBlock() == BlockGuano.block) {
                if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && (blockpos.getY() + rand.nextInt(4) - 4) >= minHeight && worldIn.isAirBlock(blockpos.up())
                        && (worldIn.canSeeSky(blockpos.up()))
                ) {
                    int ii = worldIn.getBlockState(blockpos).getValue(LAYERS);
                    ii = ii + 1;
                    if (ii <= 8) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockGuano.block.getDefaultState().withProperty(LAYERS, Integer.valueOf(ii)), 2);
                        flag = true;
                    }
                }
            }
            else {
                if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && (blockpos.getY() + rand.nextInt(4) - 4) >= minHeight && worldIn.isAirBlock(blockpos)
                        && (canPlaceBlockAt(worldIn, blockpos))
                        && (worldIn.canSeeSky(blockpos))
                ) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockGuano.block.getDefaultState().withProperty(LAYERS, 1), 2);
                    flag = true;
                }
            }
        }

        return flag;
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos.down());
        Block block = iblockstate.getBlock();

        if (block != Blocks.ICE && block != Blocks.PACKED_ICE && block != Blocks.BARRIER)
        {
            BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP);
            return blockfaceshape == BlockFaceShape.SOLID || iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down());
        }
        else
        {
            return false;
        }
    }

    public boolean canPlaceBlockAtSeaIce(World worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos.down());
        Block block = iblockstate.getBlock();

        if (block != Blocks.ICE && block != Blocks.BARRIER)
        {
            BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP);
            return blockfaceshape == BlockFaceShape.SOLID || iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down());
        }
        else
        {
            return false;
        }
    }
}
