package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSwampHorsetailLand;
import net.lepidodendron.block.BlockSwampHorsetailLandNoSpore;
import net.lepidodendron.block.BlockSwampHorsetailWater;
import net.lepidodendron.block.BlockSwampHorsetailWaterNoSpore;
import net.lepidodendron.item.ItemSwampHorsetailItem;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSwampHorsetail extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSwampHorsetailLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockSwampHorsetailLand.block.getDefaultState(), 2);
				if ((Math.random() > 0.5)) {
					worldIn.setBlockState(blockpos, BlockSwampHorsetailLandNoSpore.block.getDefaultState(), 2);
	        	}
                flag = true;
            }
            else if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && ItemSwampHorsetailItem.canSurviveAt(worldIn, blockpos)  && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0))
            {
                worldIn.setBlockState(blockpos, BlockSwampHorsetailWater.block.getDefaultState(), 2);
                if ((Math.random() > 0.5)) {
                    worldIn.setBlockState(blockpos, BlockSwampHorsetailWaterNoSpore.block.getDefaultState(), 2);
                }
                flag = true;
            }
        }

        return flag;
    }
}
