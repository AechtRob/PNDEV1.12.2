package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockXenocladiaSapling;
import net.lepidodendron.procedure.ProcedureWorldGenXenocladia;
import net.lepidodendron.util.Functions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenXenocladia extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        int minHeight = Functions.getAdjustedSeaLevel(worldIn, position) - 4;
        int maxHeight = Functions.getAdjustedSeaLevel(worldIn, position) + 35;

        boolean flag = false;
        int offset = 4;

        for (int i = 0; i < 36; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(offset) - rand.nextInt(offset));

            if (blockpos.getY() > minHeight + (rand.nextInt(5) - 2)
                    && blockpos.getY() < maxHeight + (rand.nextInt(5) - 2)
                    && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
                    && BlockXenocladiaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            ) {
                if ((worldIn.canSeeSky(blockpos))
                        && worldIn.isAirBlock(blockpos.up()) && worldIn.isAirBlock((blockpos.up(2))) && worldIn.isAirBlock((blockpos.up(3))) && worldIn.isAirBlock((blockpos.up(4)))) {

                    //Grow:
                    ProcedureWorldGenXenocladia.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), worldIn);
                }
                flag = true;
            }
        }

        return flag;
    }
}
