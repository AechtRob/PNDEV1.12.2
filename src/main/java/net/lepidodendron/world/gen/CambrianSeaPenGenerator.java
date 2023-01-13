package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockStromatoveris;
import net.lepidodendron.block.BlockThaumaptilon;
import net.lepidodendron.util.EnumBiomeTypeCambrian;
import net.lepidodendron.world.biome.cambrian.BiomeCambrian;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class CambrianSeaPenGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block seaPen;
    private IBlockState state;

    public CambrianSeaPenGenerator(Block seaPenIn)
    {
        this.setGeneratedBlock(seaPenIn);
    }

    public void setGeneratedBlock(Block seaPenIn)
    {
    	Random rand = new Random();
		int ii = rand.nextInt(4);
        this.seaPen = seaPenIn;
        if (ii == 0) {
			this.state = seaPenIn.getDefaultState().withProperty(FACING, EnumFacing.NORTH);
		}
		if (ii == 1) {
			this.state = seaPenIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
			}
		if (ii == 2) {
			this.state = seaPenIn.getDefaultState().withProperty(FACING, EnumFacing.EAST);
		}
		if (ii == 3) {
			this.state = seaPenIn.getDefaultState().withProperty(FACING, EnumFacing.WEST);
		}
        //this.state = seaPenIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimCrinoid))
		dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimCambrian) {
			dimensionCriteria = true;
		}
		Biome biome = worldIn.getBiome(position);

		if (biome instanceof BiomeCambrian) {
			BiomeCambrian biomeCambrian = (BiomeCambrian) biome;
			if (biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Ocean
					|| biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Reef
					|| biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Estuary
			) {
				//Pass
			}
			else {
				dimensionCriteria = false;
			}
		}
		if (seaPen == BlockStromatoveris.block && (!worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")) && dimID == LepidodendronConfig.dimCambrian) {
			dimensionCriteria = false;
		}
		if (seaPen == BlockThaumaptilon.block && worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary") && dimID == LepidodendronConfig.dimCambrian) {
			dimensionCriteria = false;
		}
		if (!dimensionCriteria)
			return true;

		int bound = 8;

		for (int i = 0; i < 24; ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (this.seaPen.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
			&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER)){

				//Check that at least enough water is over the position (15 blocks for these):
				//boolean waterDepthCheckMin = true;
				//int yy = 1;
				//while (yy <= 15 && waterDepthCheckMin) {
				//	if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
				//		waterDepthCheckMin = false;
				//	}
				//	yy += 1;
				//}

				//if (waterDepthCheckMin) {
					//figure out a position and facing to place this at!
					BlockPos pos = new BlockPos(j, k - 1, l);
					if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
						|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD)))
					{
						worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
						return true;
					}
				//}
			}
		}
		return true;
		}

	public boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
    }
}
