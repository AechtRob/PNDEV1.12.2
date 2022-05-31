
package net.lepidodendron.world.biome.carboniferous;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCoarseSandyDirt;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
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
public class BiomeCarboniferousBeach extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:carboniferous_beach")
	public static final BiomeGenCustom biome = null;
	public BiomeCarboniferousBeach(ElementsLepidodendronMod instance) {
		super(instance, 1591);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.BEACH);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SWAMP);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.LUSH);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SANDY);
	}

	static class BiomeGenCustom extends BiomeCarboniferous {
		public BiomeGenCustom() {
			super(new BiomeProperties("Carboniferous Beach").setRainfall(0.5F).setBaseHeight(0.0F).setHeightVariation(0.025F).setWaterColor(13038245));
			setRegistryName("carboniferous_beach");
			this.topBlock = BlockCoarseSandyDirt.block.getDefaultState();
			this.fillerBlock = BlockCoarseSandyDirt.block.getDefaultState();
			decorator.treesPerChunk = 1;
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

		protected static final WorldGenCordaites CORDAITES = new WorldGenCordaites(false);
		protected static final WorldGenReef REEF_GENERATOR = new WorldGenReef();
		protected static final WorldGenGravelPatch CLAY_PATCH_GENERATOR = new WorldGenGravelPatch(Blocks.CLAY, 6);
		protected static final WorldGenCoarseDirt TOPSOIL_GENERATOR = new WorldGenCoarseDirt();
		protected static final WorldGenPrehistoricGroundCoverLush GROUNDCOVER_GENERATOR = new WorldGenPrehistoricGroundCoverLush();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	    	return CORDAITES;
	    }

		//public Biome.TempCategory getTempCategory()
	    //{
	    //    return Biome.TempCategory.OCEAN;
	   // }

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			{
				for (int j1 = 0; j1 < 6; ++j1)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					this.CLAY_PATCH_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 12; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					TOPSOIL_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 24; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					GROUNDCOVER_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

	        super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypeCarboniferous getBiomeType() {
			return EnumBiomeTypeCarboniferous.Ocean;
		}

	}
}
