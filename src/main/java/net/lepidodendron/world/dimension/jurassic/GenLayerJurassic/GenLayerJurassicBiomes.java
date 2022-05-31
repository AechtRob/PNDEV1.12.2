package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicBiomes extends GenLayer {

    public Biome JURASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ocean_shore"));
    public int JURASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(JURASSIC_OCEAN_SHORE);
    public Biome JURASSIC_FERN_PASTURE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_fern_pasture"));
    public int JURASSIC_FERN_PASTURE_ID =  Biome.getIdForBiome(JURASSIC_FERN_PASTURE);
    public Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);
    public Biome JURASSIC_FLOODPLAIN_FORESTED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_floodplain_forested"));
    public int JURASSIC_FLOODPLAIN_FORESTED_ID =  Biome.getIdForBiome(JURASSIC_FLOODPLAIN_FORESTED);
    public Biome JURASSIC_GINKGO_WOODLAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_ginkgo_woodland"));
    public int JURASSIC_GINKGO_WOODLAND_ID =  Biome.getIdForBiome(JURASSIC_GINKGO_WOODLAND);
    public Biome JURASSIC_REDWOOD_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_redwood_forest"));
    public int JURASSIC_REDWOOD_FOREST_ID =  Biome.getIdForBiome(JURASSIC_REDWOOD_FOREST);
    public Biome JURASSIC_ROUGH_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_rough_hills"));
    public int JURASSIC_ROUGH_HILLS_ID =  Biome.getIdForBiome(JURASSIC_ROUGH_HILLS);
    public Biome JURASSIC_TAIGA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_southern_taiga"));
    public int JURASSIC_TAIGA_ID =  Biome.getIdForBiome(JURASSIC_TAIGA);

    private final int JurassicBiomes[] = new int[] {
        JURASSIC_FERN_PASTURE_ID,
        JURASSIC_FERN_PASTURE_ID,

        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,

        JURASSIC_FLOODPLAIN_FORESTED_ID,
        JURASSIC_FLOODPLAIN_FORESTED_ID,

        JURASSIC_GINKGO_WOODLAND_ID,
        JURASSIC_GINKGO_WOODLAND_ID,

        JURASSIC_REDWOOD_FOREST_ID,
        JURASSIC_REDWOOD_FOREST_ID,

        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,

        JURASSIC_TAIGA_ID,
        JURASSIC_TAIGA_ID,

        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID,
        JURASSIC_OCEAN_SHORE_ID
    };

    public GenLayerJurassicBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = JurassicBiomes[nextInt(JurassicBiomes.length)];
            }
        }
        return dest;
    }
}