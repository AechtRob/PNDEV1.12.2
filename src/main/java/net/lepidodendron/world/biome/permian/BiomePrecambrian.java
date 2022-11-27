package net.lepidodendron.world.biome.permian;

import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.minecraft.world.biome.Biome;

public abstract class BiomePrecambrian extends Biome {
    public BiomePrecambrian(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypePrecambrian getBiomeType();


}