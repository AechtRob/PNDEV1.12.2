package net.lepidodendron.world.lootconditions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.lepidodendron.LepidodendronMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.conditions.LootCondition;

import java.util.Random;

public class EntityInDimensionName implements LootCondition
{
    private final String dimname;
    private final LootContext.EntityTarget target;

    public EntityInDimensionName(String dimnameIn, LootContext.EntityTarget targetIn)
    {
        this.dimname = dimnameIn;
        this.target = targetIn;
    }

    @Override
    public boolean testCondition(Random rand, LootContext context)
    {
        Entity entity = context.getEntity(this.target);

        if (entity == null)
        {
            return false;
        }
        else
        {
            //if (entity.dimension != this.dimID)
            if (!dimname.equalsIgnoreCase(entity.getEntityWorld().provider.getDimensionType().toString()))
            {
                return false;
            }

            return true;
        }
    }

    public static class Serializer extends LootCondition.Serializer<EntityInDimensionName>
    {

        public Serializer()
        {
            super(new ResourceLocation(LepidodendronMod.MODID + ":in_dimension_name"), EntityInDimensionName.class);
        }

        @Override
        public void serialize(JsonObject json, EntityInDimensionName value, JsonSerializationContext context)
        {
            json.addProperty("dimname", value.dimname);
            json.add("entity", context.serialize(value.target));
        }

        public EntityInDimensionName deserialize(JsonObject json, JsonDeserializationContext context)
        {
            return new EntityInDimensionName(JsonUtils.getString(json, "dimname"), (LootContext.EntityTarget)JsonUtils.deserializeClass(json, "entity", context, LootContext.EntityTarget.class));
        }
    }
}
