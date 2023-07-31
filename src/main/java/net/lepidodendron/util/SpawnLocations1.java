package net.lepidodendron.util;

import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;

public class SpawnLocations1 implements IComponentProcessor {

    public static final String biomeUnknown = "Biomes not yet defined or not present in this modpack";

    String mob;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.mob = iVariableProvider.get("mob");
    }

    @Override
    public String process(String s) {
        String biomeList = getBiomeList(this.mob);
        if (biomeList != null) {
            if (!biomeList.equalsIgnoreCase("")) {
                return biomeList;
            }
        }
        return biomeUnknown;
    }

    @Nullable
    public static String getBiomeList(String mobID) {
        String biomeList = "; ";
        String biomeListFinal = "; ";
        int i = 0;
        ArrayList<String> biomeArray = new ArrayList<String>();
        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            biomeArray.add(biome.getRegistryName().toString());
        }
        if (!biomeArray.isEmpty()) {
            Collections.sort(biomeArray);
            for (String biomeID : biomeArray) {
                String biomeName = ForgeRegistries.BIOMES.getValue(new ResourceLocation(biomeID)).getBiomeName();
                if (biomeName.length() > 0 && !biomeName.equalsIgnoreCase("null")) {
                    if (!biomeList.contains("; " + biomeName + "; ")) {
                        if (spawnsHere(mobID, biomeID)) {
                            i ++;
                            biomeList = biomeList + biomeName + "; ";
                            if (i <= 15) {
                                biomeListFinal = biomeListFinal + biomeName + "; ";
                            }
                        }
                    }
                }
            }
            if (!biomeListFinal.equalsIgnoreCase("; ")) {
                biomeListFinal = biomeListFinal.substring(2);
                if (i <= 15) {
                    biomeListFinal = biomeListFinal.substring(0, biomeListFinal.length() - 2);
                }
                return biomeListFinal;
            }
        }
        return biomeUnknown;
    }

    public static boolean spawnsHere(String mobID, String biomeID) {
        Biome biome = ForgeRegistries.BIOMES.getValue(new ResourceLocation(biomeID));
        String[] possibleMobs = EntityLists.mobString(biome, 0);
        return matchMob(mobID + ":", possibleMobs) || matchMob(mobID + "{", possibleMobs);
    }

    public static boolean matchMob(String mob, String[] mobList) {

        for (String mobFromList : mobList) {
            if (mobFromList.contains(mob)) {
                return true;
            }
        }
        return false;
    }
}
