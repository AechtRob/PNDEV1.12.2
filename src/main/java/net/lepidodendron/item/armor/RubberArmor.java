package net.lepidodendron.item.armor;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@ElementsLepidodendronMod.ModElement.Tag
public class RubberArmor extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:rubberboots")
    public static final Item boots = null;
    public RubberArmor(ElementsLepidodendronMod instance) {
        super(instance, LepidodendronSorter.bootsrubber);
    }

    @Override
    public void initElements() {
        ItemArmor.ArmorMaterial material = EnumHelper.addArmorMaterial("PN_RUBBER", "lepidodendron:rubber_", 20, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f);
        elements.items.add(() -> new ItemArmor(material, 0, EntityEquipmentSlot.FEET).setTranslationKey("rubberboots").setRegistryName("rubberboots")
                .setCreativeTab(TabLepidodendronMisc.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("lepidodendron:rubberboots", "inventory"));
    }
}

