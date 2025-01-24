package net.lepidodendron.util.patchouli;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientAdvancementManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldServer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class PercentageCollected {

    @SideOnly(Side.CLIENT)
    public static ClientAdvancementManager getAdvancementManageClient(EntityPlayer player) {
        return Minecraft.getMinecraft().player.connection.getAdvancementManager();
    }

    public static String getPercentagePerDimension(EntityPlayer player, int dimension, boolean testComplete) {

        if (player == null) {
            return ": no player available!";
        }

        double plantCounter = 0;
        double plantCollected = 0;
        double mobCounter = 0;
        double mobCollected = 0;
        double staticCounter = 0;
        double staticCollected = 0;

        String[] lifeList = null;
        switch (dimension) {

            case 0: default:
                lifeList = AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics();
                break;

            case 1:
                lifeList = AcidBathOutputStatics.getCambrianCleanedFossilsStatics();
                break;

            case 2:
                lifeList = AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics();
                break;

            case 3:
                lifeList = AcidBathOutputStatics.getSilurianCleanedFossilsStatics();
                break;

            case 4:
                lifeList = AcidBathOutputStatics.getDevonianCleanedFossilsStatics();
                break;

            case 5:
                lifeList = AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics();
                break;

            case 6:
                lifeList = AcidBathOutputStatics.getPermianCleanedFossilsStatics();
                break;

            case 7:
                lifeList = AcidBathOutputStatics.getTriassicCleanedFossilsStatics();
                break;

            case 8:
                lifeList = AcidBathOutputStatics.getJurassicCleanedFossilsStatics();
                break;

            case 9:
                lifeList = AcidBathOutputStatics.getCretaceousCleanedFossilsStaticsEarly();
                break;

            case 10:
                lifeList = AcidBathOutputStatics.getCretaceousCleanedFossilsStaticsLate();
                break;

            case 11:
                lifeList = AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics();
                break;

            case 12:
                lifeList = AcidBathOutputStatics.getNeogeneCleanedFossilsStatics();
                break;

            case 13:
                lifeList = AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics();
                break;
        }

        ObjectArrayList<StaticSpawns.PPEntry> staticListInterim = new ObjectArrayList<StaticSpawns.PPEntry>();
        if (lifeList.length >= 1) {
            for (String entry : lifeList) {
                String staticName = StaticSpawns.getStaticName(entry);
                if (staticName != null) {
                    String nameSimple = staticName;
                    if (staticName.indexOf(")") >= 0) {
                        nameSimple = staticName.substring(staticName.indexOf(")"));
                    }
                    if (!StaticSpawns.alreadyInList(staticListInterim, new StaticSpawns.PPEntry(nameSimple, staticName, StaticSpawns.getIconPath(entry)))) {
                        staticListInterim.add(new StaticSpawns.PPEntry(nameSimple, staticName, StaticSpawns.getIconPath(entry)));
                    }
                }
            }
        }

        staticCounter = staticCounter + staticListInterim.size();
        for (StaticSpawns.PPEntry entry : staticListInterim) {
            String advStr = entry.getIconPath();
            advStr = advStr.replace("_sapling", "");
            advStr = advStr.replace("_item", "");
            if (advStr.indexOf(":") >= 0) {
                advStr = advStr.substring(advStr.indexOf(":") + 1);
            }
            advStr = StaticSpawns.nameOverrides(advStr);
            advStr = advStr.replace("textures/items/", "");
            advStr = advStr.replace("_icon.png", "");
            advStr = "lepidodendron:pf_adv_book_" + StaticSpawns.getAmendedAdv(advStr);
            if ((player instanceof EntityPlayerMP) && (player.world instanceof WorldServer)) {
                WorldServer worldserver = (WorldServer) player.world;
                EntityPlayerMP playerMP = (EntityPlayerMP) player;
                AdvancementManager advancementManager = worldserver.getAdvancementManager();
                if (advancementManager != null) {
                    Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(advStr));
                    if (advancement != null) {
                        if (playerMP.getAdvancements().getProgress(advancement).isDone()) {
                            staticCollected++;
                        }
                    }
                }
            }
            else if (player.world.isRemote) {
                if (getAdvancementManageClient(player).getAdvancementList().getAdvancement(new ResourceLocation(advStr)) != null) {
                    staticCollected++;
                }
            }
        }

        switch (dimension) {

            case 0: default:
                lifeList = AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants();
                break;

            case 1:
                lifeList = AcidBathOutputPlants.getCambrianCleanedFossilsPlants();
                break;

            case 2:
                lifeList = AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants();
                break;

            case 3:
                lifeList = AcidBathOutputPlants.getSilurianCleanedFossilsPlants();
                break;

            case 4:
                lifeList = AcidBathOutputPlants.getDevonianCleanedFossilsPlants();
                break;

            case 5:
                lifeList = AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants();
                break;

            case 6:
                lifeList = AcidBathOutputPlants.getPermianCleanedFossilsPlants();
                break;

            case 7:
                lifeList = AcidBathOutputPlants.getTriassicCleanedFossilsPlants();
                break;

            case 8:
                lifeList = AcidBathOutputPlants.getJurassicCleanedFossilsPlants();
                break;

            case 9:
                lifeList = AcidBathOutputPlants.getCretaceousCleanedFossilsPlantsEarly();
                break;

            case 10:
                lifeList = AcidBathOutputPlants.getCretaceousCleanedFossilsPlantsLate();
                break;

            case 11:
                lifeList = AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants();
                break;

            case 12:
                lifeList = AcidBathOutputPlants.getNeogeneCleanedFossilsPlants();
                break;

            case 13:
                lifeList = AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants();
                break;
        }

        ObjectArrayList<PlantSpawns.PPEntry> plantListInterim = new ObjectArrayList<PlantSpawns.PPEntry>();
        if (lifeList.length >= 1) {
            for (String entry : lifeList) {
                String plantName = PlantSpawns.getPlantName(entry);
                if (plantName != null) {
                    String nameSimple = plantName;
                    if (plantName.indexOf(")") >= 0) {
                        nameSimple = plantName.substring(plantName.indexOf(")"));
                    }
                    if (!PlantSpawns.alreadyInList(plantListInterim, new PlantSpawns.PPEntry(nameSimple, plantName, PlantSpawns.getIconPath(entry)))) {
                        plantListInterim.add(new PlantSpawns.PPEntry(nameSimple, plantName, PlantSpawns.getIconPath(entry)));
                    }
                }
            }
        }

        plantCounter = plantCounter + plantListInterim.size();
        for (PlantSpawns.PPEntry entry : plantListInterim) {
            String advStr = entry.getIconPath();
            advStr = advStr.replace("_sapling", "");
            advStr = advStr.replace("_item", "");
            if (advStr.indexOf(":") >= 0) {
                advStr = advStr.substring(advStr.indexOf(":") + 1);
            }
            advStr = PlantSpawns.nameOverrides(advStr);
            advStr = advStr.replace("textures/items/", "");
            advStr = advStr.replace("_icon.png", "");
            advStr = "lepidodendron:pf_adv_book_" + PlantSpawns.getAmendedAdv(advStr);
            if ((player instanceof EntityPlayerMP) && (player.world instanceof WorldServer)) {
                WorldServer worldserver = (WorldServer) player.world;
                EntityPlayerMP playerMP = (EntityPlayerMP) player;
                AdvancementManager advancementManager = worldserver.getAdvancementManager();
                if (advancementManager != null) {
                    Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(advStr));
                    if (advancement != null) {
                        if (playerMP.getAdvancements().getProgress(advancement).isDone()) {
                            plantCollected++;
                        }
                    }
                }
            }
            else if (player.world.isRemote) {
                if (getAdvancementManageClient(player).getAdvancementList().getAdvancement(new ResourceLocation(advStr)) != null) {
                    plantCollected++;
                }
            }
        }

        //MOBS:
        String[] mobList = EntityLists.mobStringInDimension(dimension);
        //Websteroprioin spawns as a block, so this needs an overrride here:
        if (dimension == 4)
        {
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            spawnListJoiner.add("lepidodendron:prehistoric_flora_websteroprion");
            mobList = spawnListJoiner.toArray(mobList);
        }

        ObjectArrayList<DimensionSpawns.PPEntry> spawnListInterim = new ObjectArrayList<DimensionSpawns.PPEntry>();
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
                String mobName[] = DimensionSpawns.getMobName(entryName, strNBT);
                if (mobName != null) {
                    for (String name : mobName) {
                        String nameSimple = name;
                        if (name.indexOf(")") >= 0) {
                            nameSimple = name.substring(name.indexOf(")"));
                        }
                        if (!DimensionSpawns.alreadyInList(spawnListInterim, new DimensionSpawns.PPEntry(nameSimple, name, DimensionSpawns.getIconPath(name)))) {
                            spawnListInterim.add(new DimensionSpawns.PPEntry(nameSimple, name, DimensionSpawns.getIconPath(name)));
                        }
                    }
                    if (entry.contains("lepidodendron:prehistoric_flora_turboscinetes")) {
                        //They school with this
                        String mobNameT[] = DimensionSpawns.getMobName("lepidodendron:prehistoric_flora_piranhamesodon", "");
                        if (mobNameT != null) {
                            for (String name : mobNameT) {
                                String nameSimple = name;
                                if (name.indexOf(")") >= 0) {
                                    nameSimple = name.substring(name.indexOf(")"));
                                }
                                if (!DimensionSpawns.alreadyInList(spawnListInterim, new DimensionSpawns.PPEntry(nameSimple, name, DimensionSpawns.getIconPath(entry)))) {
                                    spawnListInterim.add(new DimensionSpawns.PPEntry(nameSimple, name, DimensionSpawns.getIconPath(entry)));
                                }
                            }
                        }
                    }
                }
            }
        }

        mobCounter = mobCounter + spawnListInterim.size();
        for (DimensionSpawns.PPEntry entry : spawnListInterim) {
            String advStr = entry.getIconPath();
            advStr = DimensionSpawns.getIconPath(advStr);
            advStr = advStr.replace("paleopedia:textures/items/", "");
            advStr = advStr.replace("_icon.png", "");
            advStr = "lepidodendron:pf_adv_book_" + DimensionSpawns.getAmendedAdv(advStr);
            if ((player instanceof EntityPlayerMP) && (player.world instanceof WorldServer)) {
                WorldServer worldserver = (WorldServer) player.world;
                EntityPlayerMP playerMP = (EntityPlayerMP) player;
                AdvancementManager advancementManager = worldserver.getAdvancementManager();
                if (advancementManager != null) {
                    Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(advStr));
                    if (advancement != null) {
                        if (playerMP.getAdvancements().getProgress(advancement).isDone()) {
                            mobCollected++;
                        }
                    }
                }
            }
            else if (player.world.isRemote) {
                if (getAdvancementManageClient(player).getAdvancementList().getAdvancement(new ResourceLocation(advStr)) != null) {
                    mobCollected++;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("##0.00");
        double lifeCounter = plantCounter + staticCounter + mobCounter;
        double lifeCollected = plantCollected + staticCollected + mobCollected;
        if (testComplete && lifeCollected == lifeCounter) {
            return "true";
        }
        return (String)(": " + (int)lifeCollected + " of " + (int)lifeCounter + " (" + df.format(100.00 * ((double)lifeCollected/lifeCounter)) + "%)");

    }
}
