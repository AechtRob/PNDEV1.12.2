package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.*;
import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class CharniaGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block charnia;
    private IBlockState state;

    public CharniaGenerator(Block charniaIn)
    {
        this.setGeneratedBlock(charniaIn);
    }

    public void setGeneratedBlock(Block charniaIn)
    {
    	Random rand = new Random();
		int ii = rand.nextInt(4);
        this.charnia = charniaIn;
        if (ii == 0) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.NORTH);
		}
		if (ii == 1) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
			}
		if (ii == 2) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.EAST);
		}
		if (ii == 3) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.WEST);
		}
		if (this.charnia == BlockGrypania.block) {
			this.state = charniaIn.getDefaultState().withProperty(FACING, EnumFacing.UP);
		}
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		boolean upsideDown = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimEdiacaran)) {
			dimensionCriteria = true;
		}
		if (dimID == LepidodendronConfig.dimPrecambrian) {

			if (BlockArkarua.isPrecambrianUpdated()) {
				if (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_beach")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")) {
					dimensionCriteria = true;
				}
				else if (dimID == LepidodendronConfig.dimPrecambrian) {
					dimensionCriteria = false; //block the other precambrian biomes
				}
			}
			else {
				if (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")) {
					dimensionCriteria = true;
				}
			}

			String hh = worldIn.getBiome(position).getRegistryName().toString();
			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_shallows")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_beach")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_carpet")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_beach")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
			)
					&& this.charnia == BlockGrypania.block)
			{
				dimensionCriteria = true;
			}


			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
				)
					&& this.charnia == BlockGrypania.block
			) {
				upsideDown = true;
			}

		}
		if (!dimensionCriteria)
			return true;

		int bound = 4;

		int yTop = ChunkGenSpawner.getTopSolidBlock(position, worldIn).getY();

		double multiplier = 1;

		double edicarandensity = LepidodendronConfig.genEdiacaran;
		if (edicarandensity < 0.01) {
			edicarandensity = 0.01;
		}
		if (edicarandensity > 1.0) {
			edicarandensity = 1.0;
		}

		if (BlockArkarua.isPrecambrianUpdated()) {
			//Very deep spawns:
			if ((yTop < 65)
			&& (this.charnia == BlockArborea.block
					|| this.charnia == BlockBradgatia.block
					|| this.charnia == BlockCharnia.block
					|| this.charnia == BlockCharniodiscus.block
					|| this.charnia == BlockHapsidophyllas.block
					|| this.charnia == BlockParviscopa.block
					|| this.charnia == BlockPrimocandelabrum1.block
					|| this.charnia == BlockPrimocandelabrum2.block
					|| this.charnia == BlockPteridinium.block
					)
				)
			{
				multiplier = (double)3.0 * edicarandensity;
			}
			//Frondose forest general:
			else if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
					|| yTop < 65)
					&& (this.charnia == BlockPambikalbae.block
					|| this.charnia == BlockBradgatia.block
					|| this.charnia == BlockCharnia.block
					|| this.charnia == BlockArborea.block
					|| this.charnia == BlockCharniodiscus.block
					|| this.charnia == BlockHapsidophyllas.block
					|| this.charnia == BlockParviscopa.block
					|| this.charnia == BlockPrimocandelabrum1.block
					|| this.charnia == BlockPrimocandelabrum2.block
					|| this.charnia == BlockPteridinium.block
					)
				)
			{
				multiplier = (double)18.0 * edicarandensity;
			}
			//Shallow spawns:
			else if (((!worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest"))
					&& yTop > 95)
					&& (this.charnia == BlockFunisia.block
					|| this.charnia == BlockCoronacollina.block
					|| this.charnia == BlockBomakellia.block
					|| this.charnia == BlockPambikalbae.block
					)
				)
			{
				multiplier = (double)22.0 * edicarandensity;
			}
			else if (((!worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest"))
					&& yTop > 75)
					&& (this.charnia == BlockFunisia.block
					|| this.charnia == BlockCoronacollina.block
					|| this.charnia == BlockPambikalbae.block
					)
				)
			{
				multiplier = (double)12.0 * edicarandensity;
			}
			//Some to be a little deeper
			else if (BlockArkarua.isPrecambrianUpdated()
					&& yTop > 65
					&& yTop < 110
					&& (this.charnia == BlockGrypania.block
					|| this.charnia == BlockGrypania.block
					)
				)
			{
				multiplier = 4;
			}
			//Medium depth but not more common:
			else if (BlockArkarua.isPrecambrianUpdated()
					&& yTop > 65
					&& yTop < 110
					&& (this.charnia == BlockArborea.block
					|| this.charnia == BlockCharnia.block
					|| this.charnia == BlockBradgatia.block
				)
				)
			{
				multiplier = 1;
				if (rand.nextInt(8) != 0) {
					multiplier = 0;
				}
			}
			else {
				if (BlockArkarua.isPrecambrianUpdated()
					&& worldIn.getBiome(position) instanceof BiomePrecambrian) {
					if (((BiomePrecambrian)worldIn.getBiome(position)).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran) {
						return true;
					}
				}
			}
		}

		if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_carpet")
				|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_beach")
		)
				&& this.charnia == BlockGrypania.block)
		{
			multiplier = 128;
		}

		if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
				|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
		)
				&& this.charnia == BlockGrypania.block)
		{
			multiplier = 64;
		}

		for (int i = 0; i < (int)Math.max(1, (int)(4.0D * multiplier)); ++i)
		{

			if (rand.nextInt(64) == 0) {

				int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
				int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);
				int k = ChunkGenSpawner.getTopSolidBlock(new BlockPos(j, 0, l), worldIn).getY() + 1;

				if (this.charnia.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
						&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER)) {

					//Check that at least enough water is over the position (2 blocks):
					boolean waterDepthCheckMin = true;
					int yy = 1;
					while (yy <= 2 && waterDepthCheckMin) {
						if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
							waterDepthCheckMin = false;
						}
						yy += 1;
					}

					if (waterDepthCheckMin) {
						//figure out a position and facing to place this at!
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlock() != BlockStromatolite.block)) { //Do not generate on top of Stromatolites: they have their own different community
							worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
							return true;
						}
					} else if (upsideDown) {
						//Can we place this here upside down?
						if (worldIn.getBlockState(new BlockPos(j, k + 1, l)).getMaterial() == Material.PACKED_ICE && rand.nextInt(32) == 0) {
							worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(BlockGrypania.FACING, EnumFacing.DOWN), 2);
							return true;
						}

					}
				} else if (upsideDown) {
					//Can we place this under, upside down?
					if (worldIn.getBlockState(new BlockPos(j, k - 1, l)).getMaterial() == Material.PACKED_ICE && rand.nextInt(16) == 0
							&& (this.charnia.canPlaceBlockAt(worldIn, new BlockPos(j, k - 2, l))
							&& (worldIn.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.WATER))) {
						worldIn.setBlockState(new BlockPos(j, k - 2, l), this.state.withProperty(BlockGrypania.FACING, EnumFacing.DOWN), 2);
						return true;
					}

				}
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
