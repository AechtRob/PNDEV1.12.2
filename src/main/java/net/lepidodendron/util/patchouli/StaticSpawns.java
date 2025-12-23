package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.AcidBathOutputStatics;
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

public class StaticSpawns {

    public static final String staticsEmpty = "$(br)No static creatures occur here";
    public static double totalLife = 0;
    public static double foundLife = 0;

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
        //type 4: A count of the number of statics

        String staticListFinal = "$(br)";
        String[] staticsList = null;
        switch (Integer.parseInt(dimid)) {
            default:
                return staticsEmpty;

            case 0:
                staticsList = AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics();
                break;

            case 1:
                staticsList = AcidBathOutputStatics.getCambrianCleanedFossilsStatics();
                break;

            case 2:
                staticsList = AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics();
                break;

            case 3:
                staticsList = AcidBathOutputStatics.getSilurianCleanedFossilsStatics();
                break;

            case 4:
                staticsList = AcidBathOutputStatics.getDevonianCleanedFossilsStatics();
                break;

            case 5:
                staticsList = AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics();
                break;

            case 6:
                staticsList = AcidBathOutputStatics.getPermianCleanedFossilsStatics();
                break;

            case 7:
                staticsList = AcidBathOutputStatics.getTriassicCleanedFossilsStatics();
                break;

            case 8:
                staticsList = AcidBathOutputStatics.getJurassicCleanedFossilsStatics();
                break;

            case 9:
                staticsList = AcidBathOutputStatics.getCretaceousCleanedFossilsStaticsEarly();
                break;

            case 10:
                staticsList = AcidBathOutputStatics.getCretaceousCleanedFossilsStaticsLate();
                break;

            case 11:
                staticsList = AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics();
                break;

            case 12:
                staticsList = AcidBathOutputStatics.getNeogeneCleanedFossilsStatics();
                break;

            case 13:
                staticsList = AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics();
                break;
        }

        ObjectArrayList<PPEntry> staticListInterim = new ObjectArrayList<PPEntry>();
        if (staticsList.length >= 1) {
            for (String entry : staticsList) {
                String staticName = getStaticName(entry);
                if (staticName != null) {
                    String nameSimple = staticName;
                    if (staticName.indexOf(")") >= 0) {
                        nameSimple = staticName.substring(staticName.indexOf(")"));
                    }
                    if (!alreadyInList(staticListInterim, new PPEntry(nameSimple, staticName, getIconPath(entry)))) {
                        staticListInterim.add(new PPEntry(nameSimple, staticName, getIconPath(entry)));
                    }

                }
            }

            Collections.sort(staticListInterim, new Comparator<PPEntry>() {
                @Override
                public int compare(PPEntry s1, PPEntry s2) {
                    return s1.getSortKey().compareToIgnoreCase(s2.getSortKey());
                }
            });

            if (type == 2) {
                //icons:
                if (from < staticListInterim.size()) {
                    return staticListInterim.get(from).getIconPath();
                }
                else {
                    return "";
                }
            }

            if (to + 1 > staticListInterim.size()) {
                to = staticListInterim.size() - 1;
            }
            if (from + 1 <= staticListInterim.size()) {
                for (int i = from; i <= to; i++) {
                    staticListFinal = staticListFinal + staticListInterim.get(i).getEntry() + "$(br)";
                }
            }
            if (staticListFinal.length() >= 1) {
                return staticListFinal;
            }
            if (from == 0) {
                return staticsEmpty;
            }
        }

