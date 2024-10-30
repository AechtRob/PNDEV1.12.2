package net.lepidodendron.entity.datafixers;

import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.IFixableData;

public interface FixerMyriapods {

    IFixableData FixerMyriapods = new IFixableData() {

        private int getNewVariantID(String oldID) {
            if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_pneumodesmus")) {
                return 1;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_eoarthropleura")) {
                return 2;
            }
            else return 0;
        }

        @Override
        public int getFixVersion() {
            return 61;
        }

        @Override
        public NBTTagCompound fixTagCompound(NBTTagCompound compound) {
            // Convert to new ID
            String oldName = compound.getString("id").toString();
            int variant = getNewVariantID(oldName);
            if (variant != 0) {
                compound.setString("id", "lepidodendron:prehistoric_flora_myriapod");
                compound.setString("PNType", EntityPrehistoricFloraMyriapod.Type.byId(variant).getName());
            }
            return compound;
        }
    };

}
