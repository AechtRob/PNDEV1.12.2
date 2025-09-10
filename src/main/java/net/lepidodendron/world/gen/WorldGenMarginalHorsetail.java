package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.item.ItemMarginalHorsetailItem;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenMarginalHorsetail extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));
            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());

            if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4
                    && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
                    && BlockMarginalHorsetailLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockMarginalHorsetailLand.block.getDefaultState(), 2);
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockMarginalHorsetailLandMiddle.block.getDefaultState(), 2);
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), BlockMarginalHorsetailLandTop.block.getDefaultState(), 2);
                flag = true;
            }
            else if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos)-4
                    && canReplaceThis(worldIn, blockpos)
                    && canReplaceThis(worldIn, blockpos.up())
                    && (!worldIn.provider.isNether() || blockpos.getY() < 254)
                    && ItemMarginalHorsetailItem.canSurviveAt(worldIn, blockpos)
                    && (iblockstate.getMaterial() == Material.WATER
                    && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0))
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockMarginalHorsetailWater.block.getDefaultState(), 2);
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), BlockMarginalHorsetailWaterTop.block.getDefaultState(), 2);
                flag = true;
            }
        }

        return flag;
    }

    public boolean canReplaceThis(World worldIn, BlockPos blockpos) {
        return worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos)
                    || worldIn.getBlockState(blockpos).getMaterial() == Material.PLANTS;
    }
}
