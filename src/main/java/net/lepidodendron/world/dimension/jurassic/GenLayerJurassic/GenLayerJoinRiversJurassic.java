package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJoinRiversJurassic extends GenLayer
{

    public Biome JURASSIC_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_river"));
    public int JURASSIC_RIVER_ID =  Biome.getIdForBiome(JURASSIC_RIVER);
    public Biome JURASSIC_MUDFLATS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats"));
    public int JURASSIC_MUDFLATS_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS);
    public Biome JURASSIC_MUDFLATS_HELPER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_mudflats_helper"));
    public int JURASSIC_MUDFLATS_HELPER_ID =  Biome.getIdForBiome(JURASSIC_MUDFLATS_HELPER);
    public  Biome JURASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach"));
    public  int JURASSIC_BEACH_ID =  Biome.getIdForBiome(JURASSIC_BEACH);
    public  Biome JURASSIC_BEACH_BLACK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach_black"));
    public  int JURASSIC_BEACH_BLACK_ID =  Biome.getIdForBiome(JURASSIC_BEACH_BLACK);

    public GenLayerJoinRiversJurassic(long seed, GenLayer genLayer)
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

                if (isMudflats(k) || isBeach(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)]; // i + 2
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)]; // i + 3
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)]; // i + 1
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)]; // i + 3 ????

                    if (
                        ((isRiver(l1) && isRiver(j3))
                        || (isRiver(k2) && isRiver(i4)))

                    )
                    {
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

    private boolean isRiver(int biomeID) {
        if (biomeID == JURASSIC_RIVER_ID) {
            return true;
        }
        return false;
    }

    private boolean isMudflats(int biomeID) {
        if (biomeID == JURASSIC_MUDFLATS_ID || biomeID == JURASSIC_MUDFLATS_HELPER_ID) {
            return true;
        }
        return false;
    }

    private boolean isBeach(int biomeID) {
        if (biomeID == JURASSIC_BEACH_ID || biomeID == JURASSIC_BEACH_BLACK_ID) {
            return true;
        }
        return false;
    }

}
