package net.lepidodendron.world.biome.carboniferous;

import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.world.BiomeDecoratorPN;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public abstract class BiomeCarboniferous extends Biome {
    public BiomeCarboniferous(BiomeProperties properties) {
        super(properties);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract EnumBiomeTypeCarboniferous getBiomeType();

    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecoratorPN());
    }

}