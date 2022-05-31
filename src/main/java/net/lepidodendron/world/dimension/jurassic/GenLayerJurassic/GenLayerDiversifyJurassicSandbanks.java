package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyJurassicSandbanks extends GenLayer {

    public Biome JURASSIC_SANDBANKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_sandbanks"));
    public int JURASSIC_SANDBANKS_ID =  Biome.getIdForBiome(JURASSIC_SANDBANKS);
    public Biome JURASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean_shore"));
    public int JURASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(JURASSIC_OCEAN_SHORE);
    public Biome JURASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean"));
    public  int JURASSIC_OCEAN_ID =  Biome.getIdForBiome(JURASSIC_OCEAN);

    private final int OceanBiomes[] = new int[] {
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_SANDBANKS_ID
    };

    public GenLayerDiversifyJurassicSandbanks(long seed, GenLayer genlayer) {
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

                if (isAlreadyWater(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isAlreadyWater(l1) && isAlreadyWater(k2) && isAlreadyWater(j3) && isAlreadyWater(i4))
                    {
                        aint1[j + i * areaWidth] = OceanBiomes[nextInt(OceanBiomes.length)];
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

    private boolean isAlreadyWater(int biomeID) {
        if (biomeID == JURASSIC_OCEAN_ID || biomeID == JURASSIC_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

}