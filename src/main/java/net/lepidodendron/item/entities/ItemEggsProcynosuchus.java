
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
public class ItemEggsProcynosuchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_procynosuchus")
	public static final Item block = null;
	public ItemEggsProcynosuchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_procynosuchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_procynosuchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("egg", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsProcynosuchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsProcynosuchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_procynosuchus");
			setRegistryName("eggs_procynosuchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_procynosuchus";
		}
	}

}
