package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.jurassic.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyJurassic3 extends GenLayer {

    public Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);
    public Biome JURASSIC_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue_copse"));
    public int JURASSIC_COPSE_ID =  Biome.getIdForBiome(JURASSIC_COPSE);

    private final int GarrigueBiomes[] = new int[] {
        JURASSIC_COPSE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID
    };

    public GenLayerDiversifyJurassic3(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeJurassicGarrigue.biome) {
                        output[i] = GarrigueBiomes[nextInt(GarrigueBiomes.length)];
                    }
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}