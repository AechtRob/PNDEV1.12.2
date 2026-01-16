
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
public class ItemEggsPetrolacosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_petrolacosaurus")
	public static final Item block = null;
	public ItemEggsPetrolacosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_petrolacosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_petrolacosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsPetrolacosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsPetrolacosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_petrolacosaurus");
			setRegistryName("eggs_petrolacosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_petrolacosaurus";
		}
	}

}
