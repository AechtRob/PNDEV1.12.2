package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerJurassic {

    private static boolean shouldDraw = false;
    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerJurassicBiomes(1L);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        biomes = new GenLayerDiversifyJurassic(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerDiversifyJurassic2(1001L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1133L, biomes);
        biomes = new GenLayerDiversifyJurassicSandbanks(50L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerDiversifyJurassic2(1002L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1134L, biomes);
        biomes = new GenLayerJurassicDeepOcean(1100L, biomes);
        biomes = new GenLayerJurassicShallowOcean(1300L, biomes);
        biomes = new GenLayerJurassicOutcropHighlands(1075L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);
        biomes = new GenLayerDiversifyJurassicSandbanks2(1333L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1135L, biomes);
        biomes = new GenLayerSmooth(700L, biomes);
        biomes = new GenLayerSmooth(701L, biomes);
        biomes = new GenLayerJurassicOutcrop(1088L, biomes);
        biomes = new GenLayerZoom(1004L, biomes);
        biomes = new GenLayerJurassicOutcropBlend(1088L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerJurassicBoulders(1066L, biomes);
        biomes = new GenLayerDiversifyJurassic3(1001L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);
        biomes = new GenLayerJurassicBoulders(1067L, biomes);
        biomes = new GenLayerJurassicBeach(1050L, biomes);
        biomes = new GenLayerJurassicOutcropBlend2(333L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1136L, biomes);
        biomes = new GenLayerSmooth(705L, biomes);
        biomes = new GenLayerFuzzyZoom(1001L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1137L, biomes);
        biomes = new GenLayerSmooth(706L, biomes);
        biomes = new GenLayerJurassicRiverBorder(325L, biomes);
        biomes = new GenLayerJurassicRiverBanks(225L, biomes);
        biomes = new GenLayerJoinRiversJurassic(150L, biomes);
        biomes = new GenLayerJoinRiversJurassic(151L, biomes);
        biomes = new GenLayerJoinRiversJurassic(152L, biomes);
        biomes = new GenLayerJurassicTaigaBasalt(1975L, biomes);
        biomes = new GenLayerFuzzyZoom(1002L, biomes);
        biomes = new GenLayerDiversifyJurassicMudflats(1138L, biomes);
        biomes = new GenLayerJurassicRiverBorder(326L, biomes);
        biomes = new GenLayerJurassicRiverBorderMudflats(326L, biomes);
        biomes = new GenLayerJurassicRiverBanks(226L, biomes);
        biomes = new GenLayerSmooth(719L, biomes); //ADDED THIS
        biomes = new GenLayerJoinRiversJurassic(153L, biomes);
        biomes = new GenLayerJoinRiversJurassic(154L, biomes);
        biomes = new GenLayerJoinRiversJurassic(155L, biomes);
        biomes = new GenLayerJoinRiversJurassic(156L, biomes);
        biomes = new GenLayerJurassicRiverBanks(227L, biomes);
        biomes = new GenLayerJurassicTaigaBasalt(1976L, biomes);
        biomes = new GenLayerZoom(1006L, biomes);
        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);
        return (new GenLayer[] { biomes, genlayervoronoizoom });
    }

}