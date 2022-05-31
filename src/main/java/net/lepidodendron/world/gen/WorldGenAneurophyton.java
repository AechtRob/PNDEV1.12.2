package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockAneurophytonLog;
import net.lepidodendron.block.BlockAneurophytonSapling;
import net.lepidodendron.procedure.ProcedureWorldGenAneurophyton;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenAneurophyton extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 28; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAneurophytonSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockAneurophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockAneurophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockAneurophytonLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockAneurophytonLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockAneurophytonLog.block)
            	)
            {
                HashMap<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenAneurophyton.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
