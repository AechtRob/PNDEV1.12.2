
package net.lepidodendron.world.biome.jurassic;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.world.gen.WorldGenNullTree;
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
public class BiomeJurassicSouthernTaigaBasalt extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:jurassic_southern_taiga_basalt")
	public static final BiomeGenCustom biome = null;
	public BiomeJurassicSouthernTaigaBasalt(ElementsLepidodendronMod instance) {
		super(instance, 1589);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.HILLS);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.DRY);
	}

	static class BiomeGenCustom extends BiomeJurassic {
		public BiomeGenCustom() {
			super(new BiomeProperties("Jurassic Southern Taiga").setBaseHeight(-0.15F).setHeightVariation(0.05F).setTemperature(0.225F).setRainfall(0.8F));
			setRegistryName("jurassic_southern_taiga_basalt");
			topBlock = BlockLavaRock.block.getDefaultState();
			fillerBlock = BlockLavaRock.block.getDefaultState();
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 10;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		@SideOnly(Side.CLIENT)
		public int getFoliageColorAtPos(BlockPos pos)
		{
			return -9791400  ;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public int getGrassColorAtPos(BlockPos pos)
		{
			return -9791400 ;
		}

		@Override
		public int getModdedBiomeGrassColor(int original)
		{
			return -9791400 ;
		}

		@Override
		public int getModdedBiomeFoliageColor(int original)
		{
			return -9791400 ;
		}

		protected static final WorldGenNullTree NULL_TREE = new WorldGenNullTree(false);

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		{
			return NULL_TREE;
		}

		@Override
		public void decorate(World worldIn, Random rand, BlockPos pos)
		{



			super.decorate(worldIn, rand, pos);
		}

		@Override
		public EnumBiomeTypeJurassic getBiomeType() {
			return EnumBiomeTypeJurassic.Taiga;
		}

	}

}
