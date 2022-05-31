package net.lepidodendron.world.dimension.cambrian.GenLayerCambrian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCambrianAddRim extends GenLayer
{

    public Biome CAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_sea"));
    public  int CAMBRIAN_OCEAN_ID =  Biome.getIdForBiome(CAMBRIAN_OCEAN);
    public  Biome CAMBRIAN_ESTUARY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_estuary"));
    public  int CAMBRIAN_ESTUARY_ID =  Biome.getIdForBiome(CAMBRIAN_ESTUARY);
    public  Biome CAMBRIAN_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_biome"));
    public  int CAMBRIAN_LAND_ID =  Biome.getIdForBiome(CAMBRIAN_LAND);

    public  Biome CAMBRIAN_RIM = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_estuary_helper"));
    public  int CAMBRIAN_RIM_ID =  Biome.getIdForBiome(CAMBRIAN_RIM);

    public GenLayerCambrianAddRim(long seed, GenLayer genLayer)
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


                if (isEstuary(k))
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
                        aint1[j + i * areaWidth] = CAMBRIAN_RIM_ID;
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

    private boolean isEstuary(int biomeID) {
        if (biomeID == CAMBRIAN_ESTUARY_ID) {
            return true;
        }
        return false;
    }

    private boolean isOcean(int biomeID) {
        if (biomeID == CAMBRIAN_OCEAN_ID) {
            return true;
        }
        return false;
    }

}
