
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

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemGermanodactylusRawF extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:germanodactylus_raw_f")
    public static final Item block = null;
    public ItemGermanodactylusRawF(ElementsLepidodendronMod instance) {
        super(instance, LepidodendronSorter.germanodactylus_raw);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemFoodCustom());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/germanodactylus_raw_f", "inventory"));
    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_germanodactylus@female", ItemGermanodactylusRawF.block);
        OreDictionary.registerOre("listAllmeatraw", ItemGermanodactylusRawF.block);
        OreDictionary.registerOre("pnfurnacePterosaur", ItemGermanodactylusRawF.block);
        OreDictionary.registerOre("pndietMeat", ItemGermanodactylusRawF.block);
    }

    public static class ItemFoodCustom extends ItemPNTaxidermyItem {
        public ItemFoodCustom() {
            super(2, 0.1f, false);
            setTranslationKey("pf_germanodactylus_raw_f");
            setRegistryName("germanodactylus_raw_f");
            setCreativeTab(TabLepidodendronMobile.tab);
            setMaxStackSize(64);
        }

        @Nullable
        public String getVariantStr() {
            return "female";
        }
    }
}
