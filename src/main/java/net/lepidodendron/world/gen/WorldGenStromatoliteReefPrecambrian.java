package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

public class WorldGenStromatoliteReefPrecambrian extends WorldGenerator
{
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public WorldGenStromatoliteReefPrecambrian()
    {
        super(false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, int startRadius) {
        return generate(worldIn, rand, position, startRadius, true, true);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int startRadius,
                boolean doCreatures, boolean doThrombolites)
        {
        position = position.down();
        startRadius = (int) Math.round(Math.random() * (double)startRadius) + 1;
        int layer = 1;
        int layerRadius = 1;
        double reefChance = 1D;
        int xct = 0;
        int zct = 0;
        BlockPos pos;
        //Height calcs:
        int yy = 0;
        yy = Math.min(position.getY() + 4, Functions.getAdjustedSeaLevel(worldIn, position)+2);
        boolean reef = false;
        //System.err.println("Reef start");

        //System.err.println("Centre strom at " + position.getX() + " "  + position.getY() + " " + position.getZ());
        while ((layer <= startRadius) && (position.getY() + layer) < yy) {
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
                        || (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND))
                        && BlockStromatolite.block.canPlaceBlockAt(worldIn, pos)
                        && (worldIn.getBlockState(pos).getBlock() == Blocks.WATER)
                        && ((Math.pow(Math.abs(xct),2)) + (Math.pow(Math.abs(zct),2)) <= (Math.pow(Math.abs(layerRadius),2)))) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos, BlockStromatolite.block.getDefaultState(),3);

                            //System.err.println("Setting Strom: " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
                            reef = true;
                            //System.err.println("Block1 at " + pos.getX() + " "  + pos.getY() + " " + pos.getZ() + " : " + worldIn.getBlockState(pos).getBlock());

