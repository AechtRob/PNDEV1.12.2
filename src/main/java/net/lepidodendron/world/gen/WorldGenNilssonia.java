package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockNilssoniaLog;
import net.lepidodendron.block.BlockNilssoniaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenNilssonia;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenNilssonia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;
        int offset = 4;
        if (needsWater) {
            offset = 2;
        }
        for (int i = 0; i < 24; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));

            if (!needsWater) {

                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockNilssoniaSapling.block.canPlaceBlockAt(worldIn, blockpos)
                        && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockNilssoniaLog.block)
                        && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockNilssoniaLog.block)
                ) {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenNilssonia.executeProcedure($_dependencies);
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
                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockNilssoniaSapling.block.canPlaceBlockAt(worldIn, blockpos)
                            && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockNilssoniaLog.block)
                            && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockNilssoniaLog.block)
                            && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockNilssoniaLog.block)
                            && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockNilssoniaLog.block)
                    ) {
                        Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
                        $_dependencies.put("x", blockpos.getX());
                        $_dependencies.put("y", blockpos.getY());
                        $_dependencies.put("z", blockpos.getZ());
                        $_dependencies.put("world", worldIn);
                        ProcedureWorldGenNilssonia.executeProcedure($_dependencies);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
