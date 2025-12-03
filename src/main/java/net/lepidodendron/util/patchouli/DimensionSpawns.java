package net.lepidodendron.util.patchouli;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.world.biome.EntityLists;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.client.book.BookEntry;
import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.GuiBookEntry;
import vazkii.patchouli.client.book.template.BookTemplate;
import vazkii.patchouli.client.book.template.TemplateComponent;
import vazkii.patchouli.client.book.template.component.ComponentImage;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.*;

public class DimensionSpawns {

    public static final String spawnsEmpty = "$(br)No mobs spawn here";

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


        String spawnListFinal = "$(br)";
        String[] mobList = EntityLists.mobStringInDimension(Integer.parseInt(dimid));

        //Websteroprioin spawns as a block, so this needs an overrride here:
        if (dimid.equalsIgnoreCase("4"))
        {
            ObjectArrayList<String> spawnListJoiner = new ObjectArrayList<String>(Arrays.asList(mobList));
            spawnListJoiner.add("lepidodendron:prehistoric_flora_websteroprion");
            mobList = spawnListJoiner.toArray(mobList);
        }

        ObjectArrayList<DimensionSpawns.PPEntry> spawnListInterim = new ObjectArrayList<PPEntry>();
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

    public static class PPEntry {
        private String sortkey;
        private String entry;
        private String iconpath;

        public PPEntry(String sortkey, String entry, String iconpath){
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

    public static boolean alreadyInList(ObjectArrayList<DimensionSpawns.PPEntry> list, PPEntry entry) {
        for (PPEntry listEntry : list) {
            if (listEntry.getEntry().equalsIgnoreCase(entry.getEntry())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static String[] getMobName(String mobStr, String nbtStr) {
        String[] mobName = new String[]{};
        if (nbtStr.contains("PNType:\"male\"") || nbtStr.contains("PNType:\"female\"") || nbtStr.contains("PNType:\"gendered\"")) {
            nbtStr = "";
        }
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobStr));
        if (ee != null) {
            EntityLiving entity = (EntityLiving) ee.newInstance(null);
            if (entity != null) {
                //Do we have variants?
                if (!nbtStr.equalsIgnoreCase("")) {
                    String[] arrSplit = new String[]{nbtStr};
                    if (nbtStr.indexOf("PNType") >= 0) {
                        ArrayList<String> mobArray = new ArrayList<String>();
                        if (nbtStr.indexOf("@") >= 0) {
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
                            String entityname = entity.getName();
                            int truncate = LepidodendronConfig.palaeopediaTruncation;
                            if (truncate < 1) {
                                truncate = 1;
                            }
                            if (truncate > 24) {
                                truncate = 24;
                            }
                            if (entityname.length() > truncate) {
                                entityname = entityname.substring(0, truncate) + "...";
                            }
                            if (!type.equalsIgnoreCase("")) {
                                //Check if this variant exists yet:
                                if (doesVariantExist(entity, type)) {
                                    if (!mobArray.contains("$(l:mobs/" + getHyperlink(mobStr + "_" + type) + ")" + entityname + "$(/l)")) {
                                        mobArray.add("$(l:mobs/" + getHyperlink(mobStr + "_" + type) + ")" + entityname + "$(/l)");
                                    }
                                }
                            }
                            else {
                                if (!mobArray.contains("$(l:mobs/" + getHyperlink(mobStr) + ")" + entityname + "$(/l)")) {
                                    mobArray.add("$(l:mobs/" + getHyperlink(mobStr) + ")" + entityname + "$(/l)");
                                }
                            }
                        }
                        mobName = mobArray.toArray(mobName);
                    }
                    else {
                        String entityname = entity.getName();
                        int truncate = LepidodendronConfig.palaeopediaTruncation;
                        if (truncate < 1) {
                            truncate = 1;
                        }
                        if (truncate > 24) {
                            truncate = 24;
                        }
                        if (entityname.length() > truncate) {
                            entityname = entityname.substring(0, truncate) + "...";
                        }
                        mobName = new String[]{"$(l:mobs/" + getHyperlink(mobStr)  + ")" + entityname + "$(/l)"};
                    }
                }
                else {
                    String entityname = entity.getName();
                    int truncate = LepidodendronConfig.palaeopediaTruncation;
                    if (truncate < 1) {
                        truncate = 1;
                    }
                    if (truncate > 24) {
                        truncate = 24;
                    }
                    if (entityname.length() > truncate) {
                        entityname = entityname.substring(0, truncate) + "...";
                    }
                    mobName = new String[]{"$(l:mobs/" + getHyperlink(mobStr)  + ")" + entityname + "$(/l)"};
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
        if (mobStr.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeojelly4")) {
            return "yunnanoascus";
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

    public static String getIconPath(String mobStr) {
        mobStr = mobStr.replace("$(l:mobs/", "");
        if (mobStr.indexOf(")") >= 0){
            mobStr = mobStr.substring(0, mobStr.indexOf(")"));
        }
        return "paleopedia:textures/items/" + mobStr + "_icon.png";
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
        if (string.equalsIgnoreCase("ancientjelly")) {
            return "palaeojelly";
        }
        if (string.equalsIgnoreCase("megasecoptera_sylvohymen")) {
            return "sylvohymen";
        }
        if (string.startsWith("conodont_")) {
            return string.substring(9);
        }
        if (string.equalsIgnoreCase("saurichthys_marine")) {
            return "saurichthys";
        }
        if (string.equalsIgnoreCase("notostracan_strudops")) {
            return "strudops";
        }
        if (string.contains("roach")) {
            return "roachoid";
        }
        return string;
    }

    public static boolean doesVariantExist(EntityLiving entityIn, String variantStr) {
        if (entityIn instanceof EntityPrehistoricFloraAgeableBase) {
            EntityPrehistoricFloraAgeableBase entityBase = (EntityPrehistoricFloraAgeableBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraFishBase) {
            EntityPrehistoricFloraFishBase entityBase = (EntityPrehistoricFloraFishBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
            EntityPrehistoricFloraCrawlingFlyingInsectBase entityBase = (EntityPrehistoricFloraCrawlingFlyingInsectBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraInsectFlyingBase) {
            EntityPrehistoricFloraInsectFlyingBase entityBase = (EntityPrehistoricFloraInsectFlyingBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraJellyfishBase) {
            EntityPrehistoricFloraJellyfishBase entityBase = (EntityPrehistoricFloraJellyfishBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraSlitheringWaterBase) {
            EntityPrehistoricFloraSlitheringWaterBase entityBase = (EntityPrehistoricFloraSlitheringWaterBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
            EntityPrehistoricFloraTrilobiteBottomBase entityBase = (EntityPrehistoricFloraTrilobiteBottomBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            EntityPrehistoricFloraTrilobiteSwimBase entityBase = (EntityPrehistoricFloraTrilobiteSwimBase) entityIn;
            if (entityBase.hasPNVariants()) {
                if (entityBase.getPNTypeName() != null && entityBase.getPNTypeName().equalsIgnoreCase(variantStr)) {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        return false;
    }

}
