package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassicFloodedForest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyTriassic3 extends GenLayer {

    public Biome TRIASSIC_FLOODED_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_flooded_forest"));
    public int TRIASSIC_FLOODED_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_FLOODED_FOREST);


    public Biome TRIASSIC_FLOODED_FOREST_DENSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_flooded_forest_dense"));
    public int TRIASSIC_FLOODED_FOREST_DENSE_ID =  Biome.getIdForBiome(TRIASSIC_FLOODED_FOREST_DENSE);



    private final int SwampBiomes[] = new int[] {
            TRIASSIC_FLOODED_FOREST_ID,
            TRIASSIC_FLOODED_FOREST_ID,
            TRIASSIC_FLOODED_FOREST_ID,
            TRIASSIC_FLOODED_FOREST_ID,
            TRIASSIC_FLOODED_FOREST_ID,
            TRIASSIC_FLOODED_FOREST_DENSE_ID,
            TRIASSIC_FLOODED_FOREST_DENSE_ID
    };

    public GenLayerDiversifyTriassic3(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeTriassicFloodedForest.biome)
                        output[i] = SwampBiomes[nextInt(SwampBiomes.length)];

                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}