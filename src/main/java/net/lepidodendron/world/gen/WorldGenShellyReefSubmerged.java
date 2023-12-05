package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCoralBleached;
import net.lepidodendron.block.BlockShelly;
import net.lepidodendron.block.BlockSpongeReef;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenShellyReefSubmerged extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if ((!worldIn.provider.isNether()) && (blockpos.getY() <= worldIn.getSeaLevel() - 1) && (blockpos.getY() >= worldIn.getSeaLevel() - 6)
            	&& worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND
                && worldIn.getBlockState(blockpos).getMaterial() == Material.WATER
            	)
            {
                if (worldIn.getBiome(position) instanceof BiomeJurassic) {
                    if (((BiomeJurassic)((BiomeJurassic) worldIn.getBiome(position))).getBiomeType() == EnumBiomeTypeJurassic.IslandWhite && rand.nextInt(16) == 0) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), ShellyReefGenerator.getShellyState(BlockCoralBleached.block.getDefaultState(), rand), 2);
                    }
                    else if (((BiomeJurassic)((BiomeJurassic) worldIn.getBiome(position))).getBiomeType() == EnumBiomeTypeJurassic.IslandWhite && rand.nextInt(8) == 0) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), ShellyReefGenerator.getShellyState(BlockSpongeReef.block.getDefaultState(), rand), 2);
                    }
                    else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), ShellyReefGenerator.getShellyState(BlockShelly.block.getDefaultState(), rand), 2);
                    }
                }
                else {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), ShellyReefGenerator.getShellyState(BlockShelly.block.getDefaultState(), rand), 2);
                }
                flag = true;
            }
        }

        return flag;
    }
}
