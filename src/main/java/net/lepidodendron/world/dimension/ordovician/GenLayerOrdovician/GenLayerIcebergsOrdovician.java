package net.lepidodendron.world.dimension.ordovician.GenLayerOrdovician;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerIcebergsOrdovician extends GenLayer {

    public  Biome OS_SEA_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_sea_ice"));
    public  int OS_SEA_ICE_ID =  Biome.getIdForBiome(OS_SEA_ICE);
    public  Biome OS_ICEBERGS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_sea_icebergs"));
    public  int OS_ICEBERGS_ID =  Biome.getIdForBiome(OS_ICEBERGS);

    private final int SeaBiomes[] = new int[] {
        OS_SEA_ICE_ID,
        OS_SEA_ICE_ID,
        OS_SEA_ICE_ID,
        OS_SEA_ICE_ID,
        OS_ICEBERGS_ID
    };

    public GenLayerIcebergsOrdovician(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    @Override
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
                Biome biome = Biome.getBiome(k);

                if (k == OS_SEA_ICE_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (!isOcean(l1) || !isOcean(k2) || !isOcean(j3) || !isOcean(i4))
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = SeaBiomes[nextInt(SeaBiomes.length)];
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
        if (biomeID == OS_SEA_ICE_ID || biomeID == OS_ICEBERGS_ID) {
            return true;
        }
        return false;
    }

}