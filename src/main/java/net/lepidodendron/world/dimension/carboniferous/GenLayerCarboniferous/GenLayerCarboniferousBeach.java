package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCarboniferousBeach extends GenLayer
{

    public  Biome CARBONIFEROUS_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_ocean"));
    public  int CARBONIFEROUS_OCEAN_ID =  Biome.getIdForBiome(CARBONIFEROUS_OCEAN);
    public  Biome CARBONIFEROUS_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_ocean_shore"));
    public  int CARBONIFEROUS_OCEAN_SHORE_ID =  Biome.getIdForBiome(CARBONIFEROUS_OCEAN_SHORE);
    public  Biome CARBONIFEROUS_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills"));
    public  int CARBONIFEROUS_HILLS_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS);
    public  Biome CARBONIFEROUS_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert"));
    public  int CARBONIFEROUS_ICE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE);
    public  Biome CARBONIFEROUS_ICE_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert_edge"));
    public  int CARBONIFEROUS_ICE_EDGE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE_EDGE);
    public  Biome CARBONIFEROUS_ICE_SPIKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert_spikes"));
    public  int CARBONIFEROUS_ICE_SPIKES_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE_SPIKES);
    public  Biome CARBONIFEROUS_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_beach"));
    public  int CARBONIFEROUS_BEACH_ID =  Biome.getIdForBiome(CARBONIFEROUS_BEACH);
    public  Biome CARBONIFEROUS_HILLS_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills_edge"));
    public  int CARBONIFEROUS_HILLS_EDGE_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS_EDGE);
    public  Biome CARBONIFEROUS_HILLS_CENTRE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills_high"));
    public  int CARBONIFEROUS_HILLS_CENTRE_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS_CENTRE);
    public Biome CARBONIFEROUS_MARSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_marsh"));
    public int CARBONIFEROUS_MARSH_ID =  Biome.getIdForBiome(CARBONIFEROUS_MARSH);


    public GenLayerCarboniferousBeach(long seed, GenLayer genLayer)
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

                if (k != CARBONIFEROUS_HILLS_ID
                        && k != CARBONIFEROUS_ICE_EDGE_ID
                        && k != CARBONIFEROUS_ICE_ID
                        && k != CARBONIFEROUS_ICE_SPIKES_ID
                        && k != CARBONIFEROUS_HILLS_ID
                        && k != CARBONIFEROUS_HILLS_EDGE_ID
                        && k != CARBONIFEROUS_HILLS_CENTRE_ID
                        && k != CARBONIFEROUS_MARSH_ID
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
                            aint1[j + i * areaWidth] = CARBONIFEROUS_BEACH_ID;
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
        if (biomeID == CARBONIFEROUS_OCEAN_ID || biomeID == CARBONIFEROUS_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

}
