
package net.lepidodendron.world.biome.permian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCordaitesLog;
import net.lepidodendron.block.BlockPrehistoricGroundBasic;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.gen.*;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomePermianLowlandFloodplain extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:permian_lowlands_floodplain")
	public static final BiomeGenCustom biome = null;
	public BiomePermianLowlandFloodplain(ElementsLepidodendronMod instance) {
		super(instance, 1589);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.WET);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.PLAINS);
	}

	static class BiomeGenCustom extends BiomePermian {
		public BiomeGenCustom() {
			super(new BiomeProperties("Permian Lowland Floodplain").setBaseHeight(-0.120F).setHeightVariation(0.110F).setTemperature(0.8F).setRainfall(0.4F));
			setRegistryName("permian_lowlands_floodplain");
			topBlock = BlockPrehistoricGroundBasic.block.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(1);
			decorator.treesPerChunk = 1;
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

		protected static final WorldGenPodozamitesTree PODOZAMITES_TREE = new WorldGenPodozamitesTree(false);
		protected static final WorldGenCordaitesTree CORDAITES_TREE = new WorldGenCordaitesTree(false);
		protected static final WorldGenCordaites CORDAITES = new WorldGenCordaites(false);
		protected static final WorldGenZygopterisTree ZYGOPTERIS_TREE = new WorldGenZygopterisTree(false);
		protected static final WorldGenNullTree NULL_TREE = new WorldGenNullTree(false);
		protected static final WorldGenGlenopteris GLENOPTERIS_GENERATOR = new WorldGenGlenopteris();
		protected static final WorldGenLushPrehistoricGround LUSH_GROUND_GENERATOR = new WorldGenLushPrehistoricGround();
		protected static final WorldGenPrehistoricGroundCover GROUNDCOVER_GENERATOR = new WorldGenPrehistoricGroundCover();
		protected static final WorldGenPrehistoricGroundCoverLush LUSH_GROUNDCOVER_GENERATOR = new WorldGenPrehistoricGroundCoverLush();
		protected static final WorldGenFern FERN_GENERATOR = new WorldGenFern();
		protected static final WorldGenSkaaripteris SKAARIPTERIS_GENERATOR = new WorldGenSkaaripteris();
		protected static final WorldGenFieldHorsetail FIELD_HORSETAIL_GENERATOR = new WorldGenFieldHorsetail();
		protected static final WorldGenScolecopteris SCOLECOPTERIS_GENERATOR = new WorldGenScolecopteris();
		protected static final WorldGenIsoetes ISOETES_GENERATOR = new WorldGenIsoetes();
		protected static final WorldGenBjuvia BJUVIA_GENERATOR = new WorldGenBjuvia();
		protected static final WorldGenWaterSidePangaeanPrehistoricGround WATERSIDE_DIRT_GENERATOR = new WorldGenWaterSidePangaeanPrehistoricGround();
		protected static final WorldGenSandyDirt SANDY_DIRT_GENERATOR = new WorldGenSandyDirt();
		protected static final WorldGenLesleya LESLEYA_GENERATOR = new WorldGenLesleya();
		protected static final WorldGenPuddles PUDDLES_GENERATOR = new WorldGenPuddles();
		protected static final WorldGenWaterHorsetail WATER_HORSETAIL_GENERATOR = new WorldGenWaterHorsetail();
		protected static final WorldGenTreeLog CORDAITES_LOG_GENERATOR = new WorldGenTreeLog(BlockCordaitesLog.block);

		@Override
		@SideOnly(Side.CLIENT)
		public int getFoliageColorAtPos(BlockPos pos)
		{
			return -10842862 ;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public int getGrassColorAtPos(BlockPos pos)
		{
			return -10842862 ;
		}

		@Override
		public int getModdedBiomeGrassColor(int original)
		{
			return -10842862 ;
		}

		@Override
		public int getModdedBiomeFoliageColor(int original)
		{
			return -10842862 ;
		}

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		{
			if (rand.nextInt(6) != 0) {return NULL_TREE;}

			int selector = rand.nextInt(9);
			switch (selector) {
				case 0 :
					return ZYGOPTERIS_TREE;
				case 1 :
					return ZYGOPTERIS_TREE;
				case 2 :
					return CORDAITES_TREE;
				case 3 :
					return CORDAITES_TREE;
				case 4 :
					return PODOZAMITES_TREE;
				case 5 :
					return PODOZAMITES_TREE;
				case 6 :
					return PODOZAMITES_TREE;
				case 7 :
					return PODOZAMITES_TREE;
				case 8 :
					return PODOZAMITES_TREE;
			}
			return PODOZAMITES_TREE;
		}

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 32; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					LUSH_GROUND_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 256; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					WATERSIDE_DIRT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 132; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SANDY_DIRT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}


			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 6; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PUDDLES_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS)) {
				int i = rand.nextInt(2);

				for (int j = 0; j < i; ++j) {
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(16) + 8;
					BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
					if (Math.random() > 0.5) {
						CORDAITES_LOG_GENERATOR.generate(worldIn, rand, blockpos);
					}
				}
				i = rand.nextInt(2);

			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 18; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					CORDAITES.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 8; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SCOLECOPTERIS_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), false);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 48; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					FIELD_HORSETAIL_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 56; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					LESLEYA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), 60 , 255);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 48; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					GLENOPTERIS_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), false);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 1; ++i)
				{ //Rarer here!
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					BJUVIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k), false);
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 128; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					FERN_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 365; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SKAARIPTERIS_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 128; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					GROUNDCOVER_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 128; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					LUSH_GROUNDCOVER_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 64; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					ISOETES_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 64; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					WATER_HORSETAIL_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypePermian getBiomeType() {
			return EnumBiomeTypePermian.Lowlands;
		}

	}
}
