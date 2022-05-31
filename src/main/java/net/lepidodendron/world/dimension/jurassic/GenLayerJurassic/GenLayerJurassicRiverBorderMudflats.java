package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicRiverBorderMudflats extends GenLayer
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

    public Biome JURASSIC_MUDFLATS_HELPER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats_helper"));
    public int JURASSIC_MUDFLATS_HELPER_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS_HELPER);
    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);

    public GenLayerJurassicRiverBorderMudflats(long seed, GenLayer genLayer)
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
                if (isMudflats(k))
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
                if (isMudflatsHelper(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isMudflatsHelper(l1) && !isOceanOrBeach(l1))
                            || (!isMudflatsHelper(k2) && !isOceanOrBeach(k2))
                            || (!isMudflatsHelper(j3) && !isOceanOrBeach(j3))
                            || (!isMudflatsHelper(i4) && !isOceanOrBeach(i4))
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
        if (biomeID == JURASSIC_OCEAN_ID || biomeID == JURASSIC_OCEAN_SHORE_ID || biomeID == JURASSIC_BEACH_ID || biomeID == JURASSIC_BEACH_BLACK_ID || biomeID == JURASSIC_RIVER_ID) {
            return true;
        }
        return false;
    }

    private boolean isMudflats(int biomeID) {
        if (biomeID == JURASSIC_MUDFLATS_ID) {
            return true;
        }
        return false;
    }

    private boolean isMudflatsHelper(int biomeID) {
        if (biomeID == JURASSIC_MUDFLATS_HELPER_ID) {
            return true;
        }
        return false;
    }

}
