package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCarboniferousIceEdge extends GenLayer
{

    public  Biome CARBONIFEROUS_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert"));
    public  int CARBONIFEROUS_ICE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE);
    public  Biome CARBONIFEROUS_ICE_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert_edge"));
    public  int CARBONIFEROUS_ICE_EDGE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE_EDGE);

    public GenLayerCarboniferousIceEdge(long seed, GenLayer genLayer)
    {
        super(seed);
        this.parent = genLayer;
    }

    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        return this.getIntsFloodBasalt(areaX, areaY, areaWidth, areaHeight);
    }

    private int[] getIntsFloodBasalt(int p_151626_1_, int p_151626_2_, int p_151626_3_, int p_151626_4_)
    {
        int i = p_151626_1_ - 1;
        int j = p_151626_2_ - 1;
        int k = 1 + p_151626_3_ + 1;
        int l = 1 + p_151626_4_ + 1;
        int[] aint = this.parent.getInts(i, j, k, l);
        int[] aint1 = IntCache.getIntCache(p_151626_3_ * p_151626_4_);

        for (int i1 = 0; i1 < p_151626_4_; ++i1)
        {
            for (int j1 = 0; j1 < p_151626_3_; ++j1)
            {
                this.initChunkSeed((long)(j1 + p_151626_1_), (long)(i1 + p_151626_2_));
                int k1 = aint[j1 + 1 + (i1 + 1) * k];

                if (k1 == CARBONIFEROUS_ICE_ID)
                {
                    int l1 = aint[j1 + 1 + (i1 + 1 - 1) * k];
                    int i2 = aint[j1 + 1 + 1 + (i1 + 1) * k];
                    int j2 = aint[j1 + 1 - 1 + (i1 + 1) * k];
                    int k2 = aint[j1 + 1 + (i1 + 1 + 1) * k];
                    boolean flag = (
                            (l1 != CARBONIFEROUS_ICE_ID && l1 != CARBONIFEROUS_ICE_EDGE_ID)
                            || (i2 != CARBONIFEROUS_ICE_ID  && i2 != CARBONIFEROUS_ICE_EDGE_ID)
                            || (j2 != CARBONIFEROUS_ICE_ID  && j2 != CARBONIFEROUS_ICE_EDGE_ID)
                            || (k2 != CARBONIFEROUS_ICE_ID && k2 != CARBONIFEROUS_ICE_EDGE_ID)
                    );
                    if (flag)
                    {
                        k1 = CARBONIFEROUS_ICE_EDGE_ID;
                    }
                }

                aint1[j1 + i1 * p_151626_3_] = k1;
            }
        }

        return aint1;
    }
    
}
