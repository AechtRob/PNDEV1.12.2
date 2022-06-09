package net.lepidodendron.world.gen;

import java.util.ArrayList;
import java.util.Random;

import net.lepidodendron.block.BlockMeteorite;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
//import net.minecraft.util.MathHelper;
import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class MeteoriteImpact extends WorldGenerator
{
	protected Explosion explosion;

	public MeteoriteImpact(Explosion expl)
	{
		this.explosion = expl;
	}

	public boolean generate(World world, Random random, BlockPos pos )
	{
		Block meteor = BlockMeteorite.block;

		//Initial spreading
		int radius = 6;
		int radiusSquared = radius * radius;
		for (int y = radius; y >= -radius; y--) {
			for (int startX = radius; startX >= -radius; startX--) {
				for (int startZ = radius; startZ >= -radius; startZ--) {					
					int distance = startX * startX + y * y + startZ * startZ;										
					
                    if (distance <= radiusSquared)
                    {
                    	BlockPos pos2 = new BlockPos(startX + pos.getX(), y + pos.getY(), startZ + pos.getZ());
    					if ((!world.isAirBlock(pos2)) && (meteorsAboveAndBelow(world, startX, y, startZ) == 0) && (random.nextInt(10) + 1 > 7) && (checkBlockIDs(world, startX, y, startZ))) {
    						world.setBlockState(pos2, meteor.getDefaultState(), 3);
    						}
    					}
                    }
				}
		}

		return true;
	}

	public void postImpact(World world, int i, int j, int k)
	{
		//Dummy method used to mark the end of the meteor impact process.
	}

	public int meteorsAbove(World world, int x, int y, int z) 
	{ 	int ceiling = y + 8 * 4;
		int mAbove = 0;
		for (int y1 = y; y1 <= ceiling; y1++) {
			BlockPos pos = new BlockPos(x, y1, z);
			Block block = world.getBlockState(pos).getBlock();
			if (Block.isEqualTo(block, BlockMeteorite.block)) {
				mAbove++;
			}
	}
	return mAbove; }

	public int meteorsBelow(World world, int x, int y, int z)
	{
		int floor = y - 8 * 4;
		int mBelow = 0;
		for (int y1 = y; y1 >= floor; y1--) {
			BlockPos pos = new BlockPos(x, y1, z);
			Block block = world.getBlockState(pos).getBlock();
			if (Block.isEqualTo(block, BlockMeteorite.block)) {
				mBelow++;
			}
		}
		return mBelow;
	}

	public int meteorsAboveAndBelow(World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		Block bl = world.getBlockState(pos).getBlock();
		return 0 - (meteorsAbove(world, x, y, z) + meteorsBelow(world, x, y, z) - (Block.isEqualTo(bl, BlockMeteorite.block) ? 1 : 0));
	}

	protected boolean checkBlockIDs(World world, int i, int j, int k) {
		BlockPos pos = new BlockPos(i, j, k);
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		return (!Block.isEqualTo(block, Blocks.BEDROCK) && !Block.isEqualTo(block, BlockMeteorite.block)&& !Block.isEqualTo(block, Blocks.FLOWING_WATER) && 
				!Block.isEqualTo(block, Blocks.WATER) && state.isNormalCube());
	}
}