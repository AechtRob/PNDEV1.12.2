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

public class EntityInDimensionID implements LootCondition {
    private final int dimid;
    private final LootContext.EntityTarget target;

    public EntityInDimensionID(int dimidIn, LootContext.EntityTarget targetIn) {
        this.dimid = dimidIn;
        this.target = targetIn;
    }

    @Override
    public boolean testCondition(Random rand, LootContext context) {
        Entity entity = context.getEntity(this.target);

        if (entity == null) {
            return false;
        } else {
            if (dimid != entity.dimension)
                return false;
        }

        return true;
    }


    public static class Serializer extends LootCondition.Serializer<EntityInDimensionID> {

        public Serializer() {
            super(new ResourceLocation(LepidodendronMod.MODID + ":in_dimension_id"), EntityInDimensionID.class);
        }

        @Override
        public void serialize(JsonObject json, EntityInDimensionID value, JsonSerializationContext context) {
            json.add("dimid", context.serialize(value.dimid));
            json.add("entity", context.serialize(value.target));
        }

        public EntityInDimensionID deserialize(JsonObject json, JsonDeserializationContext context) {
            return new EntityInDimensionID(JsonUtils.getInt(json, "dimid"), (LootContext.EntityTarget) JsonUtils.deserializeClass(json, "entity", context, LootContext.EntityTarget.class));
        }
    }
}