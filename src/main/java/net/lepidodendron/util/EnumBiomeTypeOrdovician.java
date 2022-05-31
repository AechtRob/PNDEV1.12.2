package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeOrdovician implements IStringSerializable {

    Land("land"),
    Ocean("ocean")
    ;

    private final String name;

    private EnumBiomeTypeOrdovician(String name) {
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