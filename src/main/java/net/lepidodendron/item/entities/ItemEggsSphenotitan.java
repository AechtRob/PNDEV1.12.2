
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
public class ItemEggsSphenotitan extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_sphenotitan")
	public static final Item block = null;
	public ItemEggsSphenotitan(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_sphenotitan);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_sphenotitan", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("egg", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("eggCookable", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("listAllegg", ItemEggsSphenotitan.block);
		OreDictionary.registerOre("objectEgg", ItemEggsSphenotitan.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_sphenotitan");
			setRegistryName("eggs_sphenotitan");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_sphenotitan";
		}
	}

}
