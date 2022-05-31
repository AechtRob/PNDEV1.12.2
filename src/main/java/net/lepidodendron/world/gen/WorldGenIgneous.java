package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLavaRock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenIgneous extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenIgneous()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random() * 8);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        if (Math.random() > 0.2) {
            return false;
        }

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
                    	&& material != Material.GROUND && material != Material.SAND
                        && position.getY() <= worldIn.getSeaLevel())
                    {
                        break label50;
                    }
                }

                if (position.getY() <= 3)
                {
                    return false;
                }

                int i1 = this.startRadius;

                for (int i = 0; i1 >= 0 && i < 2; ++i)
                {
                    int j = i1 + rand.nextInt(2);
                    int k = i1 + rand.nextInt(2) - 1;
                    int l = i1 + rand.nextInt(2);
                    float f = (float)(j + k + l) * 0.333F + 0.5F;

                    for (BlockPos blockpos : BlockPos.getAllInBox(position.add(-j, -1, -l), position.add(j, -1, l)))
                    {
                        if (
                            (
                            (worldIn.getBlockState(blockpos).getMaterial() == Material.ROCK)
                            || (worldIn.getBlockState(blockpos).getMaterial() == Material.GROUND)
                            )
                            && (blockpos.distanceSq(position) <= (double)(f * f))
                        )
                        {
                        	Block blockIn = BlockLavaRock.block;
                        	if (Math.random() > 0.65) { //Stone
                        		blockIn = Blocks.STONE.getStateFromMeta(0).getBlock();
                        	}
                        	if (Math.random() > 0.85) { //Granite
                        		blockIn = Blocks.STONE.getStateFromMeta(1).getBlock();
                        	}
                        	if (Math.random() > 0.85) { //Andesite
                        		blockIn = Blocks.STONE.getStateFromMeta(5).getBlock();
                        	}
                        	if (Math.random() > 0.85) { //Diorite
                                blockIn = Blocks.STONE.getStateFromMeta(3).getBlock();
                            }
                            worldIn.setBlockState(blockpos, blockIn.getDefaultState(), 4);
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
