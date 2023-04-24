package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPagiophyllumLand;
import net.lepidodendron.block.BlockPagiophyllumWater;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPagiophyllum extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPagiophyllumLand.block.canPlaceBlockAt(worldIn, blockpos))
            {
               	worldIn.setBlockState(blockpos, BlockPagiophyllumLand.block.getDefaultState(), 2);
                BlockPagiophyllumLand.block.onBlockAdded(worldIn, blockpos, BlockPagiophyllumLand.block.getDefaultState());
                flag = true;
            }
            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && (!worldIn.provider.isNether() || blockpos.getY() < 254))
            {
                BlockPos blockpos1 = blockpos.up();
                IBlockState iblockstate = worldIn.getBlockState(blockpos);

                if (canSurviveAt(worldIn, blockpos1) && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.isAirBlock(blockpos1))
                        && (
                        worldIn.isAirBlock(blockpos1)
                            && worldIn.isAirBlock(blockpos1.up())
                            && worldIn.isAirBlock(blockpos1.up(2))
                )
                ) {
                    worldIn.setBlockState(blockpos1, BlockPagiophyllumWater.block.getDefaultState(), 2);
                    BlockPagiophyllumWater.block.onBlockAdded(worldIn, blockpos1, BlockPagiophyllumWater.block.getDefaultState());
                    flag = true;
                }
            }
        }

        return flag;
    }

    public static boolean canSurviveAt(World worldIn, BlockPos pos) {
        if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE)
        {
            return false;
        }
        if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GRASS)
                && (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
        {
            return false;
        }

        return true;

    }
}
