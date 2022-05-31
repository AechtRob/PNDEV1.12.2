package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockNoeggerathialesLog;
import net.lepidodendron.block.BlockNoeggerathialesSapling;
import net.lepidodendron.procedure.ProcedureWorldGenNoeggerathiales;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenNoeggerathiales extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 8; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockNoeggerathialesSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockNoeggerathialesLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockNoeggerathialesLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockNoeggerathialesLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockNoeggerathialesLog.block)
            	)
            {
                HashMap<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenNoeggerathiales.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
