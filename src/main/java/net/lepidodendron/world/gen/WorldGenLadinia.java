package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLadiniaLog;
import net.lepidodendron.block.BlockLadiniaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenLadinia;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenLadinia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!needsWater) {

                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockLadiniaSapling.block.canPlaceBlockAt(worldIn, blockpos)
                        && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockLadiniaLog.block)
                        && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockLadiniaLog.block)
                ) {
                    HashMap<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenLadinia.executeProcedure($_dependencies);
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
                    if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockLadiniaSapling.block.canPlaceBlockAt(worldIn, blockpos)
                            && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockLadiniaLog.block)
                            && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockLadiniaLog.block)
                            && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockLadiniaLog.block)
                            && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockLadiniaLog.block)
                    ) {
                        HashMap<String, Object> $_dependencies = new HashMap<>();
                        $_dependencies.put("x", blockpos.getX());
                        $_dependencies.put("y", blockpos.getY());
                        $_dependencies.put("z", blockpos.getZ());
                        $_dependencies.put("world", worldIn);
                        ProcedureWorldGenLadinia.executeProcedure($_dependencies);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
