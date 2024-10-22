package net.lepidodendron.util.patchouli;

import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class BiomeSpawns3 implements IComponentProcessor {

    String biome;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.biome = iVariableProvider.get("biome");
    }

    @Override
    public String process(String s) {
        String spawnList = BiomeSpawns.getSpawnList(this.biome, 29, 43);
        if (spawnList != null) {
            if (!spawnList.equalsIgnoreCase("")) {
                return spawnList;
            }
        }
        return "";
    }

}
