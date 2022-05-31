
package net.lepidodendron.world.biome.devonian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.gen.*;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomeDevonianSpikes extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:devonian_spikes")
	public static final BiomeGenCustom biome = null;
	public BiomeDevonianSpikes(ElementsLepidodendronMod instance) {
		super(instance, 1589);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.MOUNTAIN);
	}

	static class BiomeGenCustom extends BiomeDevonian {
		public BiomeGenCustom() {
			super(new BiomeProperties("Devonian Plateau").setRainfall(0.5F).setBaseHeight(7.5F).setHeightVariation(0.005F).setTemperature(0.2F).setRainDisabled().setWaterColor(14745518));
			setRegistryName("devonian_spikes");
			topBlock = Blocks.STONE.getStateFromMeta(0);
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 20;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		protected static final WorldGenArchaeopterisTree ARCHAEOPTERIS_TREE = new WorldGenArchaeopterisTree(false);
		protected static final WorldGenPuddles PUDDLES_GENERATOR = new WorldGenPuddles();
		protected static final WorldGenPrototaxites PROTOTAXITES_GENERATOR = new WorldGenPrototaxites();
		protected static final WorldGenNematophyta NEMATOPHYTA_GENERATOR = new WorldGenNematophyta();
		protected static final WorldGenAncientMossGround ANCIENT_MOSS_GENERATOR_GROUND = new WorldGenAncientMossGround();
		protected static final WorldGenSelaginella SELAGINELLA_GENERATOR = new WorldGenSelaginella();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	        return ARCHAEOPTERIS_TREE;
	    }

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			//No mob spawns here!

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 156; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PUDDLES_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 120; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					if (pos.getY() + l > 100) {PROTOTAXITES_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));}
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 18; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					NEMATOPHYTA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 128; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					ANCIENT_MOSS_GENERATOR_GROUND.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 92; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SELAGINELLA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypeDevonian getBiomeType() {
			return EnumBiomeTypeDevonian.Forest;
		}
	}

}
