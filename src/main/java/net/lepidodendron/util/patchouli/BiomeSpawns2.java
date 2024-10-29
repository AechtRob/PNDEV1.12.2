package net.lepidodendron.util.patchouli;

import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class BiomeSpawns2 implements IComponentProcessor {

    String biome;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.biome = iVariableProvider.get("biome");
    }

    @Override
    public String process(String s) {
        String spawnList = BiomeSpawns.getSpawnList(this.biome, 14, 28);
        if (spawnList != null) {
            if (!spawnList.equalsIgnoreCase("")) {
                return spawnList;
            }
        }
        return "";
    }

}
