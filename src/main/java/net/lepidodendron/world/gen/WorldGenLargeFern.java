package net.lepidodendron.world.gen;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenLargeFern extends WorldGenerator
{
    private BlockDoublePlant.EnumPlantType plantType;

    public void setPlantType(BlockDoublePlant.EnumPlantType plantTypeIn)
    {
        this.plantType = plantTypeIn;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 32; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && Blocks.DOUBLE_PLANT.canPlaceBlockAt(worldIn, blockpos))
            {
                Blocks.DOUBLE_PLANT.placeAt(worldIn, blockpos, this.plantType, 2);
                flag = true;
            }
        }

        return flag;
    }
}
