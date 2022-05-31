package net.lepidodendron.world.dimension.triassic.GenLayerTriassic;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassicOceanShore;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyTriassicShallowOcean extends GenLayer {

    public  Biome TRIASSIC_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_shore"));
    public  int TRIASSIC_OCEAN_SHORE_ID =  Biome.getIdForBiome(TRIASSIC_OCEAN_SHORE);
    public  Biome TRIASSIC_CLAM_BEDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_ocean_clam_beds"));
    public  int TRIASSIC_CLAM_BEDS_ID =  Biome.getIdForBiome(TRIASSIC_CLAM_BEDS);


    private final int BiomesShallow[] = new int[] {
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_OCEAN_SHORE_ID,
        TRIASSIC_CLAM_BEDS_ID
    };

    public GenLayerDiversifyTriassicShallowOcean(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeTriassicOceanShore.biome)
                        output[i] = BiomesShallow[nextInt(BiomesShallow.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}