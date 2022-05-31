package net.lepidodendron.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianBeach extends GenLayer
{

    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public  int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public  Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public  int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public  Biome PERMIAN_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach"));
    public  int PERMIAN_BEACH_ID =  Biome.getIdForBiome(PERMIAN_BEACH);
    public  Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest"));
    public  int PERMIAN_GLOSSOPTERIS_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public  Biome PERMIAN_GLOSSOPTERIS_LIGHT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_light"));
    public  int PERMIAN_GLOSSOPTERIS_LIGHT_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LIGHT);
    public  Biome PERMIAN_GLOSSOPTERIS_WET = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_ocean"));
    public  int PERMIAN_GLOSSOPTERIS_WET_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_WET);
    public  Biome PERMIAN_WETLANDS_UNWOODED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public  int PERMIAN_WETLANDS_UNWOODED_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_UNWOODED);
    public  Biome PERMIAN_LOWLANDS_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain"));
    public  int PERMIAN_LOWLANDS_FLOODPLAIN_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FLOODPLAIN);
    public  Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public  int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public  Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public  int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);
    
    public GenLayerPermianBeach(long seed, GenLayer genLayer)
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

                if (!hasNoBeach(k))
                {
                    if (!isOcean(k))
                    {
                        int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                        int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                        int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                        int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                        if (!isOcean(l1) && !isOcean(k2) && !isOcean(j3) && !isOcean(i4))
                        {
                            aint1[j + i * areaWidth] = k;
                        }
                        else
                        {
                            aint1[j + i * areaWidth] = PERMIAN_BEACH_ID;
                        }
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

    private boolean isOcean(int biomeID) {
        if (biomeID == PERMIAN_OCEAN_ID || biomeID == PERMIAN_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

    private boolean hasNoBeach(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LIGHT_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_WET_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
            || biomeID == PERMIAN_WETLANDS_UNWOODED_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_FLOODBASALT_ID) {
            return true;
        }
        return false;
    }

}
