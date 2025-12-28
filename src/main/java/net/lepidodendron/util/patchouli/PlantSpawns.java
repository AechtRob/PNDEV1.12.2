package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.translation.I18n;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.client.book.BookEntry;
import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.GuiBookEntry;
import vazkii.patchouli.client.book.template.BookTemplate;
import vazkii.patchouli.client.book.template.TemplateComponent;
import vazkii.patchouli.client.book.template.component.ComponentImage;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlantSpawns {

    public static final String plantsEmpty = "$(br)No plants occur here";

    @Nullable
    public static String getSpawnList(String imageid, int index) {
        return getSpawnList(imageid, index, index, 2);
    }

    @Nullable
    public static String getSpawnList(String dimid, int from, int to) {
        return getSpawnList(dimid, from, to, 1);
    }

    @Nullable
    public static String getSpawnList(String dimid, int from, int to, int type) {
        //type 1: Names/hyperlink texts
        //type 2: One single icon for this reference, but this is also drawn from the spawn list ordering
        //type 3: One single advancement reference, but this is also drawn from the spawn list ordering

        String plantListFinal = "$(br)";
        String[] plantList = null;
        switch (Integer.parseInt(dimid)) {
            default:
                return plantsEmpty;

            case 0:
                plantList = AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants();
                break;

            case 1:
                plantList = AcidBathOutputPlants.getCambrianCleanedFossilsPlants();
                break;

            case 2:
                plantList = AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants();
                break;

            case 3:
                plantList = AcidBathOutputPlants.getSilurianCleanedFossilsPlants();
                break;

            case 4:
                plantList = AcidBathOutputPlants.getDevonianCleanedFossilsPlants();
                break;

            case 5:
                plantList = AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants();
                break;

            case 6:
                plantList = AcidBathOutputPlants.getPermianCleanedFossilsPlants();
                break;

            case 7:
                plantList = AcidBathOutputPlants.getTriassicCleanedFossilsPlants();
                break;

            case 8:
                plantList = AcidBathOutputPlants.getJurassicCleanedFossilsPlants();
                break;

            case 9:
                plantList = AcidBathOutputPlants.getCretaceousCleanedFossilsPlantsEarly();
                break;

            case 10:
                plantList = AcidBathOutputPlants.getCretaceousCleanedFossilsPlantsLate();
                break;

            case 11:
                plantList = AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants();
                break;

            case 12:
                plantList = AcidBathOutputPlants.getNeogeneCleanedFossilsPlants();
                break;

            case 13:
                plantList = AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants();
                break;
        }

        ObjectArrayList<PPEntry> plantListInterim = new ObjectArrayList<PPEntry>();
        if (plantList.length >= 1) {
            for (String entry : plantList) {
                String plantName = getPlantName(entry);
                if (plantName != null) {
                    String nameSimple = plantName;
                    if (plantName.indexOf(")") >= 0) {
                        nameSimple = plantName.substring(plantName.indexOf(")"));
                    }
                    if (!alreadyInList(plantListInterim, new PPEntry(nameSimple, plantName, getIconPath(entry)))) {
                        plantListInterim.add(new PPEntry(nameSimple, plantName, getIconPath(entry)));
                    }

                }
            }

            Collections.sort(plantListInterim, new Comparator<PPEntry>() {
                @Override
                public int compare(PPEntry s1, PPEntry s2) {
                    return s1.getSortKey().compareToIgnoreCase(s2.getSortKey());
                }
            });

            if (type == 2) {
                //icons:
                if (from < plantListInterim.size()) {
                    return plantListInterim.get(from).getIconPath();
                }
                else {
                    return "";
                }
            }

            if (to + 1 > plantListInterim.size()) {
                to = plantListInterim.size() - 1;
            }
            if (from + 1 <= plantListInterim.size()) {
                for (int i = from; i <= to; i++) {
                    plantListFinal = plantListFinal + plantListInterim.get(i).getEntry() + "$(br)";
                }
            }
            if (plantListFinal.length() >= 1) {
                return plantListFinal;
            }
            if (from == 0) {
                return plantsEmpty;
            }
        }

        if (from == 0) {
            return plantsEmpty;
        }
        return "";
    }

    public static class PPEntry {
        private String sortkey;
        private String entry;
        private String iconpath;

        public PPEntry(String sortkey,String entry, String iconpath){
            this.sortkey = sortkey;
            this.entry = entry;
            this.iconpath = iconpath;
        }

        public String getSortKey() {
            return this.sortkey;
        }

        public String getEntry() {
            return this.entry;
        }

        public String getIconPath() {
            return this.iconpath;
        }
    }

    public static boolean alreadyInList(ObjectArrayList<PlantSpawns.PPEntry> list, PlantSpawns.PPEntry entry) {
        for (PlantSpawns.PPEntry listEntry : list) {
            if (listEntry.getEntry().equalsIgnoreCase(entry.getEntry())) {
                return true;
            }
        }
        return false;
    }

    public static String nameOverrides(String plantStr) {
        if (plantStr.contains("caytoniales")) {
            return "caytoniales";
        }
        if (plantStr.equalsIgnoreCase("large_fern")
                || plantStr.equalsIgnoreCase("small_fern")) {
            return "fern";
        }
        if (plantStr.equalsIgnoreCase("banksia_1")
                || plantStr.equalsIgnoreCase("banksia_2")) {
            return "banksia";
        }
        if (plantStr.equalsIgnoreCase("sapling")
                || plantStr.equalsIgnoreCase("lepidodendron")) {
            return "lepidodendron";
        }
        if (plantStr.equalsIgnoreCase("magnolia")
                || plantStr.equalsIgnoreCase("magnoliasapling")) {
            return "magnolia";
        }
        if (plantStr.equalsIgnoreCase("glossopteris")
                || plantStr.equalsIgnoreCase("glossopterissapling")) {
            return "glossopteris";
        }
        if (plantStr.equalsIgnoreCase("liriodendron")
                || plantStr.equalsIgnoreCase("liriodendronsapling")) {
            return "liriodendron";
        }
        if (plantStr.equalsIgnoreCase("algal_reef")
                || plantStr.equalsIgnoreCase("algal_reef_sticky")) {
            return "reef_algal";
        }
        if (plantStr.equalsIgnoreCase("protea")
                || plantStr.equalsIgnoreCase("protea_1")) {
            return "protea";
        }
        if (plantStr.equalsIgnoreCase("green_algae_mat")
                || plantStr.equalsIgnoreCase("green_codium_algae")
                || plantStr.equalsIgnoreCase("green_crusted_algae")
                || plantStr.equalsIgnoreCase("green_leafy_algae")
                || plantStr.equalsIgnoreCase("piled_algae")
                || plantStr.equalsIgnoreCase("stalked_algae")
                || plantStr.equalsIgnoreCase("green_chara_algae")
                || plantStr.equalsIgnoreCase("green_filamentous_algae_item")
                || plantStr.equalsIgnoreCase("green_stemmed_algae")
                || plantStr.equalsIgnoreCase("green_sprouting_algae")
                || plantStr.equalsIgnoreCase("slimy_algae_item")) {
            return  "algae_green";
        }
        if (plantStr.equalsIgnoreCase("red_algae_mat")
                || plantStr.equalsIgnoreCase("red_tufted_algae")
                || plantStr.equalsIgnoreCase("red_leafy_algae")) {
            return "algae_red";
        }
        if (plantStr.equalsIgnoreCase("algae_brown_ascending")
                || plantStr.equalsIgnoreCase("leafy_brown_algae")
                || plantStr.equalsIgnoreCase("stalky_brown_algae")) {
            return "algae_brown";
        }

        return plantStr;
    }

    public static String getIconPath(String plantStr) {
        if (plantStr.equalsIgnoreCase("lepidodendron:pachypteris")) {
            return "paleopedia:textures/items/weichselia_icon.png";
        }
        plantStr = plantStr.replace("_sapling", "");
        plantStr = plantStr.replace("_item", "");
        if (plantStr.indexOf(":") >= 0) {
            plantStr = plantStr.substring(plantStr.indexOf(":") + 1);
        }
        plantStr = nameOverrides(plantStr);
        return "paleopedia:textures/items/" + plantStr + "_icon.png";
    }

   public static String getPlantName(String plantStr) {
       String tmpName;
       if (plantStr.equalsIgnoreCase("lepidodendron:pachypteris")) {
           tmpName = I18n.translateToLocal("tile.pf_weichselia.name");
       }
       else {
           plantStr = plantStr.replace("_sapling", "");
           if (plantStr.indexOf(":") >= 0) {
               plantStr = plantStr.substring(plantStr.indexOf(":") + 1);
           }
           plantStr = nameOverrides(plantStr);

           String endName = plantStr;
           boolean flag = false;
           //Simple translations here. First we try as a block:
           tmpName = I18n.translateToLocal("icon.pf_" + plantStr + ".name");
           if (!tmpName.equalsIgnoreCase("icon.pf_" + plantStr + ".name")) {
               flag = true;
           }
           if (!flag) {
               tmpName = I18n.translateToLocal("item.pf_" + plantStr + ".name");
               if (!tmpName.equalsIgnoreCase("item.pf_" + plantStr + ".name")) {
                   flag = true;
               }
           }
           if (!flag) {
               tmpName = I18n.translateToLocal("tile.pf_" + plantStr + ".name");
               if (!tmpName.equalsIgnoreCase("tile.pf_" + plantStr + ".name")) {
                   flag = true;
               }
           }
            if (!flag) {
               return endName;
            }
        }

        return "$(l:plants/" + getHyperlink(plantStr)  + ")" + tmpName + "$(/l)";

   }

    public static String getHyperlink(String plantStr) {
        //Anything we need to her do here for some reason:

        plantStr = plantStr.replace("_item", "");
        return plantStr;
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
                advStr = "lepidodendron:pf_adv_book_" + getAmendedAdv(advStr);;
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
        if (string.equalsIgnoreCase("green_algae_mat")
                || string.equalsIgnoreCase("green_codium_algae")
                || string.equalsIgnoreCase("green_crusted_algae")
                || string.equalsIgnoreCase("green_leafy_algae")
                || string.equalsIgnoreCase("piled_algae")
                || string.equalsIgnoreCase("stalked_algae")
                || string.equalsIgnoreCase("green_chara_algae")
                || string.equalsIgnoreCase("green_filamentous_algae_item")
                || string.equalsIgnoreCase("green_stemmed_algae")
                || string.equalsIgnoreCase("green_sprouting_algae")
                || string.equalsIgnoreCase("slimy_algae_item")) {
            string = "algae_green";
        }
        if (string.equalsIgnoreCase("red_algae_mat")
                || string.equalsIgnoreCase("red_tufted_algae")
                || string.equalsIgnoreCase("red_leafy_algae")) {
            string = "algae_red";
        }
        if (string.equalsIgnoreCase("algae_brown_ascending")
                || string.equalsIgnoreCase("leafy_brown_algae")
                || string.equalsIgnoreCase("stalky_brown_algae")) {
            string = "algae_brown";
        }
        if (string.equalsIgnoreCase("algal_reef")) {
            string = "reef_algal";
        }
        if (string.contains("sphenophyllales")) {
            string = "sphenophyllales";
        }
        if (string.contains("matonia")) {
            string = "matonia";
        }
        return string;
    }

}
