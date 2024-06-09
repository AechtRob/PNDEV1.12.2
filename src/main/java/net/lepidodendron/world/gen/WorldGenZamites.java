package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockZamitesLog;
import net.lepidodendron.block.BlockZamitesSapling;
import net.lepidodendron.procedure.ProcedureWorldGenZamites;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenZamites extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight) {
        return generate(worldIn, rand, position, false, minHeight, maxHeight);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater) {
        return generate(worldIn, rand, position, needsWater, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater, int minHeight, int maxHeight)
    {
        boolean flag = false;
        int offset = 4;
        if (needsWater) {
            offset = 2;
        }
        for (int i = 0; i < 24; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));

            if (!needsWater) {

                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockZamitesSapling.block.canPlaceBlockAt(worldIn, blockpos)
                        && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockZamitesLog.block)
                        && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockZamitesLog.block)
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                ) {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenZamites.executeProcedure($_dependencies);
                    flag = true;
                }
            } else {
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
                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockZamitesSapling.block.canPlaceBlockAt(worldIn, blockpos)
                            && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockZamitesLog.block)
                            && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockZamitesLog.block)
                            && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockZamitesLog.block)
                            && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockZamitesLog.block)
                            && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                            && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                    ) {
                        Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();;
                        $_dependencies.put("x", blockpos.getX());
                        $_dependencies.put("y", blockpos.getY());
                        $_dependencies.put("z", blockpos.getZ());
                        $_dependencies.put("world", worldIn);
                        ProcedureWorldGenZamites.executeProcedure($_dependencies);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
