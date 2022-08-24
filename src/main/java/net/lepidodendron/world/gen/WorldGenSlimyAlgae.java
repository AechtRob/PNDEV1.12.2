package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSlimyAlgaeLand;
import net.lepidodendron.block.BlockSlimyAlgaeWater;
import net.lepidodendron.item.ItemSlimyAlgaeItem;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSlimyAlgae extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));
            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSlimyAlgaeLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockSlimyAlgaeLand.block.getDefaultState(), 2);
                flag = true;
            }
            else if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && ItemSlimyAlgaeItem.canSurviveAt(worldIn, blockpos)  && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0))
            {
                worldIn.setBlockState(blockpos, BlockSlimyAlgaeWater.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
