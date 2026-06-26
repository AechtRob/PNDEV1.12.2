package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCurvey extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return false;
    }

    public boolean generate(IBlockState blockIn, World worldIn, Random rand, BlockPos position, boolean aboveGround, double rarity, double spacing, Biome biome)
    {
        int startX = position.getX() & ~15;
        int startZ = position.getZ() & ~15;
        boolean flag = false;
        NoiseGeneratorPerlin noise = new NoiseGeneratorPerlin( new Random(worldIn.getSeed()), 4);

        for (int x = startX; x < startX + 16; x++) {
            for (int z = startZ; z < startZ + 16; z++) {

                double n = noise.getValue(x * 0.008, z * 0.008);
                double nearestContour = Math.round(n / spacing) * spacing;

                if (Math.abs(n - nearestContour) < rarity) {
                    if (worldIn.getBiome(new BlockPos(x, 0, z)) == biome) {

                        BlockPos placePos = ChunkGenSpawner.getTopSolidBlock(new BlockPos(x, 0, z), worldIn);

                        if (aboveGround) {
                            placePos = placePos.up();
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, placePos, blockIn);
                        } else {
                            worldIn.setBlockState(placePos, blockIn, 3);
                        }
                        flag = true;
                    }

                }
            }
        }

        return flag;
    }
}
