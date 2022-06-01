package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerCarboniferous {

    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerCarboniferousBiomes(1L);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        biomes = new GenLayerDiversifyCarboniferous(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerDiversifyCarboniferous(1001L, biomes);
        biomes = new GenLayerCarboniferousIceEdgeSea(3L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerCarboniferousDeepOcean(1100L, biomes);
        biomes = new GenLayerCarboniferousShallowOcean(1300L, biomes);
        biomes = new GenLayerDiversifyCarboniferousBurnt(666L, biomes);
        biomes = new GenLayerDiversifyCarboniferousBurntMarsh(666L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);
        biomes = new GenLayerCarboniferousIceEdge(2L, biomes);
        biomes = new GenLayerCarboniferousHillsEdge(27L, biomes);
        biomes = new GenLayerCarboniferousHillsCentre(37L, biomes);
        biomes = new GenLayerSmooth(700L, biomes);
        biomes = new GenLayerZoom(1005L, biomes);
        biomes = new GenLayerCarboniferousHillsCentreExpand(77L, biomes);
        biomes = new GenLayerCarboniferousIceSpikes(1000L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);
        biomes = new GenLayerCarboniferousBeach(1050L, biomes);
        biomes = new GenLayerDiversifyCarboniferousBurnt(667L, biomes);
        biomes = new GenLayerDiversifyCarboniferousBurntMarsh(667L, biomes);
        biomes = new GenLayerCarboniferousCliff(1080L, biomes);
        biomes = new GenLayerSmooth(705L, biomes);
        biomes = new GenLayerFuzzyZoom(1001L, biomes);
        biomes = new GenLayerSmooth(706L, biomes);
        biomes = new GenLayerFuzzyZoom(1002L, biomes);
        biomes = new GenLayerZoom(1006L, biomes);
        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);
        return (new GenLayer[] { biomes, genlayervoronoizoom });
    }

}