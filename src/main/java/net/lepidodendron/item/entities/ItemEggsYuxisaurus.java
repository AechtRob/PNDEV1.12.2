
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
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
public class ItemEggsYuxisaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_yuxisaurus")
	public static final Item block = null;
	public ItemEggsYuxisaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_yuxisaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_yuxisaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("egg", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsYuxisaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsYuxisaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_yuxisaurus");
			setRegistryName("eggs_yuxisaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_yuxisaurus";
		}
	}

}
