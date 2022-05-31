package net.lepidodendron.world.biome.silurian;

import net.lepidodendron.util.EnumBiomeTypeSilurian;
import net.minecraft.world.biome.Biome;

public abstract class BiomeSilurian extends Biome {
    public BiomeSilurian(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeSilurian getBiomeType();

}