package net.lepidodendron.util.patchouli;

import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class SpawnLocations3 implements IComponentProcessor {

    String mob;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.mob = iVariableProvider.get("mob");
    }

    @Override
    public String process(String s) {
        String biomeList = SpawnLocations1.getBiomeList(this.mob, 32, 49);
        if (biomeList != null) {
            if (!biomeList.equalsIgnoreCase("")) {
                return biomeList;
            }
        }
        return "";
    }

}
