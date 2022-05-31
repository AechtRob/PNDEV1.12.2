package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCarboniferousHillsEdge extends GenLayer
{

    public  Biome CARBONIFEROUS_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills"));
    public  int CARBONIFEROUS_HILLS_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS);
    public  Biome CARBONIFEROUS_HILLS_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills_edge"));
    public  int CARBONIFEROUS_HILLS_EDGE_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS_EDGE);

    public  Biome CARBONIFEROUS_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_swamp"));
    public  int CARBONIFEROUS_SWAMP_ID =  Biome.getIdForBiome(CARBONIFEROUS_SWAMP);
    public  Biome CARBONIFEROUS_SWAMP_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_swamp_hills"));
    public  int CARBONIFEROUS_SWAMP_HILLS_ID =  Biome.getIdForBiome(CARBONIFEROUS_SWAMP_HILLS);

    private final int SwampBiomes[] = new int[] {
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_HILLS_EDGE_ID
    };

    private final int SwampHillsBiomes[] = new int[] {
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_HILLS_EDGE_ID
};


    public GenLayerCarboniferousHillsEdge(long seed, GenLayer genLayer)
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

                if (k1 == CARBONIFEROUS_HILLS_ID)
                {
                    int l1 = aint[j1 + 1 + (i1 + 1 - 1) * k];
                    int i2 = aint[j1 + 1 + 1 + (i1 + 1) * k];
                    int j2 = aint[j1 + 1 - 1 + (i1 + 1) * k];
                    int k2 = aint[j1 + 1 + (i1 + 1 + 1) * k];
                    boolean flag = (
                            (l1 != CARBONIFEROUS_HILLS_ID && l1 != CARBONIFEROUS_HILLS_EDGE_ID)
                            || (i2 != CARBONIFEROUS_HILLS_ID  && i2 != CARBONIFEROUS_HILLS_EDGE_ID)
                            || (j2 != CARBONIFEROUS_HILLS_ID  && j2 != CARBONIFEROUS_HILLS_EDGE_ID)
                            || (k2 != CARBONIFEROUS_HILLS_ID && k2 != CARBONIFEROUS_HILLS_EDGE_ID)
                    );
                    if (flag)
                    {
                        k1 = CARBONIFEROUS_HILLS_EDGE_ID;
                    }
                }
                else if (k1 == CARBONIFEROUS_SWAMP_ID) {
                    if (nextInt(2) == 0) {
                        k1 = SwampBiomes[nextInt(SwampBiomes.length)];
                    }
                }
                else if (k1 == CARBONIFEROUS_SWAMP_HILLS_ID) {
                    if (nextInt(2) == 0) {
                        k1 = SwampHillsBiomes[nextInt(SwampHillsBiomes.length)];
                    }
                }

                aint1[j1 + i1 * p_151626_3_] = k1;
            }
        }

        return aint1;
    }
    
}
