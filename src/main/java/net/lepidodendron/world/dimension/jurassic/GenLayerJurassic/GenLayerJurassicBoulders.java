package net.lepidodendron.world.dimension.jurassic.GenLayerJurassic;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassicCycadThickets;
import net.lepidodendron.world.biome.jurassic.BiomeJurassicGarrigue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerJurassicBoulders extends GenLayer {

    public  Biome JURASSIC_GARRIGUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_garrigue"));
    public  int JURASSIC_GARRIGUE_ID =  Biome.getIdForBiome(JURASSIC_GARRIGUE);
    public  Biome JURASSIC_BOULDERS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_boulders"));
    public  int JURASSIC_BOULDERS_ID =  Biome.getIdForBiome(JURASSIC_BOULDERS);
    public  Biome JURASSIC_CYCAD_THICKETS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_cycad_thickets"));
    public  int JURASSIC_CYCAD_THICKETS_ID =  Biome.getIdForBiome(JURASSIC_CYCAD_THICKETS);

    private final int GarrigueBiomes[] = new int[] {
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_GARRIGUE_ID,
        JURASSIC_CYCAD_THICKETS_ID,
        JURASSIC_BOULDERS_ID,
        JURASSIC_BOULDERS_ID
    };

    public GenLayerJurassicBoulders(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeJurassicGarrigue.biome
                    || Biome.getBiome(center) == BiomeJurassicCycadThickets.biome)
                        output[i] = GarrigueBiomes[nextInt(GarrigueBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}