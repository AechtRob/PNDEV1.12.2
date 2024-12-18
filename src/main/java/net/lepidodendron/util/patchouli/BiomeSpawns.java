package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BiomeSpawns {

    public static final String spawnsEmpty = "$(br)No mobs spawn here";
    public static final String biomeMissing = "$(br)This biome is not currently installed";

    @Nullable
    public static String getSpawnList(String biomeID, int from, int to) {
        String spawnListFinal = "$(br)";
        Biome biome = Biome.REGISTRY.getObject(new ResourceLocation(biomeID));
        if (biome == null) {
            if (from == 0) {
                return spawnsEmpty;
            }
            return "";
        }
        String[] mobList = EntityLists.mobString(biome);
        if (biomeID.equalsIgnoreCase("lepidodendron:jurassic_island_large_field")) {
            //Need to combine several biomes together for this one!
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_island_large_scrub"));
            String[] mobList1 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_island_large_wet"));
            String[] mobList2 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner2 = new ObjectArrayList<String>(Arrays.asList(mobList2));
            spawnListJoiner.addAll(spawnListJoiner1);
            spawnListJoiner.addAll(spawnListJoiner2);
            mobList = spawnListJoiner.toArray(mobList);
        }
        //Websteroprioin spawns as a block, so this needs an overrride here:
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
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            spawnListJoiner.add("lepidodendron:prehistoric_flora_websteroprion");
            mobList = spawnListJoiner.toArray(mobList);
        }
        ObjectArrayList<String> spawnListInterim = new ObjectArrayList<String>();
        if (mobList.length >= 1) {
            for (String entry : mobList) {
                String entryName = entry;
                String strNBT = "";
                if (entry.indexOf("{") >= 0) {
                    entryName = entry.substring(0, entry.indexOf("{"));
                    strNBT = entry.substring(entry.indexOf("{"), entry.indexOf("}:") + 1);
                }
                if (entryName.indexOf(":", entryName.indexOf(":") + 1) >= 0) {
                    entryName = entryName.substring(0, entryName.indexOf(":", entryName.indexOf(":") + 1));
                }
                String mobName[] = getMobName(entryName, strNBT);
                if (mobName != null) {
                    for (String name : mobName) {
                        if (!spawnListInterim.contains(name)) {
                            spawnListInterim.add(name);
                        }
                    }
                    if (entry.contains("lepidodendron:prehistoric_flora_turboscinetes")) {
                        //They school with this
                        String mobNameT[] = getMobName("lepidodendron:prehistoric_flora_piranhamesodon", "");
                        if (mobNameT != null) {
                            for (String name : mobNameT) {
                                if (!spawnListInterim.contains(name)) {
                                    spawnListInterim.add(name);
                                }
                            }
                        }
                    }
                }
            }
            Collections.sort(spawnListInterim);
            if (to + 1 > spawnListInterim.size()) {
                to = spawnListInterim.size() - 1;
            }
            if (from + 1 <= spawnListInterim.size()) {
                for (int i = from; i <= to; i++) {
                    spawnListFinal = spawnListFinal + spawnListInterim.get(i) + "$(br)";
                }
            }
            if (spawnListFinal.length() >= 1) {
                return spawnListFinal;
            }
            if (from == 0) {
                return spawnsEmpty;
            }
        }

        if (from == 0) {
            return spawnsEmpty;
        }
        return "";
    }

    @Nullable
    public static String[] getMobName(String mobStr, String nbtStr) {
        String[] mobName = new String[]{};
        if (nbtStr.contains("PNType:\"male\"") || nbtStr.contains("PNType:\"female\"")) {
            nbtStr = "";
        }
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobStr));
        if (ee != null) {
            EntityLiving entity = (EntityLiving) ee.newInstance(null);
            if (entity != null) {
                //Do we have variants?
                if (!nbtStr.equalsIgnoreCase("")) {
                    String[] arrSplit = new String[]{nbtStr};
                    if (nbtStr.indexOf("PNType") > 0) {
                        ArrayList<String> mobArray = new ArrayList<String>();
                        if (nbtStr.indexOf("@") > 0) {
                            arrSplit = nbtStr.split("@");
                        }
                        for (String mobNBT : arrSplit) {
                            NBTTagCompound nbttagcompound = new NBTTagCompound();
                            try {
                                nbttagcompound = JsonToNBT.getTagFromJson(mobNBT);
                            } catch (NBTException nbtexception) {
                                //do nothing
                            }
                            String type = "";
                            if (nbttagcompound.hasKey("PNType")) {
                                entity.readEntityFromNBT(nbttagcompound);
                                type = nbttagcompound.getString("PNType");
                            }
                            if (!type.equalsIgnoreCase("")) {
                                if (!mobArray.contains("$(l:mobs/" + getHyperlink(mobStr + "_" + type) + ")" + entity.getName() + "$(/l)")) {
                                    mobArray.add("$(l:mobs/" + getHyperlink(mobStr + "_" + type) + ")" + entity.getName() + "$(/l)");
                                }
                            }
                            else {
                                if (!mobArray.contains("$(l:mobs/" + getHyperlink(mobStr) + ")" + entity.getName() + "$(/l)")) {
                                    mobArray.add("$(l:mobs/" + getHyperlink(mobStr) + ")" + entity.getName() + "$(/l)");
                                }
                            }
                        }
                        mobName = mobArray.toArray(mobName);
                    }
                    else {
                        mobName = new String[]{"$(l:mobs/" + getHyperlink(mobStr)  + ")" + entity.getName() + "$(/l)"};
                    }
                }
                else {
                    mobName = new String[]{"$(l:mobs/" + getHyperlink(mobStr)  + ")" + entity.getName() + "$(/l)"};
                }
                entity.setDead();
                return mobName;
            }
        }
        return null;
    }

    public static String getHyperlink(String mobStr) {
        if (mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_jellyfish_precambrian")
                || mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeojelly1")
                || mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeojelly2")
                || mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeojelly3")) {
            return "ancientjelly";
        }
        if (mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_notostracan_triops1")
                || mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_notostracan_triops2")
                || mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_notostracan_triops3")) {
            return "triops";
        }
        if (mobStr.contains("_dragonfly_")) {
            return "dragonfly";
        }
        if (mobStr.contains("_roachoid_")) {
            return "roach";
        }
        return mobStr.substring(mobStr.indexOf(":") + 1, mobStr.length()).replace("prehistoric_flora_", "");
    }

}
