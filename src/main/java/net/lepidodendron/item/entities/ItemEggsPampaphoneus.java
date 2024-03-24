
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
public class ItemEggsPampaphoneus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_pampaphoneus")
	public static final Item block = null;
	public ItemEggsPampaphoneus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_pampaphoneus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_pampaphoneus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("egg", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsPampaphoneus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsPampaphoneus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_pampaphoneus");
			setRegistryName("eggs_pampaphoneus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_pampaphoneus";
		}
	}

}
