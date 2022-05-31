
package net.lepidodendron.world.biome.cambrian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.world.gen.*;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomeCambrianSea extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:cambrian_sea")
	public static final BiomeGenCustom biome = null;
	public BiomeCambrianSea(ElementsLepidodendronMod instance) {
		super(instance, 1591);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.OCEAN);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.WATER);
	}

	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new BiomeProperties("Cambrian Ocean").setRainfall(0.9F).setBaseHeight(-1.5F).setHeightVariation(0.2F).setTemperature(0.9F));
			setRegistryName("cambrian_sea");
			topBlock = Blocks.STONE.getStateFromMeta(0);
			fillerBlock = BlockLavaRock.block.getDefaultState();
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 300;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}
		
		protected static final WorldGenArchaeopterisTree ARCHAEOPTERIS_TREE = new WorldGenArchaeopterisTree(false);
		protected static final WorldGenIgneous IGNEOUS_GENERATOR = new WorldGenIgneous();
		protected static final WorldGenToxicMud TOXIC_MUD_GENERATOR = new WorldGenToxicMud();
		protected static final WorldGenStromatoliteReefCambrian REEF_GENERATOR = new WorldGenStromatoliteReefCambrian();
		protected static final WorldGenThrombolite THROMBOLITE_GENERATOR = new WorldGenThrombolite();
		protected static final WorldGenReefCambrian REEF_GENERATOR_CAMBRIAN = new WorldGenReefCambrian();
		protected static final WorldGenBacterialCrust CRUST_GENERATOR = new WorldGenBacterialCrust();
		protected static final WorldGenChaunograptus CHAUNOGRAPTUS_GENERATOR = new WorldGenChaunograptus();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	        return null;
	    }

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			//Spawns forcefully borrow the bush event - why not?
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DEAD_BUSH))
			{
				String[] MobString = new String[0];
				if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
					MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsPF);
				}
				if (LepidodendronConfig.doSpawnsFossilsArcheology) {
					MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsFA);
				}
				if (LepidodendronConfig.doSpawnsReborn) {
					MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsReborn);
				}
				//ChunkGenSpawner.executeProcedure(false, MobString, worldIn, topBlock, pos, rand);
			}

			if (Math.random() > 0.8 && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK))
			{
				//int i = rand.nextInt(2);
				//for (int j = 0; j < i; ++j)
				//{
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(16) + 8;
					BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
					THROMBOLITE_GENERATOR.generate(worldIn, rand, blockpos);
				//}
			}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK))
			{
				int i = rand.nextInt(2);
				for (int j = 0; j < i; ++j)
				{
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(16) + 8;
					BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
					IGNEOUS_GENERATOR.generate(worldIn, rand, blockpos);
				}
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 30; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					CRUST_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 128; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					TOXIC_MUD_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), DecorateBiomeEvent.Decorate.EventType.CLAY)) {
				for (int i = 0; i < 2; ++i) {
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					BlockPos pos1 = pos.add(j, l, k);
					if (
							(pos1.getY() < worldIn.getSeaLevel())
					) {
						REEF_GENERATOR.generate(worldIn, rand, pos1, 6);
					}
				}
			}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK))
			for (int i = 0; i < 8; ++i)
			{
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
				BlockPos pos1 = pos.add(j, l, k);
				if (
						(pos1.getY() < worldIn.getSeaLevel() - 5)
								&& (worldIn.getBlockState(pos1).getMaterial() == Material.WATER)
								&& (worldIn.getBlockState(pos1.up()).getMaterial() == Material.WATER)
								&& (worldIn.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
				) {
					REEF_GENERATOR_CAMBRIAN.generate(worldIn, rand, pos1, 8);
				}
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int ii = 0; ii < 48; ++ii)
				{
					int i = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int j = rand.nextInt(worldIn.getSeaLevel() + 25);
					CHAUNOGRAPTUS_GENERATOR.generate(worldIn, rand, pos.add(i, j, k));
				}

			super.decorate(worldIn, rand, pos);
	    }
	}
}
