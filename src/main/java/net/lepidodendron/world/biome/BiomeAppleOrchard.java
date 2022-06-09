
package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.world.gen.WorldGenAppleTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomeAppleOrchard extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:appleorchard")
	public static final BiomeGenCustom biome = null;
	public BiomeAppleOrchard(ElementsLepidodendronMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 2));
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.FOREST);
	}

	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Apple Orchard").setRainfall(0.5F).setBaseHeight(0.11F).setHeightVariation(0.0F).setTemperature(1F));
			setRegistryName("appleorchard");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 16;
			decorator.grassPerChunk = 6;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 1;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 8;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return new WorldGenAppleTree(false);
		}
	}
}
