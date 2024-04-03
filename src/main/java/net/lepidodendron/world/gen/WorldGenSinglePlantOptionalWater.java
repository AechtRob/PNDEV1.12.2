package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenSinglePlantOptionalWater extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(null, worldIn, rand, position, 0, 255, false, false, false);
    }

    public boolean generate(IBlockState plantBlock, World worldIn, Random rand, BlockPos position)
    {
        return generate(plantBlock, worldIn, rand, position, 0, 255, false, false, false);
    }

    public boolean generate(IBlockState plantBlock, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        return generate(plantBlock, worldIn, rand, position, minHeight, maxHeight, false, false, false);
    }

    public boolean generate(IBlockState plantBlock, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, boolean needsWater)
    {
        return generate(plantBlock, worldIn, rand, position, minHeight, maxHeight, needsWater, false, false);
    }

    public boolean generate(@Nullable IBlockState plantBlock, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, boolean needsWater, boolean spawnOnWood, boolean spawnOnRock)
    {

        if (plantBlock == null) {
            return false;
        }

        boolean flag = false;
        int offset = 8;
        if (needsWater) {
            offset = 6;
        }

        for (int i = 0; i < 25; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));
            boolean isSuitable = true;
            if (plantBlock.getBlock() instanceof BlockLeaves) {
                if (worldIn.getBlockState(blockpos.down()).getMaterial() != Material.GROUND
                        && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.SAND
                        && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.CLAY
                        && worldIn.getBlockState(blockpos.down()).getMaterial() != Material.GRASS
                ) {
                    isSuitable = false;
                }
                if (spawnOnWood && worldIn.getBlockState(blockpos.down()).getMaterial() == Material.WOOD) {
                    isSuitable = true;
                }
                if (spawnOnRock && worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK) {
                    isSuitable = true;
                }
            }
            if (!isSuitable) {
                continue;
            }
            if (!needsWater) {

                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && plantBlock.getBlock().canPlaceBlockAt(worldIn, blockpos)
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                        && plantBlock.getBlock().canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, plantBlock, 2);
                    plantBlock.getBlock().onBlockAdded(worldIn, blockpos, plantBlock);
                    flag = true;
                }
            }
            else {
                boolean waterCriteria = false;
                //Is there water nearby?
                int xct = -2;
                int yct;
                int zct;
                while ((xct < 3) && (!waterCriteria)) {
                    yct = -2;
                    while ((yct <= 0) && (!waterCriteria)) {
                        zct = -2;
                        while ((zct < 3) && (!waterCriteria)) {
                            if ((worldIn.getBlockState(position.add(xct, yct, zct))).getMaterial() == Material.WATER) {
                                waterCriteria = true;
                            }
                            zct = zct + 1;
                        }
                        yct = yct + 1;
                    }
                    xct = xct + 1;
                }
                if (waterCriteria) {
                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && plantBlock.getBlock().canPlaceBlockAt(worldIn, blockpos)
                            && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                            && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                            && plantBlock.getBlock().canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, plantBlock, 2);
                        plantBlock.getBlock().onBlockAdded(worldIn, blockpos, plantBlock);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}