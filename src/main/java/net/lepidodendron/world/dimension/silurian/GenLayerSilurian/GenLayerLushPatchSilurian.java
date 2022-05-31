package net.lepidodendron.world.dimension.silurian.GenLayerSilurian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.silurian.BiomeSilurianLand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerLushPatchSilurian extends GenLayer {

    public  Biome OS_LAND = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:silurian_land"));
    public  int OS_LAND_ID =  Biome.getIdForBiome(OS_LAND);
    public  Biome OS_LUSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:silurian_lush_patch"));
    public  int OS_LUSH_ID =  Biome.getIdForBiome(OS_LUSH);

    private final int LandBiomes[] = new int[] {
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LAND_ID,
            OS_LUSH_ID
    };

    public GenLayerLushPatchSilurian(long seed, GenLayer genlayer) {
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
                if (nextInt(3) == 0) {
                    if (Biome.getBiome(center) == BiomeSilurianLand.biome)
                        output[i] = LandBiomes[nextInt(LandBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}