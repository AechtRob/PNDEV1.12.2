package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCretaceousEarly implements IStringSerializable {

    Early_Cretaceous_South_America("early_cretaceous_south_america"),
    Early_Cretaceous_Africa("early_cretaceous_africa"),
    Early_Cretaceous_Asia("early_cretaceous_asia"),
    Early_Cretaceous_Europe("early_cretaceous_europe"),
    Early_Cretaceous_North_America("early_cretaceous_north_america"),
    Early_Cretaceous_Australia_Antarctica("early_cretaceous_australia_antarctica"),
    Early_Cretaceous_India_Madagascar("early_cretaceous_india_madagascar"),

    Early_Cretaceous_Ocean("early_cretaceous_ocean"),
    Early_Cretaceous_Ocean_Shore_Tethys("early_cretaceous_ocean_tethys"),
    Early_Cretaceous_Ocean_Shore_Pacific("early_cretaceous_ocean_pacific"),
    Early_Cretaceous_Ocean_Shore_North_Atlantic("early_cretaceous_ocean_north_atlantic"),
    Early_Cretaceous_Ocean_Shore_South_Atlantic("early_cretaceous_ocean_south_atlantic"),
    Early_Cretaceous_Ocean_Shore_Southern("early_cretaceous_ocean_southern");

    private final String name;

    private EnumBiomeTypeCretaceousEarly(String name) {
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