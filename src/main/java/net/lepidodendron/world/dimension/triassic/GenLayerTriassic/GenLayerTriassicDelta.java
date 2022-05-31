package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerTriassicDelta extends GenLayer
{

    public Biome TRIASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean"));
    public  int TRIASSIC_OCEAN_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN);
    public  Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public  int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public  Biome TRIASSIC_DESERT_PLATEAU = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau"));
    public  int TRIASSIC_DESERT_PLATEAU_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU);
    public  Biome TRIASSIC_DESERT_DELTA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_broken"));
    public  int TRIASSIC_DESERT_DELTA_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_DELTA);
    public  Biome TRIASSIC_DESERT_CANYONS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_canyons"));
    public  int TRIASSIC_DESERT_CANYONS_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_CANYONS);

    public GenLayerTriassicDelta(long seed, GenLayer genLayer)
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
                    if (isOcean(k))
                    {
                        int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                        int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                        int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                        int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                        if (isPlateau(l1) || isPlateau(k2) || isPlateau(j3) || isPlateau(i4))
                        {
                            aint1[j + i * areaWidth] = TRIASSIC_DESERT_DELTA_ID;
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
                //}
                //else
                //{
                //    aint1[j + i * areaWidth] = k;
                //}
            }
        }

        return aint1;
    }

    private boolean isOcean(int biomeID) {
        if (biomeID == TRIASSIC_OCEAN_ID || biomeID == TRIASSIC_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

    private boolean isPlateau(int biomeID) {
        if (biomeID == TRIASSIC_DESERT_CANYONS_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_ID
        //    || biomeID == TRIASSIC_WETLANDS_UNWOODED_ID
        //    || biomeID == TRIASSIC_MOUNTAINS_ID
        //    || biomeID == TRIASSIC_FLOODBASALT_ID
            ) {
            return true;
        }
        return false;
    }

}
