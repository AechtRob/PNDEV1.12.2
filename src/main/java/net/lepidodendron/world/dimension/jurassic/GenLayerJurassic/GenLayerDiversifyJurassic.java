package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.jurassic.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyJurassic extends GenLayer {

    public Biome JURASSIC_FERN_PASTURE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_fern_pasture"));
    public int JURASSIC_FERN_PASTURE_ID =  Biome.getIdForBiome(JURASSIC_FERN_PASTURE);
    public Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);
    public Biome JURASSIC_FLOODPLAIN_FORESTED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain_forested"));
    public int JURASSIC_FLOODPLAIN_FORESTED_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN_FORESTED);
    public Biome JURASSIC_GINKGO_WOODLAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ginkgo_woodland"));
    public int JURASSIC_GINKGO_WOODLAND_ID =  Biome.getIdForBiome(JURASSIC_GINKGO_WOODLAND);
    public Biome JURASSIC_REDWOOD_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_redwood_forest"));
    public int JURASSIC_REDWOOD_FOREST_ID =  Biome.getIdForBiome(JURASSIC_REDWOOD_FOREST);
    public Biome JURASSIC_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain"));
    public int JURASSIC_FLOODPLAIN_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN);
    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);
    public Biome JURASSIC_ROUGH_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_rough_hills"));
    public int JURASSIC_ROUGH_HILLS_ID =  Biome.getIdForBiome(JURASSIC_ROUGH_HILLS);

    public Biome JURASSIC_TAIGA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga"));
    public int JURASSIC_TAIGA_ID =  Biome.getIdForBiome(JURASSIC_TAIGA);
    public Biome JURASSIC_TAIGA_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga_hills"));
    public int JURASSIC_TAIGA_HILLS_ID =  Biome.getIdForBiome(JURASSIC_TAIGA_HILLS);


    private final int PastureBiomes[] = new int[] {
        JURASSIC_FERN_PASTURE_ID
    };

    private final int TaigaBiomes[] = new int[] {
        JURASSIC_TAIGA_ID,
        JURASSIC_TAIGA_ID,
        JURASSIC_TAIGA_ID,
        JURASSIC_TAIGA_ID,
        JURASSIC_TAIGA_HILLS_ID
    };


    private final int GarrigueBiomes[] = new int[] {
         JURASSIC_GARRIGUE_ID
    };
    private final int FloodplainBiomes[] = new int[] {
        JURASSIC_FLOODPLAIN_FORESTED_ID,
        JURASSIC_FLOODPLAIN_ID
    };
    private final int GinkgoBiomes[] = new int[] {
        JURASSIC_GINKGO_WOODLAND_ID
    };
    private final int RedwoodBiomes[] = new int[] {
        JURASSIC_REDWOOD_FOREST_ID
    };
    private final int MudflatsBiomes[] = new int[] {
        JURASSIC_MUDFLATS_ID
    };
    private final int HillsBiomes[] = new int[] {
        JURASSIC_ROUGH_HILLS_ID
    };

    public GenLayerDiversifyJurassic(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        return diversify(x, z, width, height);
    }

    private int[] diversify(int x, int z, int width, int height) {
        int input[] = this.parent.getInts(x, z, width, height);
        int output[] = IntCache.getIntCache(width * height);
        EnumBiomeTypePermian type;
        for (int zOut = 0; zOut < height; zOut++) {
            for (int xOut = 0; xOut < width; xOut++) {
                int i = xOut + zOut * width;
                int center = input[i];
                initChunkSeed(xOut + x, zOut + z);
                if (nextInt(2) == 0) {
                    if (Biome.getBiome(center) == BiomeJurassicFernPasture.biome)
                        output[i] = PastureBiomes[nextInt(PastureBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicGarrigue.biome)
                        output[i] = GarrigueBiomes[nextInt(GarrigueBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicFloodplainForested.biome)
                        output[i] = FloodplainBiomes[nextInt(FloodplainBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicGinkgoWoodland.biome)
                        output[i] = GinkgoBiomes[nextInt(GinkgoBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicRedwoodForest.biome)
                        output[i] = RedwoodBiomes[nextInt(RedwoodBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicRoughHills.biome)
                        output[i] = HillsBiomes[nextInt(HillsBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeJurassicSouthernTaiga.biome
                        || Biome.getBiome(center) == BiomeJurassicSouthernTaigaHills.biome)
                        output[i] = TaigaBiomes[nextInt(TaigaBiomes.length)];

                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}