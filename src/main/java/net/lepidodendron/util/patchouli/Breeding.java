package net.lepidodendron.util.patchouli;

import net.lepidodendron.LepidodendronBookSubscribers;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import vazkii.patchouli.api.IComponentProcessor;
import vazkii.patchouli.api.IVariableProvider;

public class Breeding implements IComponentProcessor {

    String mob;

    @Override
    public void setup(IVariableProvider<String> iVariableProvider) {
        this.mob = iVariableProvider.get("mob");
    }

    @Override
    public String process(String s) {
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(this.mob));
        String result = "Unknown";
        try {
            EntityLiving entity = (EntityLiving) ee.newInstance(null);
            result = LepidodendronBookSubscribers.getNestString(entity, false);
            entity.setDead();
        }
        catch (Exception e) {
        }
        return result;
    }

}
