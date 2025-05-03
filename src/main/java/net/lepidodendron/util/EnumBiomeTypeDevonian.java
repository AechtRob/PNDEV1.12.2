package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeDevonian implements IStringSerializable {

    Swamp("swamp"),
    Floodplain("floodplain"),
    Forest("forest"),
    Ocean("ocean"),
    Springs("springs"),
    Mountains("mountains"),
    Savanna("savanna"),
    Hypersaline("hypersaline"),
    Vale("vale"),
    Meadow("meadow"),
    Brackish("brackish"),
    Gilboa("gilboa"),
    ColdGondwana("waterloo"),
    MountainsEarly("mountains_early"),
    Lagoon("lagoon")
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