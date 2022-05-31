package net.lepidodendron.world.dimension.carboniferous.GenLayerCarboniferous;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferousSwamp;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyCarboniferous extends GenLayer {

    public  Biome CARBONIFEROUS_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_swamp"));
    public  int CARBONIFEROUS_SWAMP_ID =  Biome.getIdForBiome(CARBONIFEROUS_SWAMP);
    public  Biome CARBONIFEROUS_SWAMP_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_swamp_hills"));
    public  int CARBONIFEROUS_SWAMP_HILLS_ID =  Biome.getIdForBiome(CARBONIFEROUS_SWAMP_HILLS);
    public  Biome CARBONIFEROUS_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_hills"));
    public  int CARBONIFEROUS_HILLS_ID =  Biome.getIdForBiome(CARBONIFEROUS_HILLS);


    private final int SwampBiomes[] = new int[] {
        CARBONIFEROUS_SWAMP_ID,
        CARBONIFEROUS_SWAMP_HILLS_ID,
        CARBONIFEROUS_HILLS_ID,
    };

    public GenLayerDiversifyCarboniferous(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeCarboniferousSwamp.biome)
                        output[i] = SwampBiomes[nextInt(SwampBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}