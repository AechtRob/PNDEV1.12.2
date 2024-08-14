package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPrimevalGrassLand;
import net.lepidodendron.block.BlockPrimevalGrassWater;
import net.lepidodendron.item.ItemPrimevalGrassItem;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPrimaevalGrass extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));
            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPrimevalGrassLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrimevalGrassLand.block.getDefaultState(), 2);
                flag = true;
            }
            else if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && ItemPrimevalGrassItem.canSurviveAt(worldIn, blockpos)  && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrimevalGrassWater.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }
}
