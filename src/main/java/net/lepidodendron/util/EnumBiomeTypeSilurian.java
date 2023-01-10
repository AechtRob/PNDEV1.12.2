package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeSilurian implements IStringSerializable {

    BarrenLand("barren_land"),
    Dusty("dusty_land"),
    Lush("lush"),
    Ocean("ocean"),
    Reef("reef"),
    Crinoid("crinoid")
    ;

    private final String name;

    private EnumBiomeTypeSilurian(String name) {
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