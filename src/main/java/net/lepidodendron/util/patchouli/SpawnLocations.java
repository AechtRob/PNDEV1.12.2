package net.lepidodendron.util.patchouli;

import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SpawnLocations {

    public static boolean spawnsHere(String mobID, String biomeID) {
        if (biomeID.startsWith("lepidodendron:")) { //We exclude creeks as seperate spawn biomes for the purposes of the book lists
            if (biomeID.contains("_creek_")) {
                return false;
            }
        }
        Biome biome = ForgeRegistries.BIOMES.getValue(new ResourceLocation(biomeID));
        String[] possibleMobs = EntityLists.mobString(biome);
        boolean spawns = false;
        String pnVariant = "";
        int i = mobID.indexOf("@");
        if (i > 0) {
            pnVariant = mobID.substring(i + 1);
            mobID = mobID.substring(0, i);
        }
        if (mobID.equalsIgnoreCase("lepidodendron:prehistoric_flora_piranhamesodon")) {
            mobID = "lepidodendron:prehistoric_flora_turboscinetes";
            //They school with this
        }
        if (matchMob(mobID + ":", possibleMobs) || matchMob(mobID + "{", possibleMobs)
            || (
                    mobID.contains("lepidodendron:prehistoric_flora_roachoid_") && matchMob("lepidodendron:prehistoric_flora_roachoid_", possibleMobs)
                )) {
            if (pnVariant.equalsIgnoreCase("")) {
                spawns = true;
            }
            else {
                if (matchMob("PNType:\"" + pnVariant + "\"", possibleMobs)) {
                    spawns = true;
                }
            }
        }
        if (mobID.equalsIgnoreCase("lepidodendron:prehistoric_flora_websteroprion")) {
            if (biomeID.equalsIgnoreCase("lepidodendron:devonian_creek_coastal")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_forest")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_ocean")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_reef")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_reef_transition")
                || biomeID.equalsIgnoreCase("lepidodendron:devonian_beach"))
            {
                spawns = true;
            }
        }
        if (mobID.equalsIgnoreCase("lepidodendron:prehistoric_flora_dorygnathus")) {
            if (biomeID.equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")
                    || biomeID.equalsIgnoreCase("lepidodendron:jurassic_ocean_coral"))
            {
                spawns = true;
            }
        }
        return spawns;
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
