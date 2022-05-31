package net.lepidodendron.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenGravelPatch extends WorldGenerator
{
    private final Block block;
    private final int radius;

    public WorldGenGravelPatch(Block p_i45462_1_, int p_i45462_2_)
    {
        this.block = p_i45462_1_;
        this.radius = p_i45462_2_;
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        {
            int i = rand.nextInt(this.radius - 2) + 2;
            int j = 2;

            for (int k = position.getX() - i; k <= position.getX() + i; ++k)
            {
                for (int l = position.getZ() - i; l <= position.getZ() + i; ++l)
                {
                    int i1 = k - position.getX();
                    int j1 = l - position.getZ();

                    if (i1 * i1 + j1 * j1 <= i * i)
                    {
                        for (int k1 = position.getY() - 2; k1 <= position.getY() + 2; ++k1)
                        {
                            BlockPos blockpos = new BlockPos(k, k1, l);
                            Material material = worldIn.getBlockState(blockpos).getMaterial();

                            if ((material == Material.SAND || material == Material.ROCK || material == Material.GROUND)
                                && worldIn.getBlockState(blockpos) != Blocks.BEDROCK.getDefaultState())
                            {
                                worldIn.setBlockState(blockpos, this.block.getDefaultState(), 2);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }
}
