package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeJurassic implements IStringSerializable {

    Pasture("pasture"),
    Garrigue("garrigue"),
    Floodplain("floodplain"),
    Forest("forest"),
    Highlands("highlands"),
    Rocks("rocks"),
    Ginkgo("ginkgo"),
    Mudflats("mudflats"),
    Redwood("redwood"),
    Sandbanks("sandbanks"),
    Taiga("taiga"),
    River("river"),
    Ocean("ocean");

    private final String name;

    private EnumBiomeTypeJurassic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}