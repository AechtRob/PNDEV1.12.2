//
//package net.lepidodendron.item.entities;
//
//import net.lepidodendron.ElementsLepidodendronMod;
//import net.lepidodendron.LepidodendronSorter;
//import net.lepidodendron.creativetab.TabLepidodendronMobile;
//import net.minecraft.item.Item;
//import net.minecraftforge.client.event.ModelRegistryEvent;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
//@ElementsLepidodendronMod.ModElement.Tag
//public class ItemSharovipteryxRaw extends ElementsLepidodendronMod.ModElement {
//	@GameRegistry.ObjectHolder("lepidodendron:sharovipteryx_raw")
//	public static final Item block = null;
//	public ItemSharovipteryxRaw(ElementsLepidodendronMod instance) {
//		super(instance, LepidodendronSorter.sharovipteryx_raw);
//	}
//
//	@Override
//	public void initElements() {
//		//elements.items.add(() -> new ItemFoodCustom());
//	}
//
//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
//		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/sharovipteryx_raw", "inventory"));
//	}
//
//	public static class ItemFoodCustom extends ItemPNTaxidermyItem {
//		public ItemFoodCustom() {
//			super(2, 0.1f, false);
//			setTranslationKey("pf_sharovipteryx_raw");
//			setRegistryName("sharovipteryx_raw");
//			setCreativeTab(TabLepidodendronMobile.tab);
//			setMaxStackSize(64);
//		}
//	}
//}
