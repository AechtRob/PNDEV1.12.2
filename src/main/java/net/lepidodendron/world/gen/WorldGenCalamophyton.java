package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockCalamophytonLog;
import net.lepidodendron.block.BlockCalamophytonSapling;
import net.lepidodendron.procedure.ProcedureWorldGenCalamophyton;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenCalamophyton extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockCalamophytonSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockCalamophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockCalamophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockCalamophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockCalamophytonLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockCalamophytonLog.block)
            	)
            {
                Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenCalamophyton.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
