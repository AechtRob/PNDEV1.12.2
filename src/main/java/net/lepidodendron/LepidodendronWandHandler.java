//package net.lepidodendron;
//
//import net.lepidodendron.enchantments.Enchantments;
//import net.lepidodendron.item.ItemBoneWand;
//import net.lepidodendron.item.ItemPetrified;
//import net.lepidodendron.util.ModTriggers;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.effect.EntityLightningBolt;
//import net.minecraft.entity.item.EntityItemFrame;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.entity.player.EntityPlayerMP;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraftforge.event.entity.player.PlayerInteractEvent;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//public class LepidodendronWandHandler {
//
//    @SubscribeEvent
//    public void useWand(PlayerInteractEvent.EntityInteract event)
//    {
//
//       // System.err.println("wanded");
//
//        EntityPlayer player = event.getEntityPlayer();
//        Entity e = event.getTarget();
//        World world = event.getWorld();
//        BlockPos pos = event.getPos();
//        EnumFacing facing = event.getFace();
//
//        //System.err.println("entity " + e);
//
//        if ((!(world.isRemote)) && (e instanceof EntityItemFrame) && (player.getHeldItemMainhand().getItem() == new ItemStack(ItemBoneWand.block, (int) (1)).getItem())) {
//            //Right clicked on item frame with a bone wand:
//
//            ItemStack wandstack = player.getHeldItem(EnumHand.MAIN_HAND);
//            int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.TIME_REVERSAL, wandstack);
//            //System.err.println(levelEnchantment);
//            if (levelEnchantment > 0) {
//
//                EntityItemFrame Frame = (EntityItemFrame) e;
//                ItemStack itemstack = Frame.getDisplayedItem();
//
//                if (!itemstack.isEmpty()) {
//                    Item item = itemstack.getItem();
//                    if (item instanceof ItemPetrified) {
//                        ItemPetrified itemPetrified = (ItemPetrified) item;
//
//                        //System.err.println(itemPetrified.getPlantStack().getItem());
//
//                        //Create a real plant from this in the frame:
//                        Frame.setItemRotation(7);
//                        if (itemPetrified.getPlantStack() != null) {
//                            Frame.setDisplayedItem(itemPetrified.getPlantStack());
//                            world.addWeatherEffect(new EntityLightningBolt(world, (int) e.getPosition().getX(), (int) e.getPosition().getY(), (int) e.getPosition().getZ(), true));
//                            if (!player.capabilities.isCreativeMode && wandstack.getItemDamage() < (wandstack.getMaxDamage() - 1)) {
//                                wandstack.damageItem(1, player);
//                            }
//                            ModTriggers.REJUVENATE.trigger((EntityPlayerMP)player);
//                        }
//                    }
//                }
//            }
//        }
//    }
//}