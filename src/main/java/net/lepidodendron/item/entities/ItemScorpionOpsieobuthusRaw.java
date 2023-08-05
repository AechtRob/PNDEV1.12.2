
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
public class ItemScorpionOpsieobuthusRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:scorpion_opsieobuthus_raw")
	public static final Item block = null;
	public ItemScorpionOpsieobuthusRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.scorpion_opsieobuthus_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_scorpion_opsieobuthus", ItemScorpionOpsieobuthusRaw.block);
		OreDictionary.registerOre("listAllmeatraw", ItemScorpionOpsieobuthusRaw.block);
		OreDictionary.registerOre("foodMeat", ItemScorpionOpsieobuthusRaw.block);
		OreDictionary.registerOre("listAllinsectraw", ItemScorpionOpsieobuthusRaw.block);
		OreDictionary.registerOre("foodInsect", ItemScorpionOpsieobuthusRaw.block);
		OreDictionary.registerOre("pndietBug", ItemScorpionOpsieobuthusRaw.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/scorpion_opsieobuthus_raw", "inventory"));
	}
	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
		public ItemFoodCustom() {
			super(1, 0.05f, false);
			setTranslationKey("pf_scorpion_opsieobuthus_raw");
			setRegistryName("scorpion_opsieobuthus_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}
	}
}
