package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockSabalLog;
import net.lepidodendron.block.BlockSabalSapling;
import net.lepidodendron.procedure.ProcedureWorldGenSabalUnderstorey;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenSabalUnderstorey extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(6) - rand.nextInt(6), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(6) - rand.nextInt(6));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSabalSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockSabalLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockSabalLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockSabalLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockSabalLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockSabalLog.block)
            	)
            {

                if ((worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_late_north_america_appalachia_delta")
                        || worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_late_creek_north_america_appalachia_delta"))
                        && blockpos.getY() < 64
                        ) {
                    return false;
                }
                Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenSabalUnderstorey.executeProcedure($_dependencies);
                return true;
            }
        }

        return flag;
    }
}
