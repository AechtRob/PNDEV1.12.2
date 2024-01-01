package net.lepidodendron.world.biome.devonian;

import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.BiomeDecoratorPN;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public abstract class BiomeDevonian extends Biome {
    public BiomeDevonian(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeDevonian getBiomeType();

    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecoratorPN());
    }

}