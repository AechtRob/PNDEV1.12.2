package net.lepidodendron.world.biome.triassic;

import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.lepidodendron.world.BiomeDecoratorPN;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public abstract class BiomeTriassic extends Biome {
    public BiomeTriassic(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeTriassic getBiomeType();

    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecoratorPN());
    }

}