package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCretaceousEarly implements IStringSerializable {

    Early_Cretaceous_Afro_America("early_cretaceous_afro_america"),
    Early_Cretaceous_Asia("early_cretaceous_asia"),
    Early_Cretaceous_Euro_America("early_cretaceous_euro_america"),
    Early_Cretaceous_Austro_Antarctica("early_cretaceous_austro_antarctica"),

    Early_Cretaceous_Ocean("early_cretaceous_ocean"),
    Early_Cretaceous_Ocean_Shore_Tethys("early_cretaceous_ocean_tethys"),
    Early_Cretaceous_Ocean_Shore_Pacific("early_cretaceous_ocean_pacific"),
    Early_Cretaceous_Ocean_Shore_Atlantic("early_cretaceous_ocean_atlantic"),
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