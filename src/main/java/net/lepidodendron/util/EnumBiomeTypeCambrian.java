package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCambrian implements IStringSerializable {

    BarrenLand("barren_land"),
    Dusty("dusty_land"),
    Moist("moist_land"),
    Estuary("estuary"),
    Ocean("ocean"),
    Reef("reef")
    ;

    private final String name;

    private EnumBiomeTypeCambrian(String name) {
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