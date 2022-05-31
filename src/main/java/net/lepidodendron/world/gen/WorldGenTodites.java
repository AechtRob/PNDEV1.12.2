package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockToditesLog;
import net.lepidodendron.block.BlockToditesSapling;
import net.lepidodendron.procedure.ProcedureWorldGenTodites;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenTodites extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockToditesSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockToditesLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockToditesLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockToditesLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockToditesLog.block)
            	)
            {
                java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenTodites.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
