package net.lepidodendron.util.patchouli;

import net.lepidodendron.LepidodendronBookSubscribers;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.util.Functions;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

import java.lang.reflect.Method;

public class Diet implements IComponentProcessor {

    String mob;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.mob = iVariableProvider.get("mob");
    }

    @Override
    public String process(String s) {
        String mobString = this.mob;
        int i = mobString.indexOf("@");
        if (i > 0) {
            //pnVariant = mobString.substring(i + 1);
            mobString = mobString.substring(0, i);
        }
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobString));
        Class clazz = ee.getEntityClass();
        Method method = Functions.testAndGetMethod(clazz, "getFoodOreDicts", null);
        String[] string = new String[]{};
        String result = "";
        String nestString = "N/A";
        EntityLiving entity = (EntityLiving) ee.newInstance(null);
        String homingString = LepidodendronBookSubscribers.getHomingString(entity, false);
        if (method != null) {
            try {
                string = (String[]) method.invoke(entity, (Object[]) null);
                nestString = LepidodendronBookSubscribers.getNestString(entity, false);
            }
            catch (Exception e) {
            }
        } else {
        }
        if (string.length > 0) {
            for (String element : string) {
                if (!result.contains("$(li)" + I18n.translateToLocal("oredict." + element + ".name").trim())) {
                    result = result + "$(br)" + "$(li)" + I18n.translateToLocal("oredict." + element + ".name").trim();
                }
            }
        }
        else {
            result = "$(br)Unknown diet";
        }
        if (entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            nestString = nestString + " (can only breed when on the ground)";
        }
        entity.setDead();
        return "$(br)$(l)Diet:$()$(br)" + result + "$(br2)" + "$(l)Breeding notes:$()$(br)" + nestString + "$(br2)" + homingString;
    }

}
