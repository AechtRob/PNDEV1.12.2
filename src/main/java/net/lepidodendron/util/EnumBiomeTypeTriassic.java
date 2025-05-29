package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeTriassic implements IStringSerializable {

    SouthAmericaAusAnt("southamerica_australia_antarctic"),
    CentralAfricaIndia("centralafrica_india"),
    SouthAfricaMadagascar("southafrica_madagascar"),
    Desert("desert"),
    River("river"),
    Europe("europe"),
    Mountain("mountains"),
    Chinle("chinle"),
    USAGreenland("usa_greenland"),
    Ocean("ocean"),
    China("china"),
    Asia("asia");

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