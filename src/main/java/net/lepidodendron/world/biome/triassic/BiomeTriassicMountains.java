
package net.lepidodendron.world.biome.triassic;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumFLeaves;
import net.lepidodendron.block.BlockDicroidiumFLog;
import net.lepidodendron.block.BlockDicroidiumFSapling;
import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.lepidodendron.world.gen.*;
import net.minecraft.block.BlockBush;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomeTriassicMountains extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:triassic_mountains")
	public static final BiomeGenCustom biome = null;
	public BiomeTriassicMountains(ElementsLepidodendronMod instance) {
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

	static class BiomeGenCustom extends BiomeTriassic {
		public BiomeGenCustom() {
			super(new BiomeProperties("Triassic Mountains").setBaseHeight(3.5F).setHeightVariation(0.610F).setTemperature(-0.25F).setSnowEnabled());
			setRegistryName("triassic_mountains");
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

		protected static final WorldGenNullTree NULL_TREE = new WorldGenNullTree(false);
		protected static final WorldGenSnow SNOW_GENERATOR = new WorldGenSnow();
		protected static final WorldGenLeafblock LEAFBLOCK_GENERATOR = new WorldGenLeafblock();
		protected static final WorldGenQuadrocladus QUADROCLADUS_GENERATOR = new WorldGenQuadrocladus();
		protected static final WorldGenCoarseDirt COARSE_DIRT_GENERATOR = new WorldGenCoarseDirt();
		protected static final WorldGenLepidopteris LEPIDOPTERIS_GENERATOR = new WorldGenLepidopteris();
		protected static final WorldGenPleuromeia PLEUROMEIA_GENERATOR = new WorldGenPleuromeia();
		protected static final WorldGenSandyDirt SANDY_DIRT_GENERATOR = new WorldGenSandyDirt();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		{
			return NULL_TREE;
		}

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 24; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					COARSE_DIRT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 56; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SANDY_DIRT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ICE)) {
				{
					int i = rand.nextInt(124);

					for (int j = 0; j < i; ++j)
					{
						int k = rand.nextInt(16) + 8;
						int l = rand.nextInt(16) + 8;
						BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
						SNOW_GENERATOR.generate(worldIn, rand, blockpos, 130);
					}
				}
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 3; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					LEAFBLOCK_GENERATOR.generate((BlockBush) BlockDicroidiumFSapling.block, BlockDicroidiumFLeaves.block.getDefaultState(), BlockDicroidiumFLog.block.getDefaultState().withProperty(BlockDicroidiumFLog.BlockCustom.FACING, EnumFacing.NORTH), worldIn, rand, pos.add(j, l, k), 80, 150, true);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 8; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					QUADROCLADUS_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 60 , 255);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 3; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PLEUROMEIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), false);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 36; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					LEPIDOPTERIS_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), false);
				}

			super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypeTriassic getBiomeType() {
			return EnumBiomeTypeTriassic.Mountain;
		}

	}
}
