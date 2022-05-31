package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockAncientMoss;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenAncientMossGround extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position) {
		boolean flag = false;

		for (int i = 0; i < 64; ++i)
		{
			BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

			if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
					&& (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockAncientMoss.block.canPlaceBlockAt(worldIn, blockpos))
			{

				if (BlockAncientMoss.block.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					worldIn.setBlockState(blockpos, BlockAncientMoss.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
					if (rand.nextInt(5) == 0) {WorldGenAncientMoss.PlaceEggs(rand, worldIn, blockpos);}
					flag = true;
				}

			}
		}

		return flag;
	}
}