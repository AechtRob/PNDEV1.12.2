package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeOrdovician implements IStringSerializable {

    BarrenLand("barren_land"),
    FrozenLand("frozen_land"),
    Bog("bog"),
    Estuary("estuary"),
    Ocean("ocean"),
    Sponge("sponge"),
    Algae("algae"),
    Bryozoan("bryozoan"),
    FrozenOcean("frozen_ocean")
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