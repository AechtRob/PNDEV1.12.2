package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerRiverbanksTriassic extends GenLayer
{

    public Biome TRIASSIC_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_creek"));
    public int TRIASSIC_RIVER_ID =  Biome.getIdForBiome(TRIASSIC_RIVER);
    public Biome TRIASSIC_RIVERBANK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_riverbank"));
    public int TRIASSIC_RIVERBANK_ID =  Biome.getIdForBiome(TRIASSIC_RIVERBANK);

    public Biome TRIASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean"));
    public int TRIASSIC_OCEAN_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN);
    public Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public  Biome TRIASSIC_CLAM_BEDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_clam_beds"));
    public  int TRIASSIC_CLAM_BEDS_ID =  Biome.getIdForBiome(TRIASSIC_CLAM_BEDS);
    public Biome TRIASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_beach"));
    public int TRIASSIC_BEACH_ID =  Biome.getIdForBiome(TRIASSIC_BEACH);

    public GenLayerRiverbanksTriassic(long seed, GenLayer genLayer)
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

                if (isRiver(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (
                        (!isRiver(l1) || !isRiver(k2) || !isRiver(j3) || !isRiver(i4))
                        && (!isOcean(l1) && !isOcean(k2) && !isOcean(j3) && !isOcean(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = TRIASSIC_RIVERBANK_ID;
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
        if (biomeID == TRIASSIC_RIVER_ID) {
            return true;
        }
        return false;
    }

    private boolean isOcean(int biomeID) {
        if (biomeID == TRIASSIC_OCEAN_ID || biomeID == TRIASSIC_OCEAN_SHORE_ID || biomeID == TRIASSIC_BEACH_ID || biomeID == TRIASSIC_CLAM_BEDS_ID) {
            return true;
        }
        return false;
    }

}
