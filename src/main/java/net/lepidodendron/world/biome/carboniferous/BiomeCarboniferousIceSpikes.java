
package net.lepidodendron.world.biome.carboniferous;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.world.gen.WorldGenIceOnSea;
import net.lepidodendron.world.gen.WorldGenLepidodendronTree;
import net.lepidodendron.world.gen.WorldGenSnow;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenIceSpike;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomeCarboniferousIceSpikes extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:carboniferous_polar_desert_spikes")
	public static final BiomeGenCustom biome = null;
	public BiomeCarboniferousIceSpikes(ElementsLepidodendronMod instance) {
		super(instance, 1591);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.WASTELAND);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.COLD);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.PLAINS);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SNOWY);
	}

	static class BiomeGenCustom extends BiomeCarboniferous {
		public BiomeGenCustom() {
			super(new BiomeProperties("Carboniferous Polar Desert Ice Spikes").setRainfall(0.1F).setBaseHeight(0.12F).setHeightVariation(0.06F).setTemperature(-2.0F).setSnowEnabled());
			setRegistryName("carboniferous_polar_desert_spikes");
			topBlock = Blocks.SNOW.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			decorator.clayPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		@SideOnly(Side.CLIENT)
		public int getFoliageColorAtPos(BlockPos pos)
		{
			return -9470416;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public int getGrassColorAtPos(BlockPos pos)
		{
			return -9470416;
		}

		@Override
		public int getModdedBiomeGrassColor(int original)
		{
			return -9470416;
		}

		@Override
		public int getModdedBiomeFoliageColor(int original)
		{
			return -9470416;
		}

		protected static final WorldGenLepidodendronTree LEPIDODENDRON_TREE = new WorldGenLepidodendronTree(false);
		private final WorldGenIceSpike iceSpike = new WorldGenIceSpike();
		private final WorldGenIcePath icePatch = new WorldGenIcePath(4);
		protected static final WorldGenSnow SNOW_GENERATOR = new WorldGenSnow();
		protected static final WorldGenIceOnSea ICE_GENERATOR = new WorldGenIceOnSea();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	    	return LEPIDODENDRON_TREE;
	    }


		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			for (int i = 0; i < 3; ++i)
			{
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				this.iceSpike.generate(worldIn, rand, worldIn.getHeight(pos.add(j, 0, k)));
			}

			for (int l = 0; l < 2; ++l)
			{
				int i1 = rand.nextInt(16) + 8;
				int j1 = rand.nextInt(16) + 8;
				this.icePatch.generate(worldIn, rand, worldIn.getHeight(pos.add(i1, 0, j1)));
			}

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ICE)) {
				{
					int i = rand.nextInt(24);

					for (int j = 0; j < i; ++j) {
						int k = rand.nextInt(16) + 8;
						int l = rand.nextInt(16) + 8;
						BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
						if (worldIn.getBlockState(blockpos.down()).getMaterial() != Material.WATER) {ICE_GENERATOR.generate(worldIn, rand, blockpos,0);}
					}

					i = rand.nextInt(32);

					for (int j = 0; j < i; ++j)
					{
						int k = rand.nextInt(16) + 8;
						int l = rand.nextInt(16) + 8;
						BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
						SNOW_GENERATOR.generate(worldIn, rand, blockpos, 0);
					}
				}
			}

	        super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypeCarboniferous getBiomeType() {
			return EnumBiomeTypeCarboniferous.Ice;
		}

	}
}
