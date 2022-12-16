
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemArthropleuraRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:arthropleura_raw")
	public static final Item block = null;
	public ItemArthropleuraRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.arthropleura_raw);
	}

	@Override
	public void initElements() {
		//elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/arthropleura_raw", "inventory"));
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("dnaPNArthropleura", ItemArthropleuraRaw.block);
		//OreDictionary.registerOre("listAllmeatraw", ItemArthropleuraRaw.block);
		//OreDictionary.registerOre("foodMeat", ItemArthropleuraRaw.block);
	}

	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(2, 0.1f, false);
			setTranslationKey("pf_arthropleura_raw");
			setRegistryName("arthropleura_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
