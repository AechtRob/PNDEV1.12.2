package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerTriassicBeach extends GenLayer
{

    public Biome TRIASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean"));
    public  int TRIASSIC_OCEAN_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN);
    public  Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public  int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public  Biome TRIASSIC_CLAM_BEDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_clam_beds"));
    public  int TRIASSIC_CLAM_BEDS_ID =  Biome.getIdForBiome(TRIASSIC_CLAM_BEDS);
    public  Biome TRIASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_beach"));
    public  int TRIASSIC_BEACH_ID =  Biome.getIdForBiome(TRIASSIC_BEACH);
    public  Biome TRIASSIC_VOLCANIC_ISLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_volcanic_islands"));
    public  int TRIASSIC_VOLCANIC_ISLANDS_ID =  Biome.getIdForBiome(TRIASSIC_VOLCANIC_ISLANDS);

    public  Biome TRIASSIC_DESERT_PLATEAU_BROKEN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_broken"));
    public  int TRIASSIC_DESERT_PLATEAU_BROKEN_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU_BROKEN);
    public  Biome TRIASSIC_CREEK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_creek"));
    public  int TRIASSIC_CREEK_ID =  Biome.getIdForBiome(TRIASSIC_CREEK);
    public  Biome TRIASSIC_RIVERBANK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_riverbank"));
    public  int TRIASSIC_RIVERBANK_ID =  Biome.getIdForBiome(TRIASSIC_RIVERBANK);

    public GenLayerTriassicBeach(long seed, GenLayer genLayer)
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
                            aint1[j + i * areaWidth] = TRIASSIC_BEACH_ID;
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
        if (biomeID == TRIASSIC_OCEAN_ID || biomeID == TRIASSIC_OCEAN_SHORE_ID || biomeID == TRIASSIC_CLAM_BEDS_ID) {
            return true;
        }
        return false;
    }

    private boolean hasNoBeach(int biomeID) {
        if (biomeID == TRIASSIC_DESERT_PLATEAU_BROKEN_ID
            || biomeID == TRIASSIC_CREEK_ID
            || biomeID == TRIASSIC_RIVERBANK_ID
            || biomeID == TRIASSIC_VOLCANIC_ISLANDS_ID
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
