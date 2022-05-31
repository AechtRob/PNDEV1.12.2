package net.lepidodendron.world.dimension.ordovician.GenLayerOrdovician;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerOrdovicianBiomes extends GenLayer {

    public Biome OS_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_sea"));
    public  int OS_OCEAN_ID =  Biome.getIdForBiome(OS_OCEAN);
    public  Biome OS_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_land"));
    public  int OS_LAND_ID =  Biome.getIdForBiome(OS_LAND);
    public  Biome OS_OCEAN_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_sea_ice"));
    public  int OS_OCEAN_ICE_ID =  Biome.getIdForBiome(OS_OCEAN_ICE);
    public  Biome OS_SPONGE_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:ordovician_sponge_forest"));
    public  int OS_SPONGE_FOREST_ID =  Biome.getIdForBiome(OS_SPONGE_FOREST);

    private final int OSBiomes[] = new int[] {
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ICE_ID,
        OS_LAND_ID,
        OS_LAND_ID,
        OS_SPONGE_FOREST_ID
    };

    public GenLayerOrdovicianBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = OSBiomes[nextInt(OSBiomes.length)];
            }
        }
        return dest;
    }
}