                            //Always a chance to grow straight up:
                            if ((Math.random() > 0.45) && (position.getY() + layer + 1) < Functions.getAdjustedSeaLevel(worldIn, position)+2) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(), BlockStromatolite.block.getDefaultState(),3);
                                if ((Math.random() > 0.45) && (position.getY() + layer + 2) < Functions.getAdjustedSeaLevel(worldIn, position)+2) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos.up(2), BlockStromatolite.block.getDefaultState(),3);
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

        //Encrustations:
        Biome biome = worldIn.getBiome(position);

        //Girvanella
        double chanceGirvanella = 1.0;
        if (biome instanceof BiomePrecambrian) {
            BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
            if (!(biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Archean
                    || biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Hadean
                    || biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Proterozoic_Land
                    || biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic
                    || biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic)
            ) {
                chanceGirvanella = 0.175;
            }
        }
        if (worldIn.provider.getDimension() == LepidodendronConfig.dimCambrian) {
            chanceGirvanella = 0.0;
        }
        if (worldIn.provider.getDimension() == LepidodendronConfig.dimOrdovician
                || worldIn.provider.getDimension() == LepidodendronConfig.dimSilurian
                || worldIn.provider.getDimension() == LepidodendronConfig.dimDevonian
                || worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous
                || worldIn.provider.getDimension() == LepidodendronConfig.dimPermian) {
            chanceGirvanella = 0.3;
        }
        if (worldIn.provider.getDimension() == LepidodendronConfig.dimTriassic) {
            chanceGirvanella = 0.55;
        }
        if (worldIn.provider.getDimension() == LepidodendronConfig.dimJurassic
                || worldIn.provider.getDimension() == LepidodendronConfig.dimCretaceousEarly
                || worldIn.provider.getDimension() == LepidodendronConfig.dimCretaceousLate) {
            chanceGirvanella = 0.75;
        }
        if (worldIn.provider.getDimension() == LepidodendronConfig.dimPaleogene) {
            chanceGirvanella = 0.93;
        }
        if ((!BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
                && (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))) {
            chanceGirvanella = 1.0;
        }

        //Namapoikia
        double chanceNamapoikia = 1.0;
        if (biome instanceof BiomePrecambrian) {
            BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
            if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran
            ) {
                chanceNamapoikia = 0.0;
            }
        }
        if ((!BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
                && (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))) {
            chanceNamapoikia = 1.0;
        }

        //Cloudina
        double chanceCloudina = 1.0;
        if (biome instanceof BiomePrecambrian) {
            BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
            if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran
            ) {
                chanceCloudina = 0.0;
            }
        }
        if ((!BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
                && (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))) {
            chanceCloudina = 1.0;
        }

        //Corombella:
        double chanceCorombella = 1.0;
        if (biome instanceof BiomePrecambrian) {
            BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
            if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran
            ) {
                chanceCorombella = 0.0;
            }
        }
        if ((!BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
                && (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))) {
            chanceCorombella = 1.0;
        }

        //Namacalathus
        double chanceNamacalathus = 1.0;
        if (biome instanceof BiomePrecambrian) {
            BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
            if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran
            ) {
                chanceNamacalathus = 0.0;
            }
        }
        if ((!BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
                && (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))) {
            chanceNamacalathus = 1.0;
        }

        
        //System.err.println("Centre encrustations at " + position.getX() + " "  + position.getY() + " " + position.getZ());
        if (reef) {

            //Thrombolites:
            if (doThrombolites) {
                int yct = 0;
                while (yct <= layer) {
                    xct = -(startRadius + 3);
                    while (xct <= (startRadius + 3)) {
                        zct = -(startRadius + 3);
                        while (zct <= (startRadius + 3)) {
                            BlockPos pos1 = position.add(xct, yct, zct);
                            //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                            if ((Functions.isWater(worldIn, pos1))
                                    && (Functions.isWater(worldIn, pos1.up()))
                                    && ((Math.pow(Math.abs(xct), 2)) + (Math.pow(Math.abs(zct), 2)) <= (Math.pow(Math.abs(startRadius), 2)))) {
                                //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                //figure out a position and facing to place this at!
                                //First try regular uprights and then the rotations:
                                if ((Math.random() > 0.6) && (worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)
                                        && (worldIn.getBlockState(pos1.down()).getBlock()) != BlockStromatolite.block
                                        && (worldIn.getBlockState(pos1.down()).getBlock()) != BlockThrombolite.block) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,pos1, BlockThrombolite.block.getDefaultState());
                                }
                            }
                            zct += 1;
                        }
                        xct += 1;
                    }
                    yct += 1;
                }
            }

            if (doCreatures) {
                //Namapoikia:
                if (Math.random() > chanceNamapoikia) {
                    int yct = 0;
                    while (yct <= layer) {
                        xct = -(startRadius + 3);
                        while (xct <= (startRadius + 3)) {
                            zct = -(startRadius + 3);
                            while (zct <= (startRadius + 3)) {
                                BlockPos pos1 = position.add(xct, yct, zct);
                                //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                if ((worldIn.getBlockState(pos1).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
                                        && (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))) {
                                    //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                    //figure out a position and facing to place this at!
                                    //First try regular uprights and then the rotations:
                                    if ((((Math.random() > 0.98) && worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)
                                            && (worldIn.getBlockState(pos1.down()).getBlock()) != BlockStromatolite.block)) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockNamapoikia.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
                                    } else {
                                        for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
                                            BlockPos pos2 = pos1;
                                            if (enumfacing1 == EnumFacing.NORTH) {
                                                pos2 = pos1.add(0, 0, 1);
                                            }
                                            if (enumfacing1 == EnumFacing.SOUTH) {
                                                pos2 = pos1.add(0, 0, -1);
                                            }
                                            if (enumfacing1 == EnumFacing.EAST) {
                                                pos2 = pos1.add(-1, 0, 0);
                                            }
                                            if (enumfacing1 == EnumFacing.WEST) {
                                                pos2 = pos1.add(1, 0, 0);
                                            }

                                            //System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

                                            if ((Math.random() > 0.98) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
                                                    ((worldIn.getBlockState(pos2).getBlockFaceShape(worldIn, pos2, enumfacing1) == BlockFaceShape.SOLID)
                                                            ||
                                                            (worldIn.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
                                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockNamapoikia.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
                                                //System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
                                                break;
                                            }
                                        }
                                    }
                                }
                                zct += 1;
                            }
                            xct += 1;
                        }
                        yct += 1;
                    }
                }

                //Girvanella:
                if (Math.random() > chanceGirvanella) {
                    int yct = 0;
                    while (yct <= layer) {
                        xct = -(startRadius + 3);
                        while (xct <= (startRadius + 3)) {
                            zct = -(startRadius + 3);
                            while (zct <= (startRadius + 3)) {
                                BlockPos pos1 = position.add(xct, yct, zct);
                                //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                if ((worldIn.getBlockState(pos1).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
                                        && (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))) {
                                    //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                    //figure out a position and facing to place this at!
                                    //First try regular uprights and then the rotations:
                                    if ((((Math.random() > 0.98) && worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)
                                            && (worldIn.getBlockState(pos1.down()).getBlock()) != BlockStromatolite.block)) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockGirvanella.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
                                    } else {
                                        for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
                                            BlockPos pos2 = pos1;
                                            if (enumfacing1 == EnumFacing.NORTH) {
                                                pos2 = pos1.add(0, 0, 1);
                                            }
                                            if (enumfacing1 == EnumFacing.SOUTH) {
                                                pos2 = pos1.add(0, 0, -1);
                                            }
                                            if (enumfacing1 == EnumFacing.EAST) {
                                                pos2 = pos1.add(-1, 0, 0);
                                            }
                                            if (enumfacing1 == EnumFacing.WEST) {
                                                pos2 = pos1.add(1, 0, 0);
                                            }

                                            //System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

                                            if ((Math.random() > 0.98) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
                                                    ((worldIn.getBlockState(pos2).getBlockFaceShape(worldIn, pos2, enumfacing1) == BlockFaceShape.SOLID)
                                                            ||
                                                            (worldIn.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
                                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockGirvanella.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
                                                //System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
                                                break;
                                            }
                                        }
                                    }
                                }
                                zct += 1;
                            }
                            xct += 1;
                        }
                        yct += 1;
                    }
                }

                //Cloudina:
                if (Math.random() > chanceCloudina) {
                    int yct = 0;
                    while (yct <= layer) {
                        xct = -(startRadius + 1);
                        while (xct <= (startRadius + 1)) {
                            zct = -(startRadius + 1);
                            while (zct <= (startRadius + 1)) {
                                BlockPos pos1 = position.add(xct, yct, zct);
                                //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                if ((worldIn.getBlockState(pos1).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
                                        && (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))
                                        && ((Math.pow(Math.abs(xct), 2)) + (Math.pow(Math.abs(zct), 2)) <= (Math.pow(Math.abs(startRadius), 2)))) {
                                    //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                    //figure out a position and facing to place this at!
                                    //First try regular uprights and then the rotations:
                                    if (((Math.random() > 0.55) && worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockCloudina.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
                                    } else {
                                        for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
                                            BlockPos pos2 = pos1;
                                            if (enumfacing1 == EnumFacing.NORTH) {
                                                pos2 = pos1.add(0, 0, 1);
                                            }
                                            if (enumfacing1 == EnumFacing.SOUTH) {
                                                pos2 = pos1.add(0, 0, -1);
                                            }
                                            if (enumfacing1 == EnumFacing.EAST) {
                                                pos2 = pos1.add(-1, 0, 0);
                                            }
                                            if (enumfacing1 == EnumFacing.WEST) {
                                                pos2 = pos1.add(1, 0, 0);
                                            }

                                            //System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

                                            if ((Math.random() > 0.55) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
                                                    ((worldIn.getBlockState(pos2).getBlockFaceShape(worldIn, pos2, enumfacing1) == BlockFaceShape.SOLID)
                                                            ||
                                                            (worldIn.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
                                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockCloudina.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
                                                //System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
                                                break;
                                            }
                                        }
                                    }
                                }
                                zct += 1;
                            }
                            xct += 1;
                        }
                        yct += 1;
                    }
                }

                //Corombella:
                if (Math.random() > chanceCorombella) {
                    int yct = 0;
                    while (yct <= layer) {
                        xct = -(startRadius + 1);
                        while (xct <= (startRadius + 1)) {
                            zct = -(startRadius + 1);
                            while (zct <= (startRadius + 1)) {
                                BlockPos pos1 = position.add(xct, yct, zct);
                                //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                if ((worldIn.getBlockState(pos1).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
                                        && (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))
                                        && ((Math.pow(Math.abs(xct), 2)) + (Math.pow(Math.abs(zct), 2)) <= (Math.pow(Math.abs(startRadius), 2)))) {
                                    //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                    //figure out a position and facing to place this at!
                                    //First try regular uprights and then the rotations:
                                    if (((Math.random() > 0.8) && worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockCorumbella.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
                                    } else {
                                        for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
                                            BlockPos pos2 = pos1;
                                            if (enumfacing1 == EnumFacing.NORTH) {
                                                pos2 = pos1.add(0, 0, 1);
                                            }
                                            if (enumfacing1 == EnumFacing.SOUTH) {
                                                pos2 = pos1.add(0, 0, -1);
                                            }
                                            if (enumfacing1 == EnumFacing.EAST) {
                                                pos2 = pos1.add(-1, 0, 0);
                                            }
                                            if (enumfacing1 == EnumFacing.WEST) {
                                                pos2 = pos1.add(1, 0, 0);
                                            }

                                            //System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

                                            if ((Math.random() > 0.8) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
                                                    ((worldIn.getBlockState(pos2).getBlockFaceShape(worldIn, pos2, enumfacing1) == BlockFaceShape.SOLID)
                                                            ||
                                                            (worldIn.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
                                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockCorumbella.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
                                                //System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
                                                break;
                                            }
                                        }
                                    }
                                }
                                zct += 1;
                            }
                            xct += 1;
                        }
                        yct += 1;
                    }
                }

                //Namacalathus:
                if (Math.random() > chanceNamacalathus) {
                    int yct = 0;
                    while (yct <= layer) {
                        xct = -(startRadius + 2);
                        while (xct <= (startRadius + 2)) {
                            zct = -(startRadius + 2);
                            while (zct <= (startRadius + 2)) {
                                BlockPos pos1 = position.add(xct, yct, zct);
                                //System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                if ((worldIn.getBlockState(pos1).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
                                        && (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (worldIn.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))
                                        && ((Math.pow(Math.abs(xct), 2)) + (Math.pow(Math.abs(zct), 2)) <= (Math.pow(Math.abs(startRadius), 2)))) {
                                    //System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
                                    //figure out a position and facing to place this at!
                                    //First try regular uprights and then the rotations:
                                    if (((Math.random() > 0.55) && worldIn.getBlockState(pos1.down()).getBlockFaceShape(worldIn, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
                                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockNamacalathus.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
                                    } else {
                                        for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
                                            BlockPos pos2 = pos1;
                                            if (enumfacing1 == EnumFacing.NORTH) {
                                                pos2 = pos1.add(0, 0, 1);
                                            }
                                            if (enumfacing1 == EnumFacing.SOUTH) {
                                                pos2 = pos1.add(0, 0, -1);
                                            }
                                            if (enumfacing1 == EnumFacing.EAST) {
                                                pos2 = pos1.add(-1, 0, 0);
                                            }
                                            if (enumfacing1 == EnumFacing.WEST) {
                                                pos2 = pos1.add(1, 0, 0);
                                            }

                                            //System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

                                            if ((Math.random() > 0.55) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
                                                    ((worldIn.getBlockState(pos2).getBlockFaceShape(worldIn, pos2, enumfacing1) == BlockFaceShape.SOLID)
                                                            ||
                                                            (worldIn.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
                                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, pos1, BlockNamacalathus.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
                                                //System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
                                                break;
                                            }
                                        }
                                    }
                                }
                                zct += 1;
                            }
                            xct += 1;
                        }
                        yct += 1;
                    }
                }
            }

        }
        return true;
    }
}
