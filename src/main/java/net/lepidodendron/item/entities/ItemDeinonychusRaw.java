
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemDeinonychusRaw extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:deinonychus_raw")
    public static final Item block = null;
    public ItemDeinonychusRaw(ElementsLepidodendronMod instance) {super(instance, LepidodendronSorter.deinonychus_raw);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemFoodCustom());
    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_deinonychus", ItemDeinonychusRaw.block);
        OreDictionary.registerOre("listAllmeatraw", ItemDeinonychusRaw.block);
        OreDictionary.registerOre("pnfurnaceMeat", ItemDeinonychusRaw.block);
        OreDictionary.registerOre("pndietMeat", ItemDeinonychusRaw.block);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/deinonychus_raw", "inventory"));
    }
    public static class ItemFoodCustom extends ItemPNTaxidermyItem {
        public ItemFoodCustom() {
            super(3, 0.3f, false);
            setTranslationKey("pf_deinonychus_raw");
            setRegistryName("deinonychus_raw");
            setCreativeTab(TabLepidodendronMobile.tab);
            setMaxStackSize(64);
        }
    }
}
