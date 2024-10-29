package net.lepidodendron.util.patchouli;

import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class Headerlesstext implements IComponentProcessor {

    String text;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.text = iVariableProvider.get("text");
    }

    @Override
    public String process(String s) {
        return this.text;
    }
}
