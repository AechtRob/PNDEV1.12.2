
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
public class
ItemBoreopriceaRaw extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:boreopricea_raw")
    public static final Item block = null;
    public ItemBoreopriceaRaw(ElementsLepidodendronMod instance) {super(instance, LepidodendronSorter.boreopricea_raw);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemFoodCustom());
    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_boreopricea", ItemBoreopriceaRaw.block);
        OreDictionary.registerOre("listAllmeatraw", ItemBoreopriceaRaw.block);
        OreDictionary.registerOre("pnfurnaceMeat", ItemBoreopriceaRaw.block);
        OreDictionary.registerOre("pndietMeat", ItemBoreopriceaRaw.block);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/boreopricea_raw", "inventory"));
    }
    public static class ItemFoodCustom extends ItemPNTaxidermyItem {
        public ItemFoodCustom() {
            super(3, 0.3f, false);
            setTranslationKey("pf_boreopricea_raw");
            setRegistryName("boreopricea_raw");
            setCreativeTab(TabLepidodendronMobile.tab);
            setMaxStackSize(64);
        }
    }
}
