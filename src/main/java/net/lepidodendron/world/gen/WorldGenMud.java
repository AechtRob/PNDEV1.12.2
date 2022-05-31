package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockCarboniferousMud;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenMud extends WorldGenerator
{

	public boolean generate(World worldIn, Random rand, BlockPos position) {
		return generate(worldIn, rand, position, false);
	}

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean nearSea)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (nearSea && (blockpos.getY() - rand.nextInt(3)) > worldIn.getSeaLevel()) {
				continue;
			}

            if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos)
            	&& (
            		((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos.down())).getMaterial() == Material.CLAY)
            	)
            )
            {
                worldIn.setBlockState(blockpos.down(), BlockCarboniferousMud.block.getDefaultState(), 2);
				worldIn.setBlockToAir(blockpos);
				flag = true;
            }
            
            if (Math.random() > 0.75) {

				BlockPos blockpos1 = blockpos.north();
				if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos1)
            	&& (
            		((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.CLAY)
            	)
	            )
	            {
	                worldIn.setBlockState(blockpos.down(), BlockCarboniferousMud.block.getDefaultState(), 2);
					worldIn.setBlockToAir(blockpos);
					flag = true;
	            }

	            blockpos1 = blockpos.south();
				if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos1)
            	&& (
            		((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.CLAY)
            	)
	            )
	            {
	                worldIn.setBlockState(blockpos.down(), BlockCarboniferousMud.block.getDefaultState(), 2);
					worldIn.setBlockToAir(blockpos);
					flag = true;
	            }

	            blockpos1 = blockpos.east();
				if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos1)
            	&& (
            		((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.CLAY)
            	)
	            )
	            {
	                worldIn.setBlockState(blockpos.down(), BlockCarboniferousMud.block.getDefaultState(), 2);
					worldIn.setBlockToAir(blockpos);
					flag = true;
	            }

	            blockpos1 = blockpos.west();
				if ((!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.isAirBlock(blockpos1)
            	&& (
            		((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GROUND)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.GRASS)
            		|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.SAND)
					|| ((worldIn.getBlockState(blockpos1.down())).getMaterial() == Material.CLAY)
            	)
	            )
	            {
	                worldIn.setBlockState(blockpos.down(), BlockCarboniferousMud.block.getDefaultState(), 2);
					worldIn.setBlockToAir(blockpos);
					flag = true;
	            }

            }
        }

        return flag;
    }
}
