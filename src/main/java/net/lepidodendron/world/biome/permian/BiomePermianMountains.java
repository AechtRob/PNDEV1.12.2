
package net.lepidodendron.world.biome.permian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.gen.*;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomePermianMountains extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:permian_mountains")
	public static final BiomeGenCustom biome = null;
	public BiomePermianMountains(ElementsLepidodendronMod instance) {
		super(instance, 1589);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.MOUNTAIN);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SNOWY);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.COLD);
	}

	static class BiomeGenCustom extends BiomePermian {
		public BiomeGenCustom() {
			super(new BiomeProperties("Permian Mountains").setBaseHeight(3.5F).setHeightVariation(0.610F).setTemperature(-0.25F).setSnowEnabled());
			setRegistryName("permian_mountains");
			topBlock = Blocks.GRAVEL.getStateFromMeta(0);
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 20;
			decorator.gravelPatchesPerChunk = 10;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
		{
			this.topBlock = Blocks.GRAVEL.getStateFromMeta(0);
			this.fillerBlock = Blocks.STONE.getStateFromMeta(0);

			if ((noiseVal < -1.0D || noiseVal > 2.0D))
			{
				this.topBlock = Blocks.GRAVEL.getDefaultState();
				this.fillerBlock = Blocks.GRAVEL.getDefaultState();
			}

			this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
		}

		protected static final WorldGenWalchiaTree WALCHIA_TREE = new WorldGenWalchiaTree(false);
		protected static final WorldGenSnow SNOW_GENERATOR = new WorldGenSnow();
		protected static final WorldGenBuriadia BURIADIA_GENERATOR = new WorldGenBuriadia();
		protected static final WorldGenUtrechtiaShoot UTRECHTIA_SHOOT_GENERATOR = new WorldGenUtrechtiaShoot();
		protected static final WorldGenThucydia THUCYDIA_GENERATOR = new WorldGenThucydia();
		protected static final WorldGenOrtiseia ORTISEIA_GENERATOR = new WorldGenOrtiseia();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		{
			return WALCHIA_TREE;
		}

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ICE)) {
				{
					int i = rand.nextInt(192);

					for (int j = 0; j < i; ++j)
					{
						int k = rand.nextInt(16) + 8;
						int l = rand.nextInt(16) + 8;
						BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
						SNOW_GENERATOR.generate(worldIn, rand, blockpos, 120);
					}
				}
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 8; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					BURIADIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 85, 120);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 8; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					UTRECHTIA_SHOOT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 65, 96);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 8; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					THUCYDIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 95, 115);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			for (int i = 0; i < 8; ++i)
			{
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
				ORTISEIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 105, 130);
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			for (int i = 0; i < 1; ++i) //Very rarely up high
			{
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
				ORTISEIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 131, 250);
			}

			super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypePermian getBiomeType() {
			return EnumBiomeTypePermian.Highlands;
		}

	}
}
