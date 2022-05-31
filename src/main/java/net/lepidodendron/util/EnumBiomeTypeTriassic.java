package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeTriassic implements IStringSerializable {

    Cool("cool"),
    Desert("desert"),
    River("river"),
    Xeric("xeric"),
    Warm("warm"),
    Mountain("mountains"),
    Swamp("swamp"),
    Ocean("ocean"),
    Island("island");

    private final String name;

    private EnumBiomeTypeTriassic(String name) {
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