package net.lepidodendron.entity.datafixers;

import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyoptera;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.IFixableData;

public interface FixerPalaeodictyoptera {

    IFixableData FixerPalaeodictyoptera = new IFixableData() {

        private int getNewVariantID(String oldID) {
            if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala")) {
                return 1;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_dunbaria")) {
                return 2;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura")) {
                return 3;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera")) {
                return 4;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis")) {
                return 5;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus")) {
                return 6;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria")) {
                return 7;
            }
            else if (oldID.equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya")) {
                return 8;
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
                compound.setString("id", "lepidodendron:prehistoric_flora_palaeodictyoptera");
                compound.setString("PNInsectType", EntityPrehistoricFloraPalaeodictyoptera.Type.byId(variant).getName());
            }
            //Other nbt:


            return compound;
        }
    };

}
