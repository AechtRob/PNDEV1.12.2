package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockRufloriaLog;
import net.lepidodendron.block.BlockRufloriaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenRufloria;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenRufloria extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockRufloriaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockRufloriaLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockRufloriaLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockRufloriaLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockRufloriaLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockRufloriaLog.block)
            	)
            {
                HashMap<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenRufloria.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
