package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockTreefernBurnishedLog;
import net.lepidodendron.block.BlockTreefernBurnishedShoot;
import net.lepidodendron.block.BlockTreefernBurnishedShootPlaceable;
import net.lepidodendron.procedure.ProcedureWorldGenTreefernBurnished;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenBurnishedTreefernTree extends WorldGenAbstractTree
{

    public WorldGenBurnishedTreefernTree(boolean notify)
    {
        super(notify);
    }

    @Override
    public boolean isReplaceable(World world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        return state.getBlock().isAir(state, world, pos) || state.getMaterial() == Material.PLANTS;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
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

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                IBlockState state = worldIn.getBlockState(down);
                if (!BlockTreefernBurnishedShootPlaceable.block.canPlaceBlockAt(worldIn, position)) {
                    return false;
                }
                boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);
                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position) - 4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
					$_dependencies.put("SaplingSpawn", false);
					ProcedureWorldGenTreefernBurnished.executeProcedure($_dependencies);

					//Grab nearby positions too for clumps:
                    for (int ii = 0; ii < 12; ++ii) {
                        BlockPos blockpos = position.add(rand.nextInt(5) - rand.nextInt(5), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(5) - rand.nextInt(5));
                        if (!BlockTreefernBurnishedShootPlaceable.block.canPlaceBlockAt(worldIn, blockpos)) {
                            continue;
                        }
                        down = blockpos.down();
                        state = worldIn.getBlockState(down);
                        boolean isClear = true;
                        for (int iii = 0; iii < 5; ++iii) {
                            if (worldIn.getBlockState(blockpos.add(1,iii,0)).getBlock() == BlockTreefernBurnishedLog.block) {
                                isClear = false;
                            }
                            if (worldIn.getBlockState(blockpos.add(-1,iii,0)).getBlock() == BlockTreefernBurnishedLog.block) {
                                isClear = false;
                            }
                            if (worldIn.getBlockState(blockpos.add(0,iii,1)).getBlock() == BlockTreefernBurnishedLog.block) {
                                isClear = false;
                            }
                            if (worldIn.getBlockState(blockpos.add(0,iii,-1)).getBlock() == BlockTreefernBurnishedLog.block) {
                                isClear = false;
                            }
                        }
                        if (worldIn.getBlockState(blockpos).getBlock() == BlockTreefernBurnishedLog.block
                                || worldIn.getBlockState(blockpos).getBlock() == BlockTreefernBurnishedShootPlaceable.block
                                || worldIn.getBlockState(blockpos).getBlock() == BlockTreefernBurnishedShoot.block) {
                            isClear = false;
                        }
                        isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);
                        if (blockpos.getY() >= Functions.getAdjustedSeaLevel(worldIn, blockpos) - 4 && isClear && isSoil && blockpos.getY() < (worldIn.getHeight() - 30)) {
                            $_dependencies.put("x", blockpos.getX());
                            $_dependencies.put("y", blockpos.getY());
                            $_dependencies.put("z", blockpos.getZ());
                            $_dependencies.put("world", worldIn);
                            $_dependencies.put("SaplingSpawn", false);
                            if (rand.nextInt(2) == 0) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockTreefernBurnishedShootPlaceable.block.getDefaultState());
                                BlockTreefernBurnishedShootPlaceable.block.onBlockAdded(worldIn, blockpos, BlockTreefernBurnishedShootPlaceable.block.getDefaultState());
                            }
                            else if (!(worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_rough_hills") && blockpos.getY() + (rand.nextInt(7) - 3) > 95)) {
                                ProcedureWorldGenTreefernBurnished.executeProcedure($_dependencies);
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockTreefernBurnishedShootPlaceable.block.getDefaultState());
                                BlockTreefernBurnishedShootPlaceable.block.onBlockAdded(worldIn, blockpos, BlockTreefernBurnishedShootPlaceable.block.getDefaultState());
                            }
                        }
                    }

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
