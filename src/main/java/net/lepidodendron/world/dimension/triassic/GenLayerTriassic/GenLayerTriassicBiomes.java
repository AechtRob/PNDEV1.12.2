package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerTriassicBiomes extends GenLayer {

    public Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public Biome TRIASSIC_GONDWANAN_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest"));
    public int TRIASSIC_GONDWANAN_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_GONDWANAN_FOREST);
    public Biome TRIASSIC_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_desert_rocky"));
    public int TRIASSIC_DESERT_ID =  Biome.getIdForBiome(TRIASSIC_DESERT);
    public Biome TRIASSIC_XERIC_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_xeric_forest"));
    public int TRIASSIC_XERIC_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_XERIC_FOREST);
    public Biome TRIASSIC_WARM_LAKELAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_warm_lakeland"));
    public int TRIASSIC_WARM_LAKELAND_ID =  Biome.getIdForBiome(TRIASSIC_WARM_LAKELAND);
    public Biome TRIASSIC_FLOODED_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_flooded_forest"));
    public int TRIASSIC_FLOODED_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_FLOODED_FOREST);


    private final int PermianBiomes[] = new int[] {
        TRIASSIC_GONDWANAN_FOREST_ID,
        TRIASSIC_GONDWANAN_FOREST_ID,

        TRIASSIC_DESERT_ID,
        TRIASSIC_DESERT_ID,

        TRIASSIC_XERIC_FOREST_ID,
        TRIASSIC_XERIC_FOREST_ID,

        TRIASSIC_WARM_LAKELAND_ID,
        TRIASSIC_WARM_LAKELAND_ID,

        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,

        TRIASSIC_FLOODED_FOREST_ID,
        TRIASSIC_FLOODED_FOREST_ID
    };

    public GenLayerTriassicBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = PermianBiomes[nextInt(PermianBiomes.length)];
            }
        }
        return dest;
    }
}