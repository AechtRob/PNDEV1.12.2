package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockSanfordiacaulisLog;
import net.lepidodendron.block.BlockSanfordiacaulisSapling;
import net.lepidodendron.procedure.ProcedureWorldGenSanfordiacaulis;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;
import java.util.Random;


public class WorldGenSanfordiacaulis extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSanfordiacaulisSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockSanfordiacaulisLog.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockSanfordiacaulisLog.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockSanfordiacaulisLog.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockSanfordiacaulisLog.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockSanfordiacaulisLog.block)
            	)
            {
                Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", blockpos.getX());
					$_dependencies.put("y", blockpos.getY());
					$_dependencies.put("z", blockpos.getZ());
					$_dependencies.put("world", worldIn);
				ProcedureWorldGenSanfordiacaulis.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
}
