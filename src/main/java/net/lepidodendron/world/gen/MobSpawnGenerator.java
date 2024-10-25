package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

public class MobSpawnGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private String mobspawn;
    private IBlockState state;

    public MobSpawnGenerator(String mobspawnIn)
    {
        this.setGeneratedBlock(mobspawnIn);
    }

    public void setGeneratedBlock(String mobspawnIn)
    {
        this.mobspawn = mobspawnIn;
        this.state = BlockEggsWater.block.getDefaultState();
    }

	public boolean generate(World worldIn, Random rand, BlockPos position) {
    	return true;
	}

	public boolean generate(World worldIn, Random rand, BlockPos position, int waterDepthMin, int waterDepthMax) {
		return generate(worldIn, rand, position, waterDepthMin, waterDepthMax, null);
	}

    public boolean generate(World worldIn, Random rand, BlockPos position, int waterDepthMin, int waterDepthMax, @Nullable String variant)
    {
		for (int i = 0; i < 5; ++i)
		{
			int j = position.getX() + rand.nextInt(4) - rand.nextInt(4);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(4) - rand.nextInt(4);

			if (this.state.getBlock().canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
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
							&& (k + yy >= Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, k + yy, l)))) {
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
				//Only upright:
				EnumFacing enumfacing = EnumFacing.UP;
				BlockPos pos = new BlockPos(j, k - 1, l);
				if (waterDepthCheckMin & waterDepthCheckMax) {
					if (this.state.getBlock().canPlaceBlockOnSide(worldIn, new BlockPos(j, k, l), enumfacing)
					&& ((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing), 2);
						if (variant != null) {
							applyVariant(this.mobspawn, worldIn, new BlockPos(j, k, l), variant);
						}
						return true;
					}
				}
			}
		}
		return true;
	}

	public static void applyVariant(String mobIn, World world, BlockPos pos, String variant) {
		TileEntity tileentity = world.getTileEntity(pos);
		if (tileentity != null) {
			tileentity.getTileData().setString("creature", mobIn);
			tileentity.getTileData().setString("PNType", variant);
		}
	}
}
