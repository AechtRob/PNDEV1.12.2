package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.procedure.ProcedureWorldGenAlethopteris;
import net.lepidodendron.procedure.ProcedureWorldGenPitys;
import net.lepidodendron.procedure.ProcedureWorldGenWalchia;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferousHillsCentre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenWalchiaTree extends WorldGenAbstractTree
{

    public WorldGenWalchiaTree(boolean notify)
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

                if (position.getY() >= worldIn.getSeaLevel()-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
					$_dependencies.put("SaplingSpawn", false);
                    if ((worldIn.provider.getDimension() != LepidodendronConfig.dimCarboniferous)
                    ){
                        $_dependencies.put("SaplingSpawn", true); // disables Ankyropteris
                    }
					if (position.getY() > (worldIn.getSeaLevel()+17) + (rand.nextInt(7) - 3)) {
						ProcedureWorldGenWalchia.executeProcedure($_dependencies);
					}
                    else if (position.getY() > 120 + (rand.nextInt(9) - 4)
                        && worldIn.getBiome(position) == BiomeCarboniferousHillsCentre.biome) {
                        return false;
                    }
					else {
                        if ((worldIn.provider.getDimension() != LepidodendronConfig.dimCarboniferous)
                        ){
                            ProcedureWorldGenWalchia.executeProcedure($_dependencies);
                        }
					    else {
					        if (Math.random() > 0.8) {
                                ProcedureWorldGenPitys.executeProcedure($_dependencies);
                            }
					        else {
                                ProcedureWorldGenAlethopteris.executeProcedure($_dependencies);
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
