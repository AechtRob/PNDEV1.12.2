package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockEmplectopterisLog;
import net.lepidodendron.block.BlockEmplectopterisSapling;
import net.lepidodendron.block.BlockEmplectopterisShoot;
import net.lepidodendron.procedure.ProcedureWorldGenEmplectopteris;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenEmplectopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && (!worldIn.isAirBlock(blockpos.down())) && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) &&
                    (
                        (BlockEmplectopterisSapling.block.canPlaceBlockAt(worldIn, blockpos) && worldIn.getBlockState(blockpos.down()) != BlockEmplectopterisShoot.block)
                        ||
                        (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.WATER && BlockEmplectopterisSapling.block.canPlaceBlockAt(worldIn, blockpos.down()))
                    )
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockEmplectopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockEmplectopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockEmplectopterisLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockEmplectopterisLog.block)
            	)
            {
                HashMap<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenEmplectopteris.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
