package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerTriassicRiverBorder extends GenLayer
{

    public Biome TRIASSIC_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_river"));
    public int TRIASSIC_RIVER_ID = Biome.getIdForBiome(TRIASSIC_RIVER);

    public Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public  Biome TRIASSIC_CLAM_BEDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_clam_beds"));
    public  int TRIASSIC_CLAM_BEDS_ID =  Biome.getIdForBiome(TRIASSIC_CLAM_BEDS);
    public Biome TRIASSIC_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean"));
    public  int TRIASSIC_OCEAN_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN);
    public  Biome TRIASSIC_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_beach"));
    public  int TRIASSIC_BEACH_ID =  Biome.getIdForBiome(TRIASSIC_BEACH);
    public  Biome TRIASSIC_PUMICE_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_beach_black"));
    public  int TRIASSIC_PUMICE_BEACH_ID =  Biome.getIdForBiome(TRIASSIC_PUMICE_BEACH);
    public  Biome TRIASSIC_VOLCANIC_ISLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_volcanic_islands"));
    public  int TRIASSIC_VOLCANIC_ISLANDS_ID =  Biome.getIdForBiome(TRIASSIC_VOLCANIC_ISLANDS);
    public  Biome TRIASSIC_RIVERBANKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_riverbank"));
    public  int TRIASSIC_RIVERBANKS_ID =  Biome.getIdForBiome(TRIASSIC_RIVERBANKS);
    public  Biome TRIASSIC_RIVERBANKS_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_riverbank_forest"));
    public  int TRIASSIC_RIVERBANKS_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_RIVERBANKS_FOREST);
    public  Biome TRIASSIC_CREEK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_creek"));
    public  int TRIASSIC_CREEK_ID =  Biome.getIdForBiome(TRIASSIC_CREEK);

    public  Biome TRIASSIC_DESERT_PLATEAU = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau"));
    public  int TRIASSIC_DESERT_PLATEAU_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU);
    public  Biome TRIASSIC_DESERT_PLATEAU_BROKEN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_broken"));
    public  int TRIASSIC_DESERT_PLATEAU_BROKEN_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU_BROKEN);
    public  Biome TRIASSIC_DESERT_PLATEAU_CANYONS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_plateau_canyons"));
    public  int TRIASSIC_DESERT_PLATEAU_CANYONS_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_PLATEAU_CANYONS);
    public  Biome TRIASSIC_DESERT_ROCKY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_rocky"));
    public  int TRIASSIC_DESERT_ROCKY_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_ROCKY);
    public  Biome TRIASSIC_DESERT_SANDY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_sandy"));
    public  int TRIASSIC_DESERT_SANDY_ID =  Biome.getIdForBiome(TRIASSIC_DESERT_SANDY);
    public  Biome TRIASSIC_WARM_LAKELAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_warm_lakeland"));
    public  int TRIASSIC_WARM_LAKELAND_ID =  Biome.getIdForBiome(TRIASSIC_WARM_LAKELAND);
    public  Biome TRIASSIC_WARM_VOLCANIC_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_warm_volcanic_hills"));
    public  int TRIASSIC_WARM_VOLCANIC_HILLS_ID =  Biome.getIdForBiome(TRIASSIC_WARM_VOLCANIC_HILLS);
    public  Biome TRIASSIC_XERIC_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_xeric_forest"));
    public  int TRIASSIC_XERIC_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_XERIC_FOREST);
    public  Biome TRIASSIC_XERIC_SCRUBLAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_xeric_scrubland"));
    public  int TRIASSIC_XERIC_SCRUBLAND_ID =  Biome.getIdForBiome(TRIASSIC_XERIC_SCRUBLAND);

    public  Biome TRIASSIC_MOSS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_plain"));
    public  int TRIASSIC_MOSS_ID =  Biome.getIdForBiome(TRIASSIC_MOSS);
    public  Biome TRIASSIC_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest"));
    public  int TRIASSIC_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_FOREST);
    public  Biome TRIASSIC_FOREST_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest_crags"));
    public  int TRIASSIC_FOREST_HILLS_ID =  Biome.getIdForBiome(TRIASSIC_FOREST_HILLS);
    public  Biome TRIASSIC_FOREST_CRAGS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest_hills"));
    public  int TRIASSIC_FOREST_CRAGS_ID =  Biome.getIdForBiome(TRIASSIC_FOREST_CRAGS);

    public Biome TRIASSIC_FLOODED_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_flooded_forest"));
    public int TRIASSIC_FLOODED_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_FLOODED_FOREST);

    public Biome TRIASSIC_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_mountains"));
    public int TRIASSIC_MOUNTAINS_ID =  Biome.getIdForBiome(TRIASSIC_MOUNTAINS);

    public GenLayerTriassicRiverBorder(long seed, GenLayer genLayer)
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

                if (isDesert(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isDesert(l1) && !isOceanOrBeach(l1) && !isExemptforDesert(l1))
                        || (!isDesert(k2) && !isOceanOrBeach(k2) && !isExemptforDesert(k2))
                        || (!isDesert(j3) && !isOceanOrBeach(j3) && !isExemptforDesert(j3))
                        || (!isDesert(i4) && !isOceanOrBeach(i4) && !isExemptforDesert(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = TRIASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isMossMeadow(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isMossMeadow(l1) && !isOceanOrBeach(l1) && !isExemptforMoss(l1))
                            || (!isMossMeadow(k2) && !isOceanOrBeach(k2) && !isExemptforMoss(k2))
                            || (!isMossMeadow(j3) && !isOceanOrBeach(j3) && !isExemptforMoss(j3))
                            || (!isMossMeadow(i4) && !isOceanOrBeach(i4) && !isExemptforMoss(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = TRIASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isFlooded(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isFlooded(l1) && !isOceanOrBeach(l1) && !isExemptforFlooded(l1))
                            || (!isFlooded(k2) && !isOceanOrBeach(k2) && !isExemptforFlooded(k2))
                            || (!isFlooded(j3) && !isOceanOrBeach(j3) && !isExemptforFlooded(j3))
                            || (!isFlooded(i4) && !isOceanOrBeach(i4) && !isExemptforFlooded(i4))
                    )
                    {
                        aint1[j + i * areaWidth] = TRIASSIC_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isLakelands(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if ((!isLakelands(l1) && !isOceanOrBeach(l1) && !isExemptforLakelands(l1))
                            || (!isLakelands(k2) && !isOceanOrBeach(k2) && !isExemptforLakelands(k2))
                            || (!isLakelands(j3) && !isOceanOrBeach(j3) && !isExemptforLakelands(j3))
                            || (!isLakelands(i4) && !isOceanOrBeach(i4) && !isExemptforLakelands(i4))
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

    private boolean isOceanOrBeach(int biomeID) {
        if (biomeID == TRIASSIC_OCEAN_ID || biomeID == TRIASSIC_OCEAN_SHORE_ID || biomeID == TRIASSIC_CLAM_BEDS_ID
            || biomeID == TRIASSIC_BEACH_ID || biomeID == TRIASSIC_PUMICE_BEACH_ID
            || biomeID == TRIASSIC_VOLCANIC_ISLANDS_ID || biomeID == TRIASSIC_CREEK_ID
            || biomeID == TRIASSIC_RIVERBANKS_ID || biomeID == TRIASSIC_RIVERBANKS_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isDesert(int biomeID) {
        if (biomeID == TRIASSIC_DESERT_PLATEAU_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_BROKEN_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_CANYONS_ID
            || biomeID == TRIASSIC_DESERT_ROCKY_ID
            || biomeID == TRIASSIC_DESERT_SANDY_ID) {
            return true;
        }
        return false;
    }

    private boolean isMossMeadow(int biomeID) {
        if (biomeID == TRIASSIC_MOSS_ID) {
            return true;
        }
        return false;
    }

    private boolean isFlooded(int biomeID) {
        if (biomeID == TRIASSIC_FLOODED_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isLakelands(int biomeID) {
        if (biomeID == TRIASSIC_WARM_LAKELAND_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforMoss(int biomeID) {
        if (biomeID == TRIASSIC_MOSS_ID
            || biomeID == TRIASSIC_FOREST_ID
            || biomeID == TRIASSIC_FOREST_CRAGS_ID
            || biomeID == TRIASSIC_FOREST_HILLS_ID
            || biomeID == TRIASSIC_WARM_LAKELAND_ID
            || biomeID == TRIASSIC_WARM_VOLCANIC_HILLS_ID
            || biomeID == TRIASSIC_FLOODED_FOREST_ID
            || biomeID == TRIASSIC_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforLakelands(int biomeID) {
        if (biomeID == TRIASSIC_WARM_LAKELAND_ID
            || biomeID == TRIASSIC_WARM_VOLCANIC_HILLS_ID
            || biomeID == TRIASSIC_MOSS_ID
            || biomeID == TRIASSIC_MOUNTAINS_ID
            || biomeID == TRIASSIC_FLOODED_FOREST_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforDesert(int biomeID) {
        if (biomeID == TRIASSIC_DESERT_PLATEAU_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_BROKEN_ID
            || biomeID == TRIASSIC_DESERT_PLATEAU_CANYONS_ID
            || biomeID == TRIASSIC_DESERT_ROCKY_ID
            || biomeID == TRIASSIC_DESERT_SANDY_ID
            || biomeID == TRIASSIC_WARM_LAKELAND_ID
            || biomeID == TRIASSIC_WARM_VOLCANIC_HILLS_ID
            || biomeID == TRIASSIC_XERIC_FOREST_ID
            || biomeID == TRIASSIC_XERIC_SCRUBLAND_ID
            || biomeID == TRIASSIC_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforFlooded(int biomeID) {
        if (biomeID == TRIASSIC_FLOODED_FOREST_ID
            || biomeID == TRIASSIC_MOSS_ID
            || biomeID == TRIASSIC_MOUNTAINS_ID
            || biomeID == TRIASSIC_XERIC_FOREST_ID) {
            return true;
        }
        return false;
    }



}
