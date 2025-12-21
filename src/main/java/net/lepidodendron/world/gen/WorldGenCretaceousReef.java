package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCoral;
import net.lepidodendron.block.BlockShelly;
import net.lepidodendron.block.BlockSpongeReef;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenCretaceousReef extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenCretaceousReef()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random());
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        while (true)
        {
            label50:
            {
                if (position.getY() > 3)
                {
                    if (worldIn.getBlockState(position).getMaterial() != Material.WATER || worldIn.isAirBlock(position.down()))
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

                int i1 = this.startRadius;
                if (Math.random() > 0.85) {
                    i1 = i1 + rand.nextInt(1);
                }

                for (int i = 0; i1 >= 0 && i < 3; ++i)
                {
                    int j = i1 + rand.nextInt(2);
                    int k = i1 + rand.nextInt(2);
                    int l = i1 + rand.nextInt(2);
                    float f = (float)(j + k + l) * 0.333F + 0.5F;

                    for (BlockPos blockpos : BlockPos.getAllInBox(position.add(-j, -k, -l), position.add(j, k, l)))
                    {
                        if (Math.random() > 0.2 && blockpos.distanceSq(position) <= (double)(f * f))
                        {
                        	Block blockIn = BlockShelly.block;
                            if (rand.nextInt(12) == 0) {
                                blockIn = BlockCoral.block;
                            }
                            if (rand.nextInt(28) == 0) {
                                blockIn = BlockSpongeReef.block;
                            }
                            int ii = rand.nextInt(4);

                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, blockIn.getDefaultState().withProperty(BlockShelly.FACING, EnumFacing.byHorizontalIndex(ii)), 4);
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
