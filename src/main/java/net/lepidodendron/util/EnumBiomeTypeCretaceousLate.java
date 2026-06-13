package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCretaceousLate implements IStringSerializable {

    //Continents:
    Late_Cretaceous_Africa("late_cretaceous_africa"),
    Late_Cretaceous_Asia("late_cretaceous_asia"),
    Late_Cretaceous_Europe("late_cretaceous_europe"),
    Late_Cretaceous_North_America("late_cretaceous_north_america"),
    Late_Cretaceous_South_America("late_cretaceous_south_america"),

    //Islands (i.e. in Deep Ocean):
    Late_Cretaceous_Austro_Antarctica("late_cretaceous_austro_antarctica"),
    Late_Cretaceous_India("late_cretaceous_india"),
    Late_Cretaceous_Madagascar("late_cretaceous_madagascar"),

    //Seas:
    Late_Cretaceous_Ocean("late_cretaceous_ocean"),
    Late_Cretaceous_Ocean_Shore_Tethys_North("late_cretaceous_ocean_tethys_north"),
    Late_Cretaceous_Ocean_Shore_Tethys_South("late_cretaceous_ocean_tethys_south"),
    Late_Cretaceous_Ocean_Shore_Pacific("late_cretaceous_ocean_pacific"),
    Late_Cretaceous_Ocean_Shore_Atlantic("late_cretaceous_ocean_atlantic"),
    Late_Cretaceous_Ocean_Shore_Southern("late_cretaceous_ocean_southern");

    private final String name;

    private EnumBiomeTypeCretaceousLate(String name) {
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