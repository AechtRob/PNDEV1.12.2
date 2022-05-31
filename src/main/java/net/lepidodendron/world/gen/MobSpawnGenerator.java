package net.lepidodendron.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class MobSpawnGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block mobspawn;
    private IBlockState state;

    public MobSpawnGenerator(Block mobspawnIn)
    {
        this.setGeneratedBlock(mobspawnIn);
    }

    public void setGeneratedBlock(Block mobspawnIn)
    {
        this.mobspawn = mobspawnIn;
        this.state = mobspawnIn.getDefaultState();
    }

	public boolean generate(World worldIn, Random rand, BlockPos position) {
    	return true;
	}

    public boolean generate(World worldIn, Random rand, BlockPos position, int waterDepthMin, int waterDepthMax)
    {
		for (int i = 0; i < 5; ++i)
		{
			int j = position.getX() + rand.nextInt(8) - rand.nextInt(8);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(8) - rand.nextInt(8);

			if (this.mobspawn.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
			&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() == Material.WATER)){

				boolean waterDepthCheckMax = false;
				boolean waterDepthCheckMin = true;
				//find air within the right depth
				int yy = 1;
				while (yy <= waterDepthMax + 1 && !waterDepthCheckMax) {
					if ((worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.AIR)
							&& ((worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER))) {
						yy = waterDepthMax + 1;
					}
					else if ((worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() == Material.AIR)
							&& (k + yy >= worldIn.getSeaLevel())) {
						waterDepthCheckMax = true;
					}
					yy += 1;
				}
				//Check that at least enough water is over the position:
				yy = 1;
				while (yy <= waterDepthMin + 1 && waterDepthCheckMin) {
					if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
						waterDepthCheckMin = false;
					}
					yy += 1;
				}

				//figure out a position and facing to place this at!
				//First try regular uprights and then the rotations:
				EnumFacing enumfacing = EnumFacing.UP;
				BlockPos pos = new BlockPos(j, k - 1, l);
				if (waterDepthCheckMin & waterDepthCheckMax) {
					if (this.mobspawn.canPlaceBlockOnSide(worldIn, new BlockPos(j, k, l), enumfacing)
					&& ((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))) {
						worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing), 2);
						return true;
					} else {
						for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
							pos = new BlockPos(j, k, l);
							if (enumfacing1 == EnumFacing.NORTH) {
								pos = new BlockPos(j, k, l + 1);
							}
							if (enumfacing1 == EnumFacing.SOUTH) {
								pos = new BlockPos(j, k, l - 1);
							}
							if (enumfacing1 == EnumFacing.EAST) {
								pos = new BlockPos(j - 1, k, l);
							}
							if (enumfacing1 == EnumFacing.WEST) {
								pos = new BlockPos(j + 1, k, l);
							}
							if (this.mobspawn.canPlaceBlockOnSide(worldIn, new BlockPos(j, k, l), enumfacing1)
								&& ((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
									|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))) {
								worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing1), 2);
								return true;
							}
						}
					}
				}
			}
		}
		return true;
		}
}
