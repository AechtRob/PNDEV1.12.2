package net.lepidodendron.util;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.entity.Entity;

import java.lang.reflect.Field;
import java.util.Map;

public class TriggerRegistry {

    private static final Map<Class<? extends Entity>, CustomTrigger> entityTriggerMap = new Object2ObjectOpenHashMap<>();


    static {
        try {
            Field[] fields = ModTriggers.class.getDeclaredFields();

            for (Field field : fields) {

                if (field.getType().equals(CustomTrigger.class) &&
                        java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
                        java.lang.reflect.Modifier.isFinal(field.getModifiers())) {

                    CustomTrigger trigger = (CustomTrigger) field.get(null);


                    if (trigger != null) {
                        }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static CustomTrigger getTriggerForEntity(Class<? extends Entity> entityClass) {
        return entityTriggerMap.get(entityClass);
    }
}
