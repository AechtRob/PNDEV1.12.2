package net.lepidodendron.item.armor;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ArmorInit {

    public static final List<Item> ARMOR = new ArrayList<Item>();

    public static final ItemArmor.ArmorMaterial PN_RUBBER_ARMOR
        = EnumHelper.addArmorMaterial("pn_rubber_armor", LepidodendronMod.MODID + ":pn_rubber_armor", 20, new int[] {1,1,1,1} /*helmet,chestplate,leggings,boots*/, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0F);

    public static final Item RUBBER_BOOTS = new PNArmorModel("rubber_boots", TabLepidodendronMisc.tab, PN_RUBBER_ARMOR, EntityEquipmentSlot.FEET);
}
