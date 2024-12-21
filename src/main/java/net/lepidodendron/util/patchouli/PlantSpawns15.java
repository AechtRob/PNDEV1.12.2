package net.lepidodendron.util.patchouli;

import net.minecraft.client.gui.GuiScreen;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;
import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.BookTextRenderer;
import vazkii.patchouli.client.book.gui.GuiBook;
import vazkii.patchouli.client.book.gui.GuiBookEntry;
import vazkii.patchouli.client.book.template.BookTemplate;
import vazkii.patchouli.client.book.template.TemplateComponent;
import vazkii.patchouli.client.book.template.component.ComponentImage;
import vazkii.patchouli.client.book.template.component.ComponentText;

import java.lang.reflect.Field;
import java.util.List;

public class PlantSpawns15 implements IComponentProcessor {

    String dimid;
    String imageid0;
    String imageid1;
    String imageid2;
    String imageid3;
    String imageid4;
    String imageid5;
    String imageid6;
    String imageid7;
    String imageid8;
    String imageid9;
    String imageid10;
    String imageid11;
    String imageid12;
    String imageid13;
    String imageid14;
    int pageNumber = 15;

    @Override
    public void refresh(GuiScreen parent, int left, int top) {
        PlantSpawns.refreshForRender(this.pageNumber, this, parent);
        IComponentProcessor.super.refresh(parent, left, top);
    }

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        if (iVariableProvider.has("imageid0")) {
            this.imageid0 = iVariableProvider.get("imageid0");
        }
        else {
            this.imageid0 = "";
        }
        if (iVariableProvider.has("imageid1")) {
            this.imageid1 = iVariableProvider.get("imageid1");
        }
        else {
            this.imageid1 = "";
        }
        if (iVariableProvider.has("imageid2")) {
            this.imageid2 = iVariableProvider.get("imageid2");
        }
        else {
            this.imageid2 = "";
        }
        if (iVariableProvider.has("imageid3")) {
            this.imageid3 = iVariableProvider.get("imageid3");
        }
        else {
            this.imageid3 = "";
        }
        if (iVariableProvider.has("imageid4")) {
            this.imageid4 = iVariableProvider.get("imageid4");
        }
        else {
            this.imageid4 = "";
        }
        if (iVariableProvider.has("imageid5")) {
            this.imageid5 = iVariableProvider.get("imageid5");
        }
        else {
            this.imageid5 = "";
        }
        if (iVariableProvider.has("imageid6")) {
            this.imageid6 = iVariableProvider.get("imageid6");
        }
        else {
            this.imageid6 = "";
        }
        if (iVariableProvider.has("imageid7")) {
            this.imageid7 = iVariableProvider.get("imageid7");
        }
        else {
            this.imageid7 = "";
        }
        if (iVariableProvider.has("imageid8")) {
            this.imageid8 = iVariableProvider.get("imageid8");
        }
        else {
            this.imageid8 = "";
        }
        if (iVariableProvider.has("imageid9")) {
            this.imageid9 = iVariableProvider.get("imageid9");
        }
        else {
            this.imageid9 = "";
        }
        if (iVariableProvider.has("imageid10")) {
            this.imageid10 = iVariableProvider.get("imageid10");
        }
        else {
            this.imageid10 = "";
        }
        if (iVariableProvider.has("imageid11")) {
            this.imageid11 = iVariableProvider.get("imageid11");
        }
        else {
            this.imageid11 = "";
        }
        if (iVariableProvider.has("imageid12")) {
            this.imageid12 = iVariableProvider.get("imageid12");
        }
        else {
            this.imageid12 = "";
        }
        if (iVariableProvider.has("imageid13")) {
            this.imageid13 = iVariableProvider.get("imageid13");
        }
        else {
            this.imageid13 = "";
        }
        if (iVariableProvider.has("imageid14")) {
            this.imageid14 = iVariableProvider.get("imageid14");
        }
        else {
            this.imageid14 = "";
        }
        if (iVariableProvider.has("dimid")) {
            this.dimid = iVariableProvider.get("dimid");
        }
        else {
            this.dimid = "";
        }
    }

    @Override
    public String process(String s) {
        if (s.equalsIgnoreCase("dimid")) {
            String spawnList = PlantSpawns.getSpawnList(this.dimid, ((pageNumber - 1) * 3 * 5) - 1, ((pageNumber - 1) * 3 * 5) + 13);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return PlantSpawns.plantsEmpty;
        }
        if (s.equalsIgnoreCase("imageid0")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid0, ((pageNumber - 1) * 3 * 5) - 1);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid1")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid1, ((pageNumber - 1) * 3 * 5));
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid2")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid2, ((pageNumber - 1) * 3 * 5) + 1);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid3")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid3, ((pageNumber - 1) * 3 * 5) + 2);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid4")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid4, ((pageNumber - 1) * 3 * 5) + 3);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid5")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid5, ((pageNumber - 1) * 3 * 5) + 4);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid6")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid6, ((pageNumber - 1) * 3 * 5) + 5);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid7")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid7, ((pageNumber - 1) * 3 * 5) + 6);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid8")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid8, ((pageNumber - 1) * 3 * 5) + 7);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid9")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid9, ((pageNumber - 1) * 3 * 5) + 8);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid10")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid10, ((pageNumber - 1) * 3 * 5) + 9);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid11")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid11, ((pageNumber - 1) * 3 * 5) + 10);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid12")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid12, ((pageNumber - 1) * 3 * 5) + 11);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid13")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid13, ((pageNumber - 1) * 3 * 5) + 12);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid14")) {
            String spawnList = PlantSpawns.getSpawnList(this.imageid14, ((pageNumber - 1) * 3 * 5) + 13);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }

        return s;
    }

}
