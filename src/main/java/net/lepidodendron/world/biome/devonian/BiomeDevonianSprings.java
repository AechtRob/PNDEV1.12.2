
package net.lepidodendron.world.biome.devonian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockCoarseSiltyDirt;
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
public class BiomeDevonianSprings extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:devonian_springs")
	public static final BiomeGenCustom biome = null;
	public BiomeDevonianSprings(ElementsLepidodendronMod instance) {
		super(instance, 1591);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.WET);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.LUSH);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.HOT);
	}

	static class BiomeGenCustom extends BiomeDevonian {
		public BiomeGenCustom() {
			super(new BiomeProperties("Devonian Hot Springs").setRainfall(0.2F).setBaseHeight(-0.1F).setHeightVariation(0.08F).setTemperature(2.0F).setWaterColor(14745518));
			setRegistryName("devonian_springs");
			topBlock = BlockCoarseSiltyDirt.block.getDefaultState();
			fillerBlock = Blocks.CLAY.getDefaultState();
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		protected static final WorldGenArchaeopterisTree ARCHAEOPTERIS_TREE = new WorldGenArchaeopterisTree(false);
		protected static final WorldGenAsteroxylon ASTEROXYLON_GENERATOR = new WorldGenAsteroxylon();
		protected static final WorldGenPertica PERTICA_GENERATOR = new WorldGenPertica();
		protected static final WorldGenCoarseDirt TOPSOIL_GENERATOR = new WorldGenCoarseDirt();
		protected static final WorldGenBaragwanathia BARAGWANATHIA_GENERATOR = new WorldGenBaragwanathia();
		protected static final WorldGenRhynia RHYNIA_GENERATOR = new WorldGenRhynia();
		protected static final WorldGenPrehistoricGroundCoverSandy GROUNDCOVER_GENERATOR = new WorldGenPrehistoricGroundCoverSandy();
		protected static final WorldGenGravelPatch CLAY_PATCH_GENERATOR = new WorldGenGravelPatch(Blocks.CLAY, 3);
		protected static final WorldGenPuddles PUDDLES_GENERATOR = new WorldGenPuddles();
		protected static final WorldGenZosterophyllum ZOSTEROPHYLLUM_GENERATOR = new WorldGenZosterophyllum();
		protected static final WorldGenAdoketophyton ADOKETOPHYTON_GENERATOR = new WorldGenAdoketophyton();
		protected static final WorldGenCooksonia COOKSONIA_GENERATOR = new WorldGenCooksonia();
		protected static final WorldGenPrehistoricGroundSandy SANDY_GROUND_GENERATOR = new WorldGenPrehistoricGroundSandy();
		protected static final WorldGenSandyDirt SANDY_DIRT_GENERATOR = new WorldGenSandyDirt();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	        return ARCHAEOPTERIS_TREE;
	    }


		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			{
				for (int j1 = 0; j1 < 10; ++j1)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					this.CLAY_PATCH_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			}
	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
	        for (int i = 0; i < 7; ++i)
	        {
	            int j = rand.nextInt(16) + 8;
	            int k = rand.nextInt(16) + 8;
	            int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
	            TOPSOIL_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
	        }
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 75; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PUDDLES_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 18; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					SANDY_GROUND_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			for (int i = 0; i < 52; ++i)
			{
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
				SANDY_DIRT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
			}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 3; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PERTICA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 16; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					ASTEROXYLON_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 15; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					BARAGWANATHIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 15; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					RHYNIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 6; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					ADOKETOPHYTON_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 15; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					ZOSTEROPHYLLUM_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 20; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					COOKSONIA_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}

			super.decorate(worldIn, rand, pos);
	    }

	    @Override
		public EnumBiomeTypeDevonian getBiomeType() {
			return EnumBiomeTypeDevonian.Springs;
		}
	}

}
