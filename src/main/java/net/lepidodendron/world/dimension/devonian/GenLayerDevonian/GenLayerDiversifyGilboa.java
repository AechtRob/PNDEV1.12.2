package net.lepidodendron.world.dimension.devonian.GenLayerDevonian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.devonian.BiomeDevonianFloodplain;
import net.lepidodendron.world.biome.devonian.BiomeDevonianSwamp;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDiversifyGilboa extends GenLayer {


    public Biome DEVONIAN_GILBOA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_gilboa"));
    public int DEVONIAN_GILBOA_ID =  Biome.getIdForBiome(DEVONIAN_GILBOA);
    public Biome DEVONIAN_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_floodplain"));
    public int DEVONIAN_FLOODPLAIN_ID =  Biome.getIdForBiome(DEVONIAN_FLOODPLAIN);
    public Biome DEVONIAN_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:devonian_swamp"));
    public int DEVONIAN_SWAMP_ID =  Biome.getIdForBiome(DEVONIAN_SWAMP);

    private final int FloodplainBiomes[] = new int[] {
            DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_FLOODPLAIN_ID,
            //DEVONIAN_FLOODPLAIN_ID,
            DEVONIAN_GILBOA_ID
    };

    private final int SwampBiomes[] = new int[] {
            DEVONIAN_SWAMP_ID,
            DEVONIAN_SWAMP_ID,
            DEVONIAN_SWAMP_ID,
            DEVONIAN_SWAMP_ID,
            DEVONIAN_SWAMP_ID,
            DEVONIAN_SWAMP_ID,
            //DEVONIAN_SWAMP_ID,
            DEVONIAN_GILBOA_ID
    };

    public GenLayerDiversifyGilboa(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomeDevonianFloodplain.biome)
                        output[i] = FloodplainBiomes[nextInt(FloodplainBiomes.length)];
                    else if (Biome.getBiome(center) == BiomeDevonianSwamp.biome)
                        output[i] = SwampBiomes[nextInt(SwampBiomes.length)];
                    else
                        output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}