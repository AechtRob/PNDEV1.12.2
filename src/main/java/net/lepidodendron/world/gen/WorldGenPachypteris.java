package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockPachypteris;
import net.lepidodendron.block.BlockPachypterisStem;
import net.lepidodendron.block.BlockPachypterisTop;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPachypteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 24; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            int yy = canSurviveAt(worldIn, blockpos);

            if (blockpos.getY() >= worldIn.getSeaLevel()-6 && (!worldIn.provider.isNether() || blockpos.getY() < 254) && yy != 0)
            {
                BlockPos pos = new BlockPos(blockpos.getX(), yy + 1, blockpos.getZ());
                if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos) && isWaterBlock(worldIn, pos.up(2))
                        && (worldIn.isAirBlock(pos.up(3)))
                ) {
                    worldIn.setBlockState(pos, BlockPachypteris.block.getDefaultState().withProperty(BlockPachypteris.DEEP, true));
                }
                else {
                    worldIn.setBlockState(pos, BlockPachypteris.block.getDefaultState().withProperty(BlockPachypteris.DEEP, false));
                }
                if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos) && isWaterBlock(worldIn, pos.up(2))
                        && (worldIn.isAirBlock(pos.up(3)))
                ) { //Vary the heights:
                    //System.err.println("Large");
                    if (Math.random() > 0.66) {
                        worldIn.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
                    }
                    else {
                        if ((Math.random() > 0.5) && (worldIn.isAirBlock(pos.up(4)))) {
                            worldIn.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
                            worldIn.setBlockState(pos.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
                        }
                        else {
                            if ((worldIn.isAirBlock(pos.up(5))) && (worldIn.isAirBlock(pos.up(4)))) {
                                worldIn.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
                                worldIn.setBlockState(pos.up(4), BlockPachypterisStem.block.getDefaultState(), 3);
                                worldIn.setBlockState(pos.up(5), BlockPachypterisTop.block.getDefaultState(), 3);
                            }
                            else {
                                worldIn.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
                            }
                        }
                    }
                }

                if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
                        && (worldIn.isAirBlock(pos.up(2)))
                ) { //Vary the heights:
                    if (Math.random() > 0.66) {
                        worldIn.setBlockState(pos.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
                    }
                    else {
                        if ((Math.random() > 0.5) && (worldIn.isAirBlock(pos.up(3)))) {
                            worldIn.setBlockState(pos.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
                            worldIn.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
                        }
                        else {
                            if ((worldIn.isAirBlock(pos.up(4))) && (worldIn.isAirBlock(pos.up(3)))) {
                                worldIn.setBlockState(pos.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
                                worldIn.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
                                worldIn.setBlockState(pos.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
                            }
                            else {
                                worldIn.setBlockState(pos.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
                            }
                        }
                    }
                }
                flag = true;
            }
        }

        return flag;
    }

    public int canSurviveAt(World worldIn, BlockPos pos) {

        boolean blockCriteria = false;
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        //Allow to spawn in 2-3 block water only. Spawns can be one block above ground due to prop-roots:
        if ((isWaterBlock(worldIn, new BlockPos(i, j, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 1, k)))
            && (((worldIn.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.SAND)
            || ((worldIn.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.CLAY)
            || ((worldIn.getBlockState(new BlockPos(i, j - 2, k))).getMaterial() == Material.GROUND))) {
            j = j - 2;
            blockCriteria = true;
        }

        if ((isWaterBlock(worldIn, new BlockPos(i, j, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 1, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 2, k)))
            && (((worldIn.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.SAND)
            || ((worldIn.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.CLAY)
            || ((worldIn.getBlockState(new BlockPos(i, j - 3, k))).getMaterial() == Material.GROUND))) {
            j = j - 3;
            blockCriteria = true;
        }

        if ((isWaterBlock(worldIn, new BlockPos(i, j, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 1, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 2, k))
            && isWaterBlock(worldIn, new BlockPos(i, j - 3, k)))
            && (((worldIn.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.SAND)
            || ((worldIn.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.CLAY)
            || ((worldIn.getBlockState(new BlockPos(i, j - 4, k))).getMaterial() == Material.GROUND))) {
            j = j - 3; // NB!!
            blockCriteria = true;
        }

        if (blockCriteria) {
            return j;
        }
        else {
            return 0;
        }
    	 
    }

    public boolean isWaterBlock(World world, BlockPos pos) {
        if (world.getBlockState(pos).getMaterial() == Material.WATER) {
            IBlockState iblockstate = world.getBlockState(pos);
            if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
