package net.lepidodendron.world.dimension.cambrian.GenLayerCambrian;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCambrianBiomes extends GenLayer {

    public Biome CAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_sea"));
    public  int CAMBRIAN_OCEAN_ID =  Biome.getIdForBiome(CAMBRIAN_OCEAN);
    public  Biome CAMBRIAN_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_biome"));
    public  int CAMBRIAN_LAND_ID =  Biome.getIdForBiome(CAMBRIAN_LAND);

    private final int CambrianBiomes[] = new int[] {
        CAMBRIAN_OCEAN_ID,
        CAMBRIAN_LAND_ID
    };

    public GenLayerCambrianBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = CambrianBiomes[nextInt(CambrianBiomes.length)];
            }
        }
        return dest;
    }
}