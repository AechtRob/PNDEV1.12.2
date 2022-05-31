package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypePermian implements IStringSerializable {

    Glossopteris("glossopteris"),
    Arid("arid"),
    Desert("desert"),
    Wetlands("wetlands"),
    Lowlands("lowlands"),
    River("river"),
    Highlands("highlands"),
    Floodbasalt("floodbasalt"),
    Forest("forest"),
    Ocean("ocean")
    ;

    private final String name;

    private EnumBiomeTypePermian(String name) {
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