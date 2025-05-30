package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.procedure.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenTriassicIndiaTrees extends WorldGenAbstractTree
{

    public WorldGenTriassicIndiaTrees(boolean notify)
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
                boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);
                boolean hasWater = false;
                for (int xx = -4; xx <= 4; xx++) {
                    for (int yy = -2; yy <= 2; yy++) {
                        for (int zz = -4; zz <= 4; zz++) {
                            if (worldIn.getBlockState(position.add(xx, yy, zz)).getMaterial() == Material.WATER) {
                                hasWater = true;
                                break;
                            }
                        }
                        if (hasWater) {
                            break;
                        }
                    }
                    if (hasWater) {
                        break;
                    }
                }

                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
                    $_dependencies.put("SaplingSpawn", false);
                    if ((!hasWater) && rand.nextInt(18) == 0) {
                        ProcedureWorldGenDicroidiumH.executeProcedure($_dependencies);
                        return true;
                    }
                    if (!hasWater) {
                        return false;
                    }
                    int t = rand.nextInt(11);
                    switch (t) {
                        case 0: default:
                            ProcedureWorldGenAraucarioxylon.executeProcedure($_dependencies);

                        case 1: case 2:
                            ProcedureWorldGenRissikia.executeProcedure($_dependencies);

                        case 3: case 4:
                            ProcedureWorldGenPodozamites.executeProcedure($_dependencies);

                        case 5: case 6: case 7: case 8:
                            ProcedureWorldGenDesmiophyllum.executeProcedure($_dependencies);

                        case 9: case 10:
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
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
