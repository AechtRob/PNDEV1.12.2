package net.lepidodendron.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianRiverBorder extends GenLayer
{

    public Biome PERMIAN_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_river"));
    public int PERMIAN_RIVER_ID = Biome.getIdForBiome(PERMIAN_RIVER);

    public Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public  int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public  Biome PERMIAN_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach"));
    public  int PERMIAN_BEACH_ID =  Biome.getIdForBiome(PERMIAN_BEACH);
    public  Biome PERMIAN_GLOSSOPTERIS_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_beach"));
    public  int PERMIAN_GLOSSOPTERIS_BEACH_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_BEACH);

    public  Biome PERMIAN_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert"));
    public  int PERMIAN_DESERT_ID =  Biome.getIdForBiome(PERMIAN_DESERT);

    public  Biome PERMIAN_ARIDLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands"));
    public  int PERMIAN_ARIDLANDS_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS);
    public  Biome PERMIAN_ARIDLANDS_LUSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands_lush"));
    public  int PERMIAN_ARIDLANDS_LUSH_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS_LUSH);
    public  Biome PERMIAN_ARIDLANDS_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_hills"));
    public  int PERMIAN_ARIDLANDS_HILLS_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS_HILLS);

    public  Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public  int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public  Biome PERMIAN_FLOODBASALT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt_edge"));
    public  int PERMIAN_FLOODBASALT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT_EDGE);

    public  Biome PERMIAN_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_highlands"));
    public  int PERMIAN_HIGHLANDS_ID =  Biome.getIdForBiome(PERMIAN_HIGHLANDS);
    public  Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public  int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);

    public  Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest"));
    public  int PERMIAN_GLOSSOPTERIS_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public  Biome PERMIAN_GLOSSOPTERIS_LAKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_ocean"));
    public  int PERMIAN_GLOSSOPTERIS_LAKES_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LAKES);
    public  Biome PERMIAN_GLOSSOPTERIS_LIGHT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_light"));
    public  int PERMIAN_GLOSSOPTERIS_LIGHT_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LIGHT);

    public  Biome PERMIAN_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands"));
    public  int PERMIAN_LOWLANDS_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS);
    public  Biome PERMIAN_LOWLANDS_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest"));
    public  int PERMIAN_LOWLANDS_FOREST_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FOREST);
    public  Biome PERMIAN_LOWLANDS_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain"));
    public  int PERMIAN_LOWLANDS_FLOODPLAIN_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FLOODPLAIN);

    public  Biome PERMIAN_WETLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands"));
    public  int PERMIAN_WETLANDS_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS);
    public  Biome PERMIAN_WETLANDS_UNWOODED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public  int PERMIAN_WETLANDS_UNWOODED_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_UNWOODED);

    public GenLayerPermianRiverBorder(long seed, GenLayer genLayer)
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

                if (isDesert(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isDesert(l1) && !isOceanOrBeach(l1) && !isExemptforDesert(l1))
                        || (!isDesert(k2) && !isOceanOrBeach(k2) && !isExemptforDesert(k2))
                        || (!isDesert(j3) && !isOceanOrBeach(j3) && !isExemptforDesert(j3))
                        || (!isDesert(i4) && !isOceanOrBeach(i4) && !isExemptforDesert(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGlossopteris(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isGlossopteris(l1) && !isOceanOrBeach(l1) && !isExemptforGlossopteris(l1))
                        || (!isGlossopteris(k2) && !isOceanOrBeach(k2) && !isExemptforGlossopteris(k2))
                        || (!isGlossopteris(j3) && !isOceanOrBeach(j3) && !isExemptforGlossopteris(j3))
                        || (!isGlossopteris(i4) && !isOceanOrBeach(i4) && !isExemptforGlossopteris(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isArid(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isArid(l1) && !isOceanOrBeach(l1) && !isExemptforArid(l1))
                        || (!isArid(k2) && !isOceanOrBeach(k2) && !isExemptforArid(k2))
                        || (!isArid(j3) && !isOceanOrBeach(j3) && !isExemptforArid(j3))
                        || (!isArid(i4) && !isOceanOrBeach(i4) && !isExemptforArid(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isWetlands(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isWetlands(l1) && !isOceanOrBeach(l1) && !isExemptforWetlands(l1))
                            || (!isWetlands(k2) && !isOceanOrBeach(k2) && !isExemptforWetlands(k2))
                            || (!isWetlands(j3) && !isOceanOrBeach(j3) && !isExemptforWetlands(j3))
                            || (!isWetlands(i4) && !isOceanOrBeach(i4) && !isExemptforWetlands(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
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
        if (biomeID == PERMIAN_OCEAN_ID || biomeID == PERMIAN_OCEAN_SHORE_ID
            || biomeID == PERMIAN_BEACH_ID || biomeID == PERMIAN_GLOSSOPTERIS_BEACH_ID) {
            return true;
        }
        return false;
    }

    private boolean isDesert(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID) {
            return true;
        }
        return false;
    }

    private boolean isArid(int biomeID) {
        if (biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID) {
            return true;
        }
        return false;
    }

    private boolean isWetlands(int biomeID) {
    if (biomeID == PERMIAN_WETLANDS_ID
        || biomeID == PERMIAN_WETLANDS_UNWOODED_ID) {
        return true;
    }
    return false;
}

    private boolean isGlossopteris(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LIGHT_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforGlossopteris(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LIGHT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_LOWLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
            || biomeID == PERMIAN_LOWLANDS_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforDesert(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforArid(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
            || biomeID == PERMIAN_LOWLANDS_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforWetlands(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LIGHT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_LOWLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
            || biomeID == PERMIAN_LOWLANDS_FOREST_ID) {
            return true;
        }
        return false;
    }

}
