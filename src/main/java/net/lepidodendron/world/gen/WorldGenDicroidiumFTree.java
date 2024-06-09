package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.procedure.ProcedureWorldGenDicroidiumF;
import net.lepidodendron.procedure.ProcedureWorldGenDicroidiumO;
import net.lepidodendron.procedure.ProcedureWorldGenTelemachus;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenDicroidiumFTree extends WorldGenAbstractTree
{

    public WorldGenDicroidiumFTree(boolean notify)
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

                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap <String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);

                    if (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_crags")) {
                        int minHeight = 86;
                        if (position.getY() >= minHeight) {
                            int j2 = Math.max(0, 120 - position.getY());
                            double stoneFactor = 4 * (double) j2 / (120D - (double) minHeight);
                            if (Math.random() >= stoneFactor && Math.random() > 0.05) {
                                return false;
                            }
                        }
                    }

                    if (worldIn.getBiome(position) instanceof BiomeJurassic) {
                        BiomeJurassic biomeJurassic = (BiomeJurassic) worldIn.getBiome(position);
                        if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Taiga) {
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
                            return true;
                        }
                    }

                    if (position.getY() > (Functions.getAdjustedSeaLevel(worldIn, position) + 30)) {
                        if (Math.random() > 0.93) {
                            ProcedureWorldGenDicroidiumF.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
                        }
                    }
                    else if (position.getY() > (Functions.getAdjustedSeaLevel(worldIn, position) + 20)) {
                        if (Math.random() > 0.80) {
                            ProcedureWorldGenDicroidiumF.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
                        }
                    }
                    else if (position.getY() > (Functions.getAdjustedSeaLevel(worldIn, position) + 12)) {
                        if (Math.random() > 0.60) {
                            ProcedureWorldGenDicroidiumF.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
                        }
                    }
                    else if (position.getY() > (Functions.getAdjustedSeaLevel(worldIn, position) + 5)) {
                        if (Math.random() > 0.30) {
                            ProcedureWorldGenDicroidiumF.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
                        }
                    }
                    else { //is within 4 blocks of sea level, so add Telemachus
                        if (Math.random() > 0.70) {
                            ProcedureWorldGenTelemachus.executeProcedure($_dependencies);
                        }
                        else {
                            if (Math.random() > 0.30) {
                                ProcedureWorldGenDicroidiumF.executeProcedure($_dependencies);
                            }
                            else {
                                ProcedureWorldGenDicroidiumO.executeProcedure($_dependencies);
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
