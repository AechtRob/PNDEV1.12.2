package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassicGondwananForest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyTriassic4 extends GenLayer {

    public Biome TRIASSIC_GONDWANAN_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest"));
    public int TRIASSIC_GONDWANAN_FOREST_ID =  Biome.getIdForBiome(TRIASSIC_GONDWANAN_FOREST);

    public Biome TRIASSIC_GONDWANAN_FOREST_CLEARING = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_gondwanan_forest_clearing"));
    public int TRIASSIC_GONDWANAN_FOREST_CLEARING_ID =  Biome.getIdForBiome(TRIASSIC_GONDWANAN_FOREST_CLEARING);


    private final int CoolBiomes[] = new int[] {
            TRIASSIC_GONDWANAN_FOREST_ID,
            TRIASSIC_GONDWANAN_FOREST_ID,
            TRIASSIC_GONDWANAN_FOREST_ID,
            TRIASSIC_GONDWANAN_FOREST_ID,
            TRIASSIC_GONDWANAN_FOREST_ID,
            TRIASSIC_GONDWANAN_FOREST_CLEARING_ID,
            TRIASSIC_GONDWANAN_FOREST_CLEARING_ID
    };

    public GenLayerDiversifyTriassic4(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeTriassicGondwananForest.biome)
                        output[i] = CoolBiomes[nextInt(CoolBiomes.length)];

                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}