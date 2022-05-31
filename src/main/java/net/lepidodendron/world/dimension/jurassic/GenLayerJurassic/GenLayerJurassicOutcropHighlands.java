package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassicRoughHills;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicOutcropHighlands extends GenLayer {


    public Biome JURASSIC_ROUGH_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_rough_hills"));
    public int JURASSIC_ROUGH_HILLS_ID =  Biome.getIdForBiome(JURASSIC_ROUGH_HILLS);
    public Biome JURASSIC_OUTCROP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_outcrops"));
    public int JURASSIC_OUTCROP_ID =  Biome.getIdForBiome(JURASSIC_OUTCROP);

    private final int HighlandBiomes[] = new int[] {
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_ROUGH_HILLS_ID,
        JURASSIC_OUTCROP_ID
    };

    public GenLayerJurassicOutcropHighlands(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeJurassicRoughHills.biome)
                        output[i] = HighlandBiomes[nextInt(HighlandBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}