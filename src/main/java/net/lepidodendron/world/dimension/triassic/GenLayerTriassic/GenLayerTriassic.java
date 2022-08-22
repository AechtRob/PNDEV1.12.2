package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerTriassic {

    private static boolean shouldDraw = false;
    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerTriassicBiomes(1L);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        biomes = new GenLayerDiversifyTriassic(1000L, biomes);
        biomes = new GenLayerSmooth(500L, biomes); //new
        biomes = new GenLayerTriassicCanyons(405, biomes);
        biomes = new GenLayerTriassicDelta(406, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerDiversifyTriassic2(1001L, biomes);
        biomes = new GenLayerSmooth(501L, biomes); //new
        biomes = new GenLayerTriassicIslandsTrim(1100L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerDiversifyTriassic2(1001L, biomes);
        biomes = new GenLayerSmooth(502L, biomes); //new
        biomes = new GenLayerTriassicIslandsTrim(1110L, biomes);
        biomes = new GenLayerTriassicDeepOcean(1100L, biomes);
        biomes = new GenLayerTriassicShallowOcean(1300L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);
        biomes = new GenLayerSmooth(700L, biomes);
        biomes = new GenLayerDiversifyTriassic4(1975L, biomes);
        biomes = new GenLayerSmooth(701L, biomes);
        biomes = new GenLayerTriassicIslandsTrim(1115L, biomes);
        biomes = new GenLayerDiversifyTriassicShallowOcean(1000L, biomes);
        biomes = new GenLayerDiversifyTriassic3(1975L, biomes);
        biomes = new GenLayerZoom(1004L, biomes);
        biomes = new GenLayerTriassicIslandsTrim(1116L, biomes);
        biomes = new GenLayerTriassicIslandSeparate(1002L, biomes);
        biomes = new GenLayerDiversifyTriassicShallowOcean(1001L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);
        biomes = new GenLayerTriassicBeach(1050L, biomes);
        biomes = new GenLayerTriassicIslandsTrim(1117L, biomes);
        biomes = new GenLayerTriassicIslandSeparate(1003L, biomes);
        biomes = new GenLayerSmooth(705L, biomes);
        biomes = new GenLayerInitRiverDeltaTriassic(1085L, biomes);
        biomes = new GenLayerFuzzyZoom(1001L, biomes);
        biomes = new GenLayerJoinRiver1Triassic(1086L, biomes);
        biomes = new GenLayerInitRiverCanyonsTriassic(1085L, biomes);
        biomes = new GenLayerInitRiverDeltaTriassic(1087L, biomes);
        biomes = new GenLayerJoinRiver1Triassic(1088L, biomes);
        biomes = new GenLayerJoinRiver2Triassic(1195L, biomes);
        biomes = new GenLayerTriassicRiverBorder(325L, biomes);
        biomes = new GenLayerSmooth(706L, biomes);
        biomes = new GenLayerRiverbanksTriassic(1095L, biomes);
        biomes = new GenLayerDiversifyRiverbankTriassic(666, biomes);
        biomes = new GenLayerFuzzyZoom(1002L, biomes);
        biomes = new GenLayerTriassicBlackBeach(1025L, biomes);
        biomes = new GenLayerTriassicIslandSeparate(1004L, biomes);
        biomes = new GenLayerTriassicRiverBorder(326L, biomes);
        biomes = new GenLayerSmooth(719L, biomes); //ADDED THIS
        biomes = new GenLayerRiverbankWidenTriassic(1095L, biomes);
        biomes = new GenLayerRiverbankWidenTriassic(1096L, biomes);
        biomes = new GenLayerRiverbankWidenTriassic(1097L, biomes);
        biomes = new GenLayerDiversifyRiverbankTriassic(667, biomes);
        biomes = new GenLayerRiverbankRemoveCanyonsTriassic(1001L, biomes);
        biomes = new GenLayerTriassicIslandSeparate(1005L, biomes);
        biomes = new GenLayerZoom(1006L, biomes);
        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);
        return (new GenLayer[] { biomes, genlayervoronoizoom });
    }

}