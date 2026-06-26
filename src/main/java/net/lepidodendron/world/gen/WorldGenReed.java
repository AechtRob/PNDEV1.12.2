package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockReedsLand;
import net.lepidodendron.block.BlockReedsWater;
import net.lepidodendron.item.ItemReedsItem;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenReed extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(4) - rand.nextInt(4));
            IBlockState iblockstate = worldIn.getBlockState(blockpos.down());

            if (!((worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_late_north_america_appalachia_mountains")
                    || worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_late_creek_north_america_appalachia_mountains"))
                    && position.getY() < 75)
            ) {

                if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockReedsLand.block.canPlaceBlockAt(worldIn, blockpos)) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockReedsLand.block.getDefaultState(), 2);
                    flag = true;
                } else if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && ItemReedsItem.canSurviveAt(worldIn, blockpos) && (iblockstate.getMaterial() == Material.WATER && ((Integer) iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0)) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockReedsWater.block.getDefaultState(), 2);
                    flag = true;
                }
            }
        }

        return flag;
    }
}
