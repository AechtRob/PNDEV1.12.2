package net.lepidodendron.entity.datafixers;

import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyopteraNymph;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.IFixableData;

import java.util.Random;

public interface FixerTitanopteraNymph {

    IFixableData FixerTitanopteraNymph = new IFixableData() {

        private int getNewVariantID(String oldID) {
            Random rand = new Random();
            int i = rand.nextInt(9) + 1;
            while (i != 2) {
                i = rand.nextInt(9) + 1;
            }
            if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_nymph")) {
                return i;
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
                compound.setString("id", "lepidodendron:prehistoric_flora_palaeodictyoptera_nymph");
                compound.setString("PNType", EntityPrehistoricFloraPalaeodictyopteraNymph.Type.byId(variant).getName());
            }
            return compound;
        }
    };

}
