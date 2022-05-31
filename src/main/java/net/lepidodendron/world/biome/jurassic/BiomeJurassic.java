package net.lepidodendron.world.biome.jurassic;

import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.minecraft.world.biome.Biome;

public abstract class BiomeJurassic extends Biome {
    public BiomeJurassic(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeJurassic getBiomeType();


}