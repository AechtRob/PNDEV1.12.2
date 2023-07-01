package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockLavaCobble;
import net.lepidodendron.block.BlockLavaRock;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class WorldGenCrater
{
	private double depthFunc(double x, double rad, double depth) {
		
		return -Math.pow(x, 4) / Math.pow(rad, 4) * depth + depth;
	}
    public void generate(World worldIn, BlockPos position, double radius, double depth)
    {
    	if(worldIn.isRemote)
			return;
    	Random rand = new Random();
		int iRad = (int)Math.round(radius);
		int x = position.getX();
		int z = position.getZ();
		for(int a = -iRad - 8; a <= iRad + 8; a++) {
			
			for(int b = -iRad - 8; b <= iRad + 8; b++) {
				
				double r = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				
				if(r - rand.nextInt(3) <= radius) {
					int dep = (int)depthFunc(r, radius, depth);
					dig(worldIn, x + a, z + b, dep);

					if(r + rand.nextInt(3) <= radius / 3D) {
						place(worldIn, x + a, z + b, 3, BlockLavaCobble.block, 1);
					} else if(r - rand.nextInt(3) <= radius / 3D * 2D) {
						place(worldIn, x + a, z + b, 3, BlockLavaCobble.block);
					} else {
						place(worldIn, x + a, z + b, 3, BlockLavaRock.block);
					}
				}
			}
		}
    }
    
    private void dig(World world, int x, int z, int depth) {
		
		int y = world.getHeight(x, z) - 1;
		
		if(y < depth * 2)
			return;
		
		for(int i = 0; i < depth; i++)
		{
			BlockPos pos = new BlockPos(x, y-i, z);
			world.setBlockToAir(pos);	
		}
	}
	
	private void place(World world, int x, int z, int depth, Block block) { place(world, x, z, depth, block, 0); }
	
	private void place(World world, int x, int z, int depth, Block block, int meta) {
		
		int y = world.getHeight(x, z) - 1;
		
		for(int i = 0; i < depth; i++)
		{
			BlockPos pos = new BlockPos(x, y-i, z);
			world.setBlockState(pos, block.getDefaultState());
			//world.setBlockToAir(x, y - i, z);
		}
			//world.setBlock(x, y - i, z, block, meta, 2);
	}
}
