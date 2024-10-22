package net.lepidodendron.util.patchouli;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class BiomeSpawns1 implements IComponentProcessor {

    String biome;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.biome = iVariableProvider.get("biome");
    }

    @Override
    public String process(String s) {

        if (Biome.REGISTRY.getObject(new ResourceLocation(this.biome)) == null) {
            return BiomeSpawns.biomeMissing;
        }

        String spawnList = BiomeSpawns.getSpawnList(this.biome, 0, 13);
        if (spawnList != null) {
            if (!spawnList.equalsIgnoreCase("")) {
                return spawnList;
            }
        }
        return BiomeSpawns.spawnsEmpty;
    }

}
