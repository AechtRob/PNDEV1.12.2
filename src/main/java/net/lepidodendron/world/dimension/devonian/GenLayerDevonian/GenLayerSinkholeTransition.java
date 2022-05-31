package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerSinkholeTransition extends GenLayer
{

    public Biome DEVONIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_mountains"));
    public int DEVONIAN_MOUNTAINS_ID =  Biome.getIdForBiome(DEVONIAN_MOUNTAINS);
    public Biome DEVONIAN_SINKHOLE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hypersaline_sinkhole"));
    public int DEVONIAN_SINKHOLE_ID =  Biome.getIdForBiome(DEVONIAN_SINKHOLE);
    public Biome DEVONIAN_SINKHOLE_TRANSITION = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hypersaline_sinkhole_transition"));
    public int DEVONIAN_SINKHOLE_TRANSITION_ID =  Biome.getIdForBiome(DEVONIAN_SINKHOLE_TRANSITION);

    public GenLayerSinkholeTransition(long seed, GenLayer genLayer)
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

                if (isMountains(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (
                        (isSinkhole(l1) || isSinkhole(k2) || isSinkhole(j3) || isSinkhole(i4))

                    )
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_SINKHOLE_TRANSITION_ID;
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

    private boolean isSinkhole(int biomeID) {
        if (biomeID == DEVONIAN_SINKHOLE_ID) {
            return true;
        }
        return false;
    }

    private boolean isMountains(int biomeID) {
        if (biomeID == DEVONIAN_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

}
