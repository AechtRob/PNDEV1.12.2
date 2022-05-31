package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicBeach extends GenLayer
{

    public Biome JURASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean"));
    public  int JURASSIC_OCEAN_ID =  Biome.getIdForBiome(JURASSIC_OCEAN);
    public  Biome JURASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean_shore"));
    public  int JURASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(JURASSIC_OCEAN_SHORE);
    public  Biome JURASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach"));
    public  int JURASSIC_BEACH_ID =  Biome.getIdForBiome(JURASSIC_BEACH);

    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);
    public Biome JURASSIC_MUDFLATS_HELPER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats_helper"));
    public int JURASSIC_MUDFLATS_HELPER_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS_HELPER);
    public Biome JURASSIC_REDWOOD_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_redwood_forest"));
    public int JURASSIC_REDWOOD_FOREST_ID =  Biome.getIdForBiome(JURASSIC_REDWOOD_FOREST);
    public  Biome JURASSIC_SANDBANKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_sandbanks"));
    public  int JURASSIC_SANDBANKS_ID =  Biome.getIdForBiome(JURASSIC_SANDBANKS);

    public  Biome JURASSIC_TAIGA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga"));
    public  int JURASSIC_TAIGA_ID =  Biome.getIdForBiome(JURASSIC_TAIGA);
    public  Biome JURASSIC_TAIGA_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga_hills"));
    public  int JURASSIC_TAIGA_HILLS_ID =  Biome.getIdForBiome(JURASSIC_TAIGA_HILLS);
    public  Biome JURASSIC_TAIGA_BASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga_basalt"));
    public  int JURASSIC_TAIGA_BASALT_ID =  Biome.getIdForBiome(JURASSIC_TAIGA_BASALT);
    public  Biome JURASSIC_BLACK_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach_black"));
    public  int JURASSIC_BLACK_BEACH_ID =  Biome.getIdForBiome(JURASSIC_BLACK_BEACH);

    public GenLayerJurassicBeach(long seed, GenLayer genLayer)
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
                            if (hasBlackBeach(k)) {
                                aint1[j + i * areaWidth] = JURASSIC_BLACK_BEACH_ID;
                            }
                            else {
                                aint1[j + i * areaWidth] = JURASSIC_BEACH_ID;
                            }
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
        if (biomeID == JURASSIC_OCEAN_ID || biomeID == JURASSIC_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

    private boolean hasBlackBeach(int biomeID) {
        if (biomeID == JURASSIC_TAIGA_ID || biomeID == JURASSIC_TAIGA_HILLS_ID
            || biomeID == JURASSIC_TAIGA_BASALT_ID) {
            return true;
        }
        return false;
    }

    private boolean hasNoBeach(int biomeID) {
        if (biomeID == JURASSIC_MUDFLATS_ID
            ||biomeID == JURASSIC_MUDFLATS_HELPER_ID
            || biomeID == JURASSIC_REDWOOD_FOREST_ID
            || biomeID == JURASSIC_SANDBANKS_ID
        //    || biomeID == TRIASSIC_RIVERBANK_ID
        //    || biomeID == TRIASSIC_VOLCANIC_ISLANDS_ID
        //    || biomeID == TRIASSIC_LOWLANDS_FLOODPLAIN_ID
        //    || biomeID == TRIASSIC_WETLANDS_UNWOODED_ID
        //    || biomeID == TRIASSIC_MOUNTAINS_ID
        //    || biomeID == TRIASSIC_FLOODBASALT_ID
            ) {
            return true;
        }
        return false;
    }

}
