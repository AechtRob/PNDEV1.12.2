package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockSublepidodendron;
import net.lepidodendron.block.BlockSublepidodendronShoot;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenSublepidodendron extends WorldGenerator
{
	
	public static final Block block = null;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 20; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSublepidodendron.block.canPlaceBlockAt(worldIn, blockpos))
            {
            
				BlockPos blockpos2 = blockpos.down();
				int j = 1 + rand.nextInt(rand.nextInt(BlockSublepidodendron.height + 1) + 1);
				j = Math.min(BlockSublepidodendron.height + 1, j);
				for (int k = 0; k <= j; ++k){
					if (BlockSublepidodendron.block.canPlaceBlockAt(worldIn, blockpos)) {
						if (k != j) {worldIn.setBlockState(blockpos.up(k), BlockSublepidodendron.block.getDefaultState(), 2);}
						if ((k == j) 
							&& ((worldIn.isAirBlock(blockpos.up(k))))
							) {
							//System.err.println("k value: " + k);
							if (k >= BlockSublepidodendron.height + rand.nextInt(2) - rand.nextInt(2)) {
								worldIn.setBlockState(blockpos.up(k), BlockSublepidodendronShoot.block.getDefaultState(), 2);
								break;
							}
						}
					}
				}

                flag = true;
            }
        }

        return flag;
    }
}



