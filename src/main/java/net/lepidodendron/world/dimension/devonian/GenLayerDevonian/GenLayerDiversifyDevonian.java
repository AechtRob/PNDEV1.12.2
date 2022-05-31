package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.devonian.BiomeDevonianHills;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyDevonian extends GenLayer {


    public Biome DEVONIAN_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_hills"));
    public int DEVONIAN_HILLS_ID =  Biome.getIdForBiome(DEVONIAN_HILLS);
    public Biome DEVONIAN_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_floodplain"));
    public int DEVONIAN_FLOODPLAIN_ID =  Biome.getIdForBiome(DEVONIAN_FLOODPLAIN);

    
    private final int ForestBiomes[] = new int[] {
        DEVONIAN_HILLS_ID,
        DEVONIAN_HILLS_ID,
        DEVONIAN_FLOODPLAIN_ID
    };

    public GenLayerDiversifyDevonian(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeDevonianHills.biome)
                        output[i] = ForestBiomes[nextInt(ForestBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}