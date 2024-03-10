package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCarboniferous implements IStringSerializable {

    Swamp("swamp"),
    Marsh("marsh"),
    Ice("ice"),
    Ocean("ocean"),
    Hills("hills"),
    Estuary("estuary"),
    Savanna("savanna"),
    Volcanic("volcanic"),
    Fen("fen")
    ;

    private final String name;

    private EnumBiomeTypeCarboniferous(String name) {
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