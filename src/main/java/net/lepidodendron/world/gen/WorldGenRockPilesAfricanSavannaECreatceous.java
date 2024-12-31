package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockBrownstone;
import net.lepidodendron.block.BlockCoarseSandyDirtGrey;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenRockPilesAfricanSavannaECreatceous extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenRockPilesAfricanSavannaECreatceous()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random() * 2);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        while (true)
        {
            label50:
            {
                if (position.getY() > 3)
                {
                    if (worldIn.isAirBlock(position.down()))
                    {
                        break label50;
                    }

                    Material material = worldIn.getBlockState(position.down()).getMaterial();

                    if (material != Material.GRASS && material != Material.ROCK
                    	&& material != Material.GROUND && material != Material.SAND)
                    {
                        break label50;
                    }
                }

                if (position.getY() <= 3)
                {
                    return false;
                }

                if (position.getY() <= 109 && position.getY() >= (Functions.getAdjustedSeaLevel(worldIn, position) + 4)
                        && (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                        || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                        || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")
                )
                )
                {
                    return false;
                }

                int i1 = this.startRadius;

                for (int i = 0; i1 >= 0 && i < 3; ++i)
                {
                    int j = i1 + rand.nextInt(2);
                    int k = i1 + rand.nextInt(2);
                    int l = i1 + rand.nextInt(2);
                    float f = (float)(j + k + l) * 0.333F + 0.5F;

                    for (BlockPos blockpos : BlockPos.getAllInBox(position.add(-j, -k, -l), position.add(j, k, l)))
                    {
                        if (blockpos.distanceSq(position) <= (double)(f * f))
                        {
                        	IBlockState blockIn = BlockBrownstone.block.getDefaultState();
                        	if (rand.nextInt(100) < 5) {
                        		blockIn = BlockCoarseSandyDirtGrey.block.getDefaultState();
                        	}
                            else if (rand.nextInt(100) < 5) {
                        		blockIn = Blocks.HARDENED_CLAY.getDefaultState();
                        	}
                            else if (rand.nextInt(100) < 5) {
                                blockIn = Blocks.HARDENED_CLAY.getStateFromMeta(8);
                            }
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, blockIn, 4);
                        }
                    }

                    position = position.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
                }

                return true;
            }
            position = position.down();
        }
    }
}
