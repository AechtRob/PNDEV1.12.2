package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.client.book.BookEntry;
import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.GuiBookEntry;
import vazkii.patchouli.client.book.template.BookTemplate;
import vazkii.patchouli.client.book.template.TemplateComponent;
import vazkii.patchouli.client.book.template.component.ComponentImage;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiomeSpawns {

    public static final String spawnsEmpty = "$(br)No mobs spawn here";
    public static final String biomeMissing = "$(br)This biome is not currently installed";

    @Nullable
    public static String getSpawnList(String imageid, int index) {
        return getSpawnList(imageid, index, index, 2);
    }

    @Nullable
    public static String getSpawnList(String dimid, int from, int to) {
        return getSpawnList(dimid, from, to, 1);
    }

    @Nullable
    public static String getSpawnList(String biomeID, int from, int to, int type) {
        //type 1: Names/hyperlink texts
        //type 2: One single icon for this reference, but this is also drawn from the spawn list ordering
        //type 3: One single advancement reference, but this is also drawn from the spawn list ordering

        String spawnListFinal = "$(br)";
        Biome biome = Biome.REGISTRY.getObject(new ResourceLocation(biomeID));
        if (biome == null) {
            if (from == 0) {
                if (type == 1) {
                    return biomeMissing;
                }
                else {
                    return "";
                }
            }
            return "";
        }
        String[] mobList = EntityLists.mobString(biome);
        if (biomeID.equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater_water")) {
            //Need to combine two biomes together for this one!
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_volcanic_tarns_crater"));
            String[] mobList1 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            spawnListJoiner.addAll(spawnListJoiner1);
            mobList = spawnListJoiner.toArray(mobList);
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:carboniferous_volcanic_tarns"));
            mobList1 = EntityLists.mobString(biome);
            spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            spawnListJoiner.addAll(spawnListJoiner1);
            mobList = spawnListJoiner.toArray(mobList);
        }
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
        if (biomeID.equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
            //Need to combine two biomes together for this one!
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_outcrops_edge"));
            String[] mobList1 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            spawnListJoiner.addAll(spawnListJoiner1);
            mobList = spawnListJoiner.toArray(mobList);
        }
        if (biomeID.equalsIgnoreCase("lepidodendron:jurassic_island_forested")) {
            //Need to combine two biomes together for this one!
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:jurassic_beach_forested_island"));
            String[] mobList1 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            spawnListJoiner.addAll(spawnListJoiner1);
            mobList = spawnListJoiner.toArray(mobList);
        }
        if (biomeID.equalsIgnoreCase("lepidodendron:triassic_china_swamp")) {
            //Need to combine two biomes together for this one!
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            biome = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:triassic_china_trees"));
            String[] mobList1 = EntityLists.mobString(biome);
            ObjectArrayList<String> spawnListJoiner1 = new ObjectArrayList<String>(Arrays.asList(mobList1));
            spawnListJoiner.addAll(spawnListJoiner1);
            mobList = spawnListJoiner.toArray(mobList);
        }
        //Websteroprioin spawns as a block, so this needs an overrride here:
        if (biomeID.equalsIgnoreCase("lepidodendron:devonian_ocean"))
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
                String mobName[] = getMobName(entryName, strNBT);
                if (mobName != null) {
                    for (String name : mobName) {
                        String nameSimple = name;
                        if (name.indexOf(")") >= 0) {
                            nameSimple = name.substring(name.indexOf(")"));
                        }
                        if (!alreadyInList(spawnListInterim, new DimensionSpawns.PPEntry(nameSimple, name, getIconPath(name)))) {
                            spawnListInterim.add(new DimensionSpawns.PPEntry(nameSimple, name, getIconPath(name)));
                        }
                    }
                    if (entry.contains("lepidodendron:prehistoric_flora_turboscinetes")) {
                        //They school with this
                        String mobNameT[] = getMobName("lepidodendron:prehistoric_flora_piranhamesodon", "");
                        if (mobNameT != null) {
                            for (String name : mobNameT) {
                                String nameSimple = name;
                                if (name.indexOf(")") >= 0) {
                                    nameSimple = name.substring(name.indexOf(")"));
                                }
                                if (!alreadyInList(spawnListInterim, new DimensionSpawns.PPEntry(nameSimple, name, getIconPath(entry)))) {
                                    spawnListInterim.add(new DimensionSpawns.PPEntry(nameSimple, name, "paleopedia:textures/items/piranhamesodon_icon.png"));
                                }
                            }
                        }
                    }
                }
            }

            Collections.sort(spawnListInterim, new Comparator<DimensionSpawns.PPEntry>() {
                @Override
                public int compare(DimensionSpawns.PPEntry s1, DimensionSpawns.PPEntry s2) {
                    return s1.getSortKey().compareToIgnoreCase(s2.getSortKey());
                }
            });

            if (type == 2) {
                //icons:
                if (from < spawnListInterim.size()) {
                    return spawnListInterim.get(from).getIconPath();
                }
                else {
                    return "";
                }
            }

            if (to + 1 > spawnListInterim.size()) {
                to = spawnListInterim.size() - 1;
            }
            if (from + 1 <= spawnListInterim.size()) {
                for (int i = from; i <= to; i++) {
                    spawnListFinal = spawnListFinal + spawnListInterim.get(i).getEntry() + "$(br)";
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

    public static boolean alreadyInList(ObjectArrayList<DimensionSpawns.PPEntry> list, DimensionSpawns.PPEntry entry) {
        for (DimensionSpawns.PPEntry listEntry : list) {
            if (listEntry.getEntry().equalsIgnoreCase(entry.getEntry())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static String[] getMobName(String mobStr, String nbtStr) {
        return DimensionSpawns.getMobName(mobStr, nbtStr);
    }

    public static String getIconPath(String mobStr) {
        return DimensionSpawns.getIconPath(mobStr);
    }

    public static void refreshForRender(int pageNumber, IComponentProcessor processor, GuiScreen parent) {

        try { //Reflection :/
            Field field = BookEntry.class.getDeclaredField("realPages");
            field.setAccessible(true);
            List<BookPage> pagesAll = (List<BookPage>)field.get(((GuiBookEntry) parent).getEntry());

            BookPage page = pagesAll.get(pageNumber);
            field = page.getClass().getDeclaredField("template");
            field.setAccessible(true);
            BookTemplate booktemplate = (BookTemplate) field.get(page);

            field = booktemplate.getClass().getDeclaredField("components");
            field.setAccessible(true);
            List<TemplateComponent> bookcomponents = (List<TemplateComponent>) field.get(booktemplate);

            field = TemplateComponent.class.getDeclaredField("negateAdvancement");
            field.setAccessible(true);

            for (int i = 1; i <= 15; i++) {
                String advStr = ((ComponentImage) bookcomponents.get(i)).image;
                advStr = advStr.replace("paleopedia:textures/items/", "");
                advStr = advStr.replace("_icon.png", "");
                advStr = "lepidodendron:pf_adv_book_" + getAmendedAdv(advStr);
                bookcomponents.get(i + 15).advancement = advStr;
                bookcomponents.get(i + 30).advancement = advStr;
                field.setBoolean(bookcomponents.get(i + 30), true);
            }

        }
        catch(Exception e){
            //Do nothing
        }
    }

    public static String getAmendedAdv(String string) {
        return DimensionSpawns.getAmendedAdv(string);
    }

}
