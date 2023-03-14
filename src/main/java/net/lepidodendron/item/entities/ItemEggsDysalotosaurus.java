
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
public class ItemEggsDysalotosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_dysalotosaurus")
	public static final Item block = null;
	public ItemEggsDysalotosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_dysalotosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_dysalotosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsDysalotosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsDysalotosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_dysalotosaurus");
			setRegistryName("eggs_dysalotosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_dysalotosaurus";
		}
	}

}
