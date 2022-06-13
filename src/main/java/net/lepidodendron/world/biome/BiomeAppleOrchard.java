
package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.world.gen.WorldGenAppleTree;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 2));
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

		@Override
		public void decorate(World worldIn, Random rand, BlockPos pos)
		{
			int i = rand.nextInt(5) - 3;
			this.addDoublePlants(worldIn, rand, pos, i);
			super.decorate(worldIn, rand, pos);
		}

		public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
		{
			for (int i = 0; i < p_185378_4_; ++i)
			{
				int j = p_185378_2_.nextInt(3);

				if (j == 0)
				{
					DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
				}
				else if (j == 1)
				{
					DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
				}
				else if (j == 2)
				{
					DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
				}

				for (int k = 0; k < 5; ++k)
				{
					int l = p_185378_2_.nextInt(16) + 8;
					int i1 = p_185378_2_.nextInt(16) + 8;
					int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);

					if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
					{
						break;
					}
				}
			}
		}

	}
}
