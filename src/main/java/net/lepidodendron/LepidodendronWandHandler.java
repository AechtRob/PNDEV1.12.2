package net.lepidodendron;

import net.lepidodendron.enchantments.Enchantments;
import net.lepidodendron.item.ItemBoneWand;
import net.lepidodendron.world.WorldOverworldPortal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LepidodendronWandHandler {

    @SubscribeEvent
    public void useWand(PlayerInteractEvent.RightClickBlock event) {

        EntityPlayer entity = event.getEntityPlayer();
        World world = event.getWorld();
        BlockPos pos = event.getPos();
        EnumHand hand = event.getHand();
        EnumFacing facing = event.getFace();

//        if (world.isRemote) {
//            return;
//        }

        BlockPos pos1 = pos.offset(facing);
        ItemStack itemstack = entity.getHeldItem(hand);

        if (itemstack.getItem() != ItemBoneWand.block) {
            return;
        }

        if (!(itemstack.getItem().getDamage(itemstack) < (itemstack.getItem().getMaxDamage() - 1))) {
            event.setCancellationResult(EnumActionResult.FAIL);
            event.setCanceled(true);
            return;
        }

        int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.TIME_REVERSAL, itemstack);
        if (levelEnchantment > 0) {
            if (!entity.canPlayerEdit(pos1, facing, itemstack)) {
                event.setCancellationResult(EnumActionResult.FAIL);
                event.setCanceled(true);
                return;
            }
            if (world.isAirBlock(pos1)) {
                if (world.provider.getDimension() == 0) {
                    return;
                }
                if ((!LepidodendronConfig.globalHomePortals)
                        && world.provider.getDimension() != LepidodendronConfig.dimPrecambrian
                        && world.provider.getDimension() != LepidodendronConfig.dimCambrian
                        && world.provider.getDimension() != LepidodendronConfig.dimOrdovician
                        && world.provider.getDimension() != LepidodendronConfig.dimSilurian
                        && world.provider.getDimension() != LepidodendronConfig.dimDevonian
                        && world.provider.getDimension() != LepidodendronConfig.dimCarboniferous
                        && world.provider.getDimension() != LepidodendronConfig.dimPermian
                        && world.provider.getDimension() != LepidodendronConfig.dimTriassic
                        && world.provider.getDimension() != LepidodendronConfig.dimJurassic
                        && world.provider.getDimension() != LepidodendronConfig.dimCretaceousEarly
                        && world.provider.getDimension() != LepidodendronConfig.dimCretaceousLate
                        && world.provider.getDimension() != LepidodendronConfig.dimPaleogene
                        && world.provider.getDimension() != LepidodendronConfig.dimNeogene
                        && world.provider.getDimension() != LepidodendronConfig.dimPleistocene) {
                    return;
                }

                boolean portalSpawnOverworld = WorldOverworldPortal.portal.portalSpawn(world, pos1);

                if (portalSpawnOverworld) {
                    if (!entity.capabilities.isCreativeMode && itemstack.getItemDamage() < (itemstack.getItem().getMaxDamage() - 1)) {
                        itemstack.damageItem(1, entity);
                    }
                    event.setCancellationResult(EnumActionResult.SUCCESS);
                    event.setCanceled(true);
                    return;
                }
            }
        }
    }


}
