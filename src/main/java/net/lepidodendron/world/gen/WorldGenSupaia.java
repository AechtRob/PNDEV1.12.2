package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockSupaiaLog;
import net.lepidodendron.block.BlockSupaiaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenSupaia;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenSupaia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 8; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(7) - rand.nextInt(7), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(7) - rand.nextInt(7));

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSupaiaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            )
            {
                boolean canPlace = true;
                for (int xx = -2; xx <= 2; xx++) {
                    for (int zz = -2; zz <= 2; zz++) {
                        for (int yy = 0; yy <= 4; yy++) {
                            if (worldIn.getBlockState(blockpos.add(xx, yy, zz)).getBlock() == BlockSupaiaLog.block) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) {
                            break;
                        }
                    }
                    if (!canPlace) {
                        break;
                    }
                }
                if (canPlace) {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenSupaia.executeProcedure($_dependencies);
                    flag = true;
                }
            }
        }

        return flag;
    }
}
