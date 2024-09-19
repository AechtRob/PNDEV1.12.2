package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

import javax.annotation.Nullable;
import java.util.Collections;

public class SpawnLocations1 implements IComponentProcessor {

    public static final String biomeUnknown = "$(br)Biomes not yet defined or not present in this modpack";

    String mob;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.mob = iVariableProvider.get("mob");
    }

    @Override
    public String process(String s) {
        String biomeList = getBiomeList(this.mob, 0, 8);
        if (biomeList != null) {
            if (!biomeList.equalsIgnoreCase("")) {
                return biomeList;
            }
        }
        return biomeUnknown;
    }

    @Nullable
    public static String getBiomeList(String mobID, int from, int to) {
        String biomeList = "$(br)";
        String biomeListFinal = "$(br)";
        int i = 0;
        ObjectArrayList<String> biomeArray = new ObjectArrayList<String>();
        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            biomeArray.add(biome.getRegistryName().toString());
        }
        if (!biomeArray.isEmpty()) {
            Collections.sort(biomeArray);
            for (String biomeID : biomeArray) {
                String biomeName = ForgeRegistries.BIOMES.getValue(new ResourceLocation(biomeID)).getBiomeName();
                if (biomeName.length() > 0 && !biomeName.equalsIgnoreCase("null")) {
                    if (!biomeList.contains("$(br)" + biomeName + "$(br)")) {
                        if (SpawnLocations.spawnsHere(mobID, biomeID)) {
                            i ++;
                            biomeList = biomeList + biomeName + "$(br)";
                            if (i > from && i <= to) {
                                biomeListFinal = biomeListFinal + "$(li)" + biomeName + "$(br)";
                            }
                            if (i > 35) {
                                if (from == 0) {
                                    return "$(br)Widespread";
                                }
                                else {
                                    return "";
                                }
                            }
                        }
                    }
                }
            }
            if (!biomeListFinal.equalsIgnoreCase("$(br)")) {
                if (i <= to) {
                    biomeListFinal = biomeListFinal.substring(0, biomeListFinal.length() - 5);
                }
                return biomeListFinal;
            }
        }
        if (from == 0) {
            return biomeUnknown;
        }
        return "";
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
