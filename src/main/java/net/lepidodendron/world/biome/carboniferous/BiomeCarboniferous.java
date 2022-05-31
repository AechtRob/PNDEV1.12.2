package net.lepidodendron.world.biome.carboniferous;

import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.minecraft.world.biome.Biome;

public abstract class BiomeCarboniferous extends Biome {
    public BiomeCarboniferous(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeCarboniferous getBiomeType();

}