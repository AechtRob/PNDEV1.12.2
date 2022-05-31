package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockDriedMud;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPangaeanDryLakes extends WorldGenerator
{
    private final Block block;

    public WorldGenPangaeanDryLakes(Block blockIn)
    {
        this.block = blockIn;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (position = position.add(-8, 0, -8); position.getY() > 5 && worldIn.isAirBlock(position); position = position.down())
        {
            ;
        }

        if (position.getY() <= 4)
        {
            return false;
        }
        else
        {
            position = position.down(2);
            boolean[] aboolean = new boolean[2048];
            int i = rand.nextInt(4) + 4;

            for (int j = 0; j < i; ++j)
            {
                double d0 = rand.nextDouble() * 6.0D + 3.0D;
                double d1 = rand.nextDouble() * 4.0D + 2.0D;
                double d2 = rand.nextDouble() * 6.0D + 3.0D;
                double d3 = rand.nextDouble() * (16.0D - d0 - 2.0D) + 1.0D + d0 / 2.0D;
                double d4 = rand.nextDouble() * (8.0D - d1 - 4.0D) + 2.0D + d1 / 2.0D;
                double d5 = rand.nextDouble() * (16.0D - d2 - 2.0D) + 1.0D + d2 / 2.0D;

                for (int l = 1; l < 15; ++l)
                {
                    for (int i1 = 1; i1 < 15; ++i1)
                    {
                        for (int j1 = 1; j1 < 7; ++j1)
                        {
                            double d6 = ((double)l - d3) / (d0 / 2.0D);
                            double d7 = ((double)j1 - d4) / (d1 / 2.0D);
                            double d8 = ((double)i1 - d5) / (d2 / 2.0D);
                            double d9 = d6 * d6 + d7 * d7 + d8 * d8;

                            if (d9 < 1.0D)
                            {
                                aboolean[(l * 16 + i1) * 8 + j1] = true;
                            }
                        }
                    }
                }
            }

            for (int k1 = 0; k1 < 16; ++k1)
            {
                for (int l2 = 0; l2 < 16; ++l2)
                {
                    for (int k = 0; k < 8; ++k)
                    {
                        boolean flag = !aboolean[(k1 * 16 + l2) * 8 + k] && (k1 < 15 && aboolean[((k1 + 1) * 16 + l2) * 8 + k] || k1 > 0 && aboolean[((k1 - 1) * 16 + l2) * 8 + k] || l2 < 15 && aboolean[(k1 * 16 + l2 + 1) * 8 + k] || l2 > 0 && aboolean[(k1 * 16 + (l2 - 1)) * 8 + k] || k < 7 && aboolean[(k1 * 16 + l2) * 8 + k + 1] || k > 0 && aboolean[(k1 * 16 + l2) * 8 + (k - 1)]);

                        if (flag)
                        {
                            Material material = worldIn.getBlockState(position.add(k1, k, l2)).getMaterial();

                            if (k >= 2 && material.isLiquid())
                            {
                                return false;
                            }

                            if (k < 2 && !material.isSolid() && worldIn.getBlockState(position.add(k1, k, l2)).getBlock() != this.block)
                            {
                                return false;
                            }
                        }
                    }
                }
            }

            for (int l1 = 0; l1 < 16; ++l1)
            {
                for (int i3 = 0; i3 < 16; ++i3)
                {
                    for (int i4 = 0; i4 < 8; ++i4)
                    {
                        if (aboolean[(l1 * 16 + i3) * 8 + i4])
                        {
                            worldIn.setBlockState(position.add(l1, i4, i3), i4 >= 2 ? Blocks.AIR.getDefaultState() : this.block.getDefaultState(), 2);
                            if (
                                (worldIn.getBlockState(position.add(l1, i4, i3)) == this.block.getDefaultState())
                                && (worldIn.getBlockState(position.add(l1, i4-1, i3)).getMaterial() != Material.WATER)
                                && (!worldIn.isAirBlock(position.add(l1, i4-1, i3)))
                            )
                            {
                                worldIn.setBlockState(position.add(l1, i4-1, i3), i4 >= 2 ? Blocks.AIR.getDefaultState() : BlockDriedMud.block.getDefaultState(), 2);
                                if (Math.random() > 0.92
                                    && !worldIn.isAirBlock(position.add(l1, i4-1, i3))
                                    && !worldIn.isAirBlock(position.add(l1, i4-2, i3))
                                    && !worldIn.isAirBlock(position.add(l1+1, i4-1, i3))
                                    && !worldIn.isAirBlock(position.add(l1-1, i4-1, i3))
                                    && !worldIn.isAirBlock(position.add(l1, i4-1, i3+1))
                                    && !worldIn.isAirBlock(position.add(l1, i4-1, i3-1))
                                )
                                {
                                    worldIn.setBlockState(position.add(l1, i4-1, i3), Blocks.WATER.getDefaultState(), 2);
                                }
                            }
                        }
                    }
                }
            }

            for (int i2 = 0; i2 < 16; ++i2)
            {
                for (int j3 = 0; j3 < 16; ++j3)
                {
                    for (int j4 = 2; j4 < 4; ++j4)
                    {
                        if (aboolean[(i2 * 16 + j3) * 8 + j4])
                        {
                            BlockPos blockpos = position.add(i2, j4 - 1, j3);

                            if ((worldIn.getBlockState(blockpos).getMaterial() == Material.GROUND || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND || worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK)
                                && worldIn.getLightFor(EnumSkyBlock.SKY, position.add(i2, j4, j3)) > 0)
                            {
                                //Biome biome = worldIn.getBiome(blockpos);
                                //String checkBiome = "lepidodendron:devonian_floodplain";
                                //if (!checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
								//	worldIn.setBlockState(blockpos, BlockPrehistoricGroundCoverBasic.block.getDefaultState(), 2);
                                //}
                                //else {
                                	worldIn.setBlockState(blockpos, BlockDriedMud.block.getDefaultState(), 2);
                                //}
                            }
                        }
                    }
                }
            }

            if (this.block.getDefaultState().getMaterial() == Material.WATER)
            {
                for (int k2 = 0; k2 < 16; ++k2)
                {
                    for (int l3 = 0; l3 < 16; ++l3)
                    {

                        if (worldIn.getBlockState(position.add(k2, 2, l3)).getMaterial() == Material.WATER
                        )
                        {
                            worldIn.setBlockToAir(position.add(k2, 2, l3)); //Forge
                        }
                        if (worldIn.getBlockState(position.add(k2, 1, l3)).getMaterial() == Material.WATER
                        )
                        {
                            worldIn.setBlockToAir(position.add(k2, 1, l3)); //Forge
                        }
                        if (worldIn.getBlockState(position.add(k2, 0, l3)).getMaterial() == Material.WATER
                        )
                        {
                            worldIn.setBlockToAir(position.add(k2, 0, l3)); //Forge
                        }
                    }
                }
            }

            return true;
        }
    }
}
