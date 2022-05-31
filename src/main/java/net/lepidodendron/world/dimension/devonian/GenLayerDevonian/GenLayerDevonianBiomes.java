package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDevonianBiomes extends GenLayer {

    public Biome DEVONIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_ocean"));
    public  int DEVONIAN_OCEAN_ID =  Biome.getIdForBiome(DEVONIAN_OCEAN);
    public  Biome DEVONIAN_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hills"));
    public  int DEVONIAN_HILLS_ID =  Biome.getIdForBiome(DEVONIAN_HILLS);
    public Biome DEVONIAN_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_swamp"));
    public int DEVONIAN_SWAMP_ID =  Biome.getIdForBiome(DEVONIAN_SWAMP);

    private final int DevonianBiomes[] = new int[] {
        DEVONIAN_HILLS_ID,
        DEVONIAN_OCEAN_ID,
        DEVONIAN_OCEAN_ID,
        DEVONIAN_SWAMP_ID
    };

    public GenLayerDevonianBiomes(long seed) {
        super(seed);
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        int dest[] = IntCache.getIntCache(width * height);
        for (int dz = 0; dz < height; dz++) {
            for (int dx = 0; dx < width; dx++) {
                initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = DevonianBiomes[nextInt(DevonianBiomes.length)];
            }
        }
        return dest;
    }
}