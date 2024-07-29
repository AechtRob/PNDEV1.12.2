package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.procedure.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenTetoriTree extends WorldGenAbstractTree
{

    public WorldGenTetoriTree(boolean notify)
    {
        super(notify);
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
                boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
                    if (position.getY() == 63) {
                        ProcedureWorldGenPodozamites.executeProcedure($_dependencies);
                    }
                    else if (position.getY() == 64) {
                        ProcedureWorldGenCzekanowskia.executeProcedure($_dependencies);
                    }
                    else if (position.getY() == 65) {
                        if (rand.nextInt(2) == 0) {
                            ProcedureWorldGenGinkgoites.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenCypressTwiggy.executeProcedure($_dependencies);
                        }
                    }
                    else if (position.getY() >= 66) {
                        int p = rand.nextInt(5);
                        if (p == 0) {
                            ProcedureWorldGenGinkgoites.executeProcedure($_dependencies);
                        }
                        if (p == 1) {
                            ProcedureWorldGenCypressTwiggy.executeProcedure($_dependencies);
                        }
                        if (p == 2) {
                            ProcedureWorldGenBrachyphyllum.executeProcedure($_dependencies);
                        }
                        if (p == 3) {
                            ProcedureWorldGenScrubbyPine.executeProcedure($_dependencies);
                        }
                        if (p == 4) {
                            ProcedureWorldGenTreefernSilver.executeProcedure($_dependencies);
                        }
                    }

                    ProcedureWorldGenNilssoniocladus.executeProcedure(position.getX() + (rand.nextInt(5) - 2), position.getY(), position.getZ() + (rand.nextInt(5) - 2), worldIn);
                    ProcedureWorldGenNilssoniocladus.executeProcedure(position.getX() + (rand.nextInt(5) - 2), position.getY(), position.getZ() + (rand.nextInt(5) - 2), worldIn);

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
