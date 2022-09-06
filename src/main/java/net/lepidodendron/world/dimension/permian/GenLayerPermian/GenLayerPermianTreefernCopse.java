package net.lepidodendron.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermianWetlandsUnwooded;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianTreefernCopse extends GenLayer {


    public  Biome PERMIAN_WETLANDS_UNWOODED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public  int PERMIAN_WETLANDS_UNWOODED_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_UNWOODED);

    public  Biome PERMIAN_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_fern_copse"));
    public  int PERMIAN_COPSE_ID =  Biome.getIdForBiome(PERMIAN_COPSE);


    private final int WetlandsBiomes[] = new int[] {
        PERMIAN_WETLANDS_UNWOODED_ID,
        PERMIAN_WETLANDS_UNWOODED_ID,
        PERMIAN_WETLANDS_UNWOODED_ID,
        PERMIAN_COPSE_ID,
        PERMIAN_WETLANDS_UNWOODED_ID,
        PERMIAN_WETLANDS_UNWOODED_ID,
        PERMIAN_COPSE_ID
    };

    public GenLayerPermianTreefernCopse(long seed, GenLayer genlayer) {
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
        EnumBiomeTypePermian type;
        for (int zOut = 0; zOut < height; zOut++) {
            for (int xOut = 0; xOut < width; xOut++) {
                int i = xOut + zOut * width;
                int center = input[i];
                initChunkSeed(xOut + x, zOut + z);
                if (nextInt(2) == 0) {
                    if (Biome.getBiome(center) == BiomePermianWetlandsUnwooded.biome)
                        output[i] = WetlandsBiomes[nextInt(WetlandsBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}