package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.procedure.ProcedureWorldGenCordaites;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenCordaites extends WorldGenAbstractTree
{

    public WorldGenCordaites(boolean notify)
    {
        super(notify);
    }

	@Override
	protected boolean canGrowInto(Block blockType)
    {
        Material material = blockType.getDefaultState().getMaterial();
        return material == Material.WATER || material == Material.AIR || material == Material.LEAVES || blockType == Blocks.GRASS || blockType == Blocks.DIRT || blockType == Blocks.LOG || blockType == Blocks.LOG2 || blockType == Blocks.SAPLING || blockType == Blocks.VINE;
    }
    
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        int i = rand.nextInt(3) + 5;
        //System.err.println("Material is water: " + (worldIn.getBlockState(position).getMaterial() == Material.WATER));

        //if (this.useExtraRandomHeight)
        //{
        //    i += rand.nextInt(7);
       // }

        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + i + 1 <= 256)
        {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j)
            {
                int k = 1;

                if (j == position.getY())
                {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2)
                {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l)
                {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1)
                    {
                        if (j >= 0 && j < worldIn.getHeight())
                        {
                            if (!this.isReplaceable(worldIn, blockpos$mutableblockpos.setPos(l, j, i1)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                IBlockState state = worldIn.getBlockState(down);
                //boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

				boolean isSoil = (worldIn.isAirBlock(position) && 
					((worldIn.getBlockState(position.down())).getMaterial() == Material.WATER)
						&& 
					(((worldIn.getBlockState(position.down(2))).getMaterial() == Material.SAND) 
						|| ((worldIn.getBlockState(position.down(2))).getMaterial() == Material.GROUND))
					);
				if (isSoil) {
					position = position.down();
				}
					
				if (!isSoil) {
					if (worldIn.isAirBlock(position) && 
					((worldIn.getBlockState(position.down())).getMaterial() == Material.WATER)
					&& ((worldIn.getBlockState(position.down(2))).getMaterial() == Material.WATER)
					&& 
					(((worldIn.getBlockState(position.down(3))).getMaterial() == Material.SAND) 
						|| ((worldIn.getBlockState(position.down(3))).getMaterial() == Material.GROUND))
					) {
						position = position.down(2);
						isSoil = true;
					}
					 
				}
				
                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous
                        || worldIn.provider.getDimension() == LepidodendronConfig.dimPermian) {
                        if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
                            $_dependencies.put("vines", true);
                        }
                        else {
                            $_dependencies.put("vines", false);
                        }
                        $_dependencies.put("vines2", true);
                        $_dependencies.put("SaplingSpawn", false);
                    }
					else { //No vines in other dims
                        $_dependencies.put("vines", false);
                        $_dependencies.put("vines2", false);
                        $_dependencies.put("SaplingSpawn", true);
                    }
					ProcedureWorldGenCordaites.executeProcedure($_dependencies);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
