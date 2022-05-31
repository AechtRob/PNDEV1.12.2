package net.lepidodendron.world.dimension.precambrian.GenLayerPrecambrian;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPrecambrianBiomes extends GenLayer {

    public Biome PRECAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:precambrian_sea"));
    public  int PRECAMBRIAN_OCEAN_ID =  Biome.getIdForBiome(PRECAMBRIAN_OCEAN);
    public  Biome PRECAMBRIAN_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:precambrian_biome"));
    public  int PRECAMBRIAN_LAND_ID =  Biome.getIdForBiome(PRECAMBRIAN_LAND);

    private final int PrecambrianBiomes[] = new int[] {
        PRECAMBRIAN_OCEAN_ID,
        PRECAMBRIAN_LAND_ID
    };

    public GenLayerPrecambrianBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = PrecambrianBiomes[nextInt(PrecambrianBiomes.length)];
            }
        }
        return dest;
    }
}