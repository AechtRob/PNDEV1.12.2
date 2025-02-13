package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.Random;

public class WorldGenRockPilesCretaceousEarlySouthernOcean extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenRockPilesCretaceousEarlySouthernOcean()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = 2 + (int) Math.round(Math.random() * 3);
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

                if (position.getY() <= 3 || position.getY() > 50)
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
                            int rock = rand.nextInt(100);
                            IBlockState blockIn = BlockPebblestone.block.getDefaultState();
                            if (rock < 55) {
                        		blockIn = BlockShelly.block.getDefaultState();
                        	}
                            else if (rock < 75) {
                                blockIn = BlockCoral.block.getDefaultState();
                            }
                            else if (rock < 85) {
                                blockIn = BlockCoralBleached.block.getDefaultState();
                            }
                            else if (rock < 88) {
                                blockIn = BlockPebblestone.block.getDefaultState();
                            }
                            else if (rock < 95) {
                                blockIn = BlockPebblestoneMossy.block.getDefaultState();
                            }
                            else {
                                blockIn = BlockSpongeReef.block.getDefaultState();
                            }

                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, blockIn, 4);
                        }
                    }

                    position = position.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
                }

                return true;
            }
            position = position.down();
        }
    }

    public static boolean isWaterBlock(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        return state.getMaterial() == Material.WATER
                || state.getBlock() instanceof BlockLiquid
                || state.getBlock() instanceof BlockFluidBase;
    }
}
