package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockAneurophytonLog;
import net.lepidodendron.block.BlockAneurophytonSapling;
import net.lepidodendron.procedure.ProcedureWorldGenAneurophyton;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenAneurophyton extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 28; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(7) - rand.nextInt(7), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(7) - rand.nextInt(7));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAneurophytonSapling.block.canPlaceBlockAt(worldIn, blockpos)
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
                Object2ObjectOpenHashMap <String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
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
