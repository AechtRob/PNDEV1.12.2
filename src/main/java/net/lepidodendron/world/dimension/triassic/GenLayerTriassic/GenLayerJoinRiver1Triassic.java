package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJoinRiver1Triassic extends GenLayer
{

    public Biome TRIASSIC_DESERT_PLATEAU_BROKEN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_broken"));
    public int TRIASSIC_DESERT_PLATEAU_BROKEN_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU_BROKEN);
    public Biome TRIASSIC_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_creek"));
    public int TRIASSIC_RIVER_ID =  Biome.getIdForBiome(TRIASSIC_RIVER);
    public  Biome TRIASSIC_DESERT_PLATEAU_CANYONS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_canyons"));
    public  int TRIASSIC_DESERT_PLATEAU_CANYONS_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU_CANYONS);

    public GenLayerJoinRiver1Triassic(long seed, GenLayer genLayer)
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

                if (isPlateau(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (
                        (isRiver(l1) && isPlateau(k2) && isPlateau(j3) && isPlateau(i4))
                        || (isPlateau(l1) && isRiver(k2) && isPlateau(j3) && isPlateau(i4))
                        || (isPlateau(l1) && isPlateau(k2) && isRiver(j3) && isPlateau(i4))
                        || (isPlateau(l1) && isPlateau(k2) && isPlateau(j3) && isRiver(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = TRIASSIC_RIVER_ID;
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

    private boolean isPlateau(int biomeID) {
        if (biomeID == TRIASSIC_DESERT_PLATEAU_BROKEN_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_CANYONS_ID) {
            return true;
        }
        return false;
    }

    private boolean isRiver(int biomeID) {
        if (biomeID == TRIASSIC_RIVER_ID) {
            return true;
        }
        return false;
    }

}
