package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCoral;
import net.lepidodendron.block.BlockTabulata_Block1;
import net.lepidodendron.block.BlockTabulata_Block2;
import net.lepidodendron.block.BlockTabulata_Block3;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenReef extends WorldGenerator
{

    public WorldGenReef()
    {
        super(false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, int startRadius, IBlockState state)
        {
        position = position.down();
        startRadius = (int) Math.round(Math.random() * startRadius) + 1;
        int layer = 1;
        int layerRadius = 1;
        double reefChance = 1D;
        int xct = 0;
        int zct = 0;
        EnumFacing facing = EnumFacing.NORTH;
        BlockPos pos;
        while ((layer <= startRadius) && (position.getY() + layer) < Functions.getAdjustedSeaLevel(worldIn, position)) {
            reefChance = 0.9D - (((double)layer - 1D) * (0.8D/(double)startRadius));
            layerRadius = (startRadius - layer + 1);
            xct = - layerRadius;
            while (xct <= layerRadius) {
                zct = - layerRadius;
                while (zct <= layerRadius) {
                    pos = position.add((rand.nextInt(3) - 1 + xct), (layer-1), rand.nextInt(3) - 1 + zct);
                    //We have a slightly randomised position now - can we place the reef here?
                    if (Math.random() < reefChance) {
                        if (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
                            || (worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK)
                            || (worldIn.getBlockState(pos.down()).getMaterial() == Material.CORAL)
                            || (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND))
                            && BlockCoral.block.canPlaceBlockAt(worldIn, pos)
                            && worldIn.getBlockState(pos).getMaterial() == Material.WATER
                            && ((Math.pow(Math.abs(xct),2)) + (Math.pow(Math.abs(zct),2)) <= (Math.pow(Math.abs(layerRadius),2)))) {
                            if (state.getBlock() == BlockTabulata_Block1.block || state.getBlock() == BlockTabulata_Block2.block || state.getBlock() == BlockTabulata_Block3.block) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos, state.getBlock().getDefaultState());
                            }
                            else {
                                int ii = rand.nextInt(4);
                                if (ii == 0) {
                                    facing = EnumFacing.NORTH;
                                }
                                if (ii == 1) {
                                    facing = EnumFacing.SOUTH;
                                }
                                if (ii == 2) {
                                    facing = EnumFacing.EAST;
                                }
                                if (ii == 3) {
                                    facing = EnumFacing.WEST;
                                }
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos, state.withProperty(BlockCoral.FACING, facing));
                            }
                            //Always a chance to grow straight up:
                            if ((Math.random() > 0.65) && (position.getY() + layer + 1) < Functions.getAdjustedSeaLevel(worldIn, pos)) {
                                if (state.getBlock() == BlockTabulata_Block1.block || state.getBlock() == BlockTabulata_Block2.block || state.getBlock() == BlockTabulata_Block3.block) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(), state.getBlock().getDefaultState());
                                }
                                else {
                                    int ii = rand.nextInt(4);
                                    if (ii == 0) {
                                        facing = EnumFacing.NORTH;
                                    }
                                    if (ii == 1) {
                                        facing = EnumFacing.SOUTH;
                                    }
                                    if (ii == 2) {
                                        facing = EnumFacing.EAST;
                                    }
                                    if (ii == 3) {
                                        facing = EnumFacing.WEST;
                                    }
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(), state.withProperty(BlockCoral.FACING, facing));
                                }
                                if ((Math.random() > 0.65) && (position.getY() + layer + 2) < Functions.getAdjustedSeaLevel(worldIn, position)) {
                                    if (state.getBlock() == BlockTabulata_Block1.block || state.getBlock() == BlockTabulata_Block2.block || state.getBlock() == BlockTabulata_Block3.block) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(2), state.getBlock().getDefaultState());
                                    }
                                    else {
                                        int ii = rand.nextInt(4);
                                        if (ii == 0) {
                                            facing = EnumFacing.NORTH;
                                        }
                                        if (ii == 1) {
                                            facing = EnumFacing.SOUTH;
                                        }
                                        if (ii == 2) {
                                            facing = EnumFacing.EAST;
                                        }
                                        if (ii == 3) {
                                            facing = EnumFacing.WEST;
                                        }
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(2), state.withProperty(BlockCoral.FACING, facing));
                                    }
                                }
                            }
                        }
                    }
                    zct += 1;
                }
                xct += 1;
            }
            layer += 1;
        }
        return true;
    }
}
