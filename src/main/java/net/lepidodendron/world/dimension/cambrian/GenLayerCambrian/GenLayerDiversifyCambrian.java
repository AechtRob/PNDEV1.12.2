package net.lepidodendron.world.dimension.cambrian.GenLayerCambrian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyCambrian extends GenLayer {

    public Biome CAMBRIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_sea"));
    public  int CAMBRIAN_OCEAN_ID =  Biome.getIdForBiome(CAMBRIAN_OCEAN);
    public  Biome CAMBRIAN_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:cambrian_biome"));
    public  int CAMBRIAN_LAND_ID =  Biome.getIdForBiome(CAMBRIAN_LAND);

    private final int CambrianBiomes[] = new int[] {
        CAMBRIAN_OCEAN_ID,
        CAMBRIAN_OCEAN_ID,
        CAMBRIAN_LAND_ID
    };

    public GenLayerDiversifyCambrian(long seed, GenLayer genlayer) {
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
                        output[i] = CambrianBiomes[nextInt(CambrianBiomes.length)];
                    //else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}