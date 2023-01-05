package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypePrecambrian implements IStringSerializable {

    Hadean("hadean"),
    Archean("archean"),
    Paleoproterozoic("paleoproterozoic"),
    Mesoproterozoic("mesoproterozoic"),
    Neoproterozoic("neoproterozoic"),
    Ediacaran("ediacaran"),
    Proterozoic_Land("proterozoic_land")
    ;

    private final String name;

    private EnumBiomeTypePrecambrian(String name) {
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