package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.*;
import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.lepidodendron.util.Functions;
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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;

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
		boolean seaPens = this.charnia == BlockSeaPenPink.block || this.charnia == BlockSeaPenYellow.block;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimEdiacaran) && !seaPens) {
			dimensionCriteria = true;
		}
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimAnemone) && seaPens) {
			dimensionCriteria = true;
		}
		if (dimID == LepidodendronConfig.dimPrecambrian) {
			if (BlockArkarua.isPrecambrianUpdated()) {
				if (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_beach")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_shallow_reef")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
						|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_sparse_sea")) {
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
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:tonian_sea")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
					//|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacarian_shallow_reef")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacarian_sparse_sea")
			)
					&& this.charnia == BlockGrypania.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockGrypania.block) {
				dimensionCriteria = false;
			}
			if ((position.getY() < 65 + rand.nextInt(3))
					&& this.charnia == BlockGrypania.block)
			{
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_carpet")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_beach")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_shallows")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:tonian_sea")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacarian_sparse_sea")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
			)
					&& this.charnia == BlockTuanshanzia.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockTuanshanzia.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
			)
					&& this.charnia == BlockCharnia.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockCharnia.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_shallow_reef")
			)
					&& this.charnia == BlockCharniodiscus.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockCharniodiscus.block) {
				dimensionCriteria = false;
			}

			if ((position.getY() < 35 + rand.nextInt(3))
					&& this.charnia == BlockHapsidophyllas.block)
			{
				Biome biome = worldIn.getBiome(position);
				boolean era = false;
				if (biome instanceof BiomePrecambrian) {
					era = ((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran;
				}
				dimensionCriteria = era;
			}
			else if (this.charnia == BlockHapsidophyllas.block) {
				dimensionCriteria = false;
			}

			if ((position.getY() < 35 + rand.nextInt(3))
					&& this.charnia == BlockParviscopa.block)
			{
				Biome biome = worldIn.getBiome(position);
				boolean era = false;
				if (biome instanceof BiomePrecambrian) {
					era = ((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran;
				}
				dimensionCriteria = era;
			}
			else if (this.charnia == BlockParviscopa.block) {
				dimensionCriteria = false;
			}

			if ((position.getY() < 35 + rand.nextInt(3))
					&& this.charnia == BlockPrimocandelabrum1.block)
			{
				Biome biome = worldIn.getBiome(position);
				boolean era = false;
				if (biome instanceof BiomePrecambrian) {
					era = ((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran;
				}
				dimensionCriteria = era;
			}
			else if (this.charnia == BlockPrimocandelabrum1.block) {
				dimensionCriteria = false;
			}

			if ((position.getY() < 35 + rand.nextInt(3))
					&& this.charnia == BlockPrimocandelabrum2.block)
			{
				Biome biome = worldIn.getBiome(position);
				boolean era = false;
				if (biome instanceof BiomePrecambrian) {
					era = ((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran;
				}
				dimensionCriteria = era;
			}
			else if (this.charnia == BlockPrimocandelabrum2.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
				|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
			)
					&& this.charnia == BlockBomakellia.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockBomakellia.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
			)
					&& this.charnia == BlockArborea.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockArborea.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
			)
					&& this.charnia == BlockPambikalbae.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockPambikalbae.block) {
				dimensionCriteria = false;
			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
			)
					&& this.charnia == BlockCoronacollina.block)
			{
				dimensionCriteria = true;
			}
			else if (this.charnia == BlockCoronacollina.block) {
				dimensionCriteria = false;
			}

//			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")
//					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")
//					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
//					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
//					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_shallow_reef")
//			)
//					&& this.charnia == BlockRangea.block)
//			{
//				dimensionCriteria = true;
//			}
//			else if (this.charnia == BlockRangea.block) {
//				dimensionCriteria = false;
//			}

			if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")
				)
					&& this.charnia == BlockGrypania.block
			) {
				upsideDown = true;
			}

		}
		double moddedBuff = 1.0D;
		if (dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly
				|| dimID == LepidodendronConfig.dimCretaceousLate
				|| dimID == LepidodendronConfig.dimPaleogene
				|| dimID == LepidodendronConfig.dimNeogene
				|| dimID == LepidodendronConfig.dimPleistocene)
		{
			Biome biome = worldIn.getBiome(position);
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN)) {
				dimensionCriteria = seaPens;
				moddedBuff = 5.0D;
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.LUSH)) {
					moddedBuff = 25.0F;
				}
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")) {
					dimensionCriteria = false;
				}
			}
		}
		if (!dimensionCriteria)
			return true;

		int bound = 4;

		int yTop = ChunkGenSpawner.getTopSolidBlock(position, worldIn).getY();

		double multiplier = 1;

		double edicarandensity = LepidodendronConfig.genEdiacaran;

		if (seaPens) {
			edicarandensity = 0.15D * moddedBuff;
		}

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
					//|| this.charnia == BlockFrondophyllas.block
					//|| this.charnia == BlockGigarimaneta.block
					|| this.charnia == BlockHapsidophyllas.block
					//|| this.charnia == BlockHylaecullulus.block
					|| this.charnia == BlockParviscopa.block
					|| this.charnia == BlockPrimocandelabrum1.block
					|| this.charnia == BlockPrimocandelabrum2.block
					)
				)
			{
				multiplier = (double)3.0 * edicarandensity;
			}
			//Frondose forest general:
			else if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
					|| yTop < 65)
					&& (this.charnia == BlockPambikalbae.block
					//|| this.charnia == BlockRangea.block
					|| this.charnia == BlockCharnia.block
					|| this.charnia == BlockArborea.block
					|| this.charnia == BlockBomakellia.block
					|| this.charnia == BlockPteridinium.block
					|| this.charnia == BlockCoronacollina.block
					)
				)
			{
				multiplier = (double)18.0 * edicarandensity;
			}
			else if (this.charnia == BlockPteridinium.block)
			{
				multiplier = (double)10.0 * edicarandensity;
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
		}

		//Sea pens:
		if (seaPens) {
			multiplier = (double)12.0 * edicarandensity;
		}

		if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_carpet")
				|| worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:mesoproterozoic_beach")
		)
				&& this.charnia == BlockGrypania.block)
		{
			multiplier = 128;
		}

		if ((worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")
		)
				&& this.charnia == BlockGrypania.block)
		{
			multiplier = 56;
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
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK && worldIn.getBlockState(pos).getBlock() != Blocks.MAGMA)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlock() != BlockStromatolite.block)) { //Do not generate on top of Stromatolites: they have their own different community
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state, 2);
							return true;
						}
					} else if (upsideDown) {
						//Can we place this here upside down?
						if (worldIn.getBlockState(new BlockPos(j, k + 1, l)).getMaterial() == Material.PACKED_ICE && rand.nextInt(32) == 0) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state.withProperty(BlockGrypania.FACING, EnumFacing.DOWN), 2);
							return true;
						}

					}
				} else if (upsideDown) {
					//Can we place this under, upside down?
					if (worldIn.getBlockState(new BlockPos(j, k - 1, l)).getMaterial() == Material.PACKED_ICE && rand.nextInt(16) == 0
							&& (this.charnia.canPlaceBlockAt(worldIn, new BlockPos(j, k - 2, l))
							&& (worldIn.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.WATER))) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k - 2, l), this.state.withProperty(BlockGrypania.FACING, EnumFacing.DOWN), 2);
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
