package net.lepidodendron.world.dimension.precambrian.GenLayerPrecambrian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyPrecambrian extends GenLayer {

    public Biome PRECAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:precambrian_sea"));
    public  int PRECAMBRIAN_OCEAN_ID =  Biome.getIdForBiome(PRECAMBRIAN_OCEAN);
    public  Biome PRECAMBRIAN_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:precambrian_biome"));
    public  int PRECAMBRIAN_LAND_ID =  Biome.getIdForBiome(PRECAMBRIAN_LAND);

    private final int PrecambrianBiomes[] = new int[] {
        PRECAMBRIAN_OCEAN_ID,
        PRECAMBRIAN_OCEAN_ID,
        PRECAMBRIAN_LAND_ID
    };

    public GenLayerDiversifyPrecambrian(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        return diversify(x, z, width, height);
    }

    private int[] diversify(int x, int z, int width, int height) {
        int input[] = this.parent.getInts(x, z, width, height);
        int output[] = IntCache.getIntCache(width * height);
        EnumBiomeTypeDevonian type;
        for (int zOut = 0; zOut < height; zOut++) {
            for (int xOut = 0; xOut < width; xOut++) {
                int i = xOut + zOut * width;
                int center = input[i];
                initChunkSeed(xOut + x, zOut + z);
                if (nextInt(2) == 0) {
                    //if (Biome.getBiome(center) == BiomeDevonianHills.biome)
                        output[i] = PrecambrianBiomes[nextInt(PrecambrianBiomes.length)];
                    //else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}