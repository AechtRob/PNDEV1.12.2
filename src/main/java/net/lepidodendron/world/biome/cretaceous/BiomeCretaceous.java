package net.lepidodendron.world.biome.cretaceous;

import net.lepidodendron.util.EnumBiomeTypeCretaceous;
import net.minecraft.world.biome.Biome;

public abstract class BiomeCretaceous extends Biome {
    public BiomeCretaceous(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeCretaceous getBiomeType();


}