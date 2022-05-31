package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeDevonian implements IStringSerializable {

    Swamp("swamp"),
    Floodplain("floodplain"),
    Forest("forest"),
    Ocean("ocean"),
    Springs("hot_springs"),
    Mountains("mountains"),
    Hypersaline("hypersaline")
    ;

    private final String name;

    private EnumBiomeTypeDevonian(String name) {
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