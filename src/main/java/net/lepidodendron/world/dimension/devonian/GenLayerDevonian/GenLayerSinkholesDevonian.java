package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerSinkholesDevonian extends GenLayer {

    public  Biome DEVONIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_mountains"));
    public  int DEVONIAN_MOUNTAINS_ID =  Biome.getIdForBiome(DEVONIAN_MOUNTAINS);
    public  Biome DEVONIAN_SINKHOLES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hypersaline_sinkhole"));
    public  int DEVONIAN_SINKHOLES_ID =  Biome.getIdForBiome(DEVONIAN_SINKHOLES);

    private final int SinkholeBiomes[] = new int[] {
        DEVONIAN_MOUNTAINS_ID,
        DEVONIAN_MOUNTAINS_ID,
        DEVONIAN_MOUNTAINS_ID,
        DEVONIAN_MOUNTAINS_ID,
        DEVONIAN_SINKHOLES_ID
    };

    public GenLayerSinkholesDevonian(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
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

                if (isMountain(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isMountain(l1) && isMountain(k2) && isMountain(j3) && isMountain(i4))
                    {
                        aint1[j + i * areaWidth] = SinkholeBiomes[nextInt(SinkholeBiomes.length)];
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

    public boolean isMountain(int id) {
        if (id == DEVONIAN_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

}