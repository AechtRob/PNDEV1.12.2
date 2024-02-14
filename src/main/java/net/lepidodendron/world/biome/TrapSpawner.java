package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.*;

@ElementsLepidodendronMod.ModElement.Tag
public class TrapSpawner extends ElementsLepidodendronMod.ModElement {
    public TrapSpawner(ElementsLepidodendronMod instance) {
        super(instance, 42);
    }

    public static String[] parseList(String[] inputList, int type, World world) throws InstantiationException, IllegalAccessException {
        ArrayList<String> newString = new ArrayList<String>();
        for (String entityStr : inputList) {
            //Rough-and-ready test:
            int colonTwo = entityStr.indexOf(":", entityStr.indexOf(":") + 1);
            if (colonTwo > 0) {
                EntityEntry ee = null;
                int nbt = entityStr.indexOf("{");
                if (nbt > 0) {
                    ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entityStr.substring(0, entityStr.indexOf("{")).substring(0, colonTwo)));
                }
                else {
                    ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entityStr.substring(0, colonTwo)));
                }
                //Try to construct this mob:
                if (ee != null) {
                    EntityLiving entity = (EntityLiving) ee.newInstance(world);
                    if (entity instanceof ITrappableAir && type == 1) {
                        newString.add(entityStr);
                    }
                    if (entity instanceof ITrappableLand && type == 2) {
                        newString.add(entityStr);
                    }
                    if (entity instanceof ITrappableWater && type == 3) {
                        newString.add(entityStr);
                    }
                    entity.setDead();
                }
            }
        }

        return newString.toArray(new String[0]);
    }

    public static String testBait(World world, BlockPos pos, Random rand, ItemStack stack, int type) throws InstantiationException, IllegalAccessException {

        //Get mob list and pick a mob for this biome:
        boolean TriassicCanyons = false;
        String[] MobString = new String[0];

        Biome biome = world.getBiome(pos);
        MobString = parseList(EntityLists.mobString(biome), type, world);

        if (!(MobString.length >= 1)) {
            return "Nothing found in this location";
        }
        else if (stack.isEmpty()) {
            return "";
        }

        String mobToSpawn;
        String nbtStr = "";
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
        //Collections.shuffle(list);
        //list.toArray(var2);

        int var3 = var2.length;

        for (int var4 = 1; var4 <= var3; var4++) {
            //var4 = var4 - 1;

            //int var4 = rand.nextInt(var3); //Pick a mob from the list
            errFound = false;
            String checkEntity = var2[var4 - 1].trim();

            strPos1 = 0;
            strPos2 = 0;
            strPos3 = 0;
            strPos4 = 0;
            strPos5 = 0;
            nbtStr = "";

            strPos1 = checkEntity.indexOf(":");
            if (!(strPos1 > 0)) {
                errFound = true;
            } else {
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
                        int locationID = (int) Integer.parseInt(locationStr);

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

                                                    //Is the nbt string made of alternates?
                                                    if (nbtStr.indexOf("@") > 0) {
                                                        String[] arrSplit = nbtStr.split("@");
                                                        nbtStr = arrSplit[rand.nextInt(arrSplit.length)];
                                                    }
                                                }

                                                if (findEntity(mobToSpawn) != null) {
                                                    //Spawn routine (finally!)

                                                    //System.err.println("LocationID: " + locationID);
                                                    //System.err.println("Poscheck: " + posCheck);
                                                    //System.err.println("errFound: " + errFound);

                                                    EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                    EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                    boolean correctBait = false;
                                                    if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                        if (((EntityPrehistoricFloraAgeableBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraSlitheringWaterBase) {
                                                        if (((EntityPrehistoricFloraSlitheringWaterBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
                                                        if (((EntityPrehistoricFloraCrawlingFlyingInsectBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraFishBase) {
                                                        if (((EntityPrehistoricFloraFishBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraInsectFlyingBase) {
                                                        if (((EntityPrehistoricFloraInsectFlyingBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraJellyfishBase) {
                                                        if (((EntityPrehistoricFloraJellyfishBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
                                                        if (((EntityPrehistoricFloraTrilobiteBottomBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    } else if (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
                                                        if (((EntityPrehistoricFloraTrilobiteSwimBase) entity).isBreedingItem(stack)) {
                                                            correctBait = true;
                                                        }
                                                    }
                                                    //Disallow large things as babies 99% of the time:
                                                    if (correctBait) {
                                                        if (nbtStr.indexOf("AgeTicks:0") > 0) {
                                                            if (rand.nextInt(100) != 0) {
                                                                correctBait = false;
                                                            }
                                                        }
                                                    }

                                                    if (!errFound && correctBait) {
                                                        //System.err.println("Spawning " + mobToSpawn + " with locationID " + locationID + " at: " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());
                                                        //System.err.println("maxSpawn: " + maxSpawn);

                                                        if (!(TriassicCanyons && pos.getY() > 70)) {

                                                            return "";

                                                            //System.err.println("Spawned in " + world.getBiome(spawnPos).getBiomeName() + " at locID " + locationID + " " + mobToSpawn + " at " + spawnPos.getX() + " " + (spawnPos.getY() + 1) + " " + spawnPos.getZ());
                                                        }
                                                    }
                                                    if (entity != null) {
                                                        entity.setDead();
                                                    }
                                                    //System.err.println("Failed rarity test " + mobToSpawn);
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
        }
        return "This bait invalid in this location";
    }


    public static void executeProcedure(World world, BlockPos pos, Random rand, ItemStack stack, int type) throws InstantiationException, IllegalAccessException {

        //Get mob list and pick a mob for this biome:
        boolean TriassicCanyons = false;
        String[] MobString = new String[0];

        Biome biome = world.getBiome(pos);
        //MobString = EntityLists.mobString(biome, type);
        MobString = parseList(EntityLists.mobString(biome), type, world);

        if (!(MobString.length >= 1)) {
            return;
        }

        //System.err.println("Running");

        String mobToSpawn;
        String nbtStr = "";
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
                    int locationID = (int) Integer.parseInt(locationStr);

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

                                                //Is the nbt string made of alternates?
                                                if (nbtStr.indexOf("@") > 0) {
                                                    String[] arrSplit = nbtStr.split("@");
                                                    nbtStr = arrSplit[rand.nextInt(arrSplit.length)];
                                                }
                                            }

                                            if (findEntity(mobToSpawn) != null) {
                                                //Spawn routine (finally!)

                                                //System.err.println("LocationID: " + locationID);
                                                //System.err.println("Poscheck: " + posCheck);
                                                //System.err.println("errFound: " + errFound);

                                                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                boolean correctBait = false;
                                                if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                    if (((EntityPrehistoricFloraAgeableBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraSlitheringWaterBase) {
                                                    if (((EntityPrehistoricFloraSlitheringWaterBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
                                                    if (((EntityPrehistoricFloraCrawlingFlyingInsectBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraFishBase) {
                                                    if (((EntityPrehistoricFloraFishBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraInsectFlyingBase) {
                                                    if (((EntityPrehistoricFloraInsectFlyingBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraJellyfishBase) {
                                                    if (((EntityPrehistoricFloraJellyfishBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
                                                    if (((EntityPrehistoricFloraTrilobiteBottomBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }
                                                else if (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
                                                    if (((EntityPrehistoricFloraTrilobiteSwimBase)entity).isBreedingItem(stack)) {
                                                        correctBait = true;
                                                    }
                                                }

                                                if (!errFound && correctBait) {
                                                    //System.err.println("Spawning " + mobToSpawn + " with locationID " + locationID + " at: " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());
                                                    //System.err.println("maxSpawn: " + maxSpawn);

                                                    if (!(TriassicCanyons && pos.getY() > 70)) {

                                                        //Spawn the mob via a command:
                                                        if (!world.isRemote && world.getMinecraftServer() != null) {
                                                            stack.shrink(1); //Consume bait

                                                            SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
                                                            world.playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);

                                                            // Apply babification  - should be fine to do this to everything
                                                            // as invalid tags will be stripped out eventually on a world save:

                                                            EntityPrehistoricFloraAgeableBase.summon(world, mobToSpawn, nbtStr, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, true);


                                                            //System.err.println("summon " + mobToSpawn + " " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ() + " " + nbtStr);
//                                                            world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
//                                                                @Override
//                                                                public String getName() {
//                                                                    return "";
//                                                                }
//
//                                                                @Override
//                                                                public boolean canUseCommand(int permission, String command) {
//                                                                    return true;
//                                                                }
//
//                                                                @Override
//                                                                public World getEntityWorld() {
//                                                                    return world;
//                                                                }
//
//                                                                @Override
//                                                                public MinecraftServer getServer() {
//                                                                    return world.getMinecraftServer();
//                                                                }
//
//                                                                @Override
//                                                                public boolean sendCommandFeedback() {
//                                                                    return false;
//                                                                }
//
//                                                            }, "pf_summon " + mobToSpawn + " " + pos.getX() + " " + (pos.getY()) + " " + pos.getZ() + " " + nbtStr);
                                                        }
                                                        //System.err.println("Spawned in " + world.getBiome(spawnPos).getBiomeName() + " at locID " + locationID + " " + mobToSpawn + " at " + spawnPos.getX() + " " + (spawnPos.getY() + 1) + " " + spawnPos.getZ());
                                                    }
                                                }
                                                if (entity != null) {
                                                    entity.setDead();
                                                }
                                                //System.err.println("Failed rarity test " + mobToSpawn);
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

    public static BlockPos getTopSolidOrLiquidBlockIncludingLeaves(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos;
        BlockPos blockpos1;

        for (blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ()); blockpos.getY() >= 0; blockpos = blockpos1)
        {
            blockpos1 = blockpos.down();
            IBlockState state = chunk.getBlockState(blockpos1);

            if (state.getMaterial().blocksMovement())
            {
                break;
            }
        }

        return blockpos;
    }

    public static BlockPos getTopSolidBlock(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ());
        BlockPos blockpos1 = blockpos;
        int yy = blockpos.getY();
        while (yy > 0)
        {
            blockpos1 = new BlockPos(pos.getX(), yy, pos.getZ());
            IBlockState state = world.getBlockState(blockpos1);

            if (state.getMaterial().blocksMovement()
                    && state.getMaterial() != Material.WATER
                    && state.getMaterial() != Material.LEAVES
                    && state.getMaterial() != Material.VINE
                    && state.getMaterial() != Material.PLANTS)
            {
                break;
            }
            yy --;
        }

        return blockpos1;
    }

}
