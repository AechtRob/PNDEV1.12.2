package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.lang.reflect.Method;
import java.util.Random;

public class WorldGenPrehistoricLakes extends WorldGenerator
{
    private final Block block;

    public WorldGenPrehistoricLakes(Block blockIn)
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
            position = position.down(4);
            boolean[] aboolean = new boolean[2048];
            int i = rand.nextInt(4) + 4;
            BlockPos spawnPos = position;

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

                            if (k >= 4 && material.isLiquid())
                            {
                                return false;
                            }

                            if (k < 4 && !material.isSolid() && worldIn.getBlockState(position.add(k1, k, l2)).getBlock() != this.block)
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
                            if (i4 >= 4) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,position.add(l1, i4, i3), Blocks.AIR.getDefaultState(), 2);
                                worldIn.immediateBlockTick(position.add(l1 + 1, i4, i3), Blocks.AIR.getDefaultState(), rand);
                                worldIn.immediateBlockTick(position.add(l1 - 1, i4, i3), Blocks.AIR.getDefaultState(), rand);
                                worldIn.immediateBlockTick(position.add(l1, i4, i3 + 1), Blocks.AIR.getDefaultState(), rand);
                                worldIn.immediateBlockTick(position.add(l1, i4, i3 - 1), Blocks.AIR.getDefaultState(), rand);
                                worldIn.immediateBlockTick(position.add(l1, i4 + 1, i3), Blocks.AIR.getDefaultState(), rand);
                                Block blockPlant = worldIn.getBlockState(position.add(l1, i4, i3).up()).getBlock();
                                if (blockPlant == Blocks.DOUBLE_PLANT || blockPlant == Blocks.RED_FLOWER || blockPlant == Blocks.YELLOW_FLOWER) {
                                    //fix for floating plants and half-plants:
                                    worldIn.setBlockToAir(position.add(l1, i4, i3).up());
                                }
                            }
                            else {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, position.add(l1, i4, i3), this.block.getDefaultState(), 2);
                                if (worldIn.getBlockState(position.add(l1, i4, i3).down()).getMaterial().blocksMovement()) {
                                    IBlockState iBlockState = worldIn.getBlockState(position.add(l1, i4, i3).down());
                                    IChunkGenerator chunkGenerator = worldIn.provider.createChunkGenerator();
                                    Class classGenerator = chunkGenerator.getClass();
                                    Class[] params = new Class[4];
                                    params[0] = String.class;
                                    params[1] = int.class;
                                    params[2] = IBlockState.class;
                                    params[3] = Random.class;

                                    Method method = Functions.testAndGetMethod(classGenerator, "getIBlockstateForWater", params);
                                    if (method != null) {
                                        try {
                                            iBlockState = (IBlockState) method.invoke(null, worldIn.getBiome(position).getRegistryName().toString(), position.getY(), iBlockState, rand);
                                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, position.add(l1, i4, i3).down(), iBlockState, 2);
                                        } catch (Exception e) {
                                        }
                                    }
                                }
                            }
                            //Functions.setBlockStateAndCheckForDoublePlant(worldIn,position.add(l1, i4, i3), i4 >= 4 ? Blocks.AIR.getDefaultState() : this.block.getDefaultState(), 2);
                        }
                    }
                }
            }

            for (int i2 = 0; i2 < 16; ++i2)
            {
                for (int j3 = 0; j3 < 16; ++j3)
                {
                    for (int j4 = 4; j4 < 8; ++j4)
                    {
                        if (aboolean[(i2 * 16 + j3) * 8 + j4])
                        {
                            BlockPos blockpos = position.add(i2, j4 - 1, j3);

                            if ((worldIn.getBlockState(blockpos).getMaterial() == Material.GROUND || worldIn.getBlockState(blockpos).getMaterial() == Material.SAND) && worldIn.getLightFor(EnumSkyBlock.SKY, position.add(i2, j4, j3)) > 0)
                            {
                                if (!(worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks"))) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrehistoricGroundSand.block.getDefaultState(), 2);
                                }
                                if (worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga")
                                    || worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_hills")
                                    || worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_basalt")) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrehistoricGroundSandBlack.block.getDefaultState(), 2);
                                }
                                if (worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_valley")) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrehistoricGroundSandRed.block.getDefaultState(), 2);
                                }
                                if (worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")) {
                                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockPrehistoricGroundSandBlack.block.getDefaultState(), 2);
                                }
                            }
                            if (worldIn.getBlockState(blockpos).getBlock() == BlockBrownstone.block && worldIn.getLightFor(EnumSkyBlock.SKY, position.add(i2, j4, j3)) > 0)
                            {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, BlockDriedMud.block.getDefaultState(), 2);
                            }
                        }
                    }
                }
            }

            if (this.block.getDefaultState().getMaterial() == Material.LAVA)
            {
                for (int j2 = 0; j2 < 16; ++j2)
                {
                    for (int k3 = 0; k3 < 16; ++k3)
                    {
                        for (int k4 = 0; k4 < 8; ++k4)
                        {
                            boolean flag1 = !aboolean[(j2 * 16 + k3) * 8 + k4] && (j2 < 15 && aboolean[((j2 + 1) * 16 + k3) * 8 + k4] || j2 > 0 && aboolean[((j2 - 1) * 16 + k3) * 8 + k4] || k3 < 15 && aboolean[(j2 * 16 + k3 + 1) * 8 + k4] || k3 > 0 && aboolean[(j2 * 16 + (k3 - 1)) * 8 + k4] || k4 < 7 && aboolean[(j2 * 16 + k3) * 8 + k4 + 1] || k4 > 0 && aboolean[(j2 * 16 + k3) * 8 + (k4 - 1)]);

                            if (flag1 && (k4 < 4 || rand.nextInt(2) != 0) && worldIn.getBlockState(position.add(j2, k4, k3)).getMaterial().isSolid())
                            {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn,position.add(j2, k4, k3), Blocks.STONE.getDefaultState(), 2);
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
                        int l4 = 4;

                        if (worldIn.canBlockFreezeWater(position.add(k2, 4, l3)))
                        {
                            int flag = net.minecraftforge.common.ForgeModContainer.fixVanillaCascading ? 2| 16 : 2; //Forge: With bit 5 unset, it will notify neighbors and load adjacent chunks.
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,position.add(k2, 4, l3), Blocks.ICE.getDefaultState(), 16); //Forge
                        }
                    }
                }
            }

            ChunkGenSpawner.executeProcedure(worldIn, spawnPos, rand, null, true, true);
            return true;
        }
    }
}
