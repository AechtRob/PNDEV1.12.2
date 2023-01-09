package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeSilurian implements IStringSerializable {

    BarrenLand("barren_land"),
    Lowland("lowland"),
    Ocean("ocean")
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