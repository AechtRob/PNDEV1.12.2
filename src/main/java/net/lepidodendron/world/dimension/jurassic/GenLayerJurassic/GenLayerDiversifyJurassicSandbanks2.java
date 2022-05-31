package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyJurassicSandbanks2 extends GenLayer {

    public Biome JURASSIC_SANDBANKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_sandbanks"));
    public int JURASSIC_SANDBANKS_ID =  Biome.getIdForBiome(JURASSIC_SANDBANKS);
    public Biome JURASSIC_SANDBANKS_RAISED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_sandbanks_raised"));
    public int JURASSIC_SANDBANKS_RAISED_ID =  Biome.getIdForBiome(JURASSIC_SANDBANKS_RAISED);

    private final int SandbanksBiomes[] = new int[] {
            JURASSIC_SANDBANKS_ID,
            JURASSIC_SANDBANKS_ID,
            JURASSIC_SANDBANKS_ID,
            JURASSIC_SANDBANKS_RAISED_ID
    };

    public GenLayerDiversifyJurassicSandbanks2(long seed, GenLayer genlayer) {
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

                if (isSandbank(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isSandbank(l1) && isSandbank(k2) && isSandbank(j3) && isSandbank(i4))
                    {
                        aint1[j + i * areaWidth] = SandbanksBiomes[nextInt(SandbanksBiomes.length)];
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

    private boolean isSandbank(int biomeID) {
        if (biomeID == JURASSIC_SANDBANKS_ID) {
            return true;
        }
        return false;
    }

}