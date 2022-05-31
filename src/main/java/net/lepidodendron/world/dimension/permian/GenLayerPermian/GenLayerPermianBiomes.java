package net.lepidodendron.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianBiomes extends GenLayer {

    public  Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public  int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public  Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest"));
    public  int PERMIAN_GLOSSOPTERIS_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public  Biome PERMIAN_WETLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands"));
    public  int PERMIAN_WETLANDS_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS);
    public  Biome PERMIAN_ARID_LANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands"));
    public  int PERMIAN_ARID_LANDS_ID =  Biome.getIdForBiome(PERMIAN_ARID_LANDS);
    public  Biome PERMIAN_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert"));
    public  int PERMIAN_DESERT_ID =  Biome.getIdForBiome(PERMIAN_DESERT);
    public  Biome PERMIAN_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands"));
    public  int PERMIAN_LOWLANDS_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS);
    public  Biome PERMIAN_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_highlands"));
    public  int PERMIAN_HIGHLANDS_ID =  Biome.getIdForBiome(PERMIAN_HIGHLANDS);

    private final int PermianBiomes[] = new int[] {
        PERMIAN_WETLANDS_ID,
        PERMIAN_ARID_LANDS_ID,
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_DESERT_ID,
        PERMIAN_LOWLANDS_ID,
        PERMIAN_HIGHLANDS_ID,
        PERMIAN_WETLANDS_ID,
        PERMIAN_ARID_LANDS_ID,
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_DESERT_ID,
        PERMIAN_LOWLANDS_ID,
        PERMIAN_HIGHLANDS_ID,
        PERMIAN_OCEAN_SHORE_ID,
        PERMIAN_OCEAN_SHORE_ID,
        PERMIAN_OCEAN_SHORE_ID
    };

    public GenLayerPermianBiomes(long seed) {
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