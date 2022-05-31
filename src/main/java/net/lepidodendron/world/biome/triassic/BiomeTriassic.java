package net.lepidodendron.world.biome.triassic;

import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.minecraft.world.biome.Biome;

public abstract class BiomeTriassic extends Biome {
    public BiomeTriassic(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeTriassic getBiomeType();


}