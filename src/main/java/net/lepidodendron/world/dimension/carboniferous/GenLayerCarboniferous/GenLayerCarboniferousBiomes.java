package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCarboniferousBiomes extends GenLayer {

    public Biome CARBONIFEROUS_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_ocean_shore"));
    public int CARBONIFEROUS_OCEAN_SHORE_ID =  Biome.getIdForBiome(CARBONIFEROUS_OCEAN_SHORE);
    public Biome CARBONIFEROUS_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_swamp"));
    public int CARBONIFEROUS_SWAMP_ID =  Biome.getIdForBiome(CARBONIFEROUS_SWAMP);
    public Biome CARBONIFEROUS_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert"));
    public int CARBONIFEROUS_ICE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE);
    public Biome CARBONIFEROUS_MARSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_marsh"));
    public int CARBONIFEROUS_MARSH_ID =  Biome.getIdForBiome(CARBONIFEROUS_MARSH);
    
    private final int CarboniferousBiomes[] = new int[] {
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_MARSH_ID,
        CARBONIFEROUS_ICE_ID,
        CARBONIFEROUS_OCEAN_SHORE_ID
    };

    public GenLayerCarboniferousBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = CarboniferousBiomes[nextInt(CarboniferousBiomes.length)];
            }
        }
        return dest;
    }
}