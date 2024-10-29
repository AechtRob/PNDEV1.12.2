package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockEggsWaterSurface;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

public class MobSpawnSurfaceGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private String mobspawn;
    private IBlockState state;

    public MobSpawnSurfaceGenerator(String mobspawnIn)
    {
        this.setGeneratedBlock(mobspawnIn);
    }

    public void setGeneratedBlock(String mobspawnIn)
    {
        this.mobspawn = mobspawnIn;
        this.state = BlockEggsWaterSurface.block.getDefaultState();
    }

	public boolean generate(World worldIn, Random rand, BlockPos position) {
    	return true;
	}

	public boolean generate(World worldIn, Random rand, BlockPos position, int waterDepthMin, int waterDepthMax) {
		return generate(worldIn, rand, position, null);
	}

    public boolean generate(World worldIn, Random rand, BlockPos position, @Nullable String variant)
    {

		for (int i = 0; i < 5; ++i)
		{
			int j = position.getX() + rand.nextInt(4) - rand.nextInt(4);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(4) - rand.nextInt(4);

			if (k >= Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, k, l)) && canSurviveAt(worldIn, new BlockPos(j, k, l))
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial().isReplaceable())
					&& (worldIn.getBlockState(new BlockPos(j, k - 3, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.LAVA) ){

				Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state, 2);
				applyVariant(this.mobspawn, worldIn, new BlockPos(j, k, l), variant);
				return true;
			}
		}
		return true;
	}

	public static void applyVariant(String mobIn, World world, BlockPos pos, String variant) {
		TileEntity tileentity = world.getTileEntity(pos);
		if (tileentity != null) {
			tileentity.getTileData().setString("creature", mobIn);
			if (variant != null) {
				tileentity.getTileData().setString("PNType", variant);
			}
		}
	}

	public boolean canSurviveAt(World worldIn, BlockPos pos) {
		if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE)
		{
			return false;
		}

		double getLight = worldIn.getLight(pos);
		if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
		{
			return false;
		}

		if (worldIn.getBlockState(pos.down(3)).getMaterial() == Material.WATER)
		{
			return false;
		}

		return true;

	}
}
