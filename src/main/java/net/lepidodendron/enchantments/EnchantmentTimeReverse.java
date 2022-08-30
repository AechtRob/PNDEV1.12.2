package net.lepidodendron.enchantments;

import net.lepidodendron.LepidodendronMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentTimeReverse extends Enchantment {

    public EnchantmentTimeReverse() {
        super(Rarity.RARE, Enchantments.PF_BONE_WAND, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND,EntityEquipmentSlot.OFFHAND});
        this.setName("pf_time_reversal");
        this.setRegistryName(new ResourceLocation(LepidodendronMod.MODID + ":pf_time_reversal"));
    }

    //@Override
    //public int getMinEnchantability(int enchantmentLevel)
    //    return 0;
    //}

    //@Override
    //public int getMaxEnchantability(int enchantmentLevel)
    //{
   //     return 0;
   //}

    @Override
    public boolean isAllowedOnBooks()
    {
        return false;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 0;
    }

}