        if (from == 0) {
            return staticsEmpty;
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

    public static boolean alreadyInList(ObjectArrayList<StaticSpawns.PPEntry> list, StaticSpawns.PPEntry entry) {
        for (StaticSpawns.PPEntry listEntry : list) {
            if (listEntry.getEntry().equalsIgnoreCase(entry.getEntry())) {
                return true;
            }
        }
        return false;
    }

    public static String nameOverrides(String staticStr) {
        if (staticStr.contains("sea_anemone")) {
            return "seaanemone";
        }
        if (staticStr.equalsIgnoreCase("blue_sponge")
                || staticStr.equalsIgnoreCase("branched_sponge")
                || staticStr.equalsIgnoreCase("brown_sponge")
                || staticStr.equalsIgnoreCase("dark_orange_sponge")
                || staticStr.equalsIgnoreCase("dark_pink_sponge")
                || staticStr.equalsIgnoreCase("orange_sponge")
                || staticStr.equalsIgnoreCase("pink_sponge")
                || staticStr.equalsIgnoreCase("red_sponge")
                || staticStr.equalsIgnoreCase("white_sponge")
                || staticStr.equalsIgnoreCase("yellow_sponge")) {
            return "sponge";
        }
        if (staticStr.equalsIgnoreCase("coral_bamboo")
                || staticStr.equalsIgnoreCase("coral_blue_staghorn")
                || staticStr.equalsIgnoreCase("coral_brain")
                || staticStr.equalsIgnoreCase("coral_carnation")
                || staticStr.equalsIgnoreCase("coral_red_tree")
                || staticStr.equalsIgnoreCase("coral_soft_fan")
                || staticStr.equalsIgnoreCase("coral_stony_blooming")
                || staticStr.equalsIgnoreCase("coral_stony_fractal_branching")
                || staticStr.equalsIgnoreCase("coral_stony_lumpy")
                || staticStr.equalsIgnoreCase("coral_stony_pipe_stack")
                || staticStr.equalsIgnoreCase("coral_stony_puffy")
                || staticStr.equalsIgnoreCase("coral_stony_rough_branching")
                || staticStr.equalsIgnoreCase("coral_stony_sparse_branching")
                || staticStr.equalsIgnoreCase("coral_stony_tubular")
                || staticStr.equalsIgnoreCase("coral_tan_staghorn")
                || staticStr.equalsIgnoreCase("coral_blue_crust")) {
            return "coral";
        }
        if (staticStr.equalsIgnoreCase("tabulata_block_1")
                || staticStr.equalsIgnoreCase("tabulata_block_2")
                || staticStr.equalsIgnoreCase("tabulata_block_3")
                || staticStr.equalsIgnoreCase("tabulata_1")
                || staticStr.equalsIgnoreCase("tabulata_2")
                || staticStr.equalsIgnoreCase("tabulata_3")
                || staticStr.equalsIgnoreCase("tabulata_4")) {
            return "tabulata";
        }
        if (staticStr.equalsIgnoreCase("rugosa_1")
                || staticStr.equalsIgnoreCase("rugosa_2")
                || staticStr.equalsIgnoreCase("rugosa_3")
                || staticStr.equalsIgnoreCase("rugosa_4")
                || staticStr.equalsIgnoreCase("rugosa_5")) {
            return "rugosa";
        }
        if (staticStr.equalsIgnoreCase("sea_pen_pink")
                || staticStr.equalsIgnoreCase("sea_pen_yellow")) {
            return "sea_pen";
        }
        if (staticStr.equalsIgnoreCase("blastoid_1")
                || staticStr.equalsIgnoreCase("blastoid_2")
                || staticStr.equalsIgnoreCase("blastoid_3")) {
            return "blastoids";
        }
        if (staticStr.equalsIgnoreCase("fenestella_1")
                || staticStr.equalsIgnoreCase("fenestella_2")
                || staticStr.equalsIgnoreCase("fenestella_3")
                || staticStr.equalsIgnoreCase("fenestella_4")
                || staticStr.equalsIgnoreCase("fenestella_5")
                || staticStr.equalsIgnoreCase("fenestella_giant_blue")
                || staticStr.equalsIgnoreCase("fenestella_giant_green")
                || staticStr.equalsIgnoreCase("fenestella_giant_orange")
                || staticStr.equalsIgnoreCase("fenestella_giant_red")
                || staticStr.equalsIgnoreCase("fenestella_giant_yellow")) {
            return "fenestella";
        }
        if (staticStr.equalsIgnoreCase("coral")
                || staticStr.equalsIgnoreCase("coral_sticky")) {
            return "reef_coral";
        }
        if (staticStr.equalsIgnoreCase("stromatoporoidea_reef")
                || staticStr.equalsIgnoreCase("stromatoporoidea_reef_sticky")) {
            return "reef_stromatoporoidea";
        }
        if (staticStr.equalsIgnoreCase("bryozoan_reef")
                || staticStr.equalsIgnoreCase("bryozoan_reef_sticky")) {
            return "reef_bryozoan";
        }
        if (staticStr.equalsIgnoreCase("sponge_reef")
                || staticStr.equalsIgnoreCase("sponge_reef_sticky")) {
            return "reef_sponge";
        }
        if (staticStr.equalsIgnoreCase("shelly_reef")
                || staticStr.equalsIgnoreCase("shelly_reef_sticky")) {
            return "reef_shelly";
        }
        if (staticStr.equalsIgnoreCase("glass_sponge_reef")
                || staticStr.equalsIgnoreCase("glass_sponge_reef_sticky")) {
            return "reef_glass_sponge";
        }
        if (staticStr.equalsIgnoreCase("archaeocyatha")
                || staticStr.equalsIgnoreCase("archaeocyatha_sticky")) {
            return "reef_archaeocyatha";
        }
        if (staticStr.equalsIgnoreCase("rudist_reef")
                || staticStr.equalsIgnoreCase("rudist_reef_sticky")) {
            return "reef_rudist";
        }
        if (staticStr.equalsIgnoreCase("oesia")) {
            return "oesiamargaretia";
        }
        if (staticStr.equalsIgnoreCase("conulariid_brown")
                || staticStr.equalsIgnoreCase("conulariid_magenta")) {
            return "conulariid";
        }
        if (staticStr.equalsIgnoreCase("primocandelabrum_1")
                || staticStr.equalsIgnoreCase("primocandelabrum_2")) {
            return "primocandelabrum";
        }
        return staticStr;
    }

    public static String getIconPath(String staticStr) {
        staticStr = staticStr.replace("_sapling", "");
        staticStr = staticStr.replace("_item", "");
        if (staticStr.indexOf(":") >= 0) {
            staticStr = staticStr.substring(staticStr.indexOf(":") + 1);
        }
        staticStr = nameOverrides(staticStr);
        return "paleopedia:textures/items/" + staticStr + "_icon.png";
    }

    public static String getStaticName(String staticStr) {
        staticStr = staticStr.replace("_sapling", "");
        if (staticStr.indexOf(":") >= 0) {
            staticStr = staticStr.substring(staticStr.indexOf(":") + 1);
        }
        staticStr = nameOverrides(staticStr);

        String endName = staticStr;
        boolean flag = false;
        //Simple translations here. First we try as a block:
        String tmpName = I18n.translateToLocal("icon.pf_" + staticStr + ".name");
        if (!tmpName.equalsIgnoreCase("icon.pf_" + staticStr + ".name")) {
            flag = true;
        }
        if (!flag) {
            tmpName = I18n.translateToLocal("item.pf_" + staticStr + ".name");
            if (!tmpName.equalsIgnoreCase("item.pf_" + staticStr + ".name")) {
                flag = true;
            }
        }
        if (!flag) {
            tmpName = I18n.translateToLocal("tile.pf_" + staticStr + ".name");
            if (!tmpName.equalsIgnoreCase("tile.pf_" + staticStr + ".name")) {
                flag = true;
            }
        }
        if (!flag) {
            return endName;
        }
        int truncate = LepidodendronConfig.palaeopediaTruncation;
        if (truncate < 1) {
            truncate = 1;
        }
        if (truncate > 24) {
            truncate = 24;
        }
        if (tmpName.length() > truncate) {
            tmpName = tmpName.substring(0, truncate) + "...";
        }
        return "$(l:statics/" + getHyperlink(staticStr)  + ")" + tmpName + "$(/l)";

    }

    public static String getHyperlink(String staticStr) {
        if (staticStr.equalsIgnoreCase("bivalve_cream")
                || staticStr.equalsIgnoreCase("bivalve_dark")
                || staticStr.equalsIgnoreCase("bivalve_green")
                || staticStr.equalsIgnoreCase("bivalve_grey")
                || staticStr.equalsIgnoreCase("bivalve_tall")
                || staticStr.equalsIgnoreCase("bivalve_upright")
                || staticStr.equalsIgnoreCase("bivalve_white")) {
            staticStr = "bivalve";
        }
        if (staticStr.contains("fenestella_giant")) {
            return "fenestella";
        }
        return staticStr;
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
        if (string.equalsIgnoreCase("primocandelabrum_1")) {
            return "primocandelabrum";
        }
        if (string.equalsIgnoreCase("bryozoan_reef")) {
            return "reef_bryozoan";
        }
        if (string.equalsIgnoreCase("stromatoporoidea_reef")) {
            return "reef_stromatoporoidea";
        }
        if (string.equalsIgnoreCase("sponge_reef")) {
            return "reef_sponge";
        }
        if (string.equalsIgnoreCase("shelly_reef")) {
            return "reef_shelly";
        }
        if (string.equalsIgnoreCase("glass_sponge_reef")) {
            return "reef_glass_sponge";
        }
        if (string.equalsIgnoreCase("archaeocyatha")) {
            return "reef_archaeocyatha";
        }
        if (string.equalsIgnoreCase("shelly_reef")) {
            return "reef_shelly";
        }
        if (string.equalsIgnoreCase("rudist_reef")) {
            return "reef_rudist";
        }
        if (string.contains("fenestella_giant")) {
            return "fenestella";
        }
        if (string.contains("tribrachidium")) {
            return "vaveliksia";
        }
        return string;
    }

}
