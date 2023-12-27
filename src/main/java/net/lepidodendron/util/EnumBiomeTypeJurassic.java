package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeJurassic implements IStringSerializable {

    Pasture("pasture"),
    Garrigue("garrigue"),
    Floodplain("floodplain"),
    Forest("forest"),
    Highlands("highlands"),
    Rocks("rocks"),
    Ginkgo("ginkgo"),
    Mudflats("mudflats"),
    Coniferous("coniferous"),
    IslandSand("island_sandy"), //Jurassic Sandy Islands
    IslandWhite("island_sandy_white"), //Jurassic White Sandy Islands
    IslandRock("island_rocky"), //Jurassic Rocky Islands
    Taiga("taiga"),
    Mire("mire"),
    Lake("lake"),
    River("river"),
    Desert("desert"),
    Ocean("ocean");

    private final String name;

    private EnumBiomeTypeJurassic(String name) {
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