package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockBivalveMegalodon;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenClamRocks extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        while ((worldIn.isAirBlock(position) || worldIn.getBlockState(position).getMaterial() == Material.WATER) && position.getY() > 2)
        {
            position = position.down();
        }

        if (worldIn.getBlockState(position.up() ).getMaterial() != Material.WATER || position.getY() < (worldIn.getSeaLevel() - 7) || position.getY() >= worldIn.getSeaLevel()) {
            return false;
        }

        int startY = position.getY();
        position = position.down(5); //start under the surface to capture any terrain weirdnesses
        int heightRocks = (worldIn.getSeaLevel() - position.getY()) + (rand.nextInt(5) - 3);
        //System.err.println("position: " + position.getX() + " " + position.getY() + " " + position.getZ());
        //System.err.println("heightRocks: " + heightRocks);
        int radius = rand.nextInt(4) + 1;
        int radCt = radius;
        //System.err.println("radius: " + radius);
        int yCt = 0;
        boolean skipper = false;
        BlockPos pos = position.add(0,-1,0);

        while (yCt <= heightRocks && radCt > 0) {
            pos = pos.add(0, 1, 0);
            int xCt = -radCt;
            while (xCt <= radCt) {
                int zCt = -radCt;
                while (zCt <= radCt) {
                    if ((Math.pow(xCt, 2) + Math.pow(zCt, 2) <= Math.pow(radCt, 2))) {
                        skipper = false;
                        if (((int)((Math.pow(xCt, 2) + Math.pow(zCt, 2))) == (int)Math.pow(radCt, 2)) && rand.nextInt(5) == 0) {
                            skipper = true;
                        }
                        BlockPos posPlace = pos.add(xCt, 0, zCt);
                        IBlockState state = worldIn.getBlockState(posPlace.down());
                        if (state.getBlockFaceShape(worldIn, posPlace.down(), EnumFacing.UP) == BlockFaceShape.SOLID && !skipper) {
                            if (rand.nextInt(6) == 0 && posPlace.getY() >= worldIn.getSeaLevel()) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace, Blocks.GRAVEL.getDefaultState());
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace, Blocks.RED_SANDSTONE.getDefaultState());
                                if (worldIn.getBlockState(posPlace.up(2)).getMaterial() == Material.WATER && worldIn.getBlockState(posPlace.up()).getMaterial() == Material.WATER && rand.nextInt(6) ==0) {
                                    //Add a clam:
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace.up(), BlockBivalveMegalodon.block.getDefaultState());
                                }
                            }
                        }
                    }
                    zCt += 1;
                }
                xCt += 1;
            }

            pos = pos.add((rand.nextInt(3) - 1), 0, (rand.nextInt(3) - 1));
            xCt = -radCt;
            while (xCt <= radCt) {
                int zCt = -radCt;
                while (zCt <= radCt) {
                    if ((Math.pow(xCt, 2) + Math.pow(zCt, 2) <= Math.pow(radCt, 2))) {
                        skipper = false;
                        if (((int)((Math.pow(xCt, 2) + Math.pow(zCt, 2))) == (int)Math.pow(radCt, 2)) && rand.nextInt(5) == 0) {
                            skipper = true;
                        }
                        BlockPos posPlace = pos.add(xCt, 0, zCt);
                        IBlockState state = worldIn.getBlockState(posPlace.down());
                        if (state.getBlockFaceShape(worldIn, posPlace.down(), EnumFacing.UP) == BlockFaceShape.SOLID && !skipper) {
                            if (rand.nextInt(6) == 0 && posPlace.getY() >= worldIn.getSeaLevel()) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace, Blocks.GRAVEL.getDefaultState());
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace, Blocks.RED_SANDSTONE.getDefaultState());
                                if (worldIn.getBlockState(posPlace.up(2)).getMaterial() == Material.WATER && worldIn.getBlockState(posPlace.up()).getMaterial() == Material.WATER && rand.nextInt(6) ==0) {
                                    //Add a clam:
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,posPlace.up(), BlockBivalveMegalodon.block.getDefaultState());
                                }
                            }
                        }
                    }
                    zCt += 1;
                }
                xCt += 1;
            }

            yCt += 1;

            if (rand.nextInt(4) == 0 && pos.getY() > startY) {
                radCt -= 1;
            }
        }
        return true;
    }
}
