package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockRugosa5;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenBlueHole extends WorldGenerator
{

    public WorldGenBlueHole()
    {
        super(false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, int startRadius)
        {

        if (Math.random() > 0.2) {return true;}

        int radiusHole = Math.max((int) Math.round(Math.random() * startRadius), 10);
        int layer = 1;
        int layerRadius = radiusHole;
        int xct = 0;
        int zct = 0;
        BlockPos pos = position;
        double digChance = 0;

        //System.err.println("Hole test at " + position.getX() + " " + position.getY() + " " + position.getZ());

        //Check this is a suitable location with water at sea level over it all:
        boolean holeCheck = true;
        xct = - layerRadius;
        while (holeCheck && xct <= layerRadius) {
            zct = - layerRadius;
            while (holeCheck && zct <= layerRadius) {
                if (worldIn.getBlockState(new BlockPos(position.getX(), worldIn.getSeaLevel() - 1, position.getZ())).getMaterial() != Material.WATER) {
                    holeCheck = false;
                }
                zct += 1;
            }
            xct += 1;
        }

        if (!holeCheck) {return true;}

        //System.err.println("Hole at " + position.getX() + " " + position.getY() + " " + position.getZ());
        while (digChance < 1 && layerRadius>=1 && (layer <= radiusHole * 3) && (position.getY() - layer) > 10) {
            pos = position.add((rand.nextInt(4) - 2), -(layer-1), rand.nextInt(5) - 2);
            xct = - layerRadius;
            while (xct <= layerRadius) {
                zct = - layerRadius;
                while (zct <= layerRadius) {
                    BlockPos pos1 = pos.add(xct, 0, zct);
                    //We have a slightly randomised/offset position now - can we place the hole here?
                    if ((Math.pow(Math.abs(xct),2)) + (Math.pow(Math.abs(zct),2)) <= (Math.pow(Math.abs(layerRadius),2))) {
                        if ((Math.pow(Math.abs(xct),2)) + (Math.pow(Math.abs(zct),2)) == (Math.pow(Math.abs(layerRadius),2))) {
                            if (Math.random() > 0.5) {
                                worldIn.setBlockState(pos1, Blocks.WATER.getDefaultState());
                                //Rugosa coral round the edge:
                                if ((pos.getY() < (worldIn.getSeaLevel()-15))
                                    && (worldIn.provider.getDimension() == LepidodendronConfig.dimDevonian)) {
                                    for (EnumFacing enumfacing1 : BlockRugosa5.BlockCustom.FACING.getAllowedValues()) {
                                        BlockPos pos2 = pos1.up();
                                        if (enumfacing1 == EnumFacing.NORTH) {
                                            pos2 = pos1.up().add(0, 0, 1);
                                        }
                                        if (enumfacing1 == EnumFacing.SOUTH) {
                                            pos2 = pos1.up().add(0, 0, -1);
                                        }
                                        if (enumfacing1 == EnumFacing.EAST) {
                                            pos2 = pos1.up().add(-1, 0, 0);
                                        }
                                        if (enumfacing1 == EnumFacing.WEST) {
                                            pos2 = pos1.up().add(1, 0, 0);
                                        }
                                        if (enumfacing1 != EnumFacing.DOWN && enumfacing1 != EnumFacing.UP && ((worldIn.getBlockState(pos2).getMaterial() == Material.SAND)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.ROCK)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.GROUND)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.CLAY)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.GLASS)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.IRON)
                                                || (worldIn.getBlockState(pos2).getMaterial() == Material.WOOD))) {
                                            worldIn.setBlockState(pos1.up(), BlockRugosa5.block.getDefaultState().withProperty(BlockRugosa5.BlockCustom.FACING, enumfacing1), 2);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            worldIn.setBlockState(pos1, Blocks.WATER.getDefaultState());
                        }
                    }
                    zct += 1;
                    }
                xct += 1;
                }
            layer += 1;
            //Gradually decrease the chance that we keep going down:
            digChance = digChance + (Math.random() / (double)startRadius);
            //System.err.println("digChance: " + digChance);
            //Sometimes narrow the hole as we go down:
            if (Math.random() > 0.85) {
                layerRadius = layerRadius - 1;
            }
            //System.err.println("layerRadius: " + layerRadius);
        }
        //Fill bottom with sand:
        xct = - layerRadius;
        while (xct <= layerRadius) {
            zct = -layerRadius;
            while (zct <= layerRadius) {
                BlockPos pos1 = pos.add(xct, 0, zct);
                if ((Math.pow(Math.abs(xct), 2)) + (Math.pow(Math.abs(zct), 2)) <= (Math.pow(Math.abs(layerRadius), 2))) {
                    worldIn.setBlockState(pos1, Blocks.SAND.getDefaultState());
                    if (Math.random() > 0.85 && worldIn.getBlockState(pos1.up()).getMaterial() == Material.WATER
                        && worldIn.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                        worldIn.setBlockState(pos1.up(), BlockRugosa5.block.getDefaultState().withProperty(BlockRugosa5.BlockCustom.FACING, EnumFacing.UP));
                    }
                }
                zct += 1;
            }
            xct += 1;
        }

        return true;
    }
}
