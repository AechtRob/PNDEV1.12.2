package net.lepidodendron.world.dimension.silurian.GenLayerSilurian;

//import net.lepidodendron.world.biome.devonian.
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerSilurianBiomes extends GenLayer {

    public Biome OS_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:silurian_sea"));
    public  int OS_OCEAN_ID =  Biome.getIdForBiome(OS_OCEAN);
    public  Biome OS_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:silurian_land"));
    public  int OS_LAND_ID =  Biome.getIdForBiome(OS_LAND);
    public  Biome OS_OCEAN_GARDEN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:silurian_sea_garden"));
    public  int OS_OCEAN_GARDEN_ID =  Biome.getIdForBiome(OS_OCEAN_GARDEN);

    private final int OSBiomes[] = new int[] {
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_ID,
        OS_OCEAN_GARDEN_ID,
        OS_LAND_ID,
        OS_LAND_ID,
        OS_LAND_ID,
        OS_LAND_ID
    };

    public GenLayerSilurianBiomes(long seed) {
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