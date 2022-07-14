package net.lepidodendron.enchantments;

import net.lepidodendron.item.ItemBoneWand;
import net.lepidodendron.item.ItemRespawner;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraftforge.common.util.EnumHelper;

public class Enchantments {
    public static final EnumEnchantmentType PF_BONE_WAND = EnumHelper.addEnchantmentType("lepidodendron:bone_wand", (item)->(item instanceof ItemBoneWand.ItemCustom || item instanceof ItemRespawner.ItemCustom));
    public static final Enchantment TIME_REVERSAL = new EnchantmentTimeReverse();
}
