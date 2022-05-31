package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockEquisitesSapling;
import net.lepidodendron.block.BlockEquisitesStem;
import net.lepidodendron.procedure.ProcedureWorldGenEquisites;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenEquisetites extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {return true;}

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean needsWater)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!needsWater) {

                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockEquisitesSapling.block.canPlaceBlockAt(worldIn, blockpos)
                        && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockEquisitesStem.block)
                        && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockEquisitesStem.block)
                        && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockEquisitesStem.block)
                        && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockEquisitesStem.block)
                ) {
                    HashMap<String, Object> $_dependencies = new HashMap<>();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenEquisites.executeProcedure($_dependencies);
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
                    if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockEquisitesSapling.block.canPlaceBlockAt(worldIn, blockpos)
                            && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockEquisitesStem.block)
                            && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockEquisitesStem.block)
                            && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockEquisitesStem.block)
                            && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockEquisitesStem.block)
                    ) {
                        HashMap<String, Object> $_dependencies = new HashMap<>();
                        $_dependencies.put("x", blockpos.getX());
                        $_dependencies.put("y", blockpos.getY());
                        $_dependencies.put("z", blockpos.getZ());
                        $_dependencies.put("world", worldIn);
                        ProcedureWorldGenEquisites.executeProcedure($_dependencies);
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
