package net.lepidodendron.world.lootconditions;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.lepidodendron.LepidodendronMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.conditions.LootCondition;

import java.util.Random;

public class EntityInBiomes implements LootCondition
{
    private final String[] biomes;
    private final LootContext.EntityTarget target;

    public EntityInBiomes(String[] biomesIn, LootContext.EntityTarget targetIn)
    {
        this.biomes = biomesIn;
        this.target = targetIn;
    }

    @Override
    public boolean testCondition(Random rand, LootContext context)
    {
        System.err.println("Testing fishing biome condition");
        Entity entity = context.getEntity(this.target);

        if (entity == null)
        {
            return false;
        }
        else
        {
            World world = entity.getEntityWorld();
            BlockPos pos = entity.getPosition();
            String biome = "\"" + world.getBiome(pos).getRegistryName().toString() + "\"";
            for (String biomess : this.biomes) {
                if (biomess.equalsIgnoreCase(biome)) {
                    System.err.println("Located biome fishing loot table for " + biome);
                    return true;
                }
            }
            return false;
        }
    }

    public static class Serializer extends LootCondition.Serializer<EntityInBiomes>
    {

        public Serializer()
        {
            super(new ResourceLocation(LepidodendronMod.MODID + ":in_biomes"), EntityInBiomes.class);
        }

        @Override
        public void serialize(JsonObject json, EntityInBiomes value, JsonSerializationContext context)
        {
            JsonObject jsonobject = new JsonObject();

            for (String biomes : value.biomes)
            {
                jsonobject.addProperty(biomes, biomes);
            }

            json.add("biomes", jsonobject);
            json.add("entity", context.serialize(value.target));
        }

        public EntityInBiomes deserialize(JsonObject json, JsonDeserializationContext context)
        {
            JsonArray set = JsonUtils.getJsonArray(json, "biomes");
            String[] abiomes = new String[set.size()];
            //int i = 0;

            for(int i = 0; i < set.size(); i += 1)

            //for (Map.Entry<String, JsonElement> entry : set)
            {
                abiomes[i] = set.get(i).toString();
            }

            return new EntityInBiomes(abiomes, (LootContext.EntityTarget)JsonUtils.deserializeClass(json, "entity", context, LootContext.EntityTarget.class));
        }
    }
}
