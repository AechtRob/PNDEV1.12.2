package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferousIce;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCarboniferousIceSpikes extends GenLayer {

    public  Biome CARBONIFEROUS_ICE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert"));
    public  int CARBONIFEROUS_ICE_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE);
    public  Biome CARBONIFEROUS_ICE_SPIKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_polar_desert_spikes"));
    public  int CARBONIFEROUS_ICE_SPIKES_ID =  Biome.getIdForBiome(CARBONIFEROUS_ICE_SPIKES);

    private final int IceBiomes[] = new int[] {
        CARBONIFEROUS_ICE_ID,
        CARBONIFEROUS_ICE_ID,
        CARBONIFEROUS_ICE_SPIKES_ID,
    };

    public GenLayerCarboniferousIceSpikes(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeCarboniferousIce.biome)
                        output[i] = IceBiomes[nextInt(IceBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}