package net.lepidodendron.entity.datafixers;

import net.lepidodendron.entity.EntityPrehistoricFloraTitanoptera;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.IFixableData;

public interface FixerTitanoptera {

    IFixableData FixerTitanoptera = new IFixableData() {

        private int getNewVariantID(String oldID) {
            if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_clatrotitan")) {
                return 1;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_gigatitan")) {
                return 2;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_mesotitan")) {
                return 3;
            }
            else return 0;
        }

        @Override
        public int getFixVersion() {
            return 59;
        }

        @Override
        public NBTTagCompound fixTagCompound(NBTTagCompound compound) {
            // Convert to new ID
            String oldName = compound.getString("id").toString();
            int variant = getNewVariantID(oldName);
            if (variant != 0) {
                compound.setString("id", "lepidodendron:prehistoric_flora_titanoptera");
                compound.setString("PNType", EntityPrehistoricFloraTitanoptera.Type.byId(variant).getName());
            }
            return compound;
        }
    };

}
