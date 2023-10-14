package net.lepidodendron.item.armor;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.model.armor.ModelRubberBoots;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;


public class PNArmorModel extends ItemArmor implements IHasModel {

    public PNArmorModel(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, 1, equipmentSlotIn);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(1);

        ArmorInit.ARMOR.add(this);
    }

    public void registerModels()
    {
        LepidodendronMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Nullable
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (itemStack != ItemStack.EMPTY) {
            if (itemStack.getItem() instanceof ItemArmor) {
                ModelRubberBoots model = new ModelRubberBoots();
                model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                model.isChild = _default.isChild;
                model.isRiding = _default.isChild;
                model.isSneak = _default.isChild;

                return model;
            }
        }
        return null;
    }
}

