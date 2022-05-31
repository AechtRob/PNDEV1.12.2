package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicRiverBanks extends GenLayer
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
    public Biome JURASSIC_CYCAD_THICKETS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_cycad_thickets"));
    public int JURASSIC_CYCAD_THICKETS_ID =  Biome.getIdForBiome(JURASSIC_CYCAD_THICKETS);
    public Biome JURASSIC_FLOODPLAIN_FORESTED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain_forested"));
    public int JURASSIC_FLOODPLAIN_FORESTED_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN_FORESTED);
    public Biome JURASSIC_GINKGO_WOODLAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ginkgo_woodland"));
    public int JURASSIC_GINKGO_WOODLAND_ID =  Biome.getIdForBiome(JURASSIC_GINKGO_WOODLAND);
    public Biome JURASSIC_REDWOOD_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_redwood_forest"));
    public int JURASSIC_REDWOOD_FOREST_ID =  Biome.getIdForBiome(JURASSIC_REDWOOD_FOREST);
    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);
    public Biome JURASSIC_MUDFLATS_HELPER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats_helper"));
    public int JURASSIC_MUDFLATS_HELPER_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS_HELPER);
    public  Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public  int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);

    public  Biome JURASSIC_RIVERBANK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_riverbank"));
    public  int JURASSIC_RIVERBANK_ID =  Biome.getIdForBiome(JURASSIC_RIVERBANK);

    public GenLayerJurassicRiverBanks(long seed, GenLayer genLayer)
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

                if (!isAlreadyWater(k) && !hasNoBanks(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isRiver(l1) || isRiver(k2) || isRiver(j3) || isRiver(i4))
                    {
                        aint1[j + i * areaWidth] = JURASSIC_RIVERBANK_ID;
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

    private boolean isAlreadyWater(int biomeID) {
        if (biomeID == JURASSIC_OCEAN_ID || biomeID == JURASSIC_OCEAN_SHORE_ID || biomeID == JURASSIC_BEACH_ID || biomeID == JURASSIC_BEACH_BLACK_ID || biomeID == JURASSIC_RIVER_ID) {
            return true;
        }
        return false;
    }

    private boolean isRiver(int biomeID) {
    if (biomeID == JURASSIC_RIVER_ID || biomeID == JURASSIC_RIVERBANK_ID) {
        return true;
    }
    return false;
}

    private boolean hasNoBanks(int biomeID) {
        if (biomeID == JURASSIC_REDWOOD_FOREST_ID || biomeID == JURASSIC_MUDFLATS_ID
            || biomeID == JURASSIC_MUDFLATS_HELPER_ID
            || biomeID == JURASSIC_GARRIGUE_ID) {
            return true;
        }
        return false;
    }

}
