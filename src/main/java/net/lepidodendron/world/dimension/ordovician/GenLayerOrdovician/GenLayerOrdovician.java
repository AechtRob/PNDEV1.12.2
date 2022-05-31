package net.lepidodendron.world.dimension.ordovician.GenLayerOrdovician;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerOrdovician {

    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerOrdovicianBiomes(1L);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        biomes = new GenLayerZoom(1000L, biomes);
        //biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerSmooth(700L, biomes);
        //icebergs here:
        biomes = new GenLayerIcebergsOrdovician(666L, biomes);
        //lush patch here:
        biomes = new GenLayerZoom(1005L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);
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