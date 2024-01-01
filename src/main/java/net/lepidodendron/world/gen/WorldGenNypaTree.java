package net.lepidodendron.world.gen;

import net.lepidodendron.procedure.ProcedureWorldGenNypa;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenNypaTree extends WorldGenAbstractTree
{

    public WorldGenNypaTree(boolean notify)
    {
        super(notify);
    }

	@Override
	protected boolean canGrowInto(Block blockType)
    {
        Material material = blockType.getDefaultState().getMaterial();
        return material == Material.WATER || material == Material.AIR || material == Material.LEAVES || blockType == Blocks.GRASS || blockType == Blocks.DIRT || blockType == Blocks.LOG || blockType == Blocks.LOG2 || blockType == Blocks.SAPLING || blockType == Blocks.VINE;
    }
    
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean result = false;
        for (int ii = 0; ii < 16; ++ii) {

            int i = rand.nextInt(3) + 5;

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

                if (!flag || (position.getY() > Functions.getAdjustedSeaLevel(worldIn, position)+20))
                {
                    result = false;
                }
                else {
                //Grab nearby positions too for clumps:
                    BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

                    BlockPos down = blockpos.down();
                    IBlockState state = worldIn.getBlockState(down);
                    boolean isSoil =
                            (state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling) Blocks.SAPLING)
                                    || state.getMaterial() == Material.SAND || state.getMaterial() == Material.CLAY);

                    if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && isSoil && blockpos.getY() < worldIn.getHeight() - i - 1) {
                        java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
                        $_dependencies.put("x", blockpos.getX());
                        $_dependencies.put("y", blockpos.getY());
                        $_dependencies.put("z", blockpos.getZ());
                        $_dependencies.put("world", worldIn);
                        $_dependencies.put("saplingspawn", false);
                        ProcedureWorldGenNypa.executeProcedure($_dependencies);
                        result =  true;
                    } else {
                        down = blockpos.down();
                        state = worldIn.getBlockState(down);
                        //boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

                        isSoil = false;
                        if (!isSoil) {
                            if (worldIn.isAirBlock(blockpos) &&
                                    ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.WATER)
                                    &&
                                    (((worldIn.getBlockState(blockpos.down(2))).getMaterial() == Material.SAND)
                                            || ((worldIn.getBlockState(blockpos.down(2))).getMaterial() == Material.CLAY)
                                            || ((worldIn.getBlockState(blockpos.down(2))).getMaterial() == Material.GROUND))
                            ) {
                                if (rand.nextInt(3) > 0) {
                                    blockpos = blockpos.down();
                                }
                                isSoil = true;
                            }
                        }

                        if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && isSoil && blockpos.getY() < worldIn.getHeight() - i - 1) {
                            java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
                            $_dependencies.put("x", blockpos.getX());
                            $_dependencies.put("y", blockpos.getY());
                            $_dependencies.put("z", blockpos.getZ());
                            $_dependencies.put("world", worldIn);
                            $_dependencies.put("saplingspawn", false);
                            ProcedureWorldGenNypa.executeProcedure($_dependencies);
                            result = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
