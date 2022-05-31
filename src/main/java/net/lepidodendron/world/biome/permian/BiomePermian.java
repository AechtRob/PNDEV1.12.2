package net.lepidodendron.world.biome.permian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.minecraft.world.biome.Biome;

public abstract class BiomePermian extends Biome {
    public BiomePermian(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypePermian getBiomeType();


}