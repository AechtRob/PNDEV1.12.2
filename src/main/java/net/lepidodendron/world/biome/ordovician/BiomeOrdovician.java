package net.lepidodendron.world.biome.ordovician;

import net.lepidodendron.util.EnumBiomeTypeOrdovician;
import net.minecraft.world.biome.Biome;

public abstract class BiomeOrdovician extends Biome {
    public BiomeOrdovician(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeOrdovician getBiomeType();

}