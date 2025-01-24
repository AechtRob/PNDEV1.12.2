package net.lepidodendron.util.patchouli;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;
import vazkii.patchouli.client.book.BookEntry;
import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.GuiBookEntry;
import vazkii.patchouli.client.book.template.BookTemplate;
import vazkii.patchouli.client.book.template.TemplateComponent;
import vazkii.patchouli.client.book.template.component.ComponentImage;

import java.lang.reflect.Field;
import java.util.List;

public class BiomeSpawns1 implements IComponentProcessor {

    String biome;
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
    int pageNumber = 1;

    //This page is not readily copyable because it contains a different number of
    //entries and a header, as compared to pages 2 onwards

    @Override
    public void refresh(GuiScreen parent, int left, int top) {

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
            List<TemplateComponent> bookcomponents = (List<TemplateComponent>)field.get(booktemplate);

            field = TemplateComponent.class.getDeclaredField("negateAdvancement");
            field.setAccessible(true);

            for (int i = 2; i <= 15; i++) {
                String advStr = ((ComponentImage) bookcomponents.get(i)).image;
                advStr = advStr.replace("paleopedia:textures/items/", "");
                advStr = advStr.replace("_icon.png", "");
                advStr = "lepidodendron:pf_adv_book_" + DimensionSpawns.getAmendedAdv(advStr);
                bookcomponents.get(i + 14).advancement = advStr;
                bookcomponents.get(i + 28).advancement = advStr;
                if (!advStr.equalsIgnoreCase("lepidodendron:pf_adv_book_blank")) {
                    field.setBoolean(bookcomponents.get(i + 28), true);
                }
            }

        }
        catch (Exception e) {
            //Do nothing
        }

        IComponentProcessor.super.refresh(parent, left, top);
    }

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.biome = iVariableProvider.get("biome");
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
    }

    @Override
    public String process(String s) {

        if (s.equalsIgnoreCase("biome")) {
            if (Biome.REGISTRY.getObject(new ResourceLocation(this.biome)) == null) {
                return BiomeSpawns.biomeMissing;
            }
            String spawnList = BiomeSpawns.getSpawnList(this.biome, 0, 13);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return BiomeSpawns.spawnsEmpty;
        }

        if (s.equalsIgnoreCase("imageid0")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid0, 0);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid1")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid1, 1);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid2")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid2, 2);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid3")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid3, 3);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid4")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid4, 4);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid5")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid5, 5);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid6")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid6, 6);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid7")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid7, 7);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid8")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid8, 8);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid9")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid9, 9);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid10")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid10, 10);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid11")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid11, 11);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid12")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid12, 12);
            if (spawnList != null) {
                if (!spawnList.equalsIgnoreCase("")) {
                    return spawnList;
                }
            }
            return "";
        }
        if (s.equalsIgnoreCase("imageid13")) {
            String spawnList = BiomeSpawns.getSpawnList(this.imageid13, 13);
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
