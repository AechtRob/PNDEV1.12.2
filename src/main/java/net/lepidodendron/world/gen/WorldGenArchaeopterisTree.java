package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockThucydia;
import net.lepidodendron.procedure.ProcedureWorldGenArchaeopteris;
import net.lepidodendron.procedure.ProcedureWorldGenArchaeopterisStunted;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenArchaeopterisTree extends WorldGenAbstractTree
{

    public WorldGenArchaeopterisTree(boolean notify)
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

        if (position.getY() >= 1 && position.getY() + i + 1 <= (100 + rand.nextInt(11) - 5))
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
                Biome biome = worldIn.getBiome(position);
                boolean vines = (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp"));

                if (position.getY() >= worldIn.getSeaLevel()-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
                    $_dependencies.put("SaplingSpawn", false);
                    $_dependencies.put("vines", vines);
                    if (rand.nextInt(3) != 0
                            && (
                                    biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_savanna")
                                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_cold_savanna")
                            )
                    ) {
                        worldIn.setBlockState(position, BlockThucydia.block.getDefaultState(), 2);
                        BlockThucydia.block.onBlockAdded(worldIn, position, BlockThucydia.block.getDefaultState());
                    }
                    else {
                        if ((biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_savanna")
                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_cold_savanna")
                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")
                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale"))
                            && rand.nextInt(3) != 0) {
                            ProcedureWorldGenArchaeopterisStunted.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenArchaeopteris.executeProcedure($_dependencies);
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
