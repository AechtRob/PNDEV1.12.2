package net.lepidodendron.world.dimension.cambrian.GenLayerCambrian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCambrianEstuary extends GenLayer
{

    public Biome CAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_sea"));
    public int CAMBRIAN_OCEAN_ID = Biome.getIdForBiome( CAMBRIAN_OCEAN);
    public Biome CAMBRIAN_ESTUARY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_estuary"));
    public int CAMBRIAN_ESTUARY_ID = Biome.getIdForBiome( CAMBRIAN_ESTUARY);

    public GenLayerCambrianEstuary(long seed, GenLayer genLayer)
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
               Biome biome = Biome.getBiome(k);

                if (nextInt(3) == 0
                )
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
                            aint1[j + i * areaWidth] = CAMBRIAN_ESTUARY_ID;
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
        if (biomeID == CAMBRIAN_OCEAN_ID) {
            return true;
        }
        return false;
    }

}
