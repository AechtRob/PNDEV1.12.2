package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockMahoganyLog;
import net.lepidodendron.procedure.ProcedureWorldGenMahogany;
import net.lepidodendron.util.Functions;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenMahoganyTree extends WorldGenAbstractTree
{

    public WorldGenMahoganyTree(boolean notify)
    {
        super(notify);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        int i = rand.nextInt(3) + 5;

        //if (this.useExtraRandomHeight)
        //{
        //    i += rand.nextInt(7);
       // }

        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + i + 1 <= 256)
        {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j)
            {
                int k = 1;

                if (j == position.getY())
                {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2)
                {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l)
                {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1)
                    {
                        if (j >= 0 && j < worldIn.getHeight())
                        {
                            if (!this.isReplaceable(worldIn, blockpos$mutableblockpos.setPos(l, j, i1)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                IBlockState state = worldIn.getBlockState(down);
                boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    int BareTrunk = 7 + rand.nextInt(5);

                    for (int log = 0; log<BareTrunk; log++) {
                        EnumFacing offSetter = EnumFacing.byHorizontalIndex(worldIn.rand.nextInt(3));
                        if (worldIn.rand.nextInt(10) == 0 && log > 2 && worldIn.getBlockState(position.offset(offSetter).up(log).down(2)).getBlock() != BlockMahoganyLog.block) {
                            position = position.offset(offSetter);
                            worldIn.setBlockState(position.up(log).down(), BlockMahoganyLog.block.getDefaultState().withProperty(BlockMahoganyLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                        }
                        worldIn.setBlockState(position.up(log), BlockMahoganyLog.block.getDefaultState().withProperty(BlockMahoganyLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                    }

                    int TreeHeight = 12 + rand.nextInt(12);
                    if (TreeHeight > 18 && Math.random() > 0.5) {
                        TreeHeight = 8 + rand.nextInt(9);
                    }
                    ProcedureWorldGenMahogany.executeProcedure(worldIn, position.up(BareTrunk), TreeHeight);

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
