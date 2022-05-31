package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDevonianBeach extends GenLayer
{

    public  Biome DEVONIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_ocean"));
    public  int DEVONIAN_OCEAN_ID =  Biome.getIdForBiome(DEVONIAN_OCEAN);
    public  Biome DEVONIAN_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_forest"));
    public  int DEVONIAN_FOREST_ID =  Biome.getIdForBiome(DEVONIAN_FOREST);
    public  Biome DEVONIAN_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hills"));
    public  int DEVONIAN_HILLS_ID =  Biome.getIdForBiome(DEVONIAN_HILLS);
    public  Biome DEVONIAN_SPRINGS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_springs"));
    public  int DEVONIAN_SPRINGS_ID =  Biome.getIdForBiome(DEVONIAN_SPRINGS);
    public  Biome DEVONIAN_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_floodplain"));
    public  int DEVONIAN_FLOODPLAIN_ID =  Biome.getIdForBiome(DEVONIAN_FLOODPLAIN);
    public  Biome DEVONIAN_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_beach"));
    public  int DEVONIAN_BEACH_ID =  Biome.getIdForBiome(DEVONIAN_BEACH);
    public Biome DEVONIAN_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_swamp"));
    public int DEVONIAN_SWAMP_ID =  Biome.getIdForBiome(DEVONIAN_SWAMP);

    public GenLayerDevonianBeach(long seed, GenLayer genLayer)
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

                if (k == DEVONIAN_HILLS_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isSprings(l1) || isSprings(k2) || isSprings(j3) || isSprings(i4))
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_FOREST_ID;
                    }
                    else if (!isOcean(l1) && !isOcean(k2) && !isOcean(j3) && !isOcean(i4))
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_FOREST_ID;
                    }
                }
                else if (k == DEVONIAN_FLOODPLAIN_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isSprings(l1) || isSprings(k2) || isSprings(j3) || isSprings(i4))
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_FOREST_ID;
                    }
                    else if (!isOcean(l1) && !isOcean(k2) && !isOcean(j3) && !isOcean(i4))
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_BEACH_ID;
                    }
                }
                else if (k != DEVONIAN_SPRINGS_ID)
                {

                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isSprings(l1) || isSprings(k2) || isSprings(j3) || isSprings(i4))
                    {
                        aint1[j + i * areaWidth] = DEVONIAN_FOREST_ID;
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
        if (biomeID == DEVONIAN_OCEAN_ID) {
            return true;
        }
        return false;
    }

    private boolean isSprings(int biomeID) {
        if (biomeID == DEVONIAN_SPRINGS_ID) {
            return true;
        }
        return false;
    }

}
