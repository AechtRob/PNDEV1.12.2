package net.lepidodendron.world.biome.cretaceous;

import net.lepidodendron.util.EnumBiomeTypeCretaceousLate;
import net.lepidodendron.world.BiomeDecoratorPN;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public abstract class BiomeCretaceousLate extends Biome {

    public BiomeCretaceousLate(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeCretaceousLate getBiomeType();

    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecoratorPN());
    }

}
