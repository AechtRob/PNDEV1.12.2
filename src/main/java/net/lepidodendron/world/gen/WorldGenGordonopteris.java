package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGordonopterisLog;
import net.lepidodendron.block.BlockGordonopterisSapling;
import net.lepidodendron.procedure.ProcedureWorldGenGordonopteris;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenGordonopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(6) - rand.nextInt(6), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(6) - rand.nextInt(6));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockGordonopterisSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockGordonopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockGordonopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockGordonopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockGordonopterisLog.block)
            	)
            {
                java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenGordonopteris.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
