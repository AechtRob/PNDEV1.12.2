package net.lepidodendron.world.biome.cambrian;

import net.lepidodendron.util.EnumBiomeTypeCambrian;
import net.minecraft.world.biome.Biome;

public abstract class BiomeCambrian extends Biome {
    public BiomeCambrian(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeCambrian getBiomeType();

}