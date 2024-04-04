package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCretaceousLate implements IStringSerializable {

    Late_Cretaceous_Africa("late_africa"),
    Late_Cretaceous_South_America("late_s_america"),
    Late_Cretaceous_Appalachia("late_appalachia"),
    Late_Cretaceous_Laramidia("late_laramidia"),
    Late_Cretaceous_Eurasia("late_eurasia"),
    Late_Cretaceous_Australia_Antarctica("late_australia_antarctica"),
    Late_Cretaceous_India_Madagascar("late_india_madagascar"),
    Late_Cretaceous_Hateg("late_hațeg"),
    Late_Cretaceous_Ocean_Warm("late_ocean_warm"),
    Late_Cretaceous_Ocean_Temperate("late_ocean_temperate"),
    Late_Cretaceous_Ocean_Cool("late_ocean_cool");

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