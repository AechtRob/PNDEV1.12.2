package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerDevonian {

    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerDevonianBiomes(1L);
        biomes = new GenLayerDevonianAddMountains(1000L, biomes);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        //biomes = new GenLayerDevonianAddMountains(1000L, biomes);
        biomes = new GenLayerDiversifyDevonian(1000L, biomes);
        biomes = new GenLayerDevonianDeepOcean(1100L, biomes);
        biomes = new GenLayerDevonianShallowOcean(1300L, biomes);
        biomes = new GenLayerDevonianDeadReefs(387L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerDiversifyDevonian(1001L, biomes);
        //biomes = new GenLayerDevonianDeadReefs(387L, biomes);
        biomes = new GenLayerSpringsDevonian(955L, biomes);
        biomes = new GenLayerFuzzyZoom(1009L, biomes);
        biomes = new GenLayerSpikesDevonian(950L, biomes);
        biomes = new GenLayerSinkholesDevonian(850L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);
        biomes = new GenLayerDevonianBeach(1050L, biomes);
        biomes = new GenLayerSmooth(705L, biomes);
        biomes = new GenLayerFuzzyZoom(1001L, biomes);
        biomes = new GenLayerSmooth(706L, biomes);
        //biomes = new GenLayerBlueHoleDevonian(1001L, biomes);
        biomes = new GenLayerFuzzyZoom(1002L, biomes);
        //biomes = new GenLayerBlueHoleDevonian(1001L, biomes);
        biomes = new GenLayerSinkholeTransition(1001L, biomes);
        biomes = new GenLayerZoom(1006L, biomes);
        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);
        return (new GenLayer[] { biomes, genlayervoronoizoom });
    }

}