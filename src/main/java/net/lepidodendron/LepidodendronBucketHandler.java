package net.lepidodendron;

import net.lepidodendron.entity.base.*;
import net.lepidodendron.item.entities.ItemBucketOfMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

public class LepidodendronBucketHandler {

    @SubscribeEvent
    public void onUseBucket(PlayerInteractEvent.EntityInteract event) {
        /// click on entities:
        ItemStack stackIn = event.getItemStack();
        if (stackIn.getItem() != Items.WATER_BUCKET) {
            return;
        }
        EntityPlayer playerIn = event.getEntityPlayer();
        Entity entityIn = event.getTarget();

        if (entityIn instanceof EntityPrehistoricFloraAgeableFishBase) {
            EntityPrehistoricFloraAgeableFishBase ee = (EntityPrehistoricFloraAgeableFishBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraAmphibianBase) {
            EntityPrehistoricFloraAmphibianBase ee = (EntityPrehistoricFloraAmphibianBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraEurypteridBase) {
            EntityPrehistoricFloraEurypteridBase ee = (EntityPrehistoricFloraEurypteridBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraFishBase) {
            EntityPrehistoricFloraFishBase ee = (EntityPrehistoricFloraFishBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraJellyfishBase) {
            EntityPrehistoricFloraJellyfishBase ee = (EntityPrehistoricFloraJellyfishBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraNautiloidBase) {
            EntityPrehistoricFloraNautiloidBase ee = (EntityPrehistoricFloraNautiloidBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraSlitheringWaterBase) {
            EntityPrehistoricFloraSlitheringWaterBase ee = (EntityPrehistoricFloraSlitheringWaterBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
            EntityPrehistoricFloraTrilobiteBottomBase ee = (EntityPrehistoricFloraTrilobiteBottomBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
        else if (entityIn instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            EntityPrehistoricFloraTrilobiteSwimBase ee = (EntityPrehistoricFloraTrilobiteSwimBase) entityIn;
            if (!ee.isSmall()) {
                if (event.getWorld().isRemote) {
                    playerIn.sendMessage(new TextComponentString(ee.getName() + " " + ee.getBucketMessage()));
                }
                return;
            }
            ItemStack stackFullBucket = new ItemStack(ItemBucketOfMob.block, (int) (1));
            stackFullBucket.setCount(1);
            stackIn.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(playerIn, createBucketWithEntity(entityIn));
            playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            playerIn.swingArm(event.getHand());
            event.setCanceled(true);
        }
    }

    public ItemStack createBucketWithEntity(Entity entity) {

        Entity checkEntity = entity;

        if (checkEntity instanceof MultiPartEntityPart) {
            MultiPartEntityPart multiPartEntity = (MultiPartEntityPart)entity;
            if (multiPartEntity.parent instanceof Entity) {
                checkEntity = (Entity) multiPartEntity.parent;
            }
        }

        ItemStack bucketStack = new ItemStack(ItemBucketOfMob.block, 1);
        bucketStack = getItemStackFromEntity(checkEntity, bucketStack);
        checkEntity.setDead();

        return bucketStack;
    }

    public static ItemStack getItemStackFromEntity(Entity entity, ItemStack spawnItem) {

        ItemStack stack = spawnItem;

        NBTTagCompound entityNBT = new NBTTagCompound();
        entity.writeToNBT(entityNBT);

        entityNBT.setShort("HurtTime", (short) 0);
        entityNBT.setTag("Motion", newDoubleNBTList(0.0D, 0.0D, 0.0D));
        entityNBT.setFloat("FallDistance", 0.0F);
        entityNBT.setString("id", getEntityId(entity));
        NBTTagCompound stackNBT = new NBTTagCompound();
        stackNBT.setTag("Mob", entityNBT);

        stack.setTagCompound(stackNBT);

        stack.getTagCompound().setString("mob_name", entity.getName());

        return stack;
    }

    private static NBTTagList newDoubleNBTList(double... numbers) {
        NBTTagList nbttaglist = new NBTTagList();
        for (double number : numbers) {
            nbttaglist.appendTag(new NBTTagDouble(number));
        }
        return nbttaglist;
    }

    public static String getEntityId(Entity entity) {
        String mobid = "";
        net.minecraftforge.fml.common.registry.EntityEntry entry =
                net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(entity.getClass());
        if (entry != null) {
            mobid = entry.getRegistryName().toString();
        }
        return mobid;
    }

}

