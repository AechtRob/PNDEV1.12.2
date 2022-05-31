package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockWattiezaLog;
import net.lepidodendron.block.BlockWattiezaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenWattieza;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenWattieza extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockWattiezaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockWattiezaLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockWattiezaLog.block)
            	)
            {
                java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenWattieza.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
