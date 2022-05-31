package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicRiverBorder extends GenLayer
{

    public  Biome JURASSIC_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_river"));
    public  int JURASSIC_RIVER_ID =  Biome.getIdForBiome(JURASSIC_RIVER);

    public Biome JURASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean_shore"));
    public int JURASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(JURASSIC_OCEAN_SHORE);
    public Biome JURASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean"));
    public  int JURASSIC_OCEAN_ID =  Biome.getIdForBiome(JURASSIC_OCEAN);
    public  Biome JURASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach"));
    public  int JURASSIC_BEACH_ID =  Biome.getIdForBiome(JURASSIC_BEACH);
    public  Biome JURASSIC_BEACH_BLACK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach_black"));
    public  int JURASSIC_BEACH_BLACK_ID =  Biome.getIdForBiome(JURASSIC_BEACH_BLACK);

    public Biome JURASSIC_FERN_PASTURE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_fern_pasture"));
    public int JURASSIC_FERN_PASTURE_ID =  Biome.getIdForBiome(JURASSIC_FERN_PASTURE);
    public  Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public  int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);
    public  Biome JURASSIC_BOULDERS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_boulders"));
    public  int JURASSIC_BOULDERS_ID =  Biome.getIdForBiome(JURASSIC_BOULDERS);
    public  Biome JURASSIC_CYCAD_THICKETS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_cycad_thickets"));
    public  int JURASSIC_CYCAD_THICKETS_ID =  Biome.getIdForBiome(JURASSIC_CYCAD_THICKETS);
    public Biome JURASSIC_FLOODPLAIN_FORESTED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain_forested"));
    public int JURASSIC_FLOODPLAIN_FORESTED_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN_FORESTED);
    public Biome JURASSIC_GINKGO_WOODLAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ginkgo_woodland"));
    public int JURASSIC_GINKGO_WOODLAND_ID =  Biome.getIdForBiome(JURASSIC_GINKGO_WOODLAND);
    public Biome JURASSIC_REDWOOD_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_redwood_forest"));
    public int JURASSIC_REDWOOD_FOREST_ID =  Biome.getIdForBiome(JURASSIC_REDWOOD_FOREST);
    public Biome JURASSIC_MUDFLATS_HELPER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats_helper"));
    public int JURASSIC_MUDFLATS_HELPER_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS_HELPER);
    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);
    public Biome JURASSIC_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain"));
    public int JURASSIC_FLOODPLAIN_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN);
    public Biome JURASSIC_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue_copse"));
    public int JURASSIC_COPSE_ID =  Biome.getIdForBiome(JURASSIC_COPSE);

    public GenLayerJurassicRiverBorder(long seed, GenLayer genLayer)
    {
        super(seed);
        this.parent = genLayer;
    }

    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        int[] aint = this.parent.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
        int[] aint1 = IntCache.getIntCache(areaWidth * areaHeight);

        for (int i = 0; i < areaHeight; ++i)
        {
            for (int j = 0; j < areaWidth; ++j)
            {
                this.initChunkSeed((long)(j + areaX), (long)(i + areaY));
                int k = aint[j + 1 + (i + 1) * (areaWidth + 2)];
                //Biome biome = Biome.getBiome(k);

                //if (!hasNoBeach(k))
                //{
                if (isRedwood(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isRedwood(l1) && !isOceanOrBeach(l1))
                        || (!isRedwood(k2) && !isOceanOrBeach(k2))
                        || (!isRedwood(j3) && !isOceanOrBeach(j3))
                        || (!isRedwood(i4) && !isOceanOrBeach(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = JURASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isMudflats(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isMudflats(l1) && !isOceanOrBeach(l1))
                            || (!isMudflats(k2) && !isOceanOrBeach(k2))
                            || (!isMudflats(j3) && !isOceanOrBeach(j3))
                            || (!isMudflats(i4) && !isOceanOrBeach(i4))
                    ) {
                        aint1[j + i * areaWidth] = JURASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGarrigue(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isGarrigueBordered(l1) && !isOceanOrBeach(l1))
                            || (!isGarrigueBordered(k2) && !isOceanOrBeach(k2))
                            || (!isGarrigueBordered(j3) && !isOceanOrBeach(j3))
                            || (!isGarrigueBordered(i4) && !isOceanOrBeach(i4))
                    ) {
                        aint1[j + i * areaWidth] = JURASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else
                {
                    aint1[j + i * areaWidth] = k;
                }
            }
        }

        return aint1;
    }

    private boolean isOceanOrBeach(int biomeID) {
        if (biomeID == JURASSIC_OCEAN_ID || biomeID == JURASSIC_OCEAN_SHORE_ID || biomeID == JURASSIC_BEACH_ID || biomeID == JURASSIC_BEACH_BLACK_ID) {
            return true;
        }
        return false;
    }

    private boolean isRedwood(int biomeID) {
        if (biomeID == JURASSIC_REDWOOD_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isMudflats(int biomeID) {
        if (biomeID == JURASSIC_MUDFLATS_ID
            || biomeID == JURASSIC_MUDFLATS_HELPER_ID) {
            return true;
        }
        return false;
    }

    private boolean isGarrigue(int biomeID) {
        if (biomeID == JURASSIC_GARRIGUE_ID
            || biomeID == JURASSIC_COPSE_ID
            || biomeID == JURASSIC_CYCAD_THICKETS_ID
            || biomeID == JURASSIC_BOULDERS_ID) {
            return true;
        }
        return false;
    }

    private boolean isGarrigueBordered(int biomeID) {
        if (biomeID == JURASSIC_GARRIGUE_ID
            || biomeID == JURASSIC_CYCAD_THICKETS_ID
            || biomeID == JURASSIC_COPSE_ID
            || biomeID == JURASSIC_BOULDERS_ID
            || biomeID == JURASSIC_GINKGO_WOODLAND_ID
            || biomeID == JURASSIC_FLOODPLAIN_ID) {
            return true;
        }
        return false;
    }

}
