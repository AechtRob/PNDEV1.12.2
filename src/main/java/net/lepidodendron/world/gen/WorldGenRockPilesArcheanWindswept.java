package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLavaCobble;
import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.block.BlockSandPaleoproterozoic;
import net.lepidodendron.block.BlockSandstoneBlack;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenRockPilesArcheanWindswept extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenRockPilesArcheanWindswept()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random() * 2);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false, true);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean mossy) {
        return generate(worldIn, rand, position, mossy, true);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean mossy, boolean sandy)
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

                if (position.getY() <= 109
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
                        if (worldIn.isBlockLoaded(blockpos)) {
                            if (blockpos.distanceSq(position) <= (double) (f * f)) {
                                Block blockIn = BlockSandstoneBlack.block;
                                int ii = rand.nextInt(100) + 1;
                                if (ii >= 55) {
                                    blockIn = BlockLavaRock.block;
                                }
                                else if (ii >= 25) {
                                    blockIn = BlockLavaCobble.block;
                                }
                                else if (ii >= 10) {
                                    blockIn = BlockSandPaleoproterozoic.block;
                                }
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, blockIn.getDefaultState(), 16);

                            }
                        }
                    }

                    BlockPos startpos2 = position;
                    for (int tries = 0; tries <= 100; tries ++) {
                        startpos2 = position.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
                        if (worldIn.isBlockLoaded(startpos2)) {
                            break;
                        }
                        startpos2 = position.add(0, 0 - rand.nextInt(2), 0);
                    }
                    position = startpos2;

                }

                return true;
            }
            position = position.down();
        }
    }
}
