package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.EntityPrehistoricFloraDragonfly;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class FishingRodDrops extends ElementsLepidodendronMod.ModElement {
    public FishingRodDrops(ElementsLepidodendronMod instance) {
        super(instance, 42);
    }

    public static ItemStack executeProcedure(World world, BlockPos pos, Random rand, @Nullable String[] mobList, Entity bobber) {

        if (LepidodendronConfig.genFishableOredicts.length < 1) {
            return null;
        }
        BlockPos spawnPos = pos;

        //Get mob list and pick a mob for this biome:
        boolean Creeks = false;
        boolean SeaForests = false;
        String[] MobString = new String[0];
        if (mobList == null) {
            //Biome biome = world.getBiome(pos.add(16, 0, 16)); //move to the centre of the 2x2 of chunks we are populating so the biome is more "likely" to be right
            Biome biome = world.getBiome(spawnPos);
            MobString = EntityLists.mobString(biome);
        } else {
            MobString = mobList;
        }

        if (MobString != null) {
            if (!(MobString.length >= 1)) {
                return null;
            }
        } else {
            return null;
        }

        //System.err.println("Running");

        String mobToSpawn;
        String nbtStr = "";
        int locationID = 1;
        boolean errFound;
        boolean posCheck;
        int strPos1;
        int strPos2;
        int strPos3;
        int strPos4;
        int strPos5;

        String[] var2 = MobString;
        //Shuffle the string so we pick a random mob later:
        List<String> list = Arrays.asList(var2);
        Collections.shuffle(list);
        list.toArray(var2);

        int var3 = var2.length;
        if (!(var3 >= 1)) { //No valid mob
            return null;
        }

        int var4 = rand.nextInt(var3); //Pick a mob from the list
        errFound = false;
        String checkEntity = var2[var4].trim();

        strPos1 = 0;
        strPos2 = 0;
        strPos3 = 0;
        strPos4 = 0;
        strPos5 = 0;
        nbtStr = "";

        strPos1 = checkEntity.indexOf(":");
        if (!(strPos1 > 0)) {
            errFound = true;
        }
        else {
            String modid = checkEntity.substring(0, strPos1);

            //Get the last two bits, first the rightmost colon:
            for (int i = checkEntity.length(); i > 0; i--) {
                if (checkEntity.charAt(i - 1) == ':') {
                    strPos2 = i;
                    break;
                }
            }

            if (strPos2 <= strPos1) {
                //The position means that something is missing
                errFound = true;
            } else {
                String locationStr = checkEntity.substring(checkEntity.length() - 1, checkEntity.length());
                if (!(locationStr.equals((String) "1") || locationStr.equals((String) "2") || locationStr.equals((String) "3") || locationStr.equals((String) "4") || locationStr.equals((String) "5") || locationStr.equals((String) "6") || locationStr.equals((String) "7") || locationStr.equals((String) "8"))) {
                    errFound = true;
                } else {
                    locationID = (int) Integer.parseInt(locationStr);

                    //Get the next last bit:
                    strPos3 = 0;
                    String tmpStr = checkEntity.substring(0, checkEntity.length() - 2);
                    for (int i = tmpStr.length(); i > 0; i--) {
                        if (tmpStr.charAt(i - 1) == ':') {
                            strPos3 = i;
                            break;
                        }
                    }
                    if (strPos3 <= strPos1) {
                        //The position means that something is missing
                        errFound = true;
                    } else {
                        tmpStr = tmpStr.substring(strPos3, tmpStr.length());
                        if (!isNumeric(tmpStr)) {
                            errFound = true;
                        } else {
                            int weight = (int) Integer.parseInt(tmpStr);
                            if (weight < -100 || weight > 100) {
                                errFound = true;
                            } else {

                                //Get the next last bit:
                                strPos5 = 0;
                                tmpStr = checkEntity.substring(0, strPos3 - 1);
                                for (int i = tmpStr.length(); i > 0; i--) {
                                    if (tmpStr.charAt(i - 1) == ':') {
                                        strPos5 = i;
                                        break;
                                    }
                                }
                                if (strPos5 <= strPos1) {
                                    //The position means that something is missing
                                    errFound = true;
                                } else {
                                    tmpStr = tmpStr.substring(strPos5, tmpStr.length());
                                    if (!isNumeric(tmpStr)) {
                                        errFound = true;
                                    } else {
                                        int maxSpawn = (int) Integer.parseInt(tmpStr);
                                        if (maxSpawn < 0 || maxSpawn > 20) {
                                            errFound = true;
                                        }

                                        //Everything left is the mod plus nbt (which may be wrong of course!)
                                        else { //Get the mob:

                                            mobToSpawn = checkEntity.substring(0, strPos5 - 1);
                                            //Is there nbt?
                                            strPos4 = 0;
                                            strPos4 = mobToSpawn.indexOf("{");
                                            if (strPos4 > 0) {
                                                //we have nbt:
                                                nbtStr = mobToSpawn.substring(strPos4, mobToSpawn.length());
                                                mobToSpawn = mobToSpawn.substring(0, strPos4);

//                                                    //Is the nbt string made of alternates?
//                                                    if (nbtStr.indexOf("@") > 0) {
//                                                        String[] arrSplit = nbtStr.split("@");
//                                                        nbtStr = arrSplit[rand.nextInt(arrSplit.length)];
//                                                    }
                                            }

                                            if (findEntity(mobToSpawn) != null) {
                                                //Spawn routine (finally!)
                                                int i2;
                                                int i18 = 0;
                                                posCheck = false;

                                                //System.err.println(mobToSpawn + " in ID " + locationID);
                                                if (locationID == 1 || locationID == 5 || locationID == 8) {
                                                    //Non-water spawns, so abandon this test:
                                                    return null;
                                                }

                                                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                EntityLiving entity = (EntityLiving) ee.newInstance(world);

                                                //System.err.println("LocationID: " + locationID);
                                                //System.err.println("Poscheck: " + posCheck);
                                                //System.err.println("errFound: " + errFound);
                                                if (!errFound) {
                                                    //System.err.println("Spawning " + mobToSpawn + " with locationID " + locationID + " at: " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());
                                                    //System.err.println("maxSpawn: " + maxSpawn);

                                                    boolean rare = (weight < 0);
                                                    weight = Math.abs(weight);

                                                    //System.err.println("weight: " + weight);
                                                    //System.err.println("rare: " + rare);

                                                    double weighter = 100D;

                                                    //Deal with rare spawns:
                                                    if (rare) {
                                                        weighter = weighter * 2;
                                                        if (rand.nextInt(2) == 0) {
                                                            return null;
                                                        }
                                                    }

                                                    //Deal with bumping up creek spawns:
                                                    if (Creeks) {
                                                        weighter = weighter * 0.225;
                                                    }

                                                    //Deal with bumping up sea forests spawns:
                                                    if (SeaForests) {
                                                        weighter = weighter * 0.333;
                                                    }

                                                    if ((Math.random() * weighter) <= (double) weight) {
                                                        //System.err.println("Trying......");
//                                                            if (entity instanceof EntityPrehistoricFloraKalbarria) {
//                                                                int ll = 0;
//                                                            }
                                                        //System.err.println("spawnQty: " + spawnQty);
                                                        //Check if an associated block or structure is required:
                                                        //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                        //EntityLiving entity = (EntityLiving) ee.newInstance(world);

                                                        boolean doAgeVar = false;


                                                        //Is the nbt string made of alternates?
                                                        if (nbtStr.indexOf("@") > 0) {
                                                            String[] arrSplit = nbtStr.split("@");
                                                            nbtStr = arrSplit[rand.nextInt(arrSplit.length)];
                                                        }

                                                        if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                            EntityPrehistoricFloraAgeableBase ageableBase = (EntityPrehistoricFloraAgeableBase) entity;
                                                            int adultAge = ageableBase.getAdultAge();
                                                            if (nbtStr.equalsIgnoreCase("")) {
                                                                nbtStr = "{AgeTicks:" + adultAge + "}";
                                                            } else {
                                                                nbtStr = "{AgeTicks:" + adultAge + "," + nbtStr.substring(1);
                                                            }
                                                        } else if (mobToSpawn.startsWith("fossil:")) {
                                                            if (nbtStr.equalsIgnoreCase("")) {
                                                                nbtStr = "{Gender:" + rand.nextInt(2) + "}";
                                                            } else {
                                                                nbtStr = "{Gender:" + rand.nextInt(2) + "," + nbtStr.substring(1);
                                                            }
                                                        }

                                                        if (mobToSpawn.equalsIgnoreCase("lepidodendron:prehistoric_flora_dragonfly")) {
                                                            nbtStr = "{PNType:\"" + EntityPrehistoricFloraDragonfly.Type.byId(rand.nextInt(EntityPrehistoricFloraDragonfly.Type.values().length) + 1) + "\"}";
                                                        }

                                                        NBTTagCompound nbttagcompound = new NBTTagCompound();
                                                        try
                                                        {
                                                            nbttagcompound = JsonToNBT.getTagFromJson(nbtStr);
                                                            entity.readFromNBT(nbttagcompound);
                                                        }
                                                        catch (NBTException nbtexception)
                                                        {
                                                        }

                                                        //Get the mob's drops:
                                                        ResourceLocation resourcelocation = null;
                                                        try { //Uggggh, reflection :(
                                                            Method method = entity.getClass().getDeclaredMethod("func_184647_J"); //"getLootTable"
                                                            method.setAccessible(true);
                                                            resourcelocation = (ResourceLocation) method.invoke(entity);
                                                        } catch (Exception e) {
                                                            try { //Uggggh, reflection :(
                                                                Method method = entity.getClass().getDeclaredMethod("getLootTable");
                                                                method.setAccessible(true);
                                                                resourcelocation = (ResourceLocation) method.invoke(entity);
                                                            } catch (Exception exception) {
                                                            }
                                                        }
                                                        if (resourcelocation != null) {
                                                            LootTable loottable = bobber.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
                                                            LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) bobber.world)).withLootedEntity(entity).withLuck(Float.MAX_VALUE).withDamageSource(DamageSource.GENERIC).withPlayer(null);
                                                            List<ItemStack> itemstackpool = loottable.generateLootForPools(bobber.world.rand, lootcontext$builder.build());
                                                            if (!itemstackpool.isEmpty()) {
                                                                for (ItemStack itemstack : itemstackpool) {
                                                                    //Loop over the itemstacks to see what the drops are:
                                                                    String[] oreDictList = LepidodendronConfig.genFishableOredicts;
                                                                    for (String oreDict : oreDictList) {
                                                                        if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), itemstack)) {
                                                                            return itemstack;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }


                                                    }
                                                    //System.err.println("Failed rarity test " + mobToSpawn);
                                                }
                                                if (entity != null) {
                                                    entity.setDead();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
            if (errFound) {
                System.err.println("Syntax error in mob spawn config: '" + checkEntity + "'!");
            }
        }
        return null;
    }

    private static Class<? extends Entity> findEntity(String entity) {
        Class<? extends Entity> entityClass;
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
        entityClass = ee == null ? null : ee.getEntityClass();
        if (entityClass == null) {
            //System.err.println("Unknown mob requested for spawn: '" + entity + "'!");
            return null;
        }
        return entityClass;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
