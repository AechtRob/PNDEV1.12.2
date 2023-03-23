package net.lepidodendron.util;

import net.minecraft.util.IStringSerializable;

public enum EnumBiomeTypeCretaceous implements IStringSerializable {

    Early_Cretaceous_South_America_Africa("early_s_america_africa"),
    Early_Cretaceous_Lauasia("early_laurasia"),
    Early_Cretaceous_Australia_Antarctica("early_australia_antarctica"),
    Late_Cretaceous_Africa("late_africa"),
    Late_Cretaceous_South_America("late_s_america"),
    Late_Cretaceous_Appalachia("late_appalachia"),
    Late_Cretaceous_Laramidia("late_laramidia"),
    Late_Cretaceous_Eurasia("late_eurasia"),
    Late_Cretaceous_Australia_Antarctica("late_australia_antarctica"),
    Late_Cretaceous_India_Madagascar("late_india_madagascar"),
    Late_Cretaceous_Hateg("late_hațeg"),
    Early_Cretaceous_Ocean_Warm("early_ocean_warm"),
    Early_Cretaceous_Ocean_Temperate("early_ocean_temperate"),
    Early_Cretaceous_Ocean_Cool("early_ocean_cool"),
    Late_Cretaceous_Ocean_Warm("late_ocean_warm"),
    Late_Cretaceous_Ocean_Temperate("late_ocean_temperate"),
    Late_Cretaceous_Ocean_Cool("late_ocean_cool");

    private final String name;

    private EnumBiomeTypeCretaceous(String name) {
